package pulse.modules.visuals;

import meteordevelopment.orbit.EventHandler;
import meteordevelopment.orbit.EventPriority;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import pulse.events.PacketEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.ModeSetting;
import pulse.animation.AnimationState;
import pulse.animation.Easing;
import pulse.config.ConfigState;
import pulse.events.ClientTickEvent;

@ModuleInfo(a = "Time Changer", b = "Изменяет время суток в мире", c = ModuleCategory.VISUALS)
public class TimeChanger extends ClientModule {
    private final ModeSetting e = new ModeSetting("Время суток", new String[]{"День", "Закат", "Ночь", "Полночь", "Рассвет"}, "День");
    private final AnimationState f = new AnimationState();
    public static int a;
    public static boolean b;

    @EventHandler
    public void a(ClientTickEvent clientTickEvent) {
        if (c.world != null) {
            this.f.a();
            this.f.a(o(), 2.0d, Easing.C, false);
        }
    }

    @EventHandler
    public void a(PacketEvent packetEvent) {
        if (packetEvent.e() == PacketEvent.MessageDirection.RECIEVE) {
            if (packetEvent.d() instanceof WorldTimeUpdateS2CPacket) {
                packetEvent.b();
            } else if (b) {
            }
        }
    }

    public long n() {
        return (long) this.f.j();
    }

    private long o() {
        String strD = this.e.d();
        if ("День".equals(strD)) {
            return 1000L;
        }
        if ("Закат".equals(strD)) {
            return 12500L;
        }
        if ("Ночь".equals(strD)) {
            return 18000L;
        }
        if ("Полночь".equals(strD)) {
            return 22000L;
        }
        if ("Рассвет".equals(strD)) {
            return 23000L;
        }
        return 1000L;
    }

    @Override
    public void f() {
        super.f();
    }

    public static String c(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }
}
