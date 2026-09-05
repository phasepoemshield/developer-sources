/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.io.TextStreamsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.freedesktop.dbus.DBusMap
 *  org.jetbrains.annotations.NotNull
 */
package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.freedesktop.dbus.DBusMap;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2={"Ldev/redstones/mediaplayerinfo/impl/linux/LinuxMediaSession;", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "dbus", "Ldev/redstones/mediaplayerinfo/impl/linux/dbus/Player;", "owner", "", "(Ldev/redstones/mediaplayerinfo/impl/linux/dbus/Player;Ljava/lang/String;)V", "media", "Ldev/redstones/mediaplayerinfo/MediaInfo;", "getMedia", "()Ldev/redstones/mediaplayerinfo/MediaInfo;", "getOwner", "()Ljava/lang/String;", "generateMediaInfo", "next", "", "pause", "play", "playPause", "previous", "stop", "MediaPlayerInfo"})
public final class LinuxMediaSession
implements IMediaSession {
    private final MediaInfo media;
    private final Player dbus;
    private static long[] hhlr;
    private static int[] hhlf;
    public static final boolean c;
    private static int[] hhlg;
    public static final boolean a;
    private final String owner;
    public static final int b;
    private static long[] hhlq;
    public static final long oj = -8525035991871058094L;

    private static /* synthetic */ long hhlp(int n2) {
        return hhlq[n2] ^ hhlr[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void playPause() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhot", hhlp(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == LinuxMediaSession.hhlh("hhou", hhle(int ), (int)48)) break;
            v0 /* !! */  = (long)LinuxMediaSession.hhlh("hhov", hhle(int ), (int)49);
        }
        var3_1 = LinuxMediaSession.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhow", hhlp(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == LinuxMediaSession.hhlh("hhox", hhle(int ), (int)50)) break;
            v1 /* !! */  = (long)LinuxMediaSession.hhlh("hhoy", hhle(int ), (int)51);
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhoz", hhlp(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == LinuxMediaSession.hhlh("hhpa", hhle(int ), (int)52)) break;
            v2 /* !! */  = (long)LinuxMediaSession.hhlh("hhpb", hhle(int ), (int)53);
        }
        var1_3 = LinuxMediaSession.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhpc", hhlp(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == LinuxMediaSession.hhlh("hhpd", hhle(int ), (int)54)) break;
                    v3 /* !! */  = (long)LinuxMediaSession.hhlh("hhpe", hhle(int ), (int)55);
                }
                v4 /* !! */  = LinuxMediaSession.oj;
                if (true) ** GOTO lbl40
                block18: while (true) {
                    v4 /* !! */  = (long)(v5 - LinuxMediaSession.hhlh("hhpf", hhlp(int ), (int)36));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -823100730: {
                            v5 = LinuxMediaSession.hhlh("hhpg", hhlp(int ), (int)37);
                            continue block18;
                        }
                        case -686092462: {
                            break block18;
                        }
                        case 40368405: {
                            v5 = LinuxMediaSession.hhlh("hhpi", hhlp(int ), (int)38);
                            continue block18;
                        }
                    }
                    break;
                }
                this.dbus.PlayPause();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl52:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhpj", hhle(int ), (int)56);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhpk", hhle(int ), (int)57);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhpl", hhle(int ), (int)58);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhpm", hhle(int ), (int)59);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhpn", hhle(int ), (int)60);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhpo", hhle(int ), (int)61);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhtv() {
        LinuxMediaSession.hhlf[100] = -930258446;
        LinuxMediaSession.hhlf[101] = 1184304949;
        LinuxMediaSession.hhlf[102] = 1610557766;
        LinuxMediaSession.hhlf[103] = 1543222983;
        LinuxMediaSession.hhlf[104] = -1876972800;
        LinuxMediaSession.hhlf[105] = 1855128749;
        LinuxMediaSession.hhlf[106] = 1154390390;
        LinuxMediaSession.hhlf[107] = 200217940;
        LinuxMediaSession.hhlf[108] = -1723657191;
        LinuxMediaSession.hhlf[109] = 1642953921;
        LinuxMediaSession.hhlf[110] = 703957157;
        LinuxMediaSession.hhlf[111] = -1286693413;
        LinuxMediaSession.hhlf[112] = 216625690;
        LinuxMediaSession.hhlf[113] = 161081108;
        LinuxMediaSession.hhlf[114] = 2104803910;
        LinuxMediaSession.hhlf[115] = 1618022679;
        LinuxMediaSession.hhlf[116] = 91460001;
        LinuxMediaSession.hhlf[117] = 474200451;
        LinuxMediaSession.hhlf[118] = 538677293;
        LinuxMediaSession.hhlf[119] = -517900062;
        LinuxMediaSession.hhlf[120] = -113438689;
        LinuxMediaSession.hhlf[121] = -1147338137;
        LinuxMediaSession.hhlf[122] = 1624472546;
        LinuxMediaSession.hhlf[123] = -1928727690;
        LinuxMediaSession.hhlf[124] = -1346424991;
        LinuxMediaSession.hhlf[125] = -979902173;
        LinuxMediaSession.hhlf[126] = 1303644047;
        LinuxMediaSession.hhlf[127] = -1065363741;
        LinuxMediaSession.hhlf[128] = -1923733028;
        LinuxMediaSession.hhlf[129] = -1022747942;
        LinuxMediaSession.hhlf[130] = -21004576;
        LinuxMediaSession.hhlf[131] = 1155891961;
        LinuxMediaSession.hhlf[132] = -1201091352;
        LinuxMediaSession.hhlf[133] = 427375894;
        LinuxMediaSession.hhlf[134] = 2023246002;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final MediaInfo generateMediaInfo() {
        block69: {
            var14_1 = LinuxMediaSession.c;
            var13_2 /* !! */  = LinuxMediaSession.b;
            var12_3 = LinuxMediaSession.a;
            if (var14_1) {
                throw null;
lbl6:
                // 16 sources

                return null;
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            var1_4 = (DBusMap)LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "Metadata");
            if (var12_3 || var12_3) ** GOTO lbl6
            var2_5 = Intrinsics.areEqual(LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "PlaybackStatus"), (Object)"Playing");
            if (var12_3 || var12_3) ** GOTO lbl6
            var3_6 = (long)((Number)LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "Position")).doubleValue() / (long)LinuxMediaSession.hhlh("hhsd", hhle(int ), (int)96);
            if (var12_3 || var12_3) ** GOTO lbl6
            v0 = var1_4.get((Object)"mpris:length");
            Intrinsics.checkNotNull((Object)v0);
            var5_7 = Long.parseLong(v0.toString()) / (long)LinuxMediaSession.hhlh("hhse", hhle(int ), (int)97);
            if (var12_3 || var12_3) ** GOTO lbl6
            v1 = var1_4.get((Object)"xesam:title");
            Intrinsics.checkNotNull((Object)v1, (String)"null cannot be cast to non-null type kotlin.String");
            var7_8 = (String)v1;
            if (var12_3 || var12_3) ** GOTO lbl6
            var10_9 = var1_4.get((Object)"xesam:artist");
            if (var12_3 || var12_3) ** GOTO lbl6
            var11_10 = LinuxMediaSession.hhlh("hhsf", hhle(int ), (int)98);
            if (var12_3 || var12_3) ** GOTO lbl6
            if (!(var10_9 instanceof String)) break block69;
            if (var12_3 || var12_3) ** GOTO lbl6
            v2 = (String)var10_9;
            if (var14_1) {
                throw null;
            }
            ** GOTO lbl41
        }
        if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_3 || var12_3) ** GOTO lbl6
                Intrinsics.checkNotNull((Object)var10_9, (String)"null cannot be cast to non-null type kotlin.collections.List<*>");
                if (var12_3) ** GOTO lbl6
                v2 = var8_11 = CollectionsKt.joinToString$default((Iterable)((List)var10_9), (CharSequence)", ", null, null, (int)LinuxMediaSession.hhlh("hhsg", hhle(int ), (int)99), null, null, (int)LinuxMediaSession.hhlh("hhsh", hhle(int ), (int)100), null);
