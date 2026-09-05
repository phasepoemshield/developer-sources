/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class08689;
import minecraft.class08719;

public final class class08706
extends Record {
    private final class01894 textureId;
    private final Optional<class08689> dyeable;
    private final boolean usePlayerTexture;
    public static final Codec<class08706> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("texture").forGetter(class08706::N), (App)class08689.N.optionalFieldOf("dyeable").forGetter(class08706::y), (App)Codec.BOOL.optionalFieldOf("use_player_texture", (Object)false).forGetter(class08706::L)).apply(instance, class08706::new));

    public boolean L() {
        return this.usePlayerTexture;
    }

    public class08706(class01894 class018942) {
        this(class018942, Optional.empty(), false);
    }

    public class08706(class01894 class018942, Optional<class08689> optional, boolean bl) {
        this.textureId = class018942;
        this.dyeable = optional;
        this.usePlayerTexture = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08706.class, "textureId;dyeable;usePlayerTexture", "textureId", "dyeable", "usePlayerTexture"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08706.class, "textureId;dyeable;usePlayerTexture", "textureId", "dyeable", "usePlayerTexture"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08706.class, "textureId;dyeable;usePlayerTexture", "textureId", "dyeable", "usePlayerTexture"}, this);
    }

    public Optional<class08689> y() {
        return this.dyeable;
    }

    public static class08706 y(class01894 class018942, boolean bl) {
        return new class08706(class018942, bl ? Optional.of(new class08689(Optional.empty())) : Optional.empty(), false);
    }

    public class01894 N(class08719 class087192) {
        return this.textureId.N(string -> "textures/entity/equipment/" + class087192.method_15434() + "/" + string + ".png");
    }

    public static class08706 N(class01894 class018942, boolean bl) {
        return new class08706(class018942, bl ? Optional.of(new class08689(Optional.of(-6265536))) : Optional.empty(), false);
    }

    public class01894 N() {
        return this.textureId;
    }
}

