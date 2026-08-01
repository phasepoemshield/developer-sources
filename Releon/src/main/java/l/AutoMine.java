package l;

import fat.releon.Releon;
import java.util.ArrayList;
import net.minecraft.util.math.BlockPos;

public class AutoMine extends Helper242 {
   private final Setting8 targets = new Setting8("Targets", "Blocks for Baritone #mine")
      .method2585("Diamond", "Iron", "Gold", "Emerald", "Lapis", "Redstone", "Coal", "Copper", "Quartz", "Ancient Debris", "Nether Gold")
      .method2586("Diamond", "Iron", "Gold", "Emerald");
   private final Setting2 refreshTicks = new Setting2("Refresh Ticks", "Ticks between repeated #mine commands").method2086(30.0F).method2079(5, 200);
   private final Setting2 maxRange = new Setting2("Max Range", "Maximum distance from start position (blocks)").method2086(32.0F).method2079(8, 256);
   private final Setting3 autoTool = new Setting3("AutoTool", "Enable Baritone autoTool").method2201(true);
   private final Setting3 allowBreak = new Setting3("AllowBreak", "Enable Baritone allowBreak").method2201(true);
   private final Setting3 dualSyntax = new Setting3("Dual Syntax", "Send fallback '#mine ...' syntax").method2201(false);
   private final Setting3 fallbackToNuker = new Setting3("Fallback To Nuker", "Use local Nuker when Baritone is unavailable").method2201(true);
   private final Setting3 forceNuker = new Setting3("Force Nuker", "Always use local Nuker instead of Baritone").method2201(false);
   private final Setting3 stopOnDisable = new Setting3("Stop On Disable", "Send #stop when module turns off").method2201(true);
   private final Setting3 stopOutOfRange = new Setting3("Stop Out Of Range", "Stop Baritone when out of Max Range").method2201(true);
   private boolean baritoneAvailable;
   private int tickCounter;
   private BlockPos startPos;
   private boolean stoppedForRange;
   private Nuker nukerFallback;
   private boolean nukerEnabledByAutoMine;

   public AutoMine() {
      super("AutoMine", "Auto Mine", Helper269.MISC);
      this.setup(
         new Helper264[]{
            this.targets,
            this.refreshTicks,
            this.maxRange,
            this.autoTool,
            this.allowBreak,
            this.dualSyntax,
            this.fallbackToNuker,
            this.forceNuker,
            this.stopOnDisable,
            this.stopOutOfRange
         }
      );
   }

   @Override
   public void activate() {
      super.activate();
      this.tickCounter = 0;
      this.stoppedForRange = false;
      this.startPos = mc.player != null ? mc.player.getBlockPos() : null;
      this.nukerEnabledByAutoMine = false;
      this.nukerFallback = Releon.method71().method25().method2752(Nuker.class);
      this.baritoneAvailable = this.method4223();
      if (!this.forceNuker.method2200() && (this.baritoneAvailable || !this.fallbackToNuker.method2200()) || !this.method4224()) {
         if (!this.baritoneAvailable) {
            this.method906("AutoMine: Baritone class not found.");
            if (this.fallbackToNuker.method2200()) {
               this.method906("AutoMine: Nuker fallback failed.");
            }

            this.setState(false);
         } else {
            if (this.autoTool.method2200()) {
               this.sendBaritone("#set autoTool true");
            }

            if (this.allowBreak.method2200()) {
               this.sendBaritone("#set allowBreak true");
            }

            this.method4221();
         }
      }
   }

