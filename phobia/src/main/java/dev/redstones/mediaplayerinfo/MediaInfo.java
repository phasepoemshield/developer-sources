/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.serialization.Serializable
 *  kotlinx.serialization.SerializationStrategy
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.CompositeEncoder
 *  kotlinx.serialization.internal.ByteArraySerializer
 *  kotlinx.serialization.internal.PluginExceptionsKt
 *  kotlinx.serialization.internal.SerializationConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaInfo$$serializer;
import dev.redstones.mediaplayerinfo.MediaInfo$1;
import dev.redstones.mediaplayerinfo.MediaInfo$Companion;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256BO\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010'\u001a\u00020\rH\u00c6\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020\u0003H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J&\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u00c1\u0001\u00a2\u0006\u0002\b4R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u00067"}, d2={"Ldev/redstones/mediaplayerinfo/MediaInfo;", "", "seen1", "", "title", "", "artist", "artworkPng", "", "position", "", "duration", "playing", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;[BJJZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;[BJJZ)V", "getArtist", "()Ljava/lang/String;", "artwork", "Ljava/awt/image/BufferedImage;", "getArtwork", "()Ljava/awt/image/BufferedImage;", "artwork$delegate", "Lkotlin/Lazy;", "getArtworkPng", "()[B", "getDuration", "()J", "getPlaying", "()Z", "getPosition", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$MediaPlayerInfo", "$serializer", "Companion", "MediaPlayerInfo"})
@Serializable
public final class MediaInfo {
    private final String artist;
    private final boolean playing;
    public static final int b;
    private final byte[] artworkPng;
    public static final MediaInfo$Companion Companion;
    private static long[] esgd;
    private static int[] eses;
    private final Lazy artwork$delegate;
    private static long[] esgb;
    public static final boolean c;
    static final long lf = 5187031112238436033L;
    private final long position;
    private static int[] eseu;
    private final long duration;
    private final String title;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String getArtist() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("eshm", esfz(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esht", eseq(int ), (int)22)) break;
            v0 /* !! */  = (long)MediaInfo.esev("eshv", eseq(int ), (int)23);
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(MediaInfo.esev("eshx", esfz(int ), (int)7) - MediaInfo.esev("eshw", esfz(int ), (int)6));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block16;
                }
                case 422341795: {
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("eshy", esfz(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == MediaInfo.esev("eshz", eseq(int ), (int)24)) break;
            v2 /* !! */  = (long)MediaInfo.esev("esia", eseq(int ), (int)25);
        }
        var1_3 = MediaInfo.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                v3 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl36
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - MediaInfo.esev("esif", esfz(int ), (int)9));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2082533695: {
                            break block19;
                        }
                        case -146273374: {
                            v4 = MediaInfo.esev("esig", esfz(int ), (int)10);
                            continue block19;
                        }
                        case 149592410: {
                            v4 = MediaInfo.esev("esih", esfz(int ), (int)11);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.artist;
                case 0: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esii", eseq(int ), (int)26);
                    if (!var3_1) break block18;
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)MediaInfo.esev("esij", eseq(int ), (int)27);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)MediaInfo.esev("esik", eseq(int ), (int)28);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("esil", eseq(int ), (int)29);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eucj() {
        MediaInfo.eseu[100] = -1300876411;
        MediaInfo.eseu[101] = 839691222;
        MediaInfo.eseu[102] = 1977814373;
        MediaInfo.eseu[103] = 924815226;
        MediaInfo.eseu[104] = 1117209053;
        MediaInfo.eseu[105] = 448787339;
        MediaInfo.eseu[106] = -521095799;
        MediaInfo.eseu[107] = -1037207580;
        MediaInfo.eseu[108] = 1363389406;
        MediaInfo.eseu[109] = -701112618;
        MediaInfo.eseu[110] = -697604242;
        MediaInfo.eseu[111] = -1654440262;
        MediaInfo.eseu[112] = -1466285827;
        MediaInfo.eseu[113] = 862582609;
        MediaInfo.eseu[114] = -315208978;
        MediaInfo.eseu[115] = 239335474;
        MediaInfo.eseu[116] = 1840666777;
        MediaInfo.eseu[117] = 1349327577;
        MediaInfo.eseu[118] = -1745916552;
        MediaInfo.eseu[119] = 1196730912;
        MediaInfo.eseu[120] = -2031403425;
        MediaInfo.eseu[121] = 1057259179;
        MediaInfo.eseu[122] = -1876983569;
        MediaInfo.eseu[123] = 1313486301;
        MediaInfo.eseu[124] = -154224898;
        MediaInfo.eseu[125] = 1039222514;
        MediaInfo.eseu[126] = 1307154031;
        MediaInfo.eseu[127] = -1816216942;
        MediaInfo.eseu[128] = 369398134;
        MediaInfo.eseu[129] = -2064998701;
        MediaInfo.eseu[130] = 58063403;
        MediaInfo.eseu[131] = -540108764;
        MediaInfo.eseu[132] = 53750588;
        MediaInfo.eseu[133] = 943941923;
        MediaInfo.eseu[134] = 521882863;
        MediaInfo.eseu[135] = -1568682423;
        MediaInfo.eseu[136] = -1623521233;
        MediaInfo.eseu[137] = -1512469951;
        MediaInfo.eseu[138] = -1480053579;
        MediaInfo.eseu[139] = 1683592688;
        MediaInfo.eseu[140] = -1904661565;
        MediaInfo.eseu[141] = 1392188614;
        MediaInfo.eseu[142] = 1782919712;
        MediaInfo.eseu[143] = 250389265;
        MediaInfo.eseu[144] = -1787076453;
        MediaInfo.eseu[145] = -180145143;
        MediaInfo.eseu[146] = 761533787;
        MediaInfo.eseu[147] = -1336287201;
        MediaInfo.eseu[148] = -1968907137;
        MediaInfo.eseu[149] = 1645441335;
        MediaInfo.eseu[150] = -820222524;
        MediaInfo.eseu[151] = -2080124979;
        MediaInfo.eseu[152] = -1183938143;
        MediaInfo.eseu[153] = -899028983;
        MediaInfo.eseu[154] = 1925297239;
        MediaInfo.eseu[155] = 1009333694;
        MediaInfo.eseu[156] = 819648333;
        MediaInfo.eseu[157] = -914643750;
        MediaInfo.eseu[158] = 363773647;
        MediaInfo.eseu[159] = -1996658954;
        MediaInfo.eseu[160] = -1679740;
        MediaInfo.eseu[161] = 111052922;
        MediaInfo.eseu[162] = -2127853559;
        MediaInfo.eseu[163] = -1358740439;
        MediaInfo.eseu[164] = -1137490029;
        MediaInfo.eseu[165] = 894701078;
        MediaInfo.eseu[166] = 837095538;
        MediaInfo.eseu[167] = 1161708284;
        MediaInfo.eseu[168] = 2031447758;
        MediaInfo.eseu[169] = 189652261;
        MediaInfo.eseu[170] = 628173511;
        MediaInfo.eseu[171] = -719772357;
        MediaInfo.eseu[172] = 2099616120;
        MediaInfo.eseu[173] = 57885259;
        MediaInfo.eseu[174] = -907530903;
        MediaInfo.eseu[175] = -1629144806;
        MediaInfo.eseu[176] = 1288468071;
        MediaInfo.eseu[177] = 1083893177;
        MediaInfo.eseu[178] = 1825764588;
        MediaInfo.eseu[179] = 8856593;
        MediaInfo.eseu[180] = -114549115;
        MediaInfo.eseu[181] = -1705868952;
        MediaInfo.eseu[182] = -441811076;
        MediaInfo.eseu[183] = -1098250685;
        MediaInfo.eseu[184] = -584059521;
        MediaInfo.eseu[185] = -1972151556;
        MediaInfo.eseu[186] = 2136077445;
        MediaInfo.eseu[187] = 1069341747;
        MediaInfo.eseu[188] = 629606032;
        MediaInfo.eseu[189] = 1069286593;
        MediaInfo.eseu[190] = -552065634;
        MediaInfo.eseu[191] = 674697306;
        MediaInfo.eseu[192] = 421022411;
        MediaInfo.eseu[193] = -1663741176;
        MediaInfo.eseu[194] = 1726986707;
        MediaInfo.eseu[195] = 780993581;
        MediaInfo.eseu[196] = -498293387;
        MediaInfo.eseu[197] = -476478402;
        MediaInfo.eseu[198] = -426651249;
        MediaInfo.eseu[199] = 775729465;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long component5() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etkc", esfz(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("etkh", eseq(int ), (int)201)) break;
            v0 /* !! */  = (long)MediaInfo.esev("etki", eseq(int ), (int)202);
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("etkj", esfz(int ), (int)146));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block17;
                }
                case -1364829669: {
                    v2 = MediaInfo.esev("etkk", esfz(int ), (int)147);
                    continue block17;
                }
                case 2008973153: {
                    v2 = MediaInfo.esev("etkl", esfz(int ), (int)148);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        v3 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - MediaInfo.esev("etko", esfz(int ), (int)149));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2082533695: {
                    break block18;
                }
                case -978327243: {
                    v4 = MediaInfo.esev("etkp", esfz(int ), (int)150);
                    continue block18;
                }
                case -32162765: {
                    v4 = MediaInfo.esev("etku", esfz(int ), (int)151);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = MediaInfo.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (long)MediaInfo.esev("etkv", esfz(int ), (int)152);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("etkw", esfz(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == MediaInfo.esev("etky", eseq(int ), (int)203)) break;
                    v5 /* !! */  = (long)MediaInfo.esev("etla", eseq(int ), (int)204);
                }
                return this.duration;
            }
            case 0: {
                var2_2 /* !! */  = (int)MediaInfo.esev("etlc", eseq(int ), (int)205);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)MediaInfo.esev("etlf", eseq(int ), (int)206);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)MediaInfo.esev("etlm", eseq(int ), (int)207);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)MediaInfo.esev("etlo", eseq(int ), (int)208);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("esva", esfz(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esvb", eseq(int ), (int)121)) break;
            v0 /* !! */  = (long)MediaInfo.esev("esvj", eseq(int ), (int)122);
        }
        var4_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block63: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("esvk", esfz(int ), (int)58));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block63;
                }
                case -1153570803: {
                    v2 = MediaInfo.esev("esvm", esfz(int ), (int)59);
                    continue block63;
                }
                case 1428007109: {
                    v2 = MediaInfo.esev("esvp", esfz(int ), (int)60);
                    continue block63;
                }
                case 1487429017: {
                    v2 = MediaInfo.esev("esvr", esfz(int ), (int)61);
                    continue block63;
                }
            }
            break;
        }
        var3_2 /* !! */  = MediaInfo.b;
        v3 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl29
        block64: while (true) {
            v3 /* !! */  = (long)(v4 - MediaInfo.esev("esvt", esfz(int ), (int)62));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2082533695: {
                    break block64;
                }
                case -1575515817: {
                    v4 = MediaInfo.esev("esvv", esfz(int ), (int)63);
                    continue block64;
                }
                case -420032041: {
                    v4 = MediaInfo.esev("eswa", esfz(int ), (int)64);
                    continue block64;
                }
            }
            break;
        }
        var2_3 = MediaInfo.a;
        if (!var4_1) ** GOTO lbl45
        throw null;
lbl-1000:
        // 7 sources

        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)MediaInfo.esev("eswd", eseq(int ), (int)123);
                }
lbl45:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl-1000
                v5 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl50
                block66: while (true) {
                    v5 /* !! */  = (long)(MediaInfo.esev("eswh", esfz(int ), (int)66) - MediaInfo.esev("eswg", esfz(int ), (int)65));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2082533695: {
                            break block66;
                        }
                        case 359213177: {
                            continue block66;
                        }
                    }
                    break;
                }
                v6 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl59
                block67: while (true) {
                    v6 /* !! */  = (long)(v7 - MediaInfo.esev("eswi", esfz(int ), (int)67));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2082533695: {
                            break block67;
                        }
                        case 1133466972: {
                            v7 = MediaInfo.esev("eswj", esfz(int ), (int)68);
                            continue block67;
                        }
                        case 1829376755: {
                            v7 = MediaInfo.esev("eswk", esfz(int ), (int)69);
                            continue block67;
                        }
                    }
                    break;
                }
                var1_4 /* !! */  = this.title.hashCode();
                if (var2_3 || var2_3) ** GOTO lbl-1000
                v8 = MediaInfo.esev("esws", eseq(int ), (int)124) * var1_4 /* !! */ ;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("eswt", esfz(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == MediaInfo.esev("eswv", eseq(int ), (int)125)) break;
                    v9 /* !! */  = (long)MediaInfo.esev("esww", eseq(int ), (int)126);
                }
                v10 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl81
                block69: while (true) {
                    v10 /* !! */  = (long)(v11 - MediaInfo.esev("eswx", esfz(int ), (int)71));
lbl81:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2082533695: {
                            break block69;
                        }
                        case -304267361: {
                            v11 = MediaInfo.esev("eswz", esfz(int ), (int)72);
                            continue block69;
                        }
                        case 652431560: {
                            v11 = MediaInfo.esev("esxc", esfz(int ), (int)73);
                            continue block69;
                        }
                    }
                    break;
                }
                var1_4 /* !! */  = (int)(v8 + this.artist.hashCode());
                if (var2_3 || var2_3) ** GOTO lbl-1000
                v12 = MediaInfo.esev("esxl", eseq(int ), (int)127) * var1_4 /* !! */ ;
                v13 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl97
                block70: while (true) {
                    v13 /* !! */  = (long)(v14 - MediaInfo.esev("esxm", esfz(int ), (int)74));
lbl97:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2082533695: {
                            break block70;
                        }
                        case -1986711256: {
                            v14 = MediaInfo.esev("esxn", esfz(int ), (int)75);
                            continue block70;
                        }
                        case -658928233: {
                            v14 = MediaInfo.esev("esxo", esfz(int ), (int)76);
                            continue block70;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("esxp", esfz(int ), (int)77)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == MediaInfo.esev("esxr", eseq(int ), (int)128)) break;
                    v15 /* !! */  = (long)MediaInfo.esev("esxu", eseq(int ), (int)129);
                }
                var1_4 /* !! */  = (int)(v12 + Arrays.hashCode(this.artworkPng));
                if (var2_3 || var2_3) ** GOTO lbl-1000
                v16 = MediaInfo.esev("esyb", eseq(int ), (int)130) * var1_4 /* !! */ ;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = MediaInfo.lf - MediaInfo.esev("esye", esfz(int ), (int)78)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 /* !! */  == MediaInfo.esev("esyf", eseq(int ), (int)131)) break;
                    v17 /* !! */  = (long)MediaInfo.esev("esyg", eseq(int ), (int)132);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = MediaInfo.lf - MediaInfo.esev("esyh", esfz(int ), (int)79)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 /* !! */  == MediaInfo.esev("esyi", eseq(int ), (int)133)) break;
                    v18 /* !! */  = (long)MediaInfo.esev("esyj", eseq(int ), (int)134);
                }
                var1_4 /* !! */  = (int)(v16 + Long.hashCode(this.position));
                if (var2_3 || var2_3) ** GOTO lbl-1000
                v19 = MediaInfo.esev("esym", eseq(int ), (int)135) * var1_4 /* !! */ ;
                v20 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl134
                block74: while (true) {
                    v20 /* !! */  = (long)(MediaInfo.esev("esyo", esfz(int ), (int)81) - MediaInfo.esev("esyn", esfz(int ), (int)80));
lbl134:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -2082533695: {
                            break block74;
                        }
                        case 779059536: {
                            continue block74;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = MediaInfo.lf - MediaInfo.esev("esyp", esfz(int ), (int)82)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 /* !! */  == MediaInfo.esev("esyq", eseq(int ), (int)136)) break;
                    v21 /* !! */  = (long)MediaInfo.esev("esyr", eseq(int ), (int)137);
                }
                var1_4 /* !! */  = (int)(v19 + Long.hashCode(this.duration));
                if (var2_3 || var2_3) ** GOTO lbl-1000
                v22 = MediaInfo.esev("esyt", eseq(int ), (int)138) * var1_4 /* !! */ ;
                v23 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl152
                block76: while (true) {
                    v23 /* !! */  = (long)(v24 - MediaInfo.esev("esyw", esfz(int ), (int)83));
lbl152:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2082533695: {
                            break block76;
                        }
                        case -1737203152: {
                            v24 = MediaInfo.esev("esyy", esfz(int ), (int)84);
                            continue block76;
                        }
                        case -19661246: {
                            v24 = MediaInfo.esev("esyz", esfz(int ), (int)85);
                            continue block76;
                        }
                    }
                    break;
                }
                v25 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl165
                block77: while (true) {
                    v25 /* !! */  = (long)(v26 - MediaInfo.esev("esza", esfz(int ), (int)86));
lbl165:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -2082533695: {
                            break block77;
                        }
                        case -1380033636: {
                            v26 = MediaInfo.esev("eszb", esfz(int ), (int)87);
                            continue block77;
                        }
                        case 722421422: {
                            v26 = MediaInfo.esev("eszi", esfz(int ), (int)88);
                            continue block77;
                        }
                    }
                    break;
                }
                var1_4 /* !! */  = (int)(v22 + Boolean.hashCode(this.playing));
                if (var2_3 || var2_3) continue block65;
                return var1_4 /* !! */ ;
