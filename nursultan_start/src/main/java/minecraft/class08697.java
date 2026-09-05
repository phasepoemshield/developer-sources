/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class08687;

public final class class08697
extends Record {
    private final Optional<Boolean> forward;
    private final Optional<Boolean> backward;
    private final Optional<Boolean> left;
    private final Optional<Boolean> right;
    private final Optional<Boolean> jump;
    private final Optional<Boolean> sneak;
    private final Optional<Boolean> sprint;
    public static final Codec<class08697> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("forward").forGetter(class08697::N), (App)Codec.BOOL.optionalFieldOf("backward").forGetter(class08697::y), (App)Codec.BOOL.optionalFieldOf("left").forGetter(class08697::L), (App)Codec.BOOL.optionalFieldOf("right").forGetter(class08697::u), (App)Codec.BOOL.optionalFieldOf("jump").forGetter(class08697::i), (App)Codec.BOOL.optionalFieldOf("sneak").forGetter(class08697::R), (App)Codec.BOOL.optionalFieldOf("sprint").forGetter(class08697::M)).apply(instance, class08697::new));

    public Optional<Boolean> L() {
        return this.left;
    }

    public Optional<Boolean> M() {
        return this.sprint;
    }

    public class08697(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, Optional<Boolean> optional7) {
        this.forward = optional;
        this.backward = optional2;
        this.left = optional3;
        this.right = optional4;
        this.jump = optional5;
        this.sneak = optional6;
        this.sprint = optional7;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08697.class, "forward;backward;left;right;jump;sneak;sprint", "forward", "backward", "left", "right", "jump", "sneak", "sprint"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08697.class, "forward;backward;left;right;jump;sneak;sprint", "forward", "backward", "left", "right", "jump", "sneak", "sprint"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08697.class, "forward;backward;left;right;jump;sneak;sprint", "forward", "backward", "left", "right", "jump", "sneak", "sprint"}, this);
    }

    public Optional<Boolean> i() {
        return this.jump;
    }

    public Optional<Boolean> u() {
        return this.right;
    }

    public Optional<Boolean> y() {
        return this.backward;
    }

    public boolean N(class08687 class086872) {
        return this.N(this.forward, class086872.N()) && this.N(this.backward, class086872.y()) && this.N(this.left, class086872.L()) && this.N(this.right, class086872.u()) && this.N(this.jump, class086872.i()) && this.N(this.sneak, class086872.R()) && this.N(this.sprint, class086872.M());
    }

    public Optional<Boolean> N() {
        return this.forward;
    }

    private boolean N(Optional<Boolean> optional, boolean bl) {
        return optional.map(bl2 -> bl2 == bl).orElse(true);
    }

    public Optional<Boolean> R() {
        return this.sneak;
    }
}

