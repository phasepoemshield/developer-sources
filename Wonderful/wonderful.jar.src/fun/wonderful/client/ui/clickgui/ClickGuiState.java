package fun.wonderful.client.ui.clickgui;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.TextSetting;
import fun.wonderful.client.ui.clickgui.ClickGuiLayout;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.util.Window;

public class ClickGuiState {
    private static final Map<Character, Character> RU_TO_EN = new HashMap<Character, Character>();
    private final Map<Module, Float> dotsRotation = new HashMap<Module, Float>();
    private final Map<Module, AnimationUtils> moduleOpenAnimation = new HashMap<Module, AnimationUtils>();
    private final Map<Module, AnimationUtils> moduleIconAnimation = new HashMap<Module, AnimationUtils>();
    private final Map<BooleanSetting, AnimationUtils> booleanBackgroundAnimation = new HashMap<BooleanSetting, AnimationUtils>();
    private final Map<BooleanSetting, AnimationUtils> booleanCircleAnimation = new HashMap<BooleanSetting, AnimationUtils>();
    private final Map<FloatSetting, AnimationUtils> sliderAnimation = new HashMap<FloatSetting, AnimationUtils>();
    private final Map<FloatSetting, Double> sliderDragMouseX = new HashMap<FloatSetting, Double>();
    private final Map<FloatSetting, Double> sliderDragRemainder = new HashMap<FloatSetting, Double>();
    private final Map<String, AnimationUtils> modeAnimation = new HashMap<String, AnimationUtils>();
    private final Map<String, AnimationUtils> listAnimation = new HashMap<String, AnimationUtils>();
    private final Map<String, AnimationUtils> bindAnimation = new HashMap<String, AnimationUtils>();
    private final Map<String, AnimationUtils> textHoverAnimation = new HashMap<String, AnimationUtils>();
    private final Map<String, Float> textScrollPhase = new HashMap<String, Float>();
    private final Map<String, Boolean> textScrollFinishing = new HashMap<String, Boolean>();
    private final Map<String, Boolean> textScrollHovered = new HashMap<String, Boolean>();
    private final Map<String, Long> textScrollLastUpdate = new HashMap<String, Long>();
    private final Map<Module.ModuleCategory, Float> categoryScrollTarget = new EnumMap<Module.ModuleCategory, Float>(Module.ModuleCategory.class);
    private final Map<Module.ModuleCategory, AnimationUtils> categoryScrollAnimation = new EnumMap<Module.ModuleCategory, AnimationUtils>(Module.ModuleCategory.class);
    private final Map<Module.ModuleCategory, List<Module>> modulesByCategory = new EnumMap<Module.ModuleCategory, List<Module>>(Module.ModuleCategory.class);
    private final List<Module> allModules = new ArrayList<Module>();
    private float x;
    private float y;
    private BindSetting bindingSetting;
    private TextSetting editingTextSetting;
    private Module bindingModule;
    private float renderOffsetY;
    private boolean searchActive;
    private String searchText = "";
    private String undoSearchText = "";
    private int searchCursor = 0;
    private int searchSelectionAnchor = 0;
    private int searchSelectionCursor = 0;
    private boolean searchDragging;

    public ClickGuiState() {
        this.refreshModules();
    }

    public void refreshModules() {
        this.allModules.clear();
        this.allModules.addAll(ModuleClass.INSTANCE.getObject().stream().filter(module -> !"AutoForest".equals(module.getName())).toList());
        for (Module.ModuleCategory category : Module.ModuleCategory.values()) {
            this.modulesByCategory.put(category, this.allModules.stream().filter(module -> module.getCategory() == category).toList());
            this.categoryScrollTarget.putIfAbsent(category, Float.valueOf(0.0f));
            this.categoryScrollAnimation.putIfAbsent(category, new AnimationUtils(0.0f, 8.0f, Easings.CUBIC_OUT));
        }
    }

