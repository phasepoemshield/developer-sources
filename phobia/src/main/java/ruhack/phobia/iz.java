/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_1923
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_7923
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import net.minecraft.class_1922;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_7923;
import ruhack.phobia.ah;
import ruhack.phobia.aw;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.kg;
import ruhack.phobia.ls;
import ruhack.phobia.lv;
import ruhack.phobia.nj;

public class iz
extends ds {
    private final Set<class_1923> scannedChunks;
    public static final int b;
    private static int[] ansk;
    private Set<class_2248> trackedBlockTypes;
    private final List<class_1923> candidateBuffer;
    protected static final long cf = 6954849813264682935L;
    private class_1923 lastPlayerChunk;
    private int lastCleanupAge;
    private static long[] antg;
    private final kg distance;
    private Set<String> trackedBlocks;
    private long lastScanTime;
    private static int[] ansj;
    private static final float FILL_ALPHA = 0.18f;
    public static final boolean c;
    private final Set<class_2338> foundBlocks;
    private static long[] antf;
    public static final boolean a;
    private int lastScanRadius;
    private static final long SCAN_INTERVAL_MS = 50L;
    private static final int MAX_CHUNKS_PER_PASS = 2;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$cleanupInvalidAndDistantBlocks$1(class_243 var1_1, int var2_2, class_2338 var3_3) {
        v0 /* !! */  = iz.cf;
        if (true) ** GOTO lbl5
        block51: while (true) {
            v0 /* !! */  = (long)(iz.ansl("aopo", ante(int ), (int)147) - iz.ansl("aopn", ante(int ), (int)146));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1982509129: {
                    break block51;
                }
                case -152307584: {
                    continue block51;
                }
            }
            break;
        }
        var7_4 = iz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aopp", ante(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == iz.ansl("aopq", ansp(int ), (int)448)) break;
            v1 /* !! */  = (long)iz.ansl("aopr", ansp(int ), (int)449);
        }
        var6_5 /* !! */  = iz.b;
        v2 /* !! */  = iz.cf;
        if (true) ** GOTO lbl21
        block53: while (true) {
            v2 /* !! */  = (long)(iz.ansl("aopt", ante(int ), (int)150) - iz.ansl("aops", ante(int ), (int)149));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1982509129: {
                    break block53;
                }
                case -1740266471: {
                    continue block53;
                }
            }
            break;
        }
        var5_6 = iz.a;
        if (var7_4) {
            throw null;
lbl29:
            // 11 sources

            return (boolean)iz.ansl("aopu", ansp(int ), (int)450);
        }
        if (var5_6) ** GOTO lbl29
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_6) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aopv", ante(int ), (int)151)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == iz.ansl("aopw", ansp(int ), (int)451)) break;
                    v3 /* !! */  = (long)iz.ansl("aopx", ansp(int ), (int)452);
                }
                if (var3_3.method_19770((class_2374)var1_1) > (double)var2_2) ** GOTO lbl77
                if (var5_6) ** GOTO lbl29
                v4 /* !! */  = iz.cf;
                if (true) ** GOTO lbl47
                block56: while (true) {
                    v4 /* !! */  = (long)(v5 - iz.ansl("aopy", ante(int ), (int)152));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1982509129: {
                            break block56;
                        }
                        case -1710779812: {
                            v5 = iz.ansl("aopz", ante(int ), (int)153);
                            continue block56;
                        }
                        case -1226562880: {
                            v5 = iz.ansl("aoqa", ante(int ), (int)154);
                            continue block56;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aoqb", ante(int ), (int)155)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == iz.ansl("aoqc", ansp(int ), (int)453)) break;
                    v6 /* !! */  = (long)iz.ansl("aoqd", ansp(int ), (int)454);
                }
                v7 = iz.mc.field_1687;
                v8 /* !! */  = iz.cf;
                if (true) ** GOTO lbl66
                block58: while (true) {
                    v8 /* !! */  = (long)(v9 - iz.ansl("aoqe", ante(int ), (int)156));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1991213613: {
                            v9 = iz.ansl("aoqf", ante(int ), (int)157);
                            continue block58;
                        }
                        case -1982509129: {
                            break block58;
                        }
                        case 1525517987: {
                            v9 = iz.ansl("aoqg", ante(int ), (int)158);
                            continue block58;
                        }
                    }
                    break;
                }
                if (v7.method_22340(var3_3)) ** GOTO lbl79
                if (var5_6) ** GOTO lbl29
lbl77:
                // 2 sources

                if (var5_6 || var5_6) ** GOTO lbl29
                return (boolean)iz.ansl("aoqh", ansp(int ), (int)455);
lbl79:
                // 1 sources

                if (var5_6 || var5_6) ** GOTO lbl29
                v10 /* !! */  = iz.cf;
                if (true) ** GOTO lbl84
                block59: while (true) {
                    v10 /* !! */  = (long)(iz.ansl("aoqj", ante(int ), (int)160) - iz.ansl("aoqi", ante(int ), (int)159));
lbl84:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1982509129: {
                            break block59;
                        }
                        case -1451463973: {
                            continue block59;
                        }
                    }
                    break;
                }
                v11 /* !! */  = iz.cf;
                if (true) ** GOTO lbl93
                block60: while (true) {
                    v11 /* !! */  = (long)(iz.ansl("aoql", ante(int ), (int)162) - iz.ansl("aoqk", ante(int ), (int)161));
lbl93:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1982509129: {
                            break block60;
                        }
                        case 113845136: {
                            continue block60;
                        }
                    }
                    break;
                }
                v12 = iz.mc.field_1687;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = iz.cf - iz.ansl("aoqm", ante(int ), (int)163)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == iz.ansl("aoqn", ansp(int ), (int)456)) break;
                    v13 /* !! */  = (long)iz.ansl("aoqo", ansp(int ), (int)457);
                }
                var4_7 = v12.method_8320(var3_3);
                if (var5_6 || var5_6) ** GOTO lbl29
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = iz.cf - iz.ansl("aoqp", ante(int ), (int)164)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == iz.ansl("aoqq", ansp(int ), (int)458)) break;
                    v14 /* !! */  = (long)iz.ansl("aoqr", ansp(int ), (int)459);
                }
                if (var4_7.method_26215()) ** GOTO lbl135
                if (var5_6) ** GOTO lbl29
                v15 /* !! */  = iz.cf;
                if (true) ** GOTO lbl117
                block63: while (true) {
                    v15 /* !! */  = (long)(iz.ansl("aoqt", ante(int ), (int)166) - iz.ansl("aoqs", ante(int ), (int)165));
lbl117:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1982509129: {
                            break block63;
                        }
                        case -1486603816: {
                            continue block63;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = iz.cf - iz.ansl("aoqu", ante(int ), (int)167)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == iz.ansl("aoqv", ansp(int ), (int)460)) break;
                    v16 /* !! */  = (long)iz.ansl("aoqw", ansp(int ), (int)461);
                }
                v17 = var4_7.method_26204();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = iz.cf - iz.ansl("aoqx", ante(int ), (int)168)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == iz.ansl("aoqy", ansp(int ), (int)462)) break;
                    v18 /* !! */  = (long)iz.ansl("aoqz", ansp(int ), (int)463);
                }
                if (this.trackedBlockTypes.contains(v17)) ** GOTO lbl140
                if (var5_6) ** GOTO lbl29
lbl135:
                // 2 sources

                if (var5_6 || var5_6) ** GOTO lbl29
                v19 = iz.ansl("aora", ansp(int ), (int)464);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl143
lbl140:
                // 1 sources

                if (!var5_6 && !var5_6) ** break;
                ** continue;
                v19 = iz.ansl("aorb", ansp(int ), (int)465);
