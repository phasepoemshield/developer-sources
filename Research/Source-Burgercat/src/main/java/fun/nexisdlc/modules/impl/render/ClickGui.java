package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ButtonSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.ui.gui.elements.ThemeWidget;

@FunctionAdd(name = "ClickGui", alias = "ClickGui", category = Category.Render, description = "Настройки GUI")
public class ClickGui extends Function {
    public static ModeSetting guiMode = new ModeSetting("Режим GUI", "DropDown", "CS-GUI", "DropDown");
    public static ButtonSetting openThemeEditor;

    public ClickGui() {
        openThemeEditor = new ButtonSetting("Открыть редактор тем", ThemeWidget::toggleOpen);
        super.addSettings(guiMode, openThemeEditor);
        setState(true);
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
