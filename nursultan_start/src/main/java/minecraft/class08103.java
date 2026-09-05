/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class07311
 *  org.joml.Vector3f
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class07311;
import minecraft.class08107;
import minecraft.class08108;
import org.joml.Vector3f;

public class class08103 {
    final Map<class07311, List<class08107<?>>> N = new HashMap();
    final List<class08108<?>> y = new ArrayList();
    private final Set<class07311> L = new ObjectOpenHashSet();

    public void y() {
        this.N.keySet().removeIf(class073112 -> !this.L.contains(class073112));
        this.L.clear();
    }

    public void N() {
        this.y.clear();
        for (Map.Entry<class07311, List<class08107<?>>> entry : this.N.entrySet()) {
            List<class08107<?>> var3 = entry.getValue();
            if (var3.isEmpty()) continue;
            this.L.add(entry.getKey());
            var3.clear();
        }
    }

    public void N(class07311 class073113, class08107<?> class081072) {
        if (class073113.method_73243().getBlendFunction().isEmpty()) {
            this.N.computeIfAbsent(class073113, class073112 -> new ArrayList()).add(class081072);
        } else {
            Vector3f vector3f = class081072.N().N().transformPosition(new Vector3f());
            this.y.add(new class08108(class081072, class073113, vector3f));
        }
    }
}

