/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.serialization.DeserializationStrategy
 *  kotlinx.serialization.KSerializer
 *  kotlinx.serialization.UnknownFieldException
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.internal.BooleanSerializer
 *  kotlinx.serialization.internal.ByteArraySerializer
 *  kotlinx.serialization.internal.GeneratedSerializer
 *  kotlinx.serialization.internal.GeneratedSerializer$DefaultImpls
 *  kotlinx.serialization.internal.LongSerializer
 *  kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
 *  kotlinx.serialization.internal.StringSerializer
 *  org.jetbrains.annotations.NotNull
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaInfo;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2={"dev/redstones/mediaplayerinfo/MediaInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Ldev/redstones/mediaplayerinfo/MediaInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "MediaPlayerInfo"})
@Deprecated(message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}), level=DeprecationLevel.HIDDEN)
public final class MediaInfo$$serializer
implements GeneratedSerializer<MediaInfo> {
    public static final boolean a;
    private static long[] euyh;
    private static int[] euym;
    private static long[] euyi;
    public static final int b;
    private static int[] euyn;
    public static final MediaInfo$$serializer INSTANCE;
    public static final boolean c;
    public static final long lg = 7047894299840367015L;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public MediaInfo deserialize(@NotNull Decoder var1_1) {
        var17_2 = MediaInfo$$serializer.c;
        var16_3 /* !! */  = MediaInfo$$serializer.b;
        var15_4 = MediaInfo$$serializer.a;
        if (var17_2) {
            throw null;
lbl6:
            // 51 sources

            return null;
        }
        if (var16_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_4 || var15_4) ** GOTO lbl6
                Intrinsics.checkNotNullParameter((Object)var1_1, (String)"decoder");
                if (var15_4 || var15_4) ** GOTO lbl6
                var2_5 = this.getDescriptor();
                if (var15_4) ** GOTO lbl6
                var3_6 = MediaInfo$$serializer.euyj("evbq", euyl(int ), (int)45);
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = MediaInfo$$serializer.euyj("evbr", euyl(int ), (int)46);
                if (var15_4) ** GOTO lbl6
                var6_8 = null;
                if (var15_4) ** GOTO lbl6
                var7_9 = null;
                if (var15_4) ** GOTO lbl6
                var8_10 = null;
                if (var15_4) ** GOTO lbl6
                var9_11 /* !! */  = MediaInfo$$serializer.euyj("evbs", euyg(int ), (int)32);
                if (var15_4) ** GOTO lbl6
                var11_12 /* !! */  = MediaInfo$$serializer.euyj("evbt", euyg(int ), (int)33);
                if (var15_4) ** GOTO lbl6
                var13_13 /* !! */  = MediaInfo$$serializer.euyj("evbu", euyl(int ), (int)47);
                if (var15_4) ** GOTO lbl6
                var14_14 = var1_1.beginStructure(var2_5);
                if (var15_4) ** GOTO lbl6
                if (!var14_14.decodeSequentially()) ** GOTO lbl63
                if (var15_4) ** GOTO lbl6
                var6_8 = var14_14.decodeStringElement(var2_5, (int)MediaInfo$$serializer.euyj("evbw", euyl(int ), (int)48));
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evbx", euyl(int ), (int)49));
                if (var15_4) ** GOTO lbl6
                var7_9 = var14_14.decodeStringElement(var2_5, (int)MediaInfo$$serializer.euyj("evby", euyl(int ), (int)50));
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evbz", euyl(int ), (int)51));
                if (var15_4) ** GOTO lbl6
                var8_10 = (byte[])var14_14.decodeSerializableElement(var2_5, (int)MediaInfo$$serializer.euyj("evca", euyl(int ), (int)52), (DeserializationStrategy)ByteArraySerializer.INSTANCE, (Object)var8_10);
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcb", euyl(int ), (int)53));
                if (var15_4) ** GOTO lbl6
                var9_11 /* !! */  = (CallSite)var14_14.decodeLongElement(var2_5, (int)MediaInfo$$serializer.euyj("evcc", euyl(int ), (int)54));
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcd", euyl(int ), (int)55));
                if (var15_4) ** GOTO lbl6
                var11_12 /* !! */  = (CallSite)var14_14.decodeLongElement(var2_5, (int)MediaInfo$$serializer.euyj("evce", euyl(int ), (int)56));
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcf", euyl(int ), (int)57));
                if (var15_4) ** GOTO lbl6
                var13_13 /* !! */  = (CallSite)var14_14.decodeBooleanElement(var2_5, (int)MediaInfo$$serializer.euyj("evcg", euyl(int ), (int)58));
                if (var15_4) ** GOTO lbl6
                var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evch", euyl(int ), (int)59));
                if (var15_4) ** GOTO lbl6
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl126
lbl63:
                // 1 sources

                block82: while (true) lbl-1000:
                // 8 sources

                {
                    if (var15_4 || var15_4) ** GOTO lbl6
                    if (var3_6 == false) ** GOTO lbl126
                    if (var15_4) ** GOTO lbl6
                    var4_15 = var14_14.decodeElementIndex(var2_5);
                    if (var15_4) ** GOTO lbl6
                    switch (var4_15) {
                        case -1: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var3_6 = MediaInfo$$serializer.euyj("evcj", euyl(int ), (int)60);
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) ** GOTO lbl-1000
                            throw null;
                        }
                        case 0: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var6_8 = var14_14.decodeStringElement(var2_5, (int)MediaInfo$$serializer.euyj("evck", euyl(int ), (int)61));
                            if (var15_4) ** GOTO lbl6
                            var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcl", euyl(int ), (int)62));
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) ** GOTO lbl-1000
                            throw null;
                        }
                        case 1: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var7_9 = var14_14.decodeStringElement(var2_5, (int)MediaInfo$$serializer.euyj("evcm", euyl(int ), (int)63));
                            if (var15_4) ** GOTO lbl6
                            var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcn", euyl(int ), (int)64));
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) ** GOTO lbl-1000
                            throw null;
                        }
                        case 2: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var8_10 = (byte[])var14_14.decodeSerializableElement(var2_5, (int)MediaInfo$$serializer.euyj("evco", euyl(int ), (int)65), (DeserializationStrategy)ByteArraySerializer.INSTANCE, var8_10);
                            if (var15_4) ** GOTO lbl6
                            var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcp", euyl(int ), (int)66));
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) ** GOTO lbl-1000
                            throw null;
                        }
                        case 3: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var9_11 /* !! */  = (CallSite)var14_14.decodeLongElement(var2_5, (int)MediaInfo$$serializer.euyj("evcq", euyl(int ), (int)67));
                            if (var15_4) ** GOTO lbl6
                            var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcr", euyl(int ), (int)68));
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) ** GOTO lbl-1000
                            throw null;
                        }
                        case 4: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var11_12 /* !! */  = (CallSite)var14_14.decodeLongElement(var2_5, (int)MediaInfo$$serializer.euyj("evct", euyl(int ), (int)69));
                            if (var15_4) ** GOTO lbl6
                            var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcu", euyl(int ), (int)70));
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) ** GOTO lbl-1000
                            throw null;
                        }
                        case 5: {
                            if (var15_4 || var15_4) ** GOTO lbl6
                            var13_13 /* !! */  = (CallSite)var14_14.decodeBooleanElement(var2_5, (int)MediaInfo$$serializer.euyj("evcv", euyl(int ), (int)71));
                            if (var15_4) ** GOTO lbl6
                            var5_7 /* !! */  = (CallSite)(var5_7 /* !! */  | MediaInfo$$serializer.euyj("evcw", euyl(int ), (int)72));
                            if (var15_4) ** GOTO lbl6
                            if (!var17_2) continue block82;
                            throw null;
                        }
                    }
                    break;
                }
                if (var15_4 || var15_4) ** GOTO lbl6
                throw new UnknownFieldException(var4_15);