    public void updatePosition(Window window, int categoryCount) {
        float totalCategoriesWidth = ClickGuiLayout.getTotalCategoriesWidth(categoryCount);
        this.x = (float)window.getScaledWidth() / 2.0f - totalCategoriesWidth / 2.0f;
        this.y = (float)window.getScaledHeight() / 2.0f - 127.0f;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getRenderOffsetY() {
        return this.renderOffsetY;
    }

    public void setRenderOffsetY(float renderOffsetY) {
        this.renderOffsetY = renderOffsetY;
    }

    public List<Module> getModules(Module.ModuleCategory category) {
        List<Module> modules = this.modulesByCategory.getOrDefault((Object)category, List.of());
        if (this.searchText.isBlank()) {
            return modules;
        }
        String query = this.searchText.toLowerCase(Locale.ROOT);
        return modules.stream().filter(module -> module.getName().toLowerCase(Locale.ROOT).contains(query) || module.getDisplayName().toLowerCase(Locale.ROOT).contains(query) || module.getDisplayDescription().toLowerCase(Locale.ROOT).contains(query)).toList();
    }

    public List<Module> getAllModules() {
        return this.allModules;
    }

    public String toEnglish(String text) {
        StringBuilder result = new StringBuilder();
        for (char c2 : text.toCharArray()) {
            result.append(RU_TO_EN.getOrDefault(Character.valueOf(c2), Character.valueOf(c2)));
        }
        return result.toString();
    }

    public float getSliderPos(FloatSetting setting) {
        float delta = setting.getMax() - setting.getMin();
        return (setting.get() - setting.getMin()) / delta;
    }

    public float getSliderValue(FloatSetting setting, float posX, double mouseX) {
        float delta = setting.getMax() - setting.getMin();
        float clickedX = (float)mouseX - posX;
        float value = Math.max(0.0f, Math.min(1.0f, clickedX / 90.0f));
        float outValue = setting.getMin() + delta * value;
        float increment = setting.getIncrement();
        outValue = (float)Math.round(outValue / increment) * increment;
        return Math.max(setting.getMin(), Math.min(setting.getMax(), outValue));
    }

    public void beginSliderDrag(FloatSetting setting, double mouseX) {
        this.sliderDragMouseX.put(setting, mouseX);
        this.sliderDragRemainder.put(setting, 0.0);
    }

    public void endSliderDrag(FloatSetting setting) {
        this.sliderDragMouseX.remove(setting);
        this.sliderDragRemainder.remove(setting);
    }

    public float updateActiveSliderValue(FloatSetting setting, double mouseX) {
        double lastMouseX = this.sliderDragMouseX.getOrDefault(setting, mouseX);
        this.sliderDragMouseX.put(setting, mouseX);
        double deltaX = mouseX - lastMouseX;
        if (Math.abs(deltaX) < 1.0E-4) {
            return setting.get();
        }
        float range = setting.getMax() - setting.getMin();
        float increment = setting.getIncrement();
        if (range <= 0.0f || increment <= 0.0f) {
            return setting.get();
        }
        double steps = range / increment;
        if (steps <= 0.0) {
            return setting.get();
        }
        double pixelsPerStep = 90.0 / steps;
        if (pixelsPerStep <= 0.0) {
            return setting.get();
        }
        double accumulated = this.sliderDragRemainder.getOrDefault(setting, 0.0) + deltaX;
        int wholeSteps = (int)(accumulated / pixelsPerStep);
        if (wholeSteps == 0) {
            this.sliderDragRemainder.put(setting, accumulated);
            return setting.get();
        }
        this.sliderDragRemainder.put(setting, accumulated - (double)wholeSteps * pixelsPerStep);
        float value = setting.get() + (float)wholeSteps * increment;
        value = (float)Math.round(value / increment) * increment;
        return Math.max(setting.getMin(), Math.min(setting.getMax(), value));
    }

    public float getScroll(Module.ModuleCategory category) {
        AnimationUtils animation = this.categoryScrollAnimation.computeIfAbsent(category, key -> new AnimationUtils(0.0f, 8.0f, Easings.CUBIC_OUT));
        animation.update(this.categoryScrollTarget.getOrDefault((Object)category, Float.valueOf(0.0f)).floatValue());
        return animation.getValue();
    }

    public void clampScroll(Module.ModuleCategory category, float contentHeight) {
        float totalHeight = this.getTotalModulesHeight(category);
        float maxScroll = Math.min(0.0f, contentHeight - totalHeight);
        float currentTarget = this.categoryScrollTarget.getOrDefault((Object)category, Float.valueOf(0.0f)).floatValue();
        if (currentTarget < maxScroll || currentTarget > 0.0f) {
            this.categoryScrollTarget.put(category, Float.valueOf(Math.max(maxScroll, Math.min(0.0f, currentTarget))));
        }
    }

    public void addScroll(Module.ModuleCategory category, double verticalAmount, float contentHeight) {
        float totalHeight = this.getTotalModulesHeight(category);
        float maxScroll = Math.min(0.0f, contentHeight - totalHeight);
        float currentTarget = this.categoryScrollTarget.getOrDefault((Object)category, Float.valueOf(0.0f)).floatValue();
        float newTarget = currentTarget + (float)(verticalAmount * 20.0);
        this.categoryScrollTarget.put(category, Float.valueOf(Math.max(maxScroll, Math.min(0.0f, newTarget))));
    }

    public float getTotalModulesHeight(Module.ModuleCategory category) {
        float totalHeight = 0.0f;
        for (Module module : this.getModules(category)) {
            totalHeight += 4.0f + ClickGuiLayout.getModuleHeight(module, this.getOpenProgress(module));
        }
        return totalHeight;
    }

    public float getOpenProgress(Module module) {
        AnimationUtils animation = this.moduleOpenAnimation.computeIfAbsent(module, key -> new AnimationUtils(module.isOpen() ? 1.0f : 0.0f, 14.0f, Easings.CUBIC_OUT));
        animation.update(module.isOpen() ? 1.0f : 0.0f);
        return animation.getValue();
    }

    public float getIconProgress(Module module) {
        AnimationUtils animation = this.moduleIconAnimation.computeIfAbsent(module, key -> new AnimationUtils(module.isEnable() ? 1.0f : 0.0f, 12.0f, Easings.CUBIC_OUT));
        animation.update(module.isEnable() ? 1.0f : 0.0f);
        return animation.getValue();
    }

    public float updateDotsRotation(Module module, float targetAngle) {
        float currentAngle = this.dotsRotation.getOrDefault(module, Float.valueOf(targetAngle)).floatValue();
        if (Math.abs(targetAngle - (currentAngle += (targetAngle - currentAngle) * 0.06f)) < 0.001f) {
            currentAngle = targetAngle;
        }
        this.dotsRotation.put(module, Float.valueOf(currentAngle));
        return currentAngle;
    }

    public AnimationUtils getBooleanBackgroundAnimation(BooleanSetting setting) {
        return this.booleanBackgroundAnimation.computeIfAbsent(setting, key -> new AnimationUtils(setting.isState() ? 1.0f : 0.0f, 15.0f, Easings.CUBIC_OUT));
    }

    public AnimationUtils getBooleanCircleAnimation(BooleanSetting setting) {
        return this.booleanCircleAnimation.computeIfAbsent(setting, key -> new AnimationUtils(setting.isState() ? 1.0f : 0.0f, 8.2f, Easings.BACK_OUT));
    }

    public AnimationUtils getSliderAnimation(FloatSetting setting) {
        return this.sliderAnimation.computeIfAbsent(setting, key -> new AnimationUtils(this.getSliderPos(setting), 12.0f, Easings.CUBIC_OUT));
    }

    public AnimationUtils getModeAnimation(String key, boolean selected) {
        return this.modeAnimation.computeIfAbsent(key, unused -> new AnimationUtils(selected ? 1.0f : 0.0f, 10.0f, Easings.CUBIC_OUT));
    }

    public AnimationUtils getListAnimation(String key, boolean selected) {
        return this.listAnimation.computeIfAbsent(key, unused -> new AnimationUtils(selected ? 1.0f : 0.0f, 10.0f, Easings.CUBIC_OUT));
    }

    public AnimationUtils getBindAnimation(String key, boolean binding) {
        return this.bindAnimation.computeIfAbsent(key, unused -> new AnimationUtils(binding ? 1.0f : 0.0f, 10.0f, Easings.CUBIC_OUT));
    }

    public AnimationUtils getTextHoverAnimation(String key, boolean hovered) {
        return this.textHoverAnimation.computeIfAbsent(key, unused -> new AnimationUtils(hovered ? 1.0f : 0.0f, 9.0f, Easings.CUBIC_OUT));
    }

    public float advanceTextScrollPhase(String key, boolean hovered) {
        float phase = this.textScrollPhase.getOrDefault(key, Float.valueOf(0.0f)).floatValue();
        boolean wasHovered = this.textScrollHovered.getOrDefault(key, false);
        boolean finishing = this.textScrollFinishing.getOrDefault(key, false);
        long now = System.currentTimeMillis();
        long lastUpdate = this.textScrollLastUpdate.getOrDefault(key, now);
        float deltaSeconds = Math.max(0.0f, Math.min((float)(now - lastUpdate) / 1000.0f, 0.05f));
        float phaseStep = deltaSeconds * 0.25f;
        if (hovered) {
            if ((phase += phaseStep) > 1.0f) {
                phase -= 1.0f;
            }
            finishing = false;
        } else {
            if (wasHovered && phase > 0.0f) {
                finishing = true;
            }
            if (finishing && (phase += phaseStep) >= 1.0f) {
                phase = 0.0f;
                finishing = false;
            }
        }
        this.textScrollLastUpdate.put(key, now);
        this.textScrollHovered.put(key, hovered);
        this.textScrollFinishing.put(key, finishing);
        this.textScrollPhase.put(key, Float.valueOf(phase));
        return phase;
    }

    public boolean isTextScrollActive(String key, boolean hovered) {
        return hovered || this.textScrollFinishing.getOrDefault(key, false) != false;
    }

    public BindSetting getBindingSetting() {
        return this.bindingSetting;
    }

    public void setBindingSetting(BindSetting bindingSetting) {
        this.bindingSetting = bindingSetting;
    }

    public Module getBindingModule() {
        return this.bindingModule;
    }

    public void setBindingModule(Module bindingModule) {
        this.bindingModule = bindingModule;
    }

    public TextSetting getEditingTextSetting() {
        return this.editingTextSetting;
    }

    public void setEditingTextSetting(TextSetting editingTextSetting) {
        this.editingTextSetting = editingTextSetting;
    }

    public boolean isSearchActive() {
        return this.searchActive;
    }

    public void setSearchActive(boolean searchActive) {
        this.searchActive = searchActive;
    }

    public String getSearchText() {
        return this.searchText;
    }

    public void appendSearchChar(char chr) {
        if (Character.isISOControl(chr) || this.searchText.length() >= 24 && !this.hasSearchSelection()) {
            return;
        }
        this.replaceSearchSelection(String.valueOf(chr));
    }

    public void removeLastSearchChar() {
        if (this.hasSearchSelection()) {
            this.replaceSearchSelection("");
            return;
        }
        if (this.searchCursor > 0) {
            this.rememberSearchUndo();
            this.searchText = this.searchText.substring(0, this.searchCursor - 1) + this.searchText.substring(this.searchCursor);
            --this.searchCursor;
            this.clearSearchSelection();
        }
    }

    public void clearSearchText() {
        this.rememberSearchUndo();
        this.searchText = "";
        this.searchCursor = 0;
        this.clearSearchSelection();
    }

    public void setSearchText(String searchText) {
        this.rememberSearchUndo();
        this.searchText = this.sanitizeSearchText(searchText);
        this.searchCursor = this.searchText.length();
        this.clearSearchSelection();
    }

    public void restoreSearchUndo() {
        String current = this.searchText;
        this.searchText = this.undoSearchText == null ? "" : this.undoSearchText;
        this.undoSearchText = current;
        this.searchCursor = this.searchText.length();
        this.clearSearchSelection();
    }

    public int getSearchCursor() {
        return this.searchCursor;
    }

    public int getSearchSelectionStart() {
        return Math.min(this.searchSelectionAnchor, this.searchSelectionCursor);
    }

    public int getSearchSelectionEnd() {
        return Math.max(this.searchSelectionAnchor, this.searchSelectionCursor);
    }

    public boolean hasSearchSelection() {
        return this.getSearchSelectionStart() != this.getSearchSelectionEnd();
    }

    public String getSelectedSearchText() {
        if (!this.hasSearchSelection()) {
            return "";
        }
        return this.searchText.substring(this.getSearchSelectionStart(), this.getSearchSelectionEnd());
    }

    public void selectAllSearchText() {
        this.searchSelectionAnchor = 0;
        this.searchSelectionCursor = this.searchText.length();
        this.searchCursor = this.searchText.length();
    }

    public void setSearchCursor(int cursor, boolean keepSelection) {
        this.searchCursor = this.clampSearchIndex(cursor);
        if (keepSelection) {
            this.searchSelectionCursor = this.searchCursor;
        } else {
            this.searchSelectionAnchor = this.searchCursor;
            this.searchSelectionCursor = this.searchCursor;
        }
    }

    public void startSearchSelection(int index) {
        this.searchSelectionAnchor = this.searchCursor = this.clampSearchIndex(index);
        this.searchSelectionCursor = this.searchCursor;
        this.searchDragging = true;
    }

    public void updateSearchSelection(int index) {
        if (!this.searchDragging) {
            return;
        }
        this.searchSelectionCursor = this.searchCursor = this.clampSearchIndex(index);
    }

    public void stopSearchSelection() {
        this.searchDragging = false;
    }

    public boolean isSearchDragging() {
        return this.searchDragging;
    }

    public void replaceSearchSelection(String text) {
        this.rememberSearchUndo();
        String insert = this.sanitizeSearchText(text);
        int selectionStart = this.getSearchSelectionStart();
        int selectionEnd = this.getSearchSelectionEnd();
        if (!this.hasSearchSelection()) {
            selectionStart = this.searchCursor;
            selectionEnd = this.searchCursor;
        }
        int available = Math.max(0, 24 - (this.searchText.length() - (selectionEnd - selectionStart)));
        if (insert.length() > available) {
            insert = insert.substring(0, available);
        }
        this.searchText = this.searchText.substring(0, selectionStart) + insert + this.searchText.substring(selectionEnd);
        this.searchCursor = selectionStart + insert.length();
        this.clearSearchSelection();
    }

    private void clearSearchSelection() {
        this.searchSelectionAnchor = this.searchCursor;
        this.searchSelectionCursor = this.searchCursor;
        this.searchDragging = false;
    }

    private int clampSearchIndex(int index) {
        return Math.max(0, Math.min(this.searchText.length(), index));
    }

    private void rememberSearchUndo() {
        this.undoSearchText = this.searchText;
    }

    private String sanitizeSearchText(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i2 = 0; i2 < text.length() && builder.length() < 24; ++i2) {
            char chr = text.charAt(i2);
            if (Character.isISOControl(chr)) continue;
            builder.append(chr);
        }
        return builder.toString();
    }

    static {
        String ru = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
        String en = "qwertyuiop[]asdfghjkl;'zxcvbnm,.QWERTYUIOP[]ASDFGHJKL;'ZXCVBNM,.";
        int length = Math.min(ru.length(), en.length());
        for (int i2 = 0; i2 < length; ++i2) {
            RU_TO_EN.put(Character.valueOf(ru.charAt(i2)), Character.valueOf(en.charAt(i2)));
        }
    }
}