/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  net.fabricmc.loader.api.ModContainer
 *  org.quiltmc.loader.api.ModContainer
 *  org.quiltmc.loader.api.ModContainer$BasicSourceType
 *  org.quiltmc.loader.api.ModContributor
 *  org.quiltmc.loader.api.ModMetadata
 *  org.quiltmc.loader.api.QuiltLoader
 */
package com.terraformersmc.modmenu.util.mod.quilt;

import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.terraformersmc.modmenu.util.UpdateCheckerUtil;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.ModContributor;
import org.quiltmc.loader.api.ModMetadata;
import org.quiltmc.loader.api.QuiltLoader;

public class QuiltMod
extends FabricMod {
    protected final ModContainer container;
    protected final ModMetadata metadata;

    public QuiltMod(net.fabricmc.loader.api.ModContainer modContainer, Set<String> set) {
        super(modContainer, set);
        this.container = (ModContainer)QuiltLoader.getModContainer((String)modContainer.getMetadata().getId()).get();
        this.metadata = this.container.metadata();
        if ("quilt_loader".equals(this.metadata.id())) {
            this.badges.add(Mod$Badge.LIBRARY);
        }
    }

    @Override
    public String getSha512Hash() throws IOException {
        String string = super.getSha512Hash();
        if (string == null) {
            UpdateCheckerUtil.LOGGER.debug("Checking {}", (Object)this.getId());
            if (this.container.getSourceType().equals((Object)ModContainer.BasicSourceType.NORMAL_QUILT) || this.container.getSourceType().equals((Object)ModContainer.BasicSourceType.NORMAL_FABRIC)) {
                for (List list : this.container.getSourcePaths()) {
                    Path path2;
                    List list2 = list.stream().filter(path -> path.toString().toLowerCase(Locale.ROOT).endsWith(".jar")).toList();
                    if (list2.size() != 1 || ((Path)list2.get(0)).getFileSystem() != FileSystems.getDefault() || !Files.exists(path2 = (Path)list2.get(0), new LinkOption[0])) continue;
                    UpdateCheckerUtil.LOGGER.debug("Found {} hash", (Object)this.getId());
                    return com.google.common.io.Files.asByteSource((File)path2.toFile()).hash(Hashing.sha512()).toString();
                }
            }
        }
        return string;
    }

    @Override
    public List<String> getAuthors() {
        List<String> list = this.metadata.contributors().stream().filter(modContributor -> modContributor.role().equals("Author") || modContributor.role().equals("Owner")).map(ModContributor::name).collect(Collectors.toList());
        if (list.isEmpty()) {
            this.metadata.contributors().stream().findFirst().ifPresent(modContributor -> list.add(modContributor.name()));
        }
        if (list.isEmpty()) {
            if ("minecraft".equals(this.getId())) {
                return Lists.newArrayList((Object[])new String[]{"Mojang Studios"});
            }
            if ("java".equals(this.getId())) {
                return Lists.newArrayList((Object[])new String[]{System.getProperty("java.vendor")});
            }
        }
        return list;
    }

    @Override
    public Map<String, Collection<String>> getContributors() {
        LinkedHashMap<String, Collection<String>> linkedHashMap = new LinkedHashMap<String, Collection<String>>();
        for (ModContributor modContributor : this.metadata.contributors()) {
            linkedHashMap.put(modContributor.name(), modContributor.roles());
        }
        return linkedHashMap;
    }

    @Override
    public SortedMap<String, Set<String>> getCredits() {
        TreeMap<String, Set<String>> treeMap = new TreeMap<String, Set<String>>();
        Map<String, Collection<String>> map = this.getContributors();
        for (Map.Entry<String, Collection<String>> entry : map.entrySet()) {
            for (String string2 : entry.getValue()) {
                treeMap.computeIfAbsent(string2, string -> new LinkedHashSet());
                ((Set)treeMap.get(string2)).add(entry.getKey());
            }
        }
        return treeMap;
    }
}

