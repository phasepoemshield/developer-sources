/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlinx.serialization.KSerializer
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaInfo$$serializer;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Ldev/redstones/mediaplayerinfo/MediaInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ldev/redstones/mediaplayerinfo/MediaInfo;", "MediaPlayerInfo"})
public final class MediaInfo$Companion {
    private static int[] kyuz = new int[9];
    public static final boolean c;
    public static final long tn = 7726809747804072113L;
    private static long[] kyun;
    private static long[] kyum;
    public static final boolean a;
    private static int[] kyva;
    public static final int b;

    static {
        kyva = new int[9];
        MediaInfo$Companion.kyvk();
        MediaInfo$Companion.kyvl();
        kyum = new long[9];
        kyun = new long[9];
        MediaInfo$Companion.kyvm();
        MediaInfo$Companion.kyvn();
    }

    public static /* synthetic */ CallSite kyuo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private MediaInfo$Companion() {
    }

    private static /* synthetic */ long kyul(int n2) {
        return kyum[n2] ^ kyun[n2];
    }

    private static /* synthetic */ void kyvl() {
        MediaInfo$Companion.kyva[0] = 1765020743;
        MediaInfo$Companion.kyva[1] = -735855303;
        MediaInfo$Companion.kyva[2] = -732565022;
        MediaInfo$Companion.kyva[3] = 614464431;
        MediaInfo$Companion.kyva[4] = 465945118;
        MediaInfo$Companion.kyva[5] = -575886303;
        MediaInfo$Companion.kyva[6] = -1373474423;
        MediaInfo$Companion.kyva[7] = 583304093;
        MediaInfo$Companion.kyva[8] = -1918440150;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final KSerializer<MediaInfo> serializer() {
        v0 /* !! */  = MediaInfo$Companion.tn;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(MediaInfo$Companion.kyuo("kyuq", kyul(int ), (int)1) - MediaInfo$Companion.kyuo("kyup", kyul(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1494512087: {
                    continue block20;
                }
                case -119330639: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = MediaInfo$Companion.c;
        v1 /* !! */  = MediaInfo$Companion.tn;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo$Companion.kyuo("kyur", kyul(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -921129351: {
                    v2 = MediaInfo$Companion.kyuo("kyus", kyul(int ), (int)3);
                    continue block21;
                }
                case -675832178: {
                    v2 = MediaInfo$Companion.kyuo("kyut", kyul(int ), (int)4);
                    continue block21;
                }
                case -119330639: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo$Companion.b;
        v3 /* !! */  = MediaInfo$Companion.tn;
        if (true) ** GOTO lbl29
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - MediaInfo$Companion.kyuo("kyuu", kyul(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1957534097: {
                    v4 = MediaInfo$Companion.kyuo("kyuv", kyul(int ), (int)6);
                    continue block22;
                }
                case -789057034: {
                    v4 = MediaInfo$Companion.kyuo("kyuw", kyul(int ), (int)7);
                    continue block22;
                }
                case -119330639: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = MediaInfo$Companion.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = MediaInfo$Companion.tn - MediaInfo$Companion.kyuo("kyux", kyul(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == MediaInfo$Companion.kyuo("kyvb", kyuy(int ), (int)0)) break;
                    v5 /* !! */  = (long)MediaInfo$Companion.kyuo("kyvc", kyuy(int ), (int)1);
                }
                return (KSerializer)MediaInfo$$serializer.INSTANCE;
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyvd", kyuy(int ), (int)2);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl59:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyve", kyuy(int ), (int)3);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
lbl64:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyvf", kyuy(int ), (int)4);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyvg", kyuy(int ), (int)5);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public /* synthetic */ MediaInfo$Companion(DefaultConstructorMarker var1_1) {
        var3_2 /* !! */  = MediaInfo$Companion.b;
        var2_3 = MediaInfo$Companion.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this();
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyvh", kyuy(int ), (int)6);
                break;
            }
            case 1: {
                var3_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyvi", kyuy(int ), (int)7);
            }
            case 2: 
        }
        while (true) {
            var3_2 /* !! */  = (int)MediaInfo$Companion.kyuo("kyvj", kyuy(int ), (int)8);
        }
    }

    private static /* synthetic */ void kyvn() {
        MediaInfo$Companion.kyun[0] = -4453634152802225837L;
        MediaInfo$Companion.kyun[1] = -5753507781221013448L;
        MediaInfo$Companion.kyun[2] = -7773427387659286666L;
        MediaInfo$Companion.kyun[3] = -8292166264426674394L;
        MediaInfo$Companion.kyun[4] = 2676802732495053947L;
        MediaInfo$Companion.kyun[5] = 1288417893881630920L;
        MediaInfo$Companion.kyun[6] = -2573622491284602585L;
        MediaInfo$Companion.kyun[7] = 8870440462108667190L;
        MediaInfo$Companion.kyun[8] = -1326005478423379268L;
    }

    private static /* synthetic */ void kyvm() {
        MediaInfo$Companion.kyum[0] = 5883962982542547147L;
        MediaInfo$Companion.kyum[1] = 40502385198027379L;
        MediaInfo$Companion.kyum[2] = 938554395519298528L;
        MediaInfo$Companion.kyum[3] = 6216606889839105073L;
        MediaInfo$Companion.kyum[4] = 5731727360276950546L;
        MediaInfo$Companion.kyum[5] = 2977664130396829515L;
        MediaInfo$Companion.kyum[6] = -8565556989361747037L;
        MediaInfo$Companion.kyum[7] = 1701433645068172082L;
        MediaInfo$Companion.kyum[8] = 4191359233177892930L;
    }

    private static /* synthetic */ void kyvk() {
        MediaInfo$Companion.kyuz[0] = 1765020742;
        MediaInfo$Companion.kyuz[1] = -260164833;
        MediaInfo$Companion.kyuz[2] = -732565024;
        MediaInfo$Companion.kyuz[3] = 614464430;
        MediaInfo$Companion.kyuz[4] = 465945118;
        MediaInfo$Companion.kyuz[5] = -575886302;
        MediaInfo$Companion.kyuz[6] = -1373474421;
        MediaInfo$Companion.kyuz[7] = 583304095;
        MediaInfo$Companion.kyuz[8] = -1918440149;
    }

    private static /* synthetic */ int kyuy(int n2) {
        return kyuz[n2] ^ kyva[n2];
    }
}

