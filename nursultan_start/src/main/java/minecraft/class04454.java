/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data
 *  minecraft.class00667
 *  minecraft.class01222
 *  minecraft.class03962
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00667;
import minecraft.class01222;
import minecraft.class03962;
import minecraft.class06338;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class04454
implements IProfilePublicKey_Data {
    private Instant expiresAt;
    PublicKey key;
    private byte[] keySignature;
    private static final int i = 4096;
    public static final Codec<class04454> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.l.fieldOf("expires_at").forGetter(class04454::y), (App)class01222.R.fieldOf("key").forGetter(class04454::L), (App)class06338.d.fieldOf("signature_v2").forGetter(class04454::u)).apply(instance, class04454::new));
    private byte[] R;

    public PublicKey L() {
        return this.key;
    }

    public byte[] viafabricplus$getLegacyPublicKeySignature() {
        return this.R;
    }

    public class04454(Instant instant, PublicKey publicKey, byte[] byArray) {
        this.expiresAt = instant;
        this.key = publicKey;
        this.keySignature = byArray;
    }

    public class04454(class00667 class006672) {
        this(class006672.j(), class006672.v(), class006672.N(4096));
    }

    public boolean equals(Object object) {
        if (object instanceof class04454) {
            class04454 class044542 = (class04454)object;
            return this.expiresAt.equals(class044542.expiresAt) && this.key.equals(class044542.key) && Arrays.equals(this.keySignature, class044542.keySignature);
        }
        return false;
    }

    public final String toString() {
        return "class04454[expiresAt=" + Objects.toString(this.expiresAt) + ", key=" + Objects.toString(this.key) + ", keySignature=" + Objects.toString(this.keySignature) + "]";
    }

    public final int hashCode() {
        return ((0 * 31 + Objects.hashCode(this.expiresAt)) * 31 + Objects.hashCode(this.key)) * 31 + Objects.hashCode(this.keySignature);
    }

    public byte[] u() {
        return this.keySignature;
    }

    public Instant y() {
        return this.expiresAt;
    }

    public void N(class00667 class006672) {
        class006672.N(this.expiresAt);
        class006672.N(this.key);
        class006672.N(this.keySignature);
    }

    boolean N(class03962 class039622, UUID uUID) {
        return class039622.N(this.N(uUID), this.keySignature);
    }

    public boolean N() {
        return this.expiresAt.isBefore(Instant.now());
    }

    private byte[] N(UUID uUID) {
        byte[] byArray = this.key.getEncoded();
        byte[] byArray2 = new byte[24 + byArray.length];
        ByteBuffer.wrap(byArray2).order(ByteOrder.BIG_ENDIAN).putLong(uUID.getMostSignificantBits()).putLong(uUID.getLeastSignificantBits()).putLong(this.expiresAt.toEpochMilli()).put(byArray);
        return byArray2;
    }

    public boolean N(Duration duration) {
        return this.expiresAt.plus(duration).isBefore(Instant.now());
    }

    public void viafabricplus$setLegacyPublicKeySignature(byte[] byArray) {
        this.R = byArray;
    }
}

