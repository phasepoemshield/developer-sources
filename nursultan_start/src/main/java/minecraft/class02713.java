/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  minecraft.class02477
 *  minecraft.class02480
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Optional;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02678;

public class class02713 {
    private final Reference2ObjectMap<class02477<?>, Optional<?>> N = new Reference2ObjectArrayMap();

    class02713() {
    }

    public class02678 N() {
        if (this.N.isEmpty()) {
            return class02678.N;
        }
        return new class02678(this.N);
    }

    public <T> class02713 N(class02480<T> class024802) {
        return this.N(class024802.N(), class024802.y());
    }

    public <T> class02713 N(class02477<T> class024772) {
        this.N.put(class024772, Optional.empty());
        return this;
    }

    public <T> class02713 N(class02477<T> class024772, T t) {
        this.N.put(class024772, Optional.of(t));
        return this;
    }
}

