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
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class00799
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final List<class05196> victims;
    public static final Codec<class00799> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00799::N), (App)class00821.y.listOf().optionalFieldOf("victims", List.of()).forGetter(class00799::y)).apply(instance, class00799::new));

    public class00799(Optional<class05196> optional, List<class05196> list) {
        this.player = optional;
        this.victims = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00799.class, "player;victims", "player", "victims"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00799.class, "player;victims", "player", "victims"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00799.class, "player;victims", "player", "victims"}, this);
    }

    public List<class05196> y() {
        return this.victims;
    }

    public static class06915<class00799> N(class00810 ... class00810Array) {
        return class06912.I.N((class06516)new class00799(Optional.empty(), class00821.N(class00810Array)));
    }

    public boolean N(Collection<? extends class05908> collection) {
        for (class05196 class051962 : this.victims) {
            boolean bl = false;
            for (class05908 class059082 : collection) {
                if (!class051962.N(class059082)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.victims, "victims");
    }
}

