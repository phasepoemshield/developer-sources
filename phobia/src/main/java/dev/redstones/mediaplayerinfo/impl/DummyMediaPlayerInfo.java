/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 */
package dev.redstones.mediaplayerinfo.impl;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Ldev/redstones/mediaplayerinfo/impl/DummyMediaPlayerInfo;", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "()V", "getMediaSessions", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "MediaPlayerInfo"})
public final class DummyMediaPlayerInfo
implements MediaPlayerInfo {
    private static long[] ceed;
    private static int[] ceei;
    public static final DummyMediaPlayerInfo INSTANCE;
    public static final int b;
    public static final boolean a;
    public static final long fl = 6969785842995450266L;
    private static long[] ceee;
    public static final boolean c;
    private static int[] ceej;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<IMediaSession> getMediaSessions() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = DummyMediaPlayerInfo.fl - DummyMediaPlayerInfo.ceef("ceeg", ceec(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == DummyMediaPlayerInfo.ceef("ceek", ceeh(int ), (int)0)) break;
            v0 /* !! */  = (long)DummyMediaPlayerInfo.ceef("ceel", ceeh(int ), (int)1);
        }
        var3_1 = DummyMediaPlayerInfo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = DummyMediaPlayerInfo.fl - DummyMediaPlayerInfo.ceef("ceem", ceec(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == DummyMediaPlayerInfo.ceef("ceen", ceeh(int ), (int)2)) break;
            v1 /* !! */  = (long)DummyMediaPlayerInfo.ceef("ceeo", ceeh(int ), (int)3);
        }
        var2_2 /* !! */  = DummyMediaPlayerInfo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = DummyMediaPlayerInfo.fl - DummyMediaPlayerInfo.ceef("ceep", ceec(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == DummyMediaPlayerInfo.ceef("ceeq", ceeh(int ), (int)4)) break;
            v2 /* !! */  = (long)DummyMediaPlayerInfo.ceef("ceer", ceeh(int ), (int)5);
        }
        var1_3 = DummyMediaPlayerInfo.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = DummyMediaPlayerInfo.fl - DummyMediaPlayerInfo.ceef("cees", ceec(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == DummyMediaPlayerInfo.ceef("ceet", ceeh(int ), (int)6)) break;
                    v3 /* !! */  = (long)DummyMediaPlayerInfo.ceef("ceeu", ceeh(int ), (int)7);
                }
                return CollectionsKt.emptyList();
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)DummyMediaPlayerInfo.ceef("ceev", ceeh(int ), (int)8);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)DummyMediaPlayerInfo.ceef("ceew", ceeh(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)DummyMediaPlayerInfo.ceef("ceex", ceeh(int ), (int)10);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)DummyMediaPlayerInfo.ceef("ceey", ceeh(int ), (int)11);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cefc() {
        DummyMediaPlayerInfo.ceee[0] = 983807453147071844L;
        DummyMediaPlayerInfo.ceee[1] = 6330595130214292610L;
        DummyMediaPlayerInfo.ceee[2] = 7020281024858877246L;
        DummyMediaPlayerInfo.ceee[3] = -233909038028126119L;
    }

    private DummyMediaPlayerInfo() {
    }

    static {
        ceei = new int[12];
        ceej = new int[12];
        DummyMediaPlayerInfo.ceez();
        DummyMediaPlayerInfo.cefa();
        ceed = new long[4];
        ceee = new long[4];
        DummyMediaPlayerInfo.cefb();
        DummyMediaPlayerInfo.cefc();
        INSTANCE = new DummyMediaPlayerInfo();
    }

    private static /* synthetic */ void cefb() {
        DummyMediaPlayerInfo.ceed[0] = 6623633607121385647L;
        DummyMediaPlayerInfo.ceed[1] = 7997888790132817964L;
        DummyMediaPlayerInfo.ceed[2] = -2264361334777840906L;
        DummyMediaPlayerInfo.ceed[3] = 5562015411337564608L;
    }

    private static /* synthetic */ long ceec(int n2) {
        return ceed[n2] ^ ceee[n2];
    }

    private static /* synthetic */ void cefa() {
        DummyMediaPlayerInfo.ceej[0] = 688748328;
        DummyMediaPlayerInfo.ceej[1] = 1218768765;
        DummyMediaPlayerInfo.ceej[2] = -5078222;
        DummyMediaPlayerInfo.ceej[3] = -996816791;
        DummyMediaPlayerInfo.ceej[4] = -1037595992;
        DummyMediaPlayerInfo.ceej[5] = -1169543029;
        DummyMediaPlayerInfo.ceej[6] = 1316972459;
        DummyMediaPlayerInfo.ceej[7] = 797441622;
        DummyMediaPlayerInfo.ceej[8] = -1781211280;
        DummyMediaPlayerInfo.ceej[9] = 432893649;
        DummyMediaPlayerInfo.ceej[10] = 1415254731;
        DummyMediaPlayerInfo.ceej[11] = -65926480;
    }

    private static /* synthetic */ void ceez() {
        DummyMediaPlayerInfo.ceei[0] = 688748329;
        DummyMediaPlayerInfo.ceei[1] = -1220175422;
        DummyMediaPlayerInfo.ceei[2] = -5078221;
        DummyMediaPlayerInfo.ceei[3] = -886295528;
        DummyMediaPlayerInfo.ceei[4] = -1037595991;
        DummyMediaPlayerInfo.ceei[5] = 1932630561;
        DummyMediaPlayerInfo.ceei[6] = 1316972458;
        DummyMediaPlayerInfo.ceei[7] = -1721861655;
        DummyMediaPlayerInfo.ceei[8] = -1781211278;
        DummyMediaPlayerInfo.ceei[9] = 432893650;
        DummyMediaPlayerInfo.ceei[10] = 1415254730;
        DummyMediaPlayerInfo.ceei[11] = -65926477;
    }

    public static /* synthetic */ CallSite ceef(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int ceeh(int n2) {
        return ceei[n2] ^ ceej[n2];
    }
}

