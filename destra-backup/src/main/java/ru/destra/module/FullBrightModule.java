package ru.destra.module;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import ru.destra.core.DestraClient;
import ru.destra.core.Module;
import ru.destra.core.ModuleCategory;
import ru.destra.core.ModuleManager;

public class FullBrightModule extends Module {
    public static final float MIN_GAMMA = 0.0F;
    public static final String MODULE_NAME = "Full Bright";
    public static final String MODULE_DESCRIPTION = "Освещение в темноте";
    public static final float FULL_BRIGHT_GAMMA = 10.0F;

    public FullBrightModule() {
        super(MODULE_NAME, ModuleCategory.Visuals, MODULE_DESCRIPTION);
    }

    private static void tickLightmap() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && client.gameRenderer != null) {
            client.gameRenderer.getLightmapTextureManager().tick();
        }
    }

    @Override
    public void enable(boolean silent) {
        super.enable(silent);
        tickLightmap();
    }

    @Override
    public void disable(boolean silent) {
        super.disable(silent);
        tickLightmap();
    }

    public static float getFullBrightGamma() {
        return FULL_BRIGHT_GAMMA;
    }

    public static boolean isFullBrightEnabled() {
        DestraClient client = DestraClient.getInstance();
        if (client == null) {
            return false;
        }
        ModuleManager moduleManager = client.getModuleManager();
        if (moduleManager == null) {
            return false;
        }
        FullBrightModule fullBright = moduleManager.fullBright;
        return fullBright != null && fullBright.enabled;
    }

    @Override
    public void clear() {
    }

    @Override
    public Text getName() {
        return Text.of(MODULE_NAME);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public ItemStack getStack(int slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
    }

    @Override
    public void markDirty() {
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }
}
