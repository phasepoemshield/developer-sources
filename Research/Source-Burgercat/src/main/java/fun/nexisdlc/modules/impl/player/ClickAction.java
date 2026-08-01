package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(name = "ClickAction", alias = "Click Action", category = Category.Player, description = "Бинды на жемчуг, заряд ветра, бутылку опыта и добавление друга")
public class ClickAction extends Function {
    private final BindSetting expBind = new BindSetting("Бутылка опыта", -1);
    private final BindSetting friendBind = new BindSetting("Добавить друга", -1);
    private final List<KeyBind> keyBindings = new ArrayList<>();
    
    private static final long PEARL_ROTATION_TIME_MS = 20;
    private static final int ITEM_USE_ROTATION_PRIORITY = 999;
    private static final String ITEM_USE_ROTATION_TASK = "item_use";

    private long pearlThrowTime = 0;
    private boolean pearlResetScheduled = false;
    

    public ClickAction() {
        keyBindings.add(new KeyBind(Items.ENDER_PEARL, new BindSetting("Жемчуг края", -1)));
        keyBindings.add(new KeyBind(Items.WIND_CHARGE, new BindSetting("Заряд ветра", -1)));
        keyBindings.add(new KeyBind(Items.SPLASH_POTION, new BindSetting("Любой бафф", -1)));
        keyBindings.add(new KeyBind(Items.SPLASH_POTION, new BindSetting("Любой дебафф", -1)));
        keyBindings.forEach(bind -> addSettings(bind.setting));
        addSettings(expBind, friendBind);
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (ClientContainer.isHide()) return;
        if (nullCheck() || e.getAction() != 1) {
            return;
        }

        if (e.isKeyDown(friendBind.get()) && mc.crosshairTarget instanceof EntityHitResult result
                && result.getEntity() instanceof PlayerEntity player) {
            String name = player.getName().getString();
            if (Nexis.getInstance().getFriendStorage().isFriend(name)) {
                Nexis.getInstance().getFriendStorage().remove(name);
            } else {
                Nexis.getInstance().getFriendStorage().add(name);
            }
        }

        keyBindings.stream()
                .filter(bind -> e.isKeyDown(bind.setting.get()))
                .forEach(this::swapAndUse);
    }

    @EventHandler
    public void onTick(UpdateEvent e) {
        if (pearlResetScheduled && System.currentTimeMillis() - pearlThrowTime >= PEARL_ROTATION_TIME_MS) {
            pearlResetScheduled = false;
        }
        
        if (nullCheck() || !PlayerInventoryUtil.isKeyCodeDown(expBind.get())) {
            return;
        }

        Slot slot = PlayerInventoryUtil.getSlot(Items.EXPERIENCE_BOTTLE);
        if (slot == null) {
            return;
        }

        if (mc.player.getMainHandStack().getItem() != Items.EXPERIENCE_BOTTLE) {
            PlayerInventoryUtil.swapHand(slot, Hand.MAIN_HAND, true);
            return;
        }

        PlayerInventoryUtil.useMainHandItem(true);
    }

    public void swapAndUse(KeyBind bind) {
        if (bind == null || bind.setting == null) {
            return;
        }

        switch (bind.setting.getName()) {
            case "Любой бафф" -> {
                Slot slot = PlayerInventoryUtil.getPotionFromCategory(StatusEffectCategory.BENEFICIAL);
                if (slot != null) {
                    useBindItem(slot.getStack().getItem(), bind.item);
                }
            }
            case "Любой дебафф" -> {
                Slot slot = PlayerInventoryUtil.getPotionFromCategory(StatusEffectCategory.HARMFUL);
                if (slot != null) {
                    useBindItem(slot.getStack().getItem(), bind.item);
                }
            }
            default -> {
                Slot slot = PlayerInventoryUtil.getSlot(bind.item);
                if (slot != null) {
                    useBindItem(slot.getStack().getItem(), bind.item);
                }
            }
        }
    }

    private void useBindItem(Item item, Item bindItem) {
        Slot slot = PlayerInventoryUtil.getSlot(item);
        if (slot != null && PlayerInventoryUtil.isItemOnCooldown(slot.getStack())) {
            return;
        }

        if ((bindItem == Items.ENDER_PEARL || bindItem == Items.WIND_CHARGE) && mc.getCameraEntity() != null) {
            float originalYaw = mc.getCameraEntity().getYaw();
            float originalPitch = mc.getCameraEntity().getPitch();
            float targetYaw = originalYaw;
            float targetPitch = originalPitch;

            if (bindItem == Items.WIND_CHARGE) {
                targetYaw += ThreadLocalRandom.current().nextFloat(-4.0f, 4.0001f);
                targetPitch = Math.min(90.0f, 90.0f + ThreadLocalRandom.current().nextFloat(-2.0f, 2.0001f));

                final float cameraYaw = targetYaw;
                final float cameraPitch = targetPitch;
                
                RotationTask.create(ITEM_USE_ROTATION_TASK, ITEM_USE_ROTATION_PRIORITY);
                RotationTask.setTargetRotation(cameraYaw, cameraPitch, Float.MAX_VALUE, Float.MAX_VALUE,
                        Float.MAX_VALUE, Float.MAX_VALUE, 1.5, ITEM_USE_ROTATION_PRIORITY, 0L);

                pearlThrowTime = System.currentTimeMillis();
                pearlResetScheduled = true;
                RotationTask.scheduleActionAfterAim(() -> {
                    PlayerInventoryUtil.queueNextUseRotation(cameraYaw, cameraPitch);
                    if (ServerAssistant.isSpookyTimeMode()) {
                        PlayerInventoryUtil.swapAndUseInstant(item);
                    } else {
                        PlayerInventoryUtil.swapAndUse(item);
                    }
                    PlayerUtils.postScript.addTickStep(1, () -> RotationTask.remove(ITEM_USE_ROTATION_TASK));
                });
                return;
            }

            final float cameraYaw = targetYaw;
            final float cameraPitch = targetPitch;

            RotationTask.create(ITEM_USE_ROTATION_TASK, ITEM_USE_ROTATION_PRIORITY);
            RotationTask.setTargetRotation(cameraYaw, cameraPitch, Float.MAX_VALUE, Float.MAX_VALUE,
                    Float.MAX_VALUE, Float.MAX_VALUE, 1.5, ITEM_USE_ROTATION_PRIORITY, 1L);

            pearlThrowTime = System.currentTimeMillis();
            pearlResetScheduled = true;
            RotationTask.scheduleActionAfterAim(() -> {
                PlayerInventoryUtil.queueNextUseRotation(cameraYaw, cameraPitch);
                if (ServerAssistant.isSpookyTimeMode()) {
                    PlayerInventoryUtil.swapAndUseInstant(item);
                } else {
                    PlayerInventoryUtil.swapAndUse(item);
                }
                PlayerUtils.postScript.addTickStep(1, () -> RotationTask.remove(ITEM_USE_ROTATION_TASK));
            });
            return;
        }
        
        if (ServerAssistant.isSpookyTimeMode()) {
            PlayerInventoryUtil.swapAndUseInstant(item);
            return;
        }
        PlayerInventoryUtil.swapAndUse(item);
    }

    public List<KeyBind> getKeyBindings() {
        return keyBindings;
    }

    public BindSetting getExpBind() {
        return expBind;
    }

    public record KeyBind(Item item, BindSetting setting) {
    }
}