lbl41:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var9_12 = var1_4.get((Object)"mpris:artUrl");
                if (var12_3 || var12_3) ** GOTO lbl6
                if (!(var9_12 instanceof String)) ** GOTO lbl50
                if (var12_3 || var12_3) ** GOTO lbl6
                v3 = TextStreamsKt.readBytes((URL)new URL((String)var9_12));
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl52
lbl50:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                v3 = new byte[]{};
lbl52:
                // 2 sources

                var10_9 = v3;
                if (!var12_3 && !var12_3) ** break;
                ** continue;
                return new MediaInfo(var7_8, var8_11, (byte[])var10_9, var3_6, var5_7, var2_5);
            }
lbl56:
            // 2 sources

            case 0: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsj", hhle(int ), (int)101);
                if (!var14_1) break;
                throw null;
            }
lbl60:
            // 2 sources

            case 1: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsk", hhle(int ), (int)102);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl65:
            // 2 sources

            case 2: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsl", hhle(int ), (int)103);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 3: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsm", hhle(int ), (int)104);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl75:
            // 4 sources

            case 4: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsn", hhle(int ), (int)105);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl80:
            // 2 sources

            case 5: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhso", hhle(int ), (int)106);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 6: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsp", hhle(int ), (int)107);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 7: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsq", hhle(int ), (int)108);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl95:
            // 3 sources

            case 8: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsr", hhle(int ), (int)109);
                if (!var14_1) ** GOTO lbl65
                throw null;
            }
lbl99:
            // 3 sources

            case 9: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhss", hhle(int ), (int)110);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl104:
            // 3 sources

            case 10: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhst", hhle(int ), (int)111);
                if (!var14_1) ** GOTO lbl60
                throw null;
            }
lbl108:
            // 2 sources

            case 11: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsu", hhle(int ), (int)112);
                if (!var14_1) ** GOTO lbl75
                throw null;
            }
lbl112:
            // 3 sources

            case 12: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsv", hhle(int ), (int)113);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl117:
            // 2 sources

            case 13: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsw", hhle(int ), (int)114);
                if (!var14_1) ** GOTO lbl112
                throw null;
            }
lbl121:
            // 2 sources

            case 14: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsx", hhle(int ), (int)115);
                if (!var14_1) ** GOTO lbl99
                throw null;
            }
lbl125:
            // 2 sources

            case 15: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsy", hhle(int ), (int)116);
                if (!var14_1) ** GOTO lbl95
                throw null;
            }
            case 16: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhsz", hhle(int ), (int)117);
                if (!var14_1) ** GOTO lbl99
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtb", hhle(int ), (int)118);
                    if (!var14_1) ** GOTO lbl125
                    throw null;
                }
            }
lbl138:
            // 2 sources

            case 18: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtc", hhle(int ), (int)119);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl143:
            // 2 sources

            case 19: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtd", hhle(int ), (int)120);
                if (!var14_1) ** GOTO lbl75
                throw null;
            }
            case 20: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhte", hhle(int ), (int)121);
                if (!var14_1) ** GOTO lbl112
                throw null;
            }
lbl151:
            // 2 sources

            case 21: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtf", hhle(int ), (int)122);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl156:
            // 2 sources

            case 22: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtg", hhle(int ), (int)123);
                if (!var14_1) ** GOTO lbl108
                throw null;
            }
lbl160:
            // 2 sources

            case 23: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhth", hhle(int ), (int)124);
                if (var14_1) {
                    throw null;
                }
            }
            case 24: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhti", hhle(int ), (int)125);
                if (!var14_1) ** GOTO lbl151
                throw null;
            }
lbl168:
            // 3 sources

            case 25: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtj", hhle(int ), (int)126);
                if (!var14_1) ** GOTO lbl56
                throw null;
            }
lbl172:
            // 3 sources

            case 26: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtk", hhle(int ), (int)127);
                if (!var14_1) ** GOTO lbl156
                throw null;
            }
lbl176:
            // 3 sources

            case 27: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtl", hhle(int ), (int)128);
                if (!var14_1) ** GOTO lbl80
                throw null;
            }
            case 28: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtm", hhle(int ), (int)129);
                if (!var14_1) ** GOTO lbl176
                throw null;
            }
            case 29: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtn", hhle(int ), (int)130);
                if (!var14_1) ** GOTO lbl143
                throw null;
            }
            case 30: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhto", hhle(int ), (int)131);
                if (!var14_1) ** GOTO lbl172
                throw null;
            }
            case 31: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtp", hhle(int ), (int)132);
                if (!var14_1) ** GOTO lbl104
                throw null;
            }
lbl196:
            // 2 sources

            case 32: {
                var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhtr", hhle(int ), (int)133);
                if (!var14_1) ** GOTO lbl95
                throw null;
            }
            case 33: 
        }
        var13_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhts", hhle(int ), (int)134);
        ** while (!var14_1)
