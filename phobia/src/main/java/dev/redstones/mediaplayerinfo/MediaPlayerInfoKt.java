/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.DummyMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.win.WindowsMediaPlayerInfo;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"systemMediaPlayerInfo", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "getSystemMediaPlayerInfo", "()Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "MediaPlayerInfo"})
public final class MediaPlayerInfoKt {
    private static long[] ffit;
    public static final boolean a;
    private static int[] ffix;
    private static long[] ffis;
    public static final int b;
    public static final boolean c;
    private static int[] ffiy;
    private static final MediaPlayerInfo systemMediaPlayerInfo;
    private static final long lt = -2541255995584476517L;

    private static /* synthetic */ void ffjo() {
        MediaPlayerInfoKt.ffix[0] = -18455804;
        MediaPlayerInfoKt.ffix[1] = -158131053;
        MediaPlayerInfoKt.ffix[2] = -1589972657;
        MediaPlayerInfoKt.ffix[3] = 1416581597;
        MediaPlayerInfoKt.ffix[4] = -692221910;
        MediaPlayerInfoKt.ffix[5] = 1102049766;
        MediaPlayerInfoKt.ffix[6] = -991149226;
        MediaPlayerInfoKt.ffix[7] = 840539868;
        MediaPlayerInfoKt.ffix[8] = -1975968597;
        MediaPlayerInfoKt.ffix[9] = 1704503148;
    }

    public static /* synthetic */ CallSite ffiu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ffjr() {
        MediaPlayerInfoKt.ffit[0] = -4707765275342762074L;
        MediaPlayerInfoKt.ffit[1] = 7018203336454927633L;
        MediaPlayerInfoKt.ffit[2] = 7007820646443854657L;
        MediaPlayerInfoKt.ffit[3] = -6479584895289035L;
        MediaPlayerInfoKt.ffit[4] = -6295428651577974315L;
        MediaPlayerInfoKt.ffit[5] = 3237651179933813357L;
    }

    private static /* synthetic */ void ffjp() {
        MediaPlayerInfoKt.ffiy[0] = -18455803;
        MediaPlayerInfoKt.ffiy[1] = 655329302;
        MediaPlayerInfoKt.ffiy[2] = 1589972656;
        MediaPlayerInfoKt.ffiy[3] = -1838811609;
        MediaPlayerInfoKt.ffiy[4] = -692221911;
        MediaPlayerInfoKt.ffiy[5] = 1102049766;
        MediaPlayerInfoKt.ffiy[6] = -991149225;
        MediaPlayerInfoKt.ffiy[7] = 840539871;
        MediaPlayerInfoKt.ffiy[8] = -1975968597;
        MediaPlayerInfoKt.ffiy[9] = 1704503150;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final MediaPlayerInfo getSystemMediaPlayerInfo() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaPlayerInfoKt.lt - MediaPlayerInfoKt.ffiu("ffiv", ffir(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaPlayerInfoKt.ffiu("ffiz", ffiw(int ), (int)0)) break;
            v0 /* !! */  = (long)MediaPlayerInfoKt.ffiu("ffja", ffiw(int ), (int)1);
        }
        var2 = MediaPlayerInfoKt.c;
        v1 /* !! */  = MediaPlayerInfoKt.lt;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(MediaPlayerInfoKt.ffiu("ffjc", ffir(int ), (int)2) - MediaPlayerInfoKt.ffiu("ffjb", ffir(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1954205292: {
                    continue block15;
                }
                case -606401893: {
                    break block15;
                }
            }
            break;
        }
        var1_1 /* !! */  = MediaPlayerInfoKt.b;
        v2 /* !! */  = MediaPlayerInfoKt.lt;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(MediaPlayerInfoKt.ffiu("ffje", ffir(int ), (int)4) - MediaPlayerInfoKt.ffiu("ffjd", ffir(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -606401893: {
                    break block16;
                }
                case 814320892: {
                    continue block16;
                }
            }
            break;
        }
        var0_2 = MediaPlayerInfoKt.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = MediaPlayerInfoKt.lt - MediaPlayerInfoKt.ffiu("ffjf", ffir(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == MediaPlayerInfoKt.ffiu("ffjg", ffiw(int ), (int)2)) break;
                    v3 /* !! */  = (long)MediaPlayerInfoKt.ffiu("ffjh", ffiw(int ), (int)3);
                }
                return MediaPlayerInfoKt.systemMediaPlayerInfo;
            }
            case 0: {
                var1_1 /* !! */  = (int)MediaPlayerInfoKt.ffiu("ffji", ffiw(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl52
            }
            case 1: {
                var1_1 /* !! */  = (int)MediaPlayerInfoKt.ffiu("ffjj", ffiw(int ), (int)5);
                if (var2) {
                    throw null;
                }
            }
lbl52:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)MediaPlayerInfoKt.ffiu("ffjk", ffiw(int ), (int)6);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)MediaPlayerInfoKt.ffiu("ffjl", ffiw(int ), (int)7);
        ** while (!var2)
lbl60:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ffjq() {
        MediaPlayerInfoKt.ffis[0] = 1633443065609683039L;
        MediaPlayerInfoKt.ffis[1] = -1597329201666637636L;
        MediaPlayerInfoKt.ffis[2] = 997928880390731184L;
        MediaPlayerInfoKt.ffis[3] = 1944305889723816926L;
        MediaPlayerInfoKt.ffis[4] = 3593773688338081519L;
        MediaPlayerInfoKt.ffis[5] = 3170699952243038239L;
    }

    static {
        MediaPlayerInfo mediaPlayerInfo;
        ffix = new int[10];
        ffiy = new int[10];
        MediaPlayerInfoKt.ffjo();
        MediaPlayerInfoKt.ffjp();
        ffis = new long[6];
        ffit = new long[6];
        MediaPlayerInfoKt.ffjq();
        MediaPlayerInfoKt.ffjr();
        String string = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"getProperty(...)");
        String string2 = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"toLowerCase(...)");
        if (StringsKt.startsWith$default((String)string2, (String)"windows", (boolean)MediaPlayerInfoKt.ffiu("ffjm", ffiw(int ), (int)8), (int)MediaPlayerInfoKt.ffiu("ffjn", ffiw(int ), (int)9), null)) {
            mediaPlayerInfo = WindowsMediaPlayerInfo.INSTANCE;
        } else {
            String string3 = System.getProperty("os.name");
            Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"getProperty(...)");
            String string4 = string3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"toLowerCase(...)");
            mediaPlayerInfo = Intrinsics.areEqual((Object)string4, (Object)"linux") ? (MediaPlayerInfo)LinuxMediaPlayerInfo.INSTANCE : (MediaPlayerInfo)DummyMediaPlayerInfo.INSTANCE;
        }
        systemMediaPlayerInfo = mediaPlayerInfo;
    }

    private static /* synthetic */ long ffir(int n2) {
        return ffis[n2] ^ ffit[n2];
    }

    private static /* synthetic */ int ffiw(int n2) {
        return ffix[n2] ^ ffiy[n2];
    }
}

