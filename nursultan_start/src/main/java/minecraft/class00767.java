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
 *  minecraft.class04227
 *  minecraft.class05196
 *  minecraft.class05946
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04227;
import minecraft.class05196;
import minecraft.class05946;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07299;

public final class class00767
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05946<class07299>> from;
    private final Optional<class05946<class07299>> to;
    public static final Codec<class00767> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00767::N), (App)class05946.N((class05946)class04227.yg).optionalFieldOf("from").forGetter(class00767::L), (App)class05946.N((class05946)class04227.yg).optionalFieldOf("to").forGetter(class00767::u)).apply(instance, class00767::new));

    public Optional<class05946<class07299>> L() {
        return this.from;
    }

    public class00767(Optional<class05196> optional, Optional<class05946<class07299>> optional2, Optional<class05946<class07299>> optional3) {
        this.player = optional;
        this.from = optional2;
        this.to = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00767.class, "player;from;to", "player", "from", "to"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00767.class, "player;from;to", "player", "from", "to"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00767.class, "player;from;to", "player", "from", "to"}, this);
    }

    public Optional<class05946<class07299>> u() {
        return this.to;
    }

    public static class06915<class00767> y() {
        return class06912.G.N((class06516)new class00767(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public static class06915<class00767> y(class05946<class07299> class059462) {
        return class06912.G.N((class06516)new class00767(Optional.empty(), Optional.of(class059462), Optional.empty()));
    }

    public boolean y(class05946<class07299> class059462, class05946<class07299> class059463) {
        if (this.from.isPresent() && this.from.get() != class059462) {
            return false;
        }
        return !this.to.isPresent() || this.to.get() == class059463;
    }

    public static class06915<class00767> N(class05946<class07299> class059462) {
        return class06912.G.N((class06516)new class00767(Optional.empty(), Optional.empty(), Optional.of(class059462)));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00767> N(class05946<class07299> class059462, class05946<class07299> class059463) {
        return class06912.G.N((class06516)new class00767(Optional.empty(), Optional.of(class059462), Optional.of(class059463)));
    }
}

