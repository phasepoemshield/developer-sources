/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04206
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents
 *  net.fabricmc.fabric.api.registry.FlammableBlockRegistry
 *  net.fabricmc.fabric.api.registry.FlammableBlockRegistry$Entry
 */
package net.fabricmc.fabric.impl.content.registry;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class00891;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04206;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.FireBlockHooks;

public class FlammableBlockRegistryImpl
implements FlammableBlockRegistry {
    private static final FlammableBlockRegistry.Entry REMOVED = new FlammableBlockRegistry.Entry(0, 0);
    private static final Map<class00891, FlammableBlockRegistryImpl> REGISTRIES = new HashMap<class00891, FlammableBlockRegistryImpl>();
    private final Map<class00891, FlammableBlockRegistry.Entry> registeredEntriesBlock = new HashMap<class00891, FlammableBlockRegistry.Entry>();
    private final Map<class03530<class00891>, FlammableBlockRegistry.Entry> registeredEntriesTag = new HashMap<class03530<class00891>, FlammableBlockRegistry.Entry>();
    private volatile Map<class00891, FlammableBlockRegistry.Entry> computedEntries = null;
    private final class00891 key;

    private FlammableBlockRegistryImpl(class00891 class008912) {
        this.key = class008912;
        CommonLifecycleEvents.TAGS_LOADED.register((class010422, bl) -> {
            this.computedEntries = null;
        });
    }

    public void remove(class03530<class00891> class035302) {
        this.add(class035302, REMOVED);
    }

    public void remove(class00891 class008912) {
        this.add(class008912, REMOVED);
    }

    public FlammableBlockRegistry.Entry get(class00891 class008912) {
        FlammableBlockRegistry.Entry entry = this.getEntryMap().get(class008912);
        if (entry != null) {
            return entry;
        }
        return ((FireBlockHooks)this.key).fabric_getVanillaEntry(class008912.W());
    }

    public void clear(class00891 class008912) {
        this.registeredEntriesBlock.remove(class008912);
        this.computedEntries = null;
    }

    public void clear(class03530<class00891> class035302) {
        this.registeredEntriesTag.remove(class035302);
        this.computedEntries = null;
    }

    public void add(class00891 class008912, FlammableBlockRegistry.Entry entry) {
        this.registeredEntriesBlock.put(class008912, entry);
        this.computedEntries = null;
    }

    public void add(class03530<class00891> class035302, FlammableBlockRegistry.Entry entry) {
        this.registeredEntriesTag.put(class035302, entry);
        this.computedEntries = null;
    }

    public static FlammableBlockRegistryImpl getInstance(class00891 class008912) {
        if (!(class008912 instanceof FireBlockHooks)) {
            throw new RuntimeException("Not a hookable fire block: " + String.valueOf(class008912));
        }
        return (FlammableBlockRegistryImpl)REGISTRIES.computeIfAbsent(class008912, FlammableBlockRegistryImpl::new);
    }

    private Map<class00891, FlammableBlockRegistry.Entry> getEntryMap() {
        Map<class00891, FlammableBlockRegistry.Entry> map = this.computedEntries;
        if (map == null) {
            map = new IdentityHashMap<class00891, FlammableBlockRegistry.Entry>();
            for (class03530<class00891> class035302 : this.registeredEntriesTag.keySet()) {
                FlammableBlockRegistry.Entry entry = this.registeredEntriesTag.get(class035302);
                for (class03556 class035562 : class04206.i.u(class035302)) {
                    map.put((class00891)class035562.N(), entry);
                }
            }
            map.putAll(this.registeredEntriesBlock);
            this.computedEntries = map;
        }
        return map;
    }

    public FlammableBlockRegistry.Entry getFabric(class00891 class008912) {
        return this.getEntryMap().get(class008912);
    }
}

