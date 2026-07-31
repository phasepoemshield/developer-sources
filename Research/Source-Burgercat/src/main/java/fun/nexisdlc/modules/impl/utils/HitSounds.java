package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.entity.EventAttack;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.BufferedInputStream;
import java.io.InputStream;

import static java.lang.Math.*;
import static net.minecraft.util.math.MathHelper.wrapDegrees;

@FunctionAdd(name = "HitSounds", alias = "Hit Sounds", category = Category.Render, description = "Звуки при ударе")
public class HitSounds extends Function {

    private final ModeSetting sound = new ModeSetting("Звук",
            "Первый",
            "Первый", "Второй", "Третий", "Обычный"
    );
    public SliderSetting volume = new SliderSetting("Громкость", 10.0f, 5.0f, 100.0f, 1.0f);

    public HitSounds() {
        addSettings(sound, volume);
    }

    @EventHandler
    public void onAttack(EventAttack.Swing e) {
        if (nullCheck()) return;
        if (e.getTarget() == null) return;
        if (!(e.getTarget() instanceof LivingEntity)) return;

        playSound(e.getTarget());
    }

    public void playSound(Entity e) {
        try {
            if ("Обычный".equals(sound.get())) {
                SoundEvent vanillaSound = SoundEvents.BLOCK_ANVIL_LAND;
             //   System.out.println("[HitSounds] Vanilla: BLOCK_ANVIL_HIT -> " + Registries.SOUND_EVENT.getId(vanillaSound));
                mc.world.playSound(
                        mc.player,
                        mc.player.getBlockPos(),
                        vanillaSound,
                        SoundCategory.PLAYERS,
                        1.0f,
                        1.0f
                );
                return;
            }
            Clip clip = AudioSystem.getClip();
            InputStream is = mc.getResourceManager().getResource(Identifier.of("nexis", "sounds/attack/" + getFileName() + ".wav")).get().getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bis);
            if (audioInputStream == null) {
                System.out.println("Sound not found!");
                return;
            }
            clip.open(audioInputStream);
            clip.start();

            FloatControl floatControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            if (e != null) {
                FloatControl balance = (FloatControl) clip.getControl(FloatControl.Type.BALANCE);
                Vec3d vec = e.getEntityPos().subtract(mc.player.getEntityPos());

                double yaw = wrapDegrees(toDegrees(atan2(vec.z, vec.x)) - 90);
                double delta = wrapDegrees(yaw - mc.player.getYaw());

                if (abs(delta) > 180) delta -= signum(delta) * 360;
                try {
                    balance.setValue((float) delta / 180);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            floatControl.setValue(-(mc.player.distanceTo(e) * 5) - (volume.max / volume.get()));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String getFileName() {
        switch (sound.get()) {
            case "Первый" -> {
                return "marker".toString();
            }
            case "Второй" -> {
                return "bonk".toString();
            }
            case "Третий" -> {
                return "crime".toString();
            }
        }
        return "";
    }
    public String getPreviewFileName() {
        return getFileName();
    }
}