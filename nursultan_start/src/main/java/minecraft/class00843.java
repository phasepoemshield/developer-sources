/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00142
 *  minecraft.class01425
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07310
 *  minecraft.class08044
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00142;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class00855;
import minecraft.class01425;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07310;
import minecraft.class08044;

public final class class00843
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class00855 slots;
    private final List<class00845> items;
    public static final Codec<class00843> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00843::N), (App)class00855.N.optionalFieldOf("slots", (Object)class00855.y).forGetter(class00843::y), (App)class00845.N.listOf().optionalFieldOf("items", List.of()).forGetter(class00843::L)).apply(instance, class00843::new));

    public List<class00845> L() {
        return this.items;
    }

    public class00843(Optional<class05196> optional, class00855 class008552, List<class00845> list) {
        this.player = optional;
        this.slots = class008552;
        this.items = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00843.class, "player;slots;items", "player", "slots", "items"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00843.class, "player;slots;items", "player", "slots", "items"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00843.class, "player;slots;items", "player", "slots", "items"}, this);
    }

    public class00855 y() {
        return this.slots;
    }

    public static class06915<class00843> N(class07310 ... class07310Array) {
        class00845[] class00845Array = new class00845[class07310Array.length];
        for (int i = 0; i < class07310Array.length; ++i) {
            class00845Array[i] = new class00845(Optional.of(class03543.N((class03556[])new class03556[]{class07310Array[i].B().i()})), class00836.L, class00142.N);
        }
        return class00843.N(class00845Array);
    }

    public static class06915<class00843> N(class00845 ... class00845Array) {
        return class06912.R.N((class06516)new class00843(Optional.empty(), class00855.y, List.of(class00845Array)));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class08044 class080442, class06584 class065842, int n, int n2, int n3) {
        if (!this.slots.N(n, n2, n3)) {
            return false;
        }
        if (this.items.isEmpty()) {
            return true;
        }
        if (this.items.size() == 1) {
            return !class065842.R() && this.items.get(0).test(class065842);
        }
        ObjectArrayList objectArrayList = new ObjectArrayList(this.items);
        int n4 = class080442.method_5439();
        for (int i = 0; i < n4; ++i) {
            if (objectArrayList.isEmpty()) {
                return true;
            }
            class06584 class065843 = class080442.method_5438(i);
            if (class065843.R()) continue;
            objectArrayList.removeIf(class008452 -> class008452.test(class065843));
        }
        return objectArrayList.isEmpty();
    }

    public static class06915<class00843> N(class00837 ... class00837Array) {
        return class00843.N((class00845[])Stream.of(class00837Array).map(class00837::y).toArray(class00845[]::new));
    }
}

