/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class02525
extends Record {
    private final class06584 itemStack;
    private final @Nullable class07085 inSlot;
    private final @Nullable class07438 owner;
    private final Consumer<class06581> onBreak;

    public @Nullable class07438 L() {
        return this.owner;
    }

    public class02525(class06584 class065842, class07085 class070852, class07438 class074382) {
        this(class065842, class070852, class074382, class065812 -> class074382.method_20235(class065812, class070852));
    }

    public class02525(class06584 class065842, @Nullable class07085 class070852, @Nullable class07438 class074382, Consumer<class06581> consumer) {
        this.itemStack = class065842;
        this.inSlot = class070852;
        this.owner = class074382;
        this.onBreak = consumer;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02525.class, "itemStack;inSlot;owner;onBreak", "itemStack", "inSlot", "owner", "onBreak"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02525.class, "itemStack;inSlot;owner;onBreak", "itemStack", "inSlot", "owner", "onBreak"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02525.class, "itemStack;inSlot;owner;onBreak", "itemStack", "inSlot", "owner", "onBreak"}, this);
    }

    public Consumer<class06581> u() {
        return this.onBreak;
    }

    public @Nullable class07085 y() {
        return this.inSlot;
    }

    public class06584 N() {
        return this.itemStack;
    }
}

