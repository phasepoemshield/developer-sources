package pulse.gui.core;

import net.minecraft.client.gui.screen.Screen;
import pulse.client.MinecraftContext;
import pulse.module.ClientModule;
import pulse.gui.modules.ModuleCard;
import pulse.gui.modules.ModulesTab;

public final class ClickGuiInteractionHelper implements MinecraftContext {
    private ClickGuiInteractionHelper() {
    }

    public static boolean handleRightClick(double d, double d2) {
        ModuleCard moduleCardFindCardAtBounds;
        ClientModule clientModuleE;
        Screen ScreenVar = c.currentScreen;
        if (!(ScreenVar instanceof PulseClickGuiScreen)) {
            return false;
        }
        ClickGuiTab clickGuiTabA = ((PulseClickGuiScreen) ScreenVar).a();
        if (!(clickGuiTabA instanceof ModulesTab)) {
            return true;
        }
        ModulesTab modulesTab = (ModulesTab) clickGuiTabA;
        if ((moduleCardFindCardAtBounds = modulesTab.findCardAtBounds((int) d, (int) d2)) == null || (clientModuleE = moduleCardFindCardAtBounds.l().e()) == null || clientModuleE.m().isEmpty()) {
            return true;
        }
        modulesTab.openSettingsForCard(moduleCardFindCardAtBounds);
        return true;
    }
}
