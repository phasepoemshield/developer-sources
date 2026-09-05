/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04770
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00759;
import minecraft.class00816;
import minecraft.class00821;
import minecraft.class04770;
import minecraft.class07072;

public final class class00798
extends Record {
    private final class00816 dealtDamage;
    private final class00816 takenDamage;
    private final Optional<class00821> sourceEntity;
    private final Optional<Boolean> blocked;
    private final Optional<class00759> type;
    public static final Codec<class00798> N = RecordCodecBuilder.create(instance -> instance.group((App)class00816.u.optionalFieldOf("dealt", (Object)class00816.L).forGetter(class00798::N), (App)class00816.u.optionalFieldOf("taken", (Object)class00816.L).forGetter(class00798::y), (App)class00821.N.optionalFieldOf("source_entity").forGetter(class00798::L), (App)Codec.BOOL.optionalFieldOf("blocked").forGetter(class00798::u), (App)class00759.N.optionalFieldOf("type").forGetter(class00798::i)).apply(instance, class00798::new));

    public Optional<class00821> L() {
        return this.sourceEntity;
    }

    public class00798(class00816 class008162, class00816 class008163, Optional<class00821> optional, Optional<Boolean> optional2, Optional<class00759> optional3) {
        this.dealtDamage = class008162;
        this.takenDamage = class008163;
        this.sourceEntity = optional;
        this.blocked = optional2;
        this.type = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00798.class, "dealtDamage;takenDamage;sourceEntity;blocked;type", "dealtDamage", "takenDamage", "sourceEntity", "blocked", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00798.class, "dealtDamage;takenDamage;sourceEntity;blocked;type", "dealtDamage", "takenDamage", "sourceEntity", "blocked", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00798.class, "dealtDamage;takenDamage;sourceEntity;blocked;type", "dealtDamage", "takenDamage", "sourceEntity", "blocked", "type"}, this);
    }

    public Optional<class00759> i() {
        return this.type;
    }

    public Optional<Boolean> u() {
        return this.blocked;
    }

    public class00816 y() {
        return this.takenDamage;
    }

    public boolean N(class04770 class047702, class07072 class070722, float f, float f2, boolean bl) {
        if (!this.dealtDamage.u(f)) {
            return false;
        }
        if (!this.takenDamage.u(f2)) {
            return false;
        }
        if (this.sourceEntity.isPresent() && !this.sourceEntity.get().N(class047702, class070722.u())) {
            return false;
        }
        if (this.blocked.isPresent() && this.blocked.get() != bl) {
            return false;
        }
        return !this.type.isPresent() || this.type.get().N(class047702, class070722);
    }

    public class00816 N() {
        return this.dealtDamage;
    }
}

