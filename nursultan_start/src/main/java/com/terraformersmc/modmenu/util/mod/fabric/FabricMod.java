/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  minecraft.class08392
 *  minecraft.class08829
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ContactInformation
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.CustomValue$CvObject
 *  net.fabricmc.loader.api.metadata.CustomValue$CvType
 *  net.fabricmc.loader.api.metadata.ModEnvironment
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  net.fabricmc.loader.api.metadata.ModOrigin$Kind
 *  net.fabricmc.loader.api.metadata.Person
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.util.VersionUtil;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil;
import com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod$ModMenuData;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod$ModMenuData$DummyParentData;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import minecraft.class08392;
import minecraft.class08829;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ContactInformation;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModEnvironment;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.ModOrigin;
import net.fabricmc.loader.api.metadata.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricMod
implements Mod {
    private static Logger LOGGER = LoggerFactory.getLogger((String)"com.terraformersmc.modmenu.util.mod.fabric.FabricMod");
    protected final ModContainer container;
    protected final ModMetadata metadata;
    protected final FabricMod$ModMenuData modMenuData;
    protected final Set<Mod$Badge> badges;
    protected final Map<String, String> links = new HashMap<String, String>();
    protected UpdateChecker updateChecker = null;
    protected UpdateInfo updateInfo = null;
    protected boolean defaultIconWarning = true;
    protected boolean allowsUpdateChecks = true;
    protected boolean childHasUpdate = false;

    @Override
    public UpdateChecker getUpdateChecker() {
        return this.updateChecker;
    }

    public ModContainer getContainer() {
        return this.container;
    }

    public FabricMod(ModContainer modContainer, Set<String> set) {
        boolean bl;
        CustomValue customValue;
        this.container = modContainer;
        this.metadata = modContainer.getMetadata();
        String string = this.metadata.getId();
        if ("minecraft".equals(string) || "java".equals(string)) {
            this.allowsUpdateChecks = false;
        }
        Optional<String> optional = Optional.empty();
        FabricMod$ModMenuData$DummyParentData fabricMod$ModMenuData$DummyParentData = null;
        HashSet<String> hashSet = new HashSet<String>();
        CustomValue customValue2 = this.metadata.getCustomValue("modmenu");
        if (customValue2 != null && customValue2.getType() == CustomValue.CvType.OBJECT) {
            CustomValue.CvObject cvObject = customValue2.getAsObject();
            customValue = cvObject.get("parent");
            if (customValue != null) {
                if (customValue.getType() == CustomValue.CvType.STRING) {
                    optional = Optional.of(customValue.getAsString());
                } else if (customValue.getType() == CustomValue.CvType.OBJECT) {
                    try {
                        CustomValue.CvObject cvObject2 = customValue.getAsObject();
                        optional = CustomValueUtil.getString("id", cvObject2);
                        fabricMod$ModMenuData$DummyParentData = new FabricMod$ModMenuData$DummyParentData(optional.orElseThrow(() -> new RuntimeException("Parent object lacks an id")), CustomValueUtil.getString("name", cvObject2), CustomValueUtil.getString("description", cvObject2), CustomValueUtil.getString("icon", cvObject2), CustomValueUtil.getStringSet("badges", cvObject2).orElse(new HashSet()));
                        if (optional.orElse("").equals(string)) {
                            optional = Optional.empty();
                            fabricMod$ModMenuData$DummyParentData = null;
                            throw new RuntimeException("Mod declared itself as its own parent");
                        }
                    }
                    catch (Throwable throwable) {
                        LOGGER.error("Error loading parent data from mod: {}", (Object)string, (Object)throwable);
                    }
                }
            }
            hashSet.addAll(CustomValueUtil.getStringSet("badges", cvObject).orElse(new HashSet()));
            this.links.putAll(CustomValueUtil.getStringMap("links", cvObject).orElse(new HashMap()));
            this.allowsUpdateChecks = CustomValueUtil.getBoolean("update_checker", cvObject).orElse(true);
        }
        if ((bl = CustomValueUtil.getBoolean("fabric-loom:generated", this.metadata).orElse(false).booleanValue()) && optional.isEmpty() && this.container.getContainingMod().isPresent()) {
            customValue = (ModContainer)this.container.getContainingMod().get();
            optional = Optional.of(customValue.getMetadata().getId());
        }
        this.modMenuData = new FabricMod$ModMenuData(hashSet, optional, fabricMod$ModMenuData$DummyParentData, string);
        if (string.startsWith("fabric") && this.metadata.containsCustomValue("fabric-api:module-lifecycle")) {
            if (FabricLoader.getInstance().isModLoaded("fabric-api") || !FabricLoader.getInstance().isModLoaded("fabric")) {
                this.modMenuData.fillParentIfEmpty("fabric-api");
            } else {
                this.modMenuData.fillParentIfEmpty("fabric");
            }
            this.modMenuData.badges.add(Mod$Badge.LIBRARY);
        }
        if (string.startsWith("fabric") && (string.equals("fabricloader") || this.metadata.getProvides().contains("fabricloader") || string.equals("fabric") || string.equals("fabric-api") || this.metadata.getProvides().contains("fabric") || this.metadata.getProvides().contains("fabric-api") || string.equals("fabric-language-kotlin"))) {
            this.modMenuData.badges.add(Mod$Badge.LIBRARY);
        }
        this.badges = this.modMenuData.badges;
        if (this.metadata.getEnvironment() == ModEnvironment.CLIENT) {
            this.badges.add(Mod$Badge.CLIENT);
        }
        if (bl || "java".equals(string)) {
            this.badges.add(Mod$Badge.LIBRARY);
        }
        if ("deprecated".equals(CustomValueUtil.getString("fabric-api:module-lifecycle", this.metadata).orElse(null))) {
            this.badges.add(Mod$Badge.DEPRECATED);
        }
        if (this.metadata.containsCustomValue("patchwork:patcherMeta")) {
            this.badges.add(Mod$Badge.PATCHWORK_FORGE);
        }
        if (set.contains(this.getId()) && !"builtin".equals(this.metadata.getType())) {
            this.badges.add(Mod$Badge.MODPACK);
        }
        if ("minecraft".equals(this.getId())) {
            this.badges.add(Mod$Badge.MINECRAFT);
        }
    }

    @Override
    public boolean isHidden() {
        return ModMenuConfig.HIDDEN_MODS.getValue().contains(this.getId());
    }

    @Override
    public String getName() {
        return this.metadata.getName();
    }

    @Override
    public String getParent() {
        return this.modMenuData.parent.orElse(null);
    }

    @Override
    public String getId() {
        return this.metadata.getId();
    }

    @Override
    public boolean isReal() {
        return true;
    }

    @Override
    public String getVersion() {
        if ("java".equals(this.getId())) {
            return System.getProperty("java.version");
        }
        return this.metadata.getVersion().getFriendlyString();
    }

    @Override
    public String getSource() {
        return this.metadata.getContact().get("sources").orElse(null);
    }

    @Override
    public void setUpdateChecker(UpdateChecker updateChecker) {
        this.updateChecker = updateChecker;
    }

    @Override
    public boolean getChildHasUpdate() {
        return this.childHasUpdate;
    }

    @Override
    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
        String string = this.getParent();
        if (string != null && updateInfo != null && updateInfo.isUpdateAvailable()) {
            ModMenu.MODS.get(string).setChildHasUpdate();
        }
    }

    @Override
    public UpdateInfo getUpdateInfo() {
        return this.updateInfo;
    }

    @Override
    public String getSha512Hash() throws IOException {
        File file;
        List list;
        Optional<Path> optional;
        if (this.container.getContainingMod().isEmpty() && this.container.getOrigin().getKind() == ModOrigin.Kind.PATH && (optional = (list = this.container.getOrigin().getPaths()).stream().filter(path -> path.toString().toLowerCase(Locale.ROOT).endsWith(".jar")).findFirst()).isPresent() && (file = optional.get().toFile()).isFile()) {
            return Files.asByteSource((File)file).hash(Hashing.sha512()).toString();
        }
        return null;
    }

    @Override
    public String getIssueTracker() {
        if ("minecraft".equals(this.getId())) {
            return "https://aka.ms/snapshotbugs?ref=game";
        }
        return this.metadata.getContact().get("issues").orElse(null);
    }

    @Override
    public void setChildHasUpdate() {
        this.childHasUpdate = true;
    }

    @Override
    public String getPrefixedVersion() {
        return VersionUtil.getPrefixedVersion(this.getVersion());
    }

    @Override
    public boolean allowsUpdateChecks() {
        if (ModMenuConfig.DISABLE_UPDATE_CHECKER.getValue().contains(this.getId())) {
            return false;
        }
        return this.allowsUpdateChecks;
    }

    @Override
    public String getDescription() {
        return this.metadata.getDescription();
    }

    @Override
    public ContactInformation getContact(String string) {
        for (Person person : this.metadata.getAuthors()) {
            if (!person.getName().equals(string)) continue;
            return person.getContact();
        }
        for (Person person : this.metadata.getContributors()) {
            if (!person.getName().equals(string)) continue;
            return person.getContact();
        }
        return null;
    }

    @Override
    public List<String> getAuthors() {
        List<String> list = this.metadata.getAuthors().stream().map(Person::getName).collect(Collectors.toList());
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
    public Set<String> getLicense() {
        if ("minecraft".equals(this.getId())) {
            return Sets.newHashSet((Object[])new String[]{"Minecraft EULA"});
        }
        return Sets.newHashSet((Iterable)this.metadata.getLicense());
    }

    @Override
    public Map<String, Collection<String>> getContributors() {
        LinkedHashMap<String, Collection<String>> linkedHashMap = new LinkedHashMap<String, Collection<String>>();
        for (Person person : this.metadata.getContributors()) {
            linkedHashMap.put(person.getName(), List.of("Contributor"));
        }
        return linkedHashMap;
    }

    @Override
    public String getTranslatedDescription() {
        Object object = Mod.super.getTranslatedDescription();
        if (this.getId().equals("java")) {
            object = (String)object + "\n" + class08392.N((String)"modmenu.javaDistributionName", (Object[])new Object[]{this.getName()});
        }
        return object;
    }

    @Override
    public String getWebsite() {
        if ("minecraft".equals(this.getId())) {
            return "https://www.minecraft.net/";
        }
        if ("java".equals(this.getId())) {
            return System.getProperty("java.vendor.url");
        }
        return this.metadata.getContact().get("homepage").orElse(null);
    }

    @Override
    public Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public SortedMap<String, Set<String>> getCredits() {
        TreeMap<String, Set<String>> treeMap = new TreeMap<String, Set<String>>();
        List<String> list = this.getAuthors();
        Map<String, Collection<String>> map = this.getContributors();
        for (String object : list) {
            map.put(object, List.of("Author"));
        }
        for (Map.Entry entry : map.entrySet()) {
            for (String string2 : (Collection)entry.getValue()) {
                treeMap.computeIfAbsent(string2, string -> new LinkedHashSet());
                ((Set)treeMap.get(string2)).add((String)entry.getKey());
            }
        }
        return treeMap;
    }

    @Override
    public Set<Mod$Badge> getBadges() {
        return this.badges;
    }

    public FabricMod$ModMenuData getModMenuData() {
        return this.modMenuData;
    }

    @Override
    public class08829 getIcon(FabricIconHandler fabricIconHandler, int n) {
        String string = this.getId();
        String string2 = (String)((Object)this.metadata.getIconPath(n).orElse("assets/" + this.getId() + "/icon.png"));
        if ("minecraft".equals(this.getId())) {
            string = "modmenu";
            string2 = "assets/modmenu/minecraft_icon.png";
        } else if ("java".equals(this.getId())) {
            string = "modmenu";
            string2 = "assets/modmenu/java_icon.png";
        }
        String string3 = string;
        ModContainer modContainer = (ModContainer)FabricLoader.getInstance().getModContainer(string).orElseThrow(() -> new RuntimeException("Cannot get ModContainer for Fabric mod with id " + string3));
        class08829 class088292 = fabricIconHandler.createIcon(modContainer, string2);
        if (class088292 == null) {
            if (this.defaultIconWarning) {
                LOGGER.warn("Warning! Mod {} has a broken icon, loading default icon", (Object)this.metadata.getId());
                this.defaultIconWarning = false;
            }
            return Objects.requireNonNull(fabricIconHandler.createIcon((ModContainer)FabricLoader.getInstance().getModContainer("modmenu").orElseThrow(() -> new RuntimeException("Cannot get ModContainer for Fabric mod with id modmenu")), "assets/modmenu/unknown_icon.png"));
        }
        return class088292;
    }
}

