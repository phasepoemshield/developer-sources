/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  minecraft.class01894
 *  minecraft.class03711
 *  minecraft.class03734
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class01894;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class07176;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07166 {
    private static final Logger N = LogUtils.getLogger();
    private final Map<class01894, class03734> y = new Object2ObjectOpenHashMap();
    private final Set<class03734> L = new ObjectLinkedOpenHashSet();
    private final Set<class03734> u = new ObjectLinkedOpenHashSet();
    private @Nullable class07176 i;

    public Collection<class03734> L() {
        return this.y.values();
    }

    public Iterable<class03734> y() {
        return this.L;
    }

    private boolean y(class03711 class037112) {
        Optional<class01894> var2 = class037112.y().y();
        class03734 class037342 = var2.map(this.y::get).orElse(null);
        if (class037342 == null && var2.isPresent()) {
            return false;
        }
        class03734 class037343 = new class03734(class037112, class037342);
        if (class037342 != null) {
            class037342.y(class037343);
        }
        this.y.put(class037112.N(), class037343);
        if (class037342 == null) {
            this.L.add(class037343);
            if (this.i != null) {
                this.i.N(class037343);
            }
        } else {
            this.u.add(class037343);
            if (this.i != null) {
                this.i.L(class037343);
            }
        }
        return true;
    }

    public @Nullable class03734 N(class03711 class037112) {
        return this.y.get(class037112.N());
    }

    public @Nullable class03734 N(class01894 class018942) {
        return this.y.get(class018942);
    }

    public void N(@Nullable class07176 class071762) {
        this.i = class071762;
        if (class071762 != null) {
            for (class03734 class037342 : this.L) {
                class071762.N(class037342);
            }
            for (class03734 class037342 : this.u) {
                class071762.L(class037342);
            }
        }
    }

    public void N(Collection<class03711> collection) {
        ArrayList<class03711> arrayList = new ArrayList<class03711>(collection);
        while (!arrayList.isEmpty()) {
            if (arrayList.removeIf(this::y)) continue;
            N.error("Couldn't load advancements: {}", arrayList);
            break;
        }
        N.info("Loaded {} advancements", (Object)this.y.size());
    }

    private void N(class03734 class037342) {
        for (class03734 class037343 : class037342.i()) {
            this.N(class037343);
        }
        N.info("Forgot about advancement {}", (Object)class037342.y());
        this.y.remove(class037342.y().N());
        if (class037342.L() == null) {
            this.L.remove(class037342);
            if (this.i != null) {
                this.i.y(class037342);
            }
        } else {
            this.u.remove(class037342);
            if (this.i != null) {
                this.i.u(class037342);
            }
        }
    }

    public void N(Set<class01894> set) {
        for (class01894 class018942 : set) {
            class03734 class037342 = this.y.get(class018942);
            if (class037342 == null) {
                N.warn("Told to remove advancement {} but I don't know what that is", (Object)class018942);
                continue;
            }
            this.N(class037342);
        }
    }

    public void N() {
        this.y.clear();
        this.L.clear();
        this.u.clear();
        if (this.i != null) {
            this.i.N();
        }
    }
}

