/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenCustomHashMap
 *  minecraft.class00717
 *  minecraft.class04197
 *  minecraft.class04218
 *  minecraft.class06584
 */
package net.caffeinemc.mods.lithium.common.entity.item;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenCustomHashMap;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import minecraft.class00717;
import minecraft.class04197;
import minecraft.class04218;
import minecraft.class06584;
import net.caffeinemc.mods.lithium.common.entity.item.ItemEntityList$1;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$CountChangeSubscriber;

public class ItemEntityList
extends AbstractList<class00717>
implements ChangeSubscriber$CountChangeSubscriber<class00717> {
    private static final Hash.Strategy<class06584> STRATEGY = new ItemEntityList$1();
    public static final int UPGRADE_THRESHOLD = 10;
    private final ArrayList<class00717> delegate;
    private final ArrayList<class00717> delegateWithNulls;
    private final Object2ReferenceOpenCustomHashMap<class06584, IntArrayList> elementsByCategory;
    private final Object2ReferenceOpenCustomHashMap<class06584, IntArrayList> maxHalfFullElementsByCategory;
    private final IntOpenHashSet tempUncategorizedElements;

    public ItemEntityList(ArrayList<class00717> arrayList) {
        this.delegate = arrayList;
        this.delegateWithNulls = new ArrayList<class00717>(arrayList);
        this.elementsByCategory = new Object2ReferenceOpenCustomHashMap(STRATEGY);
        this.maxHalfFullElementsByCategory = new Object2ReferenceOpenCustomHashMap(STRATEGY);
        this.tempUncategorizedElements = new IntOpenHashSet();
        for (int i = 0; i < this.delegateWithNulls.size(); ++i) {
            class00717 class007172 = this.delegateWithNulls.get(i);
            this.addToCategories(class007172, i, false);
            this.subscribeElement(class007172, i);
        }
    }

    @Override
    public class00717 remove(int n) {
        class00717 class007172 = this.delegate.remove(n);
        if (class007172 != null) {
            this.processOutdated();
            this.removeElement(class007172);
        }
        return class007172;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl = this.delegate.remove(object);
        if (bl && object instanceof class00717) {
            class00717 class007172 = (class00717)object;
            this.processOutdated();
            this.removeElement(class007172);
        }
        return bl;
    }

    @Override
    public int size() {
        return this.delegate.size();
    }

    @Override
    public class00717 get(int n) {
        return this.delegate.get(n);
    }

    @Override
    public boolean equals(Object object) {
        return this.delegate.equals(object);
    }

    @Override
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override
    public int indexOf(Object object) {
        return this.delegate.indexOf(object);
    }

    @Override
    public void clear() {
        for (class00717 class007172 : this.delegate) {
            this.unsubscribeElement(class007172);
        }
        this.delegate.clear();
        this.tempUncategorizedElements.clear();
        this.delegateWithNulls.clear();
        this.elementsByCategory.clear();
        this.maxHalfFullElementsByCategory.clear();
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.delegate.lastIndexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override
    public boolean add(class00717 class007172) {
        this.processOutdated();
        if (class007172.N().R()) {
            this.delegateWithNulls.add(null);
        } else {
            int n = this.delegateWithNulls.size();
            this.delegateWithNulls.add(class007172);
            this.addToCategories(class007172, n, false);
            this.subscribeElement(class007172, n);
        }
        return this.delegate.add(class007172);
    }

    @Override
    public Object[] toArray() {
        return this.delegate.toArray();
    }

    @Override
    public <U> U[] toArray(U[] UArray) {
        return this.delegate.toArray(UArray);
    }

    @Override
    public <U> U[] toArray(IntFunction<U[]> intFunction) {
        return this.delegate.toArray(intFunction);
    }

    @Override
    public Stream<class00717> stream() {
        return this.delegate.stream();
    }

    @Override
    public boolean contains(Object object) {
        return this.delegate.contains(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public class00717 set(int n, class00717 class007172) {
        class00717 class007173 = this.delegate.set(n, class007172);
        if (class007173 != class007172) {
            int n2;
            this.processOutdated();
            if (class007173.N().R()) {
                if (this.delegateWithNulls.size() != this.delegate.size()) {
                    this.reinitialize();
                    return class007173;
                }
                n2 = n;
            } else {
                n2 = this.unsubscribeElement(class007173);
                this.removeFromCategories(class007173, n2);
            }
            if (class007172.N().R()) {
                this.delegateWithNulls.set(n2, null);
                return class007173;
            }
            class00717 class007174 = this.delegateWithNulls.set(n2, class007172);
            this.addToCategories(class007172, n2, true);
            this.subscribeElement(class007172, n2);
            if (class007174 != null && class007174 != class007173 && !class007174.N().R()) {
                throw new IllegalStateException("Element mismatch, expected " + String.valueOf(class007173) + " but got " + String.valueOf(class007174));
            }
        }
        return class007173;
    }

    @Override
    public void forEach(Consumer<? super class00717> consumer) {
        this.delegate.forEach((Consumer<class00717>)consumer);
    }

    @Override
    public Stream<class00717> parallelStream() {
        return this.delegate.parallelStream();
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.delegate.containsAll(collection);
    }

    private void reinitialize() {
        for (class00717 class007172 : this.delegate) {
            this.unsubscribeElement(class007172);
        }
        this.tempUncategorizedElements.clear();
        this.delegateWithNulls.clear();
        this.elementsByCategory.clear();
        this.maxHalfFullElementsByCategory.clear();
        int n = 0;
        for (int i = 0; i < this.delegate.size(); ++i) {
            class00717 class007173 = this.delegate.get(i);
            if (class007173.N().R()) continue;
            this.delegateWithNulls.add(class007173);
            this.addToCategories(class007173, n, false);
            this.subscribeElement(class007173, n);
            ++n;
        }
    }

    private void removeElement(class00717 class007172) {
        int n;
        if (!class007172.N().R()) {
            n = this.unsubscribeElement(class007172);
            if (n == this.delegateWithNulls.size() - 1) {
                class00717 class007173 = this.delegateWithNulls.remove(n);
                if (class007173 != class007172) {
                    throw new IllegalStateException("Element mismatch, expected " + String.valueOf(class007172) + " but got " + String.valueOf(class007173));
                }
            } else {
                this.delegateWithNulls.set(n, null);
            }
            this.removeFromCategories(class007172, n);
        }
        if ((n = this.delegateWithNulls.size()) > 64 && n > this.delegate.size() * 2) {
            this.reinitialize();
        }
    }

    @Override
    public void lithium$notifyCount(class00717 class007172, int n, int n2) {
        boolean bl;
        this.processOutdated();
        class06584 class065842 = class007172.N();
        if (n2 <= 0) {
            this.removeFromCategories(class007172, n);
            return;
        }
        boolean bl2 = ItemEntityList.isMaxHalfFull(class065842);
        if (bl2 != (bl = ItemEntityList.isMaxHalfFull(n2, class065842.U()))) {
            if (bl) {
                ItemEntityList.addToCategoryList(n, class065842, null, this.maxHalfFullElementsByCategory, true);
            } else {
                ItemEntityList.removeFromCategoryList(this.maxHalfFullElementsByCategory, class065842, n);
            }
        }
    }

    @Override
    public void lithium$forceUnsubscribe(class00717 class007172, int n) {
        this.markElementAsOutdated(class007172, n);
    }

    @Override
    public void lithium$notify(class00717 class007172, int n) {
        this.markElementAsOutdated(class007172, n);
    }

    private int unsubscribeElement(class00717 class007172) {
        return ((ChangePublisher)class007172).lithium$unsubscribe(this);
    }

    protected void processOutdated() {
        if (this.tempUncategorizedElements.isEmpty()) {
            return;
        }
        this.tempUncategorizedElements.forEach(n -> {
            class00717 class007172 = this.delegateWithNulls.get(n);
            if (class007172 != null) {
                if (class007172.N().R()) {
                    this.delegateWithNulls.set(n, null);
                    this.unsubscribeElement(class007172);
                } else {
                    this.addToCategories(class007172, n, true);
                }
            }
        });
        this.tempUncategorizedElements.clear();
    }

    private static boolean isMaxHalfFull(int n, int n2) {
        return n * 2 <= n2;
    }

    private static boolean isMaxHalfFull(class06584 class065842) {
        int n = class065842.c();
        int n2 = class065842.U();
        return ItemEntityList.isMaxHalfFull(n, n2);
    }

    private void addToCategories(class00717 class007172, int n, boolean bl) {
        class06584 class065842 = class007172.N();
        if (class065842.R()) {
            return;
        }
        class06584 class065843 = ItemEntityList.addToCategoryList(n, class065842, null, this.elementsByCategory, bl);
        if (ItemEntityList.isMaxHalfFull(class065842)) {
            ItemEntityList.addToCategoryList(n, class065842, class065843, this.maxHalfFullElementsByCategory, bl);
        }
    }

    private void subscribeElement(class00717 class007172, int n) {
        ((ChangePublisher)class007172).lithium$subscribe(this, n);
    }

    private static class06584 addToCategoryList(int n, class06584 class065842, class06584 class065843, Object2ReferenceOpenCustomHashMap<class06584, IntArrayList> object2ReferenceOpenCustomHashMap, boolean bl) {
        if (class065842.R()) {
            return class065843;
        }
        IntArrayList intArrayList = (IntArrayList)object2ReferenceOpenCustomHashMap.get((Object)class065842);
        if (intArrayList == null) {
            if (class065843 == null) {
                class065843 = class065842.t();
            }
            intArrayList = new IntArrayList();
            object2ReferenceOpenCustomHashMap.put((Object)class065843, (Object)intArrayList);
        }
        if (bl) {
            int n2 = Collections.binarySearch(intArrayList, n);
            n2 = -(n2 + 1);
            intArrayList.add(n2, n);
        } else {
            intArrayList.add(n);
        }
        return class065843;
    }

    private class04218 consumeElements(class04197<class00717> class041972, IntArrayList intArrayList) {
        if (intArrayList == null) {
            return class04218.field_41283;
        }
        int n = this.modCount;
        int n2 = intArrayList.size();
        for (int i = 0; i < n2; ++i) {
            if (n != this.modCount) {
                throw new ConcurrentModificationException("Collection was modified during iteration!");
            }
            class00717 class007172 = this.delegateWithNulls.get(intArrayList.getInt(i));
            class04218 class042182 = class041972.accept((Object)class007172);
            if (class042182 == class04218.field_41283) continue;
            return class042182;
        }
        return class04218.field_41283;
    }

    private void removeFromCategories(class00717 class007172, int n) {
        class06584 class065842 = class007172.N();
        if (class065842.R()) {
            return;
        }
        ItemEntityList.removeFromCategoryList(this.elementsByCategory, class065842, n);
        if (ItemEntityList.isMaxHalfFull(class065842)) {
            ItemEntityList.removeFromCategoryList(this.maxHalfFullElementsByCategory, class065842, n);
        }
    }

    public class04218 consumeForEntityStacking(class00717 class007172, class04197<class00717> class041972) {
        this.processOutdated();
        class06584 class065842 = class007172.N();
        int n = class065842.c();
        int n2 = class065842.U();
        if (n * 2 >= n2) {
            return this.consumeElements(class041972, (IntArrayList)this.maxHalfFullElementsByCategory.get((Object)class065842));
        }
        return this.consumeElements(class041972, (IntArrayList)this.elementsByCategory.get((Object)class065842));
    }

    private static void removeFromCategoryList(Object2ReferenceOpenCustomHashMap<class06584, IntArrayList> object2ReferenceOpenCustomHashMap, class06584 class065842, int n) {
        IntArrayList intArrayList = (IntArrayList)object2ReferenceOpenCustomHashMap.get((Object)class065842);
        if (intArrayList != null) {
            intArrayList.rem(n);
            if (intArrayList.isEmpty()) {
                object2ReferenceOpenCustomHashMap.remove((Object)class065842);
            }
        }
    }

    protected void markElementAsOutdated(class00717 class007172, int n) {
        boolean bl = this.tempUncategorizedElements.add(n);
        if (bl) {
            this.removeFromCategories(class007172, n);
        }
    }
}

