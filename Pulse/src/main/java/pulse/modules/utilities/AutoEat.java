package pulse.modules.utilities;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import pulse.events.ClientTickEvent;
import pulse.media.chat.ChatMessages;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.ModeSetting;
import pulse.settings.SliderSetting;
import pulse.settings.TokenSetting;

@ModuleInfo(a = "Auto Eat", b = "Automatically eats food at the selected hunger level.", c = ModuleCategory.UTILITIES)
public class AutoEat extends ClientModule {
    private final ModeSetting mode = new ModeSetting("Mode", new String[]{"Hand", "Command"}, "Hand");
    private final TokenSetting command = new TokenSetting("Command", TokenSetting.TokenType.COMMAND, "/feed", "").a(() -> {
        return Boolean.valueOf(this.mode.b("Command"));
    });
    private final SliderSetting hungerLevel = new SliderSetting("Hunger Level", 15.0f, 1.0f, 20.0f, 1.0f);

    private boolean eating;
    private int previousSlot = -1;
    private boolean previousUsePressed;
    private long lastCommandMs;

    @EventHandler
    public void a(ClientTickEvent clientTickEvent) {
        if (c.player == null || c.world == null || c.interactionManager == null) {
            return;
        }
        if (c.player.getHungerManager().getFoodLevel() > this.hungerLevel.a()) {
            stopEating();
            return;
        }
        if (this.mode.b("Command")) {
            long now = System.currentTimeMillis();
            if (now - this.lastCommandMs < 1500L) {
                return;
            }
            String cmd = this.command.k();
            if (cmd == null || cmd.isBlank()) {
                return;
            }
            if (cmd.startsWith("/")) {
                cmd = cmd.substring(1);
            }
            ChatMessages.a(cmd);
            this.lastCommandMs = now;
            return;
        }
        int foodSlot = findFoodSlot();
        if (foodSlot == -1) {
            stopEating();
            return;
        }
        if (!this.eating) {
            this.previousSlot = c.player.getInventory().selectedSlot;
            this.previousUsePressed = c.options.useKey.isPressed();
            this.eating = true;
        }
        c.player.getInventory().selectedSlot = foodSlot;
        c.options.useKey.setPressed(true);
        c.interactionManager.interactItem(c.player, Hand.MAIN_HAND);
    }

    private int findFoodSlot() {
        for (int i = 0; i < 9; i++) {
            ItemStack stack = c.player.getInventory().getStack(i);
            if (a(stack)) {
                return i;
            }
        }
        return -1;
    }

    private boolean a(ItemStack ItemStackVar) {
        return ItemStackVar != null && !ItemStackVar.isEmpty() && ItemStackVar.getComponents().contains(DataComponentTypes.FOOD);
    }

    private void stopEating() {
        if (!this.eating) {
            return;
        }
        if (this.previousSlot != -1) {
            c.player.getInventory().selectedSlot = this.previousSlot;
        }
        c.options.useKey.setPressed(this.previousUsePressed);
        this.eating = false;
        this.previousSlot = -1;
    }

    @Override
    public void f() {
        stopEating();
        super.f();
    }
}
