/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class04770
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00814;
import minecraft.class00821;
import minecraft.class00834;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class04770;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class00806
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00834> effects;
    private final Optional<class05196> source;
    public static final Codec<class00806> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00806::N), (App)class00834.N.optionalFieldOf("effects").forGetter(class00806::y), (App)class00821.y.optionalFieldOf("source").forGetter(class00806::L)).apply(instance, class00806::new));

    public Optional<class05196> L() {
        return this.source;
    }

    public class00806(Optional<class05196> optional, Optional<class00834> optional2, Optional<class05196> optional3) {
        this.player = optional;
        this.effects = optional2;
        this.source = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00806.class, "player;effects;source", "player", "effects", "source"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00806.class, "player;effects;source", "player", "effects", "source"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00806.class, "player;effects;source", "player", "effects", "source"}, this);
    }

    public Optional<class00834> y() {
        return this.effects;
    }

    public boolean N(class04770 class047702, @Nullable class05908 class059082) {
        if (this.effects.isPresent() && !this.effects.get().N((class07438)class047702)) {
            return false;
        }
        return !this.source.isPresent() || class059082 != null && this.source.get().N(class059082);
    }

    public static class06915<class00806> N(class00814 class008142) {
        return class06912.Y.N((class06516)new class00806(Optional.empty(), class008142.y(), Optional.empty()));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00806> N(class00810 class008102) {
        return class06912.Y.N((class06516)new class00806(Optional.empty(), Optional.empty(), Optional.of(class00821.N(class008102.y()))));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.source, "source");
    }
}

