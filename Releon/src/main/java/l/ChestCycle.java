package l;

import fat.releon.Releon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class ChestCycle extends Helper242 {
   private final Setting2 chestScanRadius = new Setting2("Chest Radius", "Search radius for nearby chests").method2086(24.0F).method2078(6.0F, 64.0F);
   private final Setting2 timerLinkRadius = new Setting2("Timer Radius", "Max distance from chest to timer label")
      .method2086(4.0F)
      .method2078(1.5F, 8.0F);
   private final Setting2 scanIntervalMs = new Setting2("Scan Delay", "Interval between chest rescans in ms")
      .method2086(350.0F)
      .method2078(100.0F, 2000.0F);
   private final Setting2 timerHoldMs = new Setting2("Timer Hold", "Keep last known timer value for this many ms")
      .method2086(4000.0F)
      .method2078(0.0F, 15000.0F);
   private final Setting2 enterBeforeMs = new Setting2("Enter Before", "Return this many ms before chest opens")
      .method2086(1800.0F)
      .method2078(100.0F, 5000.0F);
   private final Setting2 reconnectDelayMs = new Setting2("Reconnect Delay", "Delay between /hub and rejoin attempts")
      .method2086(150.0F)
      .method2078(0.0F, 1000.0F);
   private final Setting2 interactDelayMs = new Setting2("Open Delay", "Delay between attempts to open the chest")
      .method2086(250.0F)
      .method2078(50.0F, 1500.0F);
   private final Setting2 lootDelayMs = new Setting2("Loot Delay", "Delay between quick-move actions").method2086(100.0F).method2078(0.0F, 1000.0F);
   private final Setting3 stashAfterLoot = new Setting3("Stash After Loot", "After looting, go to a stash anarchy and deposit items").method2201(true);
   private final Setting2 stashAnarchy = new Setting2("Stash Anarchy", "Anarchy used for storing loot after a chest is looted")
      .method2086(511.0F)
      .method2078(1.0F, 999.0F)
      .method2081(this.stashAfterLoot::method2200);
   private final Setting2 stashRange = new Setting2("Stash Range", "Search radius for the stash container")
      .method2086(5.0F)
      .method2078(2.0F, 8.0F)
      .method2081(this.stashAfterLoot::method2200);
   private final Setting3 stashHotbar = new Setting3("Stash Hotbar", "Also deposit hotbar items into the stash container")
      .method2201(false)
      .method2199(this.stashAfterLoot::method2200);
   private final Setting3 instantLoot = new Setting3("Warden Loot", "Loot the whole chest immediately like Warden mode").method2201(true);
   private final Setting2 ignoreAfterLootMs = new Setting2("Ignore After", "Ignore a chest for this many ms after looting")
      .method2086(5000.0F)
      .method2078(0.0F, 30000.0F);
   private final Setting2 walkReachDistance = new Setting2("Walk Reach", "Distance at which the player stops before the chest")
      .method2086(3.25F)
      .method2078(2.0F, 6.0F);
   private final Setting3 autoClose = new Setting3("Auto Close", "Close the chest after looting").method2201(true);
   private final Setting3 autoWalk = new Setting3("Auto Walk", "Automatically move toward the chest").method2201(true);
   private final Setting3 blockOnBossBar = new Setting3("Block On BossBar", "Do not leave to hub while a blocking boss bar is visible").method2201(true);
   private final Setting3 showJoinCounter = new Setting3("Join Counter", "Show rejoin countdown on screen").method2201(true);
   private final Pattern mmssPattern = Pattern.compile("(\\d{1,2})\\s*[:]\\s*(\\d{2})");
   private final Pattern secPattern = Pattern.compile(
      "(\\d+(?:[\\.,]\\d+)?)\\s*(?:\\u0441|\\u0441\\u0435\\u043a|\\u0441\\u0435\\u043a\\u0443\\u043d\\u0434|sec|s)\\b", 66
   );
   private final Helper339 actionWatch = new Helper339();
   private final Helper339 lootWatch = new Helper339();
   private Helper409 stage = Helper409.SEARCHING;
   private BlockPos trackedChestPos;
   private BlockPos targetChestPos;
   private int targetAnarchy;
   private long targetReadyAtMs;
   private long lastChestScanMs;
   private List<BlockPos> cachedChests = new ArrayList<>();
   private Map<BlockPos, Helper410> chestTimers = new HashMap<>();
   private Map<BlockPos, Long> ignoredUntilMs = new HashMap<>();
   private boolean unsupportedNotified;
   private boolean stashMissingNotified;
   private Helper406 targetServerType = Helper406.UNKNOWN;
   private boolean movementOverridden;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private BlockPos stashChestPos;

   public ChestCycle() {
      super("ChestCycle", "Chest Cycle", Helper269.MISC);
      this.setup(
         new Helper264[]{
            this.chestScanRadius,
            this.timerLinkRadius,
            this.scanIntervalMs,
            this.timerHoldMs,
            this.enterBeforeMs,
            this.reconnectDelayMs,
            this.interactDelayMs,
            this.lootDelayMs,
            this.stashAfterLoot,
            this.stashAnarchy,
            this.stashRange,
            this.stashHotbar,
            this.instantLoot,
            this.ignoreAfterLootMs,
            this.walkReachDistance,
            this.autoClose,
            this.autoWalk,
            this.blockOnBossBar,
            this.showJoinCounter
         }
      );
   }

   @Override
   public void activate() {
      super.activate();
      this.method4194();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.method4194();
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3894() && var1.method3895() instanceof PlayerInteractBlockC2SPacket var2 && mc.world != null) {
         BlockPos var4 = var2.getBlockHitResult().getBlockPos();
         if (this.method4200(mc.world.getBlockState(var4).getBlock())) {
            this.trackedChestPos = var4.toImmutable();
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null && mc.getNetworkHandler() != null) {
         this.method4198();
         if (this.method4189()) {
            long var2 = System.currentTimeMillis();
            this.method4187(var2);
            this.method4173(var2);
            this.method4174(var2);
            if (this.targetChestPos != null && Helper128.method1059() == this.targetAnarchy && mc.world.getBlockState(this.targetChestPos).isAir()) {
               this.method4197();
               this.method4193();
            }

            switch (this.stage) {
               case SEARCHING:
                  this.method4160(var2);
                  break;
               case WAITING_HUB:
                  this.method4161(var2);
                  break;
               case RETURNING:
                  this.method4162(var2);
                  break;
               case LOOTING:
                  this.method4163(var2);
                  break;
               case STASHING:
                  this.method4168(var2);
            }
         }
      } else {
         this.method4197();
      }
   }

   @Helper104
   public void onDraw(Event20 var1) {
      if (this.showJoinCounter.method2200() && mc.player != null) {
         String var2 = this.method4205();
         if (var2 != null && !var2.isBlank()) {
            int var3 = var1.method4058().getScaledWindowWidth();
            int var4 = var1.method4058().getScaledWindowHeight();
            int var5 = mc.textRenderer.getWidth(var2);
            int var6 = (var3 - var5) / 2;
            int var7 = var4 / 2 + 20;
            var1.method4058().drawText(mc.textRenderer, var2, var6, var7, -1, true);
         }
      }
   }

   private void method4160(long var1) {
      this.method4178(var1);
      if (this.targetChestPos == null) {
         this.method4197();
      } else {
         if (this.targetAnarchy <= 0) {
            this.targetAnarchy = Helper128.method1059();
         }

         if (this.targetServerType == Helper406.UNKNOWN) {
            this.targetServerType = this.method4199();
         }

         long var3 = this.targetReadyAtMs - var1;
         if (var3 > (long)this.enterBeforeMs.method2082() && Helper128.method1059() > 0 && this.actionWatch.method3356(this.reconnectDelayMs.method2082())) {
            if (!this.method4204()) {
               this.method4197();
               mc.player.networkHandler.sendChatCommand("hub");
               this.actionWatch.method3358();
               this.stage = Helper409.WAITING_HUB;
            }
         } else {
            if (var3 <= (long)this.enterBeforeMs.method2082()) {
               if (Helper128.method1059() == this.targetAnarchy) {
                  this.stage = Helper409.RETURNING;
                  this.method4162(var1);
               } else if (this.targetAnarchy > 0) {
                  this.method4190();
                  this.actionWatch.method3358();
                  this.stage = Helper409.RETURNING;
               }
            }
         }
      }
   }

   private void method4161(long var1) {
      this.method4197();
      if (this.targetChestPos == null) {
         this.stage = Helper409.SEARCHING;
      } else if (this.targetReadyAtMs - var1 <= (long)this.enterBeforeMs.method2082()) {
         if (this.targetAnarchy > 0 && this.actionWatch.method3356(this.reconnectDelayMs.method2082())) {
            this.method4190();
            this.actionWatch.method3358();
            this.stage = Helper409.RETURNING;
         }
      }
   }

   private void method4162(long var1) {
      if (this.targetChestPos == null) {
         this.stage = Helper409.SEARCHING;
      } else if (Helper128.method1059() != this.targetAnarchy) {
         this.method4197();
         if (this.actionWatch.method3356(this.reconnectDelayMs.method2082()) && this.targetAnarchy > 0 && var1 - this.targetReadyAtMs < 15000L) {
            this.method4190();
            this.actionWatch.method3358();
         }
      } else if (this.method4167() != null) {
         this.method4197();
         this.stage = Helper409.LOOTING;
         this.method4163(var1);
      } else if (!this.method4182(this.targetChestPos)) {
         this.method4195(this.targetChestPos);
      } else {
         this.method4197();
         this.method4181(this.targetChestPos);
         if (this.actionWatch.method3356(this.interactDelayMs.method2082())) {
            this.method4180(this.targetChestPos);
            this.actionWatch.method3358();
         }

         if (var1 - this.targetReadyAtMs > 15000L) {
            this.method4186(var1);
            this.method4193();
         }
      }
   }

   private void method4163(long var1) {
      this.method4197();
      ScreenHandler var3 = this.method4167();
      if (var3 == null) {
         if (var1 - this.targetReadyAtMs > 5000L) {
            this.method4186(var1);
            this.method4193();
            this.stage = Helper409.SEARCHING;
         } else {
            this.stage = Helper409.RETURNING;
         }
      } else if (this.instantLoot.method2200()) {
         this.method4165(var3);
         if (this.method4166(var3)) {
            this.method4164(var1);
         }
      } else {
         Slot var4 = var3.slots.stream().filter(Slot::hasStack).filter(var0 -> !var0.inventory.equals(mc.player.getInventory())).findFirst().orElse(null);
         if (var4 == null) {
            this.method4164(var1);
         } else {
            if (this.lootWatch.method3356(this.lootDelayMs.method2082())) {
               Helper66.method702(var4, 0, SlotActionType.QUICK_MOVE, true);
               this.lootWatch.method3358();
            }
         }
      }
   }

   private void method4164(long var1) {
      boolean var3 = this.method4191(var1);
      if (this.autoClose.method2200()) {
         Helper66.method701(false);
      }

      this.stashChestPos = null;
      if (!var3) {
         this.method4186(var1);
         this.method4193();
      }

      if (this.stashAfterLoot.method2200()) {
         this.stage = Helper409.STASHING;
      } else {
         this.stage = Helper409.SEARCHING;
      }
   }

   private void method4165(ScreenHandler var1) {
      int var2 = this.method4185(var1);
      if (var2 > 0) {
         for (int var3 = 0; var3 < var2; var3++) {
            if (var1.getSlot(var3).hasStack()) {
               Helper66.method703(var3, 0, SlotActionType.QUICK_MOVE, true);
            }
         }
      }
   }

   private boolean method4166(ScreenHandler var1) {
      int var2 = this.method4185(var1);
      if (var2 <= 0) {
         return true;
      } else {
         for (int var3 = 0; var3 < var2; var3++) {
            if (var1.getSlot(var3).hasStack()) {
               return false;
            }
         }

         return true;
      }
   }

   private ScreenHandler method4167() {
      ScreenHandler var1 = mc.player.currentScreenHandler;
      if (!this.method4184(var1)) {
         return null;
      } else if (this.targetChestPos != null
         && Helper128.method1059() == this.targetAnarchy
         && mc.player.getPos().distanceTo(this.targetChestPos.toCenterPos()) <= this.walkReachDistance.method2082() + 1.5F) {
         return var1;
      } else {
         return this.method4183() ? var1 : null;
      }
   }

   private void method4168(long var1) {
      this.method4197();
      int var3 = Math.max(1, Math.round(this.stashAnarchy.method2082()));
      if (Helper128.method1059() != var3) {
         if (this.actionWatch.method3356(this.reconnectDelayMs.method2082())) {
            this.method4192(var3);
            this.actionWatch.method3358();
         }
      } else {
         ScreenHandler var4 = this.method4169();
         if (var4 != null) {
            this.stashMissingNotified = false;
            this.method4170(var4);
         } else {
            BlockPos var5 = this.method4172();
            if (var5 == null) {
               if (!this.stashMissingNotified) {
                  Notifications.method1666().method1668("[ChestCycle] No stash chest found on /an" + var3 + ".", 2500L);
                  this.stashMissingNotified = true;
               }
            } else {
               this.stashMissingNotified = false;
               this.stashChestPos = var5;
               if (!this.method4182(var5)) {
                  this.method4195(var5);
               } else {
                  this.method4197();
                  this.method4181(var5);
                  if (this.actionWatch.method3356(this.interactDelayMs.method2082())) {
                     this.method4180(var5);
                     this.actionWatch.method3358();
                  }
               }
            }
         }
      }
   }

   private ScreenHandler method4169() {
      ScreenHandler var1 = mc.player.currentScreenHandler;
      if (!this.method4184(var1)) {
         return null;
      } else if (this.stage != Helper409.STASHING) {
         return null;
      } else if (!this.method4183()) {
         return null;
      } else if (this.stashChestPos == null) {
         return var1;
      } else {
         return mc.player.getPos().distanceTo(this.stashChestPos.toCenterPos()) <= this.walkReachDistance.method2082() + 1.5F ? var1 : null;
      }
   }

   private void method4170(ScreenHandler var1) {
      Slot var2 = this.method4171(var1);
      if (var2 == null) {
         Helper66.method701(false);
         this.stashChestPos = null;
         this.stage = Helper409.SEARCHING;
      } else {
         if (this.lootWatch.method3356(this.lootDelayMs.method2082())) {
            Helper66.method702(var2, 0, SlotActionType.QUICK_MOVE, true);
            this.lootWatch.method3358();
         }
      }
   }

   private Slot method4171(ScreenHandler var1) {
      int var2 = this.method4185(var1);
      if (var2 <= 0) {
         return null;
      } else {
         int var3 = var2 + 27;

         for (int var4 = var2; var4 < var1.slots.size(); var4++) {
            if (this.stashHotbar.method2200() || var4 < var3) {
               Slot var5 = var1.getSlot(var4);
               if (var5.hasStack() && var5.inventory.equals(mc.player.getInventory())) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   private BlockPos method4172() {
      int var1 = Math.max(1, (int)Math.ceil(this.stashRange.method2082()));
      double var2 = this.stashRange.method2082() * this.stashRange.method2082();
      double var4 = Double.MAX_VALUE;
      BlockPos var6 = null;
      BlockPos var7 = mc.player.getBlockPos();

      for (BlockPos var9 : BlockPos.iterate(var7.add(-var1, -3, -var1), var7.add(var1, 3, var1))) {
         BlockState var10 = mc.world.getBlockState(var9);
         if (this.method4200(var10.getBlock())) {
            double var11 = mc.player.getEyePos().squaredDistanceTo(var9.toCenterPos());
            if (!(var11 > var2) && !(var11 >= var4)) {
               var4 = var11;
               var6 = var9.toImmutable();
            }
         }
      }

      return var6;
   }

   private void method4173(long var1) {
      if (var1 - this.lastChestScanMs >= (long)this.scanIntervalMs.method2082()) {
         this.lastChestScanMs = var1;
         int var3 = Math.max(1, Math.round(this.chestScanRadius.method2082()));
         BlockPos var4 = mc.player.getBlockPos();
         ArrayList var5 = new ArrayList();

         for (BlockPos var7 : BlockPos.iterate(var4.add(-var3, -6, -var3), var4.add(var3, 6, var3))) {
            BlockState var8 = mc.world.getBlockState(var7);
            if (this.method4200(var8.getBlock())) {
               var5.add(var7.toImmutable());
            }
         }

         this.cachedChests = var5;
      }
   }

   private void method4174(long var1) {
      List<Helper408> var3 = this.method4175();
      HashMap var4 = new HashMap();
      double var5 = this.timerLinkRadius.method2082() * this.timerLinkRadius.method2082();

      for (BlockPos var8 : this.cachedChests) {
         Helper408 var9 = null;
         double var10 = Double.MAX_VALUE;
         Vec3d var12 = var8.toCenterPos();

         for (Helper408 var14 : var3) {
            double var15 = var14.method4154().squaredDistanceTo(var12);
            if (var15 <= var5 && var15 < var10) {
               var10 = var15;
               var9 = var14;
            }
         }

         if (var9 != null) {
            var4.put(var8, new Helper410(var9.method4155(), var1 + (long)(var9.method4155() * 1000.0F), var1));
         } else {
            Helper410 var18 = this.chestTimers.get(var8);
            if (var18 != null && var1 - var18.method4159() <= (long)this.timerHoldMs.method2082()) {
               var4.put(var8, var18);
            }
         }
      }

      Helper407 var17 = this.method4176();
      if (var17 != null && this.trackedChestPos != null && this.cachedChests.contains(this.trackedChestPos)) {
         var4.put(this.trackedChestPos, new Helper410(var17.method4153(), var1 + (long)(var17.method4153() * 1000.0F), var1));
      }

      this.chestTimers = var4;
   }

   private List<Helper408> method4175() {
      ArrayList var1 = new ArrayList();
      double var2 = this.chestScanRadius.method2082();
      Vec3d var4 = mc.player.getPos();
      Box var5 = new Box(var4.x - var2, var4.y - 6.0, var4.z - var2, var4.x + var2, var4.y + 6.0, var4.z + var2);
      mc.world.getOtherEntities(null, var5).forEach(var2x -> {
         String var3 = var2x.getName() == null ? null : var2x.getName().getString();
         Helper407 var4x = this.method4177(var3);
         if (var4x != null) {
            var1.add(new Helper408(var2x.getPos(), var4x.method4153()));
         }
      });
      return var1;
   }

   private Helper407 method4176() {
      if (mc.currentScreen instanceof GenericContainerScreen var1) {
         String var3 = var1.getTitle() == null ? null : var1.getTitle().getString();
         return this.method4177(var3);
      } else {
         return null;
      }
   }

   private Helper407 method4177(String var1) {
      if (var1 != null && !var1.isBlank()) {
         Matcher var2 = this.mmssPattern.matcher(var1);
         if (var2.find()) {
            int var3 = this.method4201(var2.group(1), -1);
            int var4 = this.method4201(var2.group(2), -1);
            if (var3 >= 0 && var4 >= 0 && var4 < 60) {
               return new Helper407(var3 * 60.0F + var4);
            }
         }

         Matcher var5 = this.secPattern.matcher(var1);
         if (var5.find()) {
            float var6 = this.method4202(var5.group(1), Float.NaN);
            if (!Float.isNaN(var6)) {
               return new Helper407(var6);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void method4178(long var1) {
      if (this.targetChestPos == null || !this.method4179(var1)) {
         this.targetChestPos = null;
         this.targetReadyAtMs = 0L;
         this.targetAnarchy = Helper128.method1059();
         if (this.targetServerType == Helper406.UNKNOWN) {
            this.targetServerType = this.method4199();
         }

         this.chestTimers
            .entrySet()
            .stream()
            .filter(var3 -> !this.method4188(var3.getKey(), var1))
            .filter(var2 -> var2.getValue().method4158() >= var1)
            .min((var0, var1x) -> Long.compare(var0.getValue().method4158(), var1x.getValue().method4158()))
            .ifPresent(var1x -> {
               this.targetChestPos = var1x.getKey().toImmutable();
               this.targetReadyAtMs = var1x.getValue().method4158();
            });
      }
   }

   private boolean method4179(long var1) {
      if (this.targetChestPos != null && !this.method4188(this.targetChestPos, var1)) {
         Helper410 var3 = this.chestTimers.get(this.targetChestPos);
         if (var3 != null) {
            this.targetReadyAtMs = var3.method4158();
            return true;
         } else {
            return this.stage != Helper409.SEARCHING || var1 - this.targetReadyAtMs <= 15000L;
         }
      } else {
         return false;
      }
   }

   private void method4180(BlockPos var1) {
      this.method4181(var1);
      Vec3d var2 = mc.player.getEyePos();
      Vec3d var3 = var1.toCenterPos();
      Direction var4 = Direction.getFacing(var2.x - var3.x, var2.y - var3.y, var2.z - var3.z);
      Vec3d var5 = var3.add(var4.getOffsetX() * 0.5, var4.getOffsetY() * 0.5, var4.getOffsetZ() * 0.5);
      BlockHitResult var6 = new BlockHitResult(var5, var4, var1, false);
      ActionResult var7 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var6);
      if (!var7.isAccepted()) {
         Helper38.method520(var1x -> new PlayerInteractBlockC2SPacket(Hand.MAIN_HAND, var6, var1x));
      }
   }

   private void method4181(BlockPos var1) {
      if (mc.player != null) {
         Vec3d var2 = mc.player.getEyePos();
         Vec3d var3 = var1.toCenterPos();
         Vec3d var4 = var3.subtract(var2);
         double var5 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
         float var7 = (float)Math.toDegrees(Math.atan2(var4.z, var4.x)) - 90.0F;
         float var8 = (float)(-Math.toDegrees(Math.atan2(var4.y, Math.max(var5, 0.001))));
         mc.player.setYaw(var7);
         mc.player.setPitch(var8);
         mc.player.prevYaw = var7;
         mc.player.prevPitch = var8;
         mc.player.setHeadYaw(var7);
         mc.player.prevHeadYaw = var7;
         mc.player.setBodyYaw(var7);
         mc.player.prevBodyYaw = var7;
         mc.player
            .networkHandler
            .sendPacket(new Full(mc.player.getX(), mc.player.getY(), mc.player.getZ(), var7, var8, mc.player.isOnGround(), mc.player.horizontalCollision));
      }
   }

   private boolean method4182(BlockPos var1) {
      return mc.player.getPos().distanceTo(var1.toCenterPos()) <= this.walkReachDistance.method2082();
   }

   private boolean method4183() {
      if (mc.currentScreen instanceof HandledScreen var1) {
         if (!(var1 instanceof GenericContainerScreen) && !(var1 instanceof ShulkerBoxScreen)) {
            return false;
         } else {
            String var3 = this.method4203(var1.getTitle().getString());
            return !var3.contains("выбор")
               && !var3.contains("анарх")
               && !var3.contains("режим")
               && !var3.contains("сервер")
               && !var3.contains("лайт")
               && !var3.contains("меню");
         }
      } else {
         return false;
      }
   }

   private boolean method4184(ScreenHandler var1) {
      return var1 instanceof GenericContainerScreenHandler || var1 instanceof ShulkerBoxScreenHandler;
   }

   private int method4185(ScreenHandler var1) {
      if (var1 instanceof GenericContainerScreenHandler var2) {
         return var2.getRows() * 9;
      } else {
         return var1 instanceof ShulkerBoxScreenHandler ? 27 : -1;
      }
   }

   private void method4186(long var1) {
      if (this.targetChestPos != null) {
         this.ignoredUntilMs.put(this.targetChestPos.toImmutable(), var1 + (long)this.ignoreAfterLootMs.method2082());
      }
   }

   private void method4187(long var1) {
      this.ignoredUntilMs.entrySet().removeIf(var2 -> var2.getValue() <= var1);
   }

   private boolean method4188(BlockPos var1, long var2) {
      Long var4 = this.ignoredUntilMs.get(var1);
      return var4 != null && var4 > var2;
   }

   private boolean method4189() {
      if (!Helper128.method1055() && !Helper128.method1052() && this.targetServerType == Helper406.UNKNOWN) {
         if (!this.unsupportedNotified) {
            this.method4197();
            Notifications.method1666().method1668("[ChestCycle] Works only on FunTime and HolyWorld.", 3000L);
            this.unsupportedNotified = true;
         }

         this.setState(false);
         return false;
      } else {
         this.unsupportedNotified = false;
         return true;
      }
   }

   private void method4190() {
      if (this.targetAnarchy > 0) {
         this.method4192(this.targetAnarchy);
      }
   }

   private boolean method4191(long var1) {
      if (this.targetChestPos != null && this.targetAnarchy > 0) {
         Helper410 var3 = this.chestTimers.get(this.targetChestPos);
         if (var3 != null && var3.method4158() > var1 + 250L) {
            this.targetReadyAtMs = var3.method4158();
            return true;
         } else {
            Helper407 var4 = this.method4176();
            if (var4 != null && var4.method4153() > 0.25F) {
               long var5 = var1 + (long)(var4.method4153() * 1000.0F);
               this.targetReadyAtMs = var5;
               this.chestTimers.put(this.targetChestPos.toImmutable(), new Helper410(var4.method4153(), var5, var1));
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void method4192(int var1) {
      if (var1 > 0 && mc.player != null && mc.player.networkHandler != null) {
         Helper406 var2 = this.method4199();
         if (var2 == Helper406.UNKNOWN) {
            var2 = this.targetServerType;
         }

         if (var2 == Helper406.FUN_TIME) {
            Helper357.method3572(mc.player, "/an" + var1);
         } else if (var2 == Helper406.HOLY_WORLD) {
            Releon.method71().method24().method254(var1);
         } else {
            mc.player.networkHandler.sendChatCommand("an" + var1);
         }
      }
   }

   private void method4193() {
      this.method4197();
      this.targetChestPos = null;
      this.targetReadyAtMs = 0L;
      this.targetAnarchy = 0;
      this.targetServerType = this.method4199();
      this.trackedChestPos = null;
   }

   private void method4194() {
      this.method4197();
      this.stage = Helper409.SEARCHING;
      this.trackedChestPos = null;
      this.targetChestPos = null;
      this.targetAnarchy = 0;
      this.targetReadyAtMs = 0L;
      this.targetServerType = this.method4199();
      this.stashChestPos = null;
      this.lastChestScanMs = 0L;
      this.cachedChests.clear();
      this.chestTimers.clear();
      this.ignoredUntilMs.clear();
      this.unsupportedNotified = false;
      this.stashMissingNotified = false;
      this.actionWatch.method3358();
      this.lootWatch.method3358();
   }

   private void method4195(BlockPos var1) {
      if (this.autoWalk.method2200() && mc.currentScreen == null && mc.player != null) {
         this.method4196();
         Vec3d var2 = mc.player.getEyePos();
         Vec3d var3 = var1.toCenterPos();
         Vec3d var4 = var3.subtract(var2);
         double var5 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
         float var7 = (float)Math.toDegrees(Math.atan2(var4.z, var4.x)) - 90.0F;
         float var8 = (float)(-Math.toDegrees(Math.atan2(var4.y, Math.max(var5, 0.001))));
         mc.player.setYaw(var7);
         mc.player.setPitch(var8);
         mc.options.forwardKey.setPressed(true);
         mc.options.backKey.setPressed(false);
         mc.options.leftKey.setPressed(false);
         mc.options.rightKey.setPressed(false);
         if (mc.player.input != null) {
            mc.player.input.movementForward = 1.0F;
            mc.player.input.movementSideways = 0.0F;
         }

         boolean var9 = mc.player.horizontalCollision || var3.y - mc.player.getY() > 0.6 || !mc.player.isOnGround() && mc.options.jumpKey.isPressed();
         mc.options.jumpKey.setPressed(var9);
         if (var9 && mc.player.isOnGround()) {
            mc.player.jump();
         }

         if (!mc.player.isSprinting()) {
            mc.player.setSprinting(true);
         }
      } else {
         this.method4197();
      }
   }

   private void method4196() {
      if (!this.movementOverridden) {
         this.wasForwardPressed = mc.options.forwardKey.isPressed();
         this.wasBackPressed = mc.options.backKey.isPressed();
         this.wasLeftPressed = mc.options.leftKey.isPressed();
         this.wasRightPressed = mc.options.rightKey.isPressed();
         this.wasJumpPressed = mc.options.jumpKey.isPressed();
         this.movementOverridden = true;
      }
   }

   private void method4197() {
      if (this.movementOverridden && mc.player != null) {
         mc.options.forwardKey.setPressed(this.wasForwardPressed);
         mc.options.backKey.setPressed(this.wasBackPressed);
         mc.options.leftKey.setPressed(this.wasLeftPressed);
         mc.options.rightKey.setPressed(this.wasRightPressed);
         mc.options.jumpKey.setPressed(this.wasJumpPressed);
         if (mc.player.input != null) {
            mc.player.input.movementForward = this.wasForwardPressed ? 1.0F : (this.wasBackPressed ? -1.0F : 0.0F);
            mc.player.input.movementSideways = this.wasLeftPressed ? 1.0F : (this.wasRightPressed ? -1.0F : 0.0F);
         }

         this.movementOverridden = false;
      }
   }

   private void method4198() {
      Helper406 var1 = this.method4199();
      if (var1 != Helper406.UNKNOWN) {
         this.targetServerType = var1;
      }
   }

   private Helper406 method4199() {
      if (Helper128.method1052()) {
         return Helper406.FUN_TIME;
      } else {
         return Helper128.method1055() ? Helper406.HOLY_WORLD : Helper406.UNKNOWN;
      }
   }

   private boolean method4200(Block var1) {
      return var1 instanceof ChestBlock || var1 instanceof EnderChestBlock || var1 instanceof BarrelBlock || var1 instanceof ShulkerBoxBlock;
   }

   private int method4201(String var1, int var2) {
      try {
         return Integer.parseInt(var1);
      } catch (Exception var4) {
         return var2;
      }
   }

   private float method4202(String var1, float var2) {
      try {
         return Float.parseFloat(var1.replace(',', '.'));
      } catch (Exception var4) {
         return var2;
      }
   }

   private String method4203(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT);
   }

   private boolean method4204() {
      if (this.blockOnBossBar.method2200() && mc.inGameHud != null) {
         for (ClientBossBar var2 : mc.inGameHud.getBossBarHud().bossBars.values()) {
            String var3 = this.method4203(var2.getName().getString());
            if (var3.contains("pvp") || var3.contains("пвп")) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private String method4205() {
      if (this.targetChestPos != null && this.targetReadyAtMs > 0L) {
         long var1 = this.targetReadyAtMs - System.currentTimeMillis();
         if (this.stage == Helper409.LOOTING) {
            return "Looting chest...";
         } else if (this.stage == Helper409.STASHING) {
            return Helper128.method1059() == Math.max(1, Math.round(this.stashAnarchy.method2082()))
               ? "Stashing loot..."
               : "Going to /an" + Math.max(1, Math.round(this.stashAnarchy.method2082())) + "...";
         } else if (this.stage == Helper409.RETURNING && Helper128.method1059() == this.targetAnarchy) {
            return "Opening chest...";
         } else if (this.stage == Helper409.RETURNING || this.stage == Helper409.WAITING_HUB) {
            return var1 > 0L ? "Join in " + this.method4206(var1) : "Joining now...";
         } else {
            return this.stage == Helper409.SEARCHING && var1 > 0L ? "Join in " + this.method4206(var1) : "Joining now...";
         }
      } else {
         return null;
      }
   }

   private String method4206(long var1) {
      return String.format(Locale.ROOT, "%.1fs", Math.max(0.0, (double)var1) / 1000.0);
   }
}
