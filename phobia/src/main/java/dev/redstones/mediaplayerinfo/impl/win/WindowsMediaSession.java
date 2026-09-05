/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u000eH\u0096 J\t\u0010\u000f\u001a\u00020\u000eH\u0096 J\t\u0010\u0010\u001a\u00020\u000eH\u0096 J\t\u0010\u0011\u001a\u00020\u000eH\u0096 J\t\u0010\u0012\u001a\u00020\u000eH\u0096 J\t\u0010\u0013\u001a\u00020\u000eH\u0096 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2={"Ldev/redstones/mediaplayerinfo/impl/win/WindowsMediaSession;", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "media", "Ldev/redstones/mediaplayerinfo/MediaInfo;", "owner", "", "index", "", "(Ldev/redstones/mediaplayerinfo/MediaInfo;Ljava/lang/String;I)V", "getMedia", "()Ldev/redstones/mediaplayerinfo/MediaInfo;", "getOwner", "()Ljava/lang/String;", "next", "", "pause", "play", "playPause", "previous", "stop", "MediaPlayerInfo"})
public final class WindowsMediaSession
implements IMediaSession {
    private final int index;
    private final MediaInfo media;
    private final String owner;
    private static long[] jjxq;
    private static long[] jjxr;
    private static int[] jjxg;
    public static final int b;
    public static final boolean c;
    public static final boolean a;
    static final long ro = -8968353822315124090L;
    private static int[] jjxf;

    @Override
    public native void stop();

    private static /* synthetic */ void jjza() {
        WindowsMediaSession.jjxr[0] = 8065353883520256791L;
        WindowsMediaSession.jjxr[1] = -988938157313606288L;
        WindowsMediaSession.jjxr[2] = 7230911935472689553L;
        WindowsMediaSession.jjxr[3] = -1551282122195405447L;
        WindowsMediaSession.jjxr[4] = -7720004528463612940L;
        WindowsMediaSession.jjxr[5] = 6654705245253575754L;
        WindowsMediaSession.jjxr[6] = 4461660281771150124L;
        WindowsMediaSession.jjxr[7] = 7256624378948066517L;
        WindowsMediaSession.jjxr[8] = 5609361964577591021L;
        WindowsMediaSession.jjxr[9] = -1115034513564098186L;
        WindowsMediaSession.jjxr[10] = -5386531327311638149L;
        WindowsMediaSession.jjxr[11] = 2014651947914421254L;
        WindowsMediaSession.jjxr[12] = -5436931168812117489L;
        WindowsMediaSession.jjxr[13] = -8312535916431699287L;
        WindowsMediaSession.jjxr[14] = 6172846591853993791L;
    }

    private static /* synthetic */ int jjxe(int n2) {
        return jjxf[n2] ^ jjxg[n2];
    }

    static {
        jjxf = new int[23];
        jjxg = new int[23];
        WindowsMediaSession.jjyx();
        WindowsMediaSession.jjyy();
        jjxq = new long[15];
        jjxr = new long[15];
        WindowsMediaSession.jjyz();
        WindowsMediaSession.jjza();
    }

    @Override
    public native void next();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public WindowsMediaSession(@NotNull MediaInfo var1_1, @NotNull String var2_2, int var3_3) {
        var5_4 /* !! */  = WindowsMediaSession.b;
        Intrinsics.checkNotNullParameter((Object)var1_1, (String)"media");
        Intrinsics.checkNotNullParameter((Object)var2_2, (String)"owner");
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.media = var1_1;
                this.owner = var2_2;
                this.index = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxi", jjxe(int ), (int)0);
            }
            case 1: {
                var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxj", jjxe(int ), (int)1);
            }
lbl16:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxk", jjxe(int ), (int)2);
                ** GOTO lbl21
            }
            case 3: {
                var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxl", jjxe(int ), (int)3);
            }
