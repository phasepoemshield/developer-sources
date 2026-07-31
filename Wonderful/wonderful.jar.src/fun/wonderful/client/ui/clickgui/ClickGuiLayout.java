package fun.wonderful.client.ui.clickgui;

import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.Setting;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.modules.settings.implement.OpenScreenSetting;
import fun.wonderful.client.modules.settings.implement.TextSetting;
import java.util.List;

public final class ClickGuiLayout {
    public static final float WIDTH = 110.0f;
    public static final float HEIGHT = 254.0f;
    public static final float BORDER_RADIUS = 8.0f;
    public static final float PADDING = 4.0f;
    public static final float GAP = 4.0f;
    public static final float PANEL_GAP = 8.0f;
    public static final float CATEGORY_PANEL_STEP = 118.0f;
    public static final float HEADER_HEIGHT = 22.0f;
    public static final float HEADER_TEXT_Y = 8.0f;
    public static final float HEADER_DIVIDER_Y = 22.0f;
    public static final float CONTENT_TOP_OFFSET = 25.0f;
    public static final float CONTENT_BOTTOM_OFFSET = 4.0f;
    public static final float MODULE_PADDING = 4.0f;
    public static final float MODULE_INNER_WIDTH = 102.0f;
    public static final float MODULE_GAP = 4.0f;
    public static final float MODULE_HEADER_HEIGHT = 19.0f;
    public static final float MODULE_RADIUS = 4.0f;
    public static final float MODULE_BORDER_THICKNESS = 1.0f;
    public static final float SETTING_INNER_PADDING = 6.0f;
    public static final float SETTING_LEFT = 10.0f;
    public static final float SETTING_RIGHT = 100.0f;
    public static final float SETTING_START_Y = 19.0f;
    public static final float SETTING_PADDING = 4.0f;
    public static final float SETTING_BOTTOM_PADDING = 3.0f;
    public static final float SLIDER_WIDTH = 90.0f;
    public static final float TEXT_SETTING_WIDTH = 42.0f;
    public static final float CLICKABLE_WIDTH = 90.0f;
    public static final float TOGGLE_WIDTH = 16.0f;
    public static final float TOGGLE_HEIGHT = 9.0f;
    public static final float TOGGLE_X = 84.0f;
    public static final float OPTION_DOT_X = 96.0f;
    public static final float MODULE_DOTS_X = 96.1f;
    public static final float TEXT_BOX_X = 58.0f;
    public static final int SEARCH_MAX_CHARS = 24;
    public static final float SEARCH_WIDTH = 80.0f;
    public static final float SEARCH_HEIGHT = 18.0f;
    public static final float SEARCH_GAP = 8.0f;
    public static final float SEARCH_ICON_X = 4.0f;
    public static final float SEARCH_TEXT_X = 16.0f;
    public static final float SEARCH_RIGHT_PADDING = 8.0f;
    public static final float THEME_PANEL_Y = 100.0f;
    public static final float THEME_PANEL_H = 15.0f;
    public static final float THEME_BOX_SIZE = 8.0f;
    public static final float THEME_BOX_GAP = 4.0f;
    public static final float THEME_BOX_RADIUS = 2.0f;
    public static final float THEME_SIDE_PADDING = 4.0f;
    public static final float THEME_BUTTON_SIZE = 23.0f;
    public static final float THEME_BUTTON_GAP = 8.0f;
    public static final float THEME_POPUP_PADDING = 5.0f;
    public static final float THEME_POPUP_BOX_SIZE = 10.0f;
    public static final float THEME_POPUP_BOX_GAP = 5.0f;
    public static final float THEME_POPUP_OFFSET_Y = 6.0f;
    public static final float THEME_PICKER_SIZE = 88.0f;
    public static final float THEME_PICKER_HEIGHT = 78.0f;
    public static final float THEME_SLIDER_HEIGHT = 5.0f;
    public static final float THEME_HUE_SLIDER_HEIGHT = 6.0f;
    public static final float THEME_PICKER_GAP = 5.0f;
    public static final float THEME_PREVIEW_HEIGHT = 22.0f;
    public static final float THEME_PREVIEW_SWATCH_SIZE = 13.0f;
    public static final float THEME_THEMES_TOP_GAP = 7.0f;

    private ClickGuiLayout() {
    }

    public static float getTotalCategoriesWidth(int categoryCount) {
        return 110.0f * (float)categoryCount + 8.0f * (float)(categoryCount - 1);
    }

    public static float getCategoryPanelX(float x2, int index) {
        return x2 + (float)index * 118.0f;
    }

    public static float getContentY(float y2) {
        return y2 + 25.0f;
    }

    public static float getContentHeight() {
        return 225.0f;
    }

    public static float getSearchX(float x2, int categoryCount) {
        return x2 + ClickGuiLayout.getTotalCategoriesWidth(categoryCount) / 2.0f - 40.0f;
    }

    public static float getSearchX(float x2, int categoryCount, float searchWidth) {
        return x2 + ClickGuiLayout.getTotalCategoriesWidth(categoryCount) / 2.0f - searchWidth / 2.0f;
    }

    public static float getSearchY(float y2) {
        return y2 + 254.0f + 8.0f;
    }

    public static float getThemeButtonX(float x2, int categoryCount) {
        return ClickGuiLayout.getCategoryPanelX(x2, categoryCount - 1) + 110.0f + 8.0f;
    }

    public static float getThemeButtonY(float y2) {
        return y2;
    }

    public static boolean hasVisibleSettings(List<Setting> settings) {
        for (Setting setting : settings) {
            if (setting == null || !setting.visible().booleanValue()) continue;
            return true;
        }
        return false;
    }

    public static float calculateModeSettingHeight(ModeSetting modeSetting) {
        return (float)modeSetting.getMods().size() * 10.0f + 12.0f;
    }

    public static float calculateListSettingHeight(ListSetting listSetting) {
        int visibleCount = 0;
        for (BooleanSetting entry : listSetting.getSettings()) {
            if (!entry.visible().booleanValue()) continue;
            ++visibleCount;
        }
        return (float)visibleCount * 10.0f + 12.0f;
    }

    public static float calculateSettingsHeight(Module module) {
        float height = 0.0f;
        List<Setting> settings = module.getSettings();
        if (settings == null || settings.isEmpty()) {
            return 0.0f;
        }
        boolean hasVisibleSetting = false;
        for (Setting setting : settings) {
            if (setting == null || !setting.visible().booleanValue()) continue;
            hasVisibleSetting = true;
            if (setting instanceof BooleanSetting || setting instanceof BindSetting || setting instanceof OpenScreenSetting) {
                height += 12.0f;
                continue;
            }
            if (setting instanceof TextSetting) {
                height += 12.0f;
                continue;
            }
            if (setting instanceof FloatSetting) {
                height += 22.0f;
                continue;
            }
            if (setting instanceof ModeSetting) {
                ModeSetting modeSetting = (ModeSetting)setting;
                height += ClickGuiLayout.calculateModeSettingHeight(modeSetting);
                continue;
            }
            if (!(setting instanceof ListSetting)) continue;
            ListSetting listSetting = (ListSetting)setting;
            height += ClickGuiLayout.calculateListSettingHeight(listSetting);
        }
        if (hasVisibleSetting) {
            height += 3.0f;
        }
        return height;
    }

    public static float getModuleHeight(Module module, float openProgress) {
        return 19.0f + ClickGuiLayout.calculateSettingsHeight(module) * openProgress;
    }
}