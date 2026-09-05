/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00821
 *  minecraft.class00891
 *  minecraft.class01400
 *  minecraft.class01425
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00821;
import minecraft.class00891;
import minecraft.class01400;
import minecraft.class01425;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class05891
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class03556<class00891>> block;
    private final Optional<class01400> state;
    public static final Codec<class05891> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class05891::N), (App)class04206.i.b().optionalFieldOf("block").forGetter(class05891::y), (App)class01400.N.optionalFieldOf("state").forGetter(class05891::L)).apply(instance, class05891::new)).validate(class05891::N);

    public Optional<class01400> L() {
        return this.state;
    }

    public class05891(Optional<class05196> optional, Optional<class03556<class00891>> optional2, Optional<class01400> optional3) {
        this.player = optional;
        this.block = optional2;
        this.state = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05891.class, "player;block;state", "player", "block", "state"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05891.class, "player;block;state", "player", "block", "state"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05891.class, "player;block;state", "player", "block", "state"}, this);
    }

    public Optional<class03556<class00891>> y() {
        return this.block;
    }

    public boolean N(class00500 class005002) {
        if (this.block.isPresent() && !class005002.N(this.block.get())) {
            return false;
        }
        return !this.state.isPresent() || this.state.get().N(class005002);
    }

    public static class06915<class05891> N(class00891 class008912) {
        return class06912.e.N((class06516)new class05891(Optional.empty(), Optional.of(class008912.s()), Optional.empty()));
    }

    private static DataResult<class05891> N(class05891 class058912) {
        return class058912.block.flatMap(class035562 -> class058912.state.flatMap(class014002 -> class014002.N(((class00891)class035562.N()).E())).map(string -> DataResult.error(() -> "Block" + String.valueOf(class035562) + " has no property " + string))).orElseGet(() -> DataResult.success((Object)((Object)class058912)));
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

