/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01061
 *  minecraft.class01081
 *  minecraft.class01090
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02268
 *  net.fabricmc.fabric.api.resource.v1.ResourceLoader
 *  net.fabricmc.fabric.api.resource.v1.pack.PackActivationType
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys
 *  net.fabricmc.fabric.api.util.TriState
 *  net.fabricmc.fabric.impl.base.toposort.NodeSorting
 *  net.fabricmc.fabric.impl.base.toposort.SortableNode
 *  net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource
 *  net.fabricmc.fabric.impl.resource.pack.ModNioPackResources
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package net.fabricmc.fabric.impl.resource;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01061;
import minecraft.class01081;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02268;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.fabric.impl.base.toposort.NodeSorting;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;
import net.fabricmc.fabric.impl.resource.DataResourceLoaderImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl$1;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl$BuiltinPackResourcesEntry;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl$ReloaderOrder;
import net.fabricmc.fabric.impl.resource.ResourceReloaderPhaseData;
import net.fabricmc.fabric.impl.resource.ResourceReloaderPhaseData$AfterVanilla;
import net.fabricmc.fabric.impl.resource.ResourceReloaderPhaseData$VanillaStatus;
import net.fabricmc.fabric.impl.resource.SetupMarkerResourceReloader;
import net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public sealed class ResourceLoaderImpl
implements ResourceLoader
permits DataResourceLoaderImpl {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Map<class01603, ResourceLoaderImpl> IMPL_MAP = new EnumMap<class01603, ResourceLoaderImpl>(class01603.class);
    private static final Set<ResourceLoaderImpl$BuiltinPackResourcesEntry> BUILTIN_PACK_RESOURCES = new HashSet<ResourceLoaderImpl$BuiltinPackResourcesEntry>();
    private static final boolean DEBUG_RELOADERS_IDENTITY = TriState.fromSystemProperty((String)"fabric.resource_loader.debug.reloaders_identity").orElse(FabricLoader.getInstance().isDevelopmentEnvironment());
    public static final boolean DEBUG_PROFILE_RESOURCE_RELOADERS = Boolean.getBoolean("fabric.resource_loader.debug.profile_resource_reloaders");
    private static final boolean DEBUG_RELOADERS_ORDER = Boolean.getBoolean("fabric.resource_loader.debug.reloaders_order");
    private final Map<class01894, class01081> addedReloaders = new LinkedHashMap<class01894, class01081>();
    private final Set<ResourceLoaderImpl$ReloaderOrder> reloadersOrdering = new LinkedHashSet<ResourceLoaderImpl$ReloaderOrder>();
    private final class01603 type;

    ResourceLoaderImpl(class01603 class016032) {
        this.type = class016032;
    }

    public static ResourceLoaderImpl get(class01603 class016032) {
        return (ResourceLoaderImpl)IMPL_MAP.computeIfAbsent(class016032, class016033 -> class016033 == class01603.field_14190 ? DataResourceLoaderImpl.INSTANCE : new ResourceLoaderImpl(class016032));
    }

    public static List<class01081> sort(class01603 class016032, List<class01081> list) {
        if (class016032 == null) {
            return list;
        }
        ResourceLoaderImpl resourceLoaderImpl = ResourceLoaderImpl.get(class016032);
        ArrayList<class01081> arrayList = new ArrayList<class01081>(list);
        resourceLoaderImpl.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void sort(List<class01081> list) {
        ResourceReloaderPhaseData resourceReloaderPhaseData2;
        Object object2;
        Object object3;
        SetupMarkerResourceReloader setupMarkerResourceReloader = this.extractSetupMarker(list);
        Set<Map.Entry<class01894, class01081>> set = this.collectReloadersToAdd(setupMarkerResourceReloader);
        set.stream().map(Map.Entry::getValue).forEach(list::remove);
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
        Iterator<class01081> iterator = list.iterator();
        ResourceReloaderPhaseData resourceReloaderPhaseData3 = new ResourceReloaderPhaseData(ResourceReloaderKeys.BEFORE_VANILLA, null);
        resourceReloaderPhaseData3.setVanillaStatus(ResourceReloaderPhaseData$VanillaStatus.VANILLA);
        object2ObjectOpenHashMap.put((Object)resourceReloaderPhaseData3.id, (Object)resourceReloaderPhaseData3);
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object2 = this.getResourceReloaderIdForSorting((class01081)object3);
            ResourceReloaderPhaseData object4 = new ResourceReloaderPhaseData((class01894)object2, (class01081)object3);
            object4.setVanillaStatus(ResourceReloaderPhaseData$VanillaStatus.VANILLA);
            object2ObjectOpenHashMap.put(object2, (Object)object4);
            SortableNode.link((SortableNode)resourceReloaderPhaseData3, (SortableNode)object4);
            resourceReloaderPhaseData3 = object4;
        }
        object3 = new ResourceReloaderPhaseData$AfterVanilla(ResourceReloaderKeys.AFTER_VANILLA);
        object2ObjectOpenHashMap.put((Object)object3.id, object3);
        SortableNode.link((SortableNode)resourceReloaderPhaseData3, (SortableNode)object3);
        for (Map.Entry entry : set) {
            resourceReloaderPhaseData2 = new ResourceReloaderPhaseData((class01894)entry.getKey(), (class01081)entry.getValue());
            object2ObjectOpenHashMap.put((Object)resourceReloaderPhaseData2.id, (Object)resourceReloaderPhaseData2);
        }
        for (ResourceLoaderImpl$ReloaderOrder resourceLoaderImpl$ReloaderOrder : this.reloadersOrdering) {
            ResourceReloaderPhaseData resourceReloaderPhaseData4;
            resourceReloaderPhaseData2 = (ResourceReloaderPhaseData)((Object)object2ObjectOpenHashMap.get((Object)resourceLoaderImpl$ReloaderOrder.first));
            if (resourceReloaderPhaseData2 == null || (resourceReloaderPhaseData4 = (ResourceReloaderPhaseData)((Object)object2ObjectOpenHashMap.get((Object)resourceLoaderImpl$ReloaderOrder.second))) == null) continue;
            SortableNode.link((SortableNode)resourceReloaderPhaseData2, (SortableNode)resourceReloaderPhaseData4);
        }
        for (ResourceReloaderPhaseData resourceReloaderPhaseData5 : object2ObjectOpenHashMap.values()) {
            if (resourceReloaderPhaseData5 == object3 || resourceReloaderPhaseData5.vanillaStatus != ResourceReloaderPhaseData$VanillaStatus.NONE && resourceReloaderPhaseData5.vanillaStatus != ResourceReloaderPhaseData$VanillaStatus.AFTER) continue;
            SortableNode.link((SortableNode)object3, (SortableNode)resourceReloaderPhaseData5);
        }
        object2 = new ArrayList(object2ObjectOpenHashMap.values());
        NodeSorting.sort((List)object2, (String)"resource reloaders", Comparator.comparing(resourceReloaderPhaseData -> resourceReloaderPhaseData.id));
        list.clear();
        if (setupMarkerResourceReloader != null) {
            list.add((class01081)setupMarkerResourceReloader);
        }
        Iterator iterator2 = ((ArrayList)object2).iterator();
        while (iterator2.hasNext()) {
            resourceReloaderPhaseData2 = (ResourceReloaderPhaseData)((Object)iterator2.next());
            if (resourceReloaderPhaseData2.resourceReloader == null) continue;
            list.add(resourceReloaderPhaseData2.resourceReloader);
        }
        if (DEBUG_RELOADERS_ORDER) {
            LOGGER.info("Sorted reloaders: {}", (Object)object2.stream().map(resourceReloaderPhaseData -> {
                Object object = resourceReloaderPhaseData.id.toString();
                if (resourceReloaderPhaseData.resourceReloader == null) {
                    object = (String)object + " (virtual)";
                }
                return object;
            }).collect(Collectors.joining(", ")));
        }
    }

    public static boolean registerBuiltinPack(class01894 class018942, String string, ModContainer modContainer, class00392 class003922, PackActivationType packActivationType) {
        List list = modContainer.getRootPaths();
        String string2 = ((Path)list.getFirst()).getFileSystem().getSeparator();
        string = string.replace("/", string2);
        ModNioPackResources modNioPackResources = ModNioPackResources.create((String)class018942.toString(), (ModContainer)modContainer, (String)string, (class01603)class01603.field_14188, (PackActivationType)packActivationType, (boolean)false);
        ModNioPackResources modNioPackResources2 = ModNioPackResources.create((String)class018942.toString(), (ModContainer)modContainer, (String)string, (class01603)class01603.field_14190, (PackActivationType)packActivationType, (boolean)false);
        if (modNioPackResources == null && modNioPackResources2 == null) {
            return false;
        }
        if (modNioPackResources != null) {
            BUILTIN_PACK_RESOURCES.add(new ResourceLoaderImpl$BuiltinPackResourcesEntry(class003922, modNioPackResources));
        }
        if (modNioPackResources2 != null) {
            BUILTIN_PACK_RESOURCES.add(new ResourceLoaderImpl$BuiltinPackResourcesEntry(class003922, modNioPackResources2));
        }
        return true;
    }

    public static boolean registerBuiltinPack(class01894 class018942, String string, ModContainer modContainer, PackActivationType packActivationType) {
        return ResourceLoaderImpl.registerBuiltinPack(class018942, string, modContainer, (class00392)class00392.y((String)(class018942.y() + "/" + class018942.N())), packActivationType);
    }

    protected boolean hasResourceReloader(class01894 class018942) {
        return this.addedReloaders.containsKey(class018942);
    }

    public void addReloaderOrdering(class01894 class018942, class01894 class018943) {
        Objects.requireNonNull(class018942, "The first reloader identifier should not be null.");
        Objects.requireNonNull(class018943, "The second reloader identifier should not be null.");
        if (class018942.equals((Object)class018943)) {
            throw new IllegalArgumentException("Tried to add a phase that depends on itself.");
        }
        this.reloadersOrdering.add(new ResourceLoaderImpl$ReloaderOrder(class018942, class018943));
    }

    protected Set<Map.Entry<class01894, class01081>> collectReloadersToAdd(@Nullable SetupMarkerResourceReloader setupMarkerResourceReloader) {
        return new LinkedHashSet<Map.Entry<class01894, class01081>>(this.addedReloaders.entrySet());
    }

    protected final void checkUniqueResourceReloader(class01894 class018942) {
        if (this.hasResourceReloader(class018942)) {
            throw new IllegalStateException("Tried to register resource reloader %s twice!".formatted(new Object[]{class018942}));
        }
    }

    private class01894 getResourceReloaderIdForSorting(class01081 class010812) {
        if (class010812 instanceof FabricResourceReloader) {
            FabricResourceReloader fabricResourceReloader = (FabricResourceReloader)class010812;
            return fabricResourceReloader.fabric$getId();
        }
        if (DEBUG_RELOADERS_IDENTITY) {
            LOGGER.warn("The resource reloader at {} does not use identifiable registration making ordering support more difficult for other modders.", (Object)class010812.getClass().getName());
        }
        return class01894.N((String)"unknown", (String)("private/" + class010812.getClass().getName().replace(".", "/").replace("$", "_").toLowerCase(Locale.ROOT)));
    }

    public static void registerBuiltinResourcePacks(class01603 class016032, Consumer<class01055> consumer) {
        for (ResourceLoaderImpl$BuiltinPackResourcesEntry resourceLoaderImpl$BuiltinPackResourcesEntry : BUILTIN_PACK_RESOURCES) {
            ModNioPackResources modNioPackResources = resourceLoaderImpl$BuiltinPackResourcesEntry.packResources();
            if (modNioPackResources.method_14406(class016032).isEmpty()) continue;
            class02267 class022672 = new class02267(modNioPackResources.method_14409(), resourceLoaderImpl$BuiltinPackResourcesEntry.displayName(), (class01283)new BuiltinModResourcePackSource(modNioPackResources.getFabricModMetadata().getName()), modNioPackResources.N());
            class02268 class022682 = new class02268(modNioPackResources.getActivationType() == PackActivationType.ALWAYS_ENABLED, class01090.field_14280, false);
            class01055 class010552 = class01055.N((class02267)class022672, (class01061)new ResourceLoaderImpl$1(modNioPackResources), (class01603)class016032, (class02268)class022682);
            consumer.accept(class010552);
        }
    }

    private @Nullable SetupMarkerResourceReloader extractSetupMarker(List<class01081> list) {
        if (this.type == class01603.field_14188) {
            return null;
        }
        Iterator<class01081> iterator = list.iterator();
        while (iterator.hasNext()) {
            class01081 class010812 = iterator.next();
            if (!(class010812 instanceof SetupMarkerResourceReloader)) continue;
            SetupMarkerResourceReloader setupMarkerResourceReloader = (SetupMarkerResourceReloader)class010812;
            iterator.remove();
            return setupMarkerResourceReloader;
        }
        throw new IllegalStateException("No SetupMarkerResourceReloader found in reloaders!");
    }

    public void registerReloader(class01894 class018942, class01081 class010812) {
        Objects.requireNonNull(class018942, "The reloader identifier should not be null.");
        Objects.requireNonNull(class010812, "The reloader should not be null.");
        this.checkUniqueResourceReloader(class018942);
        for (Map.Entry<class01894, class01081> entry : this.addedReloaders.entrySet()) {
            if (entry.getValue() != class010812) continue;
            throw new IllegalStateException("Resource reloader with ID %s already in resource reloader set with ID %s!".formatted(new Object[]{class018942, entry.getKey()}));
        }
        this.addedReloaders.put(class018942, class010812);
    }
}

