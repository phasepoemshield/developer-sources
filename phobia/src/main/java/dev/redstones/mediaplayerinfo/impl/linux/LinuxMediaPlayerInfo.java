/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.freedesktop.dbus.connections.impl.DBusConnection
 *  org.freedesktop.dbus.connections.impl.DBusConnectionBuilder
 *  org.freedesktop.dbus.interfaces.DBus
 *  org.freedesktop.dbus.interfaces.Properties
 *  org.jetbrains.annotations.NotNull
 */
package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaSession;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.Properties;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J%\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Ldev/redstones/mediaplayerinfo/impl/linux/LinuxMediaPlayerInfo;", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "()V", "conn", "Lorg/freedesktop/dbus/connections/impl/DBusConnection;", "kotlin.jvm.PlatformType", "dbus", "Lorg/freedesktop/dbus/interfaces/DBus;", "getMediaSessions", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "getProperty", "T", "owner", "", "property", "getProperty$MediaPlayerInfo", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "MediaPlayerInfo"})
public final class LinuxMediaPlayerInfo
implements MediaPlayerInfo {
    private static final DBus dbus;
    private static final long mu = 5906652444133114185L;
    public static final boolean c;
    public static final int b;
    public static final LinuxMediaPlayerInfo INSTANCE;
    private static final DBusConnection conn;
    private static long[] fpte;
    public static final boolean a;
    private static long[] fptf;
    private static int[] fpiw;
    private static int[] fpix;

    public static /* synthetic */ CallSite fpiy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long fptc(int n2) {
        return fpte[n2] ^ fptf[n2];
    }

    private static /* synthetic */ int fpit(int n2) {
        return fpiw[n2] ^ fpix[n2];
    }

    private LinuxMediaPlayerInfo() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final <T> T getProperty$MediaPlayerInfo(@NotNull String var1_1, @NotNull String var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = LinuxMediaPlayerInfo.mu - LinuxMediaPlayerInfo.fpiy("fptg", fptc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == LinuxMediaPlayerInfo.fpiy("fpth", fpit(int ), (int)102)) break;
            v0 /* !! */  = (long)LinuxMediaPlayerInfo.fpiy("fptj", fpit(int ), (int)103);
        }
        var6_3 = LinuxMediaPlayerInfo.c;
        v1 /* !! */  = LinuxMediaPlayerInfo.mu;
        if (true) ** GOTO lbl11
        block36: while (true) {
            v1 /* !! */  = (long)(v2 - LinuxMediaPlayerInfo.fpiy("fptl", fptc(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -163434203: {
                    v2 = LinuxMediaPlayerInfo.fpiy("fptm", fptc(int ), (int)2);
                    continue block36;
                }
                case 396227809: {
                    v2 = LinuxMediaPlayerInfo.fpiy("fptr", fptc(int ), (int)3);
                    continue block36;
                }
                case 1403055896: {
                    v2 = LinuxMediaPlayerInfo.fpiy("fpts", fptc(int ), (int)4);
                    continue block36;
                }
                case 1748975945: {
                    break block36;
                }
            }
            break;
        }
        var5_4 /* !! */  = LinuxMediaPlayerInfo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = LinuxMediaPlayerInfo.mu - LinuxMediaPlayerInfo.fpiy("fptt", fptc(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == LinuxMediaPlayerInfo.fpiy("fptv", fpit(int ), (int)104)) break;
            v3 /* !! */  = (long)LinuxMediaPlayerInfo.fpiy("fptw", fpit(int ), (int)105);
        }
        var4_5 = LinuxMediaPlayerInfo.a;
        if (var6_3) {
            throw null;
lbl32:
            // 4 sources

            return null;
        }
        if (var4_5 || var4_5) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = LinuxMediaPlayerInfo.mu - LinuxMediaPlayerInfo.fpiy("fpty", fptc(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == LinuxMediaPlayerInfo.fpiy("fptz", fpit(int ), (int)106)) break;
            v4 /* !! */  = (long)LinuxMediaPlayerInfo.fpiy("fpug", fpit(int ), (int)107);
        }
        Intrinsics.checkNotNullParameter((Object)var1_1, (String)"owner");
        if (var4_5) ** GOTO lbl32
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = LinuxMediaPlayerInfo.mu - LinuxMediaPlayerInfo.fpiy("fpuj", fptc(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == LinuxMediaPlayerInfo.fpiy("fpuk", fpit(int ), (int)108)) break;
                    v5 /* !! */  = (long)LinuxMediaPlayerInfo.fpiy("fpul", fpit(int ), (int)109);
                }
                Intrinsics.checkNotNullParameter((Object)var2_2, (String)"property");
                if (var4_5 || var4_5) ** GOTO lbl32
                v6 /* !! */  = LinuxMediaPlayerInfo.mu;
                if (true) ** GOTO lbl56
                block41: while (true) {
                    v6 /* !! */  = (long)(LinuxMediaPlayerInfo.fpiy("fput", fptc(int ), (int)9) - LinuxMediaPlayerInfo.fpiy("fpum", fptc(int ), (int)8));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1981206031: {
                            continue block41;
                        }
                        case 1748975945: {
                            break block41;
                        }
                    }
                    break;
                }
                v7 /* !! */  = LinuxMediaPlayerInfo.mu;
                if (true) ** GOTO lbl65
                block42: while (true) {
                    v7 /* !! */  = (long)(LinuxMediaPlayerInfo.fpiy("fpuz", fptc(int ), (int)11) - LinuxMediaPlayerInfo.fpiy("fpuw", fptc(int ), (int)10));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 1748975945: {
                            break block42;
                        }
                        case 1995712612: {
                            continue block42;
                        }
                    }
                    break;
                }
                v8 = "org.mpris.MediaPlayer2." + var1_1;
                v9 /* !! */  = LinuxMediaPlayerInfo.mu;
                if (true) ** GOTO lbl75
                block43: while (true) {
                    v9 /* !! */  = (long)(v10 - LinuxMediaPlayerInfo.fpiy("fpvb", fptc(int ), (int)12));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1749631353: {
                            v10 = LinuxMediaPlayerInfo.fpiy("fpvc", fptc(int ), (int)13);
                            continue block43;
                        }
                        case 1518722622: {
                            v10 = LinuxMediaPlayerInfo.fpiy("fpve", fptc(int ), (int)14);
                            continue block43;
                        }
                        case 1748975945: {
                            break block43;
                        }
                    }
                    break;
                }
                var3_6 = (Properties)LinuxMediaPlayerInfo.conn.getRemoteObject(v8, "/org/mpris/MediaPlayer2", Properties.class);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                v11 /* !! */  = LinuxMediaPlayerInfo.mu;
                if (true) ** GOTO lbl91
                block44: while (true) {
                    v11 /* !! */  = (long)(v12 - LinuxMediaPlayerInfo.fpiy("fpvg", fptc(int ), (int)15));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1419712269: {
                            v12 = LinuxMediaPlayerInfo.fpiy("fpvo", fptc(int ), (int)16);
                            continue block44;
                        }
                        case -138841602: {
                            v12 = LinuxMediaPlayerInfo.fpiy("fpvp", fptc(int ), (int)17);
                            continue block44;
                        }
                        case 1748975945: {
                            break block44;
                        }
                    }
                    break;
                }
                return (T)var3_6.Get("org.mpris.MediaPlayer2.Player", var2_2);
            }
