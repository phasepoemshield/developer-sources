/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.ParserContext
 *  minecraft.class00392
 *  minecraft.class08392
 *  minecraft.class08829
 *  net.fabricmc.loader.api.metadata.ContactInformation
 */
package com.terraformersmc.modmenu.util.mod;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.TextPlaceholderApiCompat;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler;
import eu.pb4.placeholders.api.ParserContext;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import minecraft.class00392;
import minecraft.class08392;
import minecraft.class08829;
import net.fabricmc.loader.api.metadata.ContactInformation;

public interface Mod {
    public UpdateChecker getUpdateChecker();

    public boolean isHidden();

    public String getName();

    public String getParent();

    public String getId();

    public boolean isReal();

    public String getVersion();

    public String getSource();

    public void setUpdateChecker(UpdateChecker var1);

    public boolean getChildHasUpdate();

    public void setUpdateInfo(UpdateInfo var1);

    public UpdateInfo getUpdateInfo();

    default public String getTranslatedName() {
        String string = "modmenu.nameTranslation." + this.getId();
        if ((this.getId().equals("minecraft") || this.getId().equals("java") || ModMenuConfig.TRANSLATE_NAMES.getValue()) && class08392.N((String)string)) {
            return class08392.N((String)string, (Object[])new Object[0]);
        }
        return this.getName();
    }

    default public String getSha512Hash() throws IOException {
        return null;
    }

    public String getIssueTracker();

    public void setChildHasUpdate();

    public String getPrefixedVersion();

    public boolean allowsUpdateChecks();

    public String getDescription();

    default public boolean hasUpdate() {
        UpdateInfo updateInfo = this.getUpdateInfo();
        if (updateInfo == null) {
            return false;
        }
        return updateInfo.isUpdateAvailable() && updateInfo.getUpdateChannel().compareTo(ModMenuConfig.UPDATE_CHANNEL.getValue()) >= 0;
    }

    public ContactInformation getContact(String var1);

    public List<String> getAuthors();

    public Set<String> getLicense();

    public Map<String, Collection<String>> getContributors();

    default public String getTranslatedSummary() {
        String string = "modmenu.summaryTranslation." + this.getId();
        if ((this.getId().equals("minecraft") || this.getId().equals("java") || ModMenuConfig.TRANSLATE_DESCRIPTIONS.getValue()) && class08392.N((String)string)) {
            return class08392.N((String)string, (Object[])new Object[0]);
        }
        return this.getTranslatedDescription();
    }

    default public class00392 getFormattedDescription() {
        String string = this.getTranslatedDescription();
        return ModMenu.TEXT_PLACEHOLDER_COMPAT ? TextPlaceholderApiCompat.PARSER.parseText(string, ParserContext.of()) : class00392.y((String)string);
    }

    default public String getTranslatedDescription() {
        String string = "modmenu.descriptionTranslation." + this.getId();
        if ((this.getId().equals("minecraft") || this.getId().equals("java") || ModMenuConfig.TRANSLATE_DESCRIPTIONS.getValue()) && class08392.N((String)string)) {
            return class08392.N((String)string, (Object[])new Object[0]);
        }
        return this.getDescription();
    }

    default public String getSummary() {
        String string = this.getTranslatedSummary();
        return ModMenu.TEXT_PLACEHOLDER_COMPAT ? TextPlaceholderApiCompat.PARSER.parseText(string, ParserContext.of()).getString() : string;
    }

    public String getWebsite();

    public Map<String, String> getLinks();

    public SortedMap<String, Set<String>> getCredits();

    public Set<Mod$Badge> getBadges();

    public class08829 getIcon(FabricIconHandler var1, int var2);
}