lbl126:
                // 2 sources

                if (var15_4 || var15_4) ** GOTO lbl6
                var14_14.endStructure(var2_5);
                if (!var15_4) ** break;
                ** continue;
                return new MediaInfo((int)var5_7 /* !! */ , var6_8, var7_9, var8_10, (long)var9_11 /* !! */ , (long)var11_12 /* !! */ , (boolean)var13_13 /* !! */ , null);
            }
            case 0: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evcx", euyl(int ), (int)73);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
            case 1: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evcy", euyl(int ), (int)74);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl141:
            // 2 sources

            case 2: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evcz", euyl(int ), (int)75);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 3: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evda", euyl(int ), (int)76);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 4: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdb", euyl(int ), (int)77);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl156:
            // 2 sources

            case 5: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdc", euyl(int ), (int)78);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 6: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdd", euyl(int ), (int)79);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl166:
            // 2 sources

            case 7: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evde", euyl(int ), (int)80);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl392
            }
            case 8: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdf", euyl(int ), (int)81);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 9: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdh", euyl(int ), (int)82);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl181:
            // 2 sources

            case 10: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdi", euyl(int ), (int)83);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl186:
            // 2 sources

            case 11: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdj", euyl(int ), (int)84);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl191:
            // 2 sources

            case 12: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdk", euyl(int ), (int)85);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl196:
            // 2 sources

            case 13: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdl", euyl(int ), (int)86);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 14: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdm", euyl(int ), (int)87);
                if (!var17_2) ** GOTO lbl196
                throw null;
            }
lbl205:
            // 2 sources

            case 15: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdn", euyl(int ), (int)88);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl392
            }
            case 16: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdo", euyl(int ), (int)89);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl215:
            // 3 sources

            case 17: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdp", euyl(int ), (int)90);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl220:
            // 3 sources

            case 18: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdr", euyl(int ), (int)91);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl225:
            // 2 sources

            case 19: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evds", euyl(int ), (int)92);
                if (!var17_2) ** GOTO lbl191
                throw null;
            }
            case 20: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdt", euyl(int ), (int)93);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl234:
            // 3 sources

            case 21: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdu", euyl(int ), (int)94);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl396
            }
            case 22: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdv", euyl(int ), (int)95);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl244:
            // 4 sources

            case 23: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdw", euyl(int ), (int)96);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl379
            }
lbl249:
            // 3 sources

            case 24: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdx", euyl(int ), (int)97);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 25: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evdy", euyl(int ), (int)98);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl259:
            // 3 sources

            case 26: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evea", euyl(int ), (int)99);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl264:
            // 2 sources

            case 27: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eveb", euyl(int ), (int)100);
                if (!var17_2) ** GOTO lbl181
                throw null;
            }
            case 28: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evec", euyl(int ), (int)101);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl273:
            // 2 sources

            case 29: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eved", euyl(int ), (int)102);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl278:
            // 2 sources

            case 30: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evee", euyl(int ), (int)103);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl283:
            // 3 sources

            case 31: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evef", euyl(int ), (int)104);
                if (!var17_2) ** GOTO lbl244
                throw null;
            }
            case 32: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eveg", euyl(int ), (int)105);
                if (!var17_2) ** GOTO lbl234
                throw null;
            }
lbl291:
            // 2 sources

            case 33: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eveh", euyl(int ), (int)106);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 34: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evei", euyl(int ), (int)107);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl301:
            // 3 sources

            case 35: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evek", euyl(int ), (int)108);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl383
            }
            case 36: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evel", euyl(int ), (int)109);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
            case 37: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evem", euyl(int ), (int)110);
                if (!var17_2) ** GOTO lbl234
                throw null;
            }
lbl315:
            // 3 sources

            case 38: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("even", euyl(int ), (int)111);
                if (!var17_2) ** GOTO lbl215
                throw null;
            }
            case 39: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eveo", euyl(int ), (int)112);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl324:
            // 3 sources

            case 40: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eveq", euyl(int ), (int)113);
                if (!var17_2) ** GOTO lbl259
                throw null;
            }
lbl328:
            // 4 sources

            case 41: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("ever", euyl(int ), (int)114);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl333:
            // 2 sources

            case 42: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eves", euyl(int ), (int)115);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 43: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evet", euyl(int ), (int)116);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl343:
            // 2 sources

            case 44: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("eveu", euyl(int ), (int)117);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl348:
            // 3 sources

            case 45: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evev", euyl(int ), (int)118);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 46: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evew", euyl(int ), (int)119);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl412
            }
            case 47: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evex", euyl(int ), (int)120);
                if (!var17_2) ** GOTO lbl328
                throw null;
            }
            case 48: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evez", euyl(int ), (int)121);
                if (!var17_2) ** GOTO lbl301
                throw null;
            }
lbl366:
            // 2 sources

            case 49: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfa", euyl(int ), (int)122);
                if (!var17_2) ** GOTO lbl220
                throw null;
            }
lbl370:
            // 2 sources

            case 50: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfb", euyl(int ), (int)123);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl396
            }
            case 51: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfc", euyl(int ), (int)124);
                if (!var17_2) ** GOTO lbl259
                throw null;
            }
lbl379:
            // 2 sources

            case 52: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfe", euyl(int ), (int)125);
                if (!var17_2) ** GOTO lbl249
                throw null;
            }
lbl383:
            // 3 sources

            case 53: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evff", euyl(int ), (int)126);
                if (!var17_2) ** GOTO lbl141
                throw null;
            }
lbl387:
            // 2 sources

            case 54: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfg", euyl(int ), (int)127);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl392:
            // 3 sources

            case 55: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfh", euyl(int ), (int)128);
                if (!var17_2) ** GOTO lbl244
                throw null;
            }
lbl396:
            // 3 sources

            case 56: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfi", euyl(int ), (int)129);
                if (!var17_2) ** GOTO lbl215
                throw null;
            }
lbl400:
            // 4 sources

            case 57: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfj", euyl(int ), (int)130);
                if (!var17_2) ** GOTO lbl301
                throw null;
            }
lbl404:
            // 2 sources

            case 58: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfl", euyl(int ), (int)131);
                if (!var17_2) ** GOTO lbl156
                throw null;
            }
            case 59: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfm", euyl(int ), (int)132);
                if (!var17_2) ** GOTO lbl205
                throw null;
            }
lbl412:
            // 4 sources

            case 60: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfn", euyl(int ), (int)133);
                if (!var17_2) ** GOTO lbl404
                throw null;
            }
            case 61: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfo", euyl(int ), (int)134);
                if (!var17_2) ** GOTO lbl400
                throw null;
            }
lbl420:
            // 3 sources

            case 62: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfp", euyl(int ), (int)135);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl429
            }
            case 63: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfq", euyl(int ), (int)136);
                if (!var17_2) break;
                throw null;
            }
lbl429:
            // 4 sources

            case 64: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfr", euyl(int ), (int)137);
                if (var17_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
lbl434:
            // 3 sources

            case 65: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfs", euyl(int ), (int)138);
                if (!var17_2) ** GOTO lbl225
                throw null;
            }
lbl438:
            // 3 sources

            case 66: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evft", euyl(int ), (int)139);
                if (!var17_2) ** GOTO lbl333
                throw null;
            }
lbl442:
            // 2 sources

            case 67: {
                var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfu", euyl(int ), (int)140);
                if (!var17_2) ** GOTO lbl186
                throw null;
            }
            case 68: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfw", euyl(int ), (int)141);
                    if (!var17_2) ** GOTO lbl328
                    throw null;
                }
            }
            case 69: 
        }
        var16_3 /* !! */  = (int)MediaInfo$$serializer.euyj("evfx", euyl(int ), (int)142);
        ** while (!var17_2)
