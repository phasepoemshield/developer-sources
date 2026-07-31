package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.Generated;
import net.minecraft.network.packet.Packet;
import ru.ocz.protection.annotation.Compile;

public class PlayerFakeLags
extends Module {
    public static PlayerFakeLags INSTANCE = new PlayerFakeLags();
    public final ModeSetting mode = new ModeSetting("Режим", "Blink", "Blink", "Pulse");
    public final FloatSetting delay = new FloatSetting("Задержка (MS)", 500.0f, 50.0f, 2000.0f, 50.0f);
    public final BooleanSetting onlyMovement = new BooleanSetting("Только движение", true);
    public final ObjectArrayList<Packet<?>> packets = new ObjectArrayList();
    public final TimerUtils timer = new TimerUtils();
    public boolean releasing = false;

    public PlayerFakeLags() {
        super("PlayerFakeLags", "Фейковые лаги", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.delay, this.onlyMovement);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.packets.clear();
        this.timer.reset();
        this.releasing = false;
    }

    @EventLink
    void onEvent(EventUpdate ignored) {
        if (PlayerFakeLags.mc.player == null) {
            return;
        }
        if (this.mode.is("Pulse") && this.timer.finished(this.delay.getValue().longValue())) {
            this.releasePackets();
            this.timer.reset();
        }
    }

    @EventLink
    @Compile
    native void onEvent(EventPacket var1);

    private void releasePackets() {
        if (this.packets.isEmpty()) {
            return;
        }
        this.releasing = true;
        for (Packet packet : this.packets) {
            PlayerFakeLags.mc.player.networkHandler.sendPacket(packet);
        }
        this.packets.clear();
        this.releasing = false;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.releasePackets();
    }

    @Generated
    public ModeSetting getMode() {
        return this.mode;
    }

    @Generated
    public FloatSetting getDelay() {
        return this.delay;
    }

    @Generated
    public BooleanSetting getOnlyMovement() {
        return this.onlyMovement;
    }

    @Generated
    public ObjectArrayList<Packet<?>> getPackets() {
        return this.packets;
    }

    @Generated
    public TimerUtils getTimer() {
        return this.timer;
    }

    @Generated
    public boolean isReleasing() {
        return this.releasing;
    }

    @Generated
    public void setReleasing(boolean releasing) {
        this.releasing = releasing;
    }
}