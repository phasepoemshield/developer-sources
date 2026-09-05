/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfoKt;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096\u0001\u00a8\u0006\u0006"}, d2={"Ldev/redstones/mediaplayerinfo/MediaPlayerInfo$Instance;", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "()V", "getMediaSessions", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "MediaPlayerInfo"})
public final class MediaPlayerInfo$Instance
implements MediaPlayerInfo {
    private static final long kb = -1867398469092404514L;
    private static long[] eakr;
    public static final int b;
    private static long[] eaks;
    private static int[] eakl;
    public static final boolean c;
    public static final boolean a;
    private static int[] eakk;
    static final /* synthetic */ MediaPlayerInfo$Instance $$INSTANCE;
    private final /* synthetic */ MediaPlayerInfo $$delegate_0;

    private static /* synthetic */ void ealp() {
        MediaPlayerInfo$Instance.eaks[0] = -5034283414698330596L;
        MediaPlayerInfo$Instance.eaks[1] = -1631516400765650802L;
        MediaPlayerInfo$Instance.eaks[2] = 8303899125488072722L;
        MediaPlayerInfo$Instance.eaks[3] = 235622913579498054L;
        MediaPlayerInfo$Instance.eaks[4] = 4282873945839753672L;
        MediaPlayerInfo$Instance.eaks[5] = -4821690279636872911L;
        MediaPlayerInfo$Instance.eaks[6] = -921819989732576537L;
        MediaPlayerInfo$Instance.eaks[7] = -835508059435890018L;
        MediaPlayerInfo$Instance.eaks[8] = 1656912773657200263L;
    }

    private static /* synthetic */ int eakj(int n2) {
        return eakk[n2] ^ eakl[n2];
    }

    private static /* synthetic */ long eakq(int n2) {
        return eakr[n2] ^ eaks[n2];
    }

    public static /* synthetic */ CallSite eakm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ealn() {
        MediaPlayerInfo$Instance.eakl[0] = 604834513;
        MediaPlayerInfo$Instance.eakl[1] = -345475796;
        MediaPlayerInfo$Instance.eakl[2] = -1526431736;
        MediaPlayerInfo$Instance.eakl[3] = -1189968106;
        MediaPlayerInfo$Instance.eakl[4] = 1796709218;
        MediaPlayerInfo$Instance.eakl[5] = 1288901395;
        MediaPlayerInfo$Instance.eakl[6] = -1387911212;
        MediaPlayerInfo$Instance.eakl[7] = 769341993;
        MediaPlayerInfo$Instance.eakl[8] = -901558646;
        MediaPlayerInfo$Instance.eakl[9] = 1018455782;
        MediaPlayerInfo$Instance.eakl[10] = 796594059;
        MediaPlayerInfo$Instance.eakl[11] = 756699689;
        MediaPlayerInfo$Instance.eakl[12] = -638257049;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private MediaPlayerInfo$Instance() {
        var2_1 /* !! */  = MediaPlayerInfo$Instance.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.$$delegate_0 = MediaPlayerInfoKt.getSystemMediaPlayerInfo();
                return;
            }
            case 0: {
                ** GOTO lbl12
            }
            case 2: {
                var2_1 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("eakp", eakj(int ), (int)2);
lbl12:
                // 2 sources

                var2_1 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("eakn", eakj(int ), (int)0);
            }
            case 1: 
        }
        while (true) {
            var2_1 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("eako", eakj(int ), (int)1);
        }
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public List<IMediaSession> getMediaSessions() {
        block28: {
            v0 /* !! */  = MediaPlayerInfo$Instance.kb;
            if (true) ** GOTO lbl5
            block16: while (true) {
                v0 /* !! */  = (long)(v1 - MediaPlayerInfo$Instance.eakm("eakt", eakq(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2144526194: {
                        v1 = MediaPlayerInfo$Instance.eakm("eaku", eakq(int ), (int)1);
                        continue block16;
                    }
                    case -2040719083: {
                        v1 = MediaPlayerInfo$Instance.eakm("eakv", eakq(int ), (int)2);
                        continue block16;
                    }
                    case 635098469: {
                        v1 = MediaPlayerInfo$Instance.eakm("eakw", eakq(int ), (int)3);
                        continue block16;
                    }
                    case 2074317534: {
                        break block16;
                    }
                }
                break;
            }
            var3_1 = MediaPlayerInfo$Instance.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = MediaPlayerInfo$Instance.kb - MediaPlayerInfo$Instance.eakm("eakx", eakq(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == MediaPlayerInfo$Instance.eakm("eaky", eakj(int ), (int)3)) break;
                v2 /* !! */  = (long)MediaPlayerInfo$Instance.eakm("eakz", eakj(int ), (int)4);
            }
            var2_2 /* !! */  = MediaPlayerInfo$Instance.b;
            v3 /* !! */  = MediaPlayerInfo$Instance.kb;
            block18: while (true) {
                switch ((int)v3 /* !! */ ) {
                    case -1028243032: {
                        v3 /* !! */  = (long)(MediaPlayerInfo$Instance.eakm("ealb", eakq(int ), (int)6) - MediaPlayerInfo$Instance.eakm("eala", eakq(int ), (int)5));
                        continue block18;
                    }
                    case 2074317534: {
                        break block18;
                    }
                }
                break;
            }
            var1_3 = MediaPlayerInfo$Instance.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 != false) return null;
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block19: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = MediaPlayerInfo$Instance.kb - MediaPlayerInfo$Instance.eakm("ealc", eakq(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != MediaPlayerInfo$Instance.eakm("eald", eakj(int ), (int)5)) {
                                v4 /* !! */  = (long)MediaPlayerInfo$Instance.eakm("eale", eakj(int ), (int)6);
                                continue;
                            }
                            ** GOTO lbl57
                            break;
                        }
                    }
                    case 0: {
                        ** GOTO lbl63
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("ealk", eakj(int ), (int)11);
                        if (var3_1) {
                            throw null;
                        }
                        break block28;
                    }
                    case 3: {
                        break block28;
                    }
lbl57:
                    // 1 sources

                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = MediaPlayerInfo$Instance.kb - MediaPlayerInfo$Instance.eakm("ealf", eakq(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == MediaPlayerInfo$Instance.eakm("ealg", eakj(int ), (int)7)) {
                            return this.$$delegate_0.getMediaSessions();
                        }
                        v5 /* !! */  = (long)MediaPlayerInfo$Instance.eakm("ealh", eakj(int ), (int)8);
                    }
lbl63:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("eali", eakj(int ), (int)9);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block19;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("ealj", eakj(int ), (int)10);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)MediaPlayerInfo$Instance.eakm("eall", eakj(int ), (int)12);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ealm() {
        MediaPlayerInfo$Instance.eakk[0] = 604834515;
        MediaPlayerInfo$Instance.eakk[1] = -345475796;
        MediaPlayerInfo$Instance.eakk[2] = -1526431734;
        MediaPlayerInfo$Instance.eakk[3] = -1189968105;
        MediaPlayerInfo$Instance.eakk[4] = -336537371;
        MediaPlayerInfo$Instance.eakk[5] = -1288901396;
        MediaPlayerInfo$Instance.eakk[6] = 1048965142;
        MediaPlayerInfo$Instance.eakk[7] = 769341992;
        MediaPlayerInfo$Instance.eakk[8] = 1325107887;
        MediaPlayerInfo$Instance.eakk[9] = 1018455780;
        MediaPlayerInfo$Instance.eakk[10] = 796594056;
        MediaPlayerInfo$Instance.eakk[11] = 756699689;
        MediaPlayerInfo$Instance.eakk[12] = -638257049;
    }

    private static /* synthetic */ void ealo() {
        MediaPlayerInfo$Instance.eakr[0] = 8433607741497381162L;
        MediaPlayerInfo$Instance.eakr[1] = -5688610941108317820L;
        MediaPlayerInfo$Instance.eakr[2] = 4619186745850341868L;
        MediaPlayerInfo$Instance.eakr[3] = -8439566122696248167L;
        MediaPlayerInfo$Instance.eakr[4] = -1134667304277064507L;
        MediaPlayerInfo$Instance.eakr[5] = -4343012636548511409L;
        MediaPlayerInfo$Instance.eakr[6] = -9136315089898685014L;
        MediaPlayerInfo$Instance.eakr[7] = -8651189635264489957L;
        MediaPlayerInfo$Instance.eakr[8] = -3469827693009254316L;
    }

    static {
        eakk = new int[13];
        eakl = new int[13];
        MediaPlayerInfo$Instance.ealm();
        MediaPlayerInfo$Instance.ealn();
        eakr = new long[9];
        eaks = new long[9];
        MediaPlayerInfo$Instance.ealo();
        MediaPlayerInfo$Instance.ealp();
        $$INSTANCE = new MediaPlayerInfo$Instance();
    }
}