lbl177:
                // 3 sources

                case 0: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("eszl", eseq(int ), (int)139);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl181:
                // 4 sources

                case 1: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("eszo", eseq(int ), (int)140);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
                case 2: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("eszs", eseq(int ), (int)141);
                    if (!var4_1) ** GOTO lbl177
                    throw null;
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)MediaInfo.esev("eszt", eseq(int ), (int)142);
                        if (!var4_1) ** GOTO lbl181
                        throw null;
                    }
                }
                case 4: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("eszu", eseq(int ), (int)143);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl213
                }
lbl200:
                // 4 sources

                case 5: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("eszx", eseq(int ), (int)144);
                    if (!var4_1) break block65;
                    throw null;
                }
lbl204:
                // 2 sources

                case 6: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etaf", eseq(int ), (int)145);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl209:
                // 2 sources

                case 7: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etah", eseq(int ), (int)146);
                    if (!var4_1) ** GOTO lbl177
                    throw null;
                }
lbl213:
                // 2 sources

                case 8: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etal", eseq(int ), (int)147);
                    if (!var4_1) ** GOTO lbl200
                    throw null;
                }
                case 9: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etam", eseq(int ), (int)148);
                    if (!var4_1) break block65;
                    throw null;
                }
lbl221:
                // 2 sources

                case 10: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etao", eseq(int ), (int)149);
                    if (!var4_1) ** GOTO lbl200
                    throw null;
                }
                case 11: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etar", eseq(int ), (int)150);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl230:
                // 2 sources

                case 12: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etav", eseq(int ), (int)151);
                    if (!var4_1) ** GOTO lbl200
                    throw null;
                }
                case 13: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etbb", eseq(int ), (int)152);
                    if (!var4_1) ** GOTO lbl209
                    throw null;
                }
lbl238:
                // 2 sources

                case 14: {
                    var3_2 /* !! */  = (int)MediaInfo.esev("etbd", eseq(int ), (int)153);
                    if (!var4_1) ** GOTO lbl230
                    throw null;
                }
                case 15: 
            }
        }
        var3_2 /* !! */  = (int)MediaInfo.esev("etbg", eseq(int ), (int)154);
        ** while (!var4_1)
lbl245:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final MediaInfo copy(@NotNull String var1_1, @NotNull String var2_2, @NotNull byte[] var3_3, long var4_4, long var6_5, boolean var8_6) {
        v0 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - MediaInfo.esev("etna", esfz(int ), (int)160));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2082533695: {
                    break block35;
                }
                case -789129537: {
                    v1 = MediaInfo.esev("etnb", esfz(int ), (int)161);
                    continue block35;
                }
                case 288590610: {
                    v1 = MediaInfo.esev("etnc", esfz(int ), (int)162);
                    continue block35;
                }
                case 1750619793: {
                    v1 = MediaInfo.esev("etnd", esfz(int ), (int)163);
                    continue block35;
                }
            }
            break;
        }
        var11_7 = MediaInfo.c;
        v2 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl22
        block36: while (true) {
            v2 /* !! */  = (long)(v3 - MediaInfo.esev("etne", esfz(int ), (int)164));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2082533695: {
                    break block36;
                }
                case -799220509: {
                    v3 = MediaInfo.esev("etnf", esfz(int ), (int)165);
                    continue block36;
                }
                case 366658565: {
                    v3 = MediaInfo.esev("etng", esfz(int ), (int)166);
                    continue block36;
                }
                case 1230941194: {
                    v3 = MediaInfo.esev("etnh", esfz(int ), (int)167);
                    continue block36;
                }
            }
            break;
        }
        var10_8 /* !! */  = MediaInfo.b;
        v4 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl39
        block37: while (true) {
            v4 /* !! */  = (long)(MediaInfo.esev("etnj", esfz(int ), (int)169) - MediaInfo.esev("etni", esfz(int ), (int)168));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2082533695: {
                    break block37;
                }
                case -908701249: {
                    continue block37;
                }
            }
            break;
        }
        var9_9 = MediaInfo.a;
        if (!var11_7) ** GOTO lbl51
        throw null;
        {
            if (var10_8 /* !! */  == 0) ** GOTO lbl-1000
            switch (var10_8 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl51:
                // 1 sources

                if (var9_9 || var9_9) continue block38;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etnk", esfz(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == MediaInfo.esev("etnm", eseq(int ), (int)220)) break;
                    v5 /* !! */  = (long)MediaInfo.esev("etnr", eseq(int ), (int)221);
                }
                Intrinsics.checkNotNullParameter((Object)var1_1, (String)"title");
                if (var9_9) continue block38;
                v6 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl63
                block40: while (true) {
                    v6 /* !! */  = (long)(MediaInfo.esev("etnv", esfz(int ), (int)172) - MediaInfo.esev("etnt", esfz(int ), (int)171));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2082533695: {
                            break block40;
                        }
                        case 1259682525: {
                            continue block40;
                        }
                    }
                    break;
                }
                Intrinsics.checkNotNullParameter((Object)var2_2, (String)"artist");
                if (var9_9) continue block38;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("etnw", esfz(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == MediaInfo.esev("etnx", eseq(int ), (int)222)) break;
                    v7 /* !! */  = (long)MediaInfo.esev("etny", eseq(int ), (int)223);
                }
                Intrinsics.checkNotNullParameter((Object)var3_3, (String)"artworkPng");
                if (!var9_9) ** break;
                continue block38;
                v8 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl82
                block42: while (true) {
                    v8 /* !! */  = (long)(v9 - MediaInfo.esev("etnz", esfz(int ), (int)174));
lbl82:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2082533695: {
                            break block42;
                        }
                        case -2010778779: {
                            v9 = MediaInfo.esev("etob", esfz(int ), (int)175);
                            continue block42;
                        }
                        case -1279926421: {
                            v9 = MediaInfo.esev("etod", esfz(int ), (int)176);
                            continue block42;
                        }
                        case -1015737016: {
                            v9 = MediaInfo.esev("etof", esfz(int ), (int)177);
                            continue block42;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("etoi", esfz(int ), (int)178)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == MediaInfo.esev("etoj", eseq(int ), (int)224)) break;
                    v10 /* !! */  = (long)MediaInfo.esev("etok", eseq(int ), (int)225);
                }
                return new MediaInfo(var1_1, var2_2, var3_3, var4_4, var6_5, var8_6);
lbl100:
                // 2 sources

                case 0: {
                    var10_8 /* !! */  = (int)MediaInfo.esev("etol", eseq(int ), (int)226);
                    if (var11_7) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
                case 1: {
                    var10_8 /* !! */  = (int)MediaInfo.esev("etos", eseq(int ), (int)227);
                    if (var11_7) {
                        throw null;
                    }
                }
                case 2: {
                    var10_8 /* !! */  = (int)MediaInfo.esev("etot", eseq(int ), (int)228);
                    if (var11_7) {
                        throw null;
                    }
                    ** GOTO lbl123
                }
lbl114:
                // 2 sources

                case 3: {
                    var10_8 /* !! */  = (int)MediaInfo.esev("etov", eseq(int ), (int)229);
                    if (!var11_7) break block38;
                    throw null;
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var10_8 /* !! */  = (int)MediaInfo.esev("etow", eseq(int ), (int)230);
                        if (!var11_7) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl123:
                // 2 sources

                case 5: {
                    var10_8 /* !! */  = (int)MediaInfo.esev("etox", eseq(int ), (int)231);
                    if (!var11_7) ** GOTO lbl100
                    throw null;
                }
                case 6: 
            }
        }
        var10_8 /* !! */  = (int)MediaInfo.esev("etoy", eseq(int ), (int)232);
        ** while (!var11_7)
