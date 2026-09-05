/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03597
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05733
 *  minecraft.class05936
 *  minecraft.class06086
 *  minecraft.class06095
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06626
 *  minecraft.class07018
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08392
 *  minecraft.class08394
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ModOrigin$Kind
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu.gui;

import com.google.common.base.Joiner;
import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.ModMenuConfigManager;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget;
import com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget;
import com.terraformersmc.modmenu.gui.widget.ModListWidget;
import com.terraformersmc.modmenu.gui.widget.entries.ModListEntry;
import com.terraformersmc.modmenu.util.DrawingUtil;
import com.terraformersmc.modmenu.util.ModMenuScreenTexts;
import com.terraformersmc.modmenu.util.TranslationUtil;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.ModBadgeRenderer;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03597;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05733;
import minecraft.class05936;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06626;
import minecraft.class07018;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08392;
import minecraft.class08394;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModOrigin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModsScreen
extends class05096 {
    private static final class01894 FILTERS_BUTTON_LOCATION = class01894.N((String)"modmenu", (String)"textures/gui/filters_button.png");
    private static final class01894 CONFIGURE_BUTTON_LOCATION = class01894.N((String)"modmenu", (String)"textures/gui/configure_button.png");
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Mod Menu | ModsScreen");
    private final class05096 previousScreen;
    private ModListEntry selected;
    private ModBadgeRenderer modBadgeRenderer;
    private double scrollPercent = 0.0;
    private boolean keepFilterOptionsShown = false;
    private boolean init = false;
    private boolean filterOptionsShown = false;
    private static final int RIGHT_PANE_Y = 48;
    private int paneWidth;
    private int rightPaneX;
    private int searchBoxX;
    private int filtersX;
    private int filtersWidth;
    private int searchRowWidth;
    public final Set<String> showModChildren = new HashSet<String>();
    private class04927 searchBox;
    private class06478 filtersButton;
    private class06478 sortingButton;
    private class06478 librariesButton;
    private ModListWidget modList;
    private class06478 configureButton;
    private class06478 websiteButton;
    private class06478 issuesButton;
    private DescriptionListWidget descriptionListWidget;
    public final Map<String, Boolean> modHasConfigScreen = new HashMap<String, Boolean>();
    public final Map<String, Throwable> modScreenErrors = new HashMap<String, Throwable>();
    private static final class00392 SEND_FEEDBACK_TEXT = class00392.L((String)"menu.sendFeedback");
    private static final class00392 REPORT_BUGS_TEXT = class00392.L((String)"menu.reportBugs");

    public ModsScreen(class05096 class050962) {
        super(ModMenuScreenTexts.TITLE);
        this.previousScreen = class050962;
    }

    public void method_25426() {
        int n = ModMenuConfig.CONFIG_MODE.getValue() ? 48 : 67;
        this.paneWidth = this.field_22789 / 2 - 8;
        this.rightPaneX = this.field_22789 - this.paneWidth;
        this.modList = new ModListWidget(this.field_22787, this.paneWidth, this.field_22790 - n - 36, n, ModMenuConfig.COMPACT_LIST.getValue() ? 23 : 36, this.modList, this);
        this.modList.method_46421(0);
        int n2 = ModMenuConfig.CONFIG_MODE.getValue() ? 0 : 22;
        int n3 = this.paneWidth - 32 - n2;
        int n4 = ModMenuConfig.CONFIG_MODE.getValue() ? Math.min(200, n3) : n3;
        this.searchBoxX = this.paneWidth / 2 - n4 / 2 - n2 / 2;
        this.searchBox = new class04927(this.field_22793, this.searchBoxX, 22, n4, 20, this.searchBox, ModMenuScreenTexts.SEARCH);
        this.searchBox.method_1863(string -> this.modList.filter((String)string, false));
        class00392 class003922 = ModMenuConfig.SORTING.getButtonText();
        class00392 class003923 = ModMenuConfig.SHOW_LIBRARIES.getButtonText();
        int n5 = this.field_22793.N((class05936)class003922) + 28;
        int n6 = this.field_22793.N((class05936)class003923) + 20;
        this.filtersWidth = n6 + n5 + 2;
        this.searchRowWidth = this.searchBoxX + n4 + 22;
        this.updateFiltersX(true);
        if (!ModMenuConfig.CONFIG_MODE.getValue()) {
            this.filtersButton = LegacyTexturedButtonWidget.legacyTexturedBuilder(ModMenuScreenTexts.TOGGLE_FILTER_OPTIONS, class053622 -> this.setFilterOptionsShown(!this.filterOptionsShown)).position(this.paneWidth / 2 + n4 / 2 - 10 + 2, 22).size(20, 20).uv(0, 0, 20).texture(FILTERS_BUTTON_LOCATION, 32, 64).build();
            this.filtersButton.method_47400(class04141.N((class00392)ModMenuScreenTexts.TOGGLE_FILTER_OPTIONS));
        }
        this.sortingButton = class05362.method_46430((class00392)class003922, class053622 -> {
            ModMenuConfig.SORTING.cycleValue(this.field_22787.L() ? -1 : 1);
            ModMenuConfigManager.save();
            this.modList.reloadFilters();
            class053622.method_25355(ModMenuConfig.SORTING.getButtonText());
        }).N(this.filtersX, 45).y(n5, 20).N();
        this.librariesButton = class05362.method_46430((class00392)class003923, class053622 -> {
            ModMenuConfig.SHOW_LIBRARIES.toggleValue();
            ModMenuConfigManager.save();
            this.modList.reloadFilters();
            class053622.method_25355(ModMenuConfig.SHOW_LIBRARIES.getButtonText());
        }).N(this.filtersX + n5 + 2, 45).y(n6, 20).N();
        if (!ModMenuConfig.HIDE_CONFIG_BUTTONS.getValue()) {
            this.configureButton = LegacyTexturedButtonWidget.legacyTexturedBuilder(class05220.N, class053622 -> {
                String string = Objects.requireNonNull(this.selected).getMod().getId();
                if (this.getModHasConfigScreen(string)) {
                    this.safelyOpenConfigScreen(string);
                } else {
                    class053622.field_22763 = false;
                }
            }).position(this.field_22789 - 24, 48).size(20, 20).uv(0, 0, 20).texture(CONFIGURE_BUTTON_LOCATION, 32, 64).build();
        }
        int n7 = this.paneWidth / 2 - 2;
        int n8 = Math.min(n7, 200);
        this.websiteButton = class05362.method_46430((class00392)ModMenuScreenTexts.WEBSITE, class053622 -> {
            Mod mod = Objects.requireNonNull(this.selected).getMod();
            boolean bl = this.selected.getMod().getId().equals("minecraft");
            if (bl) {
                URI uRI = class07529.y().comp_4031() ? class03597.Z : class03597.B;
                class01321.N((class05096)this, (URI)uRI, (boolean)true);
            } else {
                String string = mod.getWebsite();
                if (string != null) {
                    class01321.N((class05096)this, (String)string, (boolean)false);
                }
            }
        }).N(this.rightPaneX + n7 / 2 - n8 / 2, 84).y(Math.min(n7, 200), 20).N();
        this.issuesButton = class05362.method_46430((class00392)ModMenuScreenTexts.ISSUES, class053622 -> {
            Mod mod = Objects.requireNonNull(this.selected).getMod();
            boolean bl = this.selected.getMod().getId().equals("minecraft");
            if (bl) {
                class01321.N((class05096)this, (URI)class03597.z, (boolean)true);
            } else {
                String string = mod.getIssueTracker();
                if (string != null) {
                    class01321.N((class05096)this, (String)string, (boolean)false);
                }
            }
        }).N(this.rightPaneX + n7 + 4 + n7 / 2 - n8 / 2, 84).y(Math.min(n7, 200), 20).N();
        Objects.requireNonNull(this.field_22793);
        this.descriptionListWidget = new DescriptionListWidget(this.field_22787, this.paneWidth, this.field_22790 - 48 - 96, 108, 9 + 1, this.descriptionListWidget, this);
        this.descriptionListWidget.method_46421(this.rightPaneX);
        class05362 class053623 = class05362.method_46430((class00392)ModMenuScreenTexts.MODS_FOLDER, class053622 -> class07536.m().N(ModsScreen.getModsFolder().toUri())).N(this.field_22789 / 2 - 154, this.field_22790 - 28).y(150, 20).N();
        class05362 class053624 = class05362.method_46430((class00392)class05220.u, class053622 -> this.field_22787.N(this.previousScreen)).N(this.field_22789 / 2 + 4, this.field_22790 - 28).y(150, 20).N();
        this.modList.finalizeInit();
        this.setFilterOptionsShown(this.keepFilterOptionsShown && this.filterOptionsShown);
        this.method_25429((class04654)this.searchBox);
        this.method_48265((class04654)this.searchBox);
        if (this.filtersButton != null) {
            this.method_37063((class04654)this.filtersButton);
        }
        this.method_37063((class04654)this.sortingButton);
        this.method_37063((class04654)this.librariesButton);
        this.method_25429((class04654)this.modList);
        if (this.configureButton != null) {
            this.method_37063((class04654)this.configureButton);
        }
        this.method_37063((class04654)this.websiteButton);
        this.method_37063((class04654)this.issuesButton);
        this.method_25429((class04654)this.descriptionListWidget);
        this.method_37063((class04654)class053623);
        this.method_37063((class04654)class053624);
        this.updateSelectedEntry(this.modList.getEntry(0));
        this.modList.select(this.selected);
        this.init = true;
        this.keepFilterOptionsShown = true;
    }

    public boolean method_25404(class06601 class066012) {
        return super.method_25404(class066012) || this.searchBox.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Object object;
        super.method_25394(class010542, n, n2, f);
        ModListEntry modListEntry = this.selected;
        if (modListEntry != null) {
            this.descriptionListWidget.method_25394(class010542, n, n2, f);
        }
        this.modList.method_25394(class010542, n, n2, f);
        this.searchBox.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.modList.method_25368() / 2, 8, -1);
        assert (this.field_22787 != null);
        int n3 = -5592406;
        if (!ModMenuConfig.DISABLE_DRAG_AND_DROP.getValue()) {
            int n4 = this.field_22789 - this.modList.method_25368() / 2;
            Objects.requireNonNull((class01590)this.field_22787.i_3);
            class010542.N(this.field_22793, ModMenuScreenTexts.DROP_INFO_LINE_1, n4, 24 - 9 - 1, n3);
            class010542.N(this.field_22793, ModMenuScreenTexts.DROP_INFO_LINE_2, this.field_22789 - this.modList.method_25368() / 2, 25, n3);
        }
        if (!ModMenuConfig.CONFIG_MODE.getValue()) {
            object = this.computeModCountText(true, false);
            if (!ModMenuConfig.CONFIG_MODE.getValue() && this.updateFiltersX(false)) {
                if (this.filterOptionsShown) {
                    if (!ModMenuConfig.SHOW_LIBRARIES.getValue() || this.field_22793.N((class05936)object) <= this.filtersX - 5) {
                        class010542.N(this.field_22793, object.method_30937(), this.searchBoxX, 52, -1, true);
                    } else {
                        class010542.N(this.field_22793, this.computeModCountText(false, false).method_30937(), this.searchBoxX, 46, -1, true);
                        class010542.N(this.field_22793, this.computeLibraryCountText(false).method_30937(), this.searchBoxX, 57, -1, true);
                    }
                } else if (!ModMenuConfig.SHOW_LIBRARIES.getValue() || this.field_22793.N((class05936)object) <= this.modList.method_25368() - 5) {
                    class010542.N(this.field_22793, object.method_30937(), this.searchBoxX, 52, -1, true);
                } else {
                    class010542.N(this.field_22793, this.computeModCountText(false, false).method_30937(), this.searchBoxX, 46, -1, true);
                    class010542.N(this.field_22793, this.computeLibraryCountText(false).method_30937(), this.searchBoxX, 57, -1, true);
                }
            }
        }
        if (modListEntry != null) {
            List<String> list;
            Object object2;
            class05216 class052162;
            object = modListEntry.getMod();
            int n5 = this.rightPaneX;
            if ("java".equals(object.getId())) {
                DrawingUtil.drawRandomVersionBackground((Mod)object, class010542, n5, 48, 32, 32);
            }
            class010542.N(class08394.Na, this.selected.getIconTexture(), n5, 48, 0.0f, 0.0f, 32, 32, 32, 32, -1);
            Objects.requireNonNull(this.field_22793);
            int n6 = 9 + 1;
            int n7 = 36;
            class05216 class052163 = class052162 = class00392.y((String)object.getTranslatedName());
            int n8 = this.field_22789 - (n5 + n7);
            if (this.field_22793.N((class05936)class052162) > n8) {
                object2 = class05936.R((String)"...");
                class052163 = class05936.N((class05936[])new class05936[]{this.field_22793.N((class05936)class052162, n8 - this.field_22793.N(object2)), object2});
            }
            class010542.N(this.field_22793, class07018.y().N((class05936)class052163), n5 + n7, 49, -1, true);
            if (n > n5 + n7 && n2 > 49) {
                Objects.requireNonNull(this.field_22793);
                if (n2 < 49 + 9 && n < n5 + n7 + this.field_22793.N((class05936)class052163)) {
                    class010542.N(ModMenuScreenTexts.modIdTooltip(object.getId()), n, n2);
                }
            }
            if (this.init || this.modBadgeRenderer == null || this.modBadgeRenderer.getMod() != object) {
                this.modBadgeRenderer = new ModBadgeRenderer(n5 + n7 + ((class01590)this.field_22787.i_3).N((class05936)class052163) + 2, 48, this.field_22789 - 28, modListEntry.mod, this);
                this.init = false;
            }
            if (!ModMenuConfig.HIDE_BADGES.getValue()) {
                this.modBadgeRenderer.draw(class010542, n, n2);
            }
            if (object.isReal()) {
                class010542.N(this.field_22793, object.getPrefixedVersion(), n5 + n7, 50 + n6, -5592406, true);
            }
            if (!(list = object.getAuthors()).isEmpty()) {
                object2 = list.size() > 1 ? Joiner.on((String)", ").join(list) : (String)list.getFirst();
                DrawingUtil.drawWrappedString(class010542, class08392.N((String)"modmenu.authorPrefix", (Object[])new Object[]{object2}), n5 + n7, 50 + n6 * 2, this.paneWidth - n7 - 4, 1, -5592406);
            }
        }
    }

    public void method_25419() {
        this.modList.close();
        this.field_22787.N(this.previousScreen);
    }

    public void method_29638(List<Path> list) {
        Path path = FabricLoader.getInstance().getGameDir().resolve("mods");
        List list2 = list.stream().filter(ModsScreen::isValidMod).toList();
        if (list2.isEmpty()) {
            return;
        }
        String string = list2.stream().map(Path::getFileName).map(Path::toString).collect(Collectors.joining(", "));
        assert (this.field_22787 != null);
        this.field_22787.N((class05096)new class05733(bl -> {
            if (bl) {
                boolean bl2 = true;
                for (Path path2 : list2) {
                    try {
                        Files.copy(path2, path.resolve(path2.getFileName()), new CopyOption[0]);
                    }
                    catch (IOException iOException) {
                        LOGGER.warn("Failed to copy mod from {} to {}", (Object)path2, (Object)path.resolve(path2.getFileName()));
                        class06132.L((class06202)this.field_22787, (String)path2.toString());
                        bl2 = false;
                        break;
                    }
                }
                if (bl2) {
                    class06132.N((class06086)this.field_22787.m(), (class06095)class06095.M, (class00392)ModMenuScreenTexts.DROP_SUCCESSFUL_LINE_1, (class00392)ModMenuScreenTexts.DROP_SUCCESSFUL_LINE_2);
                }
            }
            this.field_22787.N((class05096)this);
        }, ModMenuScreenTexts.DROP_CONFIRM, (class00392)class00392.y((String)string)));
    }

    public boolean method_25400(class06626 class066262) {
        return this.searchBox.method_25400(class066262);
    }

    private boolean updateFiltersX(boolean bl) {
        if (this.filtersWidth + this.field_22793.N((class05936)this.computeModCountText(true, bl)) + 20 >= this.searchRowWidth && (this.filtersWidth + this.field_22793.N((class05936)this.computeModCountText(false, bl)) + 20 >= this.searchRowWidth || this.filtersWidth + this.field_22793.N((class05936)this.computeLibraryCountText(bl)) + 20 >= this.searchRowWidth)) {
            this.filtersX = this.paneWidth / 2 - this.filtersWidth / 2;
            return !this.filterOptionsShown;
        }
        this.filtersX = this.searchRowWidth - this.filtersWidth + 1;
        return true;
    }

    public String getSearchInput() {
        return this.searchBox.method_1882();
    }

    public ModListEntry getSelectedEntry() {
        return this.selected;
    }

    private static Path getModsFolder() {
        ModContainer modContainer = (ModContainer)FabricLoader.getInstance().getModContainer("modmenu").orElseThrow();
        while (modContainer.getContainingMod().isPresent()) {
            modContainer = (ModContainer)modContainer.getContainingMod().get();
        }
        if (modContainer.getOrigin().getKind() == ModOrigin.Kind.PATH) {
            return ((Path)modContainer.getOrigin().getPaths().getFirst()).getParent();
        }
        return FabricLoader.getInstance().getGameDir().resolve("mods");
    }

    private int[] formatModCount(Set<String> set, boolean bl) {
        int n;
        int n2 = this.modList.getDisplayedCountFor(set);
        if (n2 == (n = set.size()) || bl) {
            return new int[]{n};
        }
        return new int[]{n2, n};
    }

    public void safelyOpenConfigScreen(String string) {
        try {
            class05096 class050962 = ModMenu.getConfigScreen(string, this);
            if (class050962 != null) {
                assert (this.field_22787 != null);
                this.field_22787.N(class050962);
            }
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            LOGGER.warn("The '{}' mod config screen is not available because {} is missing.", (Object)string, (Object)noClassDefFoundError.getLocalizedMessage());
            this.modScreenErrors.put(string, noClassDefFoundError);
        }
        catch (Throwable throwable) {
            LOGGER.error("Error from mod '{}'", (Object)string, (Object)throwable);
            this.modScreenErrors.put(string, throwable);
        }
    }

    private void setFilterOptionsShown(boolean bl) {
        this.filterOptionsShown = bl;
        this.sortingButton.field_22764 = bl;
        this.librariesButton.field_22764 = bl;
    }

    private class00392 computeModCountText(boolean bl, boolean bl2) {
        int[] nArray = this.formatModCount(ModMenu.ROOT_MODS.values().stream().filter(mod -> !mod.isHidden() && !mod.getBadges().contains((Object)Mod$Badge.LIBRARY)).map(Mod::getId).collect(Collectors.toSet()), bl2);
        if (bl && ModMenuConfig.SHOW_LIBRARIES.getValue() && !bl2) {
            int[] nArray2 = this.formatModCount(ModMenu.ROOT_MODS.values().stream().filter(mod -> !mod.isHidden() && mod.getBadges().contains((Object)Mod$Badge.LIBRARY)).map(Mod::getId).collect(Collectors.toSet()), false);
            return TranslationUtil.translateNumeric("modmenu.showingModsLibraries", nArray, nArray2);
        }
        return TranslationUtil.translateNumeric("modmenu.showingMods", new int[][]{nArray});
    }

    public void updateSelectedEntry(ModListEntry modListEntry) {
        boolean bl;
        if (modListEntry == null) {
            return;
        }
        this.selected = modListEntry;
        String string = this.selected.getMod().getId();
        this.descriptionListWidget.updateSelectedMod(this.selected.getMod());
        if (this.configureButton != null) {
            this.configureButton.field_22763 = this.getModHasConfigScreen(string);
            boolean bl2 = this.configureButton.field_22764 = this.getModHasConfigScreen(string) || this.modScreenErrors.containsKey(string);
            if (this.modScreenErrors.containsKey(string)) {
                Throwable throwable = this.modScreenErrors.get(string);
                this.configureButton.method_47400(class04141.N((class00392)ModMenuScreenTexts.configureError(string, throwable)));
            } else {
                this.configureButton.method_47400(class04141.N((class00392)ModMenuScreenTexts.CONFIGURE));
            }
        }
        this.websiteButton.method_25355((bl = string.equals("minecraft")) ? SEND_FEEDBACK_TEXT : ModMenuScreenTexts.WEBSITE);
        this.issuesButton.method_25355(bl ? REPORT_BUGS_TEXT : ModMenuScreenTexts.ISSUES);
        this.websiteButton.field_22764 = true;
        this.websiteButton.field_22763 = bl || this.selected.getMod().getWebsite() != null;
        this.issuesButton.field_22764 = true;
        this.issuesButton.field_22763 = bl || this.selected.getMod().getIssueTracker() != null;
    }

    private class00392 computeLibraryCountText(boolean bl) {
        if (ModMenuConfig.SHOW_LIBRARIES.getValue() && !bl) {
            int[] nArray = this.formatModCount(ModMenu.ROOT_MODS.values().stream().filter(mod -> !mod.isHidden() && mod.getBadges().contains((Object)Mod$Badge.LIBRARY)).map(Mod::getId).collect(Collectors.toSet()), false);
            return TranslationUtil.translateNumeric("modmenu.showingLibraries", new int[][]{nArray});
        }
        return class00392.i();
    }

    public boolean getModHasConfigScreen(String string) {
        if (this.modScreenErrors.containsKey(string)) {
            return false;
        }
        return this.modHasConfigScreen.computeIfAbsent(string, ModMenu::hasConfigScreen);
    }

    public void updateScrollPercent(double d) {
        this.scrollPercent = d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean isValidMod(Path path) {
        try (JarFile jarFile = new JarFile(path.toFile());){
            boolean bl;
            boolean bl2 = bl = jarFile.getEntry("fabric.mod.json") != null;
            if (!ModMenu.RUNNING_QUILT) {
                boolean bl3 = bl;
                return bl3;
            }
            boolean bl4 = bl || jarFile.getEntry("quilt.mod.json") != null;
            return bl4;
        }
        catch (IOException iOException) {
            return false;
        }
    }
}

