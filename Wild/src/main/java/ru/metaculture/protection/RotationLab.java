package ru.metaculture.protection;

import java.nio.file.Files;
import java.nio.file.Path;
import net.minecraft.text.Text;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "RotationLab",
   O0000000000 = Category.Player,
   O000000000 = "Тренажёр человеческих паттернов ротации",
   O00000000000 = {O0000000OO0OOO.NEW}
)
public class RotationLab extends Module {
   private final TextSetting O000000000O = new TextSetting("Asset", "rotation_lab").O00000000(48);
   private final ButtonSetting O000000000O0 = new ButtonSetting("Delete Asset", 0).O000000000("Delete").O00000000(this::O000000000O);
   private final ModeSetting O000000000O00 = new ModeSetting("Mode", "Mixed", "Mixed", "Flick", "Tracking", "Micro", "Vertical", "Diagonal", "Idle", "Attack");
   private final BooleanSetting O000000000O000 = new BooleanSetting("Auto Capture", true);
   private final NumberSetting O000000000O00O = new NumberSetting("Target Radius", 11.0F, 5.0F, 30.0F, 1.0F, false);
   private final NumberSetting O000000000O0O = new NumberSetting("Spread", 78.0F, 25.0F, 95.0F, 1.0F, false);
   private final NumberSetting O000000000O0O0 = new NumberSetting("Targets", 80.0F, 5.0F, 500.0F, 1.0F, false);
   private RotationLabScreen O000000000O0OO;

   public RotationLab() {
      this.O00000000(
         new Setting[]{
            this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      if (O0000000000 != null) {
         O0000000000.execute(this::O000000000O0);
      }
   }

   @Override
   public void O000000000() {
      if (this.O000000000O0OO != null) {
         this.O000000000O0OO.O00000000();
      }

      if (this.O000000000O0OO != null && O0000000000.currentScreen == this.O000000000O0OO) {
         O0000000000.setScreen(null);
      }

      this.O000000000O0OO = null;
      super.O000000000();
   }

   private void O000000000O0() {
      if (this.O0000000000000 && O0000000000.getWindow() != null) {
         this.O000000000O0OO = new RotationLabScreen(this);
         O0000000000.setScreen(this.O000000000O0OO);
         if (O0000000000.player != null) {
            O0000000000.player.sendMessage(Text.of("RotationLab opened"), true);
         }
      }
   }

   public void O00000000(RotationLabScreen o0000O000OO00) {
      if (this.O000000000O0OO == o0000O000OO00) {
         this.O000000000O0OO = null;
      }

      if (this.O0000000000000) {
         this.O00000000(false);
      }
   }

   public String O0000000000O0() {
      return this.O000000000O.O0000000000();
   }

   public String O0000000000O00() {
      return this.O000000000O00.O0000000000();
   }

   public boolean O0000000000O0O() {
      return this.O000000000O000.O0000000000();
   }

   public int O0000000000OO() {
      return Math.max(5, Math.round(this.O000000000O00O.O0000000000()));
   }

   public float O0000000000OO0() {
      return Math.max(0.25F, Math.min(0.95F, this.O000000000O0O.O0000000000() / 100.0F));
   }

   public int O0000000000OOO() {
      return Math.max(1, Math.round(this.O000000000O0O0.O0000000000()));
   }

   public void O000000000O() {
      Path var1 = O000000OO0000.O00000000(this.O0000000000O0());

      try {
         if (this.O000000000O0OO != null) {
            this.O000000000O0OO.O000000000();
         }

         if (Files.deleteIfExists(var1)) {
            ChatUtil.O00000000("[RotationLab] Deleted " + var1.getFileName());
         } else {
            ChatUtil.O00000000("[RotationLab] Asset not found: " + var1.getFileName());
         }
      } catch (Throwable var3) {
         ChatUtil.O00000000("[RotationLab] Delete failed: " + var3.getClass().getSimpleName());
      }
   }
}