lbl101:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpvq", fpit(int ), (int)110);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl111
                    break;
                }
            }
            case 1: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpvr", fpit(int ), (int)111);
                if (!var6_3) ** GOTO lbl101
                throw null;
            }
lbl111:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpvu", fpit(int ), (int)112);
                if (!var6_3) break;
                throw null;
            }
lbl115:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpvw", fpit(int ), (int)113);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 4: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpwe", fpit(int ), (int)114);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl125:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpwg", fpit(int ), (int)115);
                if (!var6_3) ** GOTO lbl115
                throw null;
            }
            case 6: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpwh", fpit(int ), (int)116);
                if (!var6_3) break;
                throw null;
            }
lbl133:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpwi", fpit(int ), (int)117);
                if (!var6_3) ** GOTO lbl111
                throw null;
            }
            case 8: 
        }
        var5_4 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpwk", fpit(int ), (int)118);
        ** while (!var6_3)
lbl140:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fpyi() {
        LinuxMediaPlayerInfo.fpix[100] = -566573197;
        LinuxMediaPlayerInfo.fpix[101] = 1718971731;
        LinuxMediaPlayerInfo.fpix[102] = 1008043566;
        LinuxMediaPlayerInfo.fpix[103] = -247389653;
        LinuxMediaPlayerInfo.fpix[104] = -969182844;
        LinuxMediaPlayerInfo.fpix[105] = 2046786926;
        LinuxMediaPlayerInfo.fpix[106] = 1455453776;
        LinuxMediaPlayerInfo.fpix[107] = -977012217;
        LinuxMediaPlayerInfo.fpix[108] = 1934591302;
        LinuxMediaPlayerInfo.fpix[109] = -1286265185;
        LinuxMediaPlayerInfo.fpix[110] = 733565793;
        LinuxMediaPlayerInfo.fpix[111] = 853852952;
        LinuxMediaPlayerInfo.fpix[112] = 1866137666;
        LinuxMediaPlayerInfo.fpix[113] = 1957847067;
        LinuxMediaPlayerInfo.fpix[114] = 417950601;
        LinuxMediaPlayerInfo.fpix[115] = 1250393484;
        LinuxMediaPlayerInfo.fpix[116] = 1752038413;
        LinuxMediaPlayerInfo.fpix[117] = -661562811;
        LinuxMediaPlayerInfo.fpix[118] = 106991127;
    }

    private static /* synthetic */ void fpxp() {
        LinuxMediaPlayerInfo.fpiw[100] = -566573258;
        LinuxMediaPlayerInfo.fpiw[101] = 1718971743;
        LinuxMediaPlayerInfo.fpiw[102] = 1008043567;
        LinuxMediaPlayerInfo.fpiw[103] = -929373212;
        LinuxMediaPlayerInfo.fpiw[104] = -969182843;
        LinuxMediaPlayerInfo.fpiw[105] = -333306257;
        LinuxMediaPlayerInfo.fpiw[106] = 1455453777;
        LinuxMediaPlayerInfo.fpiw[107] = -1433302505;
        LinuxMediaPlayerInfo.fpiw[108] = 1934591303;
        LinuxMediaPlayerInfo.fpiw[109] = -1668850297;
        LinuxMediaPlayerInfo.fpiw[110] = 733565793;
        LinuxMediaPlayerInfo.fpiw[111] = 853852958;
        LinuxMediaPlayerInfo.fpiw[112] = 1866137674;
        LinuxMediaPlayerInfo.fpiw[113] = 1957847065;
        LinuxMediaPlayerInfo.fpiw[114] = 417950605;
        LinuxMediaPlayerInfo.fpiw[115] = 1250393485;
        LinuxMediaPlayerInfo.fpiw[116] = 1752038415;
        LinuxMediaPlayerInfo.fpiw[117] = -661562812;
        LinuxMediaPlayerInfo.fpiw[118] = 106991126;
    }

    private static /* synthetic */ void fpxs() {
        LinuxMediaPlayerInfo.fpix[0] = -2018964744;
        LinuxMediaPlayerInfo.fpix[1] = -2090692518;
        LinuxMediaPlayerInfo.fpix[2] = -1284156598;
        LinuxMediaPlayerInfo.fpix[3] = 145756734;
        LinuxMediaPlayerInfo.fpix[4] = 325078011;
        LinuxMediaPlayerInfo.fpix[5] = 2070977728;
        LinuxMediaPlayerInfo.fpix[6] = -1421002527;
        LinuxMediaPlayerInfo.fpix[7] = 1718233306;
        LinuxMediaPlayerInfo.fpix[8] = 1520303903;
        LinuxMediaPlayerInfo.fpix[9] = -1926718948;
        LinuxMediaPlayerInfo.fpix[10] = -826725879;
        LinuxMediaPlayerInfo.fpix[11] = -1920972663;
        LinuxMediaPlayerInfo.fpix[12] = 1950275061;
        LinuxMediaPlayerInfo.fpix[13] = -1869128093;
        LinuxMediaPlayerInfo.fpix[14] = -1881855167;
        LinuxMediaPlayerInfo.fpix[15] = -370984313;
        LinuxMediaPlayerInfo.fpix[16] = -677310188;
        LinuxMediaPlayerInfo.fpix[17] = -2117510077;
        LinuxMediaPlayerInfo.fpix[18] = 1483677356;
        LinuxMediaPlayerInfo.fpix[19] = -887985207;
        LinuxMediaPlayerInfo.fpix[20] = 1048011564;
        LinuxMediaPlayerInfo.fpix[21] = -838251857;
        LinuxMediaPlayerInfo.fpix[22] = -1645957301;
        LinuxMediaPlayerInfo.fpix[23] = 651807261;
        LinuxMediaPlayerInfo.fpix[24] = 964587866;
        LinuxMediaPlayerInfo.fpix[25] = -605863782;
        LinuxMediaPlayerInfo.fpix[26] = 639122286;
        LinuxMediaPlayerInfo.fpix[27] = -1154625649;
        LinuxMediaPlayerInfo.fpix[28] = -2053536579;
        LinuxMediaPlayerInfo.fpix[29] = 475482369;
        LinuxMediaPlayerInfo.fpix[30] = -1230671257;
        LinuxMediaPlayerInfo.fpix[31] = 1731354639;
        LinuxMediaPlayerInfo.fpix[32] = -1441775288;
        LinuxMediaPlayerInfo.fpix[33] = 1087550255;
        LinuxMediaPlayerInfo.fpix[34] = 81107329;
        LinuxMediaPlayerInfo.fpix[35] = -182493872;
        LinuxMediaPlayerInfo.fpix[36] = 1508931033;
        LinuxMediaPlayerInfo.fpix[37] = -1120427204;
        LinuxMediaPlayerInfo.fpix[38] = -1872843728;
        LinuxMediaPlayerInfo.fpix[39] = -1132456718;
        LinuxMediaPlayerInfo.fpix[40] = 1194613130;
        LinuxMediaPlayerInfo.fpix[41] = 1806608086;
        LinuxMediaPlayerInfo.fpix[42] = -872952951;
        LinuxMediaPlayerInfo.fpix[43] = -1669796638;
        LinuxMediaPlayerInfo.fpix[44] = -276903353;
        LinuxMediaPlayerInfo.fpix[45] = -512339389;
        LinuxMediaPlayerInfo.fpix[46] = -125783820;
        LinuxMediaPlayerInfo.fpix[47] = -1835994623;
        LinuxMediaPlayerInfo.fpix[48] = -1656463199;
        LinuxMediaPlayerInfo.fpix[49] = -190764634;
        LinuxMediaPlayerInfo.fpix[50] = -1189013473;
        LinuxMediaPlayerInfo.fpix[51] = 1244867843;
        LinuxMediaPlayerInfo.fpix[52] = -1370395424;
        LinuxMediaPlayerInfo.fpix[53] = -890086784;
        LinuxMediaPlayerInfo.fpix[54] = 866145333;
        LinuxMediaPlayerInfo.fpix[55] = 905306521;
        LinuxMediaPlayerInfo.fpix[56] = -955633314;
        LinuxMediaPlayerInfo.fpix[57] = -32634503;
        LinuxMediaPlayerInfo.fpix[58] = -2021358513;
        LinuxMediaPlayerInfo.fpix[59] = 1140071378;
        LinuxMediaPlayerInfo.fpix[60] = 566488594;
        LinuxMediaPlayerInfo.fpix[61] = 1765423200;
        LinuxMediaPlayerInfo.fpix[62] = 999037738;
        LinuxMediaPlayerInfo.fpix[63] = -597151810;
        LinuxMediaPlayerInfo.fpix[64] = -1469410965;
        LinuxMediaPlayerInfo.fpix[65] = -851867536;
        LinuxMediaPlayerInfo.fpix[66] = -1693733350;
        LinuxMediaPlayerInfo.fpix[67] = 1266421588;
        LinuxMediaPlayerInfo.fpix[68] = 361767519;
        LinuxMediaPlayerInfo.fpix[69] = -543597355;
        LinuxMediaPlayerInfo.fpix[70] = -1226490049;
        LinuxMediaPlayerInfo.fpix[71] = -684811627;
        LinuxMediaPlayerInfo.fpix[72] = 1715484610;
        LinuxMediaPlayerInfo.fpix[73] = -1738464915;
        LinuxMediaPlayerInfo.fpix[74] = 661485301;
        LinuxMediaPlayerInfo.fpix[75] = -830779920;
        LinuxMediaPlayerInfo.fpix[76] = 1891832027;
        LinuxMediaPlayerInfo.fpix[77] = -1415005742;
        LinuxMediaPlayerInfo.fpix[78] = -924417904;
        LinuxMediaPlayerInfo.fpix[79] = -1176243480;
        LinuxMediaPlayerInfo.fpix[80] = 1394680627;
        LinuxMediaPlayerInfo.fpix[81] = 1618500760;
        LinuxMediaPlayerInfo.fpix[82] = 1920958025;
        LinuxMediaPlayerInfo.fpix[83] = 1163015923;
        LinuxMediaPlayerInfo.fpix[84] = -2014236240;
        LinuxMediaPlayerInfo.fpix[85] = 867458771;
        LinuxMediaPlayerInfo.fpix[86] = 1128450162;
        LinuxMediaPlayerInfo.fpix[87] = 1782664357;
        LinuxMediaPlayerInfo.fpix[88] = 101204195;
        LinuxMediaPlayerInfo.fpix[89] = -2130988069;
        LinuxMediaPlayerInfo.fpix[90] = 810314737;
        LinuxMediaPlayerInfo.fpix[91] = 494795534;
        LinuxMediaPlayerInfo.fpix[92] = -1320944483;
        LinuxMediaPlayerInfo.fpix[93] = 1552426322;
        LinuxMediaPlayerInfo.fpix[94] = 1464179691;
        LinuxMediaPlayerInfo.fpix[95] = 1070448479;
        LinuxMediaPlayerInfo.fpix[96] = 891118280;
        LinuxMediaPlayerInfo.fpix[97] = -1131706522;
        LinuxMediaPlayerInfo.fpix[98] = 2126056126;
        LinuxMediaPlayerInfo.fpix[99] = -1565268781;
    }

    static {
        fpiw = new int[119];
        fpix = new int[119];
        LinuxMediaPlayerInfo.fpwo();
        LinuxMediaPlayerInfo.fpxp();
        LinuxMediaPlayerInfo.fpxs();
        LinuxMediaPlayerInfo.fpyi();
        fpte = new long[18];
        fptf = new long[18];
        LinuxMediaPlayerInfo.fpym();
        LinuxMediaPlayerInfo.fpyp();
        INSTANCE = new LinuxMediaPlayerInfo();
        conn = DBusConnectionBuilder.forSessionBus().build();
        dbus = (DBus)conn.getRemoteObject("org.freedesktop.DBus", "/", DBus.class);
    }

    private static /* synthetic */ void fpym() {
        LinuxMediaPlayerInfo.fpte[0] = 3259238361864456313L;
        LinuxMediaPlayerInfo.fpte[1] = -7446564275647219599L;
        LinuxMediaPlayerInfo.fpte[2] = 874183716004242336L;
        LinuxMediaPlayerInfo.fpte[3] = -830258280501225279L;
        LinuxMediaPlayerInfo.fpte[4] = 1833073586593315315L;
        LinuxMediaPlayerInfo.fpte[5] = -418361490139248699L;
        LinuxMediaPlayerInfo.fpte[6] = 2409533241345440452L;
        LinuxMediaPlayerInfo.fpte[7] = 6091239414822111724L;
        LinuxMediaPlayerInfo.fpte[8] = 1601710373119323865L;
        LinuxMediaPlayerInfo.fpte[9] = -931421963351884183L;
        LinuxMediaPlayerInfo.fpte[10] = -6754435438725572201L;
        LinuxMediaPlayerInfo.fpte[11] = -4713239973878600683L;
        LinuxMediaPlayerInfo.fpte[12] = 5246016488833065222L;
        LinuxMediaPlayerInfo.fpte[13] = -4870137661011205342L;
        LinuxMediaPlayerInfo.fpte[14] = -3440147288129769809L;
        LinuxMediaPlayerInfo.fpte[15] = 343044409152265198L;
        LinuxMediaPlayerInfo.fpte[16] = 3915983337247276658L;
        LinuxMediaPlayerInfo.fpte[17] = 8671785199160462475L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<IMediaSession> getMediaSessions() {
        block168: {
            block167: {
                var14_1 = LinuxMediaPlayerInfo.c;
                var13_2 /* !! */  = LinuxMediaPlayerInfo.b;
                var12_3 = LinuxMediaPlayerInfo.a;
                if (var14_1) {
                    throw null;
lbl6:
                    // 48 sources

                    return null;
                }
                if (var12_3 || var12_3) ** GOTO lbl6
                v0 = LinuxMediaPlayerInfo.dbus.ListNames();
                Intrinsics.checkNotNullExpressionValue((Object)v0, (String)"ListNames(...)");
                var1_4 /* !! */  = v0;
                if (var12_3 || var12_3 || var12_3) ** GOTO lbl6
                var2_5 = LinuxMediaPlayerInfo.fpiy("fpiz", fpit(int ), (int)0);
                if (var12_3 || var12_3) ** GOTO lbl6
                var3_6 = var1_4 /* !! */ ;
                if (var12_3) ** GOTO lbl6
                var4_7 = new ArrayList<E>();
                if (var12_3 || var12_3) ** GOTO lbl6
                var5_8 = LinuxMediaPlayerInfo.fpiy("fpja", fpit(int ), (int)1);
                if (var12_3 || var12_3) ** GOTO lbl6
                var6_9 = LinuxMediaPlayerInfo.fpiy("fpjb", fpit(int ), (int)2);
                if (var12_3) ** GOTO lbl6
                var7_11 = var3_6.length;
                if (var12_3) ** GOTO lbl6
                do {
                    block169: {
                        if (var12_3 || var12_3) ** GOTO lbl6
                        if (var6_9 >= var7_11) break block167;
                        if (var12_3) ** GOTO lbl6
                        var8_14 = var3_6[var6_9];
                        if (var12_3 || var12_3) ** GOTO lbl6
                        var9_15 = (String)var8_14;
                        if (var12_3 || var12_3) ** GOTO lbl6
                        var10_18 = LinuxMediaPlayerInfo.fpiy("fpjc", fpit(int ), (int)3);
                        if (var12_3 || var12_3) ** GOTO lbl6
                        Intrinsics.checkNotNull((Object)var9_15);
                        if (var12_3) ** GOTO lbl6
                        if (!StringsKt.startsWith$default((String)var9_15, (String)"org.mpris.MediaPlayer2.", (boolean)LinuxMediaPlayerInfo.fpiy("fpjg", fpit(int ), (int)4), (int)LinuxMediaPlayerInfo.fpiy("fpjh", fpit(int ), (int)5), null)) break block169;
                        if (var12_3) ** GOTO lbl6
                        var4_7.add(var8_14);
                        if (var12_3) ** GOTO lbl6
                    }
                    if (var12_3 || var12_3) ** GOTO lbl6
                    ++var6_9;
                    if (var12_3) ** GOTO lbl6
                } while (!var14_1);
                throw null;
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            var1_4 /* !! */  = (List)var4_7;
            if (var12_3 || var12_3 || var12_3) ** GOTO lbl6
            var2_5 = LinuxMediaPlayerInfo.fpiy("fpjj", fpit(int ), (int)6);
            if (var12_3 || var12_3) ** GOTO lbl6
            var3_6 = var1_4 /* !! */ ;
            if (var12_3) ** GOTO lbl6
            var4_7 = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)var1_4 /* !! */ , (int)LinuxMediaPlayerInfo.fpiy("fpjl", fpit(int ), (int)7)));
            if (var12_3 || var12_3) ** GOTO lbl6
            var5_8 = LinuxMediaPlayerInfo.fpiy("fpjm", fpit(int ), (int)8);
            if (var12_3 || var12_3) ** GOTO lbl6
            var6_10 = var3_6.iterator();
            if (var12_3) ** GOTO lbl6
            do {
                if (var12_3 || var12_3) ** GOTO lbl6
                if (!var6_10.hasNext()) break block168;
                if (var12_3) ** GOTO lbl6
                var7_12 = var6_10.next();
                if (var12_3 || var12_3) ** GOTO lbl6
                var8_14 = (String)var7_12;
                var11_19 = var4_7;
                if (var12_3 || var12_3) ** GOTO lbl6
                var9_16 = LinuxMediaPlayerInfo.fpiy("fpjn", fpit(int ), (int)9);
                if (var12_3 || var12_3) ** GOTO lbl6
                v1 = LinuxMediaPlayerInfo.conn.getRemoteObject((String)var8_14, "/org/mpris/MediaPlayer2", Player.class);
                Intrinsics.checkNotNullExpressionValue((Object)v1, (String)"getRemoteObject(...)");
                v2 = (Player)v1;
                Intrinsics.checkNotNull((Object)var8_14);
                var11_19.add(new LinuxMediaSession(v2, StringsKt.removePrefix((String)var8_14, (CharSequence)"org.mpris.MediaPlayer2.")));
                if (var12_3 || var12_3) ** GOTO lbl6
            } while (!var14_1);
            throw null;
        }
        if (var12_3 || var12_3) ** GOTO lbl6
        var1_4 /* !! */  = (List)var4_7;
        if (var12_3 || var12_3 || var12_3) ** GOTO lbl6
        var2_5 = LinuxMediaPlayerInfo.fpiy("fpjo", fpit(int ), (int)10);
        if (var12_3 || var12_3) ** GOTO lbl6
        var3_6 = var1_4 /* !! */ ;
        if (var12_3) ** GOTO lbl6
        var4_7 = new ArrayList<E>();
        if (var12_3 || var12_3) ** GOTO lbl6
        var5_8 = LinuxMediaPlayerInfo.fpiy("fpjr", fpit(int ), (int)11);
        if (var12_3 || var12_3) ** GOTO lbl6
        var6_10 = var3_6.iterator();
        if (var12_3) ** GOTO lbl6
        block92: while (true) {
            if (var12_3 || var12_3) ** GOTO lbl6
            if (!var6_10.hasNext()) ** GOTO lbl125
            if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var12_3) ** GOTO lbl6
                    var7_13 = var6_10.next();
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var8_14 = (LinuxMediaSession)var7_13;
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var9_17 = LinuxMediaPlayerInfo.fpiy("fpjv", fpit(int ), (int)12);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (Intrinsics.areEqual(LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(var8_14.getOwner(), "PlaybackStatus"), (Object)"Stopped")) ** GOTO lbl115
                    if (var12_3) ** GOTO lbl6
                    v3 = LinuxMediaPlayerInfo.fpiy("fpjw", fpit(int ), (int)13);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl117
