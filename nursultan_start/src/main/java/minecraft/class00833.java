/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00817;

public final class class00833
extends Record {
    final Optional<class00817> located;
    final Optional<class00817> steppingOn;
    final Optional<class00817> affectsMovement;
    public static final MapCodec<class00833> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00817.N.optionalFieldOf("location").forGetter(class00833::N), (App)class00817.N.optionalFieldOf("stepping_on").forGetter(class00833::y), (App)class00817.N.optionalFieldOf("movement_affected_by").forGetter(class00833::L)).apply(instance, class00833::new));

    public Optional<class00817> L() {
        return this.affectsMovement;
    }

    public class00833(Optional<class00817> optional, Optional<class00817> optional2, Optional<class00817> optional3) {
        this.located = optional;
        this.steppingOn = optional2;
        this.affectsMovement = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00833.class, "located;steppingOn;affectsMovement", "located", "steppingOn", "affectsMovement"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00833.class, "located;steppingOn;affectsMovement", "located", "steppingOn", "affectsMovement"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00833.class, "located;steppingOn;affectsMovement", "located", "steppingOn", "affectsMovement"}, this);
    }

    public Optional<class00817> y() {
        return this.steppingOn;
    }

    public Optional<class00817> N() {
        return this.located;
    }
}