lbl143:
                // 2 sources

                return (boolean)v19;
            }
            case 0: {
                var6_5 /* !! */  = (int)iz.ansl("aorc", ansp(int ), (int)466);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl149:
            // 3 sources

            case 1: {
                var6_5 /* !! */  = (int)iz.ansl("aord", ansp(int ), (int)467);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 2: {
                var6_5 /* !! */  = (int)iz.ansl("aore", ansp(int ), (int)468);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl159:
            // 2 sources

            case 3: {
                var6_5 /* !! */  = (int)iz.ansl("aorf", ansp(int ), (int)469);
                if (!var7_4) ** GOTO lbl149
                throw null;
            }
lbl163:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var6_5 /* !! */  = (int)iz.ansl("aorg", ansp(int ), (int)470);
                    if (!var7_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: {
                var6_5 /* !! */  = (int)iz.ansl("aorh", ansp(int ), (int)471);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl173:
            // 3 sources

            case 6: {
                var6_5 /* !! */  = (int)iz.ansl("aori", ansp(int ), (int)472);
                if (!var7_4) break;
                throw null;
            }
            case 7: {
                var6_5 /* !! */  = (int)iz.ansl("aorj", ansp(int ), (int)473);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl182:
            // 3 sources

            case 8: {
                var6_5 /* !! */  = (int)iz.ansl("aork", ansp(int ), (int)474);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl187:
            // 2 sources

            case 9: {
                var6_5 /* !! */  = (int)iz.ansl("aorl", ansp(int ), (int)475);
                if (!var7_4) ** GOTO lbl159
                throw null;
            }
            case 10: {
                var6_5 /* !! */  = (int)iz.ansl("aorm", ansp(int ), (int)476);
                if (!var7_4) ** GOTO lbl173
                throw null;
            }
            case 11: {
                var6_5 /* !! */  = (int)iz.ansl("aorn", ansp(int ), (int)477);
                if (!var7_4) ** GOTO lbl173
                throw null;
            }
            case 12: {
                var6_5 /* !! */  = (int)iz.ansl("aoro", ansp(int ), (int)478);
                if (!var7_4) ** GOTO lbl182
                throw null;
            }
lbl203:
            // 2 sources

            case 13: {
                var6_5 /* !! */  = (int)iz.ansl("aorp", ansp(int ), (int)479);
                if (var7_4) {
                    throw null;
                }
            }
            case 14: {
                var6_5 /* !! */  = (int)iz.ansl("aorq", ansp(int ), (int)480);
                if (var7_4) {
                    throw null;
                }
            }
lbl211:
            // 5 sources

            case 15: {
                var6_5 /* !! */  = (int)iz.ansl("aorr", ansp(int ), (int)481);
                if (!var7_4) ** GOTO lbl163
                throw null;
            }
lbl215:
            // 3 sources

            case 16: {
                var6_5 /* !! */  = (int)iz.ansl("aors", ansp(int ), (int)482);
                if (!var7_4) ** GOTO lbl182
                throw null;
            }
            case 17: {
                var6_5 /* !! */  = (int)iz.ansl("aort", ansp(int ), (int)483);
                if (!var7_4) ** GOTO lbl149
                throw null;
            }
            case 18: 
        }
        var6_5 /* !! */  = (int)iz.ansl("aoru", ansp(int ), (int)484);
        ** while (!var7_4)
lbl226:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block121: {
            block120: {
                block119: {
                    block118: {
                        var9_2 = iz.c;
                        var8_3 /* !! */  = iz.b;
                        var7_4 = iz.a;
                        if (var9_2) {
                            throw null;
lbl6:
                            // 36 sources

                            return;
                        }
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (iz.mc.field_1687 == null) break block118;
                        if (var7_4) ** GOTO lbl6
                        if (iz.mc.field_1724 != null) break block119;
                        if (var7_4) ** GOTO lbl6
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    return;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                var2_5 = this.normalizedConfiguredBlocks();
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var2_5.equals(this.trackedBlocks)) break block120;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.trackedBlocks = var2_5;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.trackedBlockTypes = iz.resolveTrackedBlockTypes(var2_5);
                if (var7_4 || var7_4) ** GOTO lbl6
                this.invalidateScan();
                if (var7_4) ** GOTO lbl6
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            if (!this.trackedBlocks.isEmpty()) break block121;
            if (var7_4) ** GOTO lbl6
            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var3_6 = Math.round(this.distance.getValue());
        if (var7_4 || var7_4) ** GOTO lbl6
        var4_7 = new class_1923(iz.mc.field_1724.method_24515());
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                if (var3_6 == this.lastScanRadius) ** GOTO lbl49
                if (var7_4 || var7_4) ** GOTO lbl6
                this.invalidateScan();
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastScanRadius = var3_6;
                if (var7_4) ** GOTO lbl6
lbl49:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.lastPlayerChunk == null) ** GOTO lbl54
                if (var7_4) ** GOTO lbl6
                if (this.lastPlayerChunk.equals((Object)var4_7)) ** GOTO lbl59
                if (var7_4) ** GOTO lbl6
lbl54:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.scannedChunks.clear();
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastPlayerChunk = var4_7;
                if (var7_4) ** GOTO lbl6
lbl59:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var5_8 = System.currentTimeMillis();
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var5_8 - this.lastScanTime < iz.ansl("anvi", ante(int ), (int)25)) ** GOTO lbl68
                if (var7_4 || var7_4) ** GOTO lbl6
                this.scanNearbyBlocks(var3_6);
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastScanTime = var5_8;
                if (var7_4) ** GOTO lbl6
lbl68:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.lastCleanupAge == iz.mc.field_1724.field_6012) ** GOTO lbl75
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastCleanupAge = iz.mc.field_1724.field_6012;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.cleanupInvalidAndDistantBlocks(iz.mc.field_1724.method_73189(), var3_6);
                if (var7_4) ** GOTO lbl6
lbl75:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.renderFoundBlocks();
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
lbl80:
            // 2 sources

            case 0: {
                do {
                    var8_3 /* !! */  = (int)iz.ansl("anvj", ansp(int ), (int)45);
                } while (!var9_2);
                throw null;
            }
lbl85:
            // 5 sources

            case 1: {
                var8_3 /* !! */  = (int)iz.ansl("anvk", ansp(int ), (int)46);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl90:
            // 2 sources

            case 2: {
                var8_3 /* !! */  = (int)iz.ansl("anvl", ansp(int ), (int)47);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 3: {
                var8_3 /* !! */  = (int)iz.ansl("anvm", ansp(int ), (int)48);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 4: {
                var8_3 /* !! */  = (int)iz.ansl("anvn", ansp(int ), (int)49);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 5: {
                var8_3 /* !! */  = (int)iz.ansl("anvo", ansp(int ), (int)50);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl110:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)iz.ansl("anvp", ansp(int ), (int)51);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl115:
            // 2 sources

            case 7: {
                var8_3 /* !! */  = (int)iz.ansl("anvq", ansp(int ), (int)52);
                if (!var9_2) ** GOTO lbl85
                throw null;
            }
lbl119:
            // 3 sources

            case 8: {
                var8_3 /* !! */  = (int)iz.ansl("anvr", ansp(int ), (int)53);
                if (!var9_2) ** GOTO lbl85
                throw null;
            }
lbl123:
            // 3 sources

            case 9: {
                var8_3 /* !! */  = (int)iz.ansl("anvs", ansp(int ), (int)54);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 10: {
                var8_3 /* !! */  = (int)iz.ansl("anvt", ansp(int ), (int)55);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl133:
            // 3 sources

            case 11: {
                var8_3 /* !! */  = (int)iz.ansl("anvu", ansp(int ), (int)56);
                if (!var9_2) ** GOTO lbl115
                throw null;
            }
lbl137:
            // 3 sources

            case 12: {
                var8_3 /* !! */  = (int)iz.ansl("anvv", ansp(int ), (int)57);
                if (!var9_2) ** GOTO lbl119
                throw null;
            }
lbl141:
            // 4 sources

            case 13: {
                var8_3 /* !! */  = (int)iz.ansl("anvw", ansp(int ), (int)58);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl146:
            // 3 sources

            case 14: {
                var8_3 /* !! */  = (int)iz.ansl("anvx", ansp(int ), (int)59);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl151:
            // 5 sources

            case 15: {
                var8_3 /* !! */  = (int)iz.ansl("anvy", ansp(int ), (int)60);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl156:
            // 2 sources

            case 16: {
                var8_3 /* !! */  = (int)iz.ansl("anvz", ansp(int ), (int)61);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 17: {
                var8_3 /* !! */  = (int)iz.ansl("anwa", ansp(int ), (int)62);
                if (!var9_2) ** GOTO lbl141
                throw null;
            }
lbl165:
            // 2 sources

            case 18: {
                var8_3 /* !! */  = (int)iz.ansl("anwb", ansp(int ), (int)63);
                if (!var9_2) ** GOTO lbl151
                throw null;
            }
            case 19: {
                var8_3 /* !! */  = (int)iz.ansl("anwc", ansp(int ), (int)64);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl174:
            // 2 sources

            case 20: {
                var8_3 /* !! */  = (int)iz.ansl("anwd", ansp(int ), (int)65);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 21: {
                var8_3 /* !! */  = (int)iz.ansl("anwe", ansp(int ), (int)66);
                if (!var9_2) ** GOTO lbl110
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)iz.ansl("anwf", ansp(int ), (int)67);
                if (!var9_2) ** GOTO lbl141
                throw null;
            }
lbl187:
            // 3 sources

            case 23: {
                var8_3 /* !! */  = (int)iz.ansl("anwg", ansp(int ), (int)68);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl192:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)iz.ansl("anwh", ansp(int ), (int)69);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl197:
            // 3 sources

            case 25: {
                var8_3 /* !! */  = (int)iz.ansl("anwi", ansp(int ), (int)70);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl202:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)iz.ansl("anwj", ansp(int ), (int)71);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl207:
            // 2 sources

            case 27: {
                var8_3 /* !! */  = (int)iz.ansl("anwk", ansp(int ), (int)72);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 28: {
                var8_3 /* !! */  = (int)iz.ansl("anwl", ansp(int ), (int)73);
                if (!var9_2) ** GOTO lbl202
                throw null;
            }
            case 29: {
                var8_3 /* !! */  = (int)iz.ansl("anwm", ansp(int ), (int)74);
                if (!var9_2) ** GOTO lbl197
                throw null;
            }
lbl220:
            // 4 sources

            case 30: {
                var8_3 /* !! */  = (int)iz.ansl("anwn", ansp(int ), (int)75);
                if (!var9_2) ** GOTO lbl146
                throw null;
            }
            case 31: {
                var8_3 /* !! */  = (int)iz.ansl("anwo", ansp(int ), (int)76);
                if (!var9_2) ** GOTO lbl187
                throw null;
            }
lbl228:
            // 3 sources

            case 32: {
                var8_3 /* !! */  = (int)iz.ansl("anwp", ansp(int ), (int)77);
                if (var9_2) {
                    throw null;
                }
            }
lbl232:
            // 4 sources

            case 33: {
                var8_3 /* !! */  = (int)iz.ansl("anwq", ansp(int ), (int)78);
                if (!var9_2) ** GOTO lbl119
                throw null;
            }
            case 34: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)iz.ansl("anwr", ansp(int ), (int)79);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl319
                    break;
                }
            }
            case 35: {
                var8_3 /* !! */  = (int)iz.ansl("anws", ansp(int ), (int)80);
                if (!var9_2) ** GOTO lbl197
                throw null;
            }
            case 36: {
                var8_3 /* !! */  = (int)iz.ansl("anwt", ansp(int ), (int)81);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 37: {
                var8_3 /* !! */  = (int)iz.ansl("anwu", ansp(int ), (int)82);
                if (!var9_2) ** GOTO lbl85
                throw null;
            }
lbl255:
            // 3 sources

            case 38: {
                var8_3 /* !! */  = (int)iz.ansl("anwv", ansp(int ), (int)83);
                if (!var9_2) ** GOTO lbl192
                throw null;
            }
            case 39: {
                var8_3 /* !! */  = (int)iz.ansl("anww", ansp(int ), (int)84);
                if (!var9_2) ** GOTO lbl151
                throw null;
            }
            case 40: {
                var8_3 /* !! */  = (int)iz.ansl("anwx", ansp(int ), (int)85);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 41: {
                var8_3 /* !! */  = (int)iz.ansl("anwy", ansp(int ), (int)86);
                if (!var9_2) ** GOTO lbl80
                throw null;
            }
            case 42: {
                var8_3 /* !! */  = (int)iz.ansl("anwz", ansp(int ), (int)87);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl277:
            // 2 sources

            case 43: {
                var8_3 /* !! */  = (int)iz.ansl("anxa", ansp(int ), (int)88);
                if (!var9_2) ** GOTO lbl255
                throw null;
            }
lbl281:
            // 3 sources

            case 44: {
                var8_3 /* !! */  = (int)iz.ansl("anxb", ansp(int ), (int)89);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl286:
            // 3 sources

            case 45: {
                var8_3 /* !! */  = (int)iz.ansl("anxc", ansp(int ), (int)90);
                if (!var9_2) ** GOTO lbl220
                throw null;
            }
lbl290:
            // 3 sources

            case 46: {
                var8_3 /* !! */  = (int)iz.ansl("anxd", ansp(int ), (int)91);
                if (!var9_2) ** GOTO lbl165
                throw null;
            }
lbl294:
            // 2 sources

            case 47: {
                var8_3 /* !! */  = (int)iz.ansl("anxe", ansp(int ), (int)92);
                if (!var9_2) ** GOTO lbl85
                throw null;
            }
            case 48: {
                var8_3 /* !! */  = (int)iz.ansl("anxf", ansp(int ), (int)93);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 49: {
                var8_3 /* !! */  = (int)iz.ansl("anxg", ansp(int ), (int)94);
                if (!var9_2) ** GOTO lbl137
                throw null;
            }
            case 50: {
                var8_3 /* !! */  = (int)iz.ansl("anxh", ansp(int ), (int)95);
                if (!var9_2) ** GOTO lbl146
                throw null;
            }
            case 51: {
                var8_3 /* !! */  = (int)iz.ansl("anxi", ansp(int ), (int)96);
                if (!var9_2) ** GOTO lbl90
                throw null;
            }
lbl315:
            // 2 sources

            case 52: {
                var8_3 /* !! */  = (int)iz.ansl("anxj", ansp(int ), (int)97);
                if (!var9_2) ** GOTO lbl151
                throw null;
            }
lbl319:
            // 4 sources

            case 53: {
                var8_3 /* !! */  = (int)iz.ansl("anxk", ansp(int ), (int)98);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 54: {
                var8_3 /* !! */  = (int)iz.ansl("anxl", ansp(int ), (int)99);
                if (!var9_2) ** GOTO lbl141
                throw null;
            }
lbl328:
            // 2 sources

            case 55: {
                var8_3 /* !! */  = (int)iz.ansl("anxm", ansp(int ), (int)100);
                if (!var9_2) ** GOTO lbl290
                throw null;
            }
lbl332:
            // 2 sources

            case 56: {
                var8_3 /* !! */  = (int)iz.ansl("anxn", ansp(int ), (int)101);
                if (!var9_2) ** GOTO lbl319
                throw null;
            }
lbl336:
            // 3 sources

            case 57: {
                var8_3 /* !! */  = (int)iz.ansl("anxo", ansp(int ), (int)102);
                if (!var9_2) ** GOTO lbl156
                throw null;
            }
lbl340:
            // 2 sources

            case 58: {
                var8_3 /* !! */  = (int)iz.ansl("anxp", ansp(int ), (int)103);
                if (!var9_2) ** GOTO lbl174
                throw null;
            }
            case 59: {
                var8_3 /* !! */  = (int)iz.ansl("anxq", ansp(int ), (int)104);
                if (!var9_2) ** GOTO lbl151
                throw null;
            }
            case 60: {
                var8_3 /* !! */  = (int)iz.ansl("anxr", ansp(int ), (int)105);
                if (!var9_2) ** GOTO lbl137
                throw null;
            }
            case 61: {
                var8_3 /* !! */  = (int)iz.ansl("anxs", ansp(int ), (int)106);
                if (!var9_2) ** GOTO lbl232
                throw null;
            }
            case 62: 
        }
        var8_3 /* !! */  = (int)iz.ansl("anxt", ansp(int ), (int)107);
        ** while (!var9_2)
lbl359:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int blockColor(class_2680 var1_1, class_2338 var2_2) {
        block33: {
            block32: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aolh", ante(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == iz.ansl("aoli", ansp(int ), (int)384)) break;
                    v0 /* !! */  = (long)iz.ansl("aolj", ansp(int ), (int)385);
                }
                var6_3 = iz.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aolk", ante(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == iz.ansl("aoll", ansp(int ), (int)386)) break;
                    v1 /* !! */  = (long)iz.ansl("aolm", ansp(int ), (int)387);
                }
                var5_4 = iz.b;
                v2 /* !! */  = iz.cf;
                if (true) ** GOTO lbl19
                block21: while (true) {
                    v2 /* !! */  = (long)(v3 - iz.ansl("aoln", ante(int ), (int)102));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1982509129: {
                            break block21;
                        }
                        case -1645744339: {
                            v3 = iz.ansl("aolo", ante(int ), (int)103);
                            continue block21;
                        }
                        case 583583742: {
                            v3 = iz.ansl("aolp", ante(int ), (int)104);
                            continue block21;
                        }
                    }
                    break;
                }
                var4_5 = iz.a;
                if (var6_3) {
                    throw null;
lbl31:
                    // 4 sources

                    return (int)iz.ansl("aolq", ansp(int ), (int)388);
                }
                if (var4_5 || var4_5) ** GOTO lbl31
                v4 /* !! */  = iz.cf;
                if (true) ** GOTO lbl38
                block23: while (true) {
                    v4 /* !! */  = (long)(v5 - iz.ansl("aolr", ante(int ), (int)105));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1982509129: {
                            break block23;
                        }
                        case -129415606: {
                            v5 = iz.ansl("aols", ante(int ), (int)106);
                            continue block23;
                        }
                        case 1551754627: {
                            v5 = iz.ansl("aolt", ante(int ), (int)107);
                            continue block23;
                        }
                    }
                    break;
                }
                v6 /* !! */  = iz.cf;
                if (true) ** GOTO lbl51
                block24: while (true) {
                    v6 /* !! */  = (long)(iz.ansl("aolv", ante(int ), (int)109) - iz.ansl("aolu", ante(int ), (int)108));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1982509129: {
                            break block24;
                        }
                        case -265295167: {
                            continue block24;
                        }
                    }
                    break;
                }
                v7 = iz.mc.field_1687;
                v8 /* !! */  = iz.cf;
                if (true) ** GOTO lbl61
                block25: while (true) {
                    v8 /* !! */  = (long)(v9 - iz.ansl("aolw", ante(int ), (int)110));
lbl61:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1982509129: {
                            break block25;
                        }
                        case -1867553734: {
                            v9 = iz.ansl("aolx", ante(int ), (int)111);
                            continue block25;
                        }
                        case -367192613: {
                            v9 = iz.ansl("aoly", ante(int ), (int)112);
                            continue block25;
                        }
                    }
                    break;
                }
                v10 = var1_1.method_26205((class_1922)v7, var2_2);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aolz", ante(int ), (int)113)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == iz.ansl("aoma", ansp(int ), (int)389)) break;
                    v11 /* !! */  = (long)iz.ansl("aomb", ansp(int ), (int)390);
                }
                var3_6 = v10.field_16011;
                if (var4_5 || var4_5) ** GOTO lbl31
                if (var3_6 != 0) break block32;
                if (var4_5) ** GOTO lbl31
                v12 /* !! */  = iz.ansl("aomc", ansp(int ), (int)391);
                if (var6_3) {
                    throw null;
                }
                break block33;
            }
            if (!var4_5 && !var4_5) ** break;
            ** while (true)
            v12 /* !! */  = (CallSite)var3_6;
        }
        return (int)v12 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanNearbyBlocks(int var1_1) {
        var14_2 = iz.c;
        var13_3 /* !! */  = iz.b;
        var12_4 = iz.a;
        if (var14_2) {
            throw null;
lbl6:
            // 39 sources

            return;
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        var2_5 = iz.mc.field_1724.method_24515();
        if (var12_4 || var12_4) ** GOTO lbl6
        var3_6 = var2_5.method_10263() >> iz.ansl("aodd", ansp(int ), (int)185);
        if (var12_4 || var12_4) ** GOTO lbl6
        var4_7 = var2_5.method_10260() >> iz.ansl("aode", ansp(int ), (int)186);
        if (var12_4 || var12_4) ** GOTO lbl6
        var5_8 = (var1_1 >> iz.ansl("aodf", ansp(int ), (int)187)) + iz.ansl("aodg", ansp(int ), (int)188);
        if (var12_4 || var12_4) ** GOTO lbl6
        var6_9 = this.candidateBuffer;
        if (var12_4 || var12_4) ** GOTO lbl6
        var6_9.clear();
        if (var12_4 || var12_4) ** GOTO lbl6
        var7_10 /* !! */  = -var5_8;
        if (var12_4) ** GOTO lbl6
        block75: while (true) {
            if (var12_4 || var12_4) ** GOTO lbl6
            if (var7_10 /* !! */  > var5_8) ** GOTO lbl54
            if (var12_4 || var12_4) ** GOTO lbl6
            var8_11 = -var5_8;
            if (var12_4) ** GOTO lbl6
            block76: while (true) {
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var8_11 > var5_8) ** GOTO lbl49
                if (var12_4 || var12_4) ** GOTO lbl6
                var9_13 = new class_1923(var3_6 + var7_10 /* !! */ , var4_7 + var8_11);
                if (var12_4) ** GOTO lbl6
                if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
                switch (var13_3 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var12_4) ** GOTO lbl6
                        if (this.scannedChunks.contains(var9_13)) ** GOTO lbl44
                        if (var12_4) ** GOTO lbl6
                        var6_9.add(var9_13);
                        if (var12_4) ** GOTO lbl6
lbl44:
                        // 2 sources

                        if (var12_4 || var12_4) ** GOTO lbl6
                        ++var8_11;
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) continue block76;
                        throw null;
                    }
lbl49:
                    // 1 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    ++var7_10 /* !! */ ;
                    if (var12_4) ** GOTO lbl6
                    if (!var14_2) continue block75;
                    throw null;
lbl54:
                    // 1 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    var6_9.sort((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, lambda$scanNearbyBlocks$0(int int net.minecraft.class_1923 net.minecraft.class_1923 ), (Lnet/minecraft/class_1923;Lnet/minecraft/class_1923;)I)((iz)this, (int)var3_6, (int)var4_7));
                    if (var12_4 || var12_4) ** GOTO lbl6
                    var7_10 /* !! */  = (int)iz.ansl("aodh", ansp(int ), (int)189);
                    if (var12_4 || var12_4) ** GOTO lbl6
                    var8_12 = var6_9.iterator();
                    if (var12_4) ** GOTO lbl6
                    do lbl-1000:
                    // 3 sources

                    {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var8_12.hasNext()) ** GOTO lbl93
                        if (var12_4) ** GOTO lbl6
                        var9_13 = var8_12.next();
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (var7_10 /* !! */  < iz.ansl("aodi", ansp(int ), (int)190)) ** GOTO lbl72
                        if (var12_4) ** GOTO lbl6
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl93
lbl72:
                        // 1 sources

                        if (var12_4 || var12_4) ** GOTO lbl6
                        var10_14 = new class_2338(var9_13.method_33940(), var2_5.method_10264(), var9_13.method_33942());
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (iz.mc.field_1687.method_22340(var10_14)) ** GOTO lbl81
                        if (var12_4 || var12_4) ** GOTO lbl6
                        ++var7_10 /* !! */ ;
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var14_2) ** GOTO lbl-1000
                        throw null;
lbl81:
                        // 1 sources

                        if (var12_4 || var12_4) ** GOTO lbl6
                        var11_15 = iz.mc.field_1687.method_8497(var9_13.field_9181, var9_13.field_9180);
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.scanChunk(var11_15, var2_5, var1_1);
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.scannedChunks.add(var9_13);
                        if (var12_4 || var12_4) ** GOTO lbl6
                        ++var7_10 /* !! */ ;
                        if (var12_4 || var12_4) ** GOTO lbl6
                    } while (!var14_2);
                    throw null;
lbl93:
                    // 2 sources

                    if (!var12_4 && !var12_4) ** break;
                    ** continue;
                    return;
lbl96:
                    // 2 sources

                    case 0: {
                        var13_3 /* !! */  = (int)iz.ansl("aodj", ansp(int ), (int)191);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl226
                    }
                    case 1: {
                        var13_3 /* !! */  = (int)iz.ansl("aodk", ansp(int ), (int)192);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl236
                    }
lbl106:
                    // 2 sources

                    case 2: {
                        var13_3 /* !! */  = (int)iz.ansl("aodl", ansp(int ), (int)193);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl121
                    }
                    case 3: {
                        var13_3 /* !! */  = (int)iz.ansl("aodm", ansp(int ), (int)194);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl324
                    }
lbl116:
                    // 3 sources

                    case 4: {
                        var13_3 /* !! */  = (int)iz.ansl("aodn", ansp(int ), (int)195);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl178
                    }
lbl121:
                    // 4 sources

                    case 5: {
                        var13_3 /* !! */  = (int)iz.ansl("aodo", ansp(int ), (int)196);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl367
                    }
lbl126:
                    // 2 sources

                    case 6: {
                        var13_3 /* !! */  = (int)iz.ansl("aodp", ansp(int ), (int)197);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl140
                    }
lbl131:
                    // 3 sources

                    case 7: {
                        var13_3 /* !! */  = (int)iz.ansl("aodq", ansp(int ), (int)198);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl214
                    }
lbl136:
                    // 2 sources

                    case 8: {
                        var13_3 /* !! */  = (int)iz.ansl("aodr", ansp(int ), (int)199);
                        if (!var14_2) ** GOTO lbl121
                        throw null;
                    }
lbl140:
                    // 2 sources

                    case 9: {
                        var13_3 /* !! */  = (int)iz.ansl("aods", ansp(int ), (int)200);
                        if (!var14_2) ** GOTO lbl126
                        throw null;
                    }
                    case 10: {
                        var13_3 /* !! */  = (int)iz.ansl("aodt", ansp(int ), (int)201);
                        if (!var14_2) ** GOTO lbl131
                        throw null;
                    }
                    case 11: {
                        var13_3 /* !! */  = (int)iz.ansl("aodu", ansp(int ), (int)202);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl383
                    }
lbl153:
                    // 2 sources

                    case 12: {
                        var13_3 /* !! */  = (int)iz.ansl("aodv", ansp(int ), (int)203);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl387
                    }
                    case 13: {
                        var13_3 /* !! */  = (int)iz.ansl("aodw", ansp(int ), (int)204);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl218
                    }
                    case 14: {
                        var13_3 /* !! */  = (int)iz.ansl("aodx", ansp(int ), (int)205);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl396
                    }
lbl168:
                    // 4 sources

                    case 15: {
                        var13_3 /* !! */  = (int)iz.ansl("aody", ansp(int ), (int)206);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl333
                    }
lbl173:
                    // 2 sources

                    case 16: {
                        var13_3 /* !! */  = (int)iz.ansl("aodz", ansp(int ), (int)207);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl188
                    }
lbl178:
                    // 3 sources

                    case 17: {
                        var13_3 /* !! */  = (int)iz.ansl("aoea", ansp(int ), (int)208);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl319
                    }
                    case 18: {
                        var13_3 /* !! */  = (int)iz.ansl("aoeb", ansp(int ), (int)209);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl314
                    }
lbl188:
                    // 2 sources

                    case 19: {
                        var13_3 /* !! */  = (int)iz.ansl("aoec", ansp(int ), (int)210);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl296
                    }
lbl193:
                    // 2 sources

                    case 20: {
                        var13_3 /* !! */  = (int)iz.ansl("aoed", ansp(int ), (int)211);
                        if (!var14_2) ** GOTO lbl173
                        throw null;
                    }
lbl197:
                    // 2 sources

                    case 21: {
                        var13_3 /* !! */  = (int)iz.ansl("aoee", ansp(int ), (int)212);
                        if (!var14_2) ** GOTO lbl116
                        throw null;
                    }
lbl201:
                    // 2 sources

                    case 22: {
                        var13_3 /* !! */  = (int)iz.ansl("aoef", ansp(int ), (int)213);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl258
                    }
lbl206:
                    // 3 sources

                    case 23: {
                        var13_3 /* !! */  = (int)iz.ansl("aoeg", ansp(int ), (int)214);
                        if (!var14_2) ** GOTO lbl96
                        throw null;
                    }
lbl210:
                    // 2 sources

                    case 24: {
                        var13_3 /* !! */  = (int)iz.ansl("aoeh", ansp(int ), (int)215);
                        if (!var14_2) ** GOTO lbl106
                        throw null;
                    }
lbl214:
                    // 3 sources

                    case 25: {
                        var13_3 /* !! */  = (int)iz.ansl("aoei", ansp(int ), (int)216);
                        if (!var14_2) ** GOTO lbl131
                        throw null;
                    }
lbl218:
                    // 2 sources

                    case 26: {
                        var13_3 /* !! */  = (int)iz.ansl("aoej", ansp(int ), (int)217);
                        if (!var14_2) break block75;
                        throw null;
                    }
                    case 27: {
                        var13_3 /* !! */  = (int)iz.ansl("aoek", ansp(int ), (int)218);
                        if (!var14_2) ** GOTO lbl168
                        throw null;
                    }
lbl226:
                    // 3 sources

                    case 28: {
                        var13_3 /* !! */  = (int)iz.ansl("aoel", ansp(int ), (int)219);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl328
                    }
                    case 29: {
                        var13_3 /* !! */  = (int)iz.ansl("aoem", ansp(int ), (int)220);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl341
                    }
lbl236:
                    // 4 sources

                    case 30: {
                        var13_3 /* !! */  = (int)iz.ansl("aoen", ansp(int ), (int)221);
                        if (!var14_2) ** GOTO lbl178
                        throw null;
                    }
                    case 31: {
                        var13_3 /* !! */  = (int)iz.ansl("aoeo", ansp(int ), (int)222);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl367
                    }
                    case 32: {
                        var13_3 /* !! */  = (int)iz.ansl("aoep", ansp(int ), (int)223);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl358
                    }
                    case 33: {
                        var13_3 /* !! */  = (int)iz.ansl("aoeq", ansp(int ), (int)224);
                        if (!var14_2) ** GOTO lbl214
                        throw null;
                    }
lbl254:
                    // 2 sources

                    case 34: {
                        var13_3 /* !! */  = (int)iz.ansl("aoer", ansp(int ), (int)225);
                        if (!var14_2) ** GOTO lbl236
                        throw null;
                    }
lbl258:
                    // 2 sources

                    case 35: {
                        var13_3 /* !! */  = (int)iz.ansl("aoes", ansp(int ), (int)226);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl387
                    }
                    case 36: {
                        var13_3 /* !! */  = (int)iz.ansl("aoet", ansp(int ), (int)227);
                        if (!var14_2) ** GOTO lbl153
                        throw null;
                    }
                    case 37: {
                        var13_3 /* !! */  = (int)iz.ansl("aoeu", ansp(int ), (int)228);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl314
                    }
                    case 38: {
                        var13_3 /* !! */  = (int)iz.ansl("aoev", ansp(int ), (int)229);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl310
                    }
lbl277:
                    // 2 sources

                    case 39: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var13_3 /* !! */  = (int)iz.ansl("aoew", ansp(int ), (int)230);
                            if (!var14_2) ** GOTO lbl206
                            throw null;
                        }
                    }
                    case 40: {
                        var13_3 /* !! */  = (int)iz.ansl("aoex", ansp(int ), (int)231);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl345
                    }
lbl287:
                    // 2 sources

                    case 41: {
                        var13_3 /* !! */  = (int)iz.ansl("aoey", ansp(int ), (int)232);
                        if (!var14_2) ** GOTO lbl226
                        throw null;
                    }
                    case 42: {
                        var13_3 /* !! */  = (int)iz.ansl("aoez", ansp(int ), (int)233);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl409
                    }
lbl296:
                    // 3 sources

                    case 43: {
                        var13_3 /* !! */  = (int)iz.ansl("aofa", ansp(int ), (int)234);
                        if (!var14_2) ** GOTO lbl206
                        throw null;
                    }
lbl300:
                    // 2 sources

                    case 44: {
                        var13_3 /* !! */  = (int)iz.ansl("aofb", ansp(int ), (int)235);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl400
                    }
                    case 45: {
                        var13_3 /* !! */  = (int)iz.ansl("aofc", ansp(int ), (int)236);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl396
                    }
lbl310:
                    // 3 sources

                    case 46: {
                        var13_3 /* !! */  = (int)iz.ansl("aofd", ansp(int ), (int)237);
                        if (!var14_2) ** GOTO lbl168
                        throw null;
                    }
lbl314:
                    // 3 sources

                    case 47: {
                        var13_3 /* !! */  = (int)iz.ansl("aofe", ansp(int ), (int)238);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl350
                    }
lbl319:
                    // 2 sources

                    case 48: {
                        var13_3 /* !! */  = (int)iz.ansl("aoff", ansp(int ), (int)239);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl362
                    }
lbl324:
                    // 2 sources

                    case 49: {
                        var13_3 /* !! */  = (int)iz.ansl("aofg", ansp(int ), (int)240);
                        if (!var14_2) ** GOTO lbl193
                        throw null;
                    }
lbl328:
                    // 3 sources

                    case 50: {
                        var13_3 /* !! */  = (int)iz.ansl("aofh", ansp(int ), (int)241);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl383
                    }
lbl333:
                    // 2 sources

                    case 51: {
                        var13_3 /* !! */  = (int)iz.ansl("aofi", ansp(int ), (int)242);
                        if (!var14_2) ** GOTO lbl287
                        throw null;
                    }
                    case 52: {
                        var13_3 /* !! */  = (int)iz.ansl("aofj", ansp(int ), (int)243);
                        if (!var14_2) ** GOTO lbl136
                        throw null;
                    }
lbl341:
                    // 2 sources

                    case 53: {
                        var13_3 /* !! */  = (int)iz.ansl("aofk", ansp(int ), (int)244);
                        if (!var14_2) ** GOTO lbl277
                        throw null;
                    }
lbl345:
                    // 2 sources

                    case 54: {
                        var13_3 /* !! */  = (int)iz.ansl("aofl", ansp(int ), (int)245);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl358
                    }
lbl350:
                    // 2 sources

                    case 55: {
                        var13_3 /* !! */  = (int)iz.ansl("aofm", ansp(int ), (int)246);
                        if (!var14_2) ** GOTO lbl116
                        throw null;
                    }
                    case 56: {
                        var13_3 /* !! */  = (int)iz.ansl("aofn", ansp(int ), (int)247);
                        if (!var14_2) ** GOTO lbl121
                        throw null;
                    }
lbl358:
                    // 3 sources

                    case 57: {
                        var13_3 /* !! */  = (int)iz.ansl("aofo", ansp(int ), (int)248);
                        if (!var14_2) ** GOTO lbl328
                        throw null;
                    }
lbl362:
                    // 2 sources

                    case 58: {
                        var13_3 /* !! */  = (int)iz.ansl("aofp", ansp(int ), (int)249);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl371
                    }
lbl367:
                    // 3 sources

                    case 59: {
                        var13_3 /* !! */  = (int)iz.ansl("aofq", ansp(int ), (int)250);
                        if (!var14_2) ** GOTO lbl168
                        throw null;
                    }
lbl371:
                    // 3 sources

                    case 60: {
                        var13_3 /* !! */  = (int)iz.ansl("aofr", ansp(int ), (int)251);
                        if (!var14_2) ** GOTO lbl210
                        throw null;
                    }
                    case 61: {
                        var13_3 /* !! */  = (int)iz.ansl("aofs", ansp(int ), (int)252);
                        if (!var14_2) ** GOTO lbl197
                        throw null;
                    }
                    case 62: {
                        var13_3 /* !! */  = (int)iz.ansl("aoft", ansp(int ), (int)253);
                        if (!var14_2) ** GOTO lbl296
                        throw null;
                    }
lbl383:
                    // 3 sources

                    case 63: {
                        var13_3 /* !! */  = (int)iz.ansl("aofu", ansp(int ), (int)254);
                        if (!var14_2) ** GOTO lbl310
                        throw null;
                    }
lbl387:
                    // 3 sources

                    case 64: {
                        do {
                            var13_3 /* !! */  = (int)iz.ansl("aofv", ansp(int ), (int)255);
                        } while (!var14_2);
                        throw null;
                    }
                    case 65: {
                        var13_3 /* !! */  = (int)iz.ansl("aofw", ansp(int ), (int)256);
                        if (!var14_2) ** GOTO lbl371
                        throw null;
                    }
lbl396:
                    // 3 sources

                    case 66: {
                        var13_3 /* !! */  = (int)iz.ansl("aofx", ansp(int ), (int)257);
                        if (!var14_2) ** GOTO lbl300
                        throw null;
                    }
lbl400:
                    // 2 sources

                    case 67: {
                        var13_3 /* !! */  = (int)iz.ansl("aofy", ansp(int ), (int)258);
                        if (var14_2) {
                            throw null;
                        }
                        ** GOTO lbl409
                    }
                    case 68: {
                        var13_3 /* !! */  = (int)iz.ansl("aofz", ansp(int ), (int)259);
                        if (!var14_2) ** GOTO lbl254
                        throw null;
                    }
lbl409:
                    // 3 sources

                    case 69: {
                        var13_3 /* !! */  = (int)iz.ansl("aoga", ansp(int ), (int)260);
                        if (!var14_2) ** GOTO lbl201
                        throw null;
                    }
                    case 70: {
                        var13_3 /* !! */  = (int)iz.ansl("aogb", ansp(int ), (int)261);
                        if (!var14_2) ** GOTO lbl236
                        throw null;
                    }
                    case 71: 
                }
                break;
            }
            break;
        }
        var13_3 /* !! */  = (int)iz.ansl("aogc", ansp(int ), (int)262);
        ** while (!var14_2)
lbl420:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Set<class_2248> resolveTrackedBlockTypes(Set<String> var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aoap", ante(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iz.ansl("aoaq", ansp(int ), (int)151)) break;
            v0 /* !! */  = (long)iz.ansl("aoar", ansp(int ), (int)152);
        }
        var6_1 = iz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aoas", ante(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iz.ansl("aoat", ansp(int ), (int)153)) break;
            v1 /* !! */  = (long)iz.ansl("aoau", ansp(int ), (int)154);
        }
        var5_2 /* !! */  = iz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aoav", ante(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iz.ansl("aoaw", ansp(int ), (int)155)) break;
            v2 /* !! */  = (long)iz.ansl("aoax", ansp(int ), (int)156);
        }
        var4_3 = iz.a;
        if (var6_1) {
            throw null;
lbl24:
            // 10 sources

            return null;
        }
        if (var4_3 || var4_3) ** GOTO lbl24
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = iz.cf - iz.ansl("aoay", ante(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == iz.ansl("aoaz", ansp(int ), (int)157)) break;
            v3 /* !! */  = (long)iz.ansl("aoba", ansp(int ), (int)158);
        }
        v4 /* !! */  = iz.cf;
        if (true) ** GOTO lbl37
        block70: while (true) {
            v4 /* !! */  = (long)(v5 - iz.ansl("aobb", ante(int ), (int)60));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1982509129: {
                    break block70;
                }
                case 600478318: {
                    v5 = iz.ansl("aobc", ante(int ), (int)61);
                    continue block70;
                }
                case 961353240: {
                    v5 = iz.ansl("aobd", ante(int ), (int)62);
                    continue block70;
                }
            }
            break;
        }
        var1_4 = new HashSet<class_2248>();
        if (var4_3 || var4_3) ** GOTO lbl24
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = iz.cf - iz.ansl("aobe", ante(int ), (int)63)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == iz.ansl("aobf", ansp(int ), (int)159)) break;
                    v6 /* !! */  = (long)iz.ansl("aobg", ansp(int ), (int)160);
                }
                v7 /* !! */  = iz.cf;
                if (true) ** GOTO lbl61
                block72: while (true) {
                    v7 /* !! */  = (long)(iz.ansl("aobi", ante(int ), (int)65) - iz.ansl("aobh", ante(int ), (int)64));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1982509129: {
                            break block72;
                        }
                        case -540637845: {
                            continue block72;
                        }
                    }
                    break;
                }
                var2_5 = class_7923.field_41175.iterator();
                if (var4_3) ** GOTO lbl24
                do {
                    if (var4_3 || var4_3) ** GOTO lbl24
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_5 = iz.cf - iz.ansl("aobj", ante(int ), (int)66)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  == iz.ansl("aobk", ansp(int ), (int)161)) break;
                        v8 /* !! */  = (long)iz.ansl("aobl", ansp(int ), (int)162);
                    }
                    if (!var2_5.hasNext()) ** GOTO lbl173
                    if (var4_3) ** GOTO lbl24
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_6 = iz.cf - iz.ansl("aobm", ante(int ), (int)67)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == iz.ansl("aobn", ansp(int ), (int)163)) break;
                        v9 /* !! */  = (long)iz.ansl("aobo", ansp(int ), (int)164);
                    }
                    var3_6 = (class_2248)var2_5.next();
                    if (var4_3 || var4_3) ** GOTO lbl24
                    v10 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl90
                    block76: while (true) {
                        v10 /* !! */  = (long)(iz.ansl("aobq", ante(int ), (int)69) - iz.ansl("aobp", ante(int ), (int)68));
lbl90:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1982509129: {
                                break block76;
                            }
                            case -798851773: {
                                continue block76;
                            }
                        }
                        break;
                    }
                    v11 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl99
                    block77: while (true) {
                        v11 /* !! */  = (long)(v12 - iz.ansl("aobr", ante(int ), (int)70));
lbl99:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1982509129: {
                                break block77;
                            }
                            case -1524372650: {
                                v12 = iz.ansl("aobs", ante(int ), (int)71);
                                continue block77;
                            }
                            case -1403735608: {
                                v12 = iz.ansl("aobt", ante(int ), (int)72);
                                continue block77;
                            }
                            case 1931278232: {
                                v12 = iz.ansl("aobu", ante(int ), (int)73);
                                continue block77;
                            }
                        }
                        break;
                    }
                    v13 = class_7923.field_41175.method_10221((Object)var3_6);
                    v14 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl116
                    block78: while (true) {
                        v14 /* !! */  = (long)(v15 - iz.ansl("aobv", ante(int ), (int)74));
lbl116:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1982509129: {
                                break block78;
                            }
                            case 525544153: {
                                v15 = iz.ansl("aobw", ante(int ), (int)75);
                                continue block78;
                            }
                            case 1121624655: {
                                v15 = iz.ansl("aobx", ante(int ), (int)76);
                                continue block78;
                            }
                            case 1322541591: {
                                v15 = iz.ansl("aoby", ante(int ), (int)77);
                                continue block78;
                            }
                        }
                        break;
                    }
                    v16 = v13.method_12832();
                    v17 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl133
                    block79: while (true) {
                        v17 /* !! */  = (long)(v18 - iz.ansl("aobz", ante(int ), (int)78));
lbl133:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1982509129: {
                                break block79;
                            }
                            case -19798908: {
                                v18 = iz.ansl("aoca", ante(int ), (int)79);
                                continue block79;
                            }
                            case 2055081279: {
                                v18 = iz.ansl("aocb", ante(int ), (int)80);
                                continue block79;
                            }
                        }
                        break;
                    }
                    v19 = v16.toLowerCase();
                    v20 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl147
                    block80: while (true) {
                        v20 /* !! */  = (long)(iz.ansl("aocd", ante(int ), (int)82) - iz.ansl("aocc", ante(int ), (int)81));
lbl147:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case -1982509129: {
                                break block80;
                            }
                            case 1605821457: {
                                continue block80;
                            }
                        }
                        break;
                    }
                    if (!var0.contains(v19)) ** GOTO lbl170
                    if (var4_3 || var4_3) ** GOTO lbl24
                    v21 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl158
                    block81: while (true) {
                        v21 /* !! */  = (long)(v22 - iz.ansl("aoce", ante(int ), (int)83));
lbl158:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1982509129: {
                                break block81;
                            }
                            case -462062942: {
                                v22 = iz.ansl("aocf", ante(int ), (int)84);
                                continue block81;
                            }
                            case 2001789133: {
                                v22 = iz.ansl("aocg", ante(int ), (int)85);
                                continue block81;
                            }
                        }
                        break;
                    }
                    var1_4.add(var3_6);
                    if (var4_3) ** GOTO lbl24
