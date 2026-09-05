/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00005
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import minecraft.class00005;
import minecraft.class00037;
import minecraft.class07049;

public class class00057
implements class00005 {
    private final Map<Either<UUID, String>, class00037> N = new ConcurrentHashMap<Either<UUID, String>, class00037>();

    public void L(class00037 class000372) {
        this.N.remove(class000372.N());
    }

    public void y(class00037 class000372) {
        this.N.get(class000372.N()).N(class000372);
    }

    public void N(class07049 class070492, Consumer<class00037> consumer) {
        this.N.values().stream().sorted(Comparator.comparingDouble(class000372 -> class000372.N(class070492)).reversed()).forEachOrdered(consumer);
    }

    public boolean N() {
        return !this.N.isEmpty();
    }

    public void N(class00037 class000372) {
        this.N.put(class000372.N(), class000372);
    }
}

