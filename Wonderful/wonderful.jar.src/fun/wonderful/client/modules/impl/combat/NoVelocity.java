package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import ru.ocz.protection.annotation.Compile;

public class NoVelocity
extends Module {
    public static NoVelocity INSTANCE = new NoVelocity();
    private final ModeSetting mode = new ModeSetting("Мод", "Vanilla", "Vanilla", "Grim", "Jump Reset");
    private final BooleanSetting explosions = new BooleanSetting("Взрывы", true);
    private boolean needJump;
    private int hurtTicks;

    public NoVelocity() {
        super("NoVelocity", "Убирает отдачу от урона", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.explosions);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.needJump = false;
        this.hurtTicks = 0;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.needJump = false;
        this.hurtTicks = 0;
    }

    @EventLink
    public void onPacket(EventPacket event) {
        if (NoVelocity.mc.player == null || NoVelocity.mc.world == null) {
            return;
        }
        if (event.getType() != EventPacket.Type.RECEIVE) {
            return;
        }
        Packet<?> class_25962 = event.getPacket();
        if (class_25962 instanceof EntityVelocityUpdateS2CPacket) {
            double velY;
            EntityVelocityUpdateS2CPacket packet = (EntityVelocityUpdateS2CPacket)class_25962;
            if (packet.getEntityId() != NoVelocity.mc.player.getId()) {
                return;
            }
            if (this.mode.is("Vanilla")) {
                event.cancel();
            }
            if (this.mode.is("Grim")) {
                event.cancel();
                double velY2 = packet.getVelocityY() / 8000.0;
                if (NoVelocity.mc.player.isOnGround() && velY2 > 0.0) {
                    NoVelocity.mc.player.setVelocity(NoVelocity.mc.player.getVelocity().x, 0.0, NoVelocity.mc.player.getVelocity().z);
                } else if (velY2 > 0.0) {
                    NoVelocity.mc.player.setVelocity(NoVelocity.mc.player.getVelocity().x, 0.0, NoVelocity.mc.player.getVelocity().z);
                }
            }
            if (this.mode.is("Jump Reset") && (velY = packet.getVelocityY() / 8000.0) > 0.1) {
                this.needJump = true;
                this.hurtTicks = 0;
            }
        }
        if (this.explosions.isState() && event.getPacket() instanceof ExplosionS2CPacket && (this.mode.is("Vanilla") || this.mode.is("Grim"))) {
            event.cancel();
        }
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);
}