lbl203:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void pause() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhny", hhlp(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == LinuxMediaSession.hhlh("hhnz", hhle(int ), (int)36)) break;
            v0 /* !! */  = (long)LinuxMediaSession.hhlh("hhoa", hhle(int ), (int)37);
        }
        var3_1 = LinuxMediaSession.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhob", hhlp(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == LinuxMediaSession.hhlh("hhoc", hhle(int ), (int)38)) break;
            v1 /* !! */  = (long)LinuxMediaSession.hhlh("hhod", hhle(int ), (int)39);
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        v2 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(LinuxMediaSession.hhlh("hhof", hhlp(int ), (int)27) - LinuxMediaSession.hhlh("hhoe", hhlp(int ), (int)26));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -686092462: {
                    break block19;
                }
                case 1020124794: {
                    continue block19;
                }
            }
            break;
        }
        var1_3 = LinuxMediaSession.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl30:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhog", hhlp(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == LinuxMediaSession.hhlh("hhoh", hhle(int ), (int)40)) break;
                    v3 /* !! */  = (long)LinuxMediaSession.hhlh("hhoi", hhle(int ), (int)41);
                }
                v4 /* !! */  = LinuxMediaSession.oj;
                if (true) ** GOTO lbl43
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - LinuxMediaSession.hhlh("hhoj", hhlp(int ), (int)29));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -883627186: {
                            v5 = LinuxMediaSession.hhlh("hhok", hhlp(int ), (int)30);
                            continue block22;
                        }
                        case -686092462: {
                            break block22;
                        }
                        case 1764318145: {
                            v5 = LinuxMediaSession.hhlh("hhol", hhlp(int ), (int)31);
                            continue block22;
                        }
                    }
                    break;
                }
                this.dbus.Pause();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhom", hhle(int ), (int)42);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl74
                    break;
                }
            }