lbl115:
                    // 1 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    v3 = LinuxMediaPlayerInfo.fpiy("fpjx", fpit(int ), (int)14);
lbl117:
                    // 2 sources

                    if (v3 == false) continue block92;
                    if (var12_3) ** GOTO lbl6
                    var4_7.add(var7_13);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var14_1) ** break;
                    continue block92;
                    throw null;
                }
lbl125:
                // 1 sources

                if (!var12_3 && !var12_3) ** break;
                ** continue;
                return (List)var4_7;
lbl128:
                // 3 sources

                case 0: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkb", fpit(int ), (int)15);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl133:
                // 4 sources

                case 1: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkc", fpit(int ), (int)16);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl497
                }
lbl138:
                // 2 sources

                case 2: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpke", fpit(int ), (int)17);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl325
                }
lbl143:
                // 2 sources

                case 3: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpki", fpit(int ), (int)18);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl148:
                // 4 sources

                case 4: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkj", fpit(int ), (int)19);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
                case 5: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkk", fpit(int ), (int)20);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl493
                }
lbl158:
                // 3 sources

                case 6: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkl", fpit(int ), (int)21);
                    if (!var14_1) break block92;
                    throw null;
                }
                case 7: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkm", fpit(int ), (int)22);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl428
                }
lbl167:
                // 2 sources

                case 8: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpko", fpit(int ), (int)23);
                    if (!var14_1) ** GOTO lbl148
                    throw null;
                }
lbl171:
                // 4 sources

                case 9: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkr", fpit(int ), (int)24);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
lbl176:
                // 2 sources

                case 10: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkw", fpit(int ), (int)25);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl325
                }
                case 11: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkx", fpit(int ), (int)26);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl505
                }
lbl186:
                // 3 sources

                case 12: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpky", fpit(int ), (int)27);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl220
                        break;
                    }
                }
                case 13: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpkz", fpit(int ), (int)28);
                    if (!var14_1) ** GOTO lbl133
                    throw null;
                }
lbl196:
                // 3 sources

                case 14: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpla", fpit(int ), (int)29);
                    if (!var14_1) ** GOTO lbl133
                    throw null;
                }
                case 15: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplb", fpit(int ), (int)30);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl316
                }
lbl205:
                // 2 sources

                case 16: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpld", fpit(int ), (int)31);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl415
                }
lbl210:
                // 2 sources

                case 17: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpli", fpit(int ), (int)32);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl215:
                // 2 sources

                case 18: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplk", fpit(int ), (int)33);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
lbl220:
                // 2 sources

                case 19: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplm", fpit(int ), (int)34);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl481
                }
                case 20: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpln", fpit(int ), (int)35);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl489
                }
lbl230:
                // 2 sources

                case 21: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplo", fpit(int ), (int)36);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl465
                }