lbl130:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final long component4() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = lf - MediaInfo.esev("etis", esfz(int ), (int)138)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo.esev("etiu", eseq(int ), (int)191)) break;
            object = MediaInfo.esev("etiy", eseq(int ), (int)192);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = lf - MediaInfo.esev("etiz", esfz(int ), (int)139)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo.esev("etja", eseq(int ), (int)193)) break;
            object = MediaInfo.esev("etjg", eseq(int ), (int)194);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = lf - MediaInfo.esev("etjh", esfz(int ), (int)140)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo.esev("etji", eseq(int ), (int)195)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = MediaInfo.esev("etjj", eseq(int ), (int)196);
        }
        if (bl2) return (long)MediaInfo.esev("etjk", esfz(int ), (int)141);
        if (bl2) return (long)MediaInfo.esev("etjk", esfz(int ), (int)141);
        Object object = lf;
        boolean bl4 = true;
        block8: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - MediaInfo.esev("etjm", esfz(int ), (int)142);
            }
            switch ((int)object) {
                case -2082533695: {
                    return this.position;
                }
                case -1296346441: {
                    callSite = MediaInfo.esev("etjo", esfz(int ), (int)143);
                    continue block8;
                }
                case 1949979943: {
                    callSite = MediaInfo.esev("etju", esfz(int ), (int)144);
                    continue block8;
                }
            }
            break;
        }
        return this.position;
    }

    private static /* synthetic */ long esfz(int n2) {
        return esgb[n2] ^ esgd[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String component2() {
        v0 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - MediaInfo.esev("etgg", esfz(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2082533695: {
                    break block28;
                }
                case -1295683824: {
                    v1 = MediaInfo.esev("etgl", esfz(int ), (int)115);
                    continue block28;
                }
                case 82641468: {
                    v1 = MediaInfo.esev("etgm", esfz(int ), (int)116);
                    continue block28;
                }
                case 166944093: {
                    v1 = MediaInfo.esev("etgn", esfz(int ), (int)117);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = MediaInfo.c;
        v2 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - MediaInfo.esev("etgo", esfz(int ), (int)118));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2082533695: {
                    break block29;
                }
                case -1950806048: {
                    v3 = MediaInfo.esev("etgq", esfz(int ), (int)119);
                    continue block29;
                }
                case 129875775: {
                    v3 = MediaInfo.esev("etgr", esfz(int ), (int)120);
                    continue block29;
                }
                case 1159231450: {
                    v3 = MediaInfo.esev("etgu", esfz(int ), (int)121);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl42
                block30: while (true) {
                    v4 /* !! */  = (long)(MediaInfo.esev("etgw", esfz(int ), (int)123) - MediaInfo.esev("etgv", esfz(int ), (int)122));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2146780202: {
                            continue block30;
                        }
                        case -2082533695: {
                            break block30;
                        }
                    }
                    break;
                }
                var1_3 = MediaInfo.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl57
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - MediaInfo.esev("etgx", esfz(int ), (int)124));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2082533695: {
                            break block32;
                        }
                        case -1741852936: {
                            v6 = MediaInfo.esev("etgy", esfz(int ), (int)125);
                            continue block32;
                        }
                        case -1339439655: {
                            v6 = MediaInfo.esev("etgz", esfz(int ), (int)126);
                            continue block32;
                        }
                        case -475981058: {
                            v6 = MediaInfo.esev("etha", esfz(int ), (int)127);
                            continue block32;
                        }
                    }
                    break;
                }
                return this.artist;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)MediaInfo.esev("ethb", eseq(int ), (int)179);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)MediaInfo.esev("ethc", eseq(int ), (int)180);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)MediaInfo.esev("ethd", eseq(int ), (int)181);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("ethf", eseq(int ), (int)182);
        ** while (!var3_1)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final byte[] component3() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("ethk", esfz(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("ethm", eseq(int ), (int)183)) break;
            v0 /* !! */  = (long)MediaInfo.esev("ethn", eseq(int ), (int)184);
        }
        var3_1 = MediaInfo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("ethp", esfz(int ), (int)129)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == MediaInfo.esev("ethr", eseq(int ), (int)185)) break;
            v1 /* !! */  = (long)MediaInfo.esev("eths", eseq(int ), (int)186);
        }
        var2_2 /* !! */  = MediaInfo.b;
        v2 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - MediaInfo.esev("ethu", esfz(int ), (int)130));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2082533695: {
                    break block20;
                }
                case -1818710948: {
                    v3 = MediaInfo.esev("ethy", esfz(int ), (int)131);
                    continue block20;
                }
                case -402175001: {
                    v3 = MediaInfo.esev("ethz", esfz(int ), (int)132);
                    continue block20;
                }
                case 1209806757: {
                    v3 = MediaInfo.esev("etia", esfz(int ), (int)133);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = MediaInfo.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block21;
                v4 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl43
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - MediaInfo.esev("etid", esfz(int ), (int)134));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2082533695: {
                            break block22;
                        }
                        case -1405218528: {
                            v5 = MediaInfo.esev("etif", esfz(int ), (int)135);
                            continue block22;
                        }
                        case -779002812: {
                            v5 = MediaInfo.esev("etig", esfz(int ), (int)136);
                            continue block22;
                        }
                        case -243120023: {
                            v5 = MediaInfo.esev("etih", esfz(int ), (int)137);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.artworkPng;
lbl56:
                // 3 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)MediaInfo.esev("etim", eseq(int ), (int)187);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl66
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("etin", eseq(int ), (int)188);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
lbl66:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("etio", eseq(int ), (int)189);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("etip", eseq(int ), (int)190);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void euff() {
        MediaInfo.esgb[100] = -6915720472438384484L;
        MediaInfo.esgb[101] = -1915315365377840049L;
        MediaInfo.esgb[102] = -3277390692043883972L;
        MediaInfo.esgb[103] = -122649828579785430L;
        MediaInfo.esgb[104] = -4396778826046590286L;
        MediaInfo.esgb[105] = -2054700184352085195L;
        MediaInfo.esgb[106] = -594778456257287570L;
        MediaInfo.esgb[107] = 4555614459783180511L;
        MediaInfo.esgb[108] = 7150600830691928987L;
        MediaInfo.esgb[109] = 1678062503790120468L;
        MediaInfo.esgb[110] = 778638404582996592L;
        MediaInfo.esgb[111] = -4336451121047569432L;
        MediaInfo.esgb[112] = -4317806075531309062L;
        MediaInfo.esgb[113] = 6783388829305030765L;
        MediaInfo.esgb[114] = -895800835973425384L;
        MediaInfo.esgb[115] = -5269758695416571205L;
        MediaInfo.esgb[116] = 5548483547823827072L;
        MediaInfo.esgb[117] = -5583265329234489879L;
        MediaInfo.esgb[118] = -8649940531272228930L;
        MediaInfo.esgb[119] = -4800803008663529210L;
        MediaInfo.esgb[120] = -9208600466230837021L;
        MediaInfo.esgb[121] = 2662882628640168543L;
        MediaInfo.esgb[122] = -7384006692808018192L;
        MediaInfo.esgb[123] = -2794565442568706873L;
        MediaInfo.esgb[124] = 976469117301361609L;
        MediaInfo.esgb[125] = -6876052075524525077L;
        MediaInfo.esgb[126] = 6225306418427919762L;
        MediaInfo.esgb[127] = 5400847714807975041L;
        MediaInfo.esgb[128] = -4683168947038101128L;
        MediaInfo.esgb[129] = -5027988729910108787L;
        MediaInfo.esgb[130] = 8213059143063769338L;
        MediaInfo.esgb[131] = 3723896576489700202L;
        MediaInfo.esgb[132] = -8642896974560420851L;
        MediaInfo.esgb[133] = 2948958691739428611L;
        MediaInfo.esgb[134] = -7863466472928442980L;
        MediaInfo.esgb[135] = 314099449338138948L;
        MediaInfo.esgb[136] = -8709552742894497128L;
        MediaInfo.esgb[137] = -14302190224779134L;
        MediaInfo.esgb[138] = 2018356951719570650L;
        MediaInfo.esgb[139] = -8768772055239062481L;
        MediaInfo.esgb[140] = -6188216530549980571L;
        MediaInfo.esgb[141] = 2927624746911800688L;
        MediaInfo.esgb[142] = -7068149635241394082L;
        MediaInfo.esgb[143] = -6496604660265338905L;
        MediaInfo.esgb[144] = -6965202635440840748L;
        MediaInfo.esgb[145] = 2224152311511981870L;
        MediaInfo.esgb[146] = -4211113861865179439L;
        MediaInfo.esgb[147] = -4786966179050645417L;
        MediaInfo.esgb[148] = 5708787720993744229L;
        MediaInfo.esgb[149] = 3436544726074384283L;
        MediaInfo.esgb[150] = 101705144288669303L;
        MediaInfo.esgb[151] = 8162344925127182932L;
        MediaInfo.esgb[152] = -904608355346533129L;
        MediaInfo.esgb[153] = 1522084961598333824L;
        MediaInfo.esgb[154] = -2384484833278110032L;
        MediaInfo.esgb[155] = 4999304793867073834L;
        MediaInfo.esgb[156] = -1573806986218957958L;
        MediaInfo.esgb[157] = -7015130627201167205L;
        MediaInfo.esgb[158] = -8498606600824642897L;
        MediaInfo.esgb[159] = -5041796897406979663L;
        MediaInfo.esgb[160] = 2264507751240421963L;
        MediaInfo.esgb[161] = 3881739087271521419L;
        MediaInfo.esgb[162] = -139203032889542212L;
        MediaInfo.esgb[163] = 7515962707740421646L;
        MediaInfo.esgb[164] = 6764300460581500342L;
        MediaInfo.esgb[165] = -4506691914992452933L;
        MediaInfo.esgb[166] = -3785093298483450322L;
        MediaInfo.esgb[167] = 5611554983625604762L;
        MediaInfo.esgb[168] = 7842216791861293880L;
        MediaInfo.esgb[169] = -2225094676861608966L;
        MediaInfo.esgb[170] = 8666641774020381883L;
        MediaInfo.esgb[171] = 7096757356536503761L;
        MediaInfo.esgb[172] = -3626888384877381418L;
        MediaInfo.esgb[173] = -2430278423399678904L;
        MediaInfo.esgb[174] = 557043200905758094L;
        MediaInfo.esgb[175] = 3603255450618553159L;
        MediaInfo.esgb[176] = -1182092610086103776L;
        MediaInfo.esgb[177] = 4536688356971506287L;
        MediaInfo.esgb[178] = -8241229250212866213L;
        MediaInfo.esgb[179] = 1095027092341754833L;
        MediaInfo.esgb[180] = -6431556357772564651L;
        MediaInfo.esgb[181] = -2944054594261942227L;
        MediaInfo.esgb[182] = 7444052726024258076L;
        MediaInfo.esgb[183] = -7558432729386645553L;
        MediaInfo.esgb[184] = 1422379912233095452L;
        MediaInfo.esgb[185] = 6181018297217311662L;
        MediaInfo.esgb[186] = -4523837965907563978L;
        MediaInfo.esgb[187] = 7518808905790579033L;
        MediaInfo.esgb[188] = -276886666932915773L;
        MediaInfo.esgb[189] = -3437349706514060705L;
        MediaInfo.esgb[190] = -3266362513215010194L;
        MediaInfo.esgb[191] = 8188872088788618021L;
        MediaInfo.esgb[192] = -539388052787300409L;
        MediaInfo.esgb[193] = -7332485356693074507L;
        MediaInfo.esgb[194] = -1063388502624609537L;
        MediaInfo.esgb[195] = -2276537213747146270L;
        MediaInfo.esgb[196] = 7061929467917410816L;
        MediaInfo.esgb[197] = 1340094970859531267L;
        MediaInfo.esgb[198] = 8170508111780949894L;
        MediaInfo.esgb[199] = -4183922118783880233L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @JvmStatic
    public static final /* synthetic */ void write$Self$MediaPlayerInfo(MediaInfo var0, CompositeEncoder var1_1, SerialDescriptor var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etuo", esfz(int ), (int)199)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == MediaInfo.esev("etup", eseq(int ), (int)278)) break;
            v0 /* !! */  = (long)MediaInfo.esev("etur", eseq(int ), (int)279);
        }
        var5_3 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl11
        block54: while (true) {
            v1 /* !! */  = (long)(MediaInfo.esev("etuu", esfz(int ), (int)201) - MediaInfo.esev("etus", esfz(int ), (int)200));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block54;
                }
                case 1859783359: {
                    continue block54;
                }
            }
            break;
        }
        var4_4 /* !! */  = MediaInfo.b;
        v2 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl21
        block55: while (true) {
            v2 /* !! */  = (long)(v3 - MediaInfo.esev("etuv", esfz(int ), (int)202));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2082533695: {
                    break block55;
                }
                case -543388632: {
                    v3 = MediaInfo.esev("etuz", esfz(int ), (int)203);
                    continue block55;
                }
                case 547292845: {
                    v3 = MediaInfo.esev("etva", esfz(int ), (int)204);
                    continue block55;
                }
                case 1045026191: {
                    v3 = MediaInfo.esev("etvb", esfz(int ), (int)205);
                    continue block55;
                }
            }
            break;
        }
        var3_5 = MediaInfo.a;
        if (var5_3) {
            throw null;
lbl36:
            // 8 sources

            return;
        }
        if (var3_5) ** GOTO lbl36
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl36
                v4 = MediaInfo.esev("etvc", eseq(int ), (int)280);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("etvd", esfz(int ), (int)206)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == MediaInfo.esev("etve", eseq(int ), (int)281)) break;
                    v5 /* !! */  = (long)MediaInfo.esev("etvg", eseq(int ), (int)282);
                }
                v6 = var0.title;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("etvl", esfz(int ), (int)207)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == MediaInfo.esev("etvm", eseq(int ), (int)283)) break;
                    v7 /* !! */  = (long)MediaInfo.esev("etvn", eseq(int ), (int)284);
                }
                var1_1.encodeStringElement(var2_2, (int)v4, v6);
                if (var3_5) ** GOTO lbl36
                v8 = MediaInfo.esev("etvo", eseq(int ), (int)285);
                v9 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl62
                block59: while (true) {
                    v9 /* !! */  = (long)(v10 - MediaInfo.esev("etvp", esfz(int ), (int)208));
lbl62:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2082533695: {
                            break block59;
                        }
                        case -1841293632: {
                            v10 = MediaInfo.esev("etvq", esfz(int ), (int)209);
                            continue block59;
                        }
                        case -446787681: {
                            v10 = MediaInfo.esev("etvr", esfz(int ), (int)210);
                            continue block59;
                        }
                        case 1078874106: {
                            v10 = MediaInfo.esev("etvt", esfz(int ), (int)211);
                            continue block59;
                        }
                    }
                    break;
                }
                v11 = var0.artist;
                v12 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl79
                block60: while (true) {
                    v12 /* !! */  = (long)(v13 - MediaInfo.esev("etvu", esfz(int ), (int)212));
lbl79:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2082533695: {
                            break block60;
                        }
                        case -1541930677: {
                            v13 = MediaInfo.esev("etvw", esfz(int ), (int)213);
                            continue block60;
                        }
                        case -1210342831: {
                            v13 = MediaInfo.esev("etvy", esfz(int ), (int)214);
                            continue block60;
                        }
                        case 404951165: {
                            v13 = MediaInfo.esev("etwa", esfz(int ), (int)215);
                            continue block60;
                        }
                    }
                    break;
                }
                var1_1.encodeStringElement(var2_2, (int)v8, v11);
                if (var3_5) ** GOTO lbl36
                v14 = MediaInfo.esev("etwb", eseq(int ), (int)286);
                v15 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl98
                block61: while (true) {
                    v15 /* !! */  = (long)(v16 - MediaInfo.esev("etwc", esfz(int ), (int)216));
lbl98:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2082533695: {
                            break block61;
                        }
                        case -712272200: {
                            v16 = MediaInfo.esev("etwf", esfz(int ), (int)217);
                            continue block61;
                        }
                        case 1251971676: {
                            v16 = MediaInfo.esev("etwh", esfz(int ), (int)218);
                            continue block61;
                        }
                    }
                    break;
                }
                v17 = (SerializationStrategy)ByteArraySerializer.INSTANCE;
                v18 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl112
                block62: while (true) {
                    v18 /* !! */  = (long)(MediaInfo.esev("etwm", esfz(int ), (int)220) - MediaInfo.esev("etwj", esfz(int ), (int)219));
lbl112:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2082533695: {
                            break block62;
                        }
                        case -409012927: {
                            continue block62;
                        }
                    }
                    break;
                }
                v19 = var0.artworkPng;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = MediaInfo.lf - MediaInfo.esev("etwp", esfz(int ), (int)221)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == MediaInfo.esev("etwr", eseq(int ), (int)287)) break;
                    v20 /* !! */  = (long)MediaInfo.esev("etws", eseq(int ), (int)288);
                }
                var1_1.encodeSerializableElement(var2_2, (int)v14, v17, (Object)v19);
                if (var3_5) ** GOTO lbl36
                v21 = MediaInfo.esev("etwu", eseq(int ), (int)289);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_4 = MediaInfo.lf - MediaInfo.esev("etww", esfz(int ), (int)222)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == MediaInfo.esev("etwy", eseq(int ), (int)290)) break;
                    v22 /* !! */  = (long)MediaInfo.esev("etxa", eseq(int ), (int)291);
                }
                v23 = var0.position;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = MediaInfo.lf - MediaInfo.esev("etxc", esfz(int ), (int)223)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == MediaInfo.esev("etxe", eseq(int ), (int)292)) break;
                    v24 /* !! */  = (long)MediaInfo.esev("etxg", eseq(int ), (int)293);
                }
                var1_1.encodeLongElement(var2_2, (int)v21, v23);
                if (var3_5) ** GOTO lbl36
                v25 = MediaInfo.esev("etxi", eseq(int ), (int)294);
                v26 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl144
                block66: while (true) {
                    v26 /* !! */  = (long)(MediaInfo.esev("etxk", esfz(int ), (int)225) - MediaInfo.esev("etxj", esfz(int ), (int)224));
lbl144:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2082533695: {
                            break block66;
                        }
                        case 380313739: {
                            continue block66;
                        }
                    }
                    break;
                }
                v27 = var0.duration;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_6 = MediaInfo.lf - MediaInfo.esev("etxl", esfz(int ), (int)226)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == MediaInfo.esev("etxm", eseq(int ), (int)295)) break;
                    v28 /* !! */  = (long)MediaInfo.esev("etxn", eseq(int ), (int)296);
                }
                var1_1.encodeLongElement(var2_2, (int)v25, v27);
                if (var3_5) ** GOTO lbl36
                v29 = MediaInfo.esev("etxp", eseq(int ), (int)297);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_7 = MediaInfo.lf - MediaInfo.esev("etxq", esfz(int ), (int)227)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == MediaInfo.esev("etxs", eseq(int ), (int)298)) break;
                    v30 /* !! */  = (long)MediaInfo.esev("etxu", eseq(int ), (int)299);
                }
                v31 = var0.playing;
                v32 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl168
                block69: while (true) {
                    v32 /* !! */  = (long)(v33 - MediaInfo.esev("etxx", esfz(int ), (int)228));
lbl168:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -2082533695: {
                            break block69;
                        }
                        case -254620162: {
                            v33 = MediaInfo.esev("etya", esfz(int ), (int)229);
                            continue block69;
                        }
                        case -47029789: {
                            v33 = MediaInfo.esev("etyc", esfz(int ), (int)230);
                            continue block69;
                        }
                        case 1952988654: {
                            v33 = MediaInfo.esev("etyd", esfz(int ), (int)231);
                            continue block69;
                        }
                    }
                    break;
                }
                var1_1.encodeBooleanElement(var2_2, (int)v29, v31);
                if (var3_5) ** continue;
                return;
            }
            case 0: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyf", eseq(int ), (int)300);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 1: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyi", eseq(int ), (int)301);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 2: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyl", eseq(int ), (int)302);
                if (var5_3) {
                    throw null;
                }
            }
lbl197:
            // 5 sources

            case 3: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyn", eseq(int ), (int)303);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 4: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyo", eseq(int ), (int)304);
                if (!var5_3) ** GOTO lbl197
                throw null;
            }
lbl206:
            // 4 sources

            case 5: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyp", eseq(int ), (int)305);
                if (var5_3) {
                    throw null;
                }
            }
lbl210:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)MediaInfo.esev("etyt", eseq(int ), (int)306);
                    if (!var5_3) ** GOTO lbl206
                    throw null;
                }
            }
            case 7: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyu", eseq(int ), (int)307);
                if (!var5_3) ** GOTO lbl197
                throw null;
            }
lbl219:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)MediaInfo.esev("etyw", eseq(int ), (int)308);
                if (!var5_3) ** GOTO lbl206
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)MediaInfo.esev("etyz", eseq(int ), (int)309);
        ** while (!var5_3)
lbl226:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eudt() {
        MediaInfo.eseu[300] = -2005540506;
        MediaInfo.eseu[301] = 307609216;
        MediaInfo.eseu[302] = -581961737;
        MediaInfo.eseu[303] = 1070345699;
        MediaInfo.eseu[304] = 571744700;
        MediaInfo.eseu[305] = 1777847518;
        MediaInfo.eseu[306] = 1879779679;
        MediaInfo.eseu[307] = -59988877;
        MediaInfo.eseu[308] = -1652901898;
        MediaInfo.eseu[309] = -95050011;
        MediaInfo.eseu[310] = -1335261776;
        MediaInfo.eseu[311] = 1996194009;
        MediaInfo.eseu[312] = -1235625263;
        MediaInfo.eseu[313] = -1754818986;
        MediaInfo.eseu[314] = 1502510905;
        MediaInfo.eseu[315] = 1680601786;
        MediaInfo.eseu[316] = -1060632889;
        MediaInfo.eseu[317] = 682630624;
        MediaInfo.eseu[318] = 1499550556;
        MediaInfo.eseu[319] = 1188300289;
        MediaInfo.eseu[320] = -2064598708;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean component6() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etlr", esfz(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("etls", eseq(int ), (int)209)) break;
            v0 /* !! */  = (long)MediaInfo.esev("etlt", eseq(int ), (int)210);
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("etlu", esfz(int ), (int)155));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block12;
                }
                case -1887455382: {
                    v2 = MediaInfo.esev("etmd", esfz(int ), (int)156);
                    continue block12;
                }
                case 1853723845: {
                    v2 = MediaInfo.esev("etmf", esfz(int ), (int)157);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("etmh", esfz(int ), (int)158)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == MediaInfo.esev("etmj", eseq(int ), (int)211)) break;
            v3 /* !! */  = (long)MediaInfo.esev("etml", eseq(int ), (int)212);
        }
        var1_3 = MediaInfo.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)MediaInfo.esev("etmn", eseq(int ), (int)213);
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("etmr", esfz(int ), (int)159)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == MediaInfo.esev("etmt", eseq(int ), (int)214)) break;
                    v4 /* !! */  = (long)MediaInfo.esev("etmv", eseq(int ), (int)215);
                }
                return this.playing;
