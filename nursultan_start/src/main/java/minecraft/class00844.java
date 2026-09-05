/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01425
 *  minecraft.class02055
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07310
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class02055;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07310;
import org.jspecify.annotations.Nullable;

public final class class00844
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final List<class05196> victims;
    private final class00836 uniqueEntityTypes;
    private final Optional<class00845> firedFromWeapon;
    public static final Codec<class00844> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00844::N), (App)class00821.y.listOf().optionalFieldOf("victims", List.of()).forGetter(class00844::y), (App)class00836.u.optionalFieldOf("unique_entity_types", (Object)class00836.L).forGetter(class00844::L), (App)class00845.N.optionalFieldOf("fired_from_weapon").forGetter(class00844::u)).apply(instance, class00844::new));

    public class00836 L() {
        return this.uniqueEntityTypes;
    }

    public class00844(Optional<class05196> optional, List<class05196> list, class00836 class008362, Optional<class00845> optional2) {
        this.player = optional;
        this.victims = list;
        this.uniqueEntityTypes = class008362;
        this.firedFromWeapon = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00844.class, "player;victims;uniqueEntityTypes;firedFromWeapon", "player", "victims", "uniqueEntityTypes", "firedFromWeapon"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00844.class, "player;victims;uniqueEntityTypes;firedFromWeapon", "player", "victims", "uniqueEntityTypes", "firedFromWeapon"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00844.class, "player;victims;uniqueEntityTypes;firedFromWeapon", "player", "victims", "uniqueEntityTypes", "firedFromWeapon"}, this);
    }

    public Optional<class00845> u() {
        return this.firedFromWeapon;
    }

    public List<class05196> y() {
        return this.victims;
    }

    public static class06915<class00844> N(class02055<class06581> class020552, class00810 ... class00810Array) {
        return class06912.q.N((class06516)new class00844(Optional.empty(), class00821.N(class00810Array), class00836.L, Optional.of(class00837.N().N(class020552, new class07310[]{class06570.dw}).y())));
    }

    public boolean N(Collection<class05908> collection, int n, @Nullable class06584 class065842) {
        if (this.firedFromWeapon.isPresent() && (class065842 == null || !this.firedFromWeapon.get().test(class065842))) {
            return false;
        }
        if (!this.victims.isEmpty()) {
            ArrayList arrayList = Lists.newArrayList(collection);
            for (class05196 class051962 : this.victims) {
                boolean bl = false;
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    class05908 class059082 = (class05908)iterator.next();
                    if (!class051962.N(class059082)) continue;
                    iterator.remove();
                    bl = true;
                    break;
                }
                if (bl) continue;
                return false;
            }
        }
        return this.uniqueEntityTypes.u(n);
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00844> N(class02055<class06581> class020552, class00836 class008362) {
        return class06912.q.N((class06516)new class00844(Optional.empty(), List.of(), class008362, Optional.of(class00837.N().N(class020552, new class07310[]{class06570.dw}).y())));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.victims, "victims");
    }
}

