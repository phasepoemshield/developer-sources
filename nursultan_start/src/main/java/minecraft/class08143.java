/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class00999
 *  minecraft.class01421
 *  minecraft.class05536
 *  minecraft.class07311
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00999;
import minecraft.class01421;
import minecraft.class05536;
import minecraft.class07311;

public class class08143 {
    final Map<class07311, List<class05536>> N = new HashMap<class07311, List<class05536>>();
    private final Set<class07311> y = new ObjectOpenHashSet();

    public void y() {
        this.N.keySet().removeIf(class073112 -> !this.y.contains(class073112));
        this.y.clear();
    }

    public void N() {
        for (Map.Entry<class07311, List<class05536>> entry : this.N.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            this.y.add(entry.getKey());
            entry.getValue().clear();
        }
    }

    public void N(class01421 class014212, class07311 class073113, class00999 class009992) {
        this.N.computeIfAbsent(class073113, class073112 -> new ArrayList()).add(new class05536(class014212.L().u(), class009992));
    }
}