lbl235:
                // 2 sources

                case 22: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplq", fpit(int ), (int)37);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl240:
                // 2 sources

                case 23: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpls", fpit(int ), (int)38);
                    if (!var14_1) ** GOTO lbl167
                    throw null;
                }
lbl244:
                // 3 sources

                case 24: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplw", fpit(int ), (int)39);
                    if (!var14_1) ** GOTO lbl186
                    throw null;
                }
                case 25: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fplz", fpit(int ), (int)40);
                    if (!var14_1) ** GOTO lbl210
                    throw null;
                }
                case 26: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmb", fpit(int ), (int)41);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl428
                }
lbl257:
                // 2 sources

                case 27: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmd", fpit(int ), (int)42);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl375
                }
                case 28: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpme", fpit(int ), (int)43);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
                case 29: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmf", fpit(int ), (int)44);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl485
                }
lbl272:
                // 2 sources

                case 30: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmg", fpit(int ), (int)45);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl370
                }
lbl277:
                // 6 sources

                case 31: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmn", fpit(int ), (int)46);
                    if (!var14_1) ** GOTO lbl196
                    throw null;
                }
lbl281:
                // 2 sources

                case 32: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmo", fpit(int ), (int)47);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl298
                }
lbl286:
                // 2 sources

                case 33: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmq", fpit(int ), (int)48);
                    if (!var14_1) ** GOTO lbl158
                    throw null;
                }
                case 34: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmt", fpit(int ), (int)49);
                    if (!var14_1) ** GOTO lbl143
                    throw null;
                }
                case 35: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpmu", fpit(int ), (int)50);
                    if (!var14_1) ** GOTO lbl186
                    throw null;
                }