lbl454:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public SerialDescriptor getDescriptor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("euze", euyg(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == MediaInfo$$serializer.euyj("euzf", euyl(int ), (int)12)) break;
            v0 /* !! */  = (long)MediaInfo$$serializer.euyj("euzg", euyl(int ), (int)13);
        }
        var3_1 = MediaInfo$$serializer.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("euzh", euyg(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == MediaInfo$$serializer.euyj("euzi", euyl(int ), (int)14)) break;
            v1 /* !! */  = (long)MediaInfo$$serializer.euyj("euzj", euyl(int ), (int)15);
        }
        var2_2 = MediaInfo$$serializer.b;
        v2 /* !! */  = MediaInfo$$serializer.lg;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - MediaInfo$$serializer.euyj("euzk", euyg(int ), (int)6));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1229223585: {
                    v3 = MediaInfo$$serializer.euyj("euzl", euyg(int ), (int)7);
                    continue block14;
                }
                case -949082760: {
                    v3 = MediaInfo$$serializer.euyj("euzm", euyg(int ), (int)8);
                    continue block14;
                }
                case 1014778279: {
                    break block14;
                }
                case 1479306092: {
                    v3 = MediaInfo$$serializer.euyj("euzn", euyg(int ), (int)9);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = MediaInfo$$serializer.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = MediaInfo$$serializer.lg;
        if (true) ** GOTO lbl41
        block16: while (true) {
            v4 /* !! */  = (long)(v5 - MediaInfo$$serializer.euyj("euzo", euyg(int ), (int)10));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1687839264: {
                    v5 = MediaInfo$$serializer.euyj("euzq", euyg(int ), (int)11);
                    continue block16;
                }
                case -729643874: {
                    v5 = MediaInfo$$serializer.euyj("euzr", euyg(int ), (int)12);
                    continue block16;
                }
                case -329510181: {
                    v5 = MediaInfo$$serializer.euyj("euzs", euyg(int ), (int)13);
                    continue block16;
                }
                case 1014778279: {
                    break block16;
                }
            }
            break;
        }
        return (SerialDescriptor)MediaInfo$$serializer.descriptor;
    }

    private static /* synthetic */ void evjj() {
        MediaInfo$$serializer.euyh[0] = 6169517412097902106L;
        MediaInfo$$serializer.euyh[1] = 3616704912748509271L;
        MediaInfo$$serializer.euyh[2] = 1063681821227864205L;
        MediaInfo$$serializer.euyh[3] = -511333437444732117L;
        MediaInfo$$serializer.euyh[4] = -7950675809860417922L;
        MediaInfo$$serializer.euyh[5] = 7054782438149318489L;
        MediaInfo$$serializer.euyh[6] = 5041648087368931787L;
        MediaInfo$$serializer.euyh[7] = -5423812255901259257L;
        MediaInfo$$serializer.euyh[8] = 1022066341279510854L;
        MediaInfo$$serializer.euyh[9] = 3725103881783281587L;
        MediaInfo$$serializer.euyh[10] = 1479677802908675883L;
        MediaInfo$$serializer.euyh[11] = -5687258363129587186L;
        MediaInfo$$serializer.euyh[12] = 8055619991876244198L;
        MediaInfo$$serializer.euyh[13] = -4681271531956204989L;
        MediaInfo$$serializer.euyh[14] = 8078255887708137936L;
        MediaInfo$$serializer.euyh[15] = -8260163488958688908L;
        MediaInfo$$serializer.euyh[16] = -48538864305323494L;
        MediaInfo$$serializer.euyh[17] = 759577616297609959L;
        MediaInfo$$serializer.euyh[18] = 4798373692670929505L;
        MediaInfo$$serializer.euyh[19] = -686944945972873606L;
        MediaInfo$$serializer.euyh[20] = -418740282859297448L;
        MediaInfo$$serializer.euyh[21] = 6977320324052119073L;
        MediaInfo$$serializer.euyh[22] = 8610322998405569553L;
        MediaInfo$$serializer.euyh[23] = 152634467260550860L;
        MediaInfo$$serializer.euyh[24] = 3370624585003635737L;
        MediaInfo$$serializer.euyh[25] = -2227774047641331808L;
        MediaInfo$$serializer.euyh[26] = -133266868987734158L;
        MediaInfo$$serializer.euyh[27] = -8493231738690016426L;
        MediaInfo$$serializer.euyh[28] = 4060105593685046348L;
        MediaInfo$$serializer.euyh[29] = 3779885619219099775L;
        MediaInfo$$serializer.euyh[30] = -8915866575223620073L;
        MediaInfo$$serializer.euyh[31] = -1637412364703725799L;
        MediaInfo$$serializer.euyh[32] = 2878617282120872747L;
        MediaInfo$$serializer.euyh[33] = 5947772383189946109L;
        MediaInfo$$serializer.euyh[34] = -1872181932098830591L;
        MediaInfo$$serializer.euyh[35] = -5136377145678431920L;
        MediaInfo$$serializer.euyh[36] = 4812634298181599946L;
        MediaInfo$$serializer.euyh[37] = 8521676459778172138L;
        MediaInfo$$serializer.euyh[38] = 3294762588592979127L;
        MediaInfo$$serializer.euyh[39] = -8193641972632130867L;
        MediaInfo$$serializer.euyh[40] = -6964298249136409481L;
        MediaInfo$$serializer.euyh[41] = 4537466552321075273L;
        MediaInfo$$serializer.euyh[42] = -1013189609183021995L;
        MediaInfo$$serializer.euyh[43] = 5258864393505192117L;
        MediaInfo$$serializer.euyh[44] = -8553965881270595776L;
        MediaInfo$$serializer.euyh[45] = -4728420453542454694L;
        MediaInfo$$serializer.euyh[46] = 897564430071249961L;
        MediaInfo$$serializer.euyh[47] = -5937421594018608377L;
        MediaInfo$$serializer.euyh[48] = 3081031640801407157L;
        MediaInfo$$serializer.euyh[49] = 8344346910400870580L;
        MediaInfo$$serializer.euyh[50] = 5734345211024569519L;
        MediaInfo$$serializer.euyh[51] = -7644891115796004198L;
        MediaInfo$$serializer.euyh[52] = 7237672998668412427L;
        MediaInfo$$serializer.euyh[53] = -4874923838353026646L;
        MediaInfo$$serializer.euyh[54] = 326330674746487579L;
        MediaInfo$$serializer.euyh[55] = 8978023000996783294L;
        MediaInfo$$serializer.euyh[56] = -7052931464789343628L;
        MediaInfo$$serializer.euyh[57] = -8340558352580258683L;
        MediaInfo$$serializer.euyh[58] = -8519688180145074701L;
        MediaInfo$$serializer.euyh[59] = 4627846778114757555L;
        MediaInfo$$serializer.euyh[60] = -3001551514318856132L;
        MediaInfo$$serializer.euyh[61] = -5388677083656530133L;
        MediaInfo$$serializer.euyh[62] = 4407298040808216219L;
        MediaInfo$$serializer.euyh[63] = 5499836508904695626L;
        MediaInfo$$serializer.euyh[64] = 7496728195518160396L;
        MediaInfo$$serializer.euyh[65] = 875165555487311598L;
        MediaInfo$$serializer.euyh[66] = 993360926775601234L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public KSerializer<?>[] typeParametersSerializers() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = lg - MediaInfo$$serializer.euyj("euyk", euyg(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo$$serializer.euyj("euyo", euyl(int ), (int)0)) break;
            object = MediaInfo$$serializer.euyj("euyp", euyl(int ), (int)1);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = lg - MediaInfo$$serializer.euyj("euyq", euyg(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo$$serializer.euyj("euys", euyl(int ), (int)2)) break;
            object = MediaInfo$$serializer.euyj("euyt", euyl(int ), (int)3);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = lg - MediaInfo$$serializer.euyj("euyu", euyg(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo$$serializer.euyj("euyv", euyl(int ), (int)4)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = MediaInfo$$serializer.euyj("euyw", euyl(int ), (int)5);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = lg - MediaInfo$$serializer.euyj("euyx", euyg(int ), (int)3)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == MediaInfo$$serializer.euyj("euyy", euyl(int ), (int)6)) {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers((GeneratedSerializer)this);
            }
            object = MediaInfo$$serializer.euyj("euyz", euyl(int ), (int)7);
        }
    }

    private MediaInfo$$serializer() {
    }

    private static /* synthetic */ void evje() {
        MediaInfo$$serializer.euym[100] = -1648961439;
        MediaInfo$$serializer.euym[101] = 1081158738;
        MediaInfo$$serializer.euym[102] = -14033292;
        MediaInfo$$serializer.euym[103] = 334025564;
        MediaInfo$$serializer.euym[104] = 1737094490;
        MediaInfo$$serializer.euym[105] = 1184043806;
        MediaInfo$$serializer.euym[106] = 589310365;
        MediaInfo$$serializer.euym[107] = 2045287855;
        MediaInfo$$serializer.euym[108] = 596301676;
        MediaInfo$$serializer.euym[109] = 1527822254;
        MediaInfo$$serializer.euym[110] = -2128480377;
        MediaInfo$$serializer.euym[111] = 1687515958;
        MediaInfo$$serializer.euym[112] = 1192392530;
        MediaInfo$$serializer.euym[113] = -454129567;
        MediaInfo$$serializer.euym[114] = -110829416;
        MediaInfo$$serializer.euym[115] = 1644568473;
        MediaInfo$$serializer.euym[116] = 319175776;
        MediaInfo$$serializer.euym[117] = -323405628;
        MediaInfo$$serializer.euym[118] = -950089420;
        MediaInfo$$serializer.euym[119] = -2091002535;
        MediaInfo$$serializer.euym[120] = 2126572229;
        MediaInfo$$serializer.euym[121] = -1622493601;
        MediaInfo$$serializer.euym[122] = -1037948006;
        MediaInfo$$serializer.euym[123] = 815429500;
        MediaInfo$$serializer.euym[124] = -2109122404;
        MediaInfo$$serializer.euym[125] = -2016804290;
        MediaInfo$$serializer.euym[126] = 358560430;
        MediaInfo$$serializer.euym[127] = -391574239;
        MediaInfo$$serializer.euym[128] = 1682246974;
        MediaInfo$$serializer.euym[129] = -1474080851;
        MediaInfo$$serializer.euym[130] = -1315019770;
        MediaInfo$$serializer.euym[131] = -349185864;
        MediaInfo$$serializer.euym[132] = 106114460;
        MediaInfo$$serializer.euym[133] = 1027009456;
        MediaInfo$$serializer.euym[134] = -2142115050;
        MediaInfo$$serializer.euym[135] = -327107100;
        MediaInfo$$serializer.euym[136] = -27370123;
        MediaInfo$$serializer.euym[137] = 2027081981;
        MediaInfo$$serializer.euym[138] = 648460021;
        MediaInfo$$serializer.euym[139] = 2082337036;
        MediaInfo$$serializer.euym[140] = 1396339689;
        MediaInfo$$serializer.euym[141] = -395055220;
        MediaInfo$$serializer.euym[142] = 282001115;
        MediaInfo$$serializer.euym[143] = 2024729084;
        MediaInfo$$serializer.euym[144] = 965453413;
        MediaInfo$$serializer.euym[145] = -1787711375;
        MediaInfo$$serializer.euym[146] = -429452406;
        MediaInfo$$serializer.euym[147] = -130578708;
        MediaInfo$$serializer.euym[148] = 2027047196;
        MediaInfo$$serializer.euym[149] = -416190507;
        MediaInfo$$serializer.euym[150] = -1065813376;
        MediaInfo$$serializer.euym[151] = 1107418805;
        MediaInfo$$serializer.euym[152] = -1633920915;
        MediaInfo$$serializer.euym[153] = 1354896902;
        MediaInfo$$serializer.euym[154] = -1375452004;
        MediaInfo$$serializer.euym[155] = -2070042233;
        MediaInfo$$serializer.euym[156] = 687108418;
        MediaInfo$$serializer.euym[157] = -551359205;
        MediaInfo$$serializer.euym[158] = 1189359775;
        MediaInfo$$serializer.euym[159] = 706650283;
        MediaInfo$$serializer.euym[160] = -1760213579;
        MediaInfo$$serializer.euym[161] = 1648898375;
        MediaInfo$$serializer.euym[162] = -235835812;
        MediaInfo$$serializer.euym[163] = -575297579;
        MediaInfo$$serializer.euym[164] = -987389976;
        MediaInfo$$serializer.euym[165] = -1329631901;
        MediaInfo$$serializer.euym[166] = -800231327;
        MediaInfo$$serializer.euym[167] = 1254662721;
        MediaInfo$$serializer.euym[168] = -485125912;
        MediaInfo$$serializer.euym[169] = -190265419;
        MediaInfo$$serializer.euym[170] = 442320651;
        MediaInfo$$serializer.euym[171] = -176033043;
        MediaInfo$$serializer.euym[172] = 1628904162;
        MediaInfo$$serializer.euym[173] = -1362852166;
        MediaInfo$$serializer.euym[174] = -911355114;
        MediaInfo$$serializer.euym[175] = 217199565;
        MediaInfo$$serializer.euym[176] = -1330919517;
        MediaInfo$$serializer.euym[177] = 1387455870;
        MediaInfo$$serializer.euym[178] = 1507215529;
        MediaInfo$$serializer.euym[179] = -446446227;
        MediaInfo$$serializer.euym[180] = 690692797;
        MediaInfo$$serializer.euym[181] = -95489548;
        MediaInfo$$serializer.euym[182] = -1788795760;
        MediaInfo$$serializer.euym[183] = -212199882;
        MediaInfo$$serializer.euym[184] = -1213532673;
        MediaInfo$$serializer.euym[185] = -172041348;
        MediaInfo$$serializer.euym[186] = 1155821587;
        MediaInfo$$serializer.euym[187] = 1553884812;
        MediaInfo$$serializer.euym[188] = 2100817813;
        MediaInfo$$serializer.euym[189] = 885858812;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public KSerializer<?>[] childSerializers() {
        v0 /* !! */  = MediaInfo$$serializer.lg;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - MediaInfo$$serializer.euyj("euzx", euyg(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 108710527: {
                    v1 = MediaInfo$$serializer.euyj("euzy", euyg(int ), (int)15);
                    continue block31;
                }
                case 719633211: {
                    v1 = MediaInfo$$serializer.euyj("euzz", euyg(int ), (int)16);
                    continue block31;
                }
                case 1014778279: {
                    break block31;
                }
                case 1061024654: {
                    v1 = MediaInfo$$serializer.euyj("evaa", euyg(int ), (int)17);
                    continue block31;
                }
            }
            break;
        }
        var4_1 = MediaInfo$$serializer.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evab", euyg(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == MediaInfo$$serializer.euyj("evac", euyl(int ), (int)20)) break;
            v2 /* !! */  = (long)MediaInfo$$serializer.euyj("evad", euyl(int ), (int)21);
        }
        var3_2 /* !! */  = MediaInfo$$serializer.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evae", euyg(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == MediaInfo$$serializer.euyj("evaf", euyl(int ), (int)22)) break;
            v3 /* !! */  = (long)MediaInfo$$serializer.euyj("evag", euyl(int ), (int)23);
        }
        var2_3 = MediaInfo$$serializer.a;
        if (!var4_1) ** GOTO lbl38
        throw null;
        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var2_3 || var2_3) continue block34;
                var1_4 = new KSerializer[6];
                if (var2_3) continue block34;
                v4 = MediaInfo$$serializer.euyj("evah", euyl(int ), (int)24);
                while (true) {
                    if ((v5 = (cfr_temp_2 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evaj", euyg(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 == MediaInfo$$serializer.euyj("evak", euyl(int ), (int)25)) break;
                    v5 = -1270636009;
                }
                var1_4[v4] = StringSerializer.INSTANCE;
                if (var2_3) continue block34;
                v6 = MediaInfo$$serializer.euyj("eval", euyl(int ), (int)26);
                while (true) {
                    if ((v7 = (cfr_temp_3 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evam", euyg(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 == MediaInfo$$serializer.euyj("evan", euyl(int ), (int)27)) break;
                    v7 = -663084308;
                }
                var1_4[v6] = StringSerializer.INSTANCE;
                if (var2_3) continue block34;
                v8 = MediaInfo$$serializer.euyj("evao", euyl(int ), (int)28);
                while (true) {
                    if ((v9 = (cfr_temp_4 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evap", euyg(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 == MediaInfo$$serializer.euyj("evaq", euyl(int ), (int)29)) break;
                    v9 = -793245581;
                }
                var1_4[v8] = ByteArraySerializer.INSTANCE;
                if (var2_3) continue block34;
                v10 = MediaInfo$$serializer.euyj("evar", euyl(int ), (int)30);
                v11 /* !! */  = MediaInfo$$serializer.lg;
                if (true) ** GOTO lbl73
                block38: while (true) {
                    v11 /* !! */  = (long)(v12 - MediaInfo$$serializer.euyj("evas", euyg(int ), (int)23));
lbl73:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -741919403: {
                            v12 = MediaInfo$$serializer.euyj("evat", euyg(int ), (int)24);
                            continue block38;
                        }
                        case 1014778279: {
                            break block38;
                        }
                        case 1518115903: {
                            v12 = MediaInfo$$serializer.euyj("evau", euyg(int ), (int)25);
                            continue block38;
                        }
                        case 2124095700: {
                            v12 = MediaInfo$$serializer.euyj("evav", euyg(int ), (int)26);
                            continue block38;
                        }
                    }
                    break;
                }
                var1_4[v10] = LongSerializer.INSTANCE;
                if (var2_3) continue block34;
                v13 = MediaInfo$$serializer.euyj("evaw", euyl(int ), (int)31);
                v14 /* !! */  = MediaInfo$$serializer.lg;
                if (true) ** GOTO lbl92
                block39: while (true) {
                    v14 /* !! */  = (long)(v15 - MediaInfo$$serializer.euyj("evax", euyg(int ), (int)27));
lbl92:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -880407955: {
                            v15 = MediaInfo$$serializer.euyj("evay", euyg(int ), (int)28);
                            continue block39;
                        }
                        case -846324430: {
                            v15 = MediaInfo$$serializer.euyj("evaz", euyg(int ), (int)29);
                            continue block39;
                        }
                        case -687445424: {
                            v15 = MediaInfo$$serializer.euyj("evba", euyg(int ), (int)30);
                            continue block39;
                        }
                        case 1014778279: {
                            break block39;
                        }
                    }
                    break;
                }
                var1_4[v13] = LongSerializer.INSTANCE;
                if (var2_3) continue block34;
                v16 = MediaInfo$$serializer.euyj("evbb", euyl(int ), (int)32);
                while (true) {
                    if ((v17 = (cfr_temp_5 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evbc", euyg(int ), (int)31)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 == MediaInfo$$serializer.euyj("evbd", euyl(int ), (int)33)) break;
                    v17 = 948076369;
                }
                var1_4[v16] = BooleanSerializer.INSTANCE;
                if (!var2_3) ** break;
                continue block34;
                return var1_4;
                case 0: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbe", euyl(int ), (int)34);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl126
                }
lbl122:
                // 2 sources

                case 1: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbf", euyl(int ), (int)35);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl126:
                // 7 sources

                case 2: {
                    do {
                        var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbh", euyl(int ), (int)36);
                    } while (!var4_1);
                    throw null;
                }
                case 3: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbi", euyl(int ), (int)37);
                    if (!var4_1) ** GOTO lbl126
                    throw null;
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbj", euyl(int ), (int)38);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl149
                        break;
                    }
                }
                case 5: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbk", euyl(int ), (int)39);
                    if (!var4_1) ** GOTO lbl126
                    throw null;
                }
lbl145:
                // 2 sources

                case 6: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbl", euyl(int ), (int)40);
                    if (!var4_1) ** GOTO lbl126
                    throw null;
                }
lbl149:
                // 3 sources

                case 7: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbm", euyl(int ), (int)41);
                    if (!var4_1) ** GOTO lbl145
                    throw null;
                }
                case 8: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbn", euyl(int ), (int)42);
                    if (!var4_1) ** GOTO lbl122
                    throw null;
                }
                case 9: {
                    var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbo", euyl(int ), (int)43);
                    if (!var4_1) ** GOTO lbl149
                    throw null;
                }
                case 10: 
            }
        }
        var3_2 /* !! */  = (int)MediaInfo$$serializer.euyj("evbp", euyl(int ), (int)44);
        ** while (!var4_1)
lbl164:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void evjk() {
        MediaInfo$$serializer.euyi[0] = -6076319776453019015L;
        MediaInfo$$serializer.euyi[1] = 5099416550902943627L;
        MediaInfo$$serializer.euyi[2] = -785644353216564456L;
        MediaInfo$$serializer.euyi[3] = 195622763492182930L;
        MediaInfo$$serializer.euyi[4] = -8595588633236432812L;
        MediaInfo$$serializer.euyi[5] = 636298475496198142L;
        MediaInfo$$serializer.euyi[6] = -3386044813818596927L;
        MediaInfo$$serializer.euyi[7] = -8867880724038822821L;
        MediaInfo$$serializer.euyi[8] = 1102774147501592004L;
        MediaInfo$$serializer.euyi[9] = -6917235507450975938L;
        MediaInfo$$serializer.euyi[10] = -3137055181946714595L;
        MediaInfo$$serializer.euyi[11] = -8173065776052818255L;
        MediaInfo$$serializer.euyi[12] = -2738016348857485214L;
        MediaInfo$$serializer.euyi[13] = -6852166770480682690L;
        MediaInfo$$serializer.euyi[14] = -8962637741199467318L;
        MediaInfo$$serializer.euyi[15] = -8227251227641372841L;
        MediaInfo$$serializer.euyi[16] = -2962187568493139116L;
        MediaInfo$$serializer.euyi[17] = -7098447734576919714L;
        MediaInfo$$serializer.euyi[18] = 7450259257631791234L;
        MediaInfo$$serializer.euyi[19] = -5581525827121279269L;
        MediaInfo$$serializer.euyi[20] = -406493700458175091L;
        MediaInfo$$serializer.euyi[21] = 5042078468288229710L;
        MediaInfo$$serializer.euyi[22] = 8289057468818864862L;
        MediaInfo$$serializer.euyi[23] = 2350114980993757200L;
        MediaInfo$$serializer.euyi[24] = -5554648547791118749L;
        MediaInfo$$serializer.euyi[25] = -5136135572698205655L;
        MediaInfo$$serializer.euyi[26] = 5861822994080280946L;
        MediaInfo$$serializer.euyi[27] = -7667742718681717098L;
        MediaInfo$$serializer.euyi[28] = 8680174403730337575L;
        MediaInfo$$serializer.euyi[29] = -1601869543090128898L;
        MediaInfo$$serializer.euyi[30] = -8201015024544040740L;
        MediaInfo$$serializer.euyi[31] = 2188962856387585595L;
        MediaInfo$$serializer.euyi[32] = 2878617282120872747L;
        MediaInfo$$serializer.euyi[33] = 5947772383189946109L;
        MediaInfo$$serializer.euyi[34] = -8185819208784991067L;
        MediaInfo$$serializer.euyi[35] = 723258274745674133L;
        MediaInfo$$serializer.euyi[36] = -1036794840109599414L;
        MediaInfo$$serializer.euyi[37] = -5132382668535342381L;
        MediaInfo$$serializer.euyi[38] = 6977435444391001793L;
        MediaInfo$$serializer.euyi[39] = 6598096541748491234L;
        MediaInfo$$serializer.euyi[40] = 2401494835058403670L;
        MediaInfo$$serializer.euyi[41] = 1323356387969071775L;
        MediaInfo$$serializer.euyi[42] = 4334499264073108936L;
        MediaInfo$$serializer.euyi[43] = 3936435973723087720L;
        MediaInfo$$serializer.euyi[44] = -6808796139963536687L;
        MediaInfo$$serializer.euyi[45] = -2714949471219502734L;
        MediaInfo$$serializer.euyi[46] = 269958562229865998L;
        MediaInfo$$serializer.euyi[47] = -8122517193031655945L;
        MediaInfo$$serializer.euyi[48] = 4413384750445682292L;
        MediaInfo$$serializer.euyi[49] = -1484056746600400976L;
        MediaInfo$$serializer.euyi[50] = 7265425041612583852L;
        MediaInfo$$serializer.euyi[51] = -3902553447812979756L;
        MediaInfo$$serializer.euyi[52] = -8111143810244635668L;
        MediaInfo$$serializer.euyi[53] = 7153166704910319669L;
        MediaInfo$$serializer.euyi[54] = -2354836736124460419L;
        MediaInfo$$serializer.euyi[55] = 3387101133684322951L;
        MediaInfo$$serializer.euyi[56] = -1086849017835713036L;
        MediaInfo$$serializer.euyi[57] = 7899277277450320243L;
        MediaInfo$$serializer.euyi[58] = -527364443349824601L;
        MediaInfo$$serializer.euyi[59] = 7519205301529278031L;
        MediaInfo$$serializer.euyi[60] = -5121161170286975245L;
        MediaInfo$$serializer.euyi[61] = 2714012599280449524L;
        MediaInfo$$serializer.euyi[62] = -711090799951680206L;
        MediaInfo$$serializer.euyi[63] = -8342854338532237532L;
        MediaInfo$$serializer.euyi[64] = -5705087090842778449L;
        MediaInfo$$serializer.euyi[65] = -1477714606115616028L;
        MediaInfo$$serializer.euyi[66] = -5691849280257857097L;
    }

    private static /* synthetic */ void evjf() {
        MediaInfo$$serializer.euyn[0] = 1001766261;
        MediaInfo$$serializer.euyn[1] = -1242417855;
        MediaInfo$$serializer.euyn[2] = 861198915;
        MediaInfo$$serializer.euyn[3] = 321961837;
        MediaInfo$$serializer.euyn[4] = -1314782323;
        MediaInfo$$serializer.euyn[5] = -478200615;
        MediaInfo$$serializer.euyn[6] = 1472252996;
        MediaInfo$$serializer.euyn[7] = -24058756;
        MediaInfo$$serializer.euyn[8] = -1065526052;
        MediaInfo$$serializer.euyn[9] = -551873485;
        MediaInfo$$serializer.euyn[10] = -229609338;
        MediaInfo$$serializer.euyn[11] = -373534631;
        MediaInfo$$serializer.euyn[12] = 1459245160;
        MediaInfo$$serializer.euyn[13] = 1419893491;
        MediaInfo$$serializer.euyn[14] = 807850742;
        MediaInfo$$serializer.euyn[15] = 416669695;
        MediaInfo$$serializer.euyn[16] = -1368746207;
        MediaInfo$$serializer.euyn[17] = -1941820288;
        MediaInfo$$serializer.euyn[18] = 1016139460;
        MediaInfo$$serializer.euyn[19] = 1950027494;
        MediaInfo$$serializer.euyn[20] = 1803588229;
        MediaInfo$$serializer.euyn[21] = -1167974502;
        MediaInfo$$serializer.euyn[22] = -1731386700;
        MediaInfo$$serializer.euyn[23] = -1479399822;
        MediaInfo$$serializer.euyn[24] = -1697483598;
        MediaInfo$$serializer.euyn[25] = -879512248;
        MediaInfo$$serializer.euyn[26] = 1072609136;
        MediaInfo$$serializer.euyn[27] = -190424850;
        MediaInfo$$serializer.euyn[28] = 350309238;
        MediaInfo$$serializer.euyn[29] = -1003481768;
        MediaInfo$$serializer.euyn[30] = 1008052653;
        MediaInfo$$serializer.euyn[31] = 1786281986;
        MediaInfo$$serializer.euyn[32] = -2124711455;
        MediaInfo$$serializer.euyn[33] = 54572412;
        MediaInfo$$serializer.euyn[34] = -2055741690;
        MediaInfo$$serializer.euyn[35] = 2792325;
        MediaInfo$$serializer.euyn[36] = 1862234849;
        MediaInfo$$serializer.euyn[37] = -862593391;
        MediaInfo$$serializer.euyn[38] = 801031298;
        MediaInfo$$serializer.euyn[39] = -2110997813;
        MediaInfo$$serializer.euyn[40] = -1259608926;
        MediaInfo$$serializer.euyn[41] = 517418086;
        MediaInfo$$serializer.euyn[42] = 644141838;
        MediaInfo$$serializer.euyn[43] = -932126640;
        MediaInfo$$serializer.euyn[44] = -1314330229;
        MediaInfo$$serializer.euyn[45] = 1570486491;
        MediaInfo$$serializer.euyn[46] = -1439787152;
        MediaInfo$$serializer.euyn[47] = -1813286565;
        MediaInfo$$serializer.euyn[48] = 1546092733;
        MediaInfo$$serializer.euyn[49] = 255210179;
        MediaInfo$$serializer.euyn[50] = 1830516831;
        MediaInfo$$serializer.euyn[51] = 1520214851;
        MediaInfo$$serializer.euyn[52] = 321005452;
        MediaInfo$$serializer.euyn[53] = 937840341;
        MediaInfo$$serializer.euyn[54] = -1865929576;
        MediaInfo$$serializer.euyn[55] = -865426860;
        MediaInfo$$serializer.euyn[56] = 1528380819;
        MediaInfo$$serializer.euyn[57] = -1793560278;
        MediaInfo$$serializer.euyn[58] = -103513017;
        MediaInfo$$serializer.euyn[59] = -563033333;
        MediaInfo$$serializer.euyn[60] = -893744541;
        MediaInfo$$serializer.euyn[61] = 1649268153;
        MediaInfo$$serializer.euyn[62] = 710446376;
        MediaInfo$$serializer.euyn[63] = 123720222;
        MediaInfo$$serializer.euyn[64] = 1252958793;
        MediaInfo$$serializer.euyn[65] = -1779222204;
        MediaInfo$$serializer.euyn[66] = -886991903;
        MediaInfo$$serializer.euyn[67] = 964707569;
        MediaInfo$$serializer.euyn[68] = -889073745;
        MediaInfo$$serializer.euyn[69] = 1089212656;
        MediaInfo$$serializer.euyn[70] = 39306746;
        MediaInfo$$serializer.euyn[71] = 1786256719;
        MediaInfo$$serializer.euyn[72] = -689459518;
        MediaInfo$$serializer.euyn[73] = -371120360;
        MediaInfo$$serializer.euyn[74] = 1615687725;
        MediaInfo$$serializer.euyn[75] = -131507114;
        MediaInfo$$serializer.euyn[76] = -139829419;
        MediaInfo$$serializer.euyn[77] = 1243328861;
        MediaInfo$$serializer.euyn[78] = -787653409;
        MediaInfo$$serializer.euyn[79] = 82501809;
        MediaInfo$$serializer.euyn[80] = -1723830012;
        MediaInfo$$serializer.euyn[81] = 1018377217;
        MediaInfo$$serializer.euyn[82] = 378672878;
        MediaInfo$$serializer.euyn[83] = -1413747700;
        MediaInfo$$serializer.euyn[84] = 756215196;
        MediaInfo$$serializer.euyn[85] = -966408587;
        MediaInfo$$serializer.euyn[86] = -35122003;
        MediaInfo$$serializer.euyn[87] = 1915096004;
        MediaInfo$$serializer.euyn[88] = 1009722810;
        MediaInfo$$serializer.euyn[89] = 1909951792;
        MediaInfo$$serializer.euyn[90] = -719778004;
        MediaInfo$$serializer.euyn[91] = 1485330654;
        MediaInfo$$serializer.euyn[92] = 2142643121;
        MediaInfo$$serializer.euyn[93] = 2054126785;
        MediaInfo$$serializer.euyn[94] = 819923388;
        MediaInfo$$serializer.euyn[95] = 1170359099;
        MediaInfo$$serializer.euyn[96] = -1760171855;
        MediaInfo$$serializer.euyn[97] = 1691662887;
        MediaInfo$$serializer.euyn[98] = 604097969;
        MediaInfo$$serializer.euyn[99] = -1478271991;
    }

    public static /* synthetic */ CallSite euyj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long euyg(int n2) {
        return euyh[n2] ^ euyi[n2];
    }

    private static /* synthetic */ int euyl(int n2) {
        return euym[n2] ^ euyn[n2];
    }

    static {
        euym = new int[190];
        euyn = new int[190];
        MediaInfo$$serializer.evjd();
        MediaInfo$$serializer.evje();
        MediaInfo$$serializer.evjf();
        MediaInfo$$serializer.evjg();
        euyh = new long[67];
        euyi = new long[67];
        MediaInfo$$serializer.evjj();
        MediaInfo$$serializer.evjk();
        INSTANCE = new MediaInfo$$serializer();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("dev.redstones.mediaplayerinfo.MediaInfo", (GeneratedSerializer)INSTANCE, (int)MediaInfo$$serializer.euyj("eviw", euyl(int ), (int)183));
        pluginGeneratedSerialDescriptor.addElement("title", (boolean)MediaInfo$$serializer.euyj("evix", euyl(int ), (int)184));
        pluginGeneratedSerialDescriptor.addElement("artist", (boolean)MediaInfo$$serializer.euyj("eviy", euyl(int ), (int)185));
        pluginGeneratedSerialDescriptor.addElement("artworkPng", (boolean)MediaInfo$$serializer.euyj("eviz", euyl(int ), (int)186));
        pluginGeneratedSerialDescriptor.addElement("position", (boolean)MediaInfo$$serializer.euyj("evja", euyl(int ), (int)187));
        pluginGeneratedSerialDescriptor.addElement("duration", (boolean)MediaInfo$$serializer.euyj("evjb", euyl(int ), (int)188));
        pluginGeneratedSerialDescriptor.addElement("playing", (boolean)MediaInfo$$serializer.euyj("evjc", euyl(int ), (int)189));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private static /* synthetic */ void evjg() {
        MediaInfo$$serializer.euyn[100] = -1648961500;
        MediaInfo$$serializer.euyn[101] = 1081158752;
        MediaInfo$$serializer.euyn[102] = -14033303;
        MediaInfo$$serializer.euyn[103] = 334025595;
        MediaInfo$$serializer.euyn[104] = 1737094491;
        MediaInfo$$serializer.euyn[105] = 1184043839;
        MediaInfo$$serializer.euyn[106] = 589310349;
        MediaInfo$$serializer.euyn[107] = 2045287867;
        MediaInfo$$serializer.euyn[108] = 596301673;
        MediaInfo$$serializer.euyn[109] = 1527822210;
        MediaInfo$$serializer.euyn[110] = -2128480362;
        MediaInfo$$serializer.euyn[111] = 1687515935;
        MediaInfo$$serializer.euyn[112] = 1192392527;
        MediaInfo$$serializer.euyn[113] = -454129629;
        MediaInfo$$serializer.euyn[114] = -110829421;
        MediaInfo$$serializer.euyn[115] = 1644568475;
        MediaInfo$$serializer.euyn[116] = 319175769;
        MediaInfo$$serializer.euyn[117] = -323405586;
        MediaInfo$$serializer.euyn[118] = -950089432;
        MediaInfo$$serializer.euyn[119] = -2091002506;
        MediaInfo$$serializer.euyn[120] = 2126572230;
        MediaInfo$$serializer.euyn[121] = -1622493613;
        MediaInfo$$serializer.euyn[122] = -1037947943;
        MediaInfo$$serializer.euyn[123] = 815429440;
        MediaInfo$$serializer.euyn[124] = -2109122386;
        MediaInfo$$serializer.euyn[125] = -2016804227;
        MediaInfo$$serializer.euyn[126] = 358560392;
        MediaInfo$$serializer.euyn[127] = -391574269;
        MediaInfo$$serializer.euyn[128] = 1682246944;
        MediaInfo$$serializer.euyn[129] = -1474080862;
        MediaInfo$$serializer.euyn[130] = -1315019716;
        MediaInfo$$serializer.euyn[131] = -349185864;
        MediaInfo$$serializer.euyn[132] = 106114442;
        MediaInfo$$serializer.euyn[133] = 1027009436;
        MediaInfo$$serializer.euyn[134] = -2142115037;
        MediaInfo$$serializer.euyn[135] = -327107075;
        MediaInfo$$serializer.euyn[136] = -27370147;
        MediaInfo$$serializer.euyn[137] = 2027081913;
        MediaInfo$$serializer.euyn[138] = 648459993;
        MediaInfo$$serializer.euyn[139] = 2082337027;
        MediaInfo$$serializer.euyn[140] = 1396339697;
        MediaInfo$$serializer.euyn[141] = -395055154;
        MediaInfo$$serializer.euyn[142] = 282001130;
        MediaInfo$$serializer.euyn[143] = 2024729085;
        MediaInfo$$serializer.euyn[144] = 829632407;
        MediaInfo$$serializer.euyn[145] = 1787711374;
        MediaInfo$$serializer.euyn[146] = 738049776;
        MediaInfo$$serializer.euyn[147] = -130578707;
        MediaInfo$$serializer.euyn[148] = -1484501158;
        MediaInfo$$serializer.euyn[149] = 416190506;
        MediaInfo$$serializer.euyn[150] = 281990819;
        MediaInfo$$serializer.euyn[151] = 1107418804;
        MediaInfo$$serializer.euyn[152] = -110687682;
        MediaInfo$$serializer.euyn[153] = 1354896898;
        MediaInfo$$serializer.euyn[154] = -1375452001;
        MediaInfo$$serializer.euyn[155] = -2070042237;
        MediaInfo$$serializer.euyn[156] = 687108423;
        MediaInfo$$serializer.euyn[157] = -551359202;
        MediaInfo$$serializer.euyn[158] = 1189359768;
        MediaInfo$$serializer.euyn[159] = 706650274;
        MediaInfo$$serializer.euyn[160] = -1760213569;
        MediaInfo$$serializer.euyn[161] = 1648898371;
        MediaInfo$$serializer.euyn[162] = -235835818;
        MediaInfo$$serializer.euyn[163] = -575297571;
        MediaInfo$$serializer.euyn[164] = -987389975;
        MediaInfo$$serializer.euyn[165] = 201325185;
        MediaInfo$$serializer.euyn[166] = 800231326;
        MediaInfo$$serializer.euyn[167] = 1544981123;
        MediaInfo$$serializer.euyn[168] = -485125909;
        MediaInfo$$serializer.euyn[169] = -190265418;
        MediaInfo$$serializer.euyn[170] = 442320648;
        MediaInfo$$serializer.euyn[171] = -176033043;
        MediaInfo$$serializer.euyn[172] = 1628904163;
        MediaInfo$$serializer.euyn[173] = 148869909;
        MediaInfo$$serializer.euyn[174] = -911355113;
        MediaInfo$$serializer.euyn[175] = -349807939;
        MediaInfo$$serializer.euyn[176] = -1330919518;
        MediaInfo$$serializer.euyn[177] = -906798427;
        MediaInfo$$serializer.euyn[178] = 1507215528;
        MediaInfo$$serializer.euyn[179] = -446446225;
        MediaInfo$$serializer.euyn[180] = 690692797;
        MediaInfo$$serializer.euyn[181] = -95489552;
        MediaInfo$$serializer.euyn[182] = -1788795759;
        MediaInfo$$serializer.euyn[183] = -212199888;
        MediaInfo$$serializer.euyn[184] = -1213532673;
        MediaInfo$$serializer.euyn[185] = -172041348;
        MediaInfo$$serializer.euyn[186] = 1155821587;
        MediaInfo$$serializer.euyn[187] = 1553884812;
        MediaInfo$$serializer.euyn[188] = 2100817813;
        MediaInfo$$serializer.euyn[189] = 885858812;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void serialize(@NotNull Encoder var1_1, @NotNull MediaInfo var2_2) {
        v0 /* !! */  = MediaInfo$$serializer.lg;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - MediaInfo$$serializer.euyj("evfy", euyg(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -677985925: {
                    v1 = MediaInfo$$serializer.euyj("evfz", euyg(int ), (int)35);
                    continue block36;
                }
                case 1014778279: {
                    break block36;
                }
                case 1665580049: {
                    v1 = MediaInfo$$serializer.euyj("evga", euyg(int ), (int)36);
                    continue block36;
                }
                case 1952802202: {
                    v1 = MediaInfo$$serializer.euyj("evgb", euyg(int ), (int)37);
                    continue block36;
                }
            }
            break;
        }
        var7_3 = MediaInfo$$serializer.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evgc", euyg(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == MediaInfo$$serializer.euyj("evgd", euyl(int ), (int)143)) break;
            v2 /* !! */  = (long)MediaInfo$$serializer.euyj("evge", euyl(int ), (int)144);
        }
        var6_4 /* !! */  = MediaInfo$$serializer.b;
        v3 /* !! */  = MediaInfo$$serializer.lg;
        if (true) ** GOTO lbl28
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - MediaInfo$$serializer.euyj("evgf", euyg(int ), (int)39));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -852577784: {
                    v4 = MediaInfo$$serializer.euyj("evgg", euyg(int ), (int)40);
                    continue block38;
                }
                case 530113069: {
                    v4 = MediaInfo$$serializer.euyj("evgh", euyg(int ), (int)41);
                    continue block38;
                }
                case 719001205: {
                    v4 = MediaInfo$$serializer.euyj("evgj", euyg(int ), (int)42);
                    continue block38;
                }
                case 1014778279: {
                    break block38;
                }
            }
            break;
        }
        var5_5 = MediaInfo$$serializer.a;
        if (var7_3) {
            throw null;
lbl43:
            // 8 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evgk", euyg(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == MediaInfo$$serializer.euyj("evgl", euyl(int ), (int)145)) break;
            v5 /* !! */  = (long)MediaInfo$$serializer.euyj("evgm", euyl(int ), (int)146);
        }
        Intrinsics.checkNotNullParameter((Object)var1_1, (String)"encoder");
        if (var5_5) ** GOTO lbl43
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evgn", euyg(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == MediaInfo$$serializer.euyj("evgo", euyl(int ), (int)147)) break;
            v6 /* !! */  = (long)MediaInfo$$serializer.euyj("evgp", euyl(int ), (int)148);
        }
        Intrinsics.checkNotNullParameter((Object)var2_2, (String)"value");
        if (var5_5) ** GOTO lbl43
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl43
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evgq", euyg(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == MediaInfo$$serializer.euyj("evgr", euyl(int ), (int)149)) break;
                    v7 /* !! */  = (long)MediaInfo$$serializer.euyj("evgs", euyl(int ), (int)150);
                }
                var3_6 = this.getDescriptor();
                if (var5_5) ** GOTO lbl43
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = MediaInfo$$serializer.lg - MediaInfo$$serializer.euyj("evgt", euyg(int ), (int)46)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == MediaInfo$$serializer.euyj("evgu", euyl(int ), (int)151)) break;
                    v8 /* !! */  = (long)MediaInfo$$serializer.euyj("evgv", euyl(int ), (int)152);
                }
                var4_7 = var1_1.beginStructure(var3_6);
                if (var5_5) ** GOTO lbl43
                v9 /* !! */  = MediaInfo$$serializer.lg;
                if (true) ** GOTO lbl82
                block44: while (true) {
                    v9 /* !! */  = (long)(v10 - MediaInfo$$serializer.euyj("evgw", euyg(int ), (int)47));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1702585636: {
                            v10 = MediaInfo$$serializer.euyj("evgx", euyg(int ), (int)48);
                            continue block44;
                        }
                        case 1014778279: {
                            break block44;
                        }
                        case 1416165366: {
                            v10 = MediaInfo$$serializer.euyj("evgy", euyg(int ), (int)49);
                            continue block44;
                        }
                    }
                    break;
                }
                MediaInfo.write$Self$MediaPlayerInfo(var2_2, var4_7, var3_6);
                if (var5_5) ** GOTO lbl43
                v11 /* !! */  = MediaInfo$$serializer.lg;
                if (true) ** GOTO lbl97
                block45: while (true) {
                    v11 /* !! */  = (long)(v12 - MediaInfo$$serializer.euyj("evgz", euyg(int ), (int)50));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -271600178: {
                            v12 = MediaInfo$$serializer.euyj("evha", euyg(int ), (int)51);
                            continue block45;
                        }
                        case 1014778279: {
                            break block45;
                        }
                        case 1225176916: {
                            v12 = MediaInfo$$serializer.euyj("evhb", euyg(int ), (int)52);
                            continue block45;
                        }
                        case 1284011554: {
                            v12 = MediaInfo$$serializer.euyj("evhd", euyg(int ), (int)53);
                            continue block45;
                        }
                    }
                    break;
                }
                var4_7.endStructure(var3_6);
                if (!var5_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhe", euyl(int ), (int)153);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhf", euyl(int ), (int)154);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl147
                    break;
                }
            }
