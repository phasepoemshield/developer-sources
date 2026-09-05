/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07055
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00836;
import minecraft.class07055;
import org.jspecify.annotations.Nullable;

public final class class00849
extends Record {
    private final class00836 amplifier;
    private final class00836 duration;
    private final Optional<Boolean> ambient;
    private final Optional<Boolean> visible;
    public static final Codec<class00849> N = RecordCodecBuilder.create(instance -> instance.group((App)class00836.u.optionalFieldOf("amplifier", (Object)class00836.L).forGetter(class00849::N), (App)class00836.u.optionalFieldOf("duration", (Object)class00836.L).forGetter(class00849::y), (App)Codec.BOOL.optionalFieldOf("ambient").forGetter(class00849::L), (App)Codec.BOOL.optionalFieldOf("visible").forGetter(class00849::u)).apply(instance, class00849::new));

    public Optional<Boolean> L() {
        return this.ambient;
    }

    public class00849() {
        this(class00836.L, class00836.L, Optional.empty(), Optional.empty());
    }

    public class00849(class00836 class008362, class00836 class008363, Optional<Boolean> optional, Optional<Boolean> optional2) {
        this.amplifier = class008362;
        this.duration = class008363;
        this.ambient = optional;
        this.visible = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00849.class, "amplifier;duration;ambient;visible", "amplifier", "duration", "ambient", "visible"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00849.class, "amplifier;duration;ambient;visible", "amplifier", "duration", "ambient", "visible"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00849.class, "amplifier;duration;ambient;visible", "amplifier", "duration", "ambient", "visible"}, this);
    }

    public Optional<Boolean> u() {
        return this.visible;
    }

    public class00836 y() {
        return this.duration;
    }

    public class00836 N() {
        return this.amplifier;
    }

    public boolean N(@Nullable class07055 class070552) {
        if (class070552 == null) {
            return false;
        }
        if (!this.amplifier.u(class070552.i())) {
            return false;
        }
        if (!this.duration.u(class070552.u())) {
            return false;
        }
        if (this.ambient.isPresent() && this.ambient.get().booleanValue() != class070552.R()) {
            return false;
        }
        return !this.visible.isPresent() || this.visible.get().booleanValue() == class070552.M();
    }
}

