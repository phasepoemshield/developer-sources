package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMove;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import ru.ocz.protection.annotation.Compile;

public class ElytraMotion
extends Module {
    public static ElytraMotion INSTANCE = new ElytraMotion();
    public FloatSetting distance = new FloatSetting("Дистанция до игрока", 3.0f, 0.0f, 6.0f, 0.1f);
    public BooleanSetting bypass = new BooleanSetting("Обход", false);

    public ElytraMotion() {
        super("ElytraMotion", "Зависает рядом с игроком на элитрах", Module.ModuleCategory.COMBAT);
        this.addSettings(this.distance, this.bypass);
    }

    @EventLink
    @Compile
    public native void onMove(EventMove var1);
}