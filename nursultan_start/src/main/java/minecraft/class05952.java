/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00815
 *  minecraft.class03474
 *  minecraft.class03489
 *  minecraft.class03494
 *  minecraft.class03496
 */
package minecraft;

import minecraft.class00815;
import minecraft.class03474;
import minecraft.class03489;
import minecraft.class03494;
import minecraft.class03496;
import minecraft.class05957;

@FunctionalInterface
public interface class05952 {
    default public class03474 L(class05952 class059522) {
        return class03496.N((class05952[])new class05952[]{this, class059522});
    }

    default public class03489 y(class05952 class059522) {
        return class03494.N((class05952[])new class05952[]{this, class059522});
    }

    default public class05952 y() {
        return class00815.N((class05952)this);
    }

    public class05957 build();
}