lbl61:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhon", hhle(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 2: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhoo", hhle(int ), (int)44);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl70:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhop", hhle(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
lbl74:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhoq", hhle(int ), (int)46);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhos", hhle(int ), (int)47);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhtx() {
        LinuxMediaSession.hhlg[100] = -930258484;
        LinuxMediaSession.hhlg[101] = 1184304948;
        LinuxMediaSession.hhlg[102] = 1610557788;
        LinuxMediaSession.hhlg[103] = 1543222995;
        LinuxMediaSession.hhlg[104] = -1876972795;
        LinuxMediaSession.hhlg[105] = 1855128746;
        LinuxMediaSession.hhlg[106] = 1154390368;
        LinuxMediaSession.hhlg[107] = 200217932;
        LinuxMediaSession.hhlg[108] = -1723657160;
        LinuxMediaSession.hhlg[109] = 1642953936;
        LinuxMediaSession.hhlg[110] = 703957154;
        LinuxMediaSession.hhlg[111] = -1286693429;
        LinuxMediaSession.hhlg[112] = 216625690;
        LinuxMediaSession.hhlg[113] = 161081112;
        LinuxMediaSession.hhlg[114] = 2104803925;
        LinuxMediaSession.hhlg[115] = 1618022657;
        LinuxMediaSession.hhlg[116] = 91460004;
        LinuxMediaSession.hhlg[117] = 474200456;
        LinuxMediaSession.hhlg[118] = 538677287;
        LinuxMediaSession.hhlg[119] = -517900062;
        LinuxMediaSession.hhlg[120] = -113438697;
        LinuxMediaSession.hhlg[121] = -1147338139;
        LinuxMediaSession.hhlg[122] = 1624472558;
        LinuxMediaSession.hhlg[123] = -1928727692;
        LinuxMediaSession.hhlg[124] = -1346425024;
        LinuxMediaSession.hhlg[125] = -979902162;
        LinuxMediaSession.hhlg[126] = 1303644032;
        LinuxMediaSession.hhlg[127] = -1065363734;
        LinuxMediaSession.hhlg[128] = -1923732995;
        LinuxMediaSession.hhlg[129] = -1022747956;
        LinuxMediaSession.hhlg[130] = -21004575;
        LinuxMediaSession.hhlg[131] = 1155891953;
        LinuxMediaSession.hhlg[132] = -1201091329;
        LinuxMediaSession.hhlg[133] = 427375878;
        LinuxMediaSession.hhlg[134] = 2023245987;
    }

    private static /* synthetic */ void hhtw() {
        LinuxMediaSession.hhlg[0] = 1816268073;
        LinuxMediaSession.hhlg[1] = -1925293594;
        LinuxMediaSession.hhlg[2] = 364820190;
        LinuxMediaSession.hhlg[3] = 1042247923;
        LinuxMediaSession.hhlg[4] = -529436086;
        LinuxMediaSession.hhlg[5] = -1984584598;
        LinuxMediaSession.hhlg[6] = 2137671720;
        LinuxMediaSession.hhlg[7] = -1034024125;
        LinuxMediaSession.hhlg[8] = -850902787;
        LinuxMediaSession.hhlg[9] = 1095058971;
        LinuxMediaSession.hhlg[10] = -1330203820;
        LinuxMediaSession.hhlg[11] = -1314460981;
        LinuxMediaSession.hhlg[12] = -1747464267;
        LinuxMediaSession.hhlg[13] = 701804497;
        LinuxMediaSession.hhlg[14] = 1469432537;
        LinuxMediaSession.hhlg[15] = 194998398;
        LinuxMediaSession.hhlg[16] = 1239672292;
        LinuxMediaSession.hhlg[17] = 1886230223;
        LinuxMediaSession.hhlg[18] = 971438653;
        LinuxMediaSession.hhlg[19] = -1045787413;
        LinuxMediaSession.hhlg[20] = 1223847113;
        LinuxMediaSession.hhlg[21] = -1882888620;
        LinuxMediaSession.hhlg[22] = -1876550714;
        LinuxMediaSession.hhlg[23] = 1795313226;
        LinuxMediaSession.hhlg[24] = 896105697;
        LinuxMediaSession.hhlg[25] = 1129986779;
        LinuxMediaSession.hhlg[26] = 300441960;
        LinuxMediaSession.hhlg[27] = 52072094;
        LinuxMediaSession.hhlg[28] = -582139550;
        LinuxMediaSession.hhlg[29] = -1779595438;
        LinuxMediaSession.hhlg[30] = -231897115;
        LinuxMediaSession.hhlg[31] = 474150984;
        LinuxMediaSession.hhlg[32] = -642492846;
        LinuxMediaSession.hhlg[33] = 974240688;
        LinuxMediaSession.hhlg[34] = 1510805859;
        LinuxMediaSession.hhlg[35] = -724346530;
        LinuxMediaSession.hhlg[36] = -1264088257;
        LinuxMediaSession.hhlg[37] = -1448411114;
        LinuxMediaSession.hhlg[38] = -690244873;
        LinuxMediaSession.hhlg[39] = -826986621;
        LinuxMediaSession.hhlg[40] = 462322053;
        LinuxMediaSession.hhlg[41] = -1556413600;
        LinuxMediaSession.hhlg[42] = 857834670;
        LinuxMediaSession.hhlg[43] = -1001628628;
        LinuxMediaSession.hhlg[44] = -1951295413;
        LinuxMediaSession.hhlg[45] = 670237833;
        LinuxMediaSession.hhlg[46] = -1791995475;
        LinuxMediaSession.hhlg[47] = -126708082;
        LinuxMediaSession.hhlg[48] = 53401947;
        LinuxMediaSession.hhlg[49] = -407472371;
        LinuxMediaSession.hhlg[50] = -289720285;
        LinuxMediaSession.hhlg[51] = -495630730;
        LinuxMediaSession.hhlg[52] = 266618422;
        LinuxMediaSession.hhlg[53] = 136941986;
        LinuxMediaSession.hhlg[54] = -513923186;
        LinuxMediaSession.hhlg[55] = -1629482190;
        LinuxMediaSession.hhlg[56] = 372750511;
        LinuxMediaSession.hhlg[57] = -1732179523;
        LinuxMediaSession.hhlg[58] = -1405334616;
        LinuxMediaSession.hhlg[59] = -1363999944;
        LinuxMediaSession.hhlg[60] = -894476552;
        LinuxMediaSession.hhlg[61] = 274476443;
        LinuxMediaSession.hhlg[62] = 1642278733;
        LinuxMediaSession.hhlg[63] = -527392826;
        LinuxMediaSession.hhlg[64] = -707176785;
        LinuxMediaSession.hhlg[65] = -561342927;
        LinuxMediaSession.hhlg[66] = -1696782981;
        LinuxMediaSession.hhlg[67] = 440475317;
        LinuxMediaSession.hhlg[68] = -1304211991;
        LinuxMediaSession.hhlg[69] = -1406384153;
        LinuxMediaSession.hhlg[70] = -1338040047;
        LinuxMediaSession.hhlg[71] = -44723162;
        LinuxMediaSession.hhlg[72] = 1654040971;
        LinuxMediaSession.hhlg[73] = 472580377;
        LinuxMediaSession.hhlg[74] = -2051417998;
        LinuxMediaSession.hhlg[75] = -1970183130;
        LinuxMediaSession.hhlg[76] = 930029999;
        LinuxMediaSession.hhlg[77] = 294248591;
        LinuxMediaSession.hhlg[78] = 209688515;
        LinuxMediaSession.hhlg[79] = 1426294942;
        LinuxMediaSession.hhlg[80] = 984603676;
        LinuxMediaSession.hhlg[81] = 44683205;
        LinuxMediaSession.hhlg[82] = 568716078;
        LinuxMediaSession.hhlg[83] = 1012170876;
        LinuxMediaSession.hhlg[84] = 2090265521;
        LinuxMediaSession.hhlg[85] = 1843570741;
        LinuxMediaSession.hhlg[86] = 1761719310;
        LinuxMediaSession.hhlg[87] = -1521195435;
        LinuxMediaSession.hhlg[88] = -720694880;
        LinuxMediaSession.hhlg[89] = 1785630212;
        LinuxMediaSession.hhlg[90] = -246183232;
        LinuxMediaSession.hhlg[91] = -243602673;
        LinuxMediaSession.hhlg[92] = 149662582;
        LinuxMediaSession.hhlg[93] = 940677081;
        LinuxMediaSession.hhlg[94] = 256664740;
        LinuxMediaSession.hhlg[95] = -1640156356;
        LinuxMediaSession.hhlg[96] = -285655974;
        LinuxMediaSession.hhlg[97] = 514233620;
        LinuxMediaSession.hhlg[98] = -1560658818;
        LinuxMediaSession.hhlg[99] = 858883420;
    }

    public static /* synthetic */ CallSite hhlh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hhtt() {
        LinuxMediaSession.hhlf[0] = 1816268077;
        LinuxMediaSession.hhlf[1] = -1925293596;
        LinuxMediaSession.hhlf[2] = 364820187;
        LinuxMediaSession.hhlf[3] = 1042247926;
        LinuxMediaSession.hhlf[4] = -529436087;
        LinuxMediaSession.hhlf[5] = -1984584600;
        LinuxMediaSession.hhlf[6] = 2137671721;
        LinuxMediaSession.hhlf[7] = -197225768;
        LinuxMediaSession.hhlf[8] = 850902786;
        LinuxMediaSession.hhlf[9] = -1211310761;
        LinuxMediaSession.hhlf[10] = 1330203819;
        LinuxMediaSession.hhlf[11] = 1698745641;
        LinuxMediaSession.hhlf[12] = -1747464265;
        LinuxMediaSession.hhlf[13] = 701804498;
        LinuxMediaSession.hhlf[14] = 1469432536;
        LinuxMediaSession.hhlf[15] = 194998396;
        LinuxMediaSession.hhlf[16] = -1239672293;
        LinuxMediaSession.hhlf[17] = 271554927;
        LinuxMediaSession.hhlf[18] = 971438653;
        LinuxMediaSession.hhlf[19] = -1045787414;
        LinuxMediaSession.hhlf[20] = 1223847114;
        LinuxMediaSession.hhlf[21] = -1882888617;
        LinuxMediaSession.hhlf[22] = 1876550713;
        LinuxMediaSession.hhlf[23] = -1759056286;
        LinuxMediaSession.hhlf[24] = 896105696;
        LinuxMediaSession.hhlf[25] = 1844924790;
        LinuxMediaSession.hhlf[26] = -300441961;
        LinuxMediaSession.hhlf[27] = -280467740;
        LinuxMediaSession.hhlf[28] = 582139549;
        LinuxMediaSession.hhlf[29] = 1574511964;
        LinuxMediaSession.hhlf[30] = -231897115;
        LinuxMediaSession.hhlf[31] = 474150985;
        LinuxMediaSession.hhlf[32] = -642492846;
        LinuxMediaSession.hhlf[33] = 974240689;
        LinuxMediaSession.hhlf[34] = 1510805858;
        LinuxMediaSession.hhlf[35] = -724346530;
        LinuxMediaSession.hhlf[36] = 1264088256;
        LinuxMediaSession.hhlf[37] = -1095683206;
        LinuxMediaSession.hhlf[38] = 690244872;
        LinuxMediaSession.hhlf[39] = -1222388051;
        LinuxMediaSession.hhlf[40] = -462322054;
        LinuxMediaSession.hhlf[41] = -1585805606;
        LinuxMediaSession.hhlf[42] = 857834666;
        LinuxMediaSession.hhlf[43] = -1001628631;
        LinuxMediaSession.hhlf[44] = -1951295409;
        LinuxMediaSession.hhlf[45] = 670237832;
        LinuxMediaSession.hhlf[46] = -1791995476;
        LinuxMediaSession.hhlf[47] = -126708084;
        LinuxMediaSession.hhlf[48] = -53401948;
        LinuxMediaSession.hhlf[49] = -1603601762;
        LinuxMediaSession.hhlf[50] = 289720284;
        LinuxMediaSession.hhlf[51] = 1583071368;
        LinuxMediaSession.hhlf[52] = -266618423;
        LinuxMediaSession.hhlf[53] = -99084803;
        LinuxMediaSession.hhlf[54] = 513923185;
        LinuxMediaSession.hhlf[55] = 1819814986;
        LinuxMediaSession.hhlf[56] = 372750506;
        LinuxMediaSession.hhlf[57] = -1732179523;
        LinuxMediaSession.hhlf[58] = -1405334613;
        LinuxMediaSession.hhlf[59] = -1363999944;
        LinuxMediaSession.hhlf[60] = -894476547;
        LinuxMediaSession.hhlf[61] = 274476441;
        LinuxMediaSession.hhlf[62] = -1642278734;
        LinuxMediaSession.hhlf[63] = 1723108744;
        LinuxMediaSession.hhlf[64] = 707176784;
        LinuxMediaSession.hhlf[65] = -281674528;
        LinuxMediaSession.hhlf[66] = -1696782981;
        LinuxMediaSession.hhlf[67] = 440475319;
        LinuxMediaSession.hhlf[68] = -1304211987;
        LinuxMediaSession.hhlf[69] = -1406384158;
        LinuxMediaSession.hhlf[70] = -1338040046;
        LinuxMediaSession.hhlf[71] = -44723165;
        LinuxMediaSession.hhlf[72] = -1654040972;
        LinuxMediaSession.hhlf[73] = 1206334756;
        LinuxMediaSession.hhlf[74] = 2051417997;
        LinuxMediaSession.hhlf[75] = -496373472;
        LinuxMediaSession.hhlf[76] = 930029998;
        LinuxMediaSession.hhlf[77] = -1058494554;
        LinuxMediaSession.hhlf[78] = 209688519;
        LinuxMediaSession.hhlf[79] = 1426294942;
        LinuxMediaSession.hhlf[80] = 984603679;
        LinuxMediaSession.hhlf[81] = 44683206;
        LinuxMediaSession.hhlf[82] = 568716076;
        LinuxMediaSession.hhlf[83] = 1012170872;
        LinuxMediaSession.hhlf[84] = -2090265522;
        LinuxMediaSession.hhlf[85] = -780580647;
        LinuxMediaSession.hhlf[86] = -1761719311;
        LinuxMediaSession.hhlf[87] = -629851812;
        LinuxMediaSession.hhlf[88] = 720694879;
        LinuxMediaSession.hhlf[89] = -1414704801;
        LinuxMediaSession.hhlf[90] = -246183229;
        LinuxMediaSession.hhlf[91] = -243602674;
        LinuxMediaSession.hhlf[92] = 149662579;
        LinuxMediaSession.hhlf[93] = 940677080;
        LinuxMediaSession.hhlf[94] = 256664742;
        LinuxMediaSession.hhlf[95] = -1640156355;
        LinuxMediaSession.hhlf[96] = -285835750;
        LinuxMediaSession.hhlf[97] = 514447188;
        LinuxMediaSession.hhlf[98] = -1560658818;
        LinuxMediaSession.hhlf[99] = 858883420;
    }

    static {
        hhlf = new int[135];
        hhlg = new int[135];
        LinuxMediaSession.hhtt();
        LinuxMediaSession.hhtv();
        LinuxMediaSession.hhtw();
        LinuxMediaSession.hhtx();
        hhlq = new long[67];
        hhlr = new long[67];
        LinuxMediaSession.hhty();
        LinuxMediaSession.hhtz();
    }

    private static /* synthetic */ int hhle(int n2) {
        return hhlf[n2] ^ hhlg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void stop() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhpp", hhlp(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == LinuxMediaSession.hhlh("hhpq", hhle(int ), (int)62)) break;
            v0 /* !! */  = (long)LinuxMediaSession.hhlh("hhpr", hhle(int ), (int)63);
        }
        var3_1 = LinuxMediaSession.c;
        v1 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(LinuxMediaSession.hhlh("hhpu", hhlp(int ), (int)41) - LinuxMediaSession.hhlh("hhps", hhlp(int ), (int)40));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -686092462: {
                    break block24;
                }
                case -199469271: {
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhpv", hhlp(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == LinuxMediaSession.hhlh("hhpw", hhle(int ), (int)64)) break;
            v2 /* !! */  = (long)LinuxMediaSession.hhlh("hhpx", hhle(int ), (int)65);
        }
        var1_3 = LinuxMediaSession.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl30:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                v3 /* !! */  = LinuxMediaSession.oj;
                if (true) ** GOTO lbl37
                block27: while (true) {
                    v3 /* !! */  = (long)(v4 - LinuxMediaSession.hhlh("hhpy", hhlp(int ), (int)43));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -686092462: {
                            break block27;
                        }
                        case 926514696: {
                            v4 = LinuxMediaSession.hhlh("hhpz", hhlp(int ), (int)44);
                            continue block27;
                        }
                        case 1380717004: {
                            v4 = LinuxMediaSession.hhlh("hhqa", hhlp(int ), (int)45);
                            continue block27;
                        }
                        case 1823479785: {
                            v4 = LinuxMediaSession.hhlh("hhqb", hhlp(int ), (int)46);
                            continue block27;
                        }
                    }
                    break;
                }
                v5 /* !! */  = LinuxMediaSession.oj;
                if (true) ** GOTO lbl53
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - LinuxMediaSession.hhlh("hhqc", hhlp(int ), (int)47));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -686092462: {
                            break block28;
                        }
                        case -568246444: {
                            v6 = LinuxMediaSession.hhlh("hhqd", hhlp(int ), (int)48);
                            continue block28;
                        }
                        case 659638683: {
                            v6 = LinuxMediaSession.hhlh("hhqe", hhlp(int ), (int)49);
                            continue block28;
                        }
                    }
                    break;
                }
                this.dbus.Stop();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl65:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhqf", hhle(int ), (int)66);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
            }
            case 1: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhqg", hhle(int ), (int)67);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhqh", hhle(int ), (int)68);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhqi", hhle(int ), (int)69);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl84:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhqk", hhle(int ), (int)70);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhql", hhle(int ), (int)71);
        ** while (!var3_1)
