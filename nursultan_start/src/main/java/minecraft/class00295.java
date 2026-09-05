/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02741
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class00265;
import minecraft.class00305;
import minecraft.class00311;
import minecraft.class00329;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02741;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06584;

public final class class00295
extends Record {
    private final class00329 id;
    private final class00265 display;
    private final OptionalInt group;
    private final class00305 category;
    private final Optional<List<class06510>> craftingRequirements;
    public static final class02362<class04247, class00295> N = class02362.N(class00329.N, class00295::N, class00265.i, class00295::y, (class02362)class02389.Z, class00295::L, (class02362)class02389.N((class05946)class04227.Nm), class00295::u, (class02362)class06510.field_48355.N_33(class02389.N()).N_33(class02389::N), class00295::i, class00295::new);

    public OptionalInt L() {
        return this.group;
    }

    public class00295(class00329 class003292, class00265 class002652, OptionalInt optionalInt, class00305 class003052, Optional<List<class06510>> optional) {
        this.id = class003292;
        this.display = class002652;
        this.group = optionalInt;
        this.category = class003052;
        this.craftingRequirements = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00295.class, "id;display;group;category;craftingRequirements", "id", "display", "group", "category", "craftingRequirements"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00295.class, "id;display;group;category;craftingRequirements", "id", "display", "group", "category", "craftingRequirements"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00295.class, "id;display;group;category;craftingRequirements", "id", "display", "group", "category", "craftingRequirements"}, this);
    }

    public Optional<List<class06510>> i() {
        return this.craftingRequirements;
    }

    public class00305 u() {
        return this.category;
    }

    public class00265 y() {
        return this.display;
    }

    public class00329 N() {
        return this.id;
    }

    public boolean N(class02741 class027412) {
        if (this.craftingRequirements.isEmpty()) {
            return false;
        }
        return class027412.N(this.craftingRequirements.get(), null);
    }

    public List<class06584> N(class00311 class003112) {
        return this.display.u().N(class003112);
    }
}

