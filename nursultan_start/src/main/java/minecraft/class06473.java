/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class05834
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import minecraft.class01894;
import minecraft.class05834;
import minecraft.class06463;

class class06473
implements class05834 {
    final /* synthetic */ List N;
    final /* synthetic */ List y;
    final /* synthetic */ List L;
    final /* synthetic */ Map u;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06473(class06463 class064632, List list, List list2, List list3, Map map) {
        this.N = list;
        this.y = list2;
        this.L = list3;
        this.u = map;
    }

    public void y(String string) {
        this.L.add(string);
    }

    public void N(class01894 class018943, Collection<String> collection) {
        this.u.computeIfAbsent(class018943, class018942 -> new ArrayList()).addAll(collection);
    }

    public void N(class01894 class018943, String string) {
        this.u.computeIfAbsent(class018943, class018942 -> new ArrayList()).add(string);
    }

    public void N(String string) {
        if (this.N.size() > this.y.size()) {
            this.y.add(string);
        } else {
            this.N.add(string);
        }
    }
}