lbl91:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public MediaInfo getMedia() {
        v0 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - LinuxMediaSession.hhlh("hhmj", hhlp(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1214401288: {
                    v1 = LinuxMediaSession.hhlh("hhmk", hhlp(int ), (int)7);
                    continue block23;
                }
                case -686092462: {
                    break block23;
                }
                case 176641075: {
                    v1 = LinuxMediaSession.hhlh("hhml", hhlp(int ), (int)8);
                    continue block23;
                }
                case 618536734: {
                    v1 = LinuxMediaSession.hhlh("hhmn", hhlp(int ), (int)9);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = LinuxMediaSession.c;
        v2 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - LinuxMediaSession.hhlh("hhmo", hhlp(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1678830904: {
                    v3 = LinuxMediaSession.hhlh("hhmp", hhlp(int ), (int)11);
                    continue block24;
                }
                case -686092462: {
                    break block24;
                }
                case -495485746: {
                    v3 = LinuxMediaSession.hhlh("hhmq", hhlp(int ), (int)12);
                    continue block24;
                }
                case 1416899421: {
                    v3 = LinuxMediaSession.hhlh("hhmr", hhlp(int ), (int)13);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        v4 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl39
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - LinuxMediaSession.hhlh("hhms", hhlp(int ), (int)14));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -686092462: {
                    break block25;
                }
                case 1398030728: {
                    v5 = LinuxMediaSession.hhlh("hhmt", hhlp(int ), (int)15);
                    continue block25;
                }
                case 1565391803: {
                    v5 = LinuxMediaSession.hhlh("hhmu", hhlp(int ), (int)16);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = LinuxMediaSession.a;
        if (var3_1) {
            throw null;
lbl51:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl54:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhmv", hhlp(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == LinuxMediaSession.hhlh("hhmw", hhle(int ), (int)16)) break;
                    v6 /* !! */  = (long)LinuxMediaSession.hhlh("hhmx", hhle(int ), (int)17);
                }
                return this.media;
            }
            case 0: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhmy", hhle(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhmz", hhle(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhna", hhle(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhnb", hhle(int ), (int)21);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void next() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhqm", hhlp(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == LinuxMediaSession.hhlh("hhqn", hhle(int ), (int)72)) break;
            v0 /* !! */  = (long)LinuxMediaSession.hhlh("hhqo", hhle(int ), (int)73);
        }
        var3_1 = LinuxMediaSession.c;
        v1 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - LinuxMediaSession.hhlh("hhqp", hhlp(int ), (int)51));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1241081014: {
                    v2 = LinuxMediaSession.hhlh("hhqq", hhlp(int ), (int)52);
                    continue block19;
                }
                case -686092462: {
                    break block19;
                }
                case 702936561: {
                    v2 = LinuxMediaSession.hhlh("hhqr", hhlp(int ), (int)53);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhqs", hhlp(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == LinuxMediaSession.hhlh("hhqt", hhle(int ), (int)74)) break;
            v3 /* !! */  = (long)LinuxMediaSession.hhlh("hhqu", hhle(int ), (int)75);
        }
        var1_3 = LinuxMediaSession.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhqv", hhlp(int ), (int)55)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == LinuxMediaSession.hhlh("hhqw", hhle(int ), (int)76)) break;
            v4 /* !! */  = (long)LinuxMediaSession.hhlh("hhqx", hhle(int ), (int)77);
        }
        v5 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl44
        block23: while (true) {
            v5 /* !! */  = (long)(v6 - LinuxMediaSession.hhlh("hhqy", hhlp(int ), (int)56));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -925198061: {
                    v6 = LinuxMediaSession.hhlh("hhqz", hhlp(int ), (int)57);
                    continue block23;
                }
                case -686092462: {
                    break block23;
                }
                case -485242175: {
                    v6 = LinuxMediaSession.hhlh("hhra", hhlp(int ), (int)58);
                    continue block23;
                }
            }
            break;
        }
        this.dbus.Next();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl59:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhrc", hhle(int ), (int)78);
                if (var3_1) {
                    throw null;
                }
            }
lbl63:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhrd", hhle(int ), (int)79);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 2: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhre", hhle(int ), (int)80);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
lbl72:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhrf", hhle(int ), (int)81);
                    if (!var3_1) ** GOTO lbl59
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhrg", hhle(int ), (int)82);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhrh", hhle(int ), (int)83);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void play() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhnd", hhlp(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == LinuxMediaSession.hhlh("hhne", hhle(int ), (int)22)) break;
            v0 /* !! */  = (long)LinuxMediaSession.hhlh("hhnf", hhle(int ), (int)23);
        }
        var3_1 = LinuxMediaSession.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhng", hhlp(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == LinuxMediaSession.hhlh("hhnh", hhle(int ), (int)24)) break;
            v1 /* !! */  = (long)LinuxMediaSession.hhlh("hhni", hhle(int ), (int)25);
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhnj", hhlp(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == LinuxMediaSession.hhlh("hhnk", hhle(int ), (int)26)) break;
            v2 /* !! */  = (long)LinuxMediaSession.hhlh("hhnl", hhle(int ), (int)27);
        }
        var1_3 = LinuxMediaSession.a;
        if (var3_1) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = LinuxMediaSession.oj;
                if (true) ** GOTO lbl31
                block16: while (true) {
                    v3 /* !! */  = (long)(LinuxMediaSession.hhlh("hhnn", hhlp(int ), (int)22) - LinuxMediaSession.hhlh("hhnm", hhlp(int ), (int)21));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -686092462: {
                            break block16;
                        }
                        case 523667195: {
                            continue block16;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhno", hhlp(int ), (int)23)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == LinuxMediaSession.hhlh("hhnp", hhle(int ), (int)28)) break;
                    v4 /* !! */  = (long)LinuxMediaSession.hhlh("hhnq", hhle(int ), (int)29);
                }
                this.dbus.Play();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl44:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhnr", hhle(int ), (int)30);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhns", hhle(int ), (int)31);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
