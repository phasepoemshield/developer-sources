package fun.nexisdlc.client.utils.player;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.*;
import ru.sterford.annotations.NativeCall;

public class ContainerManager {
    @NativeCall
    public static boolean isContainerScreenWithoutInventory(Screen screen) {
        if (screen == null) {
            return false;
        }

        return screen instanceof CraftingScreen ||
                screen instanceof GenericContainerScreen ||
                screen instanceof FurnaceScreen ||
                screen instanceof BlastFurnaceScreen ||
                screen instanceof SmokerScreen ||
                screen instanceof HopperScreen ||
                screen instanceof ShulkerBoxScreen ||
                screen instanceof BrewingStandScreen ||
                screen instanceof BeaconScreen ||
                screen instanceof AnvilScreen ||
                screen instanceof EnchantmentScreen ||
                screen instanceof CartographyTableScreen ||
                screen instanceof GrindstoneScreen ||
                screen instanceof LoomScreen ||
                screen instanceof StonecutterScreen ||
                screen instanceof SmithingScreen ||
                screen instanceof HorseScreen ||
                screen instanceof MerchantScreen;
    }
}
