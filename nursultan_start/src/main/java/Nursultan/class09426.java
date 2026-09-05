/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09173
 *  Nursultan.class11389
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package Nursultan;

import Nursultan.class09173;
import Nursultan.class11389;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class09426 {
    public Object N_0;
    public Object N_1;

    private static void L() {
    }

    private void L(class09173 class091732) {
        this.u(class091732);
        this.N(class091732.y().L(), class091732);
    }

    public class09426() {
        this.N();
        this.N_0 = new Int2ObjectOpenHashMap();
        this.N_1 = this::L;
    }

    static {
        class09426.u();
        class09426.L();
        class09426.y();
    }

    private static void u() {
    }

    private void u(class09173 class091732) {
        ObjectIterator objectIterator = ((Int2ObjectOpenHashMap)this.N_0).int2ObjectEntrySet().iterator();
        while (objectIterator.hasNext()) {
            List list = (List)((Int2ObjectMap.Entry)objectIterator.next()).getValue();
            list.removeIf(class091733 -> class091733 == class091732);
            if (!list.isEmpty()) continue;
            objectIterator.remove();
        }
    }

    private static void y() {
    }

    public void y(class11389 class113892) {
        List list = (List)((Int2ObjectOpenHashMap)this.N_0).get(class113892.z());
        if (list == null) {
            return;
        }
        List list2 = list.stream().filter(class091732 -> class091732.u(class113892)).toList();
        if (list2.isEmpty()) {
            list2 = list.stream().filter(class091732 -> class091732.y(class113892)).toList();
        }
        list2.forEach(class091732 -> class091732.L(class113892));
    }

    public void y(class09173 class091732) {
        this.u(class091732);
        this.N(class091732.y().L(), class091732);
        class091732.N((Consumer)this.N_1);
    }

    private void N(int n2, class09173 class091732) {
        if (class091732.B()) {
            return;
        }
        List list = (List)((Int2ObjectOpenHashMap)this.N_0).computeIfAbsent(n2, n -> new ArrayList());
        if (list.stream().anyMatch(class091733 -> class091733 == class091732)) {
            return;
        }
        list.add(class091732);
    }

    private void N() {
    }

    public void N(class11389 class113892) {
        List list = (List)((Int2ObjectOpenHashMap)this.N_0).get(class113892.z());
        if (list == null) {
            return;
        }
        list.stream().filter(class091732 -> class091732.N(class113892.z())).forEach(class091732 -> class091732.N(class113892));
    }

    public void N(class09173 class091732) {
        this.u(class091732);
    }
}