lbl298:
                // 2 sources

                case 36: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnc", fpit(int ), (int)51);
                    if (!var14_1) ** GOTO lbl235
                    throw null;
                }
                case 37: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpne", fpit(int ), (int)52);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl465
                }
lbl307:
                // 2 sources

                case 38: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpng", fpit(int ), (int)53);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl325
                }
lbl312:
                // 2 sources

                case 39: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnh", fpit(int ), (int)54);
                    if (!var14_1) ** GOTO lbl240
                    throw null;
                }
lbl316:
                // 3 sources

                case 40: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpni", fpit(int ), (int)55);
                    if (!var14_1) ** GOTO lbl171
                    throw null;
                }
                case 41: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnl", fpit(int ), (int)56);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl339
                }
lbl325:
                // 4 sources

                case 42: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnm", fpit(int ), (int)57);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
                case 43: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnt", fpit(int ), (int)58);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl505
                }
                case 44: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnw", fpit(int ), (int)59);
                    if (!var14_1) break block92;
                    throw null;
                }
lbl339:
                // 2 sources

                case 45: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpnz", fpit(int ), (int)60);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl457
                }
                case 46: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpob", fpit(int ), (int)61);
                    if (!var14_1) ** GOTO lbl148
                    throw null;
                }
lbl348:
                // 2 sources

                case 47: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpod", fpit(int ), (int)62);
                    if (!var14_1) ** GOTO lbl148
                    throw null;
                }
                case 48: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpog", fpit(int ), (int)63);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl410
                }
                case 49: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpoj", fpit(int ), (int)64);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl473
                }
                case 50: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpom", fpit(int ), (int)65);
                    if (!var14_1) ** GOTO lbl307
                    throw null;
                }
                case 51: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpor", fpit(int ), (int)66);
                    if (!var14_1) ** GOTO lbl244
                    throw null;
                }
lbl370:
                // 2 sources

                case 52: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpos", fpit(int ), (int)67);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
lbl375:
                // 2 sources

                case 53: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpou", fpit(int ), (int)68);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl489
                }
                case 54: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpox", fpit(int ), (int)69);
                    if (!var14_1) ** GOTO lbl348
                    throw null;
                }
                case 55: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpoy", fpit(int ), (int)70);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl493
                }
                case 56: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppe", fpit(int ), (int)71);
                    if (!var14_1) ** GOTO lbl171
                    throw null;
                }
                case 57: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppi", fpit(int ), (int)72);
                    if (!var14_1) ** GOTO lbl133
                    throw null;
                }
lbl397:
                // 3 sources

                case 58: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppl", fpit(int ), (int)73);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl445
                }
                case 59: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppq", fpit(int ), (int)74);
                    if (!var14_1) ** GOTO lbl312
                    throw null;
                }
                case 60: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppr", fpit(int ), (int)75);
                    if (!var14_1) ** GOTO lbl128
                    throw null;
                }
lbl410:
                // 2 sources

                case 61: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppu", fpit(int ), (int)76);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl449
                }
lbl415:
                // 2 sources

                case 62: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fppx", fpit(int ), (int)77);
                    if (!var14_1) ** GOTO lbl397
                    throw null;
                }
                case 63: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqg", fpit(int ), (int)78);
                    if (!var14_1) ** GOTO lbl196
                    throw null;
                }
                case 64: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqh", fpit(int ), (int)79);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
lbl428:
                // 3 sources

                case 65: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqj", fpit(int ), (int)80);
                    if (!var14_1) ** GOTO lbl128
                    throw null;
                }
                case 66: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqn", fpit(int ), (int)81);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
lbl437:
                // 2 sources

                case 67: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqq", fpit(int ), (int)82);
                    if (!var14_1) ** GOTO lbl277
                    throw null;
                }
                case 68: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqv", fpit(int ), (int)83);
                    if (var14_1) {
                        throw null;
                    }
                }
lbl445:
                // 4 sources

                case 69: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqy", fpit(int ), (int)84);
                    if (!var14_1) ** GOTO lbl272
                    throw null;
                }
