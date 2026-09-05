/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04247
 *  minecraft.class05534
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class04247;
import minecraft.class05534;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;

public final class class08588
extends Record
implements class02694 {
    private final List<class05534> bees;
    public static final Codec<class08588> N = class05534.u.xmap(class08588::new, class08588::N);
    public static final class02362<class04247, class08588> y = class05534.i.N_33(class02389.N()).N_10(class08588::new, class08588::N);
    public static final class08588 L = new class08588(List.of());

    public class08588(List<class05534> list) {
        this.bees = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08588.class, "bees", "bees"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08588.class, "bees", "bees"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08588.class, "bees", "bees"}, this);
    }

    public List<class05534> N() {
        return this.bees;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        consumer.accept((class00392)class00392.N((String)"container.beehive.bees", (Object[])new Object[]{this.bees.size(), 3}).N(class06541.field_1080));
    }
}

