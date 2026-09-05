/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10213
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04573
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class10213;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class03556;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03882;
import minecraft.class03903;
import minecraft.class04573;
import minecraft.class05946;

public final class class03890
extends Record
implements class04573<class03903> {
    private final class03556<class03877> function;
    public static final Codec<class03890> N = class03877.i.xmap(class03890::new, class03890::N);

    public float L() {
        return this.function.y() ? (float)((class03877)this.function.N()).y() : Float.POSITIVE_INFINITY;
    }

    public class03890(class03556<class03877> class035562) {
        this.function = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03890.class, "function", "function"}, this, object);
    }

    public String toString() {
        Optional var1 = this.function.i();
        if (var1.isPresent()) {
            class05946 var2 = (class05946)var1.get();
            if (var2 == class03882.i) {
                return "continents";
            }
            if (var2 == class03882.R) {
                return "erosion";
            }
            if (var2 == class03882.M) {
                return "weirdness";
            }
            if (var2 == class03882.B) {
                return "ridges";
            }
        }
        return "Coordinate[" + String.valueOf(this.function) + "]";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03890.class, "function", "function"}, this);
    }

    public float y() {
        return this.function.y() ? (float)((class03877)this.function.N()).N() : Float.NEGATIVE_INFINITY;
    }

    public class03890 N(class03881 class038812) {
        return new class03890((class03556<class03877>)new class10213((Object)((class03877)this.function.N()).N(class038812)));
    }

    public class03556<class03877> N() {
        return this.function;
    }

    public float N(class03903 class039032) {
        return (float)((class03877)this.function.N()).N(class039032.N());
    }
}