lbl170:
                    // 2 sources

                    if (var4_3 || var4_3) ** GOTO lbl24
                } while (!var6_1);
                throw null;
lbl173:
                // 1 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                v23 /* !! */  = iz.cf;
                if (true) ** GOTO lbl179
                block82: while (true) {
                    v23 /* !! */  = (long)(iz.ansl("aoci", ante(int ), (int)87) - iz.ansl("aoch", ante(int ), (int)86));
lbl179:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1982509129: {
                            break block82;
                        }
                        case -396315770: {
                            continue block82;
                        }
                    }
                    break;
                }
                return Set.copyOf(var1_4);
            }
lbl185:
            // 3 sources

            case 0: {
                var5_2 /* !! */  = (int)iz.ansl("aocj", ansp(int ), (int)165);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 1: {
                var5_2 /* !! */  = (int)iz.ansl("aock", ansp(int ), (int)166);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 2: {
                var5_2 /* !! */  = (int)iz.ansl("aocl", ansp(int ), (int)167);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 3: {
                var5_2 /* !! */  = (int)iz.ansl("aocm", ansp(int ), (int)168);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 4: {
                var5_2 /* !! */  = (int)iz.ansl("aocn", ansp(int ), (int)169);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl210:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)iz.ansl("aoco", ansp(int ), (int)170);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl215:
            // 3 sources

            case 6: {
                var5_2 /* !! */  = (int)iz.ansl("aocp", ansp(int ), (int)171);
                if (var6_1) {
                    throw null;
                }
            }
lbl219:
            // 5 sources

            case 7: {
                var5_2 /* !! */  = (int)iz.ansl("aocq", ansp(int ), (int)172);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl224:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)iz.ansl("aocr", ansp(int ), (int)173);
                if (!var6_1) ** GOTO lbl219
                throw null;
            }
lbl228:
            // 2 sources

            case 9: {
                var5_2 /* !! */  = (int)iz.ansl("aocs", ansp(int ), (int)174);
                if (!var6_1) ** GOTO lbl219
                throw null;
            }
lbl232:
            // 3 sources

            case 10: {
                var5_2 /* !! */  = (int)iz.ansl("aoct", ansp(int ), (int)175);
                if (!var6_1) ** GOTO lbl215
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)iz.ansl("aocu", ansp(int ), (int)176);
                if (!var6_1) ** GOTO lbl210
                throw null;
            }
lbl240:
            // 3 sources

            case 12: {
                var5_2 /* !! */  = (int)iz.ansl("aocv", ansp(int ), (int)177);
                if (var6_1) {
                    throw null;
                }
            }
lbl244:
            // 4 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)iz.ansl("aocw", ansp(int ), (int)178);
                    if (!var6_1) ** GOTO lbl240
                    throw null;
                }
            }
            case 14: {
                var5_2 /* !! */  = (int)iz.ansl("aocx", ansp(int ), (int)179);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 15: {
                var5_2 /* !! */  = (int)iz.ansl("aocy", ansp(int ), (int)180);
                if (!var6_1) ** GOTO lbl185
                throw null;
            }
lbl258:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)iz.ansl("aocz", ansp(int ), (int)181);
                if (!var6_1) ** GOTO lbl185
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)iz.ansl("aoda", ansp(int ), (int)182);
                if (!var6_1) ** GOTO lbl215
                throw null;
            }
lbl266:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)iz.ansl("aodb", ansp(int ), (int)183);
                if (!var6_1) break;
                throw null;
            }
            case 19: 
        }
        var5_2 /* !! */  = (int)iz.ansl("aodc", ansp(int ), (int)184);
        ** while (!var6_1)
