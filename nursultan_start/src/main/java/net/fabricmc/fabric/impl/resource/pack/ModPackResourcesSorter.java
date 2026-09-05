/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.resource.v1.pack.ModPackResources
 *  net.fabricmc.fabric.impl.base.toposort.NodeSorting
 *  net.fabricmc.fabric.impl.base.toposort.SortableNode
 */
package net.fabricmc.fabric.impl.resource.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.fabricmc.fabric.api.resource.v1.pack.ModPackResources;
import net.fabricmc.fabric.impl.base.toposort.NodeSorting;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesSorter$LoadPhaseData;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil$Order;

public class ModPackResourcesSorter {
    private final Object lock = new Object();
    private ModPackResources[] packs;
    private final Map<String, ModPackResourcesSorter$LoadPhaseData> phases = new LinkedHashMap<String, ModPackResourcesSorter$LoadPhaseData>();
    private final List<ModPackResourcesSorter$LoadPhaseData> sortedPhases = new ArrayList<ModPackResourcesSorter$LoadPhaseData>();

    private ModPackResourcesSorter$LoadPhaseData getOrCreatePhase(String string, boolean bl) {
        ModPackResourcesSorter$LoadPhaseData modPackResourcesSorter$LoadPhaseData2 = this.phases.get(string);
        if (modPackResourcesSorter$LoadPhaseData2 == null) {
            modPackResourcesSorter$LoadPhaseData2 = new ModPackResourcesSorter$LoadPhaseData(string);
            this.phases.put(string, modPackResourcesSorter$LoadPhaseData2);
            this.sortedPhases.add(modPackResourcesSorter$LoadPhaseData2);
            if (bl) {
                NodeSorting.sort(this.sortedPhases, (String)"mod resource packs", Comparator.comparing(modPackResourcesSorter$LoadPhaseData -> modPackResourcesSorter$LoadPhaseData.modId));
            }
        }
        return modPackResourcesSorter$LoadPhaseData2;
    }

    ModPackResourcesSorter() {
        this.packs = new ModPackResources[0];
    }

    private void rebuildPackList(int n) {
        if (this.sortedPhases.size() == 1) {
            this.packs = ((ModPackResourcesSorter$LoadPhaseData)((Object)this.sortedPhases.getFirst())).packs;
        } else {
            ModPackResources[] modPackResourcesArray = new ModPackResources[n];
            int n2 = 0;
            for (ModPackResourcesSorter$LoadPhaseData modPackResourcesSorter$LoadPhaseData : this.sortedPhases) {
                int n3 = modPackResourcesSorter$LoadPhaseData.packs.length;
                System.arraycopy(modPackResourcesSorter$LoadPhaseData.packs, 0, modPackResourcesArray, n2, n3);
                n2 += n3;
            }
            this.packs = modPackResourcesArray;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addLoadOrdering(String string, String string2, ModPackResourcesUtil$Order modPackResourcesUtil$Order) {
        Objects.requireNonNull(string, "Tried to add an ordering for a null phase.");
        Objects.requireNonNull(string2, "Tried to add an ordering for a null phase.");
        if (string.equals(string2)) {
            throw new IllegalArgumentException("Tried to add a phase that depends on itself.");
        }
        Object object = this.lock;
        synchronized (object) {
            ModPackResourcesSorter$LoadPhaseData modPackResourcesSorter$LoadPhaseData2 = this.getOrCreatePhase(string, false);
            ModPackResourcesSorter$LoadPhaseData modPackResourcesSorter$LoadPhaseData3 = this.getOrCreatePhase(string2, false);
            switch (modPackResourcesUtil$Order) {
                case BEFORE: {
                    ModPackResourcesSorter$LoadPhaseData.link((SortableNode)modPackResourcesSorter$LoadPhaseData2, (SortableNode)modPackResourcesSorter$LoadPhaseData3);
                    break;
                }
                case AFTER: {
                    ModPackResourcesSorter$LoadPhaseData.link((SortableNode)modPackResourcesSorter$LoadPhaseData3, (SortableNode)modPackResourcesSorter$LoadPhaseData2);
                }
            }
            NodeSorting.sort(this.sortedPhases, (String)"event phases", Comparator.comparing(modPackResourcesSorter$LoadPhaseData -> modPackResourcesSorter$LoadPhaseData.modId));
            this.rebuildPackList(this.packs.length);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addPack(ModPackResources modPackResources) {
        Objects.requireNonNull(modPackResources, "Can't register a null pack");
        String string = modPackResources.method_14409();
        Objects.requireNonNull(string, "Can't register a pack without a mod id");
        Object object = this.lock;
        synchronized (object) {
            this.getOrCreatePhase(string, true).addPack(modPackResources);
            this.rebuildPackList(this.packs.length + 1);
        }
    }

    public List<ModPackResources> getPacks() {
        return Collections.unmodifiableList(Arrays.asList(this.packs));
    }
}

