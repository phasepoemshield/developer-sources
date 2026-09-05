/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap
 *  minecraft.class00962
 *  minecraft.class01894
 *  minecraft.class04410
 *  minecraft.class06166
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleRendererRegistry
 *  net.fabricmc.fabric.impl.base.toposort.NodeSorting
 *  net.fabricmc.fabric.impl.base.toposort.SortableNode
 *  net.fabricmc.fabric.mixin.client.particle.ParticleEngineAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.particle;

import it.unimi.dsi.fastutil.objects.Reference2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class00962;
import minecraft.class01894;
import minecraft.class04410;
import minecraft.class06166;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRendererRegistry;
import net.fabricmc.fabric.impl.base.toposort.NodeSorting;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;
import net.fabricmc.fabric.impl.client.particle.ParticleRendererRegistryImpl$ParticleTextureNode;
import net.fabricmc.fabric.mixin.client.particle.ParticleEngineAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ParticleRendererRegistryImpl {
    public static final ParticleRendererRegistryImpl INSTANCE = new ParticleRendererRegistryImpl(ParticleEngineAccessor.getParticleTextureSheets());
    private final List<class06166> textureSheets;
    private final Map<class01894, ParticleRendererRegistryImpl$ParticleTextureNode> nodes = new HashMap<class01894, ParticleRendererRegistryImpl$ParticleTextureNode>();
    private final IdentityHashMap<class06166, Function<class04410, class00962<?>>> factories = new IdentityHashMap();

    public ParticleRendererRegistryImpl(List<class06166> list) {
        ArrayList<class06166> arrayList = new ArrayList<class06166>(list);
        this.textureSheets = list;
        class01894 class018942 = null;
        for (class06166 class061662 : this.textureSheets) {
            class01894 class018943 = ParticleRendererRegistry.getId((class06166)class061662);
            this.nodes.put(class018943, new ParticleRendererRegistryImpl$ParticleTextureNode(class061662));
            if (class018942 != null) {
                ParticleRendererRegistryImpl$ParticleTextureNode.link((SortableNode)this.nodes.get(class018942), (SortableNode)this.nodes.get(class018943));
            }
            class018942 = class018943;
        }
        this.sort();
        ParticleRendererRegistryImpl.assertIdentical(list, arrayList);
    }

    public @Nullable Function<class04410, class00962<?>> getFactory(class06166 class061662) {
        return this.factories.get(class061662);
    }

    public void register(class06166 class061662, Function<class04410, class00962<?>> function) {
        class01894 class018942 = ParticleRendererRegistry.getId((class06166)class061662);
        if (this.nodes.containsKey(class018942)) {
            throw new IllegalArgumentException("A ParticleTextureSheet with the id " + String.valueOf(class018942) + " has already been registered.");
        }
        if (this.factories.containsKey(class061662)) {
            throw new IllegalArgumentException("The specified ParticleTextureSheet instance has already been registered.");
        }
        ParticleRendererRegistryImpl$ParticleTextureNode particleRendererRegistryImpl$ParticleTextureNode = new ParticleRendererRegistryImpl$ParticleTextureNode(class018942, class061662);
        this.nodes.put(class018942, particleRendererRegistryImpl$ParticleTextureNode);
        this.textureSheets.add(class061662);
        this.factories.put(class061662, function);
        this.sort();
    }

    private void sort() {
        ArrayList<ParticleRendererRegistryImpl$ParticleTextureNode> arrayList = new ArrayList<ParticleRendererRegistryImpl$ParticleTextureNode>(this.nodes.values());
        NodeSorting.sort(arrayList, (String)"particle texture sheets", Comparator.comparing(particleRendererRegistryImpl$ParticleTextureNode -> particleRendererRegistryImpl$ParticleTextureNode.id));
        Reference2IntLinkedOpenHashMap reference2IntLinkedOpenHashMap = new Reference2IntLinkedOpenHashMap();
        for (int i = 0; i < arrayList.size(); ++i) {
            reference2IntLinkedOpenHashMap.put((Object)((ParticleRendererRegistryImpl$ParticleTextureNode)((Object)arrayList.get((int)i))).textureSheet, i);
        }
        this.textureSheets.sort(Comparator.comparingInt(arg_0 -> ((Reference2IntMap)reference2IntLinkedOpenHashMap).getInt(arg_0)));
    }

    public @Nullable class06166 getParticleTextureSheet(class01894 class018942) {
        Objects.requireNonNull(class018942);
        ParticleRendererRegistryImpl$ParticleTextureNode particleRendererRegistryImpl$ParticleTextureNode = this.nodes.get(class018942);
        return particleRendererRegistryImpl$ParticleTextureNode != null ? particleRendererRegistryImpl$ParticleTextureNode.textureSheet : null;
    }

    private static void assertIdentical(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            throw new AssertionError((Object)("Lists differ in size: " + list.size() + " != " + list2.size()));
        }
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) != list2.get(i)) {
                throw new AssertionError((Object)("Lists differ at index " + i + ": " + String.valueOf(list.get(i)) + " != " + String.valueOf(list2.get(i))));
            }
        }
    }

    public void registerOrdering(class01894 class018942, class01894 class018943) {
        Objects.requireNonNull(class018942);
        Objects.requireNonNull(class018943);
        ParticleRendererRegistryImpl$ParticleTextureNode particleRendererRegistryImpl$ParticleTextureNode = this.nodes.get(class018942);
        ParticleRendererRegistryImpl$ParticleTextureNode particleRendererRegistryImpl$ParticleTextureNode2 = this.nodes.get(class018943);
        if (particleRendererRegistryImpl$ParticleTextureNode == null) {
            throw new IllegalArgumentException("The specified first id " + String.valueOf(class018942) + " does not correspond to a registered ParticleTextureSheet.");
        }
        if (particleRendererRegistryImpl$ParticleTextureNode2 == null) {
            throw new IllegalArgumentException("The specified second id " + String.valueOf(class018943) + " does not correspond to a registered ParticleTextureSheet.");
        }
        ParticleRendererRegistryImpl$ParticleTextureNode.link((SortableNode)particleRendererRegistryImpl$ParticleTextureNode, (SortableNode)particleRendererRegistryImpl$ParticleTextureNode2);
        this.sort();
    }
}

