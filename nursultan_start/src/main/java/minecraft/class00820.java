/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;

public final class class00820
extends Record {
    private final Optional<Boolean> isOnGround;
    private final Optional<Boolean> isOnFire;
    private final Optional<Boolean> isCrouching;
    private final Optional<Boolean> isSprinting;
    private final Optional<Boolean> isSwimming;
    private final Optional<Boolean> isFlying;
    private final Optional<Boolean> isBaby;
    private final Optional<Boolean> isInWater;
    private final Optional<Boolean> isFallFlying;
    public static final Codec<class00820> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("is_on_ground").forGetter(class00820::N), (App)Codec.BOOL.optionalFieldOf("is_on_fire").forGetter(class00820::y), (App)Codec.BOOL.optionalFieldOf("is_sneaking").forGetter(class00820::L), (App)Codec.BOOL.optionalFieldOf("is_sprinting").forGetter(class00820::u), (App)Codec.BOOL.optionalFieldOf("is_swimming").forGetter(class00820::i), (App)Codec.BOOL.optionalFieldOf("is_flying").forGetter(class00820::R), (App)Codec.BOOL.optionalFieldOf("is_baby").forGetter(class00820::M), (App)Codec.BOOL.optionalFieldOf("is_in_water").forGetter(class00820::B), (App)Codec.BOOL.optionalFieldOf("is_fall_flying").forGetter(class00820::Z)).apply(instance, class00820::new));

    public Optional<Boolean> L() {
        return this.isCrouching;
    }

    public Optional<Boolean> M() {
        return this.isBaby;
    }

    public class00820(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, Optional<Boolean> optional7, Optional<Boolean> optional8, Optional<Boolean> optional9) {
        this.isOnGround = optional;
        this.isOnFire = optional2;
        this.isCrouching = optional3;
        this.isSprinting = optional4;
        this.isSwimming = optional5;
        this.isFlying = optional6;
        this.isBaby = optional7;
        this.isInWater = optional8;
        this.isFallFlying = optional9;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00820.class, "isOnGround;isOnFire;isCrouching;isSprinting;isSwimming;isFlying;isBaby;isInWater;isFallFlying", "isOnGround", "isOnFire", "isCrouching", "isSprinting", "isSwimming", "isFlying", "isBaby", "isInWater", "isFallFlying"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00820.class, "isOnGround;isOnFire;isCrouching;isSprinting;isSwimming;isFlying;isBaby;isInWater;isFallFlying", "isOnGround", "isOnFire", "isCrouching", "isSprinting", "isSwimming", "isFlying", "isBaby", "isInWater", "isFallFlying"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00820.class, "isOnGround;isOnFire;isCrouching;isSprinting;isSwimming;isFlying;isBaby;isInWater;isFallFlying", "isOnGround", "isOnFire", "isCrouching", "isSprinting", "isSwimming", "isFlying", "isBaby", "isInWater", "isFallFlying"}, this);
    }

    public Optional<Boolean> B() {
        return this.isInWater;
    }

    public Optional<Boolean> Z() {
        return this.isFallFlying;
    }

    public Optional<Boolean> i() {
        return this.isSwimming;
    }

    public Optional<Boolean> u() {
        return this.isSprinting;
    }

    public Optional<Boolean> y() {
        return this.isOnFire;
    }

    public Optional<Boolean> N() {
        return this.isOnGround;
    }

    public boolean N(class07049 class070492) {
        class07438 class074382;
        class07438 class074383;
        if (this.isOnGround.isPresent() && class070492.method_24828() != this.isOnGround.get().booleanValue()) {
            return false;
        }
        if (this.isOnFire.isPresent() && class070492.method_5809() != this.isOnFire.get().booleanValue()) {
            return false;
        }
        if (this.isCrouching.isPresent() && class070492.method_18276() != this.isCrouching.get().booleanValue()) {
            return false;
        }
        if (this.isSprinting.isPresent() && class070492.method_5624() != this.isSprinting.get().booleanValue()) {
            return false;
        }
        if (this.isSwimming.isPresent() && class070492.method_5681() != this.isSwimming.get().booleanValue()) {
            return false;
        }
        if (this.isFlying.isPresent()) {
            class07438 class074384;
            boolean bl;
            boolean bl2 = bl = class070492 instanceof class07438 && ((class074384 = (class07438)class070492).method_6128() || class074384 instanceof class08036 && ((class08036)class074384).method_31549().y);
            if (bl != this.isFlying.get()) {
                return false;
            }
        }
        if (this.isInWater.isPresent() && class070492.method_5799() != this.isInWater.get().booleanValue()) {
            return false;
        }
        if (this.isFallFlying.isPresent() && class070492 instanceof class07438 && (class074383 = (class07438)class070492).method_6128() != this.isFallFlying.get().booleanValue()) {
            return false;
        }
        return !this.isBaby.isPresent() || !(class070492 instanceof class07438) || (class074382 = (class07438)class070492).method_6109() == this.isBaby.get().booleanValue();
    }

    public Optional<Boolean> R() {
        return this.isFlying;
    }
}

