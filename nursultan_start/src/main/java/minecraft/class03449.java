/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03599
 *  minecraft.class05908
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class03599;
import minecraft.class05908;

@FunctionalInterface
interface class03449 {
    public static final class03449 y = (class059082, consumer) -> false;
    public static final class03449 L = (class059082, consumer) -> true;

    public boolean expand(class05908 var1, Consumer<class03599> var2);

    default public class03449 y(class03449 class034492) {
        Objects.requireNonNull(class034492);
        return (class059082, consumer) -> this.expand(class059082, consumer) || class034492.expand(class059082, consumer);
    }

    default public class03449 N(class03449 class034492) {
        Objects.requireNonNull(class034492);
        return (class059082, consumer) -> this.expand(class059082, consumer) && class034492.expand(class059082, consumer);
    }
}

