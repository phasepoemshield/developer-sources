package fun.wonderful.client.ui.clickgui;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.api.utils.math.HoveringUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.Setting;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.modules.settings.implement.OpenScreenSetting;
import fun.wonderful.client.modules.settings.implement.TextSetting;
import fun.wonderful.client.ui.clickgui.ClickGuiLayout;
import fun.wonderful.client.ui.clickgui.ClickGuiState;
import fun.wonderful.client.ui.clickgui.ClickGuiThemeSelector;
import java.util.List;
import net.minecraft.client.util.Window;

public class ClickGuiInputHandler
implements QClient {
    private final ClickGuiState state;
    private final ClickGuiThemeSelector themeSelector;

    public ClickGuiInputHandler(ClickGuiState state, ClickGuiThemeSelector themeSelector) {
        this.state = state;
        this.themeSelector = themeSelector;
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button, Window window) {
        if (window == null) {
            return false;
        }
        int categoryCount = Module.ModuleCategory.values().length;
        float panelY = this.state.getY() + this.state.getRenderOffsetY();
        if (this.themeSelector.handleClick(mouseX, mouseY, button, this.state.getX(), panelY, categoryCount)) {
            return true;
        }
        float searchW = this.getSearchWidth();
        float searchX = ClickGuiLayout.getSearchX(this.state.getX(), categoryCount, searchW);
        float searchY = ClickGuiLayout.getSearchY(panelY);
        if (HoveringUtils.isHovered(mouseX, mouseY, searchX, searchY, searchW, 18.0)) {
            this.state.setSearchActive(true);
            this.state.setEditingTextSetting(null);
            this.state.setBindingModule(null);
            this.state.setBindingSetting(null);
            this.state.startSearchSelection(this.getSearchIndexAt(mouseX, searchX));
            return true;
        }
        if (button == 0 || button == 1) {
            this.state.setSearchActive(false);
            this.state.stopSearchSelection();
            this.state.setEditingTextSetting(null);
        }
        Module.ModuleCategory[] categories = Module.ModuleCategory.values();
        for (int i2 = 0; i2 < categories.length; ++i2) {
            Module.ModuleCategory category = categories[i2];
            float panelX = ClickGuiLayout.getCategoryPanelX(this.state.getX(), i2);
            float contentY = ClickGuiLayout.getContentY(panelY);
            float contentHeight = ClickGuiLayout.getContentHeight();
            float moduleY = contentY + this.state.getScroll(category);
            for (Module module : this.state.getModules(category)) {
                float openProgress = this.state.getOpenProgress(module);
                float moduleHeight = ClickGuiLayout.getModuleHeight(module, openProgress);
                boolean headerVisible = moduleY + 19.0f >= contentY && moduleY <= contentY + contentHeight;
                if (headerVisible && HoveringUtils.isHovered(mouseX, mouseY, panelX + 4.0f, moduleY, 102.0, 19.0)) {
                    if (button == 0) {
                        module.toggle();
                        return true;
                    }
                    if (button == 1) {
                        List<Setting> settings = module.getSettings();
                        if (settings != null && ClickGuiLayout.hasVisibleSettings(settings)) {
                            module.setOpen(!module.isOpen());
                        }
                        return true;
                    }
                    if (button == 2) {
                        this.state.setSearchActive(false);
                        this.state.setEditingTextSetting(null);
                        this.state.setBindingSetting(null);
                        this.state.setBindingModule(module);
                        return true;
                    }
                }
                if (module.isOpen() && openProgress > 0.01f) {
                    List<Setting> settings = module.getSettings();
                    if (settings != null && !settings.isEmpty() && this.handleSettingClick(mouseX, mouseY, button, panelX, moduleY, settings)) {
                        return true;
                    }
                }
                moduleY += 4.0f + moduleHeight;
            }
        }
        return false;
    }

    public boolean mouseReleased(int button) {
        this.state.stopSearchSelection();
        this.themeSelector.handleRelease(button);
        if (button == 0) {
            for (Module module : this.state.getAllModules()) {
                List<Setting> settings = module.getSettings();
                if (settings == null) continue;
                for (Setting setting : settings) {
                    if (!(setting instanceof FloatSetting)) continue;
                    FloatSetting floatSetting = (FloatSetting)setting;
                    floatSetting.setActive(false);
                    this.state.endSliderDrag(floatSetting);
                }
            }
        }
        return false;
    }

    public boolean mouseDragged(double mouseX, double mouseY, int button) {
        if (this.themeSelector.handleDrag(mouseX, mouseY, button, this.state.getX(), this.state.getY() + this.state.getRenderOffsetY(), Module.ModuleCategory.values().length)) {
            return true;
        }
        if (button != 0 || !this.state.isSearchActive() || !this.state.isSearchDragging()) {
            return false;
        }
        int categoryCount = Module.ModuleCategory.values().length;
        float searchX = ClickGuiLayout.getSearchX(this.state.getX(), categoryCount, this.getSearchWidth());
        this.state.updateSearchSelection(this.getSearchIndexAt(mouseX, searchX));
        return true;
    }

    public boolean mouseScrolled(double mouseX, double mouseY, double verticalAmount) {
        Module.ModuleCategory[] categories = Module.ModuleCategory.values();
        for (int i2 = 0; i2 < categories.length; ++i2) {
            float contentHeight;
            float contentY;
            Module.ModuleCategory category = categories[i2];
            float panelX = ClickGuiLayout.getCategoryPanelX(this.state.getX(), i2);
            if (!HoveringUtils.isHovered(mouseX, mouseY, panelX, contentY = ClickGuiLayout.getContentY(this.state.getY() + this.state.getRenderOffsetY()), 110.0, contentHeight = ClickGuiLayout.getContentHeight())) continue;
            this.state.addScroll(category, verticalAmount, contentHeight);
            return true;
        }
        return false;
    }

    public boolean keyPressed(int keyCode, int modifiers) {
        if (this.state.getEditingTextSetting() != null) {
            TextSetting textSetting = this.state.getEditingTextSetting();
            if (keyCode == 256 || keyCode == 257 || keyCode == 335) {
                this.state.setEditingTextSetting(null);
                return true;
            }
            if (keyCode == 259) {
                String current = textSetting.get();
                if (current != null && !current.isEmpty()) {
                    textSetting.setText(current.substring(0, current.length() - 1));
                }
                return true;
            }
            return true;
        }
        if ((modifiers & 2) != 0 && keyCode == 70) {
            this.state.setSearchActive(true);
            this.state.setEditingTextSetting(null);
            return true;
        }
        if (this.state.getBindingModule() != null) {
            if (keyCode == 256) {
                this.state.setBindingModule(null);
            } else if (keyCode == 261 || keyCode == 259) {
                this.state.getBindingModule().setKey(-1);
                this.state.setBindingModule(null);
            } else {
                this.state.getBindingModule().setKey(keyCode);
                this.state.setBindingModule(null);
            }
            return true;
        }
        if (this.state.getBindingSetting() != null) {
            if (keyCode == 256) {
                this.state.setBindingSetting(null);
            } else if (keyCode == 261 || keyCode == 259) {
                this.state.getBindingSetting().setKey(-1);
                this.state.setBindingSetting(null);
            } else {
                this.state.getBindingSetting().setKey(keyCode);
                this.state.setBindingSetting(null);
            }
            return true;
        }
        if (this.state.isSearchActive()) {
            if ((modifiers & 2) != 0) {
                if (keyCode == 65) {
                    this.state.selectAllSearchText();
                    return true;
                }
                if (keyCode == 67) {
                    if (this.state.hasSearchSelection() && mc != null && ClickGuiInputHandler.mc.keyboard != null) {
                        ClickGuiInputHandler.mc.keyboard.setClipboard(this.state.getSelectedSearchText());
                    }
                    return true;
                }
                if (keyCode == 86) {
                    if (mc != null && ClickGuiInputHandler.mc.keyboard != null) {
                        this.state.replaceSearchSelection(ClickGuiInputHandler.mc.keyboard.getClipboard());
                    }
                    return true;
                }
                if (keyCode == 90) {
                    this.state.restoreSearchUndo();
                    return true;
                }
            }
            if (keyCode == 256 || keyCode == 257 || keyCode == 335) {
                this.state.setSearchActive(false);
                return true;
            }
            if (keyCode == 259) {
                this.state.removeLastSearchChar();
                return true;
            }
            if (keyCode == 261) {
                this.state.clearSearchText();
                return true;
            }
            if (keyCode == 263) {
                this.state.setSearchCursor(this.state.getSearchCursor() - 1, (modifiers & 1) != 0);
                return true;
            }
            if (keyCode == 262) {
                this.state.setSearchCursor(this.state.getSearchCursor() + 1, (modifiers & 1) != 0);
                return true;
            }
        }
        return false;
    }

    public boolean charTyped(char chr) {
        if (this.state.getBindingModule() != null || this.state.getBindingSetting() != null) {
            return true;
        }
        if (this.state.getEditingTextSetting() != null) {
            if (!Character.isISOControl(chr)) {
                TextSetting textSetting = this.state.getEditingTextSetting();
                textSetting.setText(textSetting.get() + chr);
            }
            return true;
        }
        if (!this.state.isSearchActive()) {
            return false;
        }
        this.state.appendSearchChar(chr);
        return true;
    }

    private float getSearchWidth() {
        String query = this.state.getSearchText();
        String text = query.isEmpty() ? "Search..." : query;
        Font font = this.issue(14);
        float contentWidth = 16.0f + (font == null ? 48.0f : font.getWidth(text)) + 8.0f;
        return Math.max(80.0f, contentWidth);
    }

    private int getSearchIndexAt(double mouseX, float searchX) {
        String text = this.state.getSearchText();
        float textX = searchX + 16.0f;
        float localX = (float)mouseX - textX;
        Font font = this.issue(14);
        if (font == null || localX <= 0.0f || text.isEmpty()) {
            return 0;
        }
        for (int i2 = 1; i2 <= text.length(); ++i2) {
            float currentWidth;
            float previousWidth = font.getWidth(text.substring(0, i2 - 1));
            float midpoint = previousWidth + ((currentWidth = font.getWidth(text.substring(0, i2))) - previousWidth) * 0.5f;
            if (!(localX < midpoint)) continue;
            return i2 - 1;
        }
        return text.length();
    }

    private boolean handleSettingClick(double mouseX, double mouseY, int button, float panelX, float moduleY, List<Setting> settings) {
        float settingYoffset = 19.0f;
        for (Setting setting : settings) {
            if (setting == null || !setting.visible().booleanValue()) continue;
            float settingY = moduleY + settingYoffset + 4.0f;
            if (setting instanceof BooleanSetting) {
                BooleanSetting booleanSetting = (BooleanSetting)setting;
                if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, panelX + 84.0f, settingY - 2.0f, 16.0, 10.0)) {
                    booleanSetting.setState(!booleanSetting.isState());
                    return true;
                }
                settingYoffset += 12.0f;
                continue;
            }
            if (setting instanceof TextSetting) {
                TextSetting textSetting = (TextSetting)setting;
                float boxWidth = 42.0f;
                float boxX = panelX + 58.0f;
                if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, boxX, settingY - 2.5f, boxWidth, 9.0)) {
                    this.state.setSearchActive(false);
                    this.state.stopSearchSelection();
                    this.state.setEditingTextSetting(textSetting);
                    return true;
                }
                settingYoffset += 12.0f;
                continue;
            }
            if (setting instanceof FloatSetting) {
                FloatSetting floatSetting = (FloatSetting)setting;
                float trackY = settingY + 9.0f;
                if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, panelX + 10.0f, trackY - 3.0f, 90.0, 10.0)) {
                    floatSetting.setActive(true);
                    floatSetting.setValue(this.state.getSliderValue(floatSetting, panelX + 10.0f, mouseX));
                    this.state.beginSliderDrag(floatSetting, mouseX);
                    return true;
                }
                settingYoffset += 22.0f;
                continue;
            }
            if (setting instanceof ModeSetting) {
                ModeSetting modeSetting = (ModeSetting)setting;
                float modeY = settingY + 10.0f;
                for (String mode : modeSetting.getMods()) {
                    if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, panelX + 10.0f, modeY - 2.0f, 90.0, 10.0)) {
                        modeSetting.set(mode);
                        return true;
                    }
                    modeY += 10.0f;
                }
                settingYoffset += ClickGuiLayout.calculateModeSettingHeight(modeSetting);
                continue;
            }
            if (setting instanceof ListSetting) {
                ListSetting listSetting = (ListSetting)setting;
                float listY = settingY + 10.0f;
                for (BooleanSetting entry : listSetting.getSettings()) {
                    if (!entry.visible().booleanValue()) continue;
                    if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, panelX + 10.0f, listY - 2.0f, 90.0, 10.0)) {
                        entry.setState(!entry.isState());
                        return true;
                    }
                    listY += 10.0f;
                }
                settingYoffset += ClickGuiLayout.calculateListSettingHeight(listSetting);
                continue;
            }
            if (setting instanceof BindSetting) {
                BindSetting bindSetting = (BindSetting)setting;
                String bindString = this.state.getBindingSetting() == bindSetting ? "..." : this.state.toEnglish(KeyBoardUtils.getBindName(bindSetting.getKey()));
                float bindWidth = this.issue(12).getWidth(bindString) + 6.0f;
                float bindX = panelX + 100.0f - bindWidth;
                if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, bindX, settingY - 2.5f, bindWidth, 9.0)) {
                    this.state.setSearchActive(false);
                    this.state.stopSearchSelection();
                    this.state.setBindingSetting(bindSetting);
                    return true;
                }
                settingYoffset += 12.0f;
                continue;
            }
            if (!(setting instanceof OpenScreenSetting)) continue;
            OpenScreenSetting openScreenSetting = (OpenScreenSetting)setting;
            if (button == 0 && HoveringUtils.isHovered(mouseX, mouseY, panelX + 10.0f, settingY - 2.5f, 90.0, 9.0)) {
                this.state.setSearchActive(false);
                this.state.stopSearchSelection();
                openScreenSetting.open();
                return true;
            }
            settingYoffset += 12.0f;
        }
        return false;
    }

    private Font issue(int size) {
        return Fonts.getFont("suisse", size);
    }
}