lbl43:
                // 3 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)MediaInfo.esev("etmw", eseq(int ), (int)216);
                    } while (!var3_1);
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)MediaInfo.esev("etmx", eseq(int ), (int)217);
                        if (!var3_1) ** GOTO lbl43
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("etmy", eseq(int ), (int)218);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("etmz", eseq(int ), (int)219);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eued() {
        MediaInfo.esgb[0] = 1941757306668797630L;
        MediaInfo.esgb[1] = 4250014277586805357L;
        MediaInfo.esgb[2] = -4767931333379979912L;
        MediaInfo.esgb[3] = 1372984149596430787L;
        MediaInfo.esgb[4] = -6432992459720769172L;
        MediaInfo.esgb[5] = 642969705187596586L;
        MediaInfo.esgb[6] = -2385248015941970570L;
        MediaInfo.esgb[7] = -2650372677372715406L;
        MediaInfo.esgb[8] = 8806213658821524651L;
        MediaInfo.esgb[9] = 1201771718759016260L;
        MediaInfo.esgb[10] = -8941594896558269039L;
        MediaInfo.esgb[11] = -5575504129569868946L;
        MediaInfo.esgb[12] = -7524834690731785572L;
        MediaInfo.esgb[13] = 8417086972037240793L;
        MediaInfo.esgb[14] = -5567969310760848092L;
        MediaInfo.esgb[15] = -7287942578249926376L;
        MediaInfo.esgb[16] = -3991575833881357838L;
        MediaInfo.esgb[17] = 1344310727167971786L;
        MediaInfo.esgb[18] = -9155896852938218618L;
        MediaInfo.esgb[19] = 1903833354934158486L;
        MediaInfo.esgb[20] = 3968469014551000318L;
        MediaInfo.esgb[21] = 6754101791327885446L;
        MediaInfo.esgb[22] = -34601049012218362L;
        MediaInfo.esgb[23] = 7359504589905733962L;
        MediaInfo.esgb[24] = -3127047877060729782L;
        MediaInfo.esgb[25] = -5381669543094087034L;
        MediaInfo.esgb[26] = -8437615647243689104L;
        MediaInfo.esgb[27] = 1105368986517207665L;
        MediaInfo.esgb[28] = 8212125278339042711L;
        MediaInfo.esgb[29] = -3227852720902329503L;
        MediaInfo.esgb[30] = -3822228166752038934L;
        MediaInfo.esgb[31] = 3895203248257630464L;
        MediaInfo.esgb[32] = 5228030094805833007L;
        MediaInfo.esgb[33] = 2193377678030992726L;
        MediaInfo.esgb[34] = 8358694554331733837L;
        MediaInfo.esgb[35] = -933544210756454813L;
        MediaInfo.esgb[36] = 1552714104895225673L;
        MediaInfo.esgb[37] = 576935701403985332L;
        MediaInfo.esgb[38] = -2366138072584707434L;
        MediaInfo.esgb[39] = -2924496835137194691L;
        MediaInfo.esgb[40] = -5494066376946011158L;
        MediaInfo.esgb[41] = 7293754071624534451L;
        MediaInfo.esgb[42] = -5195754880772115477L;
        MediaInfo.esgb[43] = -6371151886306740322L;
        MediaInfo.esgb[44] = -6071147239947998312L;
        MediaInfo.esgb[45] = -1886189039385970356L;
        MediaInfo.esgb[46] = -6220457317474905429L;
        MediaInfo.esgb[47] = -3666856527243195938L;
        MediaInfo.esgb[48] = 8613065539837065735L;
        MediaInfo.esgb[49] = -3798845443909104264L;
        MediaInfo.esgb[50] = 1633926222999987886L;
        MediaInfo.esgb[51] = 8361113601964177719L;
        MediaInfo.esgb[52] = 6266926236046413217L;
        MediaInfo.esgb[53] = -6438719596518254389L;
        MediaInfo.esgb[54] = 7006155700773789518L;
        MediaInfo.esgb[55] = 2971635745589210441L;
        MediaInfo.esgb[56] = 2023146067978982544L;
        MediaInfo.esgb[57] = 872331746381894030L;
        MediaInfo.esgb[58] = -3592532483724135582L;
        MediaInfo.esgb[59] = -6332539036760376403L;
        MediaInfo.esgb[60] = 4821171888144221691L;
        MediaInfo.esgb[61] = -7408876075203167945L;
        MediaInfo.esgb[62] = 4933661567849185689L;
        MediaInfo.esgb[63] = 6483680064134677227L;
        MediaInfo.esgb[64] = -86086789061415716L;
        MediaInfo.esgb[65] = 3812476159224156558L;
        MediaInfo.esgb[66] = 5625197121483119556L;
        MediaInfo.esgb[67] = -4277452727263744507L;
        MediaInfo.esgb[68] = -1789932378636321962L;
        MediaInfo.esgb[69] = 8651360996606126071L;
        MediaInfo.esgb[70] = 1317037677130763605L;
        MediaInfo.esgb[71] = 1553230464060140851L;
        MediaInfo.esgb[72] = -8447073782665745844L;
        MediaInfo.esgb[73] = -7023249929039407249L;
        MediaInfo.esgb[74] = -6932816299477285109L;
        MediaInfo.esgb[75] = -5636276643279273133L;
        MediaInfo.esgb[76] = 3001203032162168417L;
        MediaInfo.esgb[77] = 2953892018051498431L;
        MediaInfo.esgb[78] = 8971747133594239603L;
        MediaInfo.esgb[79] = 744030696132032478L;
        MediaInfo.esgb[80] = -5917678618135058539L;
        MediaInfo.esgb[81] = -6561905646740230761L;
        MediaInfo.esgb[82] = -8348775268351262769L;
        MediaInfo.esgb[83] = 4340398764092506543L;
        MediaInfo.esgb[84] = 1504165273029884728L;
        MediaInfo.esgb[85] = 6072372338477166675L;
        MediaInfo.esgb[86] = -2990411919317315634L;
        MediaInfo.esgb[87] = -2898723781051047485L;
        MediaInfo.esgb[88] = -7588836669865284295L;
        MediaInfo.esgb[89] = -4982357084528305937L;
        MediaInfo.esgb[90] = 6285330611683827553L;
        MediaInfo.esgb[91] = -1326008605080412484L;
        MediaInfo.esgb[92] = 4961353938008120878L;
        MediaInfo.esgb[93] = -8683106774488841023L;
        MediaInfo.esgb[94] = 8157902940715939230L;
        MediaInfo.esgb[95] = 2508302427097366837L;
        MediaInfo.esgb[96] = 6924685098385680746L;
        MediaInfo.esgb[97] = 7308632868583355062L;
        MediaInfo.esgb[98] = 3327384879379585184L;
        MediaInfo.esgb[99] = 1252258322469784857L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated(message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}), level=DeprecationLevel.HIDDEN)
    public /* synthetic */ MediaInfo(int var1_1, String var2_2, String var3_3, byte[] var4_4, long var5_5, long var7_6, boolean var9_7, SerializationConstructorMarker var10_8) {
        var12_9 /* !! */  = MediaInfo.b;
        var11_10 = MediaInfo.a;
        if (MediaInfo.esev("etzb", eseq(int ), (int)310) == (MediaInfo.esev("etzc", eseq(int ), (int)311) & var1_1)) ** GOTO lbl8
        if (var12_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                PluginExceptionsKt.throwMissingFieldException((int)var1_1, (int)MediaInfo.esev("etzg", eseq(int ), (int)312), (SerialDescriptor)MediaInfo$$serializer.INSTANCE.getDescriptor());
lbl8:
                // 2 sources

                super();
                this.title = var2_2;
                this.artist = var3_3;
                this.artworkPng = var4_4;
                this.position = var5_5;
                this.duration = var7_6;
                this.playing = var9_7;
                this.artwork$delegate = LazyKt.lazy((Function0)new MediaInfo$1(this));
                return;
            }
            case 0: {
                while (true) {
                    var12_9 /* !! */  = (int)MediaInfo.esev("etzj", eseq(int ), (int)313);
                }
            }
lbl21:
            // 2 sources

            case 1: {
                var12_9 /* !! */  = (int)MediaInfo.esev("etzl", eseq(int ), (int)314);
                ** GOTO lbl29
            }
            case 2: {
                var12_9 /* !! */  = (int)MediaInfo.esev("etzm", eseq(int ), (int)315);
                break;
            }
lbl27:
            // 2 sources

            case 3: {
                var12_9 /* !! */  = (int)MediaInfo.esev("etzn", eseq(int ), (int)316);
            }
lbl29:
            // 4 sources

            case 4: {
                var12_9 /* !! */  = (int)MediaInfo.esev("etzp", eseq(int ), (int)317);
                ** GOTO lbl21
            }
            case 5: {
                var12_9 /* !! */  = (int)MediaInfo.esev("etzq", eseq(int ), (int)318);
                ** GOTO lbl27
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_9 /* !! */  = (int)MediaInfo.esev("etzu", eseq(int ), (int)319);
                    ** GOTO lbl29
                    break;
                }
            }
            case 7: 
        }
        var12_9 /* !! */  = (int)MediaInfo.esev("etzw", eseq(int ), (int)320);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long getPosition() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("esjr", esfz(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esjt", eseq(int ), (int)40)) break;
            v0 /* !! */  = (long)MediaInfo.esev("esju", eseq(int ), (int)41);
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("esjy", esfz(int ), (int)18));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block24;
                }
                case -1838477588: {
                    v2 = MediaInfo.esev("eska", esfz(int ), (int)19);
                    continue block24;
                }
                case -825905281: {
                    v2 = MediaInfo.esev("eskb", esfz(int ), (int)20);
                    continue block24;
                }
                case 15411107: {
                    v2 = MediaInfo.esev("eskd", esfz(int ), (int)21);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        v3 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - MediaInfo.esev("eske", esfz(int ), (int)22));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2082533695: {
                    break block25;
                }
                case -1382460262: {
                    v4 = MediaInfo.esev("eskg", esfz(int ), (int)23);
                    continue block25;
                }
                case -1108636339: {
                    v4 = MediaInfo.esev("eskj", esfz(int ), (int)24);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = MediaInfo.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (long)MediaInfo.esev("eskm", esfz(int ), (int)25);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - MediaInfo.esev("esko", esfz(int ), (int)26));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2082533695: {
                            break block27;
                        }
                        case -908492991: {
                            v6 = MediaInfo.esev("eskq", esfz(int ), (int)27);
                            continue block27;
                        }
                        case 442803486: {
                            v6 = MediaInfo.esev("eskr", esfz(int ), (int)28);
                            continue block27;
                        }
                        case 1429097805: {
                            v6 = MediaInfo.esev("eskt", esfz(int ), (int)29);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.position;
            }
lbl64:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)MediaInfo.esev("eskv", eseq(int ), (int)42);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esky", eseq(int ), (int)43);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)MediaInfo.esev("eslb", eseq(int ), (int)44);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("esle", eseq(int ), (int)45);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void euia() {
        MediaInfo.esgd[200] = -8844487269692657274L;
        MediaInfo.esgd[201] = 4654234570090760843L;
        MediaInfo.esgd[202] = 7185051070384633958L;
        MediaInfo.esgd[203] = -6327036711758630509L;
        MediaInfo.esgd[204] = 3283164328032274260L;
        MediaInfo.esgd[205] = -3750053016033533060L;
        MediaInfo.esgd[206] = -2435161497559075446L;
        MediaInfo.esgd[207] = 2607596137187131700L;
        MediaInfo.esgd[208] = -3637203896675257894L;
        MediaInfo.esgd[209] = 1029447206520249224L;
        MediaInfo.esgd[210] = -1825029618257537766L;
        MediaInfo.esgd[211] = -8360243162554341470L;
        MediaInfo.esgd[212] = 6651876055020402144L;
        MediaInfo.esgd[213] = -8401745608494536668L;
        MediaInfo.esgd[214] = -4995218749150833121L;
        MediaInfo.esgd[215] = -4573813509009925910L;
        MediaInfo.esgd[216] = -5617698700272406375L;
        MediaInfo.esgd[217] = 5448415995933285305L;
        MediaInfo.esgd[218] = 3220540991565453297L;
        MediaInfo.esgd[219] = -342405280645803019L;
        MediaInfo.esgd[220] = 224848066521906359L;
        MediaInfo.esgd[221] = -6429472541131661842L;
        MediaInfo.esgd[222] = 4509696905380278837L;
        MediaInfo.esgd[223] = 7988332492614172339L;
        MediaInfo.esgd[224] = 5031840978608143659L;
        MediaInfo.esgd[225] = -3651993212226558204L;
        MediaInfo.esgd[226] = -2453504621324879303L;
        MediaInfo.esgd[227] = 7993238881874974257L;
        MediaInfo.esgd[228] = -6865119558525177454L;
        MediaInfo.esgd[229] = -1745458865218854064L;
        MediaInfo.esgd[230] = -2585428036605759922L;
        MediaInfo.esgd[231] = 401587375178243060L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final BufferedImage getArtwork() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("esnz", esfz(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esoa", eseq(int ), (int)65)) break;
            v0 /* !! */  = (long)MediaInfo.esev("esob", eseq(int ), (int)66);
        }
        var4_1 = MediaInfo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("esoi", esfz(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == MediaInfo.esev("esok", eseq(int ), (int)67)) break;
            v1 /* !! */  = (long)MediaInfo.esev("esol", eseq(int ), (int)68);
        }
        var3_2 /* !! */  = MediaInfo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("esom", esfz(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == MediaInfo.esev("eson", eseq(int ), (int)69)) break;
            v2 /* !! */  = (long)MediaInfo.esev("esoo", eseq(int ), (int)70);
        }
        var2_3 = MediaInfo.a;
        if (var4_1) {
            throw null;
lbl24:
            // 3 sources

            return null;
        }
        if (var2_3) ** GOTO lbl24
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl24
                v3 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl35
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - MediaInfo.esev("esor", esfz(int ), (int)50));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2082533695: {
                            break block22;
                        }
                        case 293727577: {
                            v4 = MediaInfo.esev("esox", esfz(int ), (int)51);
                            continue block22;
                        }
                        case 1733642706: {
                            v4 = MediaInfo.esev("esoy", esfz(int ), (int)52);
                            continue block22;
                        }
                    }
                    break;
                }
                var1_4 = this.artwork$delegate;
                if (var2_3) ** continue;
                v5 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl50
                block23: while (true) {
                    v5 /* !! */  = (long)(v6 - MediaInfo.esev("espb", esfz(int ), (int)53));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2082533695: {
                            break block23;
                        }
                        case -2014640482: {
                            v6 = MediaInfo.esev("espe", esfz(int ), (int)54);
                            continue block23;
                        }
                        case 1291082307: {
                            v6 = MediaInfo.esev("espg", esfz(int ), (int)55);
                            continue block23;
                        }
                        case 1901801120: {
                            v6 = MediaInfo.esev("espi", esfz(int ), (int)56);
                            continue block23;
                        }
                    }
                    break;
                }
                return (BufferedImage)var1_4.getValue();
            }
lbl63:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)MediaInfo.esev("espl", eseq(int ), (int)71);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 1: {
                var3_2 /* !! */  = (int)MediaInfo.esev("espn", eseq(int ), (int)72);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 2: {
                var3_2 /* !! */  = (int)MediaInfo.esev("espo", eseq(int ), (int)73);
                if (!var4_1) ** GOTO lbl63
                throw null;
            }
lbl77:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)MediaInfo.esev("espq", eseq(int ), (int)74);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: 
        }
        var3_2 /* !! */  = (int)MediaInfo.esev("espt", eseq(int ), (int)75);
        ** while (!var4_1)
