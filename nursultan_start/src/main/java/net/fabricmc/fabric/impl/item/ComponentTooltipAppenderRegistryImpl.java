/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02477
 *  minecraft.class02694
 *  minecraft.class06497
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class08562
 */
package net.fabricmc.fabric.impl.item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02477;
import minecraft.class02694;
import minecraft.class06497;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class08562;
import net.fabricmc.fabric.impl.item.VanillaTooltipAppenderOrder;

public final class ComponentTooltipAppenderRegistryImpl {
    private static final List<class02477<? extends class02694>> first = new ArrayList<class02477<? extends class02694>>();
    private static final List<class02477<? extends class02694>> last = new ArrayList<class02477<? extends class02694>>();
    private static final Map<class02477<?>, List<class02477<? extends class02694>>> before = new IdentityHashMap();
    private static final Map<class02477<?>, List<class02477<? extends class02694>>> after = new IdentityHashMap();
    private static boolean hasModdedEntries = false;

    public static void addFirst(class02477<? extends class02694> class024772) {
        first.add(class024772);
        ComponentTooltipAppenderRegistryImpl.onModified();
    }

    public static void addLast(class02477<? extends class02694> class024772) {
        last.add(class024772);
        ComponentTooltipAppenderRegistryImpl.onModified();
    }

    public static void addBefore(class02477<?> class024773, class02477<? extends class02694> class024774) {
        before.computeIfAbsent(class024773, class024772 -> new ArrayList()).add(class024774);
        ComponentTooltipAppenderRegistryImpl.onModified();
    }

    public static void addAfter(class02477<?> class024773, class02477<? extends class02694> class024774) {
        after.computeIfAbsent(class024773, class024772 -> new ArrayList()).add(class024774);
        ComponentTooltipAppenderRegistryImpl.onModified();
    }

    public static void onAfter(class06584 class065842, class02477<?> class024772, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972, Set<class02477<?>> set) {
        List<class02477<? extends class02694>> list = after.get(class024772);
        if (list != null) {
            for (class02477<? extends class02694> class024773 : list) {
                ComponentTooltipAppenderRegistryImpl.appendCustomComponentTooltip(class065842, class024773, class065912, class085622, consumer, class064972, set);
            }
        }
    }

    public static void onFirst(class06584 class065842, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972) {
        HashSet hashSet = new HashSet();
        for (class02477<? extends class02694> class024772 : first) {
            ComponentTooltipAppenderRegistryImpl.appendCustomComponentTooltip(class065842, class024772, class065912, class085622, consumer, class064972, hashSet);
        }
    }

    public static void onLast(class06584 class065842, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972) {
        HashSet hashSet = new HashSet();
        for (class02477<? extends class02694> class024772 : last) {
            ComponentTooltipAppenderRegistryImpl.appendCustomComponentTooltip(class065842, class024772, class065912, class085622, consumer, class064972, hashSet);
        }
    }

    public static void onBefore(class06584 class065842, class02477<?> class024772, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972, Set<class02477<?>> set) {
        List<class02477<? extends class02694>> list = before.get(class024772);
        if (list != null) {
            for (class02477<? extends class02694> class024773 : list) {
                ComponentTooltipAppenderRegistryImpl.appendCustomComponentTooltip(class065842, class024773, class065912, class085622, consumer, class064972, set);
            }
        }
    }

    private static void onModified() {
        hasModdedEntries = true;
        VanillaTooltipAppenderOrder.load();
    }

    public static boolean hasModdedEntries() {
        return hasModdedEntries;
    }

    private static void appendCustomComponentTooltip(class06584 class065842, class02477<? extends class02694> class024772, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972, Set<class02477<?>> set) {
        if (!set.add(class024772)) {
            return;
        }
        ComponentTooltipAppenderRegistryImpl.onBefore(class065842, class024772, class065912, class085622, consumer, class064972, set);
        class065842.N(class024772, class065912, class085622, consumer, class064972);
        ComponentTooltipAppenderRegistryImpl.onAfter(class065842, class024772, class065912, class085622, consumer, class064972, set);
        set.remove(class024772);
    }
}

