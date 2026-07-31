package codex.fakeplayer;

import com.mojang.authlib.GameProfile;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventAttackEntity;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import java.util.UUID;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_745;

public final class FakePlayerModule extends Module {
    static final FakePlayerModule INSTANCE = new FakePlayerModule();
    private final BooleanSetting totem = new BooleanSetting("Тотем", true);
    private final BooleanSetting invulnerable = new BooleanSetting("Неуязвимость", false);
    private class_745 fakePlayer;

    private FakePlayerModule() {
        super("FakePlayer", "Создает тестовую цель для модулей", ModuleCategory.PLAYER);
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

    public static net.minecraft.class_1309 getTargetForEsp(net.minecraft.class_1309 auraTarget) {
        return auraTarget != null ? auraTarget : INSTANCE.fakePlayer;
    }

    @EventLink
    public void onAttack(EventAttackEntity event) {
        if (this.fakePlayer == null || event.getTarget() != this.fakePlayer) {
            return;
        }
        float damage = Math.max(1.0f, event.getPlayer().method_7261(0.5f) * 4.0f);
        if (this.invulnerable.isState()) {
            this.fakePlayer.method_5684(true);
            event.getPlayer().method_7350();
            event.cancel();
            return;
        }
        float health = Math.max(0.0f, this.fakePlayer.method_6032() - damage);
        if (health <= 0.0f && this.totem.isState()) {
            this.fakePlayer.method_6033(1.0f);
            this.fakePlayer.method_5711((byte)35);
        } else {
            this.fakePlayer.method_6033(health);
            this.fakePlayer.method_5711((byte)2);
        }
        event.getPlayer().method_7350();
        event.cancel();
    }

    private void spawn() {
        class_310 client = QClient.mc;
        if (client == null || client.field_1687 == null || client.field_1724 == null || this.fakePlayer != null) {
            return;
        }
        class_638 world = client.field_1687;
        class_745 fake = new class_745(world, new GameProfile(UUID.randomUUID(), "FakePlayer"));
        fake.method_5808(client.field_1724.method_23317(), client.field_1724.method_23318(), client.field_1724.method_23321() + 2.0, client.field_1724.method_36454() + 180.0f, 0.0f);
        fake.method_5684(this.invulnerable.isState());
        world.method_53875(fake);
        this.fakePlayer = fake;
    }

    private void remove() {
        if (this.fakePlayer == null || QClient.mc == null || QClient.mc.field_1687 == null) {
            this.fakePlayer = null;
            return;
        }
        QClient.mc.field_1687.method_2945(this.fakePlayer.method_5628(), net.minecraft.class_1297.class_5529.field_26998);
        this.fakePlayer = null;
    }
}
