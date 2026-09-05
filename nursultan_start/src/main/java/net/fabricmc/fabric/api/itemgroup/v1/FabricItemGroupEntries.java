/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03767
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06908
 *  minecraft.class06934
 *  minecraft.class06945
 *  minecraft.class07310
 */
package net.fabricmc.fabric.api.itemgroup.v1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class03767;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06908;
import minecraft.class06934;
import minecraft.class06945;
import minecraft.class07310;

public class FabricItemGroupEntries
implements class06934 {
    private final class06945 context;
    private final List<class06584> displayStacks;
    private final List<class06584> searchTabStacks;

    public FabricItemGroupEntries(class06945 class069452, List<class06584> list, List<class06584> list2) {
        this.context = class069452;
        this.displayStacks = list;
        this.searchTabStacks = list2;
    }

    private boolean isEnabled(class06584 class065842) {
        return class065842.B().N(this.getEnabledFeatures());
    }

    public class06945 getContext() {
        return this.context;
    }

    public void prepend(class06584 class065842) {
        this.prepend(class065842, class06908.field_40191);
    }

    public void prepend(class06584 class065842, class06908 class069082) {
        if (this.isEnabled(class065842)) {
            FabricItemGroupEntries.checkStack(class065842);
            switch (class069082) {
                case field_40191: {
                    this.displayStacks.add(0, class065842);
                    this.searchTabStacks.add(0, class065842);
                    break;
                }
                case field_40192: {
                    this.displayStacks.add(0, class065842);
                    break;
                }
                case field_40193: {
                    this.searchTabStacks.add(0, class065842);
                }
            }
        }
    }

    public void prepend(class07310 class073102) {
        this.prepend(class073102, class06908.field_40191);
    }

    public void prepend(class07310 class073102, class06908 class069082) {
        this.prepend(new class06584(class073102), class069082);
    }

    public class03767 getEnabledFeatures() {
        return this.context.N();
    }

    public void addBefore(class06584 class065842, Collection<class06584> collection) {
        this.addBefore(class065842, collection, class06908.field_40191);
    }

    public void addBefore(class07310 class073102, Collection<class06584> collection, class06908 class069082) {
        if ((collection = this.getEnabledStacks(collection)).isEmpty()) {
            return;
        }
        switch (class069082) {
            case field_40191: {
                FabricItemGroupEntries.addBefore(class073102, collection, this.displayStacks);
                FabricItemGroupEntries.addBefore(class073102, collection, this.searchTabStacks);
                break;
            }
            case field_40192: {
                FabricItemGroupEntries.addBefore(class073102, collection, this.displayStacks);
                break;
            }
            case field_40193: {
                FabricItemGroupEntries.addBefore(class073102, collection, this.searchTabStacks);
            }
        }
    }

    public void addBefore(class06584 class065842, Collection<class06584> collection, class06908 class069082) {
        if ((collection = this.getEnabledStacks(collection)).isEmpty()) {
            return;
        }
        switch (class069082) {
            case field_40191: {
                FabricItemGroupEntries.addBefore(class065842, collection, this.displayStacks);
                FabricItemGroupEntries.addBefore(class065842, collection, this.searchTabStacks);
                break;
            }
            case field_40192: {
                FabricItemGroupEntries.addBefore(class065842, collection, this.displayStacks);
                break;
            }
            case field_40193: {
                FabricItemGroupEntries.addBefore(class065842, collection, this.searchTabStacks);
            }
        }
    }

    public void addBefore(class07310 class073102, Collection<class06584> collection) {
        this.addBefore(class073102, collection, class06908.field_40191);
    }

    public void addBefore(class06584 class065842, class07310 ... class07310Array) {
        this.addBefore(class065842, (Collection<class06584>)Arrays.stream(class07310Array).map(class06584::new).toList());
    }

    public void addBefore(class07310 class073102, class06584 ... class06584Array) {
        this.addBefore(class073102, Arrays.asList(class06584Array));
    }

    public void addBefore(class06584 class065842, class06584 ... class06584Array) {
        this.addBefore(class065842, Arrays.asList(class06584Array));
    }

    private static void addBefore(class07310 class073102, Collection<class06584> collection, List<class06584> list) {
        FabricItemGroupEntries.checkStacks(collection);
        class06581 class065812 = class073102.B();
        for (int i = 0; i < list.size(); ++i) {
            if (!list.get(i).N(class065812)) continue;
            list.subList(i, i).addAll(collection);
            return;
        }
        list.addAll(collection);
    }

    private static void addBefore(class06584 class065842, Collection<class06584> collection, List<class06584> list) {
        FabricItemGroupEntries.checkStacks(collection);
        for (int i = 0; i < list.size(); ++i) {
            if (!class06584.L((class06584)class065842, (class06584)list.get(i))) continue;
            list.subList(i, i).addAll(collection);
            return;
        }
        list.addAll(collection);
    }

    public void addBefore(class07310 class073102, class07310 ... class07310Array) {
        this.addBefore(class073102, (Collection<class06584>)Arrays.stream(class07310Array).map(class06584::new).toList());
    }

    public void addBefore(Predicate<class06584> predicate, Collection<class06584> collection, class06908 class069082) {
        if ((collection = this.getEnabledStacks(collection)).isEmpty()) {
            return;
        }
        switch (class069082) {
            case field_40191: {
                FabricItemGroupEntries.addBefore(predicate, collection, this.displayStacks);
                FabricItemGroupEntries.addBefore(predicate, collection, this.searchTabStacks);
                break;
            }
            case field_40192: {
                FabricItemGroupEntries.addBefore(predicate, collection, this.displayStacks);
                break;
            }
            case field_40193: {
                FabricItemGroupEntries.addBefore(predicate, collection, this.searchTabStacks);
            }
        }
    }

    private static void addBefore(Predicate<class06584> predicate, Collection<class06584> collection, List<class06584> list) {
        FabricItemGroupEntries.checkStacks(collection);
        for (int i = 0; i < list.size(); ++i) {
            if (!predicate.test(list.get(i))) continue;
            list.subList(i, i).addAll(collection);
            return;
        }
        list.addAll(collection);
    }

    private static void addAfter(Predicate<class06584> predicate, Collection<class06584> collection, List<class06584> list) {
        FabricItemGroupEntries.checkStacks(collection);
        for (int i = list.size() - 1; i >= 0; --i) {
            if (!predicate.test(list.get(i))) continue;
            list.subList(i + 1, i + 1).addAll(collection);
            return;
        }
        list.addAll(collection);
    }

    private static void addAfter(class07310 class073102, Collection<class06584> collection, List<class06584> list) {
        FabricItemGroupEntries.checkStacks(collection);
        class06581 class065812 = class073102.B();
        for (int i = list.size() - 1; i >= 0; --i) {
            if (!list.get(i).N(class065812)) continue;
            list.subList(i + 1, i + 1).addAll(collection);
            return;
        }
        list.addAll(collection);
    }

    private static void addAfter(class06584 class065842, Collection<class06584> collection, List<class06584> list) {
        FabricItemGroupEntries.checkStacks(collection);
        for (int i = list.size() - 1; i >= 0; --i) {
            if (!class06584.L((class06584)class065842, (class06584)list.get(i))) continue;
            list.subList(i + 1, i + 1).addAll(collection);
            return;
        }
        list.addAll(collection);
    }

    public void addAfter(class07310 class073102, Collection<class06584> collection) {
        this.addAfter(class073102, collection, class06908.field_40191);
    }

    public void addAfter(class06584 class065842, class07310 ... class07310Array) {
        this.addAfter(class065842, (Collection<class06584>)Arrays.stream(class07310Array).map(class06584::new).toList());
    }

    public void addAfter(class07310 class073102, class07310 ... class07310Array) {
        this.addAfter(class073102, (Collection<class06584>)Arrays.stream(class07310Array).map(class06584::new).toList());
    }

    public void addAfter(class06584 class065842, class06584 ... class06584Array) {
        this.addAfter(class065842, Arrays.asList(class06584Array));
    }

    public void addAfter(class07310 class073102, class06584 ... class06584Array) {
        this.addAfter(class073102, Arrays.asList(class06584Array));
    }

    public void addAfter(Predicate<class06584> predicate, Collection<class06584> collection, class06908 class069082) {
        if ((collection = this.getEnabledStacks(collection)).isEmpty()) {
            return;
        }
        switch (class069082) {
            case field_40191: {
                FabricItemGroupEntries.addAfter(predicate, collection, this.displayStacks);
                FabricItemGroupEntries.addAfter(predicate, collection, this.searchTabStacks);
                break;
            }
            case field_40192: {
                FabricItemGroupEntries.addAfter(predicate, collection, this.displayStacks);
                break;
            }
            case field_40193: {
                FabricItemGroupEntries.addAfter(predicate, collection, this.searchTabStacks);
            }
        }
    }

    public void addAfter(class06584 class065842, Collection<class06584> collection, class06908 class069082) {
        if ((collection = this.getEnabledStacks(collection)).isEmpty()) {
            return;
        }
        switch (class069082) {
            case field_40191: {
                FabricItemGroupEntries.addAfter(class065842, collection, this.displayStacks);
                FabricItemGroupEntries.addAfter(class065842, collection, this.searchTabStacks);
                break;
            }
            case field_40192: {
                FabricItemGroupEntries.addAfter(class065842, collection, this.displayStacks);
                break;
            }
            case field_40193: {
                FabricItemGroupEntries.addAfter(class065842, collection, this.searchTabStacks);
            }
        }
    }

    public void addAfter(class06584 class065842, Collection<class06584> collection) {
        this.addAfter(class065842, collection, class06908.field_40191);
    }

    public void addAfter(class07310 class073102, Collection<class06584> collection, class06908 class069082) {
        if ((collection = this.getEnabledStacks(collection)).isEmpty()) {
            return;
        }
        switch (class069082) {
            case field_40191: {
                FabricItemGroupEntries.addAfter(class073102, collection, this.displayStacks);
                FabricItemGroupEntries.addAfter(class073102, collection, this.searchTabStacks);
                break;
            }
            case field_40192: {
                FabricItemGroupEntries.addAfter(class073102, collection, this.displayStacks);
                break;
            }
            case field_40193: {
                FabricItemGroupEntries.addAfter(class073102, collection, this.searchTabStacks);
            }
        }
    }

    public boolean shouldShowOpRestrictedItems() {
        return this.context.y();
    }

    public void method_45417(class06584 class065842, class06908 class069082) {
        if (this.isEnabled(class065842)) {
            FabricItemGroupEntries.checkStack(class065842);
            switch (class069082) {
                case field_40191: {
                    this.displayStacks.add(class065842);
                    this.searchTabStacks.add(class065842);
                    break;
                }
                case field_40192: {
                    this.displayStacks.add(class065842);
                    break;
                }
                case field_40193: {
                    this.searchTabStacks.add(class065842);
                }
            }
        }
    }

    private static void checkStack(class06584 class065842) {
        if (class065842.R()) {
            throw new IllegalArgumentException("Cannot add empty stack");
        }
        if (class065842.c() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1 for stack: " + String.valueOf(class065842));
        }
    }

    private Collection<class06584> getEnabledStacks(Collection<class06584> collection) {
        if (collection.stream().allMatch(this::isEnabled)) {
            return collection;
        }
        return collection.stream().filter(this::isEnabled).toList();
    }

    private static void checkStacks(Collection<class06584> collection) {
        for (class06584 class065842 : collection) {
            FabricItemGroupEntries.checkStack(class065842);
        }
    }

    public List<class06584> getDisplayStacks() {
        return this.displayStacks;
    }

    public List<class06584> getSearchTabStacks() {
        return this.searchTabStacks;
    }
}

