/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02083
 *  minecraft.class03055
 *  minecraft.class03079
 *  minecraft.class03748
 *  minecraft.class04469
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class02083;
import minecraft.class03055;
import minecraft.class03079;
import minecraft.class03748;
import minecraft.class03934;
import minecraft.class03962;
import minecraft.class04469;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public final class class03926
extends Record {
    private final class02083 link;
    private final @Nullable class04469 signature;
    private final class03079 signedBody;
    private final @Nullable class00392 unsignedContent;
    private final class03055 filterMask;
    public static final MapCodec<class03926> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02083.N.fieldOf("link").forGetter(class03926::U), (App)((Codec)class04469.y_0).optionalFieldOf("signature").forGetter(class039262 -> Optional.ofNullable(class039262.signature)), (App)class03079.N.forGetter(class03926::W), (App)class03748.N.optionalFieldOf("unsigned_content").forGetter(class039262 -> Optional.ofNullable(class039262.unsignedContent)), (App)class03055.N.optionalFieldOf("filter_mask", (Object)class03055.L).forGetter(class03926::P)).apply(instance, (class020832, optional, class030792, optional2, class030552) -> new class03926((class02083)class020832, optional.orElse(null), (class03079)class030792, optional2.orElse(null), (class03055)class030552)));
    private static final UUID Z = class07536.R;
    public static final Duration y = Duration.ofMinutes(5L);
    public static final Duration L = y.plus(Duration.ofMinutes(2L));

    public String L() {
        return this.signedBody.N();
    }

    public UUID M() {
        return this.link.L();
    }

    public class03055 P() {
        return this.filterMask;
    }

    public class03926(class02083 class020832, @Nullable class04469 class044692, class03079 class030792, @Nullable class00392 class003922, class03055 class030552) {
        this.link = class020832;
        this.signature = class044692;
        this.signedBody = class030792;
        this.unsignedContent = class003922;
        this.filterMask = class030552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03926.class, "link;signature;signedBody;unsignedContent;filterMask", "link", "signature", "signedBody", "unsignedContent", "filterMask"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03926.class, "link;signature;signedBody;unsignedContent;filterMask", "link", "signature", "signedBody", "unsignedContent", "filterMask"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03926.class, "link;signature;signedBody;unsignedContent;filterMask", "link", "signature", "signedBody", "unsignedContent", "filterMask"}, this);
    }

    public boolean B() {
        return this.M().equals(Z);
    }

    public boolean Z() {
        return this.signature != null;
    }

    public Instant i() {
        return this.signedBody.y();
    }

    public @Nullable class00392 m() {
        return this.unsignedContent;
    }

    public class02083 U() {
        return this.link;
    }

    public boolean z() {
        return this.filterMask.y();
    }

    public class00392 u() {
        return Objects.requireNonNullElseGet(this.unsignedContent, () -> class00392.y((String)this.L()));
    }

    public class03926 y() {
        class03079 class030792 = class03079.N((String)this.L());
        class02083 class020832 = class02083.N((UUID)this.M());
        return new class03926(class020832, null, class030792, this.unsignedContent, this.filterMask);
    }

    public boolean y(Instant instant) {
        return instant.isAfter(this.i().plus(L));
    }

    public @Nullable class04469 E() {
        return this.signature;
    }

    public boolean N(UUID uUID) {
        return this.Z() && this.link.L().equals(uUID);
    }

    public static class03926 N(String string) {
        return class03926.N(Z, string);
    }

    public static class03926 N(UUID uUID, String string) {
        class03079 class030792 = class03079.N((String)string);
        class02083 class020832 = class02083.N((UUID)uUID);
        return new class03926(class020832, null, class030792, null, class03055.L);
    }

    public class03926 N() {
        if (this.unsignedContent != null) {
            return new class03926(this.link, this.signature, this.signedBody, null, this.filterMask);
        }
        return this;
    }

    public static void N(class03934 class039342, class02083 class020832, class03079 class030792) throws SignatureException {
        class039342.update(Ints.toByteArray((int)1));
        class020832.N(class039342);
        class030792.N(class039342);
    }

    public class03926 N(class03055 class030552) {
        if (this.filterMask.equals((Object)class030552)) {
            return this;
        }
        return new class03926(this.link, this.signature, this.signedBody, this.unsignedContent, class030552);
    }

    public boolean N(class03962 class039622) {
        return this.signature != null && this.signature.N(class039622, (class03934 class039342) -> class03926.N(class039342, this.link, this.signedBody));
    }

    public boolean N(Instant instant) {
        return instant.isAfter(this.i().plus(y));
    }

    public class03926 N(boolean bl) {
        return this.N(bl ? this.filterMask : class03055.L);
    }

    public class03926 N(class00392 class003922) {
        class00392 class003923 = !class003922.equals((Object)class00392.y((String)this.L())) ? class003922 : null;
        return new class03926(this.link, this.signature, this.signedBody, class003923, this.filterMask);
    }

    public static String N(class03926 class039262) {
        return "'" + class039262.signedBody.N() + "' @ " + String.valueOf(class039262.signedBody.y()) + "\n - From: " + String.valueOf(class039262.link.L()) + "/" + String.valueOf(class039262.link.u()) + ", message #" + class039262.link.y() + "\n - Salt: " + class039262.signedBody.L() + "\n - Signature: " + class04469.N((class04469)class039262.signature) + "\n - Last Seen: [\n" + class039262.signedBody.u().y().stream().map(class044692 -> "     " + class04469.N((class04469)class044692) + "\n").collect(Collectors.joining()) + " ]\n";
    }

    public class03079 W() {
        return this.signedBody;
    }

    public long R() {
        return this.signedBody.L();
    }
}

