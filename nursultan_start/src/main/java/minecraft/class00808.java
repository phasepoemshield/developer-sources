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
 *  minecraft.class02947
 *  minecraft.class04540
 *  minecraft.class07001
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00778;
import minecraft.class01894;
import minecraft.class02947;
import minecraft.class04540;
import minecraft.class07001;

public final class class00808
extends Record {
    private final class07001 entityToSpawn;
    private final Optional<class00778> customSpawnRules;
    private final Optional<class02947> equipment;
    public static final String N = "entity";
    public static final Codec<class00808> y = RecordCodecBuilder.create(instance -> instance.group((App)class07001.N.fieldOf(N).forGetter(class008082 -> class008082.entityToSpawn), (App)class00778.N.optionalFieldOf("custom_spawn_rules").forGetter(class008082 -> class008082.customSpawnRules), (App)class02947.y.optionalFieldOf("equipment").forGetter(class008082 -> class008082.equipment)).apply(instance, class00808::new));
    public static final Codec<class04540<class00808>> L = class04540.N(y);

    public Optional<class02947> L() {
        return this.equipment;
    }

    public class00808() {
        this(new class07001(), Optional.empty(), Optional.empty());
    }

    public class00808(class07001 class070012, Optional<class00778> optional, Optional<class02947> optional2) {
        Optional optional3 = class070012.N_15("id", class01894.N);
        if (optional3.isPresent()) {
            class070012.N("id", class01894.N, (Object)((class01894)optional3.get()));
        } else {
            class070012.b("id");
        }
        this.entityToSpawn = class070012;
        this.customSpawnRules = optional;
        this.equipment = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00808.class, "entityToSpawn;customSpawnRules;equipment", "entityToSpawn", "customSpawnRules", "equipment"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00808.class, "entityToSpawn;customSpawnRules;equipment", "entityToSpawn", "customSpawnRules", "equipment"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00808.class, "entityToSpawn;customSpawnRules;equipment", "entityToSpawn", "customSpawnRules", "equipment"}, this);
    }

    public Optional<class00778> i() {
        return this.customSpawnRules;
    }

    public class07001 u() {
        return this.entityToSpawn;
    }

    public Optional<class00778> y() {
        return this.customSpawnRules;
    }

    public class07001 N() {
        return this.entityToSpawn;
    }

    public Optional<class02947> R() {
        return this.equipment;
    }
}