lbl273:
        // 1 sources

        throw null;
    }

    public iz() {
        int n2 = b;
        super("BlockESP", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438 \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", du.RENDER);
        this.distance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", "\u0420\u0430\u0434\u0438\u0443\u0441 \u043f\u043e\u0438\u0441\u043a\u0430 \u0431\u043b\u043e\u043a\u043e\u0432", (float)iz.ansl("ansm", ansi(int ), (int)0)).range((float)iz.ansl("ansn", ansi(int ), (int)1), (float)iz.ansl("anso", ansi(int ), (int)2)).step(1.0f);
        this.foundBlocks = ConcurrentHashMap.newKeySet();
        this.scannedChunks = ConcurrentHashMap.newKeySet();
        this.candidateBuffer = new ArrayList<class_1923>();
        this.trackedBlocks = Set.of();
        this.trackedBlockTypes = Set.of();
        this.lastScanRadius = (int)iz.ansl("ansq", ansp(int ), (int)3);
        this.lastCleanupAge = (int)iz.ansl("ansr", ansp(int ), (int)4);
        this.settings(this.distance);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderFoundBlocks() {
        block64: {
            var7_1 = iz.c;
            var6_2 /* !! */  = iz.b;
            var5_3 = iz.a;
            if (var7_1) {
                throw null;
lbl6:
                // 17 sources

                return;
            }
            if (var5_3 || var5_3) ** GOTO lbl6
            if (!this.foundBlocks.isEmpty()) break block64;
            if (var5_3) ** GOTO lbl6
            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        ls.begin((boolean)iz.ansl("aojs", ansp(int ), (int)348));
        if (var5_3 || var5_3) ** GOTO lbl6
        lv.begin((boolean)iz.ansl("aojt", ansp(int ), (int)349));
        if (var5_3 || var5_3) ** GOTO lbl6
        var1_4 = this.foundBlocks.iterator();
        if (var5_3) ** GOTO lbl6
        block35: while (true) {
            if (var5_3) ** GOTO lbl6
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_3) ** GOTO lbl6
                    if (!var1_4.hasNext()) ** GOTO lbl40
                    if (var5_3) ** GOTO lbl6
                    var2_5 = var1_4.next();
                    if (var5_3 || var5_3) ** GOTO lbl6
                    var3_6 = this.blockColor(iz.mc.field_1687.method_8320(var2_5), var2_5);
                    if (var5_3 || var5_3) ** GOTO lbl6
                    var4_7 = new class_238(var2_5).method_1014((double)iz.ansl("aojv", aoju(int ), (int)96));
                    if (var5_3 || var5_3) ** GOTO lbl6
                    ls.box(var4_7, var3_6, (float)iz.ansl("aojw", ansi(int ), (int)350));
                    if (var5_3 || var5_3) ** GOTO lbl6
                    lv.box((double)var2_5.method_10263() + iz.ansl("aojx", aoju(int ), (int)97), (double)var2_5.method_10264() + iz.ansl("aojy", aoju(int ), (int)98), (double)var2_5.method_10260() + iz.ansl("aojz", aoju(int ), (int)99), (float)iz.ansl("aoka", ansi(int ), (int)351), var3_6, 1.0f);
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (!var7_1) continue block35;
                    throw null;
lbl40:
                    // 1 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                    ls.end();
                    if (var5_3 || var5_3) ** GOTO lbl6
                    lv.end();
                    if (!var5_3 && !var5_3) ** break;
                    ** continue;
                    return;
                }
lbl47:
                // 3 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)iz.ansl("aokb", ansp(int ), (int)352);
                        if (var7_1) {
                            throw null;
                        }
                        ** GOTO lbl111
                        break;
                    }
                }
lbl53:
                // 2 sources

                case 1: {
                    var6_2 /* !! */  = (int)iz.ansl("aokc", ansp(int ), (int)353);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl123
                }
lbl58:
                // 2 sources

                case 2: {
                    var6_2 /* !! */  = (int)iz.ansl("aokd", ansp(int ), (int)354);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl63:
                // 2 sources

                case 3: {
                    var6_2 /* !! */  = (int)iz.ansl("aoke", ansp(int ), (int)355);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
                case 4: {
                    var6_2 /* !! */  = (int)iz.ansl("aokf", ansp(int ), (int)356);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl78
                }
lbl73:
                // 2 sources

                case 5: {
                    var6_2 /* !! */  = (int)iz.ansl("aokg", ansp(int ), (int)357);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl127
                }
lbl78:
                // 3 sources

                case 6: {
                    var6_2 /* !! */  = (int)iz.ansl("aokh", ansp(int ), (int)358);
                    if (!var7_1) ** GOTO lbl63
                    throw null;
                }
                case 7: {
                    var6_2 /* !! */  = (int)iz.ansl("aoki", ansp(int ), (int)359);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl87:
                // 3 sources

                case 8: {
                    var6_2 /* !! */  = (int)iz.ansl("aokj", ansp(int ), (int)360);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl111
                }
                case 9: {
                    var6_2 /* !! */  = (int)iz.ansl("aokk", ansp(int ), (int)361);
                    if (!var7_1) break block35;
                    throw null;
                }
                case 10: {
                    var6_2 /* !! */  = (int)iz.ansl("aokl", ansp(int ), (int)362);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl101:
                // 3 sources

                case 11: {
                    var6_2 /* !! */  = (int)iz.ansl("aokm", ansp(int ), (int)363);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl106:
                // 2 sources

                case 12: {
                    var6_2 /* !! */  = (int)iz.ansl("aokn", ansp(int ), (int)364);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl111:
                // 3 sources

                case 13: {
                    var6_2 /* !! */  = (int)iz.ansl("aoko", ansp(int ), (int)365);
                    if (!var7_1) ** GOTO lbl106
                    throw null;
                }
                case 14: {
                    var6_2 /* !! */  = (int)iz.ansl("aokp", ansp(int ), (int)366);
                    if (!var7_1) ** GOTO lbl101
                    throw null;
                }
                case 15: {
                    var6_2 /* !! */  = (int)iz.ansl("aokq", ansp(int ), (int)367);
                    if (!var7_1) ** GOTO lbl58
                    throw null;
                }
lbl123:
                // 3 sources

                case 16: {
                    var6_2 /* !! */  = (int)iz.ansl("aokr", ansp(int ), (int)368);
                    if (!var7_1) ** GOTO lbl78
                    throw null;
                }
lbl127:
                // 3 sources

                case 17: {
                    var6_2 /* !! */  = (int)iz.ansl("aoks", ansp(int ), (int)369);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl132:
                // 2 sources

                case 18: {
                    var6_2 /* !! */  = (int)iz.ansl("aokt", ansp(int ), (int)370);
                    if (!var7_1) ** GOTO lbl87
                    throw null;
                }
lbl136:
                // 4 sources

                case 19: {
                    var6_2 /* !! */  = (int)iz.ansl("aoku", ansp(int ), (int)371);
                    if (!var7_1) ** GOTO lbl53
                    throw null;
                }
                case 20: {
                    var6_2 /* !! */  = (int)iz.ansl("aokv", ansp(int ), (int)372);
                    if (!var7_1) ** GOTO lbl136
                    throw null;
                }
                case 21: {
                    var6_2 /* !! */  = (int)iz.ansl("aokw", ansp(int ), (int)373);
                    if (!var7_1) ** GOTO lbl47
                    throw null;
                }
lbl148:
                // 2 sources

                case 22: {
                    var6_2 /* !! */  = (int)iz.ansl("aokx", ansp(int ), (int)374);
                    if (!var7_1) ** GOTO lbl123
                    throw null;
                }
lbl152:
                // 2 sources

                case 23: {
                    var6_2 /* !! */  = (int)iz.ansl("aoky", ansp(int ), (int)375);
                    if (!var7_1) ** GOTO lbl47
                    throw null;
                }
lbl156:
                // 3 sources

                case 24: {
                    var6_2 /* !! */  = (int)iz.ansl("aokz", ansp(int ), (int)376);
                    if (!var7_1) ** GOTO lbl87
                    throw null;
                }
                case 25: {
                    var6_2 /* !! */  = (int)iz.ansl("aola", ansp(int ), (int)377);
                    if (!var7_1) ** GOTO lbl73
                    throw null;
                }
                case 26: {
                    var6_2 /* !! */  = (int)iz.ansl("aolb", ansp(int ), (int)378);
                    if (!var7_1) ** GOTO lbl132
                    throw null;
                }
lbl168:
                // 3 sources

                case 27: {
                    var6_2 /* !! */  = (int)iz.ansl("aolc", ansp(int ), (int)379);
                    if (!var7_1) ** GOTO lbl101
                    throw null;
                }
                case 28: {
                    var6_2 /* !! */  = (int)iz.ansl("aold", ansp(int ), (int)380);
                    if (!var7_1) ** GOTO lbl136
                    throw null;
                }
                case 29: {
                    var6_2 /* !! */  = (int)iz.ansl("aole", ansp(int ), (int)381);
                    if (!var7_1) ** GOTO lbl127
                    throw null;
                }
                case 30: {
                    do {
                        var6_2 /* !! */  = (int)iz.ansl("aolf", ansp(int ), (int)382);
                    } while (!var7_1);
                    throw null;
                }
                case 31: 
            }
            break;
        }
        var6_2 /* !! */  = (int)iz.ansl("aolg", ansp(int ), (int)383);
        ** while (!var7_1)
lbl188:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aosv() {
        iz.ansj[100] = -1996500555;
        iz.ansj[101] = 1827378206;
        iz.ansj[102] = 161747596;
        iz.ansj[103] = 1081900371;
        iz.ansj[104] = 1108817808;
        iz.ansj[105] = 939014369;
        iz.ansj[106] = -2040522514;
        iz.ansj[107] = 1702479485;
        iz.ansj[108] = 1202870549;
        iz.ansj[109] = 2023524148;
        iz.ansj[110] = 1430068112;
        iz.ansj[111] = 12374104;
        iz.ansj[112] = -1290480450;
        iz.ansj[113] = -622866110;
        iz.ansj[114] = 746880177;
        iz.ansj[115] = -373570999;
        iz.ansj[116] = -1266688728;
        iz.ansj[117] = 1098932721;
        iz.ansj[118] = -1549334725;
        iz.ansj[119] = 1171354624;
        iz.ansj[120] = -380094794;
        iz.ansj[121] = 973759811;
        iz.ansj[122] = -1489278579;
        iz.ansj[123] = -1224853492;
        iz.ansj[124] = 654465889;
        iz.ansj[125] = -876323519;
        iz.ansj[126] = -1354243882;
        iz.ansj[127] = -1628557664;
        iz.ansj[128] = -1085841701;
        iz.ansj[129] = -2091117542;
        iz.ansj[130] = 270285086;
        iz.ansj[131] = 1542725155;
        iz.ansj[132] = -1578808400;
        iz.ansj[133] = -1268655271;
        iz.ansj[134] = 1617576678;
        iz.ansj[135] = -2028785022;
        iz.ansj[136] = 242006522;
        iz.ansj[137] = -603996315;
        iz.ansj[138] = 578702910;
        iz.ansj[139] = -1439893842;
        iz.ansj[140] = -364564637;
        iz.ansj[141] = 39770008;
        iz.ansj[142] = -698455866;
        iz.ansj[143] = 1198159973;
        iz.ansj[144] = -1820006439;
        iz.ansj[145] = -1739171719;
        iz.ansj[146] = -559106216;
        iz.ansj[147] = -327195825;
        iz.ansj[148] = -490464818;
        iz.ansj[149] = 1215611286;
        iz.ansj[150] = -1501585749;
        iz.ansj[151] = 1271285616;
        iz.ansj[152] = -2057967365;
        iz.ansj[153] = -18411722;
        iz.ansj[154] = 1512976743;
        iz.ansj[155] = 1782247548;
        iz.ansj[156] = -1436792468;
        iz.ansj[157] = 777955967;
        iz.ansj[158] = -172753836;
        iz.ansj[159] = 1734664285;
        iz.ansj[160] = 24842072;
        iz.ansj[161] = 1860395447;
        iz.ansj[162] = 1035636980;
        iz.ansj[163] = -1636772530;
        iz.ansj[164] = 974206924;
        iz.ansj[165] = -1638506844;
        iz.ansj[166] = 1120241102;
        iz.ansj[167] = -1702149477;
        iz.ansj[168] = 795248096;
        iz.ansj[169] = 124295130;
        iz.ansj[170] = 323779139;
        iz.ansj[171] = 1697100305;
        iz.ansj[172] = 530342732;
        iz.ansj[173] = 1716343142;
        iz.ansj[174] = -783984207;
        iz.ansj[175] = -481265514;
        iz.ansj[176] = 681093144;
        iz.ansj[177] = 1730375230;
        iz.ansj[178] = 1048783603;
        iz.ansj[179] = 1361765463;
        iz.ansj[180] = 1863826471;
        iz.ansj[181] = -995144614;
        iz.ansj[182] = 488719501;
        iz.ansj[183] = 2114449793;
        iz.ansj[184] = 498352134;
        iz.ansj[185] = -693674499;
        iz.ansj[186] = -596926243;
        iz.ansj[187] = 1463946604;
        iz.ansj[188] = -1661530231;
        iz.ansj[189] = -1413385480;
        iz.ansj[190] = -854447745;
        iz.ansj[191] = -1005581438;
        iz.ansj[192] = 1322883106;
        iz.ansj[193] = 609388308;
        iz.ansj[194] = -1904852999;
        iz.ansj[195] = 1856324444;
        iz.ansj[196] = 0x54656446;
        iz.ansj[197] = 488385366;
        iz.ansj[198] = 504497719;
        iz.ansj[199] = 1879181026;
    }

    private static /* synthetic */ void aotg() {
        iz.antg[0] = 2102623860621488746L;
        iz.antg[1] = 7209951340200413397L;
        iz.antg[2] = 1314520803849683421L;
        iz.antg[3] = 1389633460491002352L;
        iz.antg[4] = 2232600719609191140L;
        iz.antg[5] = 6284579778533964561L;
        iz.antg[6] = 2587588091332612257L;
        iz.antg[7] = 6777823235989040080L;
        iz.antg[8] = 4150040657414549347L;
        iz.antg[9] = -126031743958498484L;
        iz.antg[10] = 6319154728654371852L;
        iz.antg[11] = 6565252354060904543L;
        iz.antg[12] = 2561639726022894315L;
        iz.antg[13] = 1392300571436782894L;
        iz.antg[14] = -6399968546937573328L;
        iz.antg[15] = -6535856632716019925L;
        iz.antg[16] = -6357815839183993513L;
        iz.antg[17] = -8073143394139590739L;
        iz.antg[18] = -3595171688757154305L;
        iz.antg[19] = 1140299331379636811L;
        iz.antg[20] = 429473755021542486L;
        iz.antg[21] = 7141865173823327309L;
        iz.antg[22] = 1918407362749034191L;
        iz.antg[23] = 4944427012995602563L;
        iz.antg[24] = 1934059010064389349L;
        iz.antg[25] = -3171638734670252394L;
        iz.antg[26] = 6213333823985283264L;
        iz.antg[27] = -6360312305050520182L;
        iz.antg[28] = -1899367096170653287L;
        iz.antg[29] = -3401789905302112467L;
        iz.antg[30] = 3217773794547729863L;
        iz.antg[31] = 4931668549528428821L;
        iz.antg[32] = 6539772965526401112L;
        iz.antg[33] = 8140984454576600450L;
        iz.antg[34] = 7006107715571560235L;
        iz.antg[35] = -2515049646550276788L;
        iz.antg[36] = 7817562344098442570L;
        iz.antg[37] = -5607780156911791901L;
        iz.antg[38] = -4850219067197659411L;
        iz.antg[39] = -174290620613531163L;
        iz.antg[40] = 1005286102364878705L;
        iz.antg[41] = 2884711140623671701L;
        iz.antg[42] = 8381861164314109005L;
        iz.antg[43] = 567960652570109702L;
        iz.antg[44] = -3171453350150652489L;
        iz.antg[45] = -8829685641803090258L;
        iz.antg[46] = 4727598684373146953L;
        iz.antg[47] = 3370140245597357877L;
        iz.antg[48] = -1100115216291966736L;
        iz.antg[49] = 5130436284601528208L;
        iz.antg[50] = 5435001009249737294L;
        iz.antg[51] = 485946557713450608L;
        iz.antg[52] = 2364066760693401046L;
        iz.antg[53] = 290798676876856702L;
        iz.antg[54] = 4837554579676223180L;
        iz.antg[55] = -158300607370282535L;
        iz.antg[56] = 4805416907142669868L;
        iz.antg[57] = -8945429984360655683L;
        iz.antg[58] = -4843832941006945137L;
        iz.antg[59] = 8786378370071884171L;
        iz.antg[60] = -4524021365359872863L;
        iz.antg[61] = -7923989896315295165L;
        iz.antg[62] = -2340522090549452240L;
        iz.antg[63] = -5578587738548459179L;
        iz.antg[64] = 3630240754517457455L;
        iz.antg[65] = -6280524021512855176L;
        iz.antg[66] = -793304877445848747L;
        iz.antg[67] = 1097726932481099920L;
        iz.antg[68] = 4758897391064409841L;
        iz.antg[69] = 6890119636423965188L;
        iz.antg[70] = 2377268308034200853L;
        iz.antg[71] = -9199088494469708139L;
        iz.antg[72] = -3106301802260954711L;
        iz.antg[73] = -2834227471272047205L;
        iz.antg[74] = 2430650586721778224L;
        iz.antg[75] = -6302387694186259721L;
        iz.antg[76] = -7590361612330288125L;
        iz.antg[77] = 2809543175342804155L;
        iz.antg[78] = 865106920427741593L;
        iz.antg[79] = 5850388261018278931L;
        iz.antg[80] = 6314157745399119880L;
        iz.antg[81] = 895040331610542178L;
        iz.antg[82] = 5235835742730094795L;
        iz.antg[83] = 2443978998738223275L;
        iz.antg[84] = -441577523766770747L;
        iz.antg[85] = 8114379204190062386L;
        iz.antg[86] = -6704518739344923258L;
        iz.antg[87] = -3523988227571152030L;
        iz.antg[88] = 6961679997819370276L;
        iz.antg[89] = -6502087070802910642L;
        iz.antg[90] = -4622293746960941987L;
        iz.antg[91] = -4245125359095030869L;
        iz.antg[92] = -1242366491263901724L;
        iz.antg[93] = -6403001280366751697L;
        iz.antg[94] = 1501964464613980943L;
        iz.antg[95] = -6931107726364780456L;
        iz.antg[96] = 1348923104822928309L;
        iz.antg[97] = 4038039328913000897L;
        iz.antg[98] = -6666577875735783740L;
        iz.antg[99] = -1740496477595658868L;
    }

    private static /* synthetic */ void aoth() {
        iz.antg[100] = -2829796952829774435L;
        iz.antg[101] = -3240944412612768669L;
        iz.antg[102] = -540235712172102476L;
        iz.antg[103] = 3005059011295916874L;
        iz.antg[104] = -7063173750528140100L;
        iz.antg[105] = -5461795696910363329L;
        iz.antg[106] = 4731508336192531296L;
        iz.antg[107] = 5314601640225027067L;
        iz.antg[108] = -668893662236141384L;
        iz.antg[109] = -5040893252070659360L;
        iz.antg[110] = 6145562159630555766L;
        iz.antg[111] = -3095273847171605527L;
        iz.antg[112] = 7370447824075716564L;
        iz.antg[113] = 9040619247553311341L;
        iz.antg[114] = -9100316796240740482L;
        iz.antg[115] = 8216335666624696748L;
        iz.antg[116] = -3504740768118645239L;
        iz.antg[117] = -4750690109097422570L;
        iz.antg[118] = -1589367933950430828L;
        iz.antg[119] = -7833901956478722223L;
        iz.antg[120] = -5879934374837836592L;
        iz.antg[121] = 189572362059842522L;
        iz.antg[122] = -6165513154140243556L;
        iz.antg[123] = -3985222955172414392L;
        iz.antg[124] = -3361920484821369380L;
        iz.antg[125] = -5637425774798544278L;
        iz.antg[126] = -399442905671748183L;
        iz.antg[127] = -7581029008223921634L;
        iz.antg[128] = 993788638899230355L;
        iz.antg[129] = 8085301573308171493L;
        iz.antg[130] = -2957913467031381195L;
        iz.antg[131] = -5943701123312883107L;
        iz.antg[132] = -8667268410983334768L;
        iz.antg[133] = -4113708096151562053L;
        iz.antg[134] = 7354524250198751297L;
        iz.antg[135] = 934270608467223061L;
        iz.antg[136] = -2578412181926093504L;
        iz.antg[137] = -4549435430987686620L;
        iz.antg[138] = -8411025000624295056L;
        iz.antg[139] = 5576915597428812629L;
        iz.antg[140] = 3822684472610369725L;
        iz.antg[141] = 7852107641344673219L;
        iz.antg[142] = 4663737465453217284L;
        iz.antg[143] = -4993677303679279408L;
        iz.antg[144] = -2484759626543160741L;
        iz.antg[145] = 5452732440441261352L;
        iz.antg[146] = 8359870721644444554L;
        iz.antg[147] = -1370575531501420984L;
        iz.antg[148] = 7282974068854461970L;
        iz.antg[149] = 8419820933698998172L;
        iz.antg[150] = 8469735604113817190L;
        iz.antg[151] = -2306903029350893291L;
        iz.antg[152] = 2906940160675509962L;
        iz.antg[153] = 311231902700719375L;
        iz.antg[154] = 6059523804496637958L;
        iz.antg[155] = 6609195487677838308L;
        iz.antg[156] = 6382582746170824727L;
        iz.antg[157] = 4958583814691719492L;
        iz.antg[158] = -7636945530619300752L;
        iz.antg[159] = 5061134532990234800L;
        iz.antg[160] = -5801885722178580487L;
        iz.antg[161] = 4033416750474214697L;
        iz.antg[162] = 1166953394371370620L;
        iz.antg[163] = 8037419001035486711L;
        iz.antg[164] = 1784375802452300991L;
        iz.antg[165] = -3845913638597462799L;
        iz.antg[166] = -2974160611020433786L;
        iz.antg[167] = 7465081617792982330L;
        iz.antg[168] = 603448564058238012L;
        iz.antg[169] = 5557634656592089890L;
        iz.antg[170] = -3536926920748105540L;
        iz.antg[171] = -9134711808308508923L;
        iz.antg[172] = 9033018986242531749L;
        iz.antg[173] = 3398748327150242740L;
        iz.antg[174] = 5659168892004548216L;
        iz.antg[175] = 8175900098127302026L;
        iz.antg[176] = -3592591143871812395L;
        iz.antg[177] = -4455376771131346088L;
        iz.antg[178] = -8815244391667505532L;
        iz.antg[179] = -3905116827366716421L;
        iz.antg[180] = -3934775916083455935L;
        iz.antg[181] = -5893762758057380376L;
        iz.antg[182] = 4616435247997822698L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void invalidateScan() {
        v0 /* !! */  = iz.cf;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v1 - iz.ansl("aonk", ante(int ), (int)121));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1982509129: {
                    break block46;
                }
                case 887578691: {
                    v1 = iz.ansl("aonl", ante(int ), (int)122);
                    continue block46;
                }
                case 998276355: {
                    v1 = iz.ansl("aonm", ante(int ), (int)123);
                    continue block46;
                }
            }
            break;
        }
        var3_1 = iz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aonn", ante(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iz.ansl("aono", ansp(int ), (int)418)) break;
            v2 /* !! */  = (long)iz.ansl("aonp", ansp(int ), (int)419);
        }
        var2_2 /* !! */  = iz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aonq", ante(int ), (int)125)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == iz.ansl("aonr", ansp(int ), (int)420)) break;
            v3 /* !! */  = (long)iz.ansl("aons", ansp(int ), (int)421);
        }
        var1_3 = iz.a;
        if (var3_1) {
            throw null;
lbl29:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v4 /* !! */  = iz.cf;
        if (true) ** GOTO lbl36
        block50: while (true) {
            v4 /* !! */  = (long)(v5 - iz.ansl("aont", ante(int ), (int)126));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1982509129: {
                    break block50;
                }
                case -1255439440: {
                    v5 = iz.ansl("aonu", ante(int ), (int)127);
                    continue block50;
                }
                case -633829711: {
                    v5 = iz.ansl("aonv", ante(int ), (int)128);
                    continue block50;
                }
                case 803650872: {
                    v5 = iz.ansl("aonw", ante(int ), (int)129);
                    continue block50;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aonx", ante(int ), (int)130)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == iz.ansl("aony", ansp(int ), (int)422)) break;
            v6 /* !! */  = (long)iz.ansl("aonz", ansp(int ), (int)423);
        }
        this.foundBlocks.clear();
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = iz.cf - iz.ansl("aooa", ante(int ), (int)131)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == iz.ansl("aoob", ansp(int ), (int)424)) break;
            v7 /* !! */  = (long)iz.ansl("aooc", ansp(int ), (int)425);
        }
        v8 /* !! */  = iz.cf;
        if (true) ** GOTO lbl64
        block53: while (true) {
            v8 /* !! */  = (long)(v9 - iz.ansl("aood", ante(int ), (int)132));
lbl64:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1982509129: {
                    break block53;
                }
                case -1102504078: {
                    v9 = iz.ansl("aooe", ante(int ), (int)133);
                    continue block53;
                }
                case -1029540490: {
                    v9 = iz.ansl("aoof", ante(int ), (int)134);
                    continue block53;
                }
                case -900545809: {
                    v9 = iz.ansl("aoog", ante(int ), (int)135);
                    continue block53;
                }
            }
            break;
        }
        this.scannedChunks.clear();
        if (var1_3 || var1_3) ** GOTO lbl29
        v10 /* !! */  = iz.cf;
        if (true) ** GOTO lbl82
        block54: while (true) {
            v10 /* !! */  = (long)(v11 - iz.ansl("aooh", ante(int ), (int)136));
lbl82:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1982509129: {
                    break block54;
                }
                case -399254801: {
                    v11 = iz.ansl("aooi", ante(int ), (int)137);
                    continue block54;
                }
                case 387039281: {
                    v11 = iz.ansl("aooj", ante(int ), (int)138);
                    continue block54;
                }
            }
            break;
        }
        this.lastPlayerChunk = null;
        if (var1_3 || var1_3) ** GOTO lbl29
        v12 = iz.ansl("aook", ante(int ), (int)139);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = iz.cf - iz.ansl("aool", ante(int ), (int)140)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == iz.ansl("aoom", ansp(int ), (int)426)) break;
            v13 /* !! */  = (long)iz.ansl("aoon", ansp(int ), (int)427);
        }
        this.lastScanTime = (long)v12;
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v14 = iz.ansl("aooo", ansp(int ), (int)428);
                v15 /* !! */  = iz.cf;
                if (true) ** GOTO lbl110
                block56: while (true) {
                    v15 /* !! */  = (long)(v16 - iz.ansl("aoop", ante(int ), (int)141));
lbl110:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1982509129: {
                            break block56;
                        }
                        case 272934594: {
                            v16 = iz.ansl("aooq", ante(int ), (int)142);
                            continue block56;
                        }
                        case 1229570827: {
                            v16 = iz.ansl("aoor", ante(int ), (int)143);
                            continue block56;
                        }
                        case 1716712516: {
                            v16 = iz.ansl("aoos", ante(int ), (int)144);
                            continue block56;
                        }
                    }
                    break;
                }
                this.lastScanRadius = (int)v14;
                if (var1_3 || var1_3) ** GOTO lbl29
                v17 = iz.ansl("aoot", ansp(int ), (int)429);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = iz.cf - iz.ansl("aoou", ante(int ), (int)145)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == iz.ansl("aoov", ansp(int ), (int)430)) break;
                    v18 /* !! */  = (long)iz.ansl("aoow", ansp(int ), (int)431);
                }
                this.lastCleanupAge = (int)v17;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)iz.ansl("aoox", ansp(int ), (int)432);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl139:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)iz.ansl("aooy", ansp(int ), (int)433);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 2: {
                var2_2 /* !! */  = (int)iz.ansl("aooz", ansp(int ), (int)434);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
lbl148:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)iz.ansl("aopa", ansp(int ), (int)435);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl153:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)iz.ansl("aopb", ansp(int ), (int)436);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
lbl157:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)iz.ansl("aopc", ansp(int ), (int)437);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)iz.ansl("aopd", ansp(int ), (int)438);
                    if (!var3_1) ** GOTO lbl153
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)iz.ansl("aope", ansp(int ), (int)439);
                if (var3_1) {
                    throw null;
                }
            }
lbl171:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)iz.ansl("aopf", ansp(int ), (int)440);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl176:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)iz.ansl("aopg", ansp(int ), (int)441);
                if (!var3_1) break;
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)iz.ansl("aoph", ansp(int ), (int)442);
                if (!var3_1) ** GOTO lbl176
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)iz.ansl("aopi", ansp(int ), (int)443);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl188:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)iz.ansl("aopj", ansp(int ), (int)444);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 13: {
                var2_2 /* !! */  = (int)iz.ansl("aopk", ansp(int ), (int)445);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
lbl197:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)iz.ansl("aopl", ansp(int ), (int)446);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)iz.ansl("aopm", ansp(int ), (int)447);
        ** while (!var3_1)