lbl449:
                // 2 sources

                case 70: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpqz", fpit(int ), (int)85);
                    if (!var14_1) ** GOTO lbl277
                    throw null;
                }
                case 71: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprf", fpit(int ), (int)86);
                    if (!var14_1) ** GOTO lbl397
                    throw null;
                }
lbl457:
                // 2 sources

                case 72: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprj", fpit(int ), (int)87);
                    if (!var14_1) ** GOTO lbl176
                    throw null;
                }
lbl461:
                // 5 sources

                case 73: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprl", fpit(int ), (int)88);
                    if (!var14_1) ** GOTO lbl171
                    throw null;
                }
lbl465:
                // 4 sources

                case 74: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprm", fpit(int ), (int)89);
                    if (var14_1) {
                        throw null;
                    }
                }
                case 75: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprn", fpit(int ), (int)90);
                    if (var14_1) {
                        throw null;
                    }
                }
lbl473:
                // 4 sources

                case 76: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprq", fpit(int ), (int)91);
                    if (!var14_1) ** GOTO lbl286
                    throw null;
                }
lbl477:
                // 4 sources

                case 77: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fprs", fpit(int ), (int)92);
                    if (!var14_1) ** GOTO lbl277
                    throw null;
                }
lbl481:
                // 2 sources

                case 78: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsa", fpit(int ), (int)93);
                    if (!var14_1) ** GOTO lbl244
                    throw null;
                }
lbl485:
                // 2 sources

                case 79: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsb", fpit(int ), (int)94);
                    if (!var14_1) ** GOTO lbl215
                    throw null;
                }
lbl489:
                // 3 sources

                case 80: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsc", fpit(int ), (int)95);
                    if (!var14_1) ** GOTO lbl281
                    throw null;
                }
lbl493:
                // 3 sources

                case 81: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsg", fpit(int ), (int)96);
                    if (!var14_1) ** GOTO lbl437
                    throw null;
                }
lbl497:
                // 2 sources

                case 82: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsi", fpit(int ), (int)97);
                    if (!var14_1) ** GOTO lbl465
                    throw null;
                }
                case 83: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpso", fpit(int ), (int)98);
                    if (!var14_1) ** GOTO lbl138
                    throw null;
                }
lbl505:
                // 3 sources

                case 84: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsq", fpit(int ), (int)99);
                    if (!var14_1) ** GOTO lbl316
                    throw null;
                }
                case 85: {
                    var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsu", fpit(int ), (int)100);
                    if (!var14_1) ** GOTO lbl205
                    throw null;
                }
                case 86: 
            }
            break;
        }
        var13_2 /* !! */  = (int)LinuxMediaPlayerInfo.fpiy("fpsy", fpit(int ), (int)101);
        ** while (!var14_1)
