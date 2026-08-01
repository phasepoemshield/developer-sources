package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.utils.client.other.Script;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.screen.slot.Slot;

@FunctionAdd(name = "ElytraSwap", alias = "Elytra Swap", category = Category.Player, description = "Быстрый свап на элитры и авто-использование фейерверков")
public class ElytraSwap extends Function {
    BindSetting elytraSetting = new BindSetting("Свап на элитры", -1);
    BindSetting fireworkSetting = new BindSetting("Использовать фейерверк", -1);
    BooleanSetting startSetting = new BooleanSetting("Быстрый старт", false);
    BooleanSetting autoFirework = new BooleanSetting("Авто-фейерверк", false);
    SliderSetting autoFireworkSetting = new SliderSetting("Авто фейерверк", 200, 100, 500, 25).setVisible(() -> autoFirework.get());

    Script script = new Script();
    long lastFireworkTime = 0;

    public ElytraSwap() {
        addSettings(elytraSetting, fireworkSetting, startSetting, autoFirework, autoFireworkSetting);
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (!script.isFinished() || e.getAction() != 1) return;

        if (e.isKeyDown(elytraSetting.get())) {
            Slot slot = chestPlate();
            if (slot != null) {
                Slot fireWork = PlayerInventoryUtil.getSlot(Items.FIREWORK_ROCKET);
                boolean shouldStart = slot.getStack().getItem().equals(Items.ELYTRA);

                // Свап брони как в юз-айтемах: тики стоп/свап/возврат берутся из конфы
                // (кастом / FunTime / SpookyTime / и т.д.) тем же автоматом processSwapPhase.
                PlayerInventoryUtil.swapItemsPhasedDirect(slot.id, 6, true);

                if (startSetting.get() && fireWork != null && shouldStart) script.cleanup().addTickStep(4, () -> {
                    if (mc.player.isOnGround()) mc.player.jump();
                }).addTickStep(3, () -> {
                    mc.player.startGliding();
                    mc.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(mc.player, ClientCommandC2SPacket.Mode.START_FALL_FLYING));
                    useFireworkWithoutSwap(false);
                });
            }
        } else if (e.isKeyDown(fireworkSetting.get()) && mc.player.isGliding()) {
            useFireworkWithoutSwap(false);
        }
    }

    @EventHandler
    public void onTick(TickEvent e) {
        if (nullCheck()) return;
        script.update();

        float fireworkUseTime = autoFireworkSetting.get();

        if (autoFirework.get() && mc.player.isGliding()) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastFireworkTime >= fireworkUseTime) {
                if (PlayerInventoryUtil.getSlot(Items.FIREWORK_ROCKET) != null) {
                    useFireworkWithoutSwap(true);
                }
            }
        }
    }

    Slot chestPlate() {
        ItemStack chest = mc.player.getEquippedStack(EquipmentSlot.CHEST);
        if (chest.getItem().equals(Items.ELYTRA)) {
            return PlayerInventoryUtil.slots()
                    .filter(s -> s.getStack().getItem().toString().contains("chestplate"))
                    .findFirst().orElse(null);
        } else {
            return PlayerInventoryUtil.getSlot(Items.ELYTRA);
        }
    }

    public void useFireworkWithoutSwap(boolean setTime) {
        if (!mc.player.isGliding()) return;
        if (PlayerInventoryUtil.getSlot(Items.FIREWORK_ROCKET) == null) return;

        long now = System.currentTimeMillis();
        if (autoFirework.get() && now - lastFireworkTime < autoFireworkSetting.get()) return;

        PlayerInventoryUtil.swapAndUseFromHotbar(Items.FIREWORK_ROCKET);

        if (setTime) lastFireworkTime = now;
    }
}
