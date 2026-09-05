/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00667;

public final class class03753
extends Record {
    private final List<List<String>> requirements;
    public static final Codec<class03753> N = Codec.STRING.listOf().listOf().xmap(class03753::new, class03753::u);
    public static final class03753 y = new class03753(List.of());

    public Set<String> L() {
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet();
        for (List<String> var3 : this.requirements) {
            objectOpenHashSet.addAll(var3);
        }
        return objectOpenHashSet;
    }

    public class03753(class00667 class006673) {
        this(class006673.N_16(class006672 -> class006672.N_16(class00667::s)));
    }

    public class03753(List<List<String>> list) {
        this.requirements = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03753.class, "requirements", "requirements"}, this, object);
    }

    public String toString() {
        return this.requirements.toString();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03753.class, "requirements", "requirements"}, this);
    }

    public List<List<String>> u() {
        return this.requirements;
    }

    public boolean y() {
        return this.requirements.isEmpty();
    }

    public int y(Predicate<String> predicate) {
        int n = 0;
        Iterator<List<String>> var3 = this.requirements.iterator();
        while (var3.hasNext()) {
            if (!class03753.N(var3.next(), predicate)) continue;
            ++n;
        }
        return n;
    }

    public static class03753 y(Collection<String> collection) {
        return new class03753(List.of(List.copyOf(collection)));
    }

    public int N() {
        return this.requirements.size();
    }

    private static /* synthetic */ String N(Set set, Set set2) {
        return "Advancement completion requirements did not exactly match specified criteria. Missing: " + String.valueOf(set) + ". Unknown: " + String.valueOf(set2);
    }

    public void N(class00667 class006673) {
        class006673.N_12(this.requirements, (class006672, list) -> class006672.N_12((Collection)list, class00667::N));
    }

    public static class03753 N(Collection<String> collection) {
        return new class03753(collection.stream().map(List::of).toList());
    }

    public DataResult<class03753> N(Set<String> set) {
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet();
        for (List<String> var4 : this.requirements) {
            if (var4.isEmpty() && set.isEmpty()) {
                return DataResult.error(() -> "Requirement entry cannot be empty");
            }
            objectOpenHashSet.addAll(var4);
        }
        if (!set.equals(objectOpenHashSet)) {
            Sets.SetView setView = Sets.difference(set, (Set)objectOpenHashSet);
            Sets.SetView setView2 = Sets.difference((Set)objectOpenHashSet, set);
            return DataResult.error(() -> class03753.N((Set)setView, (Set)setView2));
        }
        return DataResult.success((Object)((Object)this));
    }

    private static boolean N(List<String> list, Predicate<String> predicate) {
        for (String string : list) {
            if (!predicate.test(string)) continue;
            return true;
        }
        return false;
    }

    public boolean N(Predicate<String> predicate) {
        if (this.requirements.isEmpty()) {
            return false;
        }
        Iterator<List<String>> var2 = this.requirements.iterator();
        while (var2.hasNext()) {
            if (class03753.N(var2.next(), predicate)) continue;
            return false;
        }
        return true;
    }
}