lbl124:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhg", euyl(int ), (int)155);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl129:
            // 2 sources

            case 3: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhh", euyl(int ), (int)156);
                if (var7_3) {
                    throw null;
                }
            }
            case 4: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhi", euyl(int ), (int)157);
                if (!var7_3) ** GOTO lbl124
                throw null;
            }
lbl137:
            // 2 sources

            case 5: {
                do {
                    var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhj", euyl(int ), (int)158);
                } while (!var7_3);
                throw null;
            }
lbl142:
            // 2 sources

            case 6: {
                do {
                    var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhk", euyl(int ), (int)159);
                } while (!var7_3);
                throw null;
            }
lbl147:
            // 2 sources

            case 7: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhl", euyl(int ), (int)160);
                if (!var7_3) ** GOTO lbl137
                throw null;
            }
            case 8: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhm", euyl(int ), (int)161);
                if (!var7_3) break;
                throw null;
            }
lbl155:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evhn", euyl(int ), (int)162);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
            case 10: 
        }
        var6_4 /* !! */  = (int)MediaInfo$$serializer.euyj("evho", euyl(int ), (int)163);
        ** while (!var7_3)
lbl162:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void evjd() {
        MediaInfo$$serializer.euym[0] = 1001766260;
        MediaInfo$$serializer.euym[1] = 644733745;
        MediaInfo$$serializer.euym[2] = -861198916;
        MediaInfo$$serializer.euym[3] = -912467895;
        MediaInfo$$serializer.euym[4] = -1314782324;
        MediaInfo$$serializer.euym[5] = -1192911812;
        MediaInfo$$serializer.euym[6] = 1472252997;
        MediaInfo$$serializer.euym[7] = 596599325;
        MediaInfo$$serializer.euym[8] = -1065526052;
        MediaInfo$$serializer.euym[9] = -551873488;
        MediaInfo$$serializer.euym[10] = -229609337;
        MediaInfo$$serializer.euym[11] = -373534631;
        MediaInfo$$serializer.euym[12] = 1459245161;
        MediaInfo$$serializer.euym[13] = 1390396814;
        MediaInfo$$serializer.euym[14] = -807850743;
        MediaInfo$$serializer.euym[15] = 1818601507;
        MediaInfo$$serializer.euym[16] = -1368746208;
        MediaInfo$$serializer.euym[17] = -1941820287;
        MediaInfo$$serializer.euym[18] = 1016139461;
        MediaInfo$$serializer.euym[19] = 1950027493;
        MediaInfo$$serializer.euym[20] = 1803588228;
        MediaInfo$$serializer.euym[21] = 1380903140;
        MediaInfo$$serializer.euym[22] = -1731386699;
        MediaInfo$$serializer.euym[23] = -1205087960;
        MediaInfo$$serializer.euym[24] = -1697483598;
        MediaInfo$$serializer.euym[25] = -879512247;
        MediaInfo$$serializer.euym[26] = 1072609137;
        MediaInfo$$serializer.euym[27] = -190424849;
        MediaInfo$$serializer.euym[28] = 350309236;
        MediaInfo$$serializer.euym[29] = -1003481767;
        MediaInfo$$serializer.euym[30] = 1008052654;
        MediaInfo$$serializer.euym[31] = 1786281990;
        MediaInfo$$serializer.euym[32] = -2124711452;
        MediaInfo$$serializer.euym[33] = 54572413;
        MediaInfo$$serializer.euym[34] = -2055741693;
        MediaInfo$$serializer.euym[35] = 2792332;
        MediaInfo$$serializer.euym[36] = 1862234853;
        MediaInfo$$serializer.euym[37] = -862593383;
        MediaInfo$$serializer.euym[38] = 801031302;
        MediaInfo$$serializer.euym[39] = -2110997809;
        MediaInfo$$serializer.euym[40] = -1259608927;
        MediaInfo$$serializer.euym[41] = 517418084;
        MediaInfo$$serializer.euym[42] = 644141835;
        MediaInfo$$serializer.euym[43] = -932126636;
        MediaInfo$$serializer.euym[44] = -1314330230;
        MediaInfo$$serializer.euym[45] = 1570486490;
        MediaInfo$$serializer.euym[46] = -1439787152;
        MediaInfo$$serializer.euym[47] = -1813286565;
        MediaInfo$$serializer.euym[48] = 1546092733;
        MediaInfo$$serializer.euym[49] = 255210178;
        MediaInfo$$serializer.euym[50] = 1830516830;
        MediaInfo$$serializer.euym[51] = 1520214849;
        MediaInfo$$serializer.euym[52] = 321005454;
        MediaInfo$$serializer.euym[53] = 937840337;
        MediaInfo$$serializer.euym[54] = -1865929573;
        MediaInfo$$serializer.euym[55] = -865426852;
        MediaInfo$$serializer.euym[56] = 1528380823;
        MediaInfo$$serializer.euym[57] = -1793560262;
        MediaInfo$$serializer.euym[58] = -103513022;
        MediaInfo$$serializer.euym[59] = -563033301;
        MediaInfo$$serializer.euym[60] = -893744541;
        MediaInfo$$serializer.euym[61] = 1649268153;
        MediaInfo$$serializer.euym[62] = 710446377;
        MediaInfo$$serializer.euym[63] = 123720223;
        MediaInfo$$serializer.euym[64] = 1252958795;
        MediaInfo$$serializer.euym[65] = -1779222202;
        MediaInfo$$serializer.euym[66] = -886991899;
        MediaInfo$$serializer.euym[67] = 964707570;
        MediaInfo$$serializer.euym[68] = -889073753;
        MediaInfo$$serializer.euym[69] = 1089212660;
        MediaInfo$$serializer.euym[70] = 39306730;
        MediaInfo$$serializer.euym[71] = 1786256714;
        MediaInfo$$serializer.euym[72] = -689459486;
        MediaInfo$$serializer.euym[73] = -371120356;
        MediaInfo$$serializer.euym[74] = 1615687730;
        MediaInfo$$serializer.euym[75] = -131507131;
        MediaInfo$$serializer.euym[76] = -139829384;
        MediaInfo$$serializer.euym[77] = 1243328798;
        MediaInfo$$serializer.euym[78] = -787653430;
        MediaInfo$$serializer.euym[79] = 82501817;
        MediaInfo$$serializer.euym[80] = -1723830009;
        MediaInfo$$serializer.euym[81] = 1018377257;
        MediaInfo$$serializer.euym[82] = 378672814;
        MediaInfo$$serializer.euym[83] = -1413747649;
        MediaInfo$$serializer.euym[84] = 756215228;
        MediaInfo$$serializer.euym[85] = -966408584;
        MediaInfo$$serializer.euym[86] = -35121989;
        MediaInfo$$serializer.euym[87] = 1915096022;
        MediaInfo$$serializer.euym[88] = 1009722755;
        MediaInfo$$serializer.euym[89] = 1909951792;
        MediaInfo$$serializer.euym[90] = -719778027;
        MediaInfo$$serializer.euym[91] = 1485330634;
        MediaInfo$$serializer.euym[92] = 2142643076;
        MediaInfo$$serializer.euym[93] = 2054126839;
        MediaInfo$$serializer.euym[94] = 819923336;
        MediaInfo$$serializer.euym[95] = 1170359043;
        MediaInfo$$serializer.euym[96] = -1760171864;
        MediaInfo$$serializer.euym[97] = 1691662898;
        MediaInfo$$serializer.euym[98] = 604097982;
        MediaInfo$$serializer.euym[99] = -1478271970;
    }
}