lbl204:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aote() {
        iz.antf[0] = 8898023671424240094L;
        iz.antf[1] = -4131145424581497800L;
        iz.antf[2] = -4280960192644254135L;
        iz.antf[3] = 4537925931893858470L;
        iz.antf[4] = 4580931318361320184L;
        iz.antf[5] = -373783210843860534L;
        iz.antf[6] = 7274234645112786908L;
        iz.antf[7] = 1148851891080895445L;
        iz.antf[8] = -4044557932447346318L;
        iz.antf[9] = 9197767319256857339L;
        iz.antf[10] = -2408994285535717848L;
        iz.antf[11] = -6864387301258041613L;
        iz.antf[12] = -4577929846061003237L;
        iz.antf[13] = -7559115507193866426L;
        iz.antf[14] = -5513045532336241109L;
        iz.antf[15] = -187746267626079883L;
        iz.antf[16] = 8747632550838323249L;
        iz.antf[17] = -3472766791055583256L;
        iz.antf[18] = 4295409909767435662L;
        iz.antf[19] = 5051093239845332778L;
        iz.antf[20] = -3375212528867636444L;
        iz.antf[21] = -1010143108637786593L;
        iz.antf[22] = -2890056620848139895L;
        iz.antf[23] = -6672968981166496855L;
        iz.antf[24] = 8913013662526712287L;
        iz.antf[25] = -3171638734670252380L;
        iz.antf[26] = -6756181914888031502L;
        iz.antf[27] = 5888559318840135392L;
        iz.antf[28] = -3728521086849392107L;
        iz.antf[29] = 4642743998310001878L;
        iz.antf[30] = 2495784970914768961L;
        iz.antf[31] = 2843975068949144708L;
        iz.antf[32] = -1539761574295658229L;
        iz.antf[33] = 945322437650225636L;
        iz.antf[34] = 5985313906207847943L;
        iz.antf[35] = -3750451222037799714L;
        iz.antf[36] = 3759618720650731244L;
        iz.antf[37] = 4158243729012772476L;
        iz.antf[38] = 9215442068484291708L;
        iz.antf[39] = 3779629688712995409L;
        iz.antf[40] = -2807457427841673517L;
        iz.antf[41] = 3233279799956492487L;
        iz.antf[42] = 2118760478303193833L;
        iz.antf[43] = -8854417033648363684L;
        iz.antf[44] = 2373456159544575412L;
        iz.antf[45] = 8706850930634995998L;
        iz.antf[46] = 677171441720910129L;
        iz.antf[47] = 5775447015255747684L;
        iz.antf[48] = 3657828017131320283L;
        iz.antf[49] = -1201147526050994043L;
        iz.antf[50] = -6139762326348171625L;
        iz.antf[51] = -4576760896629341247L;
        iz.antf[52] = 2348937046961564942L;
        iz.antf[53] = 4539746349883546879L;
        iz.antf[54] = 7012940567619158838L;
        iz.antf[55] = -8383895831517566545L;
        iz.antf[56] = 7938152609809391917L;
        iz.antf[57] = -6774949273519152983L;
        iz.antf[58] = -4001060267860242894L;
        iz.antf[59] = -200589465590258489L;
        iz.antf[60] = -150163647294193779L;
        iz.antf[61] = -4071988729911505771L;
        iz.antf[62] = 6079470571451079020L;
        iz.antf[63] = -3659766141689609342L;
        iz.antf[64] = -2420826511247294862L;
        iz.antf[65] = -3128497647317492708L;
        iz.antf[66] = 5640996077313914911L;
        iz.antf[67] = -1758242546820292951L;
        iz.antf[68] = -9135500039080710463L;
        iz.antf[69] = -5625031008478767798L;
        iz.antf[70] = -2315779190926777345L;
        iz.antf[71] = 7915690896844913147L;
        iz.antf[72] = -4948998395953921073L;
        iz.antf[73] = 5396576476829573037L;
        iz.antf[74] = 7532718681305751733L;
        iz.antf[75] = -4986060215115399403L;
        iz.antf[76] = 6720090598076031148L;
        iz.antf[77] = -149791763918344442L;
        iz.antf[78] = 8899567466826640958L;
        iz.antf[79] = -3702535723931376664L;
        iz.antf[80] = 8829355111285493214L;
        iz.antf[81] = -6549183664453264888L;
        iz.antf[82] = 5880457729556791067L;
        iz.antf[83] = -4038617364140521874L;
        iz.antf[84] = 9170376630683762852L;
        iz.antf[85] = 897821282597784335L;
        iz.antf[86] = 5131013366053877525L;
        iz.antf[87] = 2589440828678153380L;
        iz.antf[88] = -9221379308483251406L;
        iz.antf[89] = -7195913008422999654L;
        iz.antf[90] = 5814018057615634742L;
        iz.antf[91] = -7056319076724316758L;
        iz.antf[92] = -6562910415230165957L;
        iz.antf[93] = -8693282459722582584L;
        iz.antf[94] = -6315953725329788415L;
        iz.antf[95] = 8469033386200874090L;
        iz.antf[96] = 3303447670642182729L;
        iz.antf[97] = 570267615837718977L;
        iz.antf[98] = -7161973834746538300L;
        iz.antf[99] = -2866396384438282868L;
    }

    private static /* synthetic */ float ansi(int n2) {
        return Float.intBitsToFloat(ansj[n2] ^ ansk[n2]);
    }

    private static /* synthetic */ void aosz() {
        iz.ansk[0] = -1998100285;
        iz.ansk[1] = -1782644677;
        iz.ansk[2] = 614380656;
        iz.ansk[3] = -622142890;
        iz.ansk[4] = -346930935;
        iz.ansk[5] = -766214750;
        iz.ansk[6] = -1873736479;
        iz.ansk[7] = -290455831;
        iz.ansk[8] = -712108223;
        iz.ansk[9] = -632126644;
        iz.ansk[10] = 1285544447;
        iz.ansk[11] = -1096047113;
        iz.ansk[12] = 1678057306;
        iz.ansk[13] = -1072329838;
        iz.ansk[14] = -1093191559;
        iz.ansk[15] = 417002396;
        iz.ansk[16] = 1820291908;
        iz.ansk[17] = -1709074403;
        iz.ansk[18] = 218527635;
        iz.ansk[19] = -420788704;
        iz.ansk[20] = 1662110211;
        iz.ansk[21] = 1258866474;
        iz.ansk[22] = -1883637356;
        iz.ansk[23] = 1283532299;
        iz.ansk[24] = 602355328;
        iz.ansk[25] = 2006337032;
        iz.ansk[26] = -1685620102;
        iz.ansk[27] = 1002234133;
        iz.ansk[28] = 651860554;
        iz.ansk[29] = 2076699259;
        iz.ansk[30] = 1169039013;
        iz.ansk[31] = -2040486264;
        iz.ansk[32] = -1569017640;
        iz.ansk[33] = 1822491349;
        iz.ansk[34] = 1196076117;
        iz.ansk[35] = 107941001;
        iz.ansk[36] = 705222975;
        iz.ansk[37] = 72004935;
        iz.ansk[38] = 323407751;
        iz.ansk[39] = -1908789497;
        iz.ansk[40] = 1585981115;
        iz.ansk[41] = -475821268;
        iz.ansk[42] = 393811371;
        iz.ansk[43] = 1397175425;
        iz.ansk[44] = 2136624237;
        iz.ansk[45] = -62541896;
        iz.ansk[46] = 41665876;
        iz.ansk[47] = 1609057169;
        iz.ansk[48] = -537780189;
        iz.ansk[49] = 1676256804;
        iz.ansk[50] = 1401370505;
        iz.ansk[51] = 1049397958;
        iz.ansk[52] = 31942537;
        iz.ansk[53] = -65113044;
        iz.ansk[54] = 418870184;
        iz.ansk[55] = -1071823912;
        iz.ansk[56] = 1729838267;
        iz.ansk[57] = -1002092876;
        iz.ansk[58] = -1704185642;
        iz.ansk[59] = -440509664;
        iz.ansk[60] = -504844272;
        iz.ansk[61] = -2081875462;
        iz.ansk[62] = 967836932;
        iz.ansk[63] = 483072881;
        iz.ansk[64] = -695456218;
        iz.ansk[65] = -726445662;
        iz.ansk[66] = -84992652;
        iz.ansk[67] = -107391416;
        iz.ansk[68] = 1045059076;
        iz.ansk[69] = -7782898;
        iz.ansk[70] = -243106949;
        iz.ansk[71] = 524966722;
        iz.ansk[72] = -794063490;
        iz.ansk[73] = -1771298061;
        iz.ansk[74] = 1923856777;
        iz.ansk[75] = -1536199987;
        iz.ansk[76] = -642648099;
        iz.ansk[77] = -1137011928;
        iz.ansk[78] = -623272858;
        iz.ansk[79] = -1905340382;
        iz.ansk[80] = 438678206;
        iz.ansk[81] = -32819775;
        iz.ansk[82] = -1395788610;
        iz.ansk[83] = 2062626418;
        iz.ansk[84] = 1785560378;
        iz.ansk[85] = -1664726948;
        iz.ansk[86] = -796814113;
        iz.ansk[87] = -1099985569;
        iz.ansk[88] = 1730686279;
        iz.ansk[89] = -635145542;
        iz.ansk[90] = -1305780544;
        iz.ansk[91] = 1417396397;
        iz.ansk[92] = -2095212707;
        iz.ansk[93] = -812728431;
        iz.ansk[94] = 882617924;
        iz.ansk[95] = 550881081;
        iz.ansk[96] = -1436300196;
        iz.ansk[97] = 549768863;
        iz.ansk[98] = -1787976768;
        iz.ansk[99] = -1962205911;
    }

    private static /* synthetic */ void aosy() {
        iz.ansj[400] = -1842278539;
        iz.ansj[401] = -1279523025;
        iz.ansj[402] = -1793832395;
        iz.ansj[403] = -484511444;
        iz.ansj[404] = -2012606271;
        iz.ansj[405] = -1524815058;
        iz.ansj[406] = 1576705243;
        iz.ansj[407] = -838522301;
        iz.ansj[408] = -1069471321;
        iz.ansj[409] = 396028080;
        iz.ansj[410] = 625915984;
        iz.ansj[411] = 1794140332;
        iz.ansj[412] = -389436480;
        iz.ansj[413] = -1334785130;
        iz.ansj[414] = 389813951;
        iz.ansj[415] = 1407518012;
        iz.ansj[416] = 985949754;
        iz.ansj[417] = -922832715;
        iz.ansj[418] = -709326714;
        iz.ansj[419] = 403490004;
        iz.ansj[420] = -286281684;
        iz.ansj[421] = -1350862276;
        iz.ansj[422] = 1444152131;
        iz.ansj[423] = 132868436;
        iz.ansj[424] = 1894642421;
        iz.ansj[425] = 1244571966;
        iz.ansj[426] = -1837612480;
        iz.ansj[427] = -1464555966;
        iz.ansj[428] = -922470289;
        iz.ansj[429] = 1729501418;
        iz.ansj[430] = 1063366270;
        iz.ansj[431] = -1860527826;
        iz.ansj[432] = -114407508;
        iz.ansj[433] = 423780272;
        iz.ansj[434] = -1087972095;
        iz.ansj[435] = 585198483;
        iz.ansj[436] = -640638160;
        iz.ansj[437] = 1790034463;
        iz.ansj[438] = -96799756;
        iz.ansj[439] = 905247373;
        iz.ansj[440] = 595804815;
        iz.ansj[441] = 626648266;
        iz.ansj[442] = -493082651;
        iz.ansj[443] = -179089057;
        iz.ansj[444] = 166221781;
        iz.ansj[445] = -431545316;
        iz.ansj[446] = -264920312;
        iz.ansj[447] = -1169565058;
        iz.ansj[448] = -2097175077;
        iz.ansj[449] = -152534146;
        iz.ansj[450] = 882546615;
        iz.ansj[451] = -2061542129;
        iz.ansj[452] = 1008572218;
        iz.ansj[453] = 491155205;
        iz.ansj[454] = 843398183;
        iz.ansj[455] = -9912840;
        iz.ansj[456] = -1515930542;
        iz.ansj[457] = -677999230;
        iz.ansj[458] = 478019868;
        iz.ansj[459] = -1212425784;
        iz.ansj[460] = -1467367881;
        iz.ansj[461] = 1054861191;
        iz.ansj[462] = -484638198;
        iz.ansj[463] = -1533544461;
        iz.ansj[464] = -502968490;
        iz.ansj[465] = -1028105087;
        iz.ansj[466] = 1103272869;
        iz.ansj[467] = 1142713024;
        iz.ansj[468] = -1093559273;
        iz.ansj[469] = -786115679;
        iz.ansj[470] = -692139836;
        iz.ansj[471] = 1964440749;
        iz.ansj[472] = 1699210285;
        iz.ansj[473] = 1720168675;
        iz.ansj[474] = 772996224;
        iz.ansj[475] = -1010095649;
        iz.ansj[476] = -1024121800;
        iz.ansj[477] = 1696861890;
        iz.ansj[478] = -1046605530;
        iz.ansj[479] = 2145054740;
        iz.ansj[480] = -1122698368;
        iz.ansj[481] = -1336693795;
        iz.ansj[482] = 1708879836;
        iz.ansj[483] = -1152135109;
        iz.ansj[484] = -2012745166;
        iz.ansj[485] = 779027153;
        iz.ansj[486] = 934314418;
        iz.ansj[487] = -1915216607;
        iz.ansj[488] = 1816918285;
        iz.ansj[489] = -2114976521;
        iz.ansj[490] = -1616186738;
        iz.ansj[491] = 2106621352;
        iz.ansj[492] = 1144113656;
        iz.ansj[493] = 1394707268;
        iz.ansj[494] = 939104216;
        iz.ansj[495] = 1667229280;
    }

    private static /* synthetic */ void aotb() {
        iz.ansk[200] = -379190614;
        iz.ansk[201] = -1342187099;
        iz.ansk[202] = 65874653;
        iz.ansk[203] = -363402019;
        iz.ansk[204] = -909072231;
        iz.ansk[205] = -1023292332;
        iz.ansk[206] = -334807259;
        iz.ansk[207] = 1427151032;
        iz.ansk[208] = 550976156;
        iz.ansk[209] = 1116351026;
        iz.ansk[210] = 1090246485;
        iz.ansk[211] = 1825111553;
        iz.ansk[212] = -657287068;
        iz.ansk[213] = 1131191071;
        iz.ansk[214] = 1064631466;
        iz.ansk[215] = 1807109434;
        iz.ansk[216] = 260723735;
        iz.ansk[217] = 19634828;
        iz.ansk[218] = 1919202048;
        iz.ansk[219] = -469827499;
        iz.ansk[220] = -1575077957;
        iz.ansk[221] = -294774007;
        iz.ansk[222] = -1972463904;
        iz.ansk[223] = 2145237607;
        iz.ansk[224] = -1992803109;
        iz.ansk[225] = 1576226587;
        iz.ansk[226] = 1335285692;
        iz.ansk[227] = 855043739;
        iz.ansk[228] = 1332992612;
        iz.ansk[229] = 1119464274;
        iz.ansk[230] = -1070853512;
        iz.ansk[231] = 1743618664;
        iz.ansk[232] = -1554920241;
        iz.ansk[233] = 332101019;
        iz.ansk[234] = -787099604;
        iz.ansk[235] = 1013112582;
        iz.ansk[236] = -1579303804;
        iz.ansk[237] = -2072742446;
        iz.ansk[238] = 969256232;
        iz.ansk[239] = 1868703261;
        iz.ansk[240] = 1503487613;
        iz.ansk[241] = -775316581;
        iz.ansk[242] = 224750648;
        iz.ansk[243] = -1174569537;
        iz.ansk[244] = 1958161194;
        iz.ansk[245] = 1269083506;
        iz.ansk[246] = -339969496;
        iz.ansk[247] = -1965054056;
        iz.ansk[248] = 1605904276;
        iz.ansk[249] = 918770943;
        iz.ansk[250] = 1659610506;
        iz.ansk[251] = -1425844380;
        iz.ansk[252] = 1849703620;
        iz.ansk[253] = -2133189458;
        iz.ansk[254] = -943321418;
        iz.ansk[255] = -18547552;
        iz.ansk[256] = -497243803;
        iz.ansk[257] = 593572479;
        iz.ansk[258] = -1317366767;
        iz.ansk[259] = 731575172;
        iz.ansk[260] = -1396696664;
        iz.ansk[261] = -1209400294;
        iz.ansk[262] = 1186021010;
        iz.ansk[263] = 1569411375;
        iz.ansk[264] = -1248767641;
        iz.ansk[265] = 908724262;
        iz.ansk[266] = 1249145474;
        iz.ansk[267] = 909492004;
        iz.ansk[268] = 1568134285;
        iz.ansk[269] = 970475738;
        iz.ansk[270] = -25827198;
        iz.ansk[271] = 586881525;
        iz.ansk[272] = 790639028;
        iz.ansk[273] = 2051048403;
        iz.ansk[274] = 1790685906;
        iz.ansk[275] = 657704765;
        iz.ansk[276] = -790113521;
        iz.ansk[277] = 1481110312;
        iz.ansk[278] = -658386225;
        iz.ansk[279] = -1014958382;
        iz.ansk[280] = -1225098871;
        iz.ansk[281] = -288549957;
        iz.ansk[282] = -2048843075;
        iz.ansk[283] = -632011973;
        iz.ansk[284] = -836123090;
        iz.ansk[285] = -703791919;
        iz.ansk[286] = -158033978;
        iz.ansk[287] = -1318296225;
        iz.ansk[288] = -378964534;
        iz.ansk[289] = -1840374555;
        iz.ansk[290] = 1715609667;
        iz.ansk[291] = -524488833;
        iz.ansk[292] = -1654574385;
        iz.ansk[293] = 1236889528;
        iz.ansk[294] = -1917017543;
        iz.ansk[295] = -1138605210;
        iz.ansk[296] = 19865979;
        iz.ansk[297] = 172523948;
        iz.ansk[298] = 705224229;
        iz.ansk[299] = -1650313250;
    }

    private static /* synthetic */ double aoju(int n2) {
        return Double.longBitsToDouble(antf[n2] ^ antg[n2]);
    }

    private static /* synthetic */ void aotf() {
        iz.antf[100] = -7290217997906796108L;
        iz.antf[101] = -2766092571600891738L;
        iz.antf[102] = 6507925353338086350L;
        iz.antf[103] = 4497497135288247043L;
        iz.antf[104] = -2132777960724945300L;
        iz.antf[105] = -1709578894953247565L;
        iz.antf[106] = 7662277161035510187L;
        iz.antf[107] = 5177657489663090961L;
        iz.antf[108] = -2446350597136346921L;
        iz.antf[109] = -9183997828168373740L;
        iz.antf[110] = 5926350341942763430L;
        iz.antf[111] = 8719961853560660709L;
        iz.antf[112] = 3138570249811353398L;
        iz.antf[113] = 5426048164140228458L;
        iz.antf[114] = 5581908346079491466L;
        iz.antf[115] = 4073275092617774917L;
        iz.antf[116] = 90395290879385147L;
        iz.antf[117] = -4847518314749560943L;
        iz.antf[118] = -5734253422579172969L;
        iz.antf[119] = 3079199122359277120L;
        iz.antf[120] = -7027300028960117710L;
        iz.antf[121] = -1818974546214435863L;
        iz.antf[122] = 4825717048037307330L;
        iz.antf[123] = 4972225112959584719L;
        iz.antf[124] = 575403928256345396L;
        iz.antf[125] = 1202729728181823647L;
        iz.antf[126] = -861463623465751359L;
        iz.antf[127] = 2259515381694713132L;
        iz.antf[128] = -6155200308818492875L;
        iz.antf[129] = 510104538335521144L;
        iz.antf[130] = -8831466759725959737L;
        iz.antf[131] = -470027957341156109L;
        iz.antf[132] = 8266545181483177869L;
        iz.antf[133] = 1176651865492805293L;
        iz.antf[134] = -200575921694726536L;
        iz.antf[135] = -4816104500399946722L;
        iz.antf[136] = -6894065571630855059L;
        iz.antf[137] = 6702843450501332961L;
        iz.antf[138] = 2659467507694775327L;
        iz.antf[139] = 5576915597428812629L;
        iz.antf[140] = -7963284531944930714L;
        iz.antf[141] = -8762558511002093691L;
        iz.antf[142] = 8261970871998401201L;
        iz.antf[143] = 6787843668343318909L;
        iz.antf[144] = 6473980260545725161L;
        iz.antf[145] = -5550331881601603231L;
        iz.antf[146] = -5938697491205912514L;
        iz.antf[147] = -8976972245076297716L;
        iz.antf[148] = 7060141715435325239L;
        iz.antf[149] = -4367585747592126757L;
        iz.antf[150] = 7614573544748713451L;
        iz.antf[151] = -5433765453874430312L;
        iz.antf[152] = 6262259712505565760L;
        iz.antf[153] = 2148135368076010847L;
        iz.antf[154] = -2641900900718985594L;
        iz.antf[155] = 2243892577390154794L;
        iz.antf[156] = 8444931633848292244L;
        iz.antf[157] = 3315203556155161594L;
        iz.antf[158] = 7245443456497887242L;
        iz.antf[159] = -5336788481162332885L;
        iz.antf[160] = -3290748544803727972L;
        iz.antf[161] = 1284563054478509592L;
        iz.antf[162] = -7099539580257772652L;
        iz.antf[163] = 5559486482089486927L;
        iz.antf[164] = 8895826117092192713L;
        iz.antf[165] = -6520734121909643092L;
        iz.antf[166] = -558535403437914176L;
        iz.antf[167] = 9203612346410125296L;
        iz.antf[168] = -8169847339186152807L;
        iz.antf[169] = 2577699825898565046L;
        iz.antf[170] = 3005424580158498856L;
        iz.antf[171] = -1074281935302873262L;
        iz.antf[172] = -9215611708780542678L;
        iz.antf[173] = 6220637774857236344L;
        iz.antf[174] = 5604765331366541028L;
        iz.antf[175] = -8527495774627482833L;
        iz.antf[176] = 7798444485280703005L;
        iz.antf[177] = 2183082274782331174L;
        iz.antf[178] = -6412838559716748243L;
        iz.antf[179] = -7005410948424181495L;
        iz.antf[180] = -777752818383305777L;
        iz.antf[181] = 37213694404939573L;
        iz.antf[182] = 3940551010966779453L;
    }

    private static /* synthetic */ int ansp(int n2) {
        return ansj[n2] ^ ansk[n2];
    }

    private static /* synthetic */ void aosu() {
        iz.ansj[0] = -896046909;
        iz.ansj[1] = -727777221;
        iz.ansj[2] = 1718531184;
        iz.ansj[3] = 622142889;
        iz.ansj[4] = 1800552713;
        iz.ansj[5] = -766214749;
        iz.ansj[6] = -1873736472;
        iz.ansj[7] = -290455828;
        iz.ansj[8] = -712108214;
        iz.ansj[9] = -632126642;
        iz.ansj[10] = 1285544447;
        iz.ansj[11] = -1096047108;
        iz.ansj[12] = 1678057296;
        iz.ansj[13] = -1072329837;
        iz.ansj[14] = -1093191558;
        iz.ansj[15] = 417002393;
        iz.ansj[16] = 1820291904;
        iz.ansj[17] = -1709074404;
        iz.ansj[18] = 699877127;
        iz.ansj[19] = -420788703;
        iz.ansj[20] = -142551031;
        iz.ansj[21] = 1258866474;
        iz.ansj[22] = -1883637356;
        iz.ansj[23] = 1283532296;
        iz.ansj[24] = 602355330;
        iz.ansj[25] = 2006337033;
        iz.ansj[26] = -1997797029;
        iz.ansj[27] = 1002234132;
        iz.ansj[28] = -178307412;
        iz.ansj[29] = 2076699257;
        iz.ansj[30] = 1169039015;
        iz.ansj[31] = -2040486262;
        iz.ansj[32] = -1569017636;
        iz.ansj[33] = 1822491344;
        iz.ansj[34] = 1196076116;
        iz.ansj[35] = 107941000;
        iz.ansj[36] = 965572182;
        iz.ansj[37] = -72004936;
        iz.ansj[38] = 432312694;
        iz.ansj[39] = -1908789502;
        iz.ansj[40] = 1585981115;
        iz.ansj[41] = -475821272;
        iz.ansj[42] = 393811374;
        iz.ansj[43] = 1397175426;
        iz.ansj[44] = 2136624238;
        iz.ansj[45] = -62541913;
        iz.ansj[46] = 41665888;
        iz.ansj[47] = 1609057213;
        iz.ansj[48] = -537780195;
        iz.ansj[49] = 1676256818;
        iz.ansj[50] = 1401370541;
        iz.ansj[51] = 1049397964;
        iz.ansj[52] = 31942562;
        iz.ansj[53] = -65113031;
        iz.ansj[54] = 418870203;
        iz.ansj[55] = -1071823877;
        iz.ansj[56] = 1729838210;
        iz.ansj[57] = -1002092899;
        iz.ansj[58] = -1704185607;
        iz.ansj[59] = -440509654;
        iz.ansj[60] = -504844266;
        iz.ansj[61] = -2081875520;
        iz.ansj[62] = 967836986;
        iz.ansj[63] = 483072895;
        iz.ansj[64] = -695456225;
        iz.ansj[65] = -726445657;
        iz.ansj[66] = -84992675;
        iz.ansj[67] = -107391410;
        iz.ansj[68] = 1045059100;
        iz.ansj[69] = -7782903;
        iz.ansj[70] = -243106955;
        iz.ansj[71] = 524966759;
        iz.ansj[72] = -794063512;
        iz.ansj[73] = -1771298103;
        iz.ansj[74] = 1923856815;
        iz.ansj[75] = -1536199968;
        iz.ansj[76] = -642648095;
        iz.ansj[77] = -1137011922;
        iz.ansj[78] = -623272885;
        iz.ansj[79] = -1905340388;
        iz.ansj[80] = 438678157;
        iz.ansj[81] = -32819729;
        iz.ansj[82] = -1395788609;
        iz.ansj[83] = 2062626408;
        iz.ansj[84] = 1785560373;
        iz.ansj[85] = -1664726943;
        iz.ansj[86] = -796814100;
        iz.ansj[87] = -1099985555;
        iz.ansj[88] = 1730686300;
        iz.ansj[89] = -635145579;
        iz.ansj[90] = -1305780495;
        iz.ansj[91] = 1417396368;
        iz.ansj[92] = -2095212718;
        iz.ansj[93] = -812728436;
        iz.ansj[94] = 882617983;
        iz.ansj[95] = 550881057;
        iz.ansj[96] = -1436300173;
        iz.ansj[97] = 549768833;
        iz.ansj[98] = -1787976759;
        iz.ansj[99] = -1962205923;
    }

    private static /* synthetic */ void aota() {
        iz.ansk[100] = -1996500564;
        iz.ansk[101] = 1827378178;
        iz.ansk[102] = 161747642;
        iz.ansk[103] = 1081900388;
        iz.ansk[104] = 1108817829;
        iz.ansk[105] = 939014342;
        iz.ansk[106] = -2040522508;
        iz.ansk[107] = 1702479428;
        iz.ansk[108] = 1202870548;
        iz.ansk[109] = 1509453714;
        iz.ansk[110] = 1430068113;
        iz.ansk[111] = 326895121;
        iz.ansk[112] = -1290480449;
        iz.ansk[113] = -515340229;
        iz.ansk[114] = 746880176;
        iz.ansk[115] = -1937686230;
        iz.ansk[116] = -1266688750;
        iz.ansk[117] = 1098932720;
        iz.ansk[118] = 318066211;
        iz.ansk[119] = 1171354625;
        iz.ansk[120] = -380094793;
        iz.ansk[121] = 1208594843;
        iz.ansk[122] = -1489278580;
        iz.ansk[123] = 1892897360;
        iz.ansk[124] = -654465890;
        iz.ansk[125] = -1701172116;
        iz.ansk[126] = -1354243887;
        iz.ansk[127] = -1628557657;
        iz.ansk[128] = -1085841716;
        iz.ansk[129] = -2091117549;
        iz.ansk[130] = 270285087;
        iz.ansk[131] = 1542725168;
        iz.ansk[132] = -1578808389;
        iz.ansk[133] = -1268655276;
        iz.ansk[134] = 1617576675;
        iz.ansk[135] = -2028784998;
        iz.ansk[136] = 242006522;
        iz.ansk[137] = -603996297;
        iz.ansk[138] = 578702908;
        iz.ansk[139] = -1439893847;
        iz.ansk[140] = -364564633;
        iz.ansk[141] = 39770009;
        iz.ansk[142] = -698455842;
        iz.ansk[143] = 1198159988;
        iz.ansk[144] = -1820006448;
        iz.ansk[145] = -1739171717;
        iz.ansk[146] = -559106211;
        iz.ansk[147] = -327195813;
        iz.ansk[148] = -490464803;
        iz.ansk[149] = 1215611286;
        iz.ansk[150] = -1501585749;
        iz.ansk[151] = 1271285617;
        iz.ansk[152] = -623607329;
        iz.ansk[153] = -18411721;
        iz.ansk[154] = -1991632841;
        iz.ansk[155] = -1782247549;
        iz.ansk[156] = -182739104;
        iz.ansk[157] = 777955966;
        iz.ansk[158] = 858156532;
        iz.ansk[159] = -1734664286;
        iz.ansk[160] = 906259115;
        iz.ansk[161] = 1860395446;
        iz.ansk[162] = 1112870427;
        iz.ansk[163] = -1636772529;
        iz.ansk[164] = 1123462035;
        iz.ansk[165] = -1638506838;
        iz.ansk[166] = 1120241100;
        iz.ansk[167] = -1702149494;
        iz.ansk[168] = 795248113;
        iz.ansk[169] = 124295131;
        iz.ansk[170] = 323779147;
        iz.ansk[171] = 1697100289;
        iz.ansk[172] = 530342721;
        iz.ansk[173] = 1716343159;
        iz.ansk[174] = -783984208;
        iz.ansk[175] = -481265508;
        iz.ansk[176] = 681093129;
        iz.ansk[177] = 1730375214;
        iz.ansk[178] = 1048783587;
        iz.ansk[179] = 1361765465;
        iz.ansk[180] = 1863826484;
        iz.ansk[181] = -995144632;
        iz.ansk[182] = 488719500;
        iz.ansk[183] = 2114449808;
        iz.ansk[184] = 498352137;
        iz.ansk[185] = -693674503;
        iz.ansk[186] = -596926247;
        iz.ansk[187] = 1463946600;
        iz.ansk[188] = -1661530229;
        iz.ansk[189] = -1413385480;
        iz.ansk[190] = -854447747;
        iz.ansk[191] = -1005581429;
        iz.ansk[192] = 1322883106;
        iz.ansk[193] = 609388370;
        iz.ansk[194] = -1904852997;
        iz.ansk[195] = 1856324381;
        iz.ansk[196] = 1415931002;
        iz.ansk[197] = 488385402;
        iz.ansk[198] = 504497699;
        iz.ansk[199] = 1879181033;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static iz getInstance() {
        v0 /* !! */  = iz.cf;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - iz.ansl("anth", ante(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1982509129: {
                    break block17;
                }
                case -668233106: {
                    v1 = iz.ansl("anti", ante(int ), (int)1);
                    continue block17;
                }
                case 737473858: {
                    v1 = iz.ansl("antj", ante(int ), (int)2);
                    continue block17;
                }
            }
            break;
        }
        var2 = iz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("antk", ante(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iz.ansl("antl", ansp(int ), (int)17)) break;
            v2 /* !! */  = (long)iz.ansl("antm", ansp(int ), (int)18);
        }
        var1_1 /* !! */  = iz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("antn", ante(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == iz.ansl("anto", ansp(int ), (int)19)) break;
            v3 /* !! */  = (long)iz.ansl("antp", ansp(int ), (int)20);
        }
        var0_2 = iz.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = iz.cf;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - iz.ansl("antq", ante(int ), (int)5));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1982509129: {
                            break block21;
                        }
                        case -676614373: {
                            v5 = iz.ansl("antr", ante(int ), (int)6);
                            continue block21;
                        }
                        case -666366474: {
                            v5 = iz.ansl("ants", ante(int ), (int)7);
                            continue block21;
                        }
                        case 1703519559: {
                            v5 = iz.ansl("antt", ante(int ), (int)8);
                            continue block21;
                        }
                    }
                    break;
                }
                return nj.get(iz.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)iz.ansl("antu", ansp(int ), (int)21);
                if (var2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)iz.ansl("antv", ansp(int ), (int)22);
                    if (!var2) break block5;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)iz.ansl("antw", ansp(int ), (int)23);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)iz.ansl("antx", ansp(int ), (int)24);
        ** while (!var2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aosw() {
        iz.ansj[200] = -379190631;
        iz.ansj[201] = -1342187132;
        iz.ansj[202] = 65874659;
        iz.ansj[203] = -363402025;
        iz.ansj[204] = -909072230;
        iz.ansj[205] = -1023292331;
        iz.ansj[206] = -334807237;
        iz.ansj[207] = 1427150985;
        iz.ansj[208] = 550976128;
        iz.ansj[209] = 1116350984;
        iz.ansj[210] = 1090246469;
        iz.ansj[211] = 1825111591;
        iz.ansj[212] = -657287058;
        iz.ansj[213] = 1131191049;
        iz.ansj[214] = 1064631447;
        iz.ansj[215] = 1807109400;
        iz.ansj[216] = 260723739;
        iz.ansj[217] = 19634861;
        iz.ansj[218] = 1919202093;
        iz.ansj[219] = -469827512;
        iz.ansj[220] = -1575077999;
        iz.ansj[221] = -294773999;
        iz.ansj[222] = -1972463882;
        iz.ansj[223] = 2145237543;
        iz.ansj[224] = -1992803102;
        iz.ansj[225] = 1576226590;
        iz.ansj[226] = 1335285641;
        iz.ansj[227] = 855043741;
        iz.ansj[228] = 1332992637;
        iz.ansj[229] = 1119464256;
        iz.ansj[230] = -1070853571;
        iz.ansj[231] = 1743618678;
        iz.ansj[232] = -1554920220;
        iz.ansj[233] = 332101011;
        iz.ansj[234] = -787099646;
        iz.ansj[235] = 1013112645;
        iz.ansj[236] = -1579303790;
        iz.ansj[237] = -2072742408;
        iz.ansj[238] = 969256221;
        iz.ansj[239] = 1868703243;
        iz.ansj[240] = 1503487582;
        iz.ansj[241] = -775316559;
        iz.ansj[242] = 224750617;
        iz.ansj[243] = -1174569553;
        iz.ansj[244] = 1958161165;
        iz.ansj[245] = 1269083478;
        iz.ansj[246] = -339969493;
        iz.ansj[247] = -1965054041;
        iz.ansj[248] = 1605904316;
        iz.ansj[249] = 918770885;
        iz.ansj[250] = 1659610517;
        iz.ansj[251] = -1425844401;
        iz.ansj[252] = 1849703677;
        iz.ansj[253] = -2133189454;
        iz.ansj[254] = -943321454;
        iz.ansj[255] = -18547558;
        iz.ansj[256] = -497243816;
        iz.ansj[257] = 593572443;
        iz.ansj[258] = -1317366752;
        iz.ansj[259] = 731575223;
        iz.ansj[260] = -1396696670;
        iz.ansj[261] = -1209400231;
        iz.ansj[262] = 1186021046;
        iz.ansj[263] = 1569411360;
        iz.ansj[264] = -1248767640;
        iz.ansj[265] = 908724279;
        iz.ansj[266] = 1249145485;
        iz.ansj[267] = 909491990;
        iz.ansj[268] = 1568134318;
        iz.ansj[269] = 970475712;
        iz.ansj[270] = -25827174;
        iz.ansj[271] = 586881529;
        iz.ansj[272] = 790639009;
        iz.ansj[273] = 2051048435;
        iz.ansj[274] = 1790685901;
        iz.ansj[275] = 657704754;
        iz.ansj[276] = -790113496;
        iz.ansj[277] = 1481110307;
        iz.ansj[278] = -658386196;
        iz.ansj[279] = -1014958373;
        iz.ansj[280] = -1225098839;
        iz.ansj[281] = -288550012;
        iz.ansj[282] = -2048843114;
        iz.ansj[283] = -632012006;
        iz.ansj[284] = -836123129;
        iz.ansj[285] = -703791927;
        iz.ansj[286] = -158033942;
        iz.ansj[287] = -1318296240;
        iz.ansj[288] = -378964519;
        iz.ansj[289] = -1840374538;
        iz.ansj[290] = 1715609702;
        iz.ansj[291] = -524488836;
        iz.ansj[292] = -1654574396;
        iz.ansj[293] = 1236889498;
        iz.ansj[294] = -1917017596;
        iz.ansj[295] = -1138605213;
        iz.ansj[296] = 19865983;
        iz.ansj[297] = 172523946;
        iz.ansj[298] = 705224203;
        iz.ansj[299] = -1650313269;
    }

    private static /* synthetic */ long ante(int n2) {
        return antf[n2] ^ antg[n2];
    }

    static {
        ansj = new int[496];
        ansk = new int[496];
        iz.aosu();
        iz.aosv();
        iz.aosw();
        iz.aosx();
        iz.aosy();
        iz.aosz();
        iz.aota();
        iz.aotb();
        iz.aotc();
        iz.aotd();
        antf = new long[183];
        antg = new long[183];
        iz.aote();
        iz.aotf();
        iz.aotg();
        iz.aoth();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanChunk(class_2818 var1_1, class_2338 var2_2, int var3_3) {
        var22_4 = iz.c;
        var21_5 /* !! */  = iz.b;
        var20_6 = iz.a;
        if (var22_4) {
            throw null;
lbl6:
            // 36 sources

            return;
        }
        if (var20_6 || var20_6) ** GOTO lbl6
        var4_7 = var1_1.method_12004().method_8326();
        if (var20_6 || var20_6) ** GOTO lbl6
        var5_8 = var1_1.method_12004().method_8328();
        if (var20_6 || var20_6) ** GOTO lbl6
        var6_9 = Math.max(iz.mc.field_1687.method_31607(), var2_2.method_10264() - var3_3);
        if (var20_6 || var20_6) ** GOTO lbl6
        var7_10 = Math.min(iz.mc.field_1687.method_31600(), var2_2.method_10264() + var3_3);
        if (var20_6 || var20_6) ** GOTO lbl6
        var8_11 = var3_3 * var3_3;
        if (var20_6 || var20_6) ** GOTO lbl6
        var9_12 = new class_2338.class_2339();
        if (var20_6 || var20_6) ** GOTO lbl6
        var10_13 = var4_7;
        if (var20_6) ** GOTO lbl6
        block70: while (true) {
            if (var20_6 || var20_6) ** GOTO lbl6
            if (var10_13 > var4_7 + iz.ansl("aogd", ansp(int ), (int)263)) ** GOTO lbl88
            if (var20_6 || var20_6) ** GOTO lbl6
            var11_14 = var5_8;
            if (var20_6) ** GOTO lbl6
            block71: while (true) {
                block138: {
                    if (var20_6 || var20_6) ** GOTO lbl6
                    if (var11_14 > var5_8 + iz.ansl("aoge", ansp(int ), (int)264)) ** GOTO lbl83
                    if (var20_6 || var20_6) ** GOTO lbl6
                    var12_15 = var10_13 - var2_2.method_10263();
                    if (var20_6 || var20_6) ** GOTO lbl6
                    var13_16 = var11_14 - var2_2.method_10260();
                    if (var20_6 || var20_6) ** GOTO lbl6
                    var14_17 = var12_15 * var12_15 + var13_16 * var13_16;
                    if (var20_6 || var20_6) ** GOTO lbl6
                    if (var14_17 <= var8_11) break block138;
                    if (var20_6) ** GOTO lbl6
                    if (var22_4) {
                        throw null;
                    }
                    ** GOTO lbl78
                }
                if (var20_6 || var20_6) ** GOTO lbl6
                var15_18 = (int)Math.sqrt(var8_11 - var14_17);
                if (var20_6 || var20_6) ** GOTO lbl6
                var16_19 = Math.max(var6_9, var2_2.method_10264() - var15_18);
                if (var20_6 || var20_6) ** GOTO lbl6
                var17_20 = Math.min(var7_10, var2_2.method_10264() + var15_18);
                if (var20_6 || var20_6) ** GOTO lbl6
                if (var21_5 /* !! */  == 0) ** GOTO lbl-1000
                switch (var21_5 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var18_21 = var16_19;
                        if (var20_6) ** GOTO lbl6
                        do {
                            if (var20_6 || var20_6) ** GOTO lbl6
                            if (var18_21 > var17_20) ** GOTO lbl78
                            if (var20_6 || var20_6) ** GOTO lbl6
                            var9_12.method_10103(var10_13, var18_21, var11_14);
                            if (var20_6 || var20_6) ** GOTO lbl6
                            var19_22 = var1_1.method_8320((class_2338)var9_12);
                            if (var20_6 || var20_6) ** GOTO lbl6
                            if (var19_22.method_26215()) ** GOTO lbl73
                            if (var20_6) ** GOTO lbl6
                            if (!this.trackedBlockTypes.contains(var19_22.method_26204())) ** GOTO lbl73
                            if (var20_6 || var20_6) ** GOTO lbl6
                            this.foundBlocks.add(var9_12.method_10062());
                            if (var20_6) ** GOTO lbl6
lbl73:
                            // 3 sources

                            if (var20_6 || var20_6) ** GOTO lbl6
                            ++var18_21;
                            if (var20_6) ** GOTO lbl6
                        } while (!var22_4);
                        throw null;
lbl78:
                        // 2 sources

                        if (var20_6 || var20_6) ** GOTO lbl6
                        ++var11_14;
                        if (var20_6) ** GOTO lbl6
                        if (!var22_4) continue block71;
                        throw null;
                    }
lbl83:
                    // 1 sources

                    if (var20_6 || var20_6) ** GOTO lbl6
                    ++var10_13;
                    if (var20_6) ** GOTO lbl6
                    if (!var22_4) continue block70;
                    throw null;
lbl88:
                    // 1 sources

                    if (!var20_6 && !var20_6) ** break;
                    ** continue;
                    return;
                    case 0: {
                        var21_5 /* !! */  = (int)iz.ansl("aogf", ansp(int ), (int)265);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl205
                    }
                    case 1: {
                        var21_5 /* !! */  = (int)iz.ansl("aogg", ansp(int ), (int)266);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl126
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var21_5 /* !! */  = (int)iz.ansl("aogh", ansp(int ), (int)267);
                            if (var22_4) {
                                throw null;
                            }
                            ** GOTO lbl228
                            break;
                        }
                    }
                    case 3: {
                        var21_5 /* !! */  = (int)iz.ansl("aogi", ansp(int ), (int)268);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl180
                    }
                    case 4: {
                        var21_5 /* !! */  = (int)iz.ansl("aogj", ansp(int ), (int)269);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl224
                    }
                    case 5: {
                        var21_5 /* !! */  = (int)iz.ansl("aogk", ansp(int ), (int)270);
                        if (!var22_4) break block70;
                        throw null;
                    }
                    case 6: {
                        var21_5 /* !! */  = (int)iz.ansl("aogl", ansp(int ), (int)271);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl243
                    }
lbl126:
                    // 4 sources

                    case 7: {
                        var21_5 /* !! */  = (int)iz.ansl("aogm", ansp(int ), (int)272);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl372
                    }
                    case 8: {
                        var21_5 /* !! */  = (int)iz.ansl("aogn", ansp(int ), (int)273);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl317
                    }
lbl136:
                    // 2 sources

                    case 9: {
                        var21_5 /* !! */  = (int)iz.ansl("aogo", ansp(int ), (int)274);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl338
                    }
                    case 10: {
                        var21_5 /* !! */  = (int)iz.ansl("aogp", ansp(int ), (int)275);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl355
                    }
                    case 11: {
                        var21_5 /* !! */  = (int)iz.ansl("aogq", ansp(int ), (int)276);
                        if (var22_4) {
                            throw null;
                        }
                    }
lbl150:
                    // 4 sources

                    case 12: {
                        var21_5 /* !! */  = (int)iz.ansl("aogr", ansp(int ), (int)277);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl294
                    }
                    case 13: {
                        var21_5 /* !! */  = (int)iz.ansl("aogs", ansp(int ), (int)278);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl299
                    }
lbl160:
                    // 2 sources

                    case 14: {
                        var21_5 /* !! */  = (int)iz.ansl("aogt", ansp(int ), (int)279);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl205
                    }
                    case 15: {
                        var21_5 /* !! */  = (int)iz.ansl("aogu", ansp(int ), (int)280);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl276
                    }
lbl170:
                    // 2 sources

                    case 16: {
                        var21_5 /* !! */  = (int)iz.ansl("aogv", ansp(int ), (int)281);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl303
                    }
                    case 17: {
                        var21_5 /* !! */  = (int)iz.ansl("aogw", ansp(int ), (int)282);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl312
                    }
lbl180:
                    // 2 sources

                    case 18: {
                        var21_5 /* !! */  = (int)iz.ansl("aogx", ansp(int ), (int)283);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl355
                    }
lbl185:
                    // 3 sources

                    case 19: {
                        var21_5 /* !! */  = (int)iz.ansl("aogy", ansp(int ), (int)284);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl325
                    }
                    case 20: {
                        do {
                            var21_5 /* !! */  = (int)iz.ansl("aogz", ansp(int ), (int)285);
                        } while (!var22_4);
                        throw null;
                    }
lbl195:
                    // 2 sources

                    case 21: {
                        var21_5 /* !! */  = (int)iz.ansl("aoha", ansp(int ), (int)286);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl280
                    }
                    case 22: {
                        var21_5 /* !! */  = (int)iz.ansl("aohb", ansp(int ), (int)287);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl330
                    }
lbl205:
                    // 3 sources

                    case 23: {
                        var21_5 /* !! */  = (int)iz.ansl("aohc", ansp(int ), (int)288);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl388
                    }
                    case 24: {
                        var21_5 /* !! */  = (int)iz.ansl("aohd", ansp(int ), (int)289);
                        if (!var22_4) ** GOTO lbl126
                        throw null;
                    }
lbl214:
                    // 2 sources

                    case 25: {
                        var21_5 /* !! */  = (int)iz.ansl("aohe", ansp(int ), (int)290);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl284
                    }
                    case 26: {
                        var21_5 /* !! */  = (int)iz.ansl("aohf", ansp(int ), (int)291);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl252
                    }
lbl224:
                    // 2 sources

                    case 27: {
                        var21_5 /* !! */  = (int)iz.ansl("aohg", ansp(int ), (int)292);
                        if (!var22_4) ** GOTO lbl136
                        throw null;
                    }
lbl228:
                    // 2 sources

                    case 28: {
                        var21_5 /* !! */  = (int)iz.ansl("aohh", ansp(int ), (int)293);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl276
                    }
                    case 29: {
                        var21_5 /* !! */  = (int)iz.ansl("aohi", ansp(int ), (int)294);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl280
                    }
lbl238:
                    // 2 sources

                    case 30: {
                        var21_5 /* !! */  = (int)iz.ansl("aohj", ansp(int ), (int)295);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl257
                    }
lbl243:
                    // 2 sources

                    case 31: {
                        var21_5 /* !! */  = (int)iz.ansl("aohk", ansp(int ), (int)296);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl372
                    }
lbl248:
                    // 2 sources

                    case 32: {
                        var21_5 /* !! */  = (int)iz.ansl("aohl", ansp(int ), (int)297);
                        if (var22_4) {
                            throw null;
                        }
                    }
lbl252:
                    // 4 sources

                    case 33: {
                        var21_5 /* !! */  = (int)iz.ansl("aohm", ansp(int ), (int)298);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl267
                    }
lbl257:
                    // 2 sources

                    case 34: {
                        var21_5 /* !! */  = (int)iz.ansl("aohn", ansp(int ), (int)299);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl334
                    }
lbl262:
                    // 2 sources

                    case 35: {
                        var21_5 /* !! */  = (int)iz.ansl("aoho", ansp(int ), (int)300);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl384
                    }
lbl267:
                    // 4 sources

                    case 36: {
                        var21_5 /* !! */  = (int)iz.ansl("aohp", ansp(int ), (int)301);
                        if (!var22_4) ** GOTO lbl238
                        throw null;
                    }
lbl271:
                    // 2 sources

                    case 37: {
                        var21_5 /* !! */  = (int)iz.ansl("aohq", ansp(int ), (int)302);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl388
                    }
lbl276:
                    // 3 sources

                    case 38: {
                        var21_5 /* !! */  = (int)iz.ansl("aohr", ansp(int ), (int)303);
                        if (!var22_4) ** GOTO lbl150
                        throw null;
                    }
lbl280:
                    // 3 sources

                    case 39: {
                        var21_5 /* !! */  = (int)iz.ansl("aohs", ansp(int ), (int)304);
                        if (!var22_4) ** GOTO lbl267
                        throw null;
                    }
lbl284:
                    // 2 sources

                    case 40: {
                        var21_5 /* !! */  = (int)iz.ansl("aoht", ansp(int ), (int)305);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl392
                    }
                    case 41: {
                        var21_5 /* !! */  = (int)iz.ansl("aohu", ansp(int ), (int)306);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl392
                    }
lbl294:
                    // 3 sources

                    case 42: {
                        var21_5 /* !! */  = (int)iz.ansl("aohv", ansp(int ), (int)307);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl321
                    }
lbl299:
                    // 3 sources

                    case 43: {
                        var21_5 /* !! */  = (int)iz.ansl("aohw", ansp(int ), (int)308);
                        if (!var22_4) ** GOTO lbl126
                        throw null;
                    }
lbl303:
                    // 3 sources

                    case 44: {
                        var21_5 /* !! */  = (int)iz.ansl("aohx", ansp(int ), (int)309);
                        if (!var22_4) ** GOTO lbl185
                        throw null;
                    }
                    case 45: {
                        var21_5 /* !! */  = (int)iz.ansl("aohy", ansp(int ), (int)310);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl334
                    }
lbl312:
                    // 2 sources

                    case 46: {
                        var21_5 /* !! */  = (int)iz.ansl("aohz", ansp(int ), (int)311);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl388
                    }
lbl317:
                    // 2 sources

                    case 47: {
                        var21_5 /* !! */  = (int)iz.ansl("aoia", ansp(int ), (int)312);
                        if (!var22_4) ** GOTO lbl267
                        throw null;
                    }
lbl321:
                    // 2 sources

                    case 48: {
                        var21_5 /* !! */  = (int)iz.ansl("aoib", ansp(int ), (int)313);
                        if (!var22_4) ** GOTO lbl299
                        throw null;
                    }
lbl325:
                    // 2 sources

                    case 49: {
                        var21_5 /* !! */  = (int)iz.ansl("aoic", ansp(int ), (int)314);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl376
                    }
lbl330:
                    // 3 sources

                    case 50: {
                        var21_5 /* !! */  = (int)iz.ansl("aoid", ansp(int ), (int)315);
                        if (var22_4) {
                            throw null;
                        }
                    }
lbl334:
                    // 5 sources

                    case 51: {
                        var21_5 /* !! */  = (int)iz.ansl("aoie", ansp(int ), (int)316);
                        if (!var22_4) ** GOTO lbl330
                        throw null;
                    }
lbl338:
                    // 2 sources

                    case 52: {
                        var21_5 /* !! */  = (int)iz.ansl("aoif", ansp(int ), (int)317);
                        if (!var22_4) ** GOTO lbl160
                        throw null;
                    }
lbl342:
                    // 2 sources

                    case 53: {
                        var21_5 /* !! */  = (int)iz.ansl("aoig", ansp(int ), (int)318);
                        if (!var22_4) ** GOTO lbl170
                        throw null;
                    }
                    case 54: {
                        var21_5 /* !! */  = (int)iz.ansl("aoih", ansp(int ), (int)319);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl388
                    }
                    case 55: {
                        var21_5 /* !! */  = (int)iz.ansl("aoii", ansp(int ), (int)320);
                        if (!var22_4) ** GOTO lbl303
                        throw null;
                    }
lbl355:
                    // 3 sources

                    case 56: {
                        var21_5 /* !! */  = (int)iz.ansl("aoij", ansp(int ), (int)321);
                        if (!var22_4) ** GOTO lbl248
                        throw null;
                    }
                    case 57: {
                        var21_5 /* !! */  = (int)iz.ansl("aoik", ansp(int ), (int)322);
                        if (!var22_4) ** GOTO lbl262
                        throw null;
                    }
lbl363:
                    // 2 sources

                    case 58: {
                        var21_5 /* !! */  = (int)iz.ansl("aoil", ansp(int ), (int)323);
                        if (var22_4) {
                            throw null;
                        }
                        ** GOTO lbl380
                    }
                    case 59: {
                        var21_5 /* !! */  = (int)iz.ansl("aoim", ansp(int ), (int)324);
                        if (!var22_4) ** GOTO lbl363
                        throw null;
                    }
lbl372:
                    // 3 sources

                    case 60: {
                        var21_5 /* !! */  = (int)iz.ansl("aoin", ansp(int ), (int)325);
                        if (!var22_4) ** GOTO lbl214
                        throw null;
                    }
lbl376:
                    // 2 sources

                    case 61: {
                        var21_5 /* !! */  = (int)iz.ansl("aoio", ansp(int ), (int)326);
                        if (!var22_4) ** GOTO lbl271
                        throw null;
                    }
lbl380:
                    // 2 sources

                    case 62: {
                        var21_5 /* !! */  = (int)iz.ansl("aoip", ansp(int ), (int)327);
                        if (!var22_4) ** GOTO lbl342
                        throw null;
                    }
lbl384:
                    // 2 sources

                    case 63: {
                        var21_5 /* !! */  = (int)iz.ansl("aoiq", ansp(int ), (int)328);
                        if (!var22_4) ** GOTO lbl294
                        throw null;
                    }
lbl388:
                    // 5 sources

                    case 64: {
                        var21_5 /* !! */  = (int)iz.ansl("aoir", ansp(int ), (int)329);
                        if (!var22_4) ** GOTO lbl195
                        throw null;
                    }
lbl392:
                    // 3 sources

                    case 65: {
                        var21_5 /* !! */  = (int)iz.ansl("aois", ansp(int ), (int)330);
                        if (!var22_4) ** GOTO lbl185
                        throw null;
                    }
                    case 66: 
                }
                break;
            }
            break;
        }
        var21_5 /* !! */  = (int)iz.ansl("aoit", ansp(int ), (int)331);
        ** while (!var22_4)
lbl399:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ int lambda$scanNearbyBlocks$0(int var1_1, int var2_2, class_1923 var3_3, class_1923 var4_4) {
        v0 /* !! */  = iz.cf;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - iz.ansl("aorv", ante(int ), (int)169));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1982509129: {
                    break block17;
                }
                case -1471448191: {
                    v1 = iz.ansl("aorw", ante(int ), (int)170);
                    continue block17;
                }
                case -972208064: {
                    v1 = iz.ansl("aorx", ante(int ), (int)171);
                    continue block17;
                }
                case 120750835: {
                    v1 = iz.ansl("aory", ante(int ), (int)172);
                    continue block17;
                }
            }
            break;
        }
        var7_5 = iz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aorz", ante(int ), (int)173)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iz.ansl("aosa", ansp(int ), (int)485)) break;
            v2 /* !! */  = (long)iz.ansl("aosb", ansp(int ), (int)486);
        }
        var6_6 = iz.b;
        v3 /* !! */  = iz.cf;
        if (true) ** GOTO lbl28
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - iz.ansl("aosc", ante(int ), (int)174));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1982509129: {
                    break block19;
                }
                case 624057233: {
                    v4 = iz.ansl("aosd", ante(int ), (int)175);
                    continue block19;
                }
                case 652651050: {
                    v4 = iz.ansl("aose", ante(int ), (int)176);
                    continue block19;
                }
                case 1851831178: {
                    v4 = iz.ansl("aosf", ante(int ), (int)177);
                    continue block19;
                }
            }
            break;
        }
        var5_7 = iz.a;
        if (var7_5) {
            throw null;
lbl43:
            // 1 sources

            return (int)iz.ansl("aosg", ansp(int ), (int)487);
        }
        ** while (var5_7 || var5_7)
