/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08829
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ContactInformation
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod$ModMenuData$DummyParentData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import minecraft.class08829;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ContactInformation;

public class FabricDummyParentMod
implements Mod {
    private final String id;
    private final FabricMod host;
    private boolean childHasUpdate;

    @Override
    public UpdateChecker getUpdateChecker() {
        return null;
    }

    public FabricDummyParentMod(FabricMod fabricMod, String string) {
        this.host = fabricMod;
        this.id = string;
    }

    @Override
    public boolean isHidden() {
        return ModMenuConfig.HIDDEN_MODS.getValue().contains(this.getId());
    }

    @Override
    public String getName() {
        FabricMod$ModMenuData$DummyParentData fabricMod$ModMenuData$DummyParentData = this.host.getModMenuData().getDummyParentData();
        if (fabricMod$ModMenuData$DummyParentData != null) {
            return fabricMod$ModMenuData$DummyParentData.getName().orElse("");
        }
        if (this.id.equals("fabric-api")) {
            return "Fabric API";
        }
        return this.id;
    }

    @Override
    public String getParent() {
        return null;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isReal() {
        return false;
    }

    @Override
    public String getVersion() {
        return "";
    }

    @Override
    public String getSource() {
        return null;
    }

    @Override
    public void setUpdateChecker(UpdateChecker updateChecker) {
    }

    @Override
    public boolean getChildHasUpdate() {
        return this.childHasUpdate;
    }

    @Override
    public void setUpdateInfo(UpdateInfo updateInfo) {
    }

    @Override
    public UpdateInfo getUpdateInfo() {
        return null;
    }

    @Override
    public String getIssueTracker() {
        return null;
    }

    @Override
    public void setChildHasUpdate() {
        this.childHasUpdate = true;
    }

    @Override
    public String getPrefixedVersion() {
        return "";
    }

    @Override
    public boolean allowsUpdateChecks() {
        return false;
    }

    @Override
    public String getDescription() {
        FabricMod$ModMenuData$DummyParentData fabricMod$ModMenuData$DummyParentData = this.host.getModMenuData().getDummyParentData();
        if (fabricMod$ModMenuData$DummyParentData != null) {
            return fabricMod$ModMenuData$DummyParentData.getDescription().orElse("");
        }
        return "";
    }

    @Override
    public ContactInformation getContact(String string) {
        return null;
    }

    @Override
    public List<String> getAuthors() {
        return new ArrayList<String>();
    }

    @Override
    public Set<String> getLicense() {
        return new HashSet<String>();
    }

    @Override
    public Map<String, Collection<String>> getContributors() {
        return Map.of();
    }

    @Override
    public String getWebsite() {
        return null;
    }

    @Override
    public Map<String, String> getLinks() {
        return new HashMap<String, String>();
    }

    @Override
    public SortedMap<String, Set<String>> getCredits() {
        return new TreeMap<String, Set<String>>();
    }

    @Override
    public Set<Mod$Badge> getBadges() {
        FabricMod$ModMenuData$DummyParentData fabricMod$ModMenuData$DummyParentData = this.host.getModMenuData().getDummyParentData();
        if (fabricMod$ModMenuData$DummyParentData != null) {
            return fabricMod$ModMenuData$DummyParentData.getBadges();
        }
        HashSet<Mod$Badge> hashSet = new HashSet<Mod$Badge>();
        if (this.id.equals("fabric-api")) {
            hashSet.add(Mod$Badge.LIBRARY);
        }
        boolean bl = true;
        for (Mod mod : ModMenu.PARENT_MAP.get((Object)this)) {
            if (mod.getBadges().contains((Object)Mod$Badge.MODPACK)) continue;
            bl = false;
        }
        if (bl) {
            hashSet.add(Mod$Badge.MODPACK);
        }
        return hashSet;
    }

    @Override
    public class08829 getIcon(FabricIconHandler fabricIconHandler, int n) {
        String string = this.host.getId();
        FabricMod$ModMenuData$DummyParentData fabricMod$ModMenuData$DummyParentData = this.host.getModMenuData().getDummyParentData();
        String string2 = null;
        if (fabricMod$ModMenuData$DummyParentData != null) {
            string2 = fabricMod$ModMenuData$DummyParentData.getIcon().orElse(null);
        }
        if ("inherit".equals(string2)) {
            return this.host.getIcon(fabricIconHandler, n);
        }
        if (string2 == null) {
            string = "modmenu";
            string2 = this.id.equals("fabric-api") ? "assets/modmenu/fabric.png" : "assets/modmenu/unknown_parent.png";
        }
        String string3 = string;
        ModContainer modContainer = (ModContainer)FabricLoader.getInstance().getModContainer(string).orElseThrow(() -> new RuntimeException("Cannot get ModContainer for Fabric mod with id " + string3));
        return Objects.requireNonNull(fabricIconHandler.createIcon(modContainer, string2), "Mod icon for " + this.getId() + " is null somehow (should be filled with default in this case)");
    }
}

