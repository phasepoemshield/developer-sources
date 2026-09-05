/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class01517
 *  minecraft.class02253
 *  minecraft.class04530
 *  minecraft.class05025
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class01517;
import minecraft.class02253;
import minecraft.class04530;
import minecraft.class04657;
import minecraft.class05025;

public class class04587 {
    private final Set<String> N = new ObjectOpenHashSet();

    private static class04530 N(Supplier<class04657> supplier, String string, class02253 class022532) {
        return class04530.N((String)string, (class02253)class022532, () -> {
            class05025 class050252 = ((class04657)supplier.get()).u(string);
            return class050252 == null ? 0.0 : (double)class050252.y() / (double)class01517.y;
        });
    }

    public Set<class04530> N(Supplier<class04657> supplier) {
        Set<class04530> set = supplier.get().i().stream().filter(pair -> !this.N.contains(pair.getLeft())).map(pair -> class04587.N(supplier, (String)pair.getLeft(), (class02253)pair.getRight())).collect(Collectors.toSet());
        for (class04530 class045302 : set) {
            this.N.add(class045302.u());
        }
        return set;
    }
}

