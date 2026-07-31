package ru.metaculture.protection;

import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.particle.ParticleTypes;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Totem Voices",
   O000000000 = "Заменяет звук тотема на кастомный",
   O0000000000 = Category.Misc
)
public class TotemVoices extends Module {
   private final NumberSetting O000000000O = new NumberSetting("Громкость", 50.0F, 0.0F, 100.0F, 1.0F, false);
   private final ModeSetting O000000000O0 = new ModeSetting("Звук", "Хмм", "Хмм", "Это печально(", "Ебать это чё", "67!");

   public TotemVoices() {
      this.O00000000(new Setting[]{this.O000000000O0, this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (o0000000O000OO.O00000000000() instanceof EntityStatusS2CPacket var2 && var2.getStatus() == 35) {
            Entity var4 = var2.getEntity(O0000000000.world);
            if (var4 != null && var4.getId() == O0000000000.player.getId()) {
               o0000000O000OO.O000000000();
               this.O0000000000O0();
               O0000000000.execute(() -> {
                  O0000000000.particleManager.addEmitter(var4, ParticleTypes.TOTEM_OF_UNDYING, 30);
                  O0000000000.gameRenderer.showFloatingItem(new ItemStack(Items.TOTEM_OF_UNDYING));
               });
            }
         }
      }
   }

   private void O0000000000O0() {
      String var1;
      if (this.O000000000O0.O000000000("Хмм")) {
         var1 = "hm_pon.wav";
      } else if (this.O000000000O0.O000000000("Это печально(")) {
         var1 = "tusky_etopechalno.wav";
      } else if (this.O000000000O0.O000000000("67!")) {
         var1 = "pampimpoms.wav";
      } else {
         var1 = "ebat_eto_cho.wav";
      }

      String var2 = "/assets/" + "wild" + "/tusky/" + var1;
      Thread var3 = new Thread(() -> {
         try {
            InputStream var2x = TotemVoices.class.getResourceAsStream(var2);
            if (var2x == null) {
               ChatUtil.O00000000("Не найден звук по пути: " + var2);
               return;
            }

            AudioInputStream var3x = AudioSystem.getAudioInputStream(new BufferedInputStream(var2x));
            Clip var4 = AudioSystem.getClip();
            var4.open(var3x);
            FloatControl var5 = (FloatControl)var4.getControl(Type.MASTER_GAIN);
            float var6 = this.O000000000O.O0000000000();
            if (var6 <= 0.0F) {
               var5.setValue(var5.getMinimum());
            } else {
               float var7 = (float)(Math.log10(var6 / 100.0) * 20.0);
               var5.setValue(Math.max(var5.getMinimum(), Math.min(var5.getMaximum(), var7)));
            }

            var4.start();
         } catch (Exception var8) {
            var8.printStackTrace();
            ChatUtil.O00000000("Ошибка воспроизведения: " + var8.getMessage());
         }
      }, "Wild-TotemVoice");
      var3.setDaemon(true);
      var3.start();
   }
}
