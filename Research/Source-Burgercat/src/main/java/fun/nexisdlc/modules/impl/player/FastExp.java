package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(name = "FastExp", alias = "Fast Exp", category = Category.Player, description = "Ускоряет выкидывание пузырьков опыта")
public class FastExp extends Function {
    public SliderSetting delay = new SliderSetting("Задержка", 50f, 25f, 100f, 5f);
    private long lastThrowTime = 0;

    public FastExp() {
        addSettings(delay);
    }

    @EventHandler
    public void onFastest(UpdateEvent e) {
        if (mc.player == null) return;

        boolean hasExpBottle = mc.player.getMainHandStack().getItem() == Items.EXPERIENCE_BOTTLE ||
                mc.player.getOffHandStack().getItem() == Items.EXPERIENCE_BOTTLE;

        if (mc.options.useKey.isPressed() && hasExpBottle) {
            long currentTime = System.currentTimeMillis();
            float randomDelay = ThreadLocalRandom.current().nextFloat(delay.get() - 3, delay.get() + 11);
            long delayMs = (long) (randomDelay);

            if (currentTime - lastThrowTime >= delayMs) {
                if (mc.player != null && mc.interactionManager != null) {
                    mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
                    lastThrowTime = currentTime;
                }
            }
        }
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