lbl53:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhnt", hhle(int ), (int)32);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhnu", hhle(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhnv", hhle(int ), (int)34);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhnw", hhle(int ), (int)35);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String getOwner() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhlt", hhlp(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == LinuxMediaSession.hhlh("hhlu", hhle(int ), (int)6)) break;
            v0 /* !! */  = (long)LinuxMediaSession.hhlh("hhlv", hhle(int ), (int)7);
        }
        var3_1 = LinuxMediaSession.c;
        v1 /* !! */  = LinuxMediaSession.oj;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - LinuxMediaSession.hhlh("hhlw", hhlp(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -686092462: {
                    break block12;
                }
                case 1077490146: {
                    v2 = LinuxMediaSession.hhlh("hhlx", hhlp(int ), (int)2);
                    continue block12;
                }
                case 2110398846: {
                    v2 = LinuxMediaSession.hhlh("hhly", hhlp(int ), (int)3);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = LinuxMediaSession.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhlz", hhlp(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == LinuxMediaSession.hhlh("hhma", hhle(int ), (int)8)) break;
            v3 /* !! */  = (long)LinuxMediaSession.hhlh("hhmb", hhle(int ), (int)9);
        }
        var1_3 = LinuxMediaSession.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = LinuxMediaSession.oj - LinuxMediaSession.hhlh("hhmc", hhlp(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == LinuxMediaSession.hhlh("hhmd", hhle(int ), (int)10)) break;
                    v4 /* !! */  = (long)LinuxMediaSession.hhlh("hhme", hhle(int ), (int)11);
                }
                return this.owner;
                case 0: {
                    var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhmf", hhle(int ), (int)12);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhmg", hhle(int ), (int)13);
                        if (!var3_1) break block14;
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhmh", hhle(int ), (int)14);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)LinuxMediaSession.hhlh("hhmi", hhle(int ), (int)15);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void previous() {
        Object object = oj;
        boolean bl2 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - LinuxMediaSession.hhlh("hhri", hhlp(int ), (int)59);
            }
            switch ((int)object) {
                case -1230786516: {
                    callSite = LinuxMediaSession.hhlh("hhrj", hhlp(int ), (int)60);
                    continue block9;
                }
                case -686092462: {
                    break block9;
                }
                case -208062034: {
                    callSite = LinuxMediaSession.hhlh("hhrk", hhlp(int ), (int)61);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = oj - LinuxMediaSession.hhlh("hhrl", hhlp(int ), (int)62)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == LinuxMediaSession.hhlh("hhrm", hhle(int ), (int)84)) break;
            object2 = LinuxMediaSession.hhlh("hhrn", hhle(int ), (int)85);
        }
        int n2 = b;
        Object object3 = oj;
        block11: while (true) {
            switch ((int)object3) {
                case -686092462: {
                    break block11;
                }
                case 1671990495: {
                    object3 = LinuxMediaSession.hhlh("hhrp", hhlp(int ), (int)64) - LinuxMediaSession.hhlh("hhro", hhlp(int ), (int)63);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4 || bl4) return;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = oj - LinuxMediaSession.hhlh("hhrq", hhlp(int ), (int)65)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == LinuxMediaSession.hhlh("hhrr", hhle(int ), (int)86)) break;
            object4 = LinuxMediaSession.hhlh("hhrs", hhle(int ), (int)87);
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = oj - LinuxMediaSession.hhlh("hhrt", hhlp(int ), (int)66)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == LinuxMediaSession.hhlh("hhru", hhle(int ), (int)88)) {
                this.dbus.Previous();
                if (bl4) return;
                break;
            }
            object5 = LinuxMediaSession.hhlh("hhrv", hhle(int ), (int)89);
        }
        if (!bl4) return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public LinuxMediaSession(@NotNull Player var1_1, @NotNull String var2_2) {
        var4_3 /* !! */  = LinuxMediaSession.b;
        Intrinsics.checkNotNullParameter((Object)var1_1, (String)"dbus");
        Intrinsics.checkNotNullParameter((Object)var2_2, (String)"owner");
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.dbus = var1_1;
                this.owner = var2_2;
                this.media = this.generateMediaInfo();
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)LinuxMediaSession.hhlh("hhli", hhle(int ), (int)0);
                ** GOTO lbl-1000
            }
            case 3: {
                var4_3 /* !! */  = (int)LinuxMediaSession.hhlh("hhlm", hhle(int ), (int)3);
            }
            case 4: {
                var4_3 /* !! */  = (int)LinuxMediaSession.hhlh("hhln", hhle(int ), (int)4);
            }
            case 1: {
                ** GOTO lbl23
            }
            case 5: lbl-1000:
            // 2 sources

            {
                var4_3 /* !! */  = (int)LinuxMediaSession.hhlh("hhlo", hhle(int ), (int)5);
lbl23:
                // 2 sources

                var4_3 /* !! */  = (int)LinuxMediaSession.hhlh("hhlj", hhle(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)LinuxMediaSession.hhlh("hhll", hhle(int ), (int)2);
        }
    }

    private static /* synthetic */ void hhty() {
        LinuxMediaSession.hhlq[0] = 6967930312481463001L;
        LinuxMediaSession.hhlq[1] = 3453053642353087372L;
        LinuxMediaSession.hhlq[2] = 6511507541569717966L;
        LinuxMediaSession.hhlq[3] = -1717284193271435645L;
        LinuxMediaSession.hhlq[4] = 2601952251838783256L;
        LinuxMediaSession.hhlq[5] = 994244547750048924L;
        LinuxMediaSession.hhlq[6] = 4606316021270714353L;
        LinuxMediaSession.hhlq[7] = 846456495935140166L;
        LinuxMediaSession.hhlq[8] = 8499882971357435778L;
        LinuxMediaSession.hhlq[9] = -2716363707494057644L;
        LinuxMediaSession.hhlq[10] = -8514849942829669246L;
        LinuxMediaSession.hhlq[11] = 5122595612226735229L;
        LinuxMediaSession.hhlq[12] = -7676515864672871596L;
        LinuxMediaSession.hhlq[13] = 6373098186082511422L;
        LinuxMediaSession.hhlq[14] = -4745461546659978360L;
        LinuxMediaSession.hhlq[15] = -1575727027782816782L;
        LinuxMediaSession.hhlq[16] = 3873682087744749502L;
        LinuxMediaSession.hhlq[17] = 6161554322705890223L;
        LinuxMediaSession.hhlq[18] = -3302145725938052582L;
        LinuxMediaSession.hhlq[19] = 2399242552720137758L;
        LinuxMediaSession.hhlq[20] = 5818545495045729558L;
        LinuxMediaSession.hhlq[21] = -4831423533884338093L;
        LinuxMediaSession.hhlq[22] = 8439831200708769816L;
        LinuxMediaSession.hhlq[23] = 882312201255443072L;
        LinuxMediaSession.hhlq[24] = 7256153467945663734L;
        LinuxMediaSession.hhlq[25] = 2430222355743704007L;
        LinuxMediaSession.hhlq[26] = -6440617961139758641L;
        LinuxMediaSession.hhlq[27] = 1582485444457244566L;
        LinuxMediaSession.hhlq[28] = -1026949825267875587L;
        LinuxMediaSession.hhlq[29] = -4263421785917348923L;
        LinuxMediaSession.hhlq[30] = 5023112841161189324L;
        LinuxMediaSession.hhlq[31] = 1274242924553549454L;
        LinuxMediaSession.hhlq[32] = -3578960126688266817L;
        LinuxMediaSession.hhlq[33] = -4332047925563787155L;
        LinuxMediaSession.hhlq[34] = 6655052002507518117L;
        LinuxMediaSession.hhlq[35] = -9172951214063524216L;
        LinuxMediaSession.hhlq[36] = 1589784722172862791L;
        LinuxMediaSession.hhlq[37] = 6821362627702056455L;
        LinuxMediaSession.hhlq[38] = 859135083583515114L;
        LinuxMediaSession.hhlq[39] = -2942635949741643583L;
        LinuxMediaSession.hhlq[40] = 3023862569103673053L;
        LinuxMediaSession.hhlq[41] = -5498493040258984863L;
        LinuxMediaSession.hhlq[42] = -3729986404203381223L;
        LinuxMediaSession.hhlq[43] = -784071368221303310L;
        LinuxMediaSession.hhlq[44] = -3749541034230694736L;
        LinuxMediaSession.hhlq[45] = 4929568368152913857L;
        LinuxMediaSession.hhlq[46] = 3750404571922441928L;
        LinuxMediaSession.hhlq[47] = 2201400794757394706L;
        LinuxMediaSession.hhlq[48] = 354842549105198073L;
        LinuxMediaSession.hhlq[49] = 5753938498830877126L;
        LinuxMediaSession.hhlq[50] = 1184616993700092117L;
        LinuxMediaSession.hhlq[51] = 5561181479860797378L;
        LinuxMediaSession.hhlq[52] = -7653356208566019687L;
        LinuxMediaSession.hhlq[53] = -8827972055771450508L;
        LinuxMediaSession.hhlq[54] = -1288174943422279039L;
        LinuxMediaSession.hhlq[55] = -7149044967042096440L;
        LinuxMediaSession.hhlq[56] = -6710767541298637952L;
        LinuxMediaSession.hhlq[57] = 8911396801639973809L;
        LinuxMediaSession.hhlq[58] = -4769433975384421232L;
        LinuxMediaSession.hhlq[59] = -1803215325271075760L;
        LinuxMediaSession.hhlq[60] = 5111364413886165910L;
        LinuxMediaSession.hhlq[61] = -4250094273730914752L;
        LinuxMediaSession.hhlq[62] = 8316460794005400964L;
        LinuxMediaSession.hhlq[63] = 7614955470320107529L;
        LinuxMediaSession.hhlq[64] = 4984803824146623018L;
        LinuxMediaSession.hhlq[65] = -2095708586403675460L;
        LinuxMediaSession.hhlq[66] = 3069241716521069639L;
    }

    private static /* synthetic */ void hhtz() {
        LinuxMediaSession.hhlr[0] = -1646496457368434772L;
        LinuxMediaSession.hhlr[1] = 4026145304893554684L;
        LinuxMediaSession.hhlr[2] = 9016194658605376352L;
        LinuxMediaSession.hhlr[3] = -4785601569043788816L;
        LinuxMediaSession.hhlr[4] = 3422590956113635478L;
        LinuxMediaSession.hhlr[5] = -4367676736082837838L;
        LinuxMediaSession.hhlr[6] = -8891911438101971986L;
        LinuxMediaSession.hhlr[7] = -2705806796170103916L;
        LinuxMediaSession.hhlr[8] = 1423592561480027579L;
        LinuxMediaSession.hhlr[9] = -5418905519582860987L;
        LinuxMediaSession.hhlr[10] = 7041033263715952821L;
        LinuxMediaSession.hhlr[11] = -151948685438366252L;
        LinuxMediaSession.hhlr[12] = 256433235734389874L;
        LinuxMediaSession.hhlr[13] = -7730118274523446780L;
        LinuxMediaSession.hhlr[14] = -9104946326473455299L;
        LinuxMediaSession.hhlr[15] = 8166236877382192075L;
        LinuxMediaSession.hhlr[16] = -4300066340766162460L;
        LinuxMediaSession.hhlr[17] = -6283893275379552699L;
        LinuxMediaSession.hhlr[18] = 4814135362838318596L;
        LinuxMediaSession.hhlr[19] = -6595457012295798693L;
        LinuxMediaSession.hhlr[20] = 8306412246890842161L;
        LinuxMediaSession.hhlr[21] = -8825699059137980555L;
        LinuxMediaSession.hhlr[22] = -2924410587764516891L;
        LinuxMediaSession.hhlr[23] = 6648586191488365874L;
        LinuxMediaSession.hhlr[24] = -4847644304869656833L;
        LinuxMediaSession.hhlr[25] = 1857287087884095696L;
        LinuxMediaSession.hhlr[26] = -6559882414562870829L;
        LinuxMediaSession.hhlr[27] = -672205455440689705L;
        LinuxMediaSession.hhlr[28] = -7363321453443799890L;
        LinuxMediaSession.hhlr[29] = -7216794450713597937L;
        LinuxMediaSession.hhlr[30] = -7154045044507587403L;
        LinuxMediaSession.hhlr[31] = 2522560473380236804L;
        LinuxMediaSession.hhlr[32] = -3558450638147886238L;
        LinuxMediaSession.hhlr[33] = -141285509402019029L;
        LinuxMediaSession.hhlr[34] = 6227808335613190573L;
        LinuxMediaSession.hhlr[35] = -4149329313900712078L;
        LinuxMediaSession.hhlr[36] = -4648548526396939621L;
        LinuxMediaSession.hhlr[37] = -134729554493897606L;
        LinuxMediaSession.hhlr[38] = 4337373052352551664L;
        LinuxMediaSession.hhlr[39] = -4559553978452214838L;
        LinuxMediaSession.hhlr[40] = 7308184976962443875L;
        LinuxMediaSession.hhlr[41] = -2754653167489766660L;
        LinuxMediaSession.hhlr[42] = -769396916128640198L;
        LinuxMediaSession.hhlr[43] = 8319289326545657681L;
        LinuxMediaSession.hhlr[44] = 8523874414252156170L;
        LinuxMediaSession.hhlr[45] = 3661997281394668558L;
        LinuxMediaSession.hhlr[46] = -8835941373349680238L;
        LinuxMediaSession.hhlr[47] = 8361429344085581834L;
        LinuxMediaSession.hhlr[48] = 1479666900372547879L;
        LinuxMediaSession.hhlr[49] = -8451949918885699289L;
        LinuxMediaSession.hhlr[50] = -2874154756907844613L;
        LinuxMediaSession.hhlr[51] = -1621750079980112358L;
        LinuxMediaSession.hhlr[52] = -1563779069133648687L;
        LinuxMediaSession.hhlr[53] = 3254615708910633748L;
        LinuxMediaSession.hhlr[54] = -4593741249453074065L;
        LinuxMediaSession.hhlr[55] = 2187683413328301667L;
        LinuxMediaSession.hhlr[56] = 2078120116368053792L;
        LinuxMediaSession.hhlr[57] = -6465792465363575709L;
        LinuxMediaSession.hhlr[58] = -8841093974041853169L;
        LinuxMediaSession.hhlr[59] = -7114109337593319817L;
        LinuxMediaSession.hhlr[60] = 3308191690823510022L;
        LinuxMediaSession.hhlr[61] = -8811489277669712979L;
        LinuxMediaSession.hhlr[62] = -3613324873118752784L;
        LinuxMediaSession.hhlr[63] = 8792700570051093154L;
        LinuxMediaSession.hhlr[64] = 7369247860402695770L;
        LinuxMediaSession.hhlr[65] = 6004783038288289428L;
        LinuxMediaSession.hhlr[66] = 3276542653325550046L;
    }
}