lbl85:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite esev(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etbj", esfz(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("etbl", eseq(int ), (int)155)) break;
            v0 /* !! */  = (long)MediaInfo.esev("etbq", eseq(int ), (int)156);
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("etbr", esfz(int ), (int)90));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block13;
                }
                case -2017057715: {
                    v2 = MediaInfo.esev("etbs", esfz(int ), (int)91);
                    continue block13;
                }
                case -1169756751: {
                    v2 = MediaInfo.esev("etbt", esfz(int ), (int)92);
                    continue block13;
                }
                case -936879267: {
                    v2 = MediaInfo.esev("etbu", esfz(int ), (int)93);
                    continue block13;
                }
            }
            break;
        }
        var2_2 = MediaInfo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("etbw", esfz(int ), (int)94)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == MediaInfo.esev("etbx", eseq(int ), (int)157)) break;
            v3 /* !! */  = (long)MediaInfo.esev("etcd", eseq(int ), (int)158);
        }
        var1_3 = MediaInfo.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("etce", esfz(int ), (int)95)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == MediaInfo.esev("etcf", eseq(int ), (int)159)) break;
            v4 /* !! */  = (long)MediaInfo.esev("etcg", eseq(int ), (int)160);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = MediaInfo.lf - MediaInfo.esev("etck", esfz(int ), (int)96)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == MediaInfo.esev("etcp", eseq(int ), (int)161)) break;
            v5 /* !! */  = (long)MediaInfo.esev("etcq", eseq(int ), (int)162);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = MediaInfo.lf - MediaInfo.esev("etcs", esfz(int ), (int)97)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == MediaInfo.esev("etcu", eseq(int ), (int)163)) break;
            v6 /* !! */  = (long)MediaInfo.esev("etcz", eseq(int ), (int)164);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = MediaInfo.lf - MediaInfo.esev("etda", esfz(int ), (int)98)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == MediaInfo.esev("etdb", eseq(int ), (int)165)) break;
            v7 /* !! */  = (long)MediaInfo.esev("etdc", eseq(int ), (int)166);
        }
        v8 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl65
        block20: while (true) {
            v8 /* !! */  = (long)(v9 - MediaInfo.esev("etdd", esfz(int ), (int)99));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2082533695: {
                    break block20;
                }
                case 1032647605: {
                    v9 = MediaInfo.esev("etde", esfz(int ), (int)100);
                    continue block20;
                }
                case 1373101016: {
                    v9 = MediaInfo.esev("etdf", esfz(int ), (int)101);
                    continue block20;
                }
                case 1676849040: {
                    v9 = MediaInfo.esev("etdl", esfz(int ), (int)102);
                    continue block20;
                }
            }
            break;
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = MediaInfo.lf - MediaInfo.esev("etdm", esfz(int ), (int)103)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == MediaInfo.esev("etdn", eseq(int ), (int)167)) break;
            v10 /* !! */  = (long)MediaInfo.esev("etdq", eseq(int ), (int)168);
        }
        return "MediaInfo(title='" + this.title + "', artist='" + this.artist + "', position=" + this.position + ", duration=" + this.duration + ", playing=" + this.playing + ")";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String component1() {
        v0 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(MediaInfo.esev("etei", esfz(int ), (int)105) - MediaInfo.esev("eteg", esfz(int ), (int)104));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2082533695: {
                    break block21;
                }
                case -1891954065: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("etfe", esfz(int ), (int)106));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block22;
                }
                case -188508928: {
                    v2 = MediaInfo.esev("etfg", esfz(int ), (int)107);
                    continue block22;
                }
                case 39383337: {
                    v2 = MediaInfo.esev("etfm", esfz(int ), (int)108);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etfn", esfz(int ), (int)109)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == MediaInfo.esev("etfo", eseq(int ), (int)173)) break;
            v3 /* !! */  = (long)MediaInfo.esev("etfp", eseq(int ), (int)174);
        }
        var1_3 = MediaInfo.a;
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
                v4 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl44
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - MediaInfo.esev("etfq", esfz(int ), (int)110));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2082533695: {
                            break block25;
                        }
                        case 354136853: {
                            v5 = MediaInfo.esev("etfs", esfz(int ), (int)111);
                            continue block25;
                        }
                        case 880592271: {
                            v5 = MediaInfo.esev("etft", esfz(int ), (int)112);
                            continue block25;
                        }
                        case 992578319: {
                            v5 = MediaInfo.esev("etfy", esfz(int ), (int)113);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.title;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)MediaInfo.esev("etfz", eseq(int ), (int)175);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)MediaInfo.esev("etga", eseq(int ), (int)176);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)MediaInfo.esev("etgb", eseq(int ), (int)177);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)MediaInfo.esev("etgc", eseq(int ), (int)178);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void etzz() {
        MediaInfo.eses[0] = 1564162172;
        MediaInfo.eses[1] = -1847595402;
        MediaInfo.eses[2] = 804160159;
        MediaInfo.eses[3] = 1505561243;
        MediaInfo.eses[4] = -996060471;
        MediaInfo.eses[5] = -737278642;
        MediaInfo.eses[6] = 316751474;
        MediaInfo.eses[7] = 0x5B5AA5A5;
        MediaInfo.eses[8] = -1746584742;
        MediaInfo.eses[9] = -1470825485;
        MediaInfo.eses[10] = 1452429219;
        MediaInfo.eses[11] = -734443379;
        MediaInfo.eses[12] = 1974679654;
        MediaInfo.eses[13] = -583553107;
        MediaInfo.eses[14] = 1965177299;
        MediaInfo.eses[15] = 1599552388;
        MediaInfo.eses[16] = -1782670531;
        MediaInfo.eses[17] = -1182808863;
        MediaInfo.eses[18] = -2108830773;
        MediaInfo.eses[19] = -1585647070;
        MediaInfo.eses[20] = 561962462;
        MediaInfo.eses[21] = 573472042;
        MediaInfo.eses[22] = 191600639;
        MediaInfo.eses[23] = 1331185818;
        MediaInfo.eses[24] = -756877681;
        MediaInfo.eses[25] = -327053781;
        MediaInfo.eses[26] = 764971081;
        MediaInfo.eses[27] = 1604650303;
        MediaInfo.eses[28] = -1811887017;
        MediaInfo.eses[29] = 22302724;
        MediaInfo.eses[30] = -1998380119;
        MediaInfo.eses[31] = -1430057879;
        MediaInfo.eses[32] = -102027665;
        MediaInfo.eses[33] = -1857483057;
        MediaInfo.eses[34] = -2128908610;
        MediaInfo.eses[35] = 681298746;
        MediaInfo.eses[36] = 1465063234;
        MediaInfo.eses[37] = -1949155297;
        MediaInfo.eses[38] = 45856063;
        MediaInfo.eses[39] = 813227285;
        MediaInfo.eses[40] = -587591393;
        MediaInfo.eses[41] = -1388506819;
        MediaInfo.eses[42] = -399021511;
        MediaInfo.eses[43] = -1854116275;
        MediaInfo.eses[44] = -153702081;
        MediaInfo.eses[45] = -35190329;
        MediaInfo.eses[46] = -204429149;
        MediaInfo.eses[47] = 1475056207;
        MediaInfo.eses[48] = -731288731;
        MediaInfo.eses[49] = -1630645256;
        MediaInfo.eses[50] = 1235257893;
        MediaInfo.eses[51] = -1126649702;
        MediaInfo.eses[52] = -1677971923;
        MediaInfo.eses[53] = 1266345032;
        MediaInfo.eses[54] = 650944905;
        MediaInfo.eses[55] = 12545758;
        MediaInfo.eses[56] = -707495031;
        MediaInfo.eses[57] = -2002524445;
        MediaInfo.eses[58] = -1285951235;
        MediaInfo.eses[59] = -1242103024;
        MediaInfo.eses[60] = -613335814;
        MediaInfo.eses[61] = 2131075159;
        MediaInfo.eses[62] = 2088142026;
        MediaInfo.eses[63] = 1290990669;
        MediaInfo.eses[64] = 2086686011;
        MediaInfo.eses[65] = -1560354525;
        MediaInfo.eses[66] = -1510394033;
        MediaInfo.eses[67] = -773126591;
        MediaInfo.eses[68] = 832612447;
        MediaInfo.eses[69] = -2075907909;
        MediaInfo.eses[70] = -1537581263;
        MediaInfo.eses[71] = 1697689052;
        MediaInfo.eses[72] = -1359760401;
        MediaInfo.eses[73] = -228884289;
        MediaInfo.eses[74] = -420278362;
        MediaInfo.eses[75] = 202913216;
        MediaInfo.eses[76] = 1327358747;
        MediaInfo.eses[77] = -1276189602;
        MediaInfo.eses[78] = 1433574506;
        MediaInfo.eses[79] = 1431439598;
        MediaInfo.eses[80] = -917754099;
        MediaInfo.eses[81] = -2069123858;
        MediaInfo.eses[82] = -1358231707;
        MediaInfo.eses[83] = 918680045;
        MediaInfo.eses[84] = -354363965;
        MediaInfo.eses[85] = 2041372041;
        MediaInfo.eses[86] = -1011801906;
        MediaInfo.eses[87] = -842335148;
        MediaInfo.eses[88] = 731977061;
        MediaInfo.eses[89] = -1400825195;
        MediaInfo.eses[90] = -1169253762;
        MediaInfo.eses[91] = -1560199856;
        MediaInfo.eses[92] = 1487493370;
        MediaInfo.eses[93] = -999488728;
        MediaInfo.eses[94] = -970539372;
        MediaInfo.eses[95] = 1298330543;
        MediaInfo.eses[96] = 1936001854;
        MediaInfo.eses[97] = -1348938473;
        MediaInfo.eses[98] = -1372006406;
        MediaInfo.eses[99] = 1710175073;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean equals(@Nullable Object var1_1) {
        block79: {
            block78: {
                block77: {
                    block76: {
                        block75: {
                            block74: {
                                var4_2 = MediaInfo.c;
                                var3_3 /* !! */  = MediaInfo.b;
                                var2_4 = MediaInfo.a;
                                if (var4_2) {
                                    throw null;
lbl6:
                                    // 19 sources

                                    return (boolean)MediaInfo.esev("esqb", eseq(int ), (int)76);
                                }
                                if (var2_4 || var2_4) ** GOTO lbl6
                                if (this != var1_1) break block74;
                                if (var2_4) ** GOTO lbl6
                                return (boolean)MediaInfo.esev("esqd", eseq(int ), (int)77);
                            }
                            if (var2_4 || var2_4) ** GOTO lbl6
                            v0 = this.getClass();
                            v1 = var1_1;
                            if (v1 != null) {
                                v2 = v1.getClass();
                                if (var4_2) {
                                    throw null;
                                }
                            } else {
                                v2 = null;
                            }
                            if (Intrinsics.areEqual(v0, v2)) break block75;
                            if (var2_4) ** GOTO lbl6
                            return (boolean)MediaInfo.esev("esqf", eseq(int ), (int)78);
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        Intrinsics.checkNotNull((Object)var1_1, (String)"null cannot be cast to non-null type dev.redstones.mediaplayerinfo.MediaInfo");
                        if (var2_4) ** GOTO lbl6
                        (MediaInfo)var1_1;
                        if (var2_4 || var2_4) ** GOTO lbl6
                        if (Intrinsics.areEqual((Object)this.title, (Object)((MediaInfo)var1_1).title)) break block76;
                        if (var2_4) ** GOTO lbl6
                        return (boolean)MediaInfo.esev("esqh", eseq(int ), (int)79);
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (Intrinsics.areEqual((Object)this.artist, (Object)((MediaInfo)var1_1).artist)) break block77;
                    if (var2_4) ** GOTO lbl6
                    return (boolean)MediaInfo.esev("esqo", eseq(int ), (int)80);
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (Arrays.equals(this.artworkPng, ((MediaInfo)var1_1).artworkPng)) break block78;
                if (var2_4) ** GOTO lbl6
                return (boolean)MediaInfo.esev("esqp", eseq(int ), (int)81);
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.position == ((MediaInfo)var1_1).position) break block79;
            if (var2_4) ** GOTO lbl6
            return (boolean)MediaInfo.esev("esqq", eseq(int ), (int)82);
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (this.duration == ((MediaInfo)var1_1).duration) ** GOTO lbl58
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (boolean)MediaInfo.esev("esqu", eseq(int ), (int)83);
            }
lbl58:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.playing == ((MediaInfo)var1_1).playing) ** GOTO lbl62
            if (var2_4) ** GOTO lbl6
            return (boolean)MediaInfo.esev("esqw", eseq(int ), (int)84);
lbl62:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return (boolean)MediaInfo.esev("esqx", eseq(int ), (int)85);
lbl65:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esqy", eseq(int ), (int)86);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl70:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esrf", eseq(int ), (int)87);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl75:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esri", eseq(int ), (int)88);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl80:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esrl", eseq(int ), (int)89);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl85:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esro", eseq(int ), (int)90);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl90:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)MediaInfo.esev("esrp", eseq(int ), (int)91);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl132
                    break;
                }
            }
lbl96:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esrq", eseq(int ), (int)92);
                if (!var4_2) break;
                throw null;
            }
lbl100:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esrr", eseq(int ), (int)93);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl105:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esru", eseq(int ), (int)94);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl110:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essa", eseq(int ), (int)95);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
lbl114:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esse", eseq(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl119:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essh", eseq(int ), (int)97);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
lbl123:
            // 4 sources

            case 12: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essk", eseq(int ), (int)98);
                if (var4_2) {
                    throw null;
                }
            }
            case 13: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essl", eseq(int ), (int)99);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl132:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essr", eseq(int ), (int)100);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
lbl136:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essu", eseq(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 16: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essv", eseq(int ), (int)102);
                if (!var4_2) ** GOTO lbl105
                throw null;
            }
lbl145:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essw", eseq(int ), (int)103);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 18: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essx", eseq(int ), (int)104);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl154:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)MediaInfo.esev("essz", eseq(int ), (int)105);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 20: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estc", eseq(int ), (int)106);
                if (!var4_2) ** GOTO lbl90
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esth", eseq(int ), (int)107);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl168:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estj", eseq(int ), (int)108);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
lbl172:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estm", eseq(int ), (int)109);
                if (!var4_2) ** GOTO lbl119
                throw null;
            }
lbl176:
            // 3 sources

            case 24: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estp", eseq(int ), (int)110);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
lbl180:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estr", eseq(int ), (int)111);
                if (!var4_2) ** GOTO lbl172
                throw null;
            }
lbl184:
            // 3 sources

            case 26: {
                var3_3 /* !! */  = (int)MediaInfo.esev("ests", eseq(int ), (int)112);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estt", eseq(int ), (int)113);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
lbl192:
            // 2 sources

            case 28: {
                var3_3 /* !! */  = (int)MediaInfo.esev("estx", eseq(int ), (int)114);
                if (!var4_2) ** GOTO lbl75
                throw null;
            }
lbl196:
            // 2 sources

            case 29: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esua", eseq(int ), (int)115);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 30: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esub", eseq(int ), (int)116);
                if (!var4_2) ** GOTO lbl123
                throw null;
            }
            case 31: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esuc", eseq(int ), (int)117);
                if (!var4_2) ** GOTO lbl85
                throw null;
            }
lbl208:
            // 2 sources

            case 32: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esuh", eseq(int ), (int)118);
                if (!var4_2) ** GOTO lbl136
                throw null;
            }
            case 33: {
                var3_3 /* !! */  = (int)MediaInfo.esev("esup", eseq(int ), (int)119);
                if (!var4_2) ** GOTO lbl184
                throw null;
            }
            case 34: 
        }
        var3_3 /* !! */  = (int)MediaInfo.esev("esus", eseq(int ), (int)120);
        ** while (!var4_2)
