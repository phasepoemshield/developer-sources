package pulse.modules.visuals;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.ModeSetting;
import pulse.settings.SliderSetting;
import pulse.audio.SoundPlayer;
import pulse.events.AttackEntityEvent;
import pulse.events.CriticalHitEvent;

@ModuleInfo(a = "Hit Sounds", b = "Plays a sound when you hit a target.", c = ModuleCategory.VISUALS)
public class HitSounds extends ClientModule {
    private final ModeSetting sound = new ModeSetting("Sound", new String[]{"Default", "Bell", "Bonk", "Bubble", "Pop", "Uwu", "Moan"}, "Default");
    private final SliderSetting volume = new SliderSetting("Volume", 1.0f, 0.1f, 2.0f, 0.1f);
    private final BooleanSetting onlyPlayers = new BooleanSetting("Only Players", false);

    @EventHandler
    public void a(AttackEntityEvent attackEntityEvent) {
        if (attackEntityEvent.getEntity() == null) {
            return;
        }
        if (!this.onlyPlayers.get() || (attackEntityEvent.getEntity() instanceof PlayerEntity)) {
            playSound();
        }
    }

    @EventHandler
    public void a(CriticalHitEvent criticalHitEvent) {
        if (criticalHitEvent.getEntity() == null) {
            return;
        }
        if (!this.onlyPlayers.get() || (criticalHitEvent.getEntity() instanceof PlayerEntity)) {
            playSound();
        }
    }

    private void playSound() {
        String strD;
        float fFloatValue;
        strD = this.sound.d();
        fFloatValue = this.volume.k().floatValue();
        switch (strD) {
            case "Default":
                SoundPlayer.playRandomHit(fFloatValue);
                break;
            case "Moan":
                SoundPlayer.playRandomMoan(fFloatValue);
                break;
            default:
                SoundPlayer.play(strD.toLowerCase(), fFloatValue);
                break;
        }
    }
}