lbl516:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fpwo() {
        LinuxMediaPlayerInfo.fpiw[0] = -2018964744;
        LinuxMediaPlayerInfo.fpiw[1] = -2090692518;
        LinuxMediaPlayerInfo.fpiw[2] = -1284156598;
        LinuxMediaPlayerInfo.fpiw[3] = 145756734;
        LinuxMediaPlayerInfo.fpiw[4] = 325078011;
        LinuxMediaPlayerInfo.fpiw[5] = 2070977730;
        LinuxMediaPlayerInfo.fpiw[6] = -1421002527;
        LinuxMediaPlayerInfo.fpiw[7] = 1718233296;
        LinuxMediaPlayerInfo.fpiw[8] = 1520303903;
        LinuxMediaPlayerInfo.fpiw[9] = -1926718948;
        LinuxMediaPlayerInfo.fpiw[10] = -826725879;
        LinuxMediaPlayerInfo.fpiw[11] = -1920972663;
        LinuxMediaPlayerInfo.fpiw[12] = 1950275061;
        LinuxMediaPlayerInfo.fpiw[13] = -1869128094;
        LinuxMediaPlayerInfo.fpiw[14] = -1881855167;
        LinuxMediaPlayerInfo.fpiw[15] = -370984249;
        LinuxMediaPlayerInfo.fpiw[16] = -677310149;
        LinuxMediaPlayerInfo.fpiw[17] = -2117510137;
        LinuxMediaPlayerInfo.fpiw[18] = 1483677408;
        LinuxMediaPlayerInfo.fpiw[19] = -887985168;
        LinuxMediaPlayerInfo.fpiw[20] = 1048011574;
        LinuxMediaPlayerInfo.fpiw[21] = -838251806;
        LinuxMediaPlayerInfo.fpiw[22] = -1645957365;
        LinuxMediaPlayerInfo.fpiw[23] = 651807242;
        LinuxMediaPlayerInfo.fpiw[24] = 964587787;
        LinuxMediaPlayerInfo.fpiw[25] = -605863747;
        LinuxMediaPlayerInfo.fpiw[26] = 639122254;
        LinuxMediaPlayerInfo.fpiw[27] = -1154625658;
        LinuxMediaPlayerInfo.fpiw[28] = -2053536631;
        LinuxMediaPlayerInfo.fpiw[29] = 475482413;
        LinuxMediaPlayerInfo.fpiw[30] = -1230671259;
        LinuxMediaPlayerInfo.fpiw[31] = 1731354697;
        LinuxMediaPlayerInfo.fpiw[32] = -1441775281;
        LinuxMediaPlayerInfo.fpiw[33] = 1087550264;
        LinuxMediaPlayerInfo.fpiw[34] = 81107389;
        LinuxMediaPlayerInfo.fpiw[35] = -182493873;
        LinuxMediaPlayerInfo.fpiw[36] = 1508931012;
        LinuxMediaPlayerInfo.fpiw[37] = -1120427202;
        LinuxMediaPlayerInfo.fpiw[38] = -1872843675;
        LinuxMediaPlayerInfo.fpiw[39] = -1132456728;
        LinuxMediaPlayerInfo.fpiw[40] = 1194613139;
        LinuxMediaPlayerInfo.fpiw[41] = 1806608121;
        LinuxMediaPlayerInfo.fpiw[42] = -872952933;
        LinuxMediaPlayerInfo.fpiw[43] = -1669796624;
        LinuxMediaPlayerInfo.fpiw[44] = -276903354;
        LinuxMediaPlayerInfo.fpiw[45] = -512339360;
        LinuxMediaPlayerInfo.fpiw[46] = -125783816;
        LinuxMediaPlayerInfo.fpiw[47] = -1835994596;
        LinuxMediaPlayerInfo.fpiw[48] = -1656463226;
        LinuxMediaPlayerInfo.fpiw[49] = -190764668;
        LinuxMediaPlayerInfo.fpiw[50] = -1189013456;
        LinuxMediaPlayerInfo.fpiw[51] = 1244867846;
        LinuxMediaPlayerInfo.fpiw[52] = -1370395423;
        LinuxMediaPlayerInfo.fpiw[53] = -890086766;
        LinuxMediaPlayerInfo.fpiw[54] = 866145333;
        LinuxMediaPlayerInfo.fpiw[55] = 905306585;
        LinuxMediaPlayerInfo.fpiw[56] = -955633343;
        LinuxMediaPlayerInfo.fpiw[57] = -32634549;
        LinuxMediaPlayerInfo.fpiw[58] = -2021358524;
        LinuxMediaPlayerInfo.fpiw[59] = 1140071371;
        LinuxMediaPlayerInfo.fpiw[60] = 566488592;
        LinuxMediaPlayerInfo.fpiw[61] = 1765423147;
        LinuxMediaPlayerInfo.fpiw[62] = 999037724;
        LinuxMediaPlayerInfo.fpiw[63] = -597151841;
        LinuxMediaPlayerInfo.fpiw[64] = -1469411040;
        LinuxMediaPlayerInfo.fpiw[65] = -851867578;
        LinuxMediaPlayerInfo.fpiw[66] = -1693733335;
        LinuxMediaPlayerInfo.fpiw[67] = 1266421592;
        LinuxMediaPlayerInfo.fpiw[68] = 361767441;
        LinuxMediaPlayerInfo.fpiw[69] = -543597328;
        LinuxMediaPlayerInfo.fpiw[70] = -1226490062;
        LinuxMediaPlayerInfo.fpiw[71] = -684811621;
        LinuxMediaPlayerInfo.fpiw[72] = 1715484668;
        LinuxMediaPlayerInfo.fpiw[73] = -1738464955;
        LinuxMediaPlayerInfo.fpiw[74] = 661485217;
        LinuxMediaPlayerInfo.fpiw[75] = -830779998;
        LinuxMediaPlayerInfo.fpiw[76] = 1891832036;
        LinuxMediaPlayerInfo.fpiw[77] = -1415005741;
        LinuxMediaPlayerInfo.fpiw[78] = -924417870;
        LinuxMediaPlayerInfo.fpiw[79] = -1176243511;
        LinuxMediaPlayerInfo.fpiw[80] = 1394680673;
        LinuxMediaPlayerInfo.fpiw[81] = 1618500760;
        LinuxMediaPlayerInfo.fpiw[82] = 1920958070;
        LinuxMediaPlayerInfo.fpiw[83] = 1163015880;
        LinuxMediaPlayerInfo.fpiw[84] = -2014236188;
        LinuxMediaPlayerInfo.fpiw[85] = 867458777;
        LinuxMediaPlayerInfo.fpiw[86] = 1128450132;
        LinuxMediaPlayerInfo.fpiw[87] = 1782664365;
        LinuxMediaPlayerInfo.fpiw[88] = 101204186;
        LinuxMediaPlayerInfo.fpiw[89] = -2130988134;
        LinuxMediaPlayerInfo.fpiw[90] = 810314696;
        LinuxMediaPlayerInfo.fpiw[91] = 494795598;
        LinuxMediaPlayerInfo.fpiw[92] = -1320944454;
        LinuxMediaPlayerInfo.fpiw[93] = 1552426305;
        LinuxMediaPlayerInfo.fpiw[94] = 1464179624;
        LinuxMediaPlayerInfo.fpiw[95] = 1070448396;
        LinuxMediaPlayerInfo.fpiw[96] = 891118327;
        LinuxMediaPlayerInfo.fpiw[97] = -1131706576;
        LinuxMediaPlayerInfo.fpiw[98] = 2126056190;
        LinuxMediaPlayerInfo.fpiw[99] = -1565268794;
    }

    private static /* synthetic */ void fpyp() {
        LinuxMediaPlayerInfo.fptf[0] = -7016786114495793460L;
        LinuxMediaPlayerInfo.fptf[1] = 3873714661499941179L;
        LinuxMediaPlayerInfo.fptf[2] = -2289811482321098279L;
        LinuxMediaPlayerInfo.fptf[3] = 4001275917959418693L;
        LinuxMediaPlayerInfo.fptf[4] = -1520692522027856285L;
        LinuxMediaPlayerInfo.fptf[5] = 1773719862911531043L;
        LinuxMediaPlayerInfo.fptf[6] = -4963580131874088375L;
        LinuxMediaPlayerInfo.fptf[7] = -916778316373056311L;
        LinuxMediaPlayerInfo.fptf[8] = 592038431492945658L;
        LinuxMediaPlayerInfo.fptf[9] = -1396695572128044201L;
        LinuxMediaPlayerInfo.fptf[10] = -2934907604164051372L;
        LinuxMediaPlayerInfo.fptf[11] = 2784613247237553278L;
        LinuxMediaPlayerInfo.fptf[12] = 4034285436867218078L;
        LinuxMediaPlayerInfo.fptf[13] = -1027237199270541993L;
        LinuxMediaPlayerInfo.fptf[14] = 8768079889408311370L;
        LinuxMediaPlayerInfo.fptf[15] = 3410725083563375391L;
        LinuxMediaPlayerInfo.fptf[16] = -7707956774981874401L;
        LinuxMediaPlayerInfo.fptf[17] = -870290889254724531L;
    }
}