lbl219:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eubx() {
        MediaInfo.eseu[0] = 1564162164;
        MediaInfo.eseu[1] = -1847595395;
        MediaInfo.eseu[2] = 804160150;
        MediaInfo.eseu[3] = 1505561232;
        MediaInfo.eseu[4] = -996060469;
        MediaInfo.eseu[5] = -737278643;
        MediaInfo.eseu[6] = 316751477;
        MediaInfo.eseu[7] = 1532667300;
        MediaInfo.eseu[8] = -1746584742;
        MediaInfo.eseu[9] = -1470825482;
        MediaInfo.eseu[10] = 1452429226;
        MediaInfo.eseu[11] = -734443379;
        MediaInfo.eseu[12] = 1974679655;
        MediaInfo.eseu[13] = -1025430588;
        MediaInfo.eseu[14] = 1965177298;
        MediaInfo.eseu[15] = 83629087;
        MediaInfo.eseu[16] = -1782670532;
        MediaInfo.eseu[17] = -856649595;
        MediaInfo.eseu[18] = -2108830773;
        MediaInfo.eseu[19] = -1585647071;
        MediaInfo.eseu[20] = 561962462;
        MediaInfo.eseu[21] = 573472042;
        MediaInfo.eseu[22] = 191600638;
        MediaInfo.eseu[23] = -1819169008;
        MediaInfo.eseu[24] = -756877682;
        MediaInfo.eseu[25] = -1631167067;
        MediaInfo.eseu[26] = 764971082;
        MediaInfo.eseu[27] = 1604650302;
        MediaInfo.eseu[28] = -1811887019;
        MediaInfo.eseu[29] = 22302725;
        MediaInfo.eseu[30] = -1998380120;
        MediaInfo.eseu[31] = 385554748;
        MediaInfo.eseu[32] = -102027666;
        MediaInfo.eseu[33] = -496177041;
        MediaInfo.eseu[34] = -2128908609;
        MediaInfo.eseu[35] = 505658681;
        MediaInfo.eseu[36] = 1465063233;
        MediaInfo.eseu[37] = -1949155297;
        MediaInfo.eseu[38] = 45856063;
        MediaInfo.eseu[39] = 813227284;
        MediaInfo.eseu[40] = 587591392;
        MediaInfo.eseu[41] = 1642839457;
        MediaInfo.eseu[42] = -399021512;
        MediaInfo.eseu[43] = -1854116273;
        MediaInfo.eseu[44] = -153702082;
        MediaInfo.eseu[45] = -35190329;
        MediaInfo.eseu[46] = -204429150;
        MediaInfo.eseu[47] = 106977010;
        MediaInfo.eseu[48] = -731288732;
        MediaInfo.eseu[49] = 678796681;
        MediaInfo.eseu[50] = 1235257892;
        MediaInfo.eseu[51] = 1671490652;
        MediaInfo.eseu[52] = -1677971921;
        MediaInfo.eseu[53] = 1266345033;
        MediaInfo.eseu[54] = 650944904;
        MediaInfo.eseu[55] = 12545757;
        MediaInfo.eseu[56] = -707495032;
        MediaInfo.eseu[57] = 445624579;
        MediaInfo.eseu[58] = -1285951236;
        MediaInfo.eseu[59] = 1638764742;
        MediaInfo.eseu[60] = -613335813;
        MediaInfo.eseu[61] = 2131075156;
        MediaInfo.eseu[62] = 2088142024;
        MediaInfo.eseu[63] = 1290990668;
        MediaInfo.eseu[64] = 2086686008;
        MediaInfo.eseu[65] = 1560354524;
        MediaInfo.eseu[66] = -2088766840;
        MediaInfo.eseu[67] = -773126592;
        MediaInfo.eseu[68] = 790481521;
        MediaInfo.eseu[69] = -2075907910;
        MediaInfo.eseu[70] = -982028643;
        MediaInfo.eseu[71] = 1697689052;
        MediaInfo.eseu[72] = -1359760403;
        MediaInfo.eseu[73] = -228884291;
        MediaInfo.eseu[74] = -420278361;
        MediaInfo.eseu[75] = 202913217;
        MediaInfo.eseu[76] = 1327358746;
        MediaInfo.eseu[77] = -1276189601;
        MediaInfo.eseu[78] = 1433574506;
        MediaInfo.eseu[79] = 1431439598;
        MediaInfo.eseu[80] = -917754099;
        MediaInfo.eseu[81] = -2069123858;
        MediaInfo.eseu[82] = -1358231707;
        MediaInfo.eseu[83] = 918680045;
        MediaInfo.eseu[84] = -354363965;
        MediaInfo.eseu[85] = 2041372040;
        MediaInfo.eseu[86] = -1011801903;
        MediaInfo.eseu[87] = -842335158;
        MediaInfo.eseu[88] = 731977064;
        MediaInfo.eseu[89] = -1400825215;
        MediaInfo.eseu[90] = -1169253789;
        MediaInfo.eseu[91] = -1560199870;
        MediaInfo.eseu[92] = 1487493368;
        MediaInfo.eseu[93] = -999488721;
        MediaInfo.eseu[94] = -970539381;
        MediaInfo.eseu[95] = 1298330554;
        MediaInfo.eseu[96] = 1936001831;
        MediaInfo.eseu[97] = -1348938495;
        MediaInfo.eseu[98] = -1372006406;
        MediaInfo.eseu[99] = 1710175090;
    }

    public MediaInfo(@NotNull String string, @NotNull String string2, @NotNull byte[] byArray, long l2, long l3, boolean bl2) {
        int n2 = b;
        Intrinsics.checkNotNullParameter((Object)string, (String)"title");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"artist");
        Intrinsics.checkNotNullParameter((Object)byArray, (String)"artworkPng");
        this.title = string;
        this.artist = string2;
        this.artworkPng = byArray;
        this.position = l2;
        this.duration = l3;
        this.playing = bl2;
        this.artwork$delegate = LazyKt.lazy((Function0)new MediaInfo$1(this));
    }

    private static /* synthetic */ int eseq(int n2) {
        return eses[n2] ^ eseu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long getDuration() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("eslf", esfz(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("eslg", eseq(int ), (int)46)) break;
            v0 /* !! */  = (long)MediaInfo.esev("eslh", eseq(int ), (int)47);
        }
        var3_1 = MediaInfo.c;
        v1 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - MediaInfo.esev("eslp", esfz(int ), (int)31));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082533695: {
                    break block12;
                }
                case -439573033: {
                    v2 = MediaInfo.esev("eslq", esfz(int ), (int)32);
                    continue block12;
                }
                case 275923924: {
                    v2 = MediaInfo.esev("eslr", esfz(int ), (int)33);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = MediaInfo.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("eslt", esfz(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == MediaInfo.esev("eslx", eseq(int ), (int)48)) break;
                    v3 /* !! */  = (long)MediaInfo.esev("esmb", eseq(int ), (int)49);
                }
                var1_3 = MediaInfo.a;
                if (var3_1) {
                    throw null;
                    return (long)MediaInfo.esev("esmd", esfz(int ), (int)35);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("esme", esfz(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == MediaInfo.esev("esmf", eseq(int ), (int)50)) break;
                    v4 /* !! */  = (long)MediaInfo.esev("esmh", eseq(int ), (int)51);
                }
                return this.duration;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esmj", eseq(int ), (int)52);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl49:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esmr", eseq(int ), (int)53);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)MediaInfo.esev("esms", eseq(int ), (int)54);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("esmt", eseq(int ), (int)55);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static /* synthetic */ MediaInfo copy$default(MediaInfo var0, String var1_1, String var2_2, byte[] var3_3, long var4_4, long var6_5, boolean var8_6, int var9_7, Object var10_8) {
        block94: {
            block93: {
                block92: {
                    block91: {
                        v0 /* !! */  = MediaInfo.lf;
                        if (true) ** GOTO lbl5
                        block51: while (true) {
                            v0 /* !! */  = (long)(v1 - MediaInfo.esev("etpf", esfz(int ), (int)179));
lbl5:
                            // 2 sources

                            switch ((int)v0 /* !! */ ) {
                                case -2098479602: {
                                    v1 = MediaInfo.esev("etpg", esfz(int ), (int)180);
                                    continue block51;
                                }
                                case -2082533695: {
                                    break block51;
                                }
                                case 1141394752: {
                                    v1 = MediaInfo.esev("etpo", esfz(int ), (int)181);
                                    continue block51;
                                }
                                case 1545793453: {
                                    v1 = MediaInfo.esev("etpp", esfz(int ), (int)182);
                                    continue block51;
                                }
                            }
                            break;
                        }
                        var13_9 = MediaInfo.c;
                        v2 /* !! */  = MediaInfo.lf;
                        if (true) ** GOTO lbl22
                        block52: while (true) {
                            v2 /* !! */  = (long)(v3 - MediaInfo.esev("etpq", esfz(int ), (int)183));
lbl22:
                            // 2 sources

                            switch ((int)v2 /* !! */ ) {
                                case -2082533695: {
                                    break block52;
                                }
                                case -665721366: {
                                    v3 = MediaInfo.esev("etpr", esfz(int ), (int)184);
                                    continue block52;
                                }
                                case 1068042050: {
                                    v3 = MediaInfo.esev("etps", esfz(int ), (int)185);
                                    continue block52;
                                }
                                case 1940079222: {
                                    v3 = MediaInfo.esev("etpu", esfz(int ), (int)186);
                                    continue block52;
                                }
                            }
                            break;
                        }
                        var12_10 /* !! */  = MediaInfo.b;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("etpx", esfz(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == MediaInfo.esev("etpz", eseq(int ), (int)233)) break;
                            v4 /* !! */  = (long)MediaInfo.esev("etqa", eseq(int ), (int)234);
                        }
                        var11_11 = MediaInfo.a;
                        if (var13_9) {
                            throw null;
lbl44:
                            // 19 sources

                            return null;
                        }
                        if (var11_11) ** GOTO lbl44
                        if ((var9_7 & MediaInfo.esev("etqd", eseq(int ), (int)235)) == 0) break block91;
                        if (var11_11) ** GOTO lbl44
                        v5 /* !! */  = MediaInfo.lf;
                        if (true) ** GOTO lbl53
                        block55: while (true) {
                            v5 /* !! */  = (long)(v6 - MediaInfo.esev("etqf", esfz(int ), (int)188));
lbl53:
                            // 2 sources

                            switch ((int)v5 /* !! */ ) {
                                case -2082533695: {
                                    break block55;
                                }
                                case 25851183: {
                                    v6 = MediaInfo.esev("etqg", esfz(int ), (int)189);
                                    continue block55;
                                }
                                case 642852415: {
                                    v6 = MediaInfo.esev("etqi", esfz(int ), (int)190);
                                    continue block55;
                                }
                            }
                            break;
                        }
                        var1_1 = var0.title;
                        if (var11_11) ** GOTO lbl44
                    }
                    if (var11_11 || var11_11) ** GOTO lbl44
                    if ((var9_7 & MediaInfo.esev("etqk", eseq(int ), (int)236)) == 0) break block92;
                    if (var11_11) ** GOTO lbl44
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("etqm", esfz(int ), (int)191)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == MediaInfo.esev("etqo", eseq(int ), (int)237)) break;
                        v7 /* !! */  = (long)MediaInfo.esev("etqq", eseq(int ), (int)238);
                    }
                    var2_2 = var0.artist;
                    if (var11_11) ** GOTO lbl44
                }
                if (var11_11 || var11_11) ** GOTO lbl44
                if ((var9_7 & MediaInfo.esev("etqs", eseq(int ), (int)239)) == 0) break block93;
                if (var11_11) ** GOTO lbl44
                v8 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl84
                block57: while (true) {
                    v8 /* !! */  = (long)(v9 - MediaInfo.esev("etqy", esfz(int ), (int)192));
lbl84:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2082533695: {
                            break block57;
                        }
                        case -315910916: {
                            v9 = MediaInfo.esev("etqz", esfz(int ), (int)193);
                            continue block57;
                        }
                        case 733429855: {
                            v9 = MediaInfo.esev("etra", esfz(int ), (int)194);
                            continue block57;
                        }
                    }
                    break;
                }
                var3_3 = var0.artworkPng;
                if (var11_11) ** GOTO lbl44
            }
            if (var11_11 || var11_11) ** GOTO lbl44
            if ((var9_7 & MediaInfo.esev("etrb", eseq(int ), (int)240)) == 0) break block94;
            if (var11_11) ** GOTO lbl44
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("etrc", esfz(int ), (int)195)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == MediaInfo.esev("etrd", eseq(int ), (int)241)) break;
                v10 /* !! */  = (long)MediaInfo.esev("etre", eseq(int ), (int)242);
            }
            var4_4 = var0.position;
            if (var11_11) ** GOTO lbl44
        }
        if (var11_11 || var11_11) ** GOTO lbl44
        if (var12_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if ((var9_7 & MediaInfo.esev("etrl", eseq(int ), (int)243)) == 0) ** GOTO lbl122
                if (var11_11) ** GOTO lbl44
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = MediaInfo.lf - MediaInfo.esev("etrm", esfz(int ), (int)196)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == MediaInfo.esev("etrn", eseq(int ), (int)244)) break;
                    v11 /* !! */  = (long)MediaInfo.esev("etro", eseq(int ), (int)245);
                }
                var6_5 = var0.duration;
                if (var11_11) ** GOTO lbl44
lbl122:
                // 2 sources

                if (var11_11 || var11_11) ** GOTO lbl44
                if ((var9_7 & MediaInfo.esev("etrp", eseq(int ), (int)246)) == 0) ** GOTO lbl133
                if (var11_11) ** GOTO lbl44
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = MediaInfo.lf - MediaInfo.esev("etrr", esfz(int ), (int)197)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == MediaInfo.esev("etry", eseq(int ), (int)247)) break;
                    v12 /* !! */  = (long)MediaInfo.esev("etrz", eseq(int ), (int)248);
                }
                var8_6 = var0.playing;
                if (var11_11) ** GOTO lbl44
lbl133:
                // 2 sources

                if (!var11_11 && !var11_11) ** break;
                ** continue;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = MediaInfo.lf - MediaInfo.esev("etsa", esfz(int ), (int)198)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == MediaInfo.esev("etsc", eseq(int ), (int)249)) break;
                    v13 /* !! */  = (long)MediaInfo.esev("etse", eseq(int ), (int)250);
                }
                return var0.copy(var1_1, var2_2, var3_3, var4_4, var6_5, var8_6);
            }
            case 0: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsg", eseq(int ), (int)251);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl147:
            // 3 sources

            case 1: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsi", eseq(int ), (int)252);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl152:
            // 2 sources

            case 2: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsn", eseq(int ), (int)253);
                if (!var13_9) ** GOTO lbl147
                throw null;
            }
lbl156:
            // 2 sources

            case 3: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsp", eseq(int ), (int)254);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 4: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsr", eseq(int ), (int)255);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 5: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etst", eseq(int ), (int)256);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl171:
            // 2 sources

            case 6: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsv", eseq(int ), (int)257);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl176:
            // 2 sources

            case 7: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etsx", eseq(int ), (int)258);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl181:
            // 2 sources

            case 8: {
                do {
                    var12_10 /* !! */  = (int)MediaInfo.esev("etsy", eseq(int ), (int)259);
                } while (!var13_9);
                throw null;
            }
            case 9: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettc", eseq(int ), (int)260);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl191:
            // 4 sources

            case 10: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ette", eseq(int ), (int)261);
                if (!var13_9) ** GOTO lbl156
                throw null;
            }
lbl195:
            // 3 sources

            case 11: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettg", eseq(int ), (int)262);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl200:
            // 2 sources

            case 12: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettj", eseq(int ), (int)263);
                if (!var13_9) ** GOTO lbl152
                throw null;
            }
            case 13: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettk", eseq(int ), (int)264);
                if (!var13_9) ** GOTO lbl191
                throw null;
            }
            case 14: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettl", eseq(int ), (int)265);
                if (var13_9) {
                    throw null;
                }
            }
lbl212:
            // 5 sources

            case 15: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettm", eseq(int ), (int)266);
                if (var13_9) {
                    throw null;
                }
            }
            case 16: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettr", eseq(int ), (int)267);
                if (!var13_9) ** GOTO lbl191
                throw null;
            }
            case 17: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etts", eseq(int ), (int)268);
                if (var13_9) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 18: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettv", eseq(int ), (int)269);
                if (!var13_9) break;
                throw null;
            }
lbl229:
            // 2 sources

            case 19: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettx", eseq(int ), (int)270);
                if (!var13_9) ** GOTO lbl176
                throw null;
            }
lbl233:
            // 2 sources

            case 20: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etty", eseq(int ), (int)271);
                if (!var13_9) ** GOTO lbl171
                throw null;
            }
            case 21: {
                var12_10 /* !! */  = (int)MediaInfo.esev("ettz", eseq(int ), (int)272);
                if (!var13_9) ** GOTO lbl181
                throw null;
            }
            case 22: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etua", eseq(int ), (int)273);
                if (!var13_9) break;
                throw null;
            }
lbl245:
            // 2 sources

            case 23: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etud", eseq(int ), (int)274);
                if (!var13_9) ** GOTO lbl147
                throw null;
            }
lbl249:
            // 3 sources

            case 24: {
                var12_10 /* !! */  = (int)MediaInfo.esev("etuf", eseq(int ), (int)275);
                if (!var13_9) break;
                throw null;
            }
            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_10 /* !! */  = (int)MediaInfo.esev("etug", eseq(int ), (int)276);
                    if (!var13_9) ** GOTO lbl245
                    throw null;
                }
            }
            case 26: 
        }
        var12_10 /* !! */  = (int)MediaInfo.esev("etuh", eseq(int ), (int)277);
        ** while (!var13_9)
