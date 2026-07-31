package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import lombok.Generated;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday", "bitrixtime", "oblamovvv"}
)
@ModuleRegister(
   O00000000 = "Test",
   O0000000000 = Category.Player,
   O000000000 = "..."
)
public class TestModule extends Module {
   private final KeybindSetting O000000000O = new KeybindSetting("Установка точки", -1);
   private static BlockPos O000000000O0;
   private static BlockPos O000000000O00;
   private BlockPos[] O000000000O000;
   private int O000000000O00O = 0;
   private int O000000000O0O = 0;
   private final O0000O00O000 O000000000O0O0 = new O0000O00O000();

   public TestModule() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @Override
   public void O00000000() {
      this.O0000000000O0O();
      this.O000000000O00O = 0;
      super.O00000000();
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O00000000000() == this.O000000000O.O0000000000() && this.O000000000O0O0.O00000000000(300L)) {
         if (this.O000000000O0O == 0) {
            O000000000O0 = O0000000000.player.getBlockPos();
            O000000000O00 = null;
            this.O000000000O000 = null;
            this.O00000000("Точка 1: " + O000000000O0.toShortString());
            this.O000000000O0O = 1;
         } else if (this.O000000000O0O == 1) {
            O000000000O00 = O0000000000.player.getBlockPos();
            this.O00000000("Точка 2: " + O000000000O00.toShortString());
            this.O0000000000O0O();
            this.O000000000O0O = 2;
         } else {
            O000000000O0 = O0000000000.player.getBlockPos();
            O000000000O00 = null;
            this.O000000000O000 = null;
            BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
            this.O00000000("Сброс. Точка 1: " + O000000000O0.toShortString());
            this.O000000000O0O = 1;
         }

         this.O000000000O0O0.O00000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && this.O000000000O000 != null && this.O000000000O000.length != 0) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         this.O00000000(var2);
      }
   }

   private void O00000000(IBaritone iBaritone) {
      BlockPos var2 = this.O000000000O000[this.O000000000O00O];
      double var3 = O0000000000.player.squaredDistanceTo(var2.getX() + 0.5, var2.getY(), var2.getZ() + 0.5);
      if (var3 < 2.0) {
         this.O000000000O00O = (this.O000000000O00O + 1) % this.O000000000O000.length;
         var2 = this.O000000000O000[this.O000000000O00O];
      }

      iBaritone.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var2));
   }

   private void O0000000000O0O() {
      if (O000000000O0 != null && O000000000O00 != null) {
         int var1 = Math.min(O000000000O0.getX(), O000000000O00.getX());
         int var2 = Math.max(O000000000O0.getX(), O000000000O00.getX());
         int var3 = Math.min(O000000000O0.getZ(), O000000000O00.getZ());
         int var4 = Math.max(O000000000O0.getZ(), O000000000O00.getZ());
         int var5 = (int)O0000000000.player.getY();
         this.O000000000O000 = new BlockPos[]{
            new BlockPos(var1, var5, var3), new BlockPos(var2, var5, var3), new BlockPos(var2, var5, var4), new BlockPos(var1, var5, var4)
         };
      }
   }

   private void O00000000(String string) {
      if (O0000000000.player != null) {
         O0000000000.player.sendMessage(Text.of("§7[§bTestModule§7] §f" + string), false);
      }
   }

   @Override
   public void O000000000() {
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      super.O000000000();
   }

   @Generated
   public static BlockPos O0000000000O0() {
      return O000000000O0;
   }

   @Generated
   public static void O00000000(BlockPos blockPos) {
      O000000000O0 = blockPos;
   }

   @Generated
   public static BlockPos O0000000000O00() {
      return O000000000O00;
   }

   @Generated
   public static void O000000000(BlockPos blockPos) {
      O000000000O00 = blockPos;
   }
}
