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
 *  minecraft.class04488
 *  minecraft.class04514
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07310
 *  minecraft.class07529
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class04488;
import minecraft.class04514;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07310;
import minecraft.class07529;

public final class class02281
extends Record {
    private final class05946<class05074> lootTable;
    private final double activationRange;
    private final double deactivationRange;
    private final class06584 keyItem;
    private final Optional<class05946<class05074>> overrideLootTableToDisplay;
    private final class04514 playerDetector;
    private final class04488 entitySelector;
    static final String N = "config";
    static class02281 y = new class02281();
    static Codec<class02281> L = RecordCodecBuilder.create(instance -> instance.group((App)class05074.N.lenientOptionalFieldOf("loot_table", y.y()).forGetter(class02281::y), (App)Codec.DOUBLE.lenientOptionalFieldOf("activation_range", (Object)y.L()).forGetter(class02281::L), (App)Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", (Object)y.u()).forGetter(class02281::u), (App)class06584.N((String)"key_item").forGetter(class02281::i), (App)class05074.N.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(class02281::R)).apply(instance, class02281::new)).validate(class02281::B);

    public double L() {
        return this.activationRange;
    }

    public class04488 M() {
        return this.entitySelector;
    }

    private class02281() {
        this((class05946<class05074>)class06273.F, 4.0, 4.5, new class06584((class07310)class06570.Yd), Optional.empty(), class04514.y, class04488.N);
    }

    public class02281(class05946<class05074> class059462, double d, double d2, class06584 class065842, Optional<class05946<class05074>> optional, class04514 class045142, class04488 class044882) {
        this.lootTable = class059462;
        this.activationRange = d;
        this.deactivationRange = d2;
        this.keyItem = class065842;
        this.overrideLootTableToDisplay = optional;
        this.playerDetector = class045142;
        this.entitySelector = class044882;
    }

    public class02281(class05946<class05074> class059462, double d, double d2, class06584 class065842, Optional<class05946<class05074>> optional) {
        this(class059462, d, d2, class065842, optional, y.N(), y.M());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02281.class, "lootTable;activationRange;deactivationRange;keyItem;overrideLootTableToDisplay;playerDetector;entitySelector", "lootTable", "activationRange", "deactivationRange", "keyItem", "overrideLootTableToDisplay", "playerDetector", "entitySelector"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02281.class, "lootTable;activationRange;deactivationRange;keyItem;overrideLootTableToDisplay;playerDetector;entitySelector", "lootTable", "activationRange", "deactivationRange", "keyItem", "overrideLootTableToDisplay", "playerDetector", "entitySelector"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02281.class, "lootTable;activationRange;deactivationRange;keyItem;overrideLootTableToDisplay;playerDetector;entitySelector", "lootTable", "activationRange", "deactivationRange", "keyItem", "overrideLootTableToDisplay", "playerDetector", "entitySelector"}, this);
    }

    private DataResult<class02281> B() {
        if (this.activationRange > this.deactivationRange) {
            return DataResult.error(() -> "Activation range must (" + this.activationRange + ") be less or equal to deactivation range (" + this.deactivationRange + ")");
        }
        return DataResult.success((Object)((Object)this));
    }

    public class06584 i() {
        return this.keyItem;
    }

    public double u() {
        return this.deactivationRange;
    }

    public class05946<class05074> y() {
        return this.lootTable;
    }

    public class04514 N() {
        return class07529.NZ ? class04514.L : this.playerDetector;
    }

    public Optional<class05946<class05074>> R() {
        return this.overrideLootTableToDisplay;
    }
}

