/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01997
 *  minecraft.class04476
 *  minecraft.class07135
 *  minecraft.class08819
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class01997;
import minecraft.class04476;
import minecraft.class07135;
import minecraft.class08819;

public class class05401
implements BiConsumer<class01894, class08819> {
    private final Map<class01894, class08819> N = new HashMap<class01894, class08819>();

    @Override
    public void accept(class01894 class018942, class08819 class088192) {
        if ((Supplier)this.N.put(class018942, class088192) != null) {
            throw new IllegalStateException("Duplicate model definition for " + String.valueOf(class018942));
        }
    }

    public CompletableFuture<?> N(class04476 class044762, class01997 class019972) {
        return class07135.N((class04476)class044762, Supplier::get, arg_0 -> ((class01997)class019972).N(arg_0), this.N);
    }
}

