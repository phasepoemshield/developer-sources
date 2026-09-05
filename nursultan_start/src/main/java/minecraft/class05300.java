/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class03556
 *  minecraft.class05308
 *  minecraft.class07468
 *  minecraft.class07469
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class03556;
import minecraft.class05308;
import minecraft.class07468;
import minecraft.class07469;

public class class05300 {
    private final ImmutableMap.Builder<class03556<class07468>, class07469> N = ImmutableMap.builder();
    private boolean y;

    private class07469 y(class03556<class07468> class035562) {
        class07469 class074693 = new class07469(class035562, class074692 -> {
            if (this.y) {
                throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + class035562.M());
            }
        });
        this.N.put(class035562, (Object)class074693);
        return class074693;
    }

    public class05308 N() {
        this.y = true;
        return new class05308((Map)this.N.buildKeepingLast());
    }

    public class05300 N(class03556<class07468> class035562, double d) {
        this.y(class035562).N(d);
        return this;
    }

    public class05300 N(class03556<class07468> class035562) {
        this.y(class035562);
        return this;
    }
}

