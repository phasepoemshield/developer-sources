package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.sound.SoundEvents;

public class AutoFish
extends Module {
    public static AutoFish INSTANCE = new AutoFish();
    private final BooleanSetting takeRod = new BooleanSetting("Автоматически брать удочку", true);
    private boolean isCached = false;
    private boolean needCached = false;
    private int rodHotbarSlot = -1;
    private long lastActionTime = 0L;
    private long catchTime = 0L;

    public AutoFish() {
        super("AutoFish", "Автоматизирует процесс рыбалки", Module.ModuleCategory.PLAYER);
        this.addSettings(this.takeRod);
    }

    @Override
    public void onDisable() {
        this.isCached = false;
        this.needCached = false;
        this.rodHotbarSlot = -1;
        this.lastActionTime = 0L;
        this.catchTime = 0L;
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (AutoFish.mc.player == null || AutoFish.mc.world == null) {
            return;
        }
        if (this.takeRod.isState() && this.rodHotbarSlot == -1) {
            this.findBestFishingRodInHotbar();
        }
        if (this.rodHotbarSlot != -1 && AutoFish.mc.player.getInventory().selectedSlot != this.rodHotbarSlot) {
            AutoFish.mc.player.getInventory().selectedSlot = this.rodHotbarSlot;
            AutoFish.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(this.rodHotbarSlot));
        }
        long currentTime = System.currentTimeMillis();
        if (this.isCached && currentTime - this.catchTime >= 600L) {
            this.useFishingRod();
            this.isCached = false;
            this.needCached = true;
            this.lastActionTime = currentTime;
        }
        if (this.needCached && currentTime - this.lastActionTime >= 300L) {
            this.useFishingRod();
            this.needCached = false;
            this.lastActionTime = currentTime;
        }
    }

    @EventLink
    public void onPacket(EventPacket event) {
        PlaySoundS2CPacket packet;
        if (AutoFish.mc.player == null || AutoFish.mc.world == null) {
            return;
        }
        Packet<?> class_25962 = event.getPacket();
        if (class_25962 instanceof PlaySoundS2CPacket && (packet = (PlaySoundS2CPacket)class_25962).getSound().value() == SoundEvents.ENTITY_FISHING_BOBBER_SPLASH) {
            this.isCached = true;
            this.catchTime = System.currentTimeMillis();
        }
    }

    private void useFishingRod() {
        ItemStack stack;
        if (AutoFish.mc.player == null || AutoFish.mc.interactionManager == null) {
            return;
        }
        if (this.rodHotbarSlot != -1 && this.rodHotbarSlot < 9 && (stack = AutoFish.mc.player.getInventory().getStack(this.rodHotbarSlot)).getItem() instanceof FishingRodItem) {
            if (AutoFish.mc.player.getInventory().selectedSlot != this.rodHotbarSlot) {
                AutoFish.mc.player.getInventory().selectedSlot = this.rodHotbarSlot;
                AutoFish.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(this.rodHotbarSlot));
            }
            AutoFish.mc.interactionManager.interactItem((PlayerEntity)AutoFish.mc.player, Hand.MAIN_HAND);
        }
    }

    private void findBestFishingRodInHotbar() {
        if (AutoFish.mc.player == null) {
            return;
        }
        int bestRodSlot = -1;
        int maxEnchantments = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            int enchantmentCount;
            ItemStack stack = AutoFish.mc.player.getInventory().getStack(i2);
            if (!(stack.getItem() instanceof FishingRodItem) || (enchantmentCount = EnchantmentHelper.getEnchantments((ItemStack)stack).getSize()) <= maxEnchantments) continue;
            maxEnchantments = enchantmentCount;
            bestRodSlot = i2;
        }
        if (bestRodSlot != -1) {
            this.rodHotbarSlot = bestRodSlot;
        }
    }
}