lbl46:
        // 1 sources

        v5 /* !! */  = iz.cf;
        if (true) ** GOTO lbl50
        block21: while (true) {
            v5 /* !! */  = (long)(v6 - iz.ansl("aosh", ante(int ), (int)178));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2039166054: {
                    v6 = iz.ansl("aosi", ante(int ), (int)179);
                    continue block21;
                }
                case -1982509129: {
                    break block21;
                }
                case -1658701966: {
                    v6 = iz.ansl("aosj", ante(int ), (int)180);
                    continue block21;
                }
            }
            break;
        }
        v7 = this.chunkDistanceSq(var3_3, var1_1, var2_2);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aosk", ante(int ), (int)181)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == iz.ansl("aosl", ansp(int ), (int)488)) break;
            v8 /* !! */  = (long)iz.ansl("aosm", ansp(int ), (int)489);
        }
        v9 = this.chunkDistanceSq(var4_4, var1_1, var2_2);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aosn", ante(int ), (int)182)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == iz.ansl("aoso", ansp(int ), (int)490)) break;
            v10 /* !! */  = (long)iz.ansl("aosp", ansp(int ), (int)491);
        }
        return Long.compare(v7, v9);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanupInvalidAndDistantBlocks(class_243 var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aoiu", ante(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == iz.ansl("aoiv", ansp(int ), (int)332)) break;
            v0 /* !! */  = (long)iz.ansl("aoiw", ansp(int ), (int)333);
        }
        var6_3 = iz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aoix", ante(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == iz.ansl("aoiy", ansp(int ), (int)334)) break;
            v1 /* !! */  = (long)iz.ansl("aoiz", ansp(int ), (int)335);
        }
        var5_4 /* !! */  = iz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aoja", ante(int ), (int)90)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iz.ansl("aojb", ansp(int ), (int)336)) break;
            v2 /* !! */  = (long)iz.ansl("aojc", ansp(int ), (int)337);
        }
        var4_5 = iz.a;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) {
                    throw null;
lbl24:
                    // 3 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl24
                var3_6 = var2_2 * var2_2;
                if (var4_5 || var4_5) ** GOTO lbl24
                v3 /* !! */  = iz.cf;
                if (true) ** GOTO lbl33
                block22: while (true) {
                    v3 /* !! */  = (long)(iz.ansl("aoje", ante(int ), (int)92) - iz.ansl("aojd", ante(int ), (int)91));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2122497878: {
                            continue block22;
                        }
                        case -1982509129: {
                            break block22;
                        }
                    }
                    break;
                }
                v4 /* !! */  = iz.cf;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v4 /* !! */  = (long)(iz.ansl("aojg", ante(int ), (int)94) - iz.ansl("aojf", ante(int ), (int)93));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1982509129: {
                            break block23;
                        }
                        case 1097128990: {
                            continue block23;
                        }
                    }
                    break;
                }
                v5 = (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$cleanupInvalidAndDistantBlocks$1(net.minecraft.class_243 int net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)((iz)this, (class_243)var1_1, (int)var3_6);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = iz.cf - iz.ansl("aojh", ante(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == iz.ansl("aoji", ansp(int ), (int)338)) break;
                    v6 /* !! */  = (long)iz.ansl("aojj", ansp(int ), (int)339);
                }
                this.foundBlocks.removeIf(v5);
                if (var4_5 || var4_5) ** continue;
                return;
            }
            case 0: {
                do {
                    var5_4 /* !! */  = (int)iz.ansl("aojk", ansp(int ), (int)340);
                } while (!var6_3);
                throw null;
            }
            case 1: {
                var5_4 /* !! */  = (int)iz.ansl("aojl", ansp(int ), (int)341);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 2: {
                var5_4 /* !! */  = (int)iz.ansl("aojm", ansp(int ), (int)342);
                if (var6_3) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 3: {
                var5_4 /* !! */  = (int)iz.ansl("aojn", ansp(int ), (int)343);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl75:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)iz.ansl("aojo", ansp(int ), (int)344);
                    if (!var6_3) ** GOTO lbl70
                    throw null;
                }
            }
            case 5: {
                do {
                    var5_4 /* !! */  = (int)iz.ansl("aojp", ansp(int ), (int)345);
                } while (!var6_3);
                throw null;
            }
lbl85:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)iz.ansl("aojq", ansp(int ), (int)346);
                if (!var6_3) break;
                throw null;
            }
            case 7: 
        }
        var5_4 /* !! */  = (int)iz.ansl("aojr", ansp(int ), (int)347);
        ** while (!var6_3)
lbl92:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aosx() {
        iz.ansj[300] = 2139392561;
        iz.ansj[301] = 1614795903;
        iz.ansj[302] = 356989388;
        iz.ansj[303] = 755835208;
        iz.ansj[304] = 569919057;
        iz.ansj[305] = -720209808;
        iz.ansj[306] = 1900066896;
        iz.ansj[307] = 249180685;
        iz.ansj[308] = 268489367;
        iz.ansj[309] = -821760000;
        iz.ansj[310] = -432693127;
        iz.ansj[311] = 844457230;
        iz.ansj[312] = 96611537;
        iz.ansj[313] = 817017112;
        iz.ansj[314] = -1519347464;
        iz.ansj[315] = -1511757660;
        iz.ansj[316] = 1526325153;
        iz.ansj[317] = -1778723756;
        iz.ansj[318] = 235486404;
        iz.ansj[319] = 2055945208;
        iz.ansj[320] = -2112496120;
        iz.ansj[321] = -2029138541;
        iz.ansj[322] = 527264667;
        iz.ansj[323] = -584027128;
        iz.ansj[324] = 1227430467;
        iz.ansj[325] = -341885895;
        iz.ansj[326] = 1895356706;
        iz.ansj[327] = 1605131558;
        iz.ansj[328] = 1413149206;
        iz.ansj[329] = 1021060771;
        iz.ansj[330] = 341222173;
        iz.ansj[331] = 615344109;
        iz.ansj[332] = -2115965347;
        iz.ansj[333] = -627601366;
        iz.ansj[334] = -1628516786;
        iz.ansj[335] = -124275220;
        iz.ansj[336] = -968818504;
        iz.ansj[337] = 1788903847;
        iz.ansj[338] = -1563580072;
        iz.ansj[339] = 2060582731;
        iz.ansj[340] = -639194906;
        iz.ansj[341] = -828912869;
        iz.ansj[342] = -38665398;
        iz.ansj[343] = 310433477;
        iz.ansj[344] = -1490314185;
        iz.ansj[345] = 1658621769;
        iz.ansj[346] = -1718151565;
        iz.ansj[347] = -673652273;
        iz.ansj[348] = -1601230688;
        iz.ansj[349] = -757189575;
        iz.ansj[350] = -688818619;
        iz.ansj[351] = 2058864677;
        iz.ansj[352] = 1349908617;
        iz.ansj[353] = -296905302;
        iz.ansj[354] = -1548944078;
        iz.ansj[355] = 451687966;
        iz.ansj[356] = 343008243;
        iz.ansj[357] = -1231900383;
        iz.ansj[358] = -66315729;
        iz.ansj[359] = -1233399208;
        iz.ansj[360] = 970827364;
        iz.ansj[361] = -900094934;
        iz.ansj[362] = 1081561291;
        iz.ansj[363] = 1004413561;
        iz.ansj[364] = 1336384241;
        iz.ansj[365] = 222204601;
        iz.ansj[366] = 367510615;
        iz.ansj[367] = 670964784;
        iz.ansj[368] = -1287578373;
        iz.ansj[369] = 222144550;
        iz.ansj[370] = -1209315419;
        iz.ansj[371] = 2037165130;
        iz.ansj[372] = -2132723608;
        iz.ansj[373] = -1916663178;
        iz.ansj[374] = -1805465879;
        iz.ansj[375] = 1450966259;
        iz.ansj[376] = 345472154;
        iz.ansj[377] = -854007570;
        iz.ansj[378] = 1173668893;
        iz.ansj[379] = 121369543;
        iz.ansj[380] = 149345402;
        iz.ansj[381] = -1251178996;
        iz.ansj[382] = -1282833223;
        iz.ansj[383] = 1407982434;
        iz.ansj[384] = -1922524207;
        iz.ansj[385] = -1871834889;
        iz.ansj[386] = 1255767033;
        iz.ansj[387] = -1803687509;
        iz.ansj[388] = 1961005794;
        iz.ansj[389] = -1721670181;
        iz.ansj[390] = 1687425424;
        iz.ansj[391] = 1841760979;
        iz.ansj[392] = -1990429066;
        iz.ansj[393] = -1340470639;
        iz.ansj[394] = 460279020;
        iz.ansj[395] = 1685784942;
        iz.ansj[396] = 454472340;
        iz.ansj[397] = -106741447;
        iz.ansj[398] = 687148528;
        iz.ansj[399] = 1138465663;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = iz.cf;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - iz.ansl("anuo", ante(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1982509129: {
                    break block20;
                }
                case -1049595663: {
                    v1 = iz.ansl("anup", ante(int ), (int)16);
                    continue block20;
                }
                case -394518689: {
                    v1 = iz.ansl("anuq", ante(int ), (int)17);
                    continue block20;
                }
                case 890085472: {
                    v1 = iz.ansl("anur", ante(int ), (int)18);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = iz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("anus", ante(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iz.ansl("anut", ansp(int ), (int)35)) break;
            v2 /* !! */  = (long)iz.ansl("anuu", ansp(int ), (int)36);
        }
        var2_2 /* !! */  = iz.b;
        v3 /* !! */  = iz.cf;
        if (true) ** GOTO lbl28
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - iz.ansl("anuv", ante(int ), (int)20));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2077706568: {
                    v4 = iz.ansl("anuw", ante(int ), (int)21);
                    continue block22;
                }
                case -1982509129: {
                    break block22;
                }
                case 45316264: {
                    v4 = iz.ansl("anux", ante(int ), (int)22);
                    continue block22;
                }
                case 1513719323: {
                    v4 = iz.ansl("anuy", ante(int ), (int)23);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = iz.a;
        if (var3_1) {
            throw null;
lbl43:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("anuz", ante(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == iz.ansl("anva", ansp(int ), (int)37)) break;
            v5 /* !! */  = (long)iz.ansl("anvb", ansp(int ), (int)38);
        }
        this.invalidateScan();
        ** while (var1_3 || var1_3)
lbl53:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)iz.ansl("anvc", ansp(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl62:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)iz.ansl("anvd", ansp(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl67:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)iz.ansl("anve", ansp(int ), (int)41);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)iz.ansl("anvf", ansp(int ), (int)42);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
lbl75:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)iz.ansl("anvg", ansp(int ), (int)43);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)iz.ansl("anvh", ansp(int ), (int)44);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private long chunkDistanceSq(class_1923 var1_1, int var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("aomn", ante(int ), (int)114)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iz.ansl("aomo", ansp(int ), (int)402)) break;
            v0 /* !! */  = (long)iz.ansl("aomp", ansp(int ), (int)403);
        }
        var10_4 = iz.c;
        v1 /* !! */  = iz.cf;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(iz.ansl("aomr", ante(int ), (int)116) - iz.ansl("aomq", ante(int ), (int)115));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1982509129: {
                    break block15;
                }
                case -48279819: {
                    continue block15;
                }
            }
            break;
        }
        var9_5 /* !! */  = iz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("aoms", ante(int ), (int)117)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iz.ansl("aomt", ansp(int ), (int)404)) break;
            v2 /* !! */  = (long)iz.ansl("aomu", ansp(int ), (int)405);
        }
        var8_6 = iz.a;
        if (var10_4) {
            throw null;
lbl27:
            // 3 sources

            return (long)iz.ansl("aomv", ante(int ), (int)118);
        }
        if (var8_6 || var8_6) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("aomw", ante(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == iz.ansl("aomx", ansp(int ), (int)406)) break;
            v3 /* !! */  = (long)iz.ansl("aomy", ansp(int ), (int)407);
        }
        var4_7 = var1_1.field_9181 - var2_2;
        if (var8_6 || var8_6) ** GOTO lbl27
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = iz.cf - iz.ansl("aomz", ante(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == iz.ansl("aona", ansp(int ), (int)408)) break;
            v4 /* !! */  = (long)iz.ansl("aonb", ansp(int ), (int)409);
        }
        var6_8 = var1_1.field_9180 - var3_3;
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_6 || var8_6) ** continue;
                return var4_7 * var4_7 + var6_8 * var6_8;
            }
            case 0: {
                do {
                    var9_5 /* !! */  = (int)iz.ansl("aonc", ansp(int ), (int)410);
                } while (!var10_4);
                throw null;
            }
            case 1: {
                var9_5 /* !! */  = (int)iz.ansl("aond", ansp(int ), (int)411);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl60:
            // 2 sources

            case 2: {
                var9_5 /* !! */  = (int)iz.ansl("aone", ansp(int ), (int)412);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 3: {
                var9_5 /* !! */  = (int)iz.ansl("aonf", ansp(int ), (int)413);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl70:
            // 2 sources

            case 4: {
                var9_5 /* !! */  = (int)iz.ansl("aong", ansp(int ), (int)414);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 5: {
                var9_5 /* !! */  = (int)iz.ansl("aonh", ansp(int ), (int)415);
                if (!var10_4) ** GOTO lbl60
                throw null;
            }
lbl79:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var9_5 /* !! */  = (int)iz.ansl("aoni", ansp(int ), (int)416);
                    if (!var10_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 7: 
        }
        var9_5 /* !! */  = (int)iz.ansl("aonj", ansp(int ), (int)417);
        ** while (!var10_4)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aotd() {
        iz.ansk[400] = -1842278543;
        iz.ansk[401] = -1279523033;
        iz.ansk[402] = -1793832396;
        iz.ansk[403] = -667205553;
        iz.ansk[404] = -2012606272;
        iz.ansk[405] = 960322255;
        iz.ansk[406] = 1576705242;
        iz.ansk[407] = 1035950326;
        iz.ansk[408] = -1069471322;
        iz.ansk[409] = 1508883328;
        iz.ansk[410] = 625915988;
        iz.ansk[411] = 1794140331;
        iz.ansk[412] = -389436476;
        iz.ansk[413] = -1334785131;
        iz.ansk[414] = 389813948;
        iz.ansk[415] = 1407518009;
        iz.ansk[416] = 985949752;
        iz.ansk[417] = -922832719;
        iz.ansk[418] = -709326713;
        iz.ansk[419] = 581784882;
        iz.ansk[420] = -286281683;
        iz.ansk[421] = -1976092149;
        iz.ansk[422] = 1444152130;
        iz.ansk[423] = -1655539813;
        iz.ansk[424] = 1894642420;
        iz.ansk[425] = 1910927376;
        iz.ansk[426] = -1837612479;
        iz.ansk[427] = 1511757711;
        iz.ansk[428] = 922470288;
        iz.ansk[429] = -417982230;
        iz.ansk[430] = 1063366271;
        iz.ansk[431] = 1451359427;
        iz.ansk[432] = -114407516;
        iz.ansk[433] = 423780277;
        iz.ansk[434] = -1087972090;
        iz.ansk[435] = 585198487;
        iz.ansk[436] = -640638149;
        iz.ansk[437] = 1790034462;
        iz.ansk[438] = -96799748;
        iz.ansk[439] = 905247361;
        iz.ansk[440] = 595804806;
        iz.ansk[441] = 626648263;
        iz.ansk[442] = -493082651;
        iz.ansk[443] = -179089072;
        iz.ansk[444] = 166221777;
        iz.ansk[445] = -431545322;
        iz.ansk[446] = -264920319;
        iz.ansk[447] = -1169565065;
        iz.ansk[448] = -2097175078;
        iz.ansk[449] = 2114870625;
        iz.ansk[450] = 882546615;
        iz.ansk[451] = 2061542128;
        iz.ansk[452] = 6415786;
        iz.ansk[453] = 491155204;
        iz.ansk[454] = 1725276062;
        iz.ansk[455] = -9912839;
        iz.ansk[456] = -1515930541;
        iz.ansk[457] = -1122947136;
        iz.ansk[458] = -478019869;
        iz.ansk[459] = -1924575347;
        iz.ansk[460] = -1467367882;
        iz.ansk[461] = -1068428607;
        iz.ansk[462] = -484638197;
        iz.ansk[463] = 440018330;
        iz.ansk[464] = -502968489;
        iz.ansk[465] = -1028105087;
        iz.ansk[466] = 1103272884;
        iz.ansk[467] = 1142713028;
        iz.ansk[468] = -1093559290;
        iz.ansk[469] = -786115668;
        iz.ansk[470] = -692139819;
        iz.ansk[471] = 1964440736;
        iz.ansk[472] = 1699210300;
        iz.ansk[473] = 1720168689;
        iz.ansk[474] = 772996238;
        iz.ansk[475] = -1010095663;
        iz.ansk[476] = -1024121814;
        iz.ansk[477] = 1696861894;
        iz.ansk[478] = -1046605536;
        iz.ansk[479] = 2145054736;
        iz.ansk[480] = -1122698355;
        iz.ansk[481] = -1336693798;
        iz.ansk[482] = 1708879830;
        iz.ansk[483] = -1152135108;
        iz.ansk[484] = -2012745166;
        iz.ansk[485] = -779027154;
        iz.ansk[486] = -1093276030;
        iz.ansk[487] = -1417717406;
        iz.ansk[488] = 1816918284;
        iz.ansk[489] = -851692894;
        iz.ansk[490] = 1616186737;
        iz.ansk[491] = -321237825;
        iz.ansk[492] = 1144113657;
        iz.ansk[493] = 1394707270;
        iz.ansk[494] = 939104217;
        iz.ansk[495] = 1667229281;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Set<String> normalizedConfiguredBlocks() {
        v0 /* !! */  = iz.cf;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(iz.ansl("anxv", ante(int ), (int)27) - iz.ansl("anxu", ante(int ), (int)26));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1982509129: {
                    break block65;
                }
                case -416187642: {
                    continue block65;
                }
            }
            break;
        }
        var8_1 = iz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("anxw", ante(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == iz.ansl("anxx", ansp(int ), (int)108)) break;
            v1 /* !! */  = (long)iz.ansl("anxy", ansp(int ), (int)109);
        }
        var7_2 /* !! */  = iz.b;
        v2 /* !! */  = iz.cf;
        if (true) ** GOTO lbl21
        block67: while (true) {
            v2 /* !! */  = (long)(v3 - iz.ansl("anxz", ante(int ), (int)29));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1982509129: {
                    break block67;
                }
                case -1040379013: {
                    v3 = iz.ansl("anya", ante(int ), (int)30);
                    continue block67;
                }
                case -389904645: {
                    v3 = iz.ansl("anyb", ante(int ), (int)31);
                    continue block67;
                }
            }
            break;
        }
        var6_3 = iz.a;
        if (var8_1) {
            throw null;
lbl33:
            // 14 sources

            return null;
        }
        if (var6_3 || var6_3) ** GOTO lbl33
        v4 /* !! */  = iz.cf;
        if (true) ** GOTO lbl40
        block69: while (true) {
            v4 /* !! */  = (long)(v5 - iz.ansl("anyc", ante(int ), (int)32));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1982509129: {
                    break block69;
                }
                case -494564242: {
                    v5 = iz.ansl("anyd", ante(int ), (int)33);
                    continue block69;
                }
                case 454799302: {
                    v5 = iz.ansl("anye", ante(int ), (int)34);
                    continue block69;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("anyf", ante(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == iz.ansl("anyg", ansp(int ), (int)110)) break;
            v6 /* !! */  = (long)iz.ansl("anyh", ansp(int ), (int)111);
        }
        var1_4 = new HashSet<String>();
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = iz.cf - iz.ansl("anyi", ante(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == iz.ansl("anyj", ansp(int ), (int)112)) break;
            v7 /* !! */  = (long)iz.ansl("anyk", ansp(int ), (int)113);
        }
        v8 = ah.getInstance();
        v9 /* !! */  = iz.cf;
        if (true) ** GOTO lbl66
        block72: while (true) {
            v9 /* !! */  = (long)(iz.ansl("anym", ante(int ), (int)38) - iz.ansl("anyl", ante(int ), (int)37));
lbl66:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1982509129: {
                    break block72;
                }
                case 1167196974: {
                    continue block72;
                }
            }
            break;
        }
        v10 = v8.getBlocks();
        v11 /* !! */  = iz.cf;
        if (true) ** GOTO lbl76
        block73: while (true) {
            v11 /* !! */  = (long)(v12 - iz.ansl("anyn", ante(int ), (int)39));
lbl76:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1982509129: {
                    break block73;
                }
                case -83267255: {
                    v12 = iz.ansl("anyo", ante(int ), (int)40);
                    continue block73;
                }
                case -57395961: {
                    v12 = iz.ansl("anyp", ante(int ), (int)41);
                    continue block73;
                }
                case 1530897582: {
                    v12 = iz.ansl("anyq", ante(int ), (int)42);
                    continue block73;
                }
            }
            break;
        }
        var2_5 = v10.iterator();
        if (var6_3) ** GOTO lbl33
        block74: while (true) {
            if (var6_3 || var6_3) ** GOTO lbl33
            v13 /* !! */  = iz.cf;
            if (true) ** GOTO lbl96
            block75: while (true) {
                v13 /* !! */  = (long)(v14 - iz.ansl("anyr", ante(int ), (int)43));
lbl96:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1982509129: {
                        break block75;
                    }
                    case -1573475634: {
                        v14 = iz.ansl("anys", ante(int ), (int)44);
                        continue block75;
                    }
                    case 1344098439: {
                        v14 = iz.ansl("anyt", ante(int ), (int)45);
                        continue block75;
                    }
                }
                break;
            }
            if (!var2_5.hasNext()) ** GOTO lbl176
            if (var6_3) ** GOTO lbl33
            v15 /* !! */  = iz.cf;
            if (true) ** GOTO lbl111
            block76: while (true) {
                v15 /* !! */  = (long)(v16 - iz.ansl("anyu", ante(int ), (int)46));
lbl111:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1982509129: {
                        break block76;
                    }
                    case -488286992: {
                        v16 = iz.ansl("anyv", ante(int ), (int)47);
                        continue block76;
                    }
                    case 1502438802: {
                        v16 = iz.ansl("anyw", ante(int ), (int)48);
                        continue block76;
                    }
                }
                break;
            }
            var3_6 = var2_5.next();
            if (var6_3 || var6_3) ** GOTO lbl33
            if (var3_6 == null) ** GOTO lbl173
            if (var6_3) ** GOTO lbl33
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_3 = iz.cf - iz.ansl("anyx", ante(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == iz.ansl("anyy", ansp(int ), (int)114)) break;
                v17 /* !! */  = (long)iz.ansl("anyz", ansp(int ), (int)115);
            }
            if (var3_6.isBlank()) ** GOTO lbl173
            if (var6_3) ** GOTO lbl33
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_3) ** GOTO lbl33
                    v18 /* !! */  = iz.cf;
                    if (true) ** GOTO lbl139
                    block78: while (true) {
                        v18 /* !! */  = (long)(iz.ansl("anzb", ante(int ), (int)51) - iz.ansl("anza", ante(int ), (int)50));
lbl139:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1982509129: {
                                break block78;
                            }
                            case -191961327: {
                                continue block78;
                            }
                        }
                        break;
                    }
                    var4_7 = var3_6.toLowerCase();
                    if (var6_3 || var6_3) ** GOTO lbl33
                    v19 = iz.ansl("anzc", ansp(int ), (int)116);
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_4 = iz.cf - iz.ansl("anzd", ante(int ), (int)52)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == iz.ansl("anze", ansp(int ), (int)117)) break;
                        v20 /* !! */  = (long)iz.ansl("anzf", ansp(int ), (int)118);
                    }
                    var5_8 = var4_7.indexOf((int)v19);
                    if (var6_3 || var6_3) ** GOTO lbl33
                    if (var5_8 >= 0) {
                        v21 = var5_8 + iz.ansl("anzg", ansp(int ), (int)119);
                        while (true) {
                            if ((v22 /* !! */  = (cfr_temp_5 = iz.cf - iz.ansl("anzh", ante(int ), (int)53)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v22 /* !! */  == iz.ansl("anzi", ansp(int ), (int)120)) break;
                            v22 /* !! */  = (long)iz.ansl("anzj", ansp(int ), (int)121);
                        }
                        v23 = var4_7.substring(v21);
                        if (var8_1) {
                            throw null;
                        }
                    } else {
                        v23 = var4_7;
                    }
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_6 = iz.cf - iz.ansl("anzk", ante(int ), (int)54)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == iz.ansl("anzl", ansp(int ), (int)122)) break;
                        v24 /* !! */  = (long)iz.ansl("anzm", ansp(int ), (int)123);
                    }
                    var1_4.add(v23);
                    if (var6_3) ** GOTO lbl33
