/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class05346;
import minecraft.class05382;

class class05348 {
    final Object2IntMap<class05346> N = new Object2IntOpenHashMap();

    class05348() {
    }

    public boolean y() {
        return this.N.isEmpty();
    }

    public void y(class05346 class053462) {
        this.N.removeInt((Object)class053462);
    }

    public int N(Predicate<class05346> predicate) {
        return this.N.object2IntEntrySet().stream().filter(entry -> predicate.test((class05346)((Object)((Object)entry.getKey())))).mapToInt(entry -> entry.getIntValue() * ((class05346)((Object)((Object)entry.getKey()))).field_18431).sum();
    }

    public Stream<class05382> N(UUID uUID) {
        return this.N.object2IntEntrySet().stream().map(entry -> new class05382(uUID, (class05346)((Object)((Object)entry.getKey())), entry.getIntValue()));
    }

    public void N() {
        ObjectIterator var1 = this.N.object2IntEntrySet().iterator();
        while (var1.hasNext()) {
            Object2IntMap.Entry entry = (Object2IntMap.Entry)var1.next();
            int n = entry.getIntValue() - ((class05346)((Object)entry.getKey())).field_19354;
            if (n < 2) {
                var1.remove();
                continue;
            }
            entry.setValue(n);
        }
    }

    public void N(class05346 class053462) {
        int n = this.N.getInt((Object)class053462);
        if (n > class053462.field_18432) {
            this.N.put((Object)class053462, class053462.field_18432);
        }
        if (n < 2) {
            this.y(class053462);
        }
    }
}

