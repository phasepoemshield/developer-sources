/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class07311
 *  minecraft.class08098
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class07311;
import minecraft.class08098;

public class class07928 {
    final Map<class07311, List<class08098>> N = new HashMap<class07311, List<class08098>>();
    private final Set<class07311> y = new ObjectOpenHashSet();

    public void y() {
        this.N.keySet().removeIf(class073112 -> !this.y.contains(class073112));
        this.y.clear();
    }

    public void N() {
        for (Map.Entry<class07311, List<class08098>> entry : this.N.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            this.y.add(entry.getKey());
            entry.getValue().clear();
        }
    }

    public void N(class07311 class073113, class08098 class080982) {
        this.N.computeIfAbsent(class073113, class073112 -> new ArrayList()).add(class080982);
    }
}