lbl173:
                    // 3 sources

                    if (var6_3 || var6_3) ** GOTO lbl33
                    if (!var8_1) continue block74;
                    throw null;
                }
lbl176:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_7 = iz.cf - iz.ansl("anzn", ante(int ), (int)55)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == iz.ansl("anzo", ansp(int ), (int)124)) break;
                    v25 /* !! */  = (long)iz.ansl("anzp", ansp(int ), (int)125);
                }
                return Set.copyOf(var1_4);
                case 0: {
                    var7_2 /* !! */  = (int)iz.ansl("anzq", ansp(int ), (int)126);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl273
                }
lbl189:
                // 3 sources

                case 1: {
                    var7_2 /* !! */  = (int)iz.ansl("anzr", ansp(int ), (int)127);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl194:
                // 2 sources

                case 2: {
                    var7_2 /* !! */  = (int)iz.ansl("anzs", ansp(int ), (int)128);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
lbl199:
                // 3 sources

                case 3: {
                    var7_2 /* !! */  = (int)iz.ansl("anzt", ansp(int ), (int)129);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
                case 4: {
                    var7_2 /* !! */  = (int)iz.ansl("anzu", ansp(int ), (int)130);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
                case 5: {
                    var7_2 /* !! */  = (int)iz.ansl("anzv", ansp(int ), (int)131);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl214:
                // 2 sources

                case 6: {
                    var7_2 /* !! */  = (int)iz.ansl("anzw", ansp(int ), (int)132);
                    if (var8_1) {
                        throw null;
                    }
                }
lbl218:
                // 5 sources

                case 7: {
                    var7_2 /* !! */  = (int)iz.ansl("anzx", ansp(int ), (int)133);
                    if (!var8_1) ** GOTO lbl194
                    throw null;
                }
lbl222:
                // 2 sources

                case 8: {
                    var7_2 /* !! */  = (int)iz.ansl("anzy", ansp(int ), (int)134);
                    if (!var8_1) ** GOTO lbl218
                    throw null;
                }
                case 9: {
                    var7_2 /* !! */  = (int)iz.ansl("anzz", ansp(int ), (int)135);
                    if (!var8_1) break block74;
                    throw null;
                }
                case 10: {
                    var7_2 /* !! */  = (int)iz.ansl("aoaa", ansp(int ), (int)136);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl235:
                // 3 sources

                case 11: {
                    var7_2 /* !! */  = (int)iz.ansl("aoab", ansp(int ), (int)137);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
lbl240:
                // 2 sources

                case 12: {
                    var7_2 /* !! */  = (int)iz.ansl("aoac", ansp(int ), (int)138);
                    if (!var8_1) ** GOTO lbl218
                    throw null;
                }
lbl244:
                // 2 sources

                case 13: {
                    var7_2 /* !! */  = (int)iz.ansl("aoad", ansp(int ), (int)139);
                    if (!var8_1) ** GOTO lbl214
                    throw null;
                }
lbl248:
                // 2 sources

                case 14: {
                    var7_2 /* !! */  = (int)iz.ansl("aoae", ansp(int ), (int)140);
                    if (!var8_1) ** GOTO lbl189
                    throw null;
                }
lbl252:
                // 2 sources

                case 15: {
                    var7_2 /* !! */  = (int)iz.ansl("aoaf", ansp(int ), (int)141);
                    if (!var8_1) break block74;
                    throw null;
                }
lbl256:
                // 3 sources

                case 16: {
                    var7_2 /* !! */  = (int)iz.ansl("aoag", ansp(int ), (int)142);
                    if (!var8_1) ** GOTO lbl222
                    throw null;
                }
lbl260:
                // 2 sources

                case 17: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)iz.ansl("aoah", ansp(int ), (int)143);
                        if (!var8_1) break block74;
                        throw null;
                    }
                }
                case 18: {
                    var7_2 /* !! */  = (int)iz.ansl("aoai", ansp(int ), (int)144);
                    if (!var8_1) ** GOTO lbl235
                    throw null;
                }
                case 19: {
                    var7_2 /* !! */  = (int)iz.ansl("aoaj", ansp(int ), (int)145);
                    if (!var8_1) ** GOTO lbl252
                    throw null;
                }
lbl273:
                // 2 sources

                case 20: {
                    var7_2 /* !! */  = (int)iz.ansl("aoak", ansp(int ), (int)146);
                    if (!var8_1) ** GOTO lbl189
                    throw null;
                }
lbl277:
                // 2 sources

                case 21: {
                    var7_2 /* !! */  = (int)iz.ansl("aoal", ansp(int ), (int)147);
                    if (!var8_1) ** GOTO lbl199
                    throw null;
                }
                case 22: {
                    var7_2 /* !! */  = (int)iz.ansl("aoam", ansp(int ), (int)148);
                    if (!var8_1) ** GOTO lbl244
                    throw null;
                }
                case 23: {
                    var7_2 /* !! */  = (int)iz.ansl("aoan", ansp(int ), (int)149);
                    if (!var8_1) ** GOTO lbl199
                    throw null;
                }
                case 24: 
            }
            break;
        }
        var7_2 /* !! */  = (int)iz.ansl("aoao", ansp(int ), (int)150);
        ** while (!var8_1)
lbl292:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aotc() {
        iz.ansk[300] = 2139392570;
        iz.ansk[301] = 1614795858;
        iz.ansk[302] = 356989436;
        iz.ansk[303] = 755835238;
        iz.ansk[304] = 569919048;
        iz.ansk[305] = -720209855;
        iz.ansk[306] = 1900066924;
        iz.ansk[307] = 249180705;
        iz.ansk[308] = 268489370;
        iz.ansk[309] = -821759959;
        iz.ansk[310] = -432693144;
        iz.ansk[311] = 844457232;
        iz.ansk[312] = 96611582;
        iz.ansk[313] = 817017127;
        iz.ansk[314] = -1519347485;
        iz.ansk[315] = -1511757693;
        iz.ansk[316] = 1526325120;
        iz.ansk[317] = -1778723750;
        iz.ansk[318] = 235486426;
        iz.ansk[319] = 2055945164;
        iz.ansk[320] = -2112496112;
        iz.ansk[321] = -2029138507;
        iz.ansk[322] = 527264664;
        iz.ansk[323] = -584027082;
        iz.ansk[324] = 1227430497;
        iz.ansk[325] = -341885930;
        iz.ansk[326] = 1895356725;
        iz.ansk[327] = 1605131573;
        iz.ansk[328] = 1413149203;
        iz.ansk[329] = 1021060759;
        iz.ansk[330] = 341222239;
        iz.ansk[331] = 615344094;
        iz.ansk[332] = -2115965348;
        iz.ansk[333] = -1557160551;
        iz.ansk[334] = -1628516785;
        iz.ansk[335] = 1475086868;
        iz.ansk[336] = -968818503;
        iz.ansk[337] = -2013245318;
        iz.ansk[338] = -1563580071;
        iz.ansk[339] = 91948879;
        iz.ansk[340] = -639194907;
        iz.ansk[341] = -828912868;
        iz.ansk[342] = -38665394;
        iz.ansk[343] = 310433476;
        iz.ansk[344] = -1490314186;
        iz.ansk[345] = 1658621775;
        iz.ansk[346] = -1718151562;
        iz.ansk[347] = -673652278;
        iz.ansk[348] = -1601230687;
        iz.ansk[349] = -757189576;
        iz.ansk[350] = -389470295;
        iz.ansk[351] = 1161251639;
        iz.ansk[352] = 1349908614;
        iz.ansk[353] = -296905296;
        iz.ansk[354] = -1548944092;
        iz.ansk[355] = 451687942;
        iz.ansk[356] = 343008255;
        iz.ansk[357] = -1231900358;
        iz.ansk[358] = -66315733;
        iz.ansk[359] = -1233399216;
        iz.ansk[360] = 970827360;
        iz.ansk[361] = -900094923;
        iz.ansk[362] = 1081561295;
        iz.ansk[363] = 1004413555;
        iz.ansk[364] = 1336384228;
        iz.ansk[365] = 222204592;
        iz.ansk[366] = 367510604;
        iz.ansk[367] = 670964794;
        iz.ansk[368] = -1287578387;
        iz.ansk[369] = 222144571;
        iz.ansk[370] = -1209315404;
        iz.ansk[371] = 2037165131;
        iz.ansk[372] = -2132723604;
        iz.ansk[373] = -1916663180;
        iz.ansk[374] = -1805465870;
        iz.ansk[375] = 1450966244;
        iz.ansk[376] = 345472134;
        iz.ansk[377] = -854007582;
        iz.ansk[378] = 1173668876;
        iz.ansk[379] = 121369542;
        iz.ansk[380] = 149345396;
        iz.ansk[381] = -1251179007;
        iz.ansk[382] = -1282833241;
        iz.ansk[383] = 1407982448;
        iz.ansk[384] = -1922524208;
        iz.ansk[385] = 1359375248;
        iz.ansk[386] = 1255767032;
        iz.ansk[387] = 1279894710;
        iz.ansk[388] = 73352183;
        iz.ansk[389] = -1721670182;
        iz.ansk[390] = -1338010482;
        iz.ansk[391] = 1832449324;
        iz.ansk[392] = -1990429057;
        iz.ansk[393] = -1340470640;
        iz.ansk[394] = 460279017;
        iz.ansk[395] = 1685784939;
        iz.ansk[396] = 454472343;
        iz.ansk[397] = -106741442;
        iz.ansk[398] = 687148534;
        iz.ansk[399] = 1138465660;
    }

    public static /* synthetic */ CallSite ansl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iz.cf - iz.ansl("anty", ante(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iz.ansl("antz", ansp(int ), (int)25)) break;
            v0 /* !! */  = (long)iz.ansl("anua", ansp(int ), (int)26);
        }
        var3_1 = iz.c;
        v1 /* !! */  = iz.cf;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(iz.ansl("anuc", ante(int ), (int)11) - iz.ansl("anub", ante(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1982509129: {
                    break block17;
                }
                case -210008896: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = iz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = iz.cf - iz.ansl("anud", ante(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iz.ansl("anue", ansp(int ), (int)27)) break;
            v2 /* !! */  = (long)iz.ansl("anuf", ansp(int ), (int)28);
        }
        var1_3 = iz.a;
        if (var3_1) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                v3 /* !! */  = iz.cf;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v3 /* !! */  = (long)(iz.ansl("anuh", ante(int ), (int)14) - iz.ansl("anug", ante(int ), (int)13));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1982509129: {
                            break block20;
                        }
                        case 206656264: {
                            continue block20;
                        }
                    }
                    break;
                }
                this.invalidateScan();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)iz.ansl("anui", ansp(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)iz.ansl("anuj", ansp(int ), (int)30);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)iz.ansl("anuk", ansp(int ), (int)31);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)iz.ansl("anul", ansp(int ), (int)32);
                } while (!var3_1);
                throw null;
            }
lbl66:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)iz.ansl("anum", ansp(int ), (int)33);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)iz.ansl("anun", ansp(int ), (int)34);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }
}

