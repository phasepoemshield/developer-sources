/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00242
 *  minecraft.class00296
 *  minecraft.class00305
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00242;
import minecraft.class00296;
import minecraft.class00305;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

public final class class05322
extends Record {
    private final class06584 primaryIcon;
    private final Optional<class06584> secondaryIcon;
    private final class00242 category;

    public class00242 L() {
        return this.category;
    }

    public class05322(class00296 class002962) {
        this(new class06584((class07310)class06570.jJ), Optional.empty(), (class00242)class002962);
    }

    public class05322(class06584 class065842, Optional<class06584> optional, class00242 class002422) {
        this.primaryIcon = class065842;
        this.secondaryIcon = optional;
        this.category = class002422;
    }

    public class05322(class06581 class065812, class06581 class065813, class00305 class003052) {
        this(new class06584((class07310)class065812), Optional.of(new class06584((class07310)class065813)), (class00242)class003052);
    }

    public class05322(class06581 class065812, class00305 class003052) {
        this(new class06584((class07310)class065812), Optional.empty(), (class00242)class003052);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05322.class, "primaryIcon;secondaryIcon;category", "primaryIcon", "secondaryIcon", "category"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05322.class, "primaryIcon;secondaryIcon;category", "primaryIcon", "secondaryIcon", "category"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05322.class, "primaryIcon;secondaryIcon;category", "primaryIcon", "secondaryIcon", "category"}, this);
    }

    public Optional<class06584> y() {
        return this.secondaryIcon;
    }

    public class06584 N() {
        return this.primaryIcon;
    }
}

