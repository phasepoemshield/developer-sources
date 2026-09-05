/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00816
 *  minecraft.class01894
 *  minecraft.class02824
 *  minecraft.class02834
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07463
 *  minecraft.class07468
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00816;
import minecraft.class01894;
import minecraft.class02824;
import minecraft.class02834;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07463;
import minecraft.class07468;

public final class class02918
extends Record
implements Predicate<class02824> {
    private final Optional<class03543<class07468>> attribute;
    private final Optional<class01894> id;
    private final class00816 amount;
    private final Optional<class07463> operation;
    private final Optional<class02834> slot;
    public static final Codec<class02918> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.L).optionalFieldOf("attribute").forGetter(class02918::N), (App)class01894.N.optionalFieldOf("id").forGetter(class02918::y), (App)class00816.u.optionalFieldOf("amount", (Object)class00816.L).forGetter(class02918::L), (App)class07463.field_45742.optionalFieldOf("operation").forGetter(class02918::u), (App)class02834.field_49226.optionalFieldOf("slot").forGetter(class02918::i)).apply(instance, class02918::new));

    public class00816 L() {
        return this.amount;
    }

    public class02918(Optional<class03543<class07468>> optional, Optional<class01894> optional2, class00816 class008162, Optional<class07463> optional3, Optional<class02834> optional4) {
        this.attribute = optional;
        this.id = optional2;
        this.amount = class008162;
        this.operation = optional3;
        this.slot = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02918.class, "attribute;id;amount;operation;slot", "attribute", "id", "amount", "operation", "slot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02918.class, "attribute;id;amount;operation;slot", "attribute", "id", "amount", "operation", "slot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02918.class, "attribute;id;amount;operation;slot", "attribute", "id", "amount", "operation", "slot"}, this);
    }

    public Optional<class02834> i() {
        return this.slot;
    }

    public Optional<class07463> u() {
        return this.operation;
    }

    public Optional<class01894> y() {
        return this.id;
    }

    @Override
    public boolean test(class02824 class028242) {
        if (this.attribute.isPresent() && !this.attribute.get().N(class028242.N())) {
            return false;
        }
        if (this.id.isPresent() && !this.id.get().equals((Object)class028242.y().N())) {
            return false;
        }
        if (!this.amount.u(class028242.y().y())) {
            return false;
        }
        if (this.operation.isPresent() && this.operation.get() != class028242.y().L()) {
            return false;
        }
        return !this.slot.isPresent() || this.slot.get() == class028242.L();
    }

    public Optional<class03543<class07468>> N() {
        return this.attribute;
    }
}

