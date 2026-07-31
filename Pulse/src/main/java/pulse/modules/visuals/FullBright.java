package pulse.modules.visuals;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.option.SimpleOption;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.events.ClientTickEvent;

@ModuleInfo(a = "Full Bright", b = "Increases world brightness", c = ModuleCategory.VISUALS)
public class FullBright extends ClientModule {
    private static final double FULL_BRIGHT_GAMMA = 9999.0d;
    private double previousGamma = 1.0d;

    @Override
    public void e() {
        if (c.options == null) {
            return;
        }
        this.previousGamma = ((Double) c.options.getGamma().getValue()).doubleValue();
        c.options.getGamma().setValue(Double.valueOf(FULL_BRIGHT_GAMMA));
    }

    @Override
    public void f() {
        if (c.options != null) {
            c.options.getGamma().setValue(Double.valueOf(this.previousGamma));
        }
        super.f();
    }

    @EventHandler
    public void a(ClientTickEvent clientTickEvent) {
        if (c.options == null) {
            return;
        }
        SimpleOption SimpleOptionVarGetGamma = c.options.getGamma();
        if (((Double) SimpleOptionVarGetGamma.getValue()).doubleValue() != FULL_BRIGHT_GAMMA) {
            SimpleOptionVarGetGamma.setValue(Double.valueOf(FULL_BRIGHT_GAMMA));
        }
    }
}
