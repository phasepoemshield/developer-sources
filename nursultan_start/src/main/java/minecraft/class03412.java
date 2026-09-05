/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03075
 *  minecraft.class03086
 *  minecraft.class03926
 *  minecraft.class06338
 *  minecraft.class06541
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class03075;
import minecraft.class03086;
import minecraft.class03387;
import minecraft.class03926;
import minecraft.class06338;
import minecraft.class06541;
import minecraft.class07536;

public final class class03412
extends Record
implements class03387 {
    private final GameProfile profile;
    private final class03926 message;
    private final class03086 trustLevel;
    public static final MapCodec<class03412> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.V.fieldOf("profile").forGetter(class03412::R), (App)class03926.N.forGetter(class03412::M), (App)class03086.field_40801.optionalFieldOf("trust_level", (Object)class03086.field_39780).forGetter(class03412::B)).apply(instance, class03412::new));
    private static final DateTimeFormatter R = class07536.N((FormatStyle)FormatStyle.SHORT);

    public class00392 L() {
        class00392 class003922 = this.Z();
        return class00392.N((String)"gui.chatSelection.heading", (Object[])new Object[]{this.profile.name(), class003922});
    }

    public class03926 M() {
        return this.message;
    }

    public class03412(GameProfile gameProfile, class03926 class039262, class03086 class030862) {
        this.profile = gameProfile;
        this.message = class039262;
        this.trustLevel = class030862;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03412.class, "profile;message;trustLevel", "profile", "message", "trustLevel"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03412.class, "profile;message;trustLevel", "profile", "message", "trustLevel"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03412.class, "profile;message;trustLevel", "profile", "message", "trustLevel"}, this);
    }

    public class03086 B() {
        return this.trustLevel;
    }

    private class00392 Z() {
        return class00392.y((String)ZonedDateTime.ofInstant(this.message.i(), ZoneId.systemDefault()).format(R)).N(new class06541[]{class06541.field_1056, class06541.field_1080});
    }

    public class03075 i() {
        return class03075.field_40804;
    }

    public UUID u() {
        return this.profile.id();
    }

    @Override
    public class00392 y() {
        class00392 class003922 = this.N();
        class00392 class003923 = this.Z();
        return class00392.N((String)"gui.chatSelection.message.narrate", (Object[])new Object[]{this.profile.name(), class003922, class003923});
    }

    @Override
    public boolean N(UUID uUID) {
        return this.message.N(uUID);
    }

    @Override
    public class00392 N() {
        if (!this.message.P().N()) {
            class00392 class003922 = this.message.P().y(this.message.L());
            return class003922 != null ? class003922 : class00392.i();
        }
        return this.message.u();
    }

    public GameProfile R() {
        return this.profile;
    }
}

