/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06338;

final class class07069
extends Record {
    private final int amplifier;
    private final int duration;
    private final boolean ambient;
    private final boolean showParticles;
    private final boolean showIcon;
    private final Optional<class07069> hiddenEffect;
    public static final MapCodec<class07069> N = MapCodec.recursive((String)"MobEffectInstance.Details", codec -> RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.s.optionalFieldOf("amplifier", (Object)0).forGetter(class07069::N), (App)Codec.INT.optionalFieldOf("duration", (Object)0).forGetter(class07069::y), (App)Codec.BOOL.optionalFieldOf("ambient", (Object)false).forGetter(class07069::L), (App)Codec.BOOL.optionalFieldOf("show_particles", (Object)true).forGetter(class07069::u), (App)Codec.BOOL.optionalFieldOf("show_icon").forGetter(class070692 -> Optional.of(class070692.i())), (App)codec.optionalFieldOf("hidden_effect").forGetter(class07069::R)).apply((Applicative)instance, class07069::N)));
    public static final class02362<ByteBuf, class07069> y = class02362.N_32(class023622 -> class02362.N((class02362)class02389.B, class07069::N, (class02362)class02389.B, class07069::y, (class02362)class02389.y, class07069::L, (class02362)class02389.y, class07069::u, (class02362)class02389.y, class07069::i, (class02362)class023622.N_33(class02389::N), class07069::R, class07069::new));

    public boolean L() {
        return this.ambient;
    }

    class07069(int n, int n2, boolean bl, boolean bl2, boolean bl3, Optional<class07069> optional) {
        this.amplifier = n;
        this.duration = n2;
        this.ambient = bl;
        this.showParticles = bl2;
        this.showIcon = bl3;
        this.hiddenEffect = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07069.class, "amplifier;duration;ambient;showParticles;showIcon;hiddenEffect", "amplifier", "duration", "ambient", "showParticles", "showIcon", "hiddenEffect"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07069.class, "amplifier;duration;ambient;showParticles;showIcon;hiddenEffect", "amplifier", "duration", "ambient", "showParticles", "showIcon", "hiddenEffect"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07069.class, "amplifier;duration;ambient;showParticles;showIcon;hiddenEffect", "amplifier", "duration", "ambient", "showParticles", "showIcon", "hiddenEffect"}, this);
    }

    public boolean i() {
        return this.showIcon;
    }

    public boolean u() {
        return this.showParticles;
    }

    public int y() {
        return this.duration;
    }

    private static class07069 N(int n, int n2, boolean bl, boolean bl2, Optional<Boolean> optional, Optional<class07069> optional2) {
        return new class07069(n, n2, bl, bl2, optional.orElse(bl2), optional2);
    }

    public int N() {
        return this.amplifier;
    }

    public Optional<class07069> R() {
        return this.hiddenEffect;
    }
}

