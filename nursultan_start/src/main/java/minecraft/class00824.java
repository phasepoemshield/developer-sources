/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00717
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Optional;
import minecraft.class00717;
import minecraft.class00821;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07049;

public final class class00824
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00845> rod;
    private final Optional<class05196> entity;
    private final Optional<class00845> item;
    public static final Codec<class00824> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00824::N), (App)class00845.N.optionalFieldOf("rod").forGetter(class00824::y), (App)class00821.y.optionalFieldOf("entity").forGetter(class00824::L), (App)class00845.N.optionalFieldOf("item").forGetter(class00824::u)).apply(instance, class00824::new));

    public Optional<class05196> L() {
        return this.entity;
    }

    public class00824(Optional<class05196> optional, Optional<class00845> optional2, Optional<class05196> optional3, Optional<class00845> optional4) {
        this.player = optional;
        this.rod = optional2;
        this.entity = optional3;
        this.item = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00824.class, "player;rod;entity;item", "player", "rod", "entity", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00824.class, "player;rod;entity;item", "player", "rod", "entity", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00824.class, "player;rod;entity;item", "player", "rod", "entity", "item"}, this);
    }

    public Optional<class00845> u() {
        return this.item;
    }

    public Optional<class00845> y() {
        return this.rod;
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.entity, "entity");
    }

    public boolean N(class06584 class065842, class05908 class059082, Collection<class06584> collection) {
        if (this.rod.isPresent() && !this.rod.get().test(class065842)) {
            return false;
        }
        if (this.entity.isPresent() && !this.entity.get().N(class059082)) {
            return false;
        }
        if (this.item.isPresent()) {
            boolean bl = false;
            class07049 class070492 = (class07049)class059082.L(class06551.N);
            if (class070492 instanceof class00717) {
                class00717 class007172 = (class00717)class070492;
                if (this.item.get().test(class007172.N())) {
                    bl = true;
                }
            }
            for (class06584 class065843 : collection) {
                if (!this.item.get().test(class065843)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return false;
            }
        }
        return true;
    }

    public static class06915<class00824> N(Optional<class00845> optional, Optional<class00821> optional2, Optional<class00845> optional3) {
        return class06912.g.N((class06516)new class00824(Optional.empty(), optional, class00821.N(optional2), optional3));
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

