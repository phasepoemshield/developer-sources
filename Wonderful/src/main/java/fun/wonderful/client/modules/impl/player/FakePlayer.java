package fun.wonderful.client.modules.impl.player;

import com.mojang.authlib.GameProfile;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventAttackEntity;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import java.util.UUID;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FakePlayer extends Module {
    public static FakePlayer INSTANCE = new FakePlayer();
    private static final int ENTITY_ID = -42069;
    private final BooleanSetting totem = new BooleanSetting("Тотем", true);
    private final BooleanSetting invulnerable = new BooleanSetting("Неуязвимость", false);
    private OtherClientPlayerEntity fakePlayer;

    public FakePlayer() {
        super("FakePlayer", "Создает тестовую цель для модулей", Module.ModuleCategory.PLAYER);
        this.addSettings(this.totem, this.invulnerable);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.spawn();
    }

    @Override
    public void onDisable() {
        this.remove();
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (FakePlayer.mc.player == null || FakePlayer.mc.world == null) {
            this.remove();
            return;
        }
        if (this.fakePlayer == null || this.fakePlayer.isRemoved()) {
            this.spawn();
            return;
        }
        this.fakePlayer.setInvulnerable(this.invulnerable.isState());
    }

    @EventLink
    public void onAttack(EventAttackEntity event) {
        if (FakePlayer.mc.player == null || event.getPlayer() != FakePlayer.mc.player || event.getTarget() != this.fakePlayer || !this.fakePlayer.isAlive()) {
            return;
        }
        float damage = Math.max(1.0f, FakePlayer.mc.player.getAttackCooldownProgress(0.5f) * 4.0f);
        FakePlayerState.DamageResult result = FakePlayerState.applyDamage(this.fakePlayer.getHealth(), damage, this.totem.isState(), this.invulnerable.isState());
        this.fakePlayer.setHealth(result.health());
        this.fakePlayer.hurtTime = 10;
        this.fakePlayer.maxHurtTime = 10;
        this.fakePlayer.handleStatus((byte)2);
        if (result.poppedTotem()) {
            this.fakePlayer.handleStatus((byte)35);
        }
        FakePlayer.mc.player.resetLastAttackedTicks();
        event.cancel();
    }

    private void spawn() {
        if (FakePlayer.mc.player == null || FakePlayer.mc.world == null) {
            return;
        }
        this.remove();
        OtherClientPlayerEntity fake = new OtherClientPlayerEntity(FakePlayer.mc.world, new GameProfile(UUID.randomUUID(), "FakePlayer"));
        fake.copyFrom(FakePlayer.mc.player);
        fake.setId(ENTITY_ID);
        double yawRadians = Math.toRadians(FakePlayer.mc.player.getYaw());
        fake.refreshPositionAndAngles(FakePlayer.mc.player.getX() - Math.sin(yawRadians) * 2.0, FakePlayer.mc.player.getY(), FakePlayer.mc.player.getZ() + Math.cos(yawRadians) * 2.0, FakePlayer.mc.player.getYaw() + 180.0f, 0.0f);
        fake.headYaw = fake.getYaw();
        fake.bodyYaw = fake.getYaw();
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            fake.equipStack(slot, FakePlayer.mc.player.getEquippedStack(slot).copy());
        }
        if (this.totem.isState()) {
            fake.equipStack(EquipmentSlot.OFFHAND, new ItemStack(Items.TOTEM_OF_UNDYING));
        }
        fake.setHealth(fake.getMaxHealth());
        fake.setInvulnerable(this.invulnerable.isState());
        FakePlayer.mc.world.addEntity((Entity)fake);
        this.fakePlayer = fake;
    }

    private void remove() {
        if (this.fakePlayer != null && FakePlayer.mc.world != null) {
            FakePlayer.mc.world.removeEntity(this.fakePlayer.getId(), Entity.RemovalReason.DISCARDED);
        }
        this.fakePlayer = null;
    }
}