lbl261:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eubf() {
        MediaInfo.eses[200] = 473469980;
        MediaInfo.eses[201] = -42322955;
        MediaInfo.eses[202] = 1409688617;
        MediaInfo.eses[203] = -576092490;
        MediaInfo.eses[204] = -1250485701;
        MediaInfo.eses[205] = 1295163402;
        MediaInfo.eses[206] = 86531533;
        MediaInfo.eses[207] = -499443716;
        MediaInfo.eses[208] = -131782747;
        MediaInfo.eses[209] = 1803744607;
        MediaInfo.eses[210] = 38103725;
        MediaInfo.eses[211] = 153485047;
        MediaInfo.eses[212] = -314752143;
        MediaInfo.eses[213] = 1423516121;
        MediaInfo.eses[214] = 1402823625;
        MediaInfo.eses[215] = 1404704414;
        MediaInfo.eses[216] = -646090486;
        MediaInfo.eses[217] = 1203271750;
        MediaInfo.eses[218] = 1814580757;
        MediaInfo.eses[219] = 2131928766;
        MediaInfo.eses[220] = 311779184;
        MediaInfo.eses[221] = 785890576;
        MediaInfo.eses[222] = -437414166;
        MediaInfo.eses[223] = -791205088;
        MediaInfo.eses[224] = 1719847584;
        MediaInfo.eses[225] = -1087778907;
        MediaInfo.eses[226] = -602750008;
        MediaInfo.eses[227] = 1054751675;
        MediaInfo.eses[228] = 796971626;
        MediaInfo.eses[229] = -1987752994;
        MediaInfo.eses[230] = -964559981;
        MediaInfo.eses[231] = -631231280;
        MediaInfo.eses[232] = 1448026038;
        MediaInfo.eses[233] = -1032456675;
        MediaInfo.eses[234] = -127292602;
        MediaInfo.eses[235] = 973328938;
        MediaInfo.eses[236] = -998013713;
        MediaInfo.eses[237] = 1781224834;
        MediaInfo.eses[238] = 1354050298;
        MediaInfo.eses[239] = -1103245601;
        MediaInfo.eses[240] = 1541263521;
        MediaInfo.eses[241] = 1810003762;
        MediaInfo.eses[242] = -1542046253;
        MediaInfo.eses[243] = -620312975;
        MediaInfo.eses[244] = 2147423798;
        MediaInfo.eses[245] = 368652869;
        MediaInfo.eses[246] = 1018877507;
        MediaInfo.eses[247] = 732070591;
        MediaInfo.eses[248] = -1893048566;
        MediaInfo.eses[249] = 151539078;
        MediaInfo.eses[250] = 269728464;
        MediaInfo.eses[251] = -1126776566;
        MediaInfo.eses[252] = -499669624;
        MediaInfo.eses[253] = -1022861064;
        MediaInfo.eses[254] = 724783250;
        MediaInfo.eses[255] = 1926148329;
        MediaInfo.eses[256] = 146564830;
        MediaInfo.eses[257] = -499678207;
        MediaInfo.eses[258] = 2089237266;
        MediaInfo.eses[259] = -1298357222;
        MediaInfo.eses[260] = -75345740;
        MediaInfo.eses[261] = -1150619950;
        MediaInfo.eses[262] = 824299645;
        MediaInfo.eses[263] = -78106801;
        MediaInfo.eses[264] = 131383327;
        MediaInfo.eses[265] = 1413791022;
        MediaInfo.eses[266] = -408235447;
        MediaInfo.eses[267] = -2077839377;
        MediaInfo.eses[268] = 573174766;
        MediaInfo.eses[269] = 2023141866;
        MediaInfo.eses[270] = 9216424;
        MediaInfo.eses[271] = 330593421;
        MediaInfo.eses[272] = 169969305;
        MediaInfo.eses[273] = 171268474;
        MediaInfo.eses[274] = 1066699757;
        MediaInfo.eses[275] = 480923407;
        MediaInfo.eses[276] = 1102995013;
        MediaInfo.eses[277] = 811206106;
        MediaInfo.eses[278] = -796210877;
        MediaInfo.eses[279] = 70370599;
        MediaInfo.eses[280] = 294562810;
        MediaInfo.eses[281] = 610713480;
        MediaInfo.eses[282] = 1867965856;
        MediaInfo.eses[283] = -2031712927;
        MediaInfo.eses[284] = -1557501296;
        MediaInfo.eses[285] = 314391466;
        MediaInfo.eses[286] = -1607258804;
        MediaInfo.eses[287] = -357754430;
        MediaInfo.eses[288] = 134358811;
        MediaInfo.eses[289] = 1430394344;
        MediaInfo.eses[290] = -1530863539;
        MediaInfo.eses[291] = 690370959;
        MediaInfo.eses[292] = 1311530559;
        MediaInfo.eses[293] = 1541080187;
        MediaInfo.eses[294] = 315366738;
        MediaInfo.eses[295] = -1354648655;
        MediaInfo.eses[296] = 689870474;
        MediaInfo.eses[297] = -1824121050;
        MediaInfo.eses[298] = -83059323;
        MediaInfo.eses[299] = -175324605;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean getPlaying() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("esmy", esfz(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esna", eseq(int ), (int)56)) break;
            v0 /* !! */  = (long)MediaInfo.esev("esnb", eseq(int ), (int)57);
        }
        var3_1 = MediaInfo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("esnf", esfz(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == MediaInfo.esev("esng", eseq(int ), (int)58)) break;
            v1 /* !! */  = (long)MediaInfo.esev("esnh", eseq(int ), (int)59);
        }
        var2_2 /* !! */  = MediaInfo.b;
        v2 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - MediaInfo.esev("esni", esfz(int ), (int)39));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2082533695: {
                    break block20;
                }
                case -1193527322: {
                    v3 = MediaInfo.esev("esnj", esfz(int ), (int)40);
                    continue block20;
                }
                case 684508434: {
                    v3 = MediaInfo.esev("esnk", esfz(int ), (int)41);
                    continue block20;
                }
                case 921684986: {
                    v3 = MediaInfo.esev("esnl", esfz(int ), (int)42);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = MediaInfo.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)MediaInfo.esev("esnm", eseq(int ), (int)60);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block21;
                v4 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl43
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - MediaInfo.esev("esnn", esfz(int ), (int)43));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2082533695: {
                            break block22;
                        }
                        case -61004864: {
                            v5 = MediaInfo.esev("esno", esfz(int ), (int)44);
                            continue block22;
                        }
                        case -8822618: {
                            v5 = MediaInfo.esev("esnp", esfz(int ), (int)45);
                            continue block22;
                        }
                        case 2081718042: {
                            v5 = MediaInfo.esev("esnq", esfz(int ), (int)46);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.playing;
lbl56:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esnr", eseq(int ), (int)61);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl65
                }
                case 1: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esns", eseq(int ), (int)62);
                    if (!var3_1) break block21;
                    throw null;
                }
lbl65:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esnt", eseq(int ), (int)63);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)MediaInfo.esev("esnu", eseq(int ), (int)64);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void euhg() {
        MediaInfo.esgd[100] = 7745434319932239438L;
        MediaInfo.esgd[101] = -3206705753905571951L;
        MediaInfo.esgd[102] = 1841562984586184370L;
        MediaInfo.esgd[103] = 2568726506126714900L;
        MediaInfo.esgd[104] = 960462138441211905L;
        MediaInfo.esgd[105] = -7766339257207922316L;
        MediaInfo.esgd[106] = -5437008432208715134L;
        MediaInfo.esgd[107] = -1385866017791740940L;
        MediaInfo.esgd[108] = 324241473703182226L;
        MediaInfo.esgd[109] = 2757803345025441633L;
        MediaInfo.esgd[110] = 1303867979248814683L;
        MediaInfo.esgd[111] = 4443780195226174417L;
        MediaInfo.esgd[112] = 2988671460744582910L;
        MediaInfo.esgd[113] = -1810601232471942391L;
        MediaInfo.esgd[114] = -8864922482593484682L;
        MediaInfo.esgd[115] = 5393283960095528018L;
        MediaInfo.esgd[116] = 4705964129584423892L;
        MediaInfo.esgd[117] = 5924832447619163830L;
        MediaInfo.esgd[118] = 3354726609610687031L;
        MediaInfo.esgd[119] = 8380825727949005849L;
        MediaInfo.esgd[120] = -3446908363702170396L;
        MediaInfo.esgd[121] = -6212208800530790107L;
        MediaInfo.esgd[122] = -2849248339228453515L;
        MediaInfo.esgd[123] = -4680804044330922092L;
        MediaInfo.esgd[124] = -6861331076887034148L;
        MediaInfo.esgd[125] = 76353142659664082L;
        MediaInfo.esgd[126] = -8638511783695369561L;
        MediaInfo.esgd[127] = 6783867379378110177L;
        MediaInfo.esgd[128] = 4887847592462118408L;
        MediaInfo.esgd[129] = -6500191361931017044L;
        MediaInfo.esgd[130] = 763735975736265751L;
        MediaInfo.esgd[131] = -3292145752778384686L;
        MediaInfo.esgd[132] = 370985230812580514L;
        MediaInfo.esgd[133] = -1122221155537457805L;
        MediaInfo.esgd[134] = -5292972927355185641L;
        MediaInfo.esgd[135] = -2669647644035525981L;
        MediaInfo.esgd[136] = 8710776582114176700L;
        MediaInfo.esgd[137] = -4109346797993013647L;
        MediaInfo.esgd[138] = 1311937903794567380L;
        MediaInfo.esgd[139] = 1319330326048257484L;
        MediaInfo.esgd[140] = -4848524132701575482L;
        MediaInfo.esgd[141] = -3448307906112385445L;
        MediaInfo.esgd[142] = 9144666949187623734L;
        MediaInfo.esgd[143] = 1587938983699458292L;
        MediaInfo.esgd[144] = 1809007177267708293L;
        MediaInfo.esgd[145] = -237494339105378621L;
        MediaInfo.esgd[146] = -4757634125409211391L;
        MediaInfo.esgd[147] = -8958641109743725109L;
        MediaInfo.esgd[148] = 7104242079976129308L;
        MediaInfo.esgd[149] = 1993705640492793314L;
        MediaInfo.esgd[150] = 8771608814384798218L;
        MediaInfo.esgd[151] = 69218814659375321L;
        MediaInfo.esgd[152] = 6959031349848799468L;
        MediaInfo.esgd[153] = -2568368500590577265L;
        MediaInfo.esgd[154] = -7137757824313278877L;
        MediaInfo.esgd[155] = -4215172427984743024L;
        MediaInfo.esgd[156] = -9103587203379464263L;
        MediaInfo.esgd[157] = -5762897556556761178L;
        MediaInfo.esgd[158] = 4161069881617047618L;
        MediaInfo.esgd[159] = -8329338080994315094L;
        MediaInfo.esgd[160] = 6693877249162614010L;
        MediaInfo.esgd[161] = 6923181459327155884L;
        MediaInfo.esgd[162] = 8308100275224528442L;
        MediaInfo.esgd[163] = 5596495623912187059L;
        MediaInfo.esgd[164] = -3388173152627016737L;
        MediaInfo.esgd[165] = 6050094703015621874L;
        MediaInfo.esgd[166] = -7129886358273741409L;
        MediaInfo.esgd[167] = -88668480220545383L;
        MediaInfo.esgd[168] = 7048624238539321800L;
        MediaInfo.esgd[169] = -6067646885014021187L;
        MediaInfo.esgd[170] = 2696280254376889131L;
        MediaInfo.esgd[171] = 6154224650493649496L;
        MediaInfo.esgd[172] = -3044878073423219968L;
        MediaInfo.esgd[173] = -7553287453071303157L;
        MediaInfo.esgd[174] = -4726672427984367899L;
        MediaInfo.esgd[175] = 3891601971117943172L;
        MediaInfo.esgd[176] = 2180934427915117150L;
        MediaInfo.esgd[177] = 1479924724349275679L;
        MediaInfo.esgd[178] = -6756427236901842694L;
        MediaInfo.esgd[179] = -8152974871741194668L;
        MediaInfo.esgd[180] = -761055941858608073L;
        MediaInfo.esgd[181] = -4698243787278637158L;
        MediaInfo.esgd[182] = -8270381425915779036L;
        MediaInfo.esgd[183] = -8346345185071651727L;
        MediaInfo.esgd[184] = 2299492374583262556L;
        MediaInfo.esgd[185] = -6427624074019840146L;
        MediaInfo.esgd[186] = 8676104815520671015L;
        MediaInfo.esgd[187] = -8806095665360549645L;
        MediaInfo.esgd[188] = -1628579375681992052L;
        MediaInfo.esgd[189] = 1918885359217702168L;
        MediaInfo.esgd[190] = -8521200352848679943L;
        MediaInfo.esgd[191] = -4025291940473459707L;
        MediaInfo.esgd[192] = 8845745545520375826L;
        MediaInfo.esgd[193] = 1663626435111683837L;
        MediaInfo.esgd[194] = -7121057882394167417L;
        MediaInfo.esgd[195] = 7005402565176181096L;
        MediaInfo.esgd[196] = 4678067452099148172L;
        MediaInfo.esgd[197] = 2600537537809421505L;
        MediaInfo.esgd[198] = 3054092274033076845L;
        MediaInfo.esgd[199] = -4930009080384798792L;
    }

    private static /* synthetic */ void eugf() {
        MediaInfo.esgb[200] = 2077681413513892740L;
        MediaInfo.esgb[201] = -4382782472721094023L;
        MediaInfo.esgb[202] = 612693345675902035L;
        MediaInfo.esgb[203] = 7380314631746063222L;
        MediaInfo.esgb[204] = -5831726183240665877L;
        MediaInfo.esgb[205] = 5041621061201146957L;
        MediaInfo.esgb[206] = 3104463005730381878L;
        MediaInfo.esgb[207] = 4241188142512097694L;
        MediaInfo.esgb[208] = -5027029361671076158L;
        MediaInfo.esgb[209] = -5324494104882711573L;
        MediaInfo.esgb[210] = -6839782266341128533L;
        MediaInfo.esgb[211] = 3241224689034399068L;
        MediaInfo.esgb[212] = 2554269394822600550L;
        MediaInfo.esgb[213] = -5673752081759654717L;
        MediaInfo.esgb[214] = 4506265403274438628L;
        MediaInfo.esgb[215] = -5309987828624622355L;
        MediaInfo.esgb[216] = 749565225984857458L;
        MediaInfo.esgb[217] = -3251050177305198618L;
        MediaInfo.esgb[218] = 3126652979622078321L;
        MediaInfo.esgb[219] = 3589247508904784930L;
        MediaInfo.esgb[220] = 4056420583612582617L;
        MediaInfo.esgb[221] = 6067983261412072712L;
        MediaInfo.esgb[222] = -4343471775901815338L;
        MediaInfo.esgb[223] = -3951392779106012451L;
        MediaInfo.esgb[224] = 5655898106702224891L;
        MediaInfo.esgb[225] = 5285252959723300187L;
        MediaInfo.esgb[226] = 6882947961190083245L;
        MediaInfo.esgb[227] = 3903955850936479044L;
        MediaInfo.esgb[228] = -9215910325550112658L;
        MediaInfo.esgb[229] = -1983136593576102726L;
        MediaInfo.esgb[230] = 6550193553659487792L;
        MediaInfo.esgb[231] = 6250697552366594585L;
    }

    private static /* synthetic */ void eubs() {
        MediaInfo.eses[300] = -2005540508;
        MediaInfo.eses[301] = 307609224;
        MediaInfo.eses[302] = -581961744;
        MediaInfo.eses[303] = 1070345697;
        MediaInfo.eses[304] = 571744699;
        MediaInfo.eses[305] = 1777847513;
        MediaInfo.eses[306] = 1879779670;
        MediaInfo.eses[307] = -59988878;
        MediaInfo.eses[308] = -1652901901;
        MediaInfo.eses[309] = -95050016;
        MediaInfo.eses[310] = -1335261809;
        MediaInfo.eses[311] = 1996194022;
        MediaInfo.eses[312] = -1235625234;
        MediaInfo.eses[313] = -1754818991;
        MediaInfo.eses[314] = 1502510906;
        MediaInfo.eses[315] = 1680601788;
        MediaInfo.eses[316] = -1060632890;
        MediaInfo.eses[317] = 682630624;
        MediaInfo.eses[318] = 1499550556;
        MediaInfo.eses[319] = 1188300293;
        MediaInfo.eses[320] = -2064598711;
    }

    private static /* synthetic */ void eucz() {
        MediaInfo.eseu[200] = 473469983;
        MediaInfo.eseu[201] = -42322956;
        MediaInfo.eseu[202] = 1648116405;
        MediaInfo.eseu[203] = -576092489;
        MediaInfo.eseu[204] = -795517877;
        MediaInfo.eseu[205] = 1295163402;
        MediaInfo.eseu[206] = 86531533;
        MediaInfo.eseu[207] = -499443714;
        MediaInfo.eseu[208] = -131782748;
        MediaInfo.eseu[209] = 1803744606;
        MediaInfo.eseu[210] = 1492040742;
        MediaInfo.eseu[211] = 153485046;
        MediaInfo.eseu[212] = -1234159122;
        MediaInfo.eseu[213] = 1423516120;
        MediaInfo.eseu[214] = 1402823624;
        MediaInfo.eseu[215] = -713346741;
        MediaInfo.eseu[216] = -646090485;
        MediaInfo.eseu[217] = 1203271748;
        MediaInfo.eseu[218] = 1814580759;
        MediaInfo.eseu[219] = 2131928767;
        MediaInfo.eseu[220] = -311779185;
        MediaInfo.eseu[221] = 255930988;
        MediaInfo.eseu[222] = 437414165;
        MediaInfo.eseu[223] = -2131744840;
        MediaInfo.eseu[224] = 1719847585;
        MediaInfo.eseu[225] = 1391387491;
        MediaInfo.eseu[226] = -602750004;
        MediaInfo.eseu[227] = 1054751674;
        MediaInfo.eseu[228] = 796971631;
        MediaInfo.eseu[229] = -1987753000;
        MediaInfo.eseu[230] = -964559982;
        MediaInfo.eseu[231] = -631231275;
        MediaInfo.eseu[232] = 1448026035;
        MediaInfo.eseu[233] = -1032456676;
        MediaInfo.eseu[234] = 449152016;
        MediaInfo.eseu[235] = 973328939;
        MediaInfo.eseu[236] = -998013715;
        MediaInfo.eseu[237] = 1781224835;
        MediaInfo.eseu[238] = 1685613277;
        MediaInfo.eseu[239] = -1103245605;
        MediaInfo.eseu[240] = 1541263529;
        MediaInfo.eseu[241] = 1810003763;
        MediaInfo.eseu[242] = -52925836;
        MediaInfo.eseu[243] = -620312991;
        MediaInfo.eseu[244] = 2147423799;
        MediaInfo.eseu[245] = 888711546;
        MediaInfo.eseu[246] = 1018877539;
        MediaInfo.eseu[247] = 732070590;
        MediaInfo.eseu[248] = -1876038236;
        MediaInfo.eseu[249] = -151539079;
        MediaInfo.eseu[250] = 1369382731;
        MediaInfo.eseu[251] = -1126776571;
        MediaInfo.eseu[252] = -499669632;
        MediaInfo.eseu[253] = -1022861079;
        MediaInfo.eseu[254] = 724783240;
        MediaInfo.eseu[255] = 1926148348;
        MediaInfo.eseu[256] = 146564821;
        MediaInfo.eseu[257] = -499678192;
        MediaInfo.eseu[258] = 2089237254;
        MediaInfo.eseu[259] = -1298357229;
        MediaInfo.eseu[260] = -75345733;
        MediaInfo.eseu[261] = -1150619957;
        MediaInfo.eseu[262] = 824299635;
        MediaInfo.eseu[263] = -78106792;
        MediaInfo.eseu[264] = 131383325;
        MediaInfo.eseu[265] = 1413791011;
        MediaInfo.eseu[266] = -408235456;
        MediaInfo.eseu[267] = -2077839387;
        MediaInfo.eseu[268] = 573174756;
        MediaInfo.eseu[269] = 2023141858;
        MediaInfo.eseu[270] = 9216421;
        MediaInfo.eseu[271] = 330593432;
        MediaInfo.eseu[272] = 169969304;
        MediaInfo.eseu[273] = 171268457;
        MediaInfo.eseu[274] = 1066699751;
        MediaInfo.eseu[275] = 480923401;
        MediaInfo.eseu[276] = 1102995021;
        MediaInfo.eseu[277] = 811206080;
        MediaInfo.eseu[278] = 796210876;
        MediaInfo.eseu[279] = 2032138222;
        MediaInfo.eseu[280] = 294562810;
        MediaInfo.eseu[281] = 610713481;
        MediaInfo.eseu[282] = -983252669;
        MediaInfo.eseu[283] = -2031712928;
        MediaInfo.eseu[284] = 1161202293;
        MediaInfo.eseu[285] = 314391467;
        MediaInfo.eseu[286] = -1607258802;
        MediaInfo.eseu[287] = -357754429;
        MediaInfo.eseu[288] = -578528568;
        MediaInfo.eseu[289] = 1430394347;
        MediaInfo.eseu[290] = -1530863540;
        MediaInfo.eseu[291] = 1485925954;
        MediaInfo.eseu[292] = 1311530558;
        MediaInfo.eseu[293] = -1667298140;
        MediaInfo.eseu[294] = 315366742;
        MediaInfo.eseu[295] = -1354648656;
        MediaInfo.eseu[296] = -2063568930;
        MediaInfo.eseu[297] = -1824121053;
        MediaInfo.eseu[298] = 83059322;
        MediaInfo.eseu[299] = -2051008728;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final byte[] getArtworkPng() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("esip", esfz(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esiq", eseq(int ), (int)30)) break;
            v0 /* !! */  = (long)MediaInfo.esev("esir", eseq(int ), (int)31);
        }
        var3_1 = MediaInfo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("esis", esfz(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == MediaInfo.esev("esit", eseq(int ), (int)32)) break;
            v1 /* !! */  = (long)MediaInfo.esev("esiy", eseq(int ), (int)33);
        }
        var2_2 /* !! */  = MediaInfo.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = MediaInfo.lf;
                if (true) ** GOTO lbl22
                block12: while (true) {
                    v2 /* !! */  = (long)(MediaInfo.esev("esjc", esfz(int ), (int)15) - MediaInfo.esev("esja", esfz(int ), (int)14));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2082533695: {
                            break block12;
                        }
                        case 599500231: {
                            continue block12;
                        }
                    }
                    break;
                }
                var1_3 = MediaInfo.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("esje", esfz(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == MediaInfo.esev("esjf", eseq(int ), (int)34)) break;
                    v3 /* !! */  = (long)MediaInfo.esev("esjg", eseq(int ), (int)35);
                }
                return this.artworkPng;
            }
            case 0: {
                var2_2 /* !! */  = (int)MediaInfo.esev("esjh", eseq(int ), (int)36);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esjk", eseq(int ), (int)37);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)MediaInfo.esev("esjl", eseq(int ), (int)38);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("esjn", eseq(int ), (int)39);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String getTitle() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo.lf - MediaInfo.esev("esge", esfz(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo.esev("esgg", eseq(int ), (int)12)) break;
            v0 /* !! */  = (long)MediaInfo.esev("esgj", eseq(int ), (int)13);
        }
        var3_1 = MediaInfo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = MediaInfo.lf - MediaInfo.esev("esgn", esfz(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == MediaInfo.esev("esgp", eseq(int ), (int)14)) break;
            v1 /* !! */  = (long)MediaInfo.esev("esgr", eseq(int ), (int)15);
        }
        var2_2 /* !! */  = MediaInfo.b;
        v2 /* !! */  = MediaInfo.lf;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(MediaInfo.esev("esgw", esfz(int ), (int)3) - MediaInfo.esev("esgu", esfz(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2082533695: {
                    break block12;
                }
                case -2060251050: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = MediaInfo.a;
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
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = MediaInfo.lf - MediaInfo.esev("esgy", esfz(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == MediaInfo.esev("esgz", eseq(int ), (int)16)) break;
                    v3 /* !! */  = (long)MediaInfo.esev("eshf", eseq(int ), (int)17);
                }
                return this.title;
            }
lbl41:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)MediaInfo.esev("eshh", eseq(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl51
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)MediaInfo.esev("eshj", eseq(int ), (int)19);
                    if (!var3_1) ** GOTO lbl41
                    throw null;
                }
            }
lbl51:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)MediaInfo.esev("eshk", eseq(int ), (int)20);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)MediaInfo.esev("eshl", eseq(int ), (int)21);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    static {
        eses = new int[321];
        eseu = new int[321];
        MediaInfo.etzz();
        MediaInfo.euar();
        MediaInfo.eubf();
        MediaInfo.eubs();
        MediaInfo.eubx();
        MediaInfo.eucj();
        MediaInfo.eucz();
        MediaInfo.eudt();
        esgb = new long[232];
        esgd = new long[232];
        MediaInfo.eued();
        MediaInfo.euff();
        MediaInfo.eugf();
        MediaInfo.eugn();
        MediaInfo.euhg();
        MediaInfo.euia();
        Companion = new MediaInfo$Companion(null);
    }

    private static /* synthetic */ void euar() {
        MediaInfo.eses[100] = -1300876390;
        MediaInfo.eses[101] = 839691214;
        MediaInfo.eses[102] = 1977814377;
        MediaInfo.eses[103] = 924815225;
        MediaInfo.eses[104] = 1117209027;
        MediaInfo.eses[105] = 448787344;
        MediaInfo.eses[106] = -521095788;
        MediaInfo.eses[107] = -1037207567;
        MediaInfo.eses[108] = 1363389385;
        MediaInfo.eses[109] = -701112638;
        MediaInfo.eses[110] = -697604228;
        MediaInfo.eses[111] = -1654440272;
        MediaInfo.eses[112] = -1466285838;
        MediaInfo.eses[113] = 862582621;
        MediaInfo.eses[114] = -315208984;
        MediaInfo.eses[115] = 239335482;
        MediaInfo.eses[116] = 1840666764;
        MediaInfo.eses[117] = 1349327563;
        MediaInfo.eses[118] = -1745916572;
        MediaInfo.eses[119] = 1196730913;
        MediaInfo.eses[120] = -2031403394;
        MediaInfo.eses[121] = 1057259178;
        MediaInfo.eses[122] = 1870189211;
        MediaInfo.eses[123] = 252024145;
        MediaInfo.eses[124] = -154224927;
        MediaInfo.eses[125] = -1039222515;
        MediaInfo.eses[126] = 748002451;
        MediaInfo.eses[127] = -1816216947;
        MediaInfo.eses[128] = 369398135;
        MediaInfo.eses[129] = 1268184232;
        MediaInfo.eses[130] = 58063412;
        MediaInfo.eses[131] = -540108763;
        MediaInfo.eses[132] = 579518364;
        MediaInfo.eses[133] = -943941924;
        MediaInfo.eses[134] = 1892914668;
        MediaInfo.eses[135] = -1568682410;
        MediaInfo.eses[136] = -1623521234;
        MediaInfo.eses[137] = 1208473502;
        MediaInfo.eses[138] = -1480053590;
        MediaInfo.eses[139] = 1683592698;
        MediaInfo.eses[140] = -1904661557;
        MediaInfo.eses[141] = 1392188613;
        MediaInfo.eses[142] = 1782919714;
        MediaInfo.eses[143] = 250389277;
        MediaInfo.eses[144] = -1787076462;
        MediaInfo.eses[145] = -180145137;
        MediaInfo.eses[146] = 761533782;
        MediaInfo.eses[147] = -1336287206;
        MediaInfo.eses[148] = -1968907138;
        MediaInfo.eses[149] = 1645441330;
        MediaInfo.eses[150] = -820222526;
        MediaInfo.eses[151] = -2080124990;
        MediaInfo.eses[152] = -1183938132;
        MediaInfo.eses[153] = -899028982;
        MediaInfo.eses[154] = 1925297234;
        MediaInfo.eses[155] = -1009333695;
        MediaInfo.eses[156] = 1035963289;
        MediaInfo.eses[157] = -914643749;
        MediaInfo.eses[158] = 1524714487;
        MediaInfo.eses[159] = -1996658953;
        MediaInfo.eses[160] = 650464156;
        MediaInfo.eses[161] = 111052923;
        MediaInfo.eses[162] = 417370579;
        MediaInfo.eses[163] = 1358740438;
        MediaInfo.eses[164] = -1595773058;
        MediaInfo.eses[165] = 894701079;
        MediaInfo.eses[166] = 1669161950;
        MediaInfo.eses[167] = 1161708285;
        MediaInfo.eses[168] = 553136108;
        MediaInfo.eses[169] = 189652261;
        MediaInfo.eses[170] = 628173510;
        MediaInfo.eses[171] = -719772360;
        MediaInfo.eses[172] = 2099616120;
        MediaInfo.eses[173] = 57885258;
        MediaInfo.eses[174] = 1339277745;
        MediaInfo.eses[175] = -1629144806;
        MediaInfo.eses[176] = 1288468071;
        MediaInfo.eses[177] = 1083893178;
        MediaInfo.eses[178] = 1825764588;
        MediaInfo.eses[179] = 8856594;
        MediaInfo.eses[180] = -114549113;
        MediaInfo.eses[181] = -1705868951;
        MediaInfo.eses[182] = -441811073;
        MediaInfo.eses[183] = -1098250686;
        MediaInfo.eses[184] = -511373657;
        MediaInfo.eses[185] = -1972151555;
        MediaInfo.eses[186] = 1974551140;
        MediaInfo.eses[187] = 1069341744;
        MediaInfo.eses[188] = 629606034;
        MediaInfo.eses[189] = 1069286594;
        MediaInfo.eses[190] = -552065634;
        MediaInfo.eses[191] = 674697307;
        MediaInfo.eses[192] = -1951709288;
        MediaInfo.eses[193] = -1663741175;
        MediaInfo.eses[194] = 1988732479;
        MediaInfo.eses[195] = 780993580;
        MediaInfo.eses[196] = 168392981;
        MediaInfo.eses[197] = -476478402;
        MediaInfo.eses[198] = -426651249;
        MediaInfo.eses[199] = 775729464;
    }

    private static /* synthetic */ void eugn() {
        MediaInfo.esgd[0] = 3270689648377064251L;
        MediaInfo.esgd[1] = 67255175021218243L;
        MediaInfo.esgd[2] = -4935844501971952811L;
        MediaInfo.esgd[3] = 3145383007164708638L;
        MediaInfo.esgd[4] = -5178437538952093886L;
        MediaInfo.esgd[5] = -6888779171690555711L;
        MediaInfo.esgd[6] = 7346418891923135067L;
        MediaInfo.esgd[7] = 5925399745550667443L;
        MediaInfo.esgd[8] = -6275985207350147065L;
        MediaInfo.esgd[9] = 3742838613905350513L;
        MediaInfo.esgd[10] = -3864637735621185959L;
        MediaInfo.esgd[11] = 1869350990359659212L;
        MediaInfo.esgd[12] = 864369188458805007L;
        MediaInfo.esgd[13] = -814269786308978583L;
        MediaInfo.esgd[14] = 3137487811110785693L;
        MediaInfo.esgd[15] = 5977465233577556600L;
        MediaInfo.esgd[16] = 6339982135882904007L;
        MediaInfo.esgd[17] = 8865217078574137998L;
        MediaInfo.esgd[18] = -2427386593772213628L;
        MediaInfo.esgd[19] = -3410374689960019558L;
        MediaInfo.esgd[20] = -6262603511631228664L;
        MediaInfo.esgd[21] = 699326673107412506L;
        MediaInfo.esgd[22] = 3797789680805777168L;
        MediaInfo.esgd[23] = -9010665314241964794L;
        MediaInfo.esgd[24] = -6451536825868892398L;
        MediaInfo.esgd[25] = -2879602316433552693L;
        MediaInfo.esgd[26] = -1785837816995564582L;
        MediaInfo.esgd[27] = 5582166767339559753L;
        MediaInfo.esgd[28] = -260633055014236002L;
        MediaInfo.esgd[29] = -6805924591744867826L;
        MediaInfo.esgd[30] = -389819288516867535L;
        MediaInfo.esgd[31] = 2599952826663827885L;
        MediaInfo.esgd[32] = 8333807662803216856L;
        MediaInfo.esgd[33] = -8052153184952860827L;
        MediaInfo.esgd[34] = -4338644218432033862L;
        MediaInfo.esgd[35] = 6730845943467383626L;
        MediaInfo.esgd[36] = 853767745557281128L;
        MediaInfo.esgd[37] = 5193801446109568380L;
        MediaInfo.esgd[38] = 1123086920909791659L;
        MediaInfo.esgd[39] = -3884974297459631243L;
        MediaInfo.esgd[40] = 8270343887656661134L;
        MediaInfo.esgd[41] = -1002325584377165507L;
        MediaInfo.esgd[42] = 328605521654383405L;
        MediaInfo.esgd[43] = -312670055568345441L;
        MediaInfo.esgd[44] = -8850660624310478945L;
        MediaInfo.esgd[45] = -6221418449290278608L;
        MediaInfo.esgd[46] = -4051435715140789019L;
        MediaInfo.esgd[47] = -5652867098254671989L;
        MediaInfo.esgd[48] = -3526390760609122768L;
        MediaInfo.esgd[49] = 1248190453237873855L;
        MediaInfo.esgd[50] = 4142732498271680411L;
        MediaInfo.esgd[51] = -5282225818527654042L;
        MediaInfo.esgd[52] = 7760012883452403907L;
        MediaInfo.esgd[53] = -2954949319541041986L;
        MediaInfo.esgd[54] = -1571607312836895404L;
        MediaInfo.esgd[55] = -7534097500833318574L;
        MediaInfo.esgd[56] = 206316226782619474L;
        MediaInfo.esgd[57] = 2973635903291596561L;
        MediaInfo.esgd[58] = 7107080852526963612L;
        MediaInfo.esgd[59] = -9018196283500001601L;
        MediaInfo.esgd[60] = -1431532543648758694L;
        MediaInfo.esgd[61] = 4818311544238312768L;
        MediaInfo.esgd[62] = -7477993811446207053L;
        MediaInfo.esgd[63] = -7734186680022632898L;
        MediaInfo.esgd[64] = -299729450779605706L;
        MediaInfo.esgd[65] = -3362210299689894370L;
        MediaInfo.esgd[66] = -7608668990908938774L;
        MediaInfo.esgd[67] = 1173329397673918301L;
        MediaInfo.esgd[68] = -6569097549473525449L;
        MediaInfo.esgd[69] = -8746927284969257225L;
        MediaInfo.esgd[70] = 7579633910295022347L;
        MediaInfo.esgd[71] = 3226861009786571092L;
        MediaInfo.esgd[72] = 5353394133524499772L;
        MediaInfo.esgd[73] = 2337254421173621262L;
        MediaInfo.esgd[74] = 3670016132226037893L;
        MediaInfo.esgd[75] = -3051415759472199893L;
        MediaInfo.esgd[76] = 4751858920919334569L;
        MediaInfo.esgd[77] = 2552314581773309944L;
        MediaInfo.esgd[78] = 8758702622927624449L;
        MediaInfo.esgd[79] = 5117279909030718498L;
        MediaInfo.esgd[80] = 8557848273609773881L;
        MediaInfo.esgd[81] = -7957859495028306955L;
        MediaInfo.esgd[82] = 8758046907878760802L;
        MediaInfo.esgd[83] = -8027765150180058213L;
        MediaInfo.esgd[84] = 3795617950666947940L;
        MediaInfo.esgd[85] = 6212685671433596779L;
        MediaInfo.esgd[86] = -3963190768598091236L;
        MediaInfo.esgd[87] = -3097041092730190735L;
        MediaInfo.esgd[88] = 2336065724309631249L;
        MediaInfo.esgd[89] = -1113153264446457976L;
        MediaInfo.esgd[90] = 2786812031129187822L;
        MediaInfo.esgd[91] = -7849620016593725025L;
        MediaInfo.esgd[92] = -2389278865770628628L;
        MediaInfo.esgd[93] = -5133863739457184056L;
        MediaInfo.esgd[94] = -111768132252520108L;
        MediaInfo.esgd[95] = -4171826003811375011L;
        MediaInfo.esgd[96] = -1844566714080090747L;
        MediaInfo.esgd[97] = 3648349263021809587L;
        MediaInfo.esgd[98] = -3431134585621482853L;
        MediaInfo.esgd[99] = -7264159961523882650L;
    }
}

