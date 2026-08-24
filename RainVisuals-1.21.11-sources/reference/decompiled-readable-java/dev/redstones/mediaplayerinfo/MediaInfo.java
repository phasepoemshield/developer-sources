/*
 * Decompiled with CFR 0.152.
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaInfo$;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BQ\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0010\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\fH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u00c6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b$\u0010\u0014J(\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u00c1\u0001\u00a2\u0006\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0014R\u001d\u00105\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b=\u0010\u0014\u00a8\u0006@"}, d2={"Ldev/redstones/mediaplayerinfo/MediaInfo;", "", "", "seen1", "", "title", "artist", "", "artworkPng", "", "position", "duration", "", "playing", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;[BJJZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;[BJJZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()[B", "component4", "()J", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;[BJJZ)Ldev/redstones/mediaplayerinfo/MediaInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$MediaPlayerInfo", "(Ldev/redstones/mediaplayerinfo/MediaInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getArtist", "Ljava/awt/image/BufferedImage;", "artwork$delegate", "Lkotlin/Lazy;", "getArtwork", "()Ljava/awt/image/BufferedImage;", "artwork", "[B", "getArtworkPng", "J", "getDuration", "Z", "getPlaying", "getPosition", "getTitle", "Companion", "$serializer", "MediaPlayerInfo"})
@Serializable
public final class MediaInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String artist;
    @NotNull
    private final byte[] artworkPng;
    private final long position;
    @NotNull
    private final String title;
    private final long duration;
    private final boolean playing;
    @NotNull
    private final Lazy artwork$delegate;

    @Nullable
    public final BufferedImage getArtwork() {
        Lazy lazy = this.artwork$delegate;
        return (BufferedImage)lazy.getValue();
    }

    @NotNull
    public final String getArtist() {
        return this.artist;
    }

    @NotNull
    public final String component2() {
        return this.artist;
    }

    public final long component4() {
        return this.position;
    }

    @NotNull
    public String toString() {
        return "MediaInfo(title='" + this.title + "', artist='" + this.artist + "', position=" + this.position + ", duration=" + this.duration + ", playing=" + this.playing + ")";
    }

    @NotNull
    public final byte[] getArtworkPng() {
        return this.artworkPng;
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Deprecated(message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}), level=DeprecationLevel.HIDDEN)
    public /* synthetic */ MediaInfo(int seen1, String title, String artist, byte[] artworkPng, long position, long duration, boolean playing, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (0x3F & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 63, $serializer.INSTANCE.getDescriptor());
        }
        this.title = title;
        this.artist = artist;
        this.artworkPng = artworkPng;
        this.position = position;
        this.duration = duration;
        this.playing = playing;
        this.artwork$delegate = LazyKt.lazy((Function0)new Function0<BufferedImage>(this){
            final /* synthetic */ MediaInfo this$0;
            {
                this.this$0 = $receiver;
                super(0);
            }

            @Override
            @Nullable
            public final BufferedImage invoke() {
                BufferedImage bufferedImage;
                System.currentTimeMillis();
                try {
                    bufferedImage = ImageIO.read(new ByteArrayInputStream(this.this$0.getArtworkPng()));
                }
                catch (Exception exception) {
                    bufferedImage = null;
                }
                return bufferedImage;
            }
        });
    }

    public final long component5() {
        return this.duration;
    }

    public final boolean component6() {
        return this.playing;
    }

    public int hashCode() {
        int result = this.title.hashCode();
        result = 31 * result + this.artist.hashCode();
        result = 31 * result + Arrays.hashCode(this.artworkPng);
        result = 31 * result + Long.hashCode(this.position);
        result = 31 * result + Long.hashCode(this.duration);
        result = 31 * result + Boolean.hashCode(this.playing);
        return result;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$MediaPlayerInfo(MediaInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        MediaInfo mediaInfo;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.artist);
        output.encodeSerializableElement(serialDesc, 2, ByteArraySerializer.INSTANCE, self.artworkPng);
        output.encodeLongElement(serialDesc, 3, self.position);
        output.encodeLongElement(serialDesc, 4, self.duration);
        output.encodeBooleanElement(serialDesc, 5, mediaInfo.playing);
    }

    @NotNull
    public final MediaInfo copy(@NotNull String title, @NotNull String artist, @NotNull byte[] artworkPng, long position, long duration, boolean playing) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(artworkPng, "artworkPng");
        return new MediaInfo(title, artist, artworkPng, position, duration, playing);
    }

    public static /* synthetic */ MediaInfo copy$default(MediaInfo mediaInfo, String string, String string2, byte[] byArray, long l, long l2, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            string = mediaInfo.title;
        }
        if ((n & 2) != 0) {
            string2 = mediaInfo.artist;
        }
        if ((n & 4) != 0) {
            byArray = mediaInfo.artworkPng;
        }
        if ((n & 8) != 0) {
            l = mediaInfo.position;
        }
        if ((n & 0x10) != 0) {
            l2 = mediaInfo.duration;
        }
        if ((n & 0x20) != 0) {
            bl = mediaInfo.playing;
        }
        return mediaInfo.copy(string, string2, byArray, l, l2, bl);
    }

    @NotNull
    public final byte[] component3() {
        return this.artworkPng;
    }

    public final long getPosition() {
        return this.position;
    }

    public final long getDuration() {
        return this.duration;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        Object object = other;
        if (!Intrinsics.areEqual(this.getClass(), object != null ? object.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type dev.redstones.mediaplayerinfo.MediaInfo");
        MediaInfo cfr_ignored_0 = (MediaInfo)other;
        if (!Intrinsics.areEqual(this.title, ((MediaInfo)other).title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.artist, ((MediaInfo)other).artist)) {
            return false;
        }
        if (!Arrays.equals(this.artworkPng, ((MediaInfo)other).artworkPng)) {
            return false;
        }
        if (this.position != ((MediaInfo)other).position) {
            return false;
        }
        if (this.duration != ((MediaInfo)other).duration) {
            return false;
        }
        if (this.playing != ((MediaInfo)other).playing) {
            return false;
        }
        return true;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public MediaInfo(@NotNull String title, @NotNull String artist, @NotNull byte[] artworkPng, long position, long duration, boolean playing) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(artworkPng, "artworkPng");
        this.title = title;
        this.artist = artist;
        this.artworkPng = artworkPng;
        this.position = position;
        this.duration = duration;
        this.playing = playing;
        this.artwork$delegate = LazyKt.lazy((Function0)new /* invalid duplicate definition of identical inner class */);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Ldev/redstones/mediaplayerinfo/MediaInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Ldev/redstones/mediaplayerinfo/MediaInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "MediaPlayerInfo"})
    public static final class Companion {
        @NotNull
        public final KSerializer<MediaInfo> serializer() {
            return $serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}