   @Override
   public void deactivate() {
      super.deactivate();
      if (this.nukerEnabledByAutoMine && this.nukerFallback != null && this.nukerFallback.isEnabled()) {
         this.nukerFallback.setState(false);
      }

      if (this.stopOnDisable.method2200() && this.baritoneAvailable) {
         this.sendBaritone("#stop");
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.player.networkHandler != null) {
         if (!this.nukerEnabledByAutoMine) {
            if (this.stopOutOfRange.method2200() && this.startPos != null) {
               double var2 = this.maxRange.method2082();
               if (mc.player.squaredDistanceTo(this.startPos.toCenterPos()) > var2 * var2) {
                  if (!this.stoppedForRange) {
                     this.sendBaritone("#stop");
                     this.stoppedForRange = true;
                     this.method906("AutoMine: stopped (out of range). Move back and re-enable.");
                  }

                  return;
               }
            }

            this.tickCounter++;
            if (this.tickCounter >= this.refreshTicks.method2080()) {
               this.tickCounter = 0;
               this.method4221();
            }
         }
      }
   }

   private void method4221() {
      String var1 = this.method4222();
      if (var1.isEmpty()) {
         this.method906("AutoMine: no targets selected.");
      } else {
         this.sendBaritone("#mine 1 " + var1);
         if (this.dualSyntax.method2200()) {
            this.sendBaritone("#mine " + var1);
         }
      }
   }

   private String method4222() {
      ArrayList var1 = new ArrayList();
      if (this.targets.method2588("Diamond")) {
         var1.add("diamond_ore");
         var1.add("deepslate_diamond_ore");
      }

      if (this.targets.method2588("Iron")) {
         var1.add("iron_ore");
         var1.add("deepslate_iron_ore");
      }

      if (this.targets.method2588("Gold")) {
         var1.add("gold_ore");
         var1.add("deepslate_gold_ore");
      }

      if (this.targets.method2588("Emerald")) {
         var1.add("emerald_ore");
         var1.add("deepslate_emerald_ore");
      }

      if (this.targets.method2588("Lapis")) {
         var1.add("lapis_ore");
         var1.add("deepslate_lapis_ore");
      }

      if (this.targets.method2588("Redstone")) {
         var1.add("redstone_ore");
         var1.add("deepslate_redstone_ore");
      }

      if (this.targets.method2588("Coal")) {
         var1.add("coal_ore");
         var1.add("deepslate_coal_ore");
      }

      if (this.targets.method2588("Copper")) {
         var1.add("copper_ore");
         var1.add("deepslate_copper_ore");
      }

      if (this.targets.method2588("Quartz")) {
         var1.add("quartz_ore");
      }

      if (this.targets.method2588("Ancient Debris")) {
         var1.add("ancient_debris");
      }

      if (this.targets.method2588("Nether Gold")) {
         var1.add("nether_gold_ore");
      }

      return String.join(" ", var1);
   }

   private void sendBaritone(String var1) {
      if (mc.player != null && mc.player.networkHandler != null) {
         mc.player.networkHandler.sendChatMessage(var1);
      }
   }

   private boolean method4223() {
      try {
         Class.forName("baritone.api.BaritoneAPI");
         return true;
      } catch (Throwable var2) {
         return false;
      }
   }

   private boolean method4224() {
      if (this.nukerFallback == null) {
         this.method906("AutoMine: Nuker module not found.");
         return false;
      } else {
         this.nukerFallback.method2270().method2389("Auto");
         this.nukerFallback.method2271().method2201(true);
         this.nukerFallback.method2273().method2201(false);
         this.nukerFallback.method2274().method2201(true);
         this.nukerFallback.method2275().method2201(true);
         this.nukerFallback.method2278().method2086(Math.min(Math.max(this.maxRange.method2082() / 8.0F, 2.0F), 6.0F));
         this.nukerFallback.method2279().method2086(2.0F);
         this.nukerFallback.method2280().method2086(0.35F);
         this.nukerFallback.method2281().method2086(8.0F);
         this.nukerFallback.method2282().method2086(6.0F);
         if (!this.nukerFallback.isEnabled()) {
            this.nukerFallback.setState(true);
            this.nukerEnabledByAutoMine = true;
         }

         this.method906("AutoMine: using Nuker fallback mode.");
         return true;
      }
   }
}
