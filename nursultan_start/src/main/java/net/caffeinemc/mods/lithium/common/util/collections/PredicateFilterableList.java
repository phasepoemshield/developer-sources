/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  net.caffeinemc.mods.lithium.common.util.collections.ListeningList
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.ArrayList;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.util.collections.ListeningList;
import net.caffeinemc.mods.lithium.common.util.collections.PredicateFilterableList$PredicateFilteredList;

public class PredicateFilterableList<T>
extends ListeningList<T> {
    private Reference2ReferenceOpenHashMap<Predicate<T>, PredicateFilterableList$PredicateFilteredList> predicateToFiltered;

    protected void onChange() {
        this.predicateToFiltered = null;
    }

    public PredicateFilterableList() {
        super(new ArrayList(), null);
    }

    public PredicateFilterableList$PredicateFilteredList getFiltered(Predicate<T> predicate2) {
        if (this.predicateToFiltered == null) {
            this.predicateToFiltered = new Reference2ReferenceOpenHashMap();
        }
        return (PredicateFilterableList$PredicateFilteredList)this.predicateToFiltered.computeIfAbsent(predicate2, predicate -> new PredicateFilterableList$PredicateFilteredList(this, predicate));
    }
}