lbl21:
            // 4 sources

            case 4: {
                var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxm", jjxe(int ), (int)4);
                ** GOTO lbl16
            }
            case 5: {
                var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxn", jjxe(int ), (int)5);
                ** GOTO lbl21
            }
            case 6: 
        }
        while (true) {
            var5_4 /* !! */  = (int)WindowsMediaSession.jjxh("jjxo", jjxe(int ), (int)6);
        }
    }

    private static /* synthetic */ long jjxp(int n2) {
        return jjxq[n2] ^ jjxr[n2];
    }

    @Override
    public native void playPause();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public MediaInfo getMedia() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = WindowsMediaSession.ro - WindowsMediaSession.jjxh("jjxs", jjxp(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == WindowsMediaSession.jjxh("jjxt", jjxe(int ), (int)7)) break;
            v0 /* !! */  = (long)WindowsMediaSession.jjxh("jjxu", jjxe(int ), (int)8);
        }
        var3_1 = WindowsMediaSession.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = WindowsMediaSession.ro - WindowsMediaSession.jjxh("jjxv", jjxp(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == WindowsMediaSession.jjxh("jjxw", jjxe(int ), (int)9)) break;
            v1 /* !! */  = (long)WindowsMediaSession.jjxh("jjxx", jjxe(int ), (int)10);
        }
        var2_2 /* !! */  = WindowsMediaSession.b;
        v2 /* !! */  = WindowsMediaSession.ro;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(WindowsMediaSession.jjxh("jjxz", jjxp(int ), (int)3) - WindowsMediaSession.jjxh("jjxy", jjxp(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 69961574: {
                    continue block18;
                }
                case 149154438: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = WindowsMediaSession.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = WindowsMediaSession.ro;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - WindowsMediaSession.jjxh("jjya", jjxp(int ), (int)4));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1179376769: {
                            v4 = WindowsMediaSession.jjxh("jjyb", jjxp(int ), (int)5);
                            continue block20;
                        }
                        case -1133829942: {
                            v4 = WindowsMediaSession.jjxh("jjyc", jjxp(int ), (int)6);
                            continue block20;
                        }
                        case -106499877: {
                            v4 = WindowsMediaSession.jjxh("jjyd", jjxp(int ), (int)7);
                            continue block20;
                        }
                        case 149154438: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.media;
            }
lbl51:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjye", jjxe(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
lbl56:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyf", jjxe(int ), (int)12);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyg", jjxe(int ), (int)13);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyh", jjxe(int ), (int)14);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    @Override
    public native void previous();

    @Override
    public native void pause();

    public static /* synthetic */ CallSite jjxh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jjyx() {
        WindowsMediaSession.jjxf[0] = -1896162198;
        WindowsMediaSession.jjxf[1] = -422703416;
        WindowsMediaSession.jjxf[2] = 413782913;
        WindowsMediaSession.jjxf[3] = -1370489558;
        WindowsMediaSession.jjxf[4] = 1964271862;
        WindowsMediaSession.jjxf[5] = 426035852;
        WindowsMediaSession.jjxf[6] = -846279876;
        WindowsMediaSession.jjxf[7] = 788283504;
        WindowsMediaSession.jjxf[8] = -608460079;
        WindowsMediaSession.jjxf[9] = -809054081;
        WindowsMediaSession.jjxf[10] = -1713845130;
        WindowsMediaSession.jjxf[11] = -615450243;
        WindowsMediaSession.jjxf[12] = -265415073;
        WindowsMediaSession.jjxf[13] = 925069370;
        WindowsMediaSession.jjxf[14] = 1294505774;
        WindowsMediaSession.jjxf[15] = 450844635;
        WindowsMediaSession.jjxf[16] = -1090153038;
        WindowsMediaSession.jjxf[17] = 1130493398;
        WindowsMediaSession.jjxf[18] = -1232057232;
        WindowsMediaSession.jjxf[19] = 1035056027;
        WindowsMediaSession.jjxf[20] = -1329659508;
        WindowsMediaSession.jjxf[21] = 78876476;
        WindowsMediaSession.jjxf[22] = -2006482209;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String getOwner() {
        v0 /* !! */  = WindowsMediaSession.ro;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(WindowsMediaSession.jjxh("jjyj", jjxp(int ), (int)9) - WindowsMediaSession.jjxh("jjyi", jjxp(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -517819880: {
                    continue block15;
                }
                case 149154438: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = WindowsMediaSession.c;
        v1 /* !! */  = WindowsMediaSession.ro;
        if (true) ** GOTO lbl15
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - WindowsMediaSession.jjxh("jjyk", jjxp(int ), (int)10));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -605121315: {
                    v2 = WindowsMediaSession.jjxh("jjyl", jjxp(int ), (int)11);
                    continue block16;
                }
                case -484981163: {
                    v2 = WindowsMediaSession.jjxh("jjym", jjxp(int ), (int)12);
                    continue block16;
                }
                case 149154438: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = WindowsMediaSession.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = WindowsMediaSession.ro - WindowsMediaSession.jjxh("jjyn", jjxp(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == WindowsMediaSession.jjxh("jjyo", jjxe(int ), (int)15)) break;
            v3 /* !! */  = (long)WindowsMediaSession.jjxh("jjyp", jjxe(int ), (int)16);
        }
        var1_3 = WindowsMediaSession.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = WindowsMediaSession.ro - WindowsMediaSession.jjxh("jjyq", jjxp(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == WindowsMediaSession.jjxh("jjyr", jjxe(int ), (int)17)) break;
                    v4 /* !! */  = (long)WindowsMediaSession.jjxh("jjys", jjxe(int ), (int)18);
                }
                return this.owner;
            }
            case 0: {
                var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyt", jjxe(int ), (int)19);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyu", jjxe(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyv", jjxe(int ), (int)21);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)WindowsMediaSession.jjxh("jjyw", jjxe(int ), (int)22);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jjyy() {
        WindowsMediaSession.jjxg[0] = -1896162198;
        WindowsMediaSession.jjxg[1] = -422703414;
        WindowsMediaSession.jjxg[2] = 413782919;
        WindowsMediaSession.jjxg[3] = -1370489556;
        WindowsMediaSession.jjxg[4] = 1964271860;
        WindowsMediaSession.jjxg[5] = 426035853;
        WindowsMediaSession.jjxg[6] = -846279873;
        WindowsMediaSession.jjxg[7] = -788283505;
        WindowsMediaSession.jjxg[8] = -1936554133;
        WindowsMediaSession.jjxg[9] = 809054080;
        WindowsMediaSession.jjxg[10] = 1974649744;
        WindowsMediaSession.jjxg[11] = -615450241;
        WindowsMediaSession.jjxg[12] = -265415076;
        WindowsMediaSession.jjxg[13] = 925069370;
        WindowsMediaSession.jjxg[14] = 1294505772;
        WindowsMediaSession.jjxg[15] = -450844636;
        WindowsMediaSession.jjxg[16] = -1884708973;
        WindowsMediaSession.jjxg[17] = -1130493399;
        WindowsMediaSession.jjxg[18] = 408676994;
        WindowsMediaSession.jjxg[19] = 1035056024;
        WindowsMediaSession.jjxg[20] = -1329659508;
        WindowsMediaSession.jjxg[21] = 78876478;
        WindowsMediaSession.jjxg[22] = -2006482210;
    }

    private static /* synthetic */ void jjyz() {
        WindowsMediaSession.jjxq[0] = 7875973348534828467L;
        WindowsMediaSession.jjxq[1] = 4044844191741525205L;
        WindowsMediaSession.jjxq[2] = -4217918946987572376L;
        WindowsMediaSession.jjxq[3] = 6233489645993466218L;
        WindowsMediaSession.jjxq[4] = -6979327613821301895L;
        WindowsMediaSession.jjxq[5] = -6092525537609372107L;
        WindowsMediaSession.jjxq[6] = 6643914527414090513L;
        WindowsMediaSession.jjxq[7] = 4891815894787174075L;
        WindowsMediaSession.jjxq[8] = 745984656522292532L;
        WindowsMediaSession.jjxq[9] = -4688222454232235781L;
        WindowsMediaSession.jjxq[10] = 2266108448066777103L;
        WindowsMediaSession.jjxq[11] = 7968804210169902492L;
        WindowsMediaSession.jjxq[12] = -2081226862006225328L;
        WindowsMediaSession.jjxq[13] = 411298067093048071L;
        WindowsMediaSession.jjxq[14] = 9206008428512701691L;
    }

    @Override
    public native void play();
}

