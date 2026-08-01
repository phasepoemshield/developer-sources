package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;

@FunctionAdd(name = "NoVelocity", alias = "No Velocity", category = Category.Combat, description = "Отменяет отбрасывание от ударов и взрывов")
public class NoVelocity extends Function {
    public ModeSetting mode = new ModeSetting("Mode", "Cancel", "Cancel", "Jump");
    private float lastHealth = -1f;

    private boolean needJump;

    public NoVelocity() {
        addSettings(mode);
    }

    @EventHandler
    public void onPacket(EventPacket event) {
        if (nullCheck()) return;
        if (!event.isReceive()) return;
        if (!mode.is("Cancel")) return; // jump-мод velocity не трогает

        if (event.getPacket() instanceof EntityVelocityUpdateS2CPacket packet) {
            if (packet.getEntityId() == mc.player.getId()) event.cancel();
        } else if (event.getPacket() instanceof ExplosionS2CPacket) {
            event.cancel();
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;
        if (!mode.is("Jump")) {
            lastHealth = -1f; // сброс, чтобы не триггерить при переключении
            return;
        }

        float health = mc.player.getHealth();
        if (lastHealth < 0f) { // первый тик, базу ставим
            lastHealth = health;
            return;
        }

        if (health < lastHealth && mc.player.isOnGround()) {
            mc.options.jumpKey.setPressed(true);
        }
        lastHealth = health;
    }
}