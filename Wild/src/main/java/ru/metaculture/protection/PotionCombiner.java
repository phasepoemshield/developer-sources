package ru.metaculture.protection;

import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.RenameItemC2SPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "PotionCombiner",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически объединяет зелья в наковальне"
)
public class PotionCombiner extends Module {
   private static final String O000000000O000 = "Сила";
   private static final String O000000000O00O = "Скорость";
   private static final String O000000000O0O = "Скорость 3 + Сила 3";
   private static final String O000000000O0O0 = "Сила 3 + Скорость 3";
   private static final float O000000000O0OO = 0.92F;
   private static final float O000000000OO = 0.005F;
   private static final float O000000000OO0 = 0.02F;
   private static final int O000000000OO00 = 6;
   private static final double O000000000OO0O = 4.6;
   public final ModeSetting O000000000O = new ModeSetting("Зелье", "Сила", "Сила", "Скорость", "Скорость 3 + Сила 3", "Сила 3 + Скорость 3");
   public final NumberSetting O000000000O0 = new NumberSetting("Уровень", 5.0F, 1.0F, 30.0F, 1.0F, false);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Экономия опыта", true);
   private final O0000O00O0000 O000000000OOO = new O0000O00O0000();
   private final O0000O00O0000 O000000000OOO0 = new O0000O00O0000();
   private final O0000O00O0000 O000000000OOOO = new O0000O00O0000();
   private final O0000O00O0000 O00000000O = new O0000O00O0000();
   private final Random O00000000O0 = new Random();
   private boolean O00000000O00;
   private int O00000000O000 = 8;
   private int O00000000O0000 = 300;
   private int O00000000O000O = 220;
   private int O00000000O00O = -1;
   private int O00000000O00O0 = -1;
   private float O00000000O00OO;
   private String O00000000O0O = "";
   private int O00000000O0O0;

   public PotionCombiner() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O00000000O0O = "";
      this.O00000000O.O000000000(-10000L);
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null || O0000000000.world == null || O0000000000.interactionManager == null) {
         this.O00000000000(false);
      } else if (this.O00000000O00) {
         this.O0000000000OO0();
      } else if (O0000000000.player.experienceLevel < this.O000000000O00()) {
         if (this.O000000000O() != -1) {
            this.O0000000000OO();
         } else {
            this.O0000000000("§cНет пузырьков опыта. Нужно добить уровень до " + this.O000000000O00() + ".");
         }
      } else if (O0000000000.currentScreen instanceof AnvilScreen && O0000000000.player.currentScreenHandler instanceof AnvilScreenHandler var2) {
         this.O00000000(var2);
      } else {
         if (O0000000000.currentScreen == null) {
            this.O0000000000O0();
         }
      }
   }

   private void O0000000000O0() {
      BlockPos var1 = this.O0000000000(6);
      if (var1 == null) {
         this.O000000000("§cНаковальня не найдена в радиусе 6 блоков.");
      } else {
         Vec3d var2 = new Vec3d(var1.getX() + 0.5, var1.getY() + 0.9, var1.getZ() + 0.5);
         Vec3d var3 = this.O00000000(var2, 0.02F);
         O000000O0O00OO var4 = this.O00000000(var3);
         float var5 = 55.0F + this.O00000000(-2.0F, 2.0F);
         O000000O0O0O0.O00000000(var4, var5 * 0.92F, var5 * 0.92F, 25.0F, 25.0F, 2, 30, false);
         if (this.O000000000OOOO.O00000000((long)this.O00000000O000)) {
            if (!(new O000000O0O00OO(O0000000000.player).O00000000(var4) > 4.0F)) {
               if (this.O00000000(var3, 4.6) && this.O00000000(var1, var3)) {
                  BlockHitResult var6 = new BlockHitResult(this.O00000000(Vec3d.ofCenter(var1), 0.08F), Direction.UP, var1, false);
                  O0000000000.player.swingHand(Hand.MAIN_HAND);
                  O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var6);
                  this.O000000000OOOO.O00000000();
                  this.O00000000O000 = this.O00000000(0, 1);
               }
            }
         }
      }
   }

   private void O00000000(AnvilScreenHandler anvilScreenHandler) {
      if (!this.O0000000000000(anvilScreenHandler)) {
         if (!this.O000000000OOO0.O00000000((long)this.O00000000O000O) || !this.O000000000000(anvilScreenHandler)) {
            this.O000000000(anvilScreenHandler);
            if (O0000000000.player.experienceLevel < this.O000000000O00()) {
               this.O0000000000OO();
            } else {
               if (this.O00000000000(anvilScreenHandler)
                  && anvilScreenHandler.getSlot(2).hasStack()
                  && this.O000000000OOO0.O00000000((long)this.O00000000O000O)) {
                  if (this.O000000000O00.O0000000000()) {
                     this.O000000000000O(anvilScreenHandler);
                  }

                  O0000000000.interactionManager.clickSlot(anvilScreenHandler.syncId, 2, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                  this.O000000000OOO0.O00000000();
                  this.O00000000O000O = this.O00000000(85, 120);
               }
            }
         }
      }
   }

   private void O000000000(AnvilScreenHandler anvilScreenHandler) {
      if (this.O000000000OOO0.O00000000((long)this.O00000000O000O)) {
         if (this.O000000000O000()) {
            this.O0000000000(anvilScreenHandler);
         } else {
            for (int var2 = 0; var2 < 2; var2++) {
               ItemStack var3 = this.O000000000(anvilScreenHandler, var2);
               if (!var3.isEmpty() && !this.O00000000(var3)) {
                  this.O00000000(anvilScreenHandler, var2);
                  this.O000000000O0();
                  return;
               }
            }

            for (int var4 = 0; var4 < 2; var4++) {
               if (this.O000000000(anvilScreenHandler, var4).isEmpty()) {
                  int var5 = this.O000000000(anvilScreenHandler, this::O00000000);
                  if (var5 != -1) {
                     this.O00000000(anvilScreenHandler, var5, var4);
                     this.O000000000O0();
                  }

                  return;
               }
            }
         }
      }
   }

   private void O0000000000(AnvilScreenHandler anvilScreenHandler) {
      for (int var2 = 0; var2 < 2; var2++) {
         ItemStack var3 = this.O000000000(anvilScreenHandler, var2);
         if (!var3.isEmpty() && !this.O00000000(var3, var2)) {
            this.O00000000(anvilScreenHandler, var2);
            this.O000000000O0();
            return;
         }
      }

      for (int var4 = 0; var4 < 2; var4++) {
         if (this.O000000000(anvilScreenHandler, var4).isEmpty()) {
            int var5 = this.O000000000(anvilScreenHandler, this.O00000000(var4));
            if (var5 != -1) {
               this.O00000000(anvilScreenHandler, var5, var4);
               this.O000000000O0();
            }

            return;
         }
      }
   }

   private boolean O00000000000(AnvilScreenHandler anvilScreenHandler) {
      ItemStack var2 = this.O000000000(anvilScreenHandler, 0);
      ItemStack var3 = this.O000000000(anvilScreenHandler, 1);
      return this.O000000000O000() ? this.O00000000(var2, 0) && this.O00000000(var3, 1) : this.O00000000(var2) && this.O00000000(var3);
   }

   private boolean O000000000000(AnvilScreenHandler anvilScreenHandler) {
      if (this.O000000000O000()) {
         if (this.O00000000(anvilScreenHandler, this::O000000000) <= 0) {
            this.O0000000000("§cНет ингредиента: Скорость III.");
            return true;
         } else if (this.O00000000(anvilScreenHandler, this::O0000000000) <= 0) {
            this.O0000000000("§cНет ингредиента: Сила III.");
            return true;
         } else {
            return false;
         }
      } else {
         int var2 = this.O00000000(anvilScreenHandler, this::O00000000);
         if (var2 < 2) {
            this.O0000000000("§cНет ингредиента: " + this.O0000000000O00() + " x" + (2 - var2) + ".");
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean O0000000000000(AnvilScreenHandler anvilScreenHandler) {
      for (int var2 = 0; var2 < 2; var2++) {
         ItemStack var3 = this.O000000000(anvilScreenHandler, var2);
         if (!var3.isEmpty() && var3.getCount() > 1) {
            if (this.O000000000OOO0.O00000000((long)this.O00000000O000O)) {
               this.O00000000(anvilScreenHandler, var2);
               this.O000000000O0();
            }

            return true;
         }
      }

      return false;
   }

   private int O00000000(AnvilScreenHandler anvilScreenHandler, Predicate<ItemStack> predicate) {
      int var3 = 0;

      for (int var4 = 0; var4 < anvilScreenHandler.slots.size(); var4++) {
         if (var4 != 2) {
            ItemStack var5 = anvilScreenHandler.getSlot(var4).getStack();
            if (predicate.test(var5)) {
               var3 += Math.max(1, var5.getCount());
            }
         }
      }

      return var3;
   }

   private String O0000000000O00() {
      if (this.O000000000O.O000000000("Сила")) {
         return "Сила II";
      } else {
         return this.O000000000O.O000000000("Скорость") ? "Скорость II" : "зелье";
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (this.O000000000O.O000000000("Сила")) {
         return this.O00000000(itemStack, StatusEffects.STRENGTH, 2);
      } else {
         return this.O000000000O.O000000000("Скорость")
            ? this.O00000000(itemStack, StatusEffects.SPEED, 2)
            : this.O000000000(itemStack) || this.O0000000000(itemStack);
      }
   }

   private boolean O00000000(ItemStack itemStack, int i) {
      return this.O000000000(i) ? this.O000000000(itemStack) : this.O0000000000(itemStack);
   }

   private Predicate<ItemStack> O00000000(int i) {
      return this.O000000000(i) ? this::O000000000 : this::O0000000000;
   }

   private boolean O000000000(int i) {
      boolean var2 = this.O000000000O.O000000000("Скорость 3 + Сила 3");
      return i == 0 ? var2 : !var2;
   }

   private boolean O00000000(ItemStack itemStack, RegistryEntry<StatusEffect> registryEntry, int i) {
      if (!this.O00000000000(itemStack)) {
         return false;
      } else {
         PotionContentsComponent var4 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
         if (var4 == null) {
            return false;
         } else {
            for (StatusEffectInstance var6 : var4.getEffects()) {
               if (var6.getEffectType().equals(registryEntry) && var6.getAmplifier() == i - 1) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private boolean O000000000(ItemStack itemStack) {
      return this.O00000000(itemStack, StatusEffects.SPEED, 3) && !this.O00000000(itemStack, StatusEffects.STRENGTH, 3);
   }

   private boolean O0000000000(ItemStack itemStack) {
      return this.O00000000(itemStack, StatusEffects.STRENGTH, 3) && !this.O00000000(itemStack, StatusEffects.SPEED, 3);
   }

   private boolean O00000000000(ItemStack itemStack) {
      return itemStack != null
         && !itemStack.isEmpty()
         && (itemStack.isOf(Items.POTION) || itemStack.isOf(Items.SPLASH_POTION) || itemStack.isOf(Items.LINGERING_POTION));
   }

   private int O000000000(AnvilScreenHandler anvilScreenHandler, Predicate<ItemStack> predicate) {
      for (int var3 = 3; var3 < anvilScreenHandler.slots.size(); var3++) {
         ItemStack var4 = anvilScreenHandler.getSlot(var3).getStack();
         if (predicate.test(var4)) {
            return var3;
         }
      }

      return -1;
   }

   private void O00000000(AnvilScreenHandler anvilScreenHandler, int i, int j) {
      O0000000000.interactionManager.clickSlot(anvilScreenHandler.syncId, i, 0, SlotActionType.PICKUP, O0000000000.player);
      O0000000000.interactionManager.clickSlot(anvilScreenHandler.syncId, j, 1, SlotActionType.PICKUP, O0000000000.player);
      O0000000000.interactionManager.clickSlot(anvilScreenHandler.syncId, i, 0, SlotActionType.PICKUP, O0000000000.player);
   }

   private void O00000000(AnvilScreenHandler anvilScreenHandler, int i) {
      O0000000000.interactionManager.clickSlot(anvilScreenHandler.syncId, i, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
   }

   private void O000000000000O(AnvilScreenHandler anvilScreenHandler) {
      if (O0000000000.player != null && O0000000000.player.networkHandler != null) {
         String var2 = this.O00000000000O(anvilScreenHandler);

         for (int var3 = 0; var3 < 10; var3++) {
            String var4 = var3 % 2 == 0 ? var2 + this.O0000000000O0O() : var2;
            anvilScreenHandler.setNewItemName(var4);
            O0000000000.player.networkHandler.sendPacket(new RenameItemC2SPacket(var4));
         }
      }
   }

   private String O00000000000O(AnvilScreenHandler anvilScreenHandler) {
      ItemStack var2 = this.O000000000(anvilScreenHandler, 0);
      if (!var2.isEmpty()) {
         return this.O00000000(var2.getName().getString());
      } else {
         ItemStack var3 = this.O000000000(anvilScreenHandler, 2);
         return !var3.isEmpty() ? this.O00000000(var3.getName().getString()) : "Potion";
      }
   }

   private String O0000000000O0O() {
      this.O00000000O0O0++;
      return "_" + Integer.toString(this.O00000000O0O0, 36) + Integer.toString(this.O00000000O0.nextInt(1296), 36);
   }

   private String O00000000(String string) {
      if (string != null && !string.isBlank()) {
         return string.length() > 32 ? string.substring(0, 32) : string;
      } else {
         return "Potion";
      }
   }

   private ItemStack O000000000(AnvilScreenHandler anvilScreenHandler, int i) {
      return anvilScreenHandler != null && i >= 0 && i < anvilScreenHandler.slots.size() ? anvilScreenHandler.getSlot(i).getStack() : ItemStack.EMPTY;
   }

   private void O0000000000OO() {
      this.O00000000O00 = true;
      this.O00000000O00O = O0000000000.player.getInventory().getSelectedSlot();
      this.O00000000O00OO = O0000000000.player.getPitch();
      this.O000000000OOO.O00000000();
   }

   private void O0000000000OO0() {
      if (O0000000000.player.experienceLevel >= this.O000000000O00()) {
         this.O0000000000(true);
      } else if (O0000000000.currentScreen != null) {
         O0000000000.player.closeHandledScreen();
      } else {
         float var1 = 87.0F + this.O00000000(-0.7F, 0.7F);
         O0000000000.player.setPitch(O000000000(var1));
         if (!this.O0000000000OOO()) {
            this.O0000000000(true);
            this.O0000000000("§cНет пузырьков опыта. Нужно добить уровень до " + this.O000000000O00() + ".");
         } else if (this.O000000000OOO.O00000000((long)this.O00000000O0000)) {
            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            this.O000000000OOO.O00000000();
            this.O00000000O0000 = this.O00000000(50, 70);
         }
      }
   }

   private boolean O0000000000OOO() {
      if (O0000000000.player.getMainHandStack().isOf(Items.EXPERIENCE_BOTTLE)) {
         return true;
      } else {
         int var1 = this.O000000000O();
         if (var1 == -1) {
            return false;
         } else if (var1 >= 36 && var1 <= 44) {
            O0000000000.player.getInventory().setSelectedSlot(var1 - 36);
            ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
            return true;
         } else {
            if (this.O00000000O00O < 0) {
               this.O00000000O00O = O0000000000.player.getInventory().getSelectedSlot();
            }

            this.O00000000O00O0 = var1;
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, var1, this.O00000000O00O, SlotActionType.SWAP, O0000000000.player);
            ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
            return true;
         }
      }
   }

   private int O000000000O() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 9; var1 <= 44; var1++) {
            if (O0000000000.player.playerScreenHandler.getSlot(var1).getStack().isOf(Items.EXPERIENCE_BOTTLE)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private void O0000000000(boolean bl) {
      if (bl && O0000000000.player != null && O0000000000.interactionManager != null) {
         if (this.O00000000O00O0 != -1 && this.O00000000O00O >= 0) {
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O00000000O00O0, this.O00000000O00O, SlotActionType.SWAP, O0000000000.player);
         }

         if (this.O00000000O00O >= 0) {
            O0000000000.player.getInventory().setSelectedSlot(this.O00000000O00O);
            ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
         }

         O0000000000.player.setPitch(this.O00000000O00OO);
      }

      this.O00000000O00 = false;
      this.O00000000O00O0 = -1;
      this.O00000000O00O = -1;
   }

   private BlockPos O0000000000(int i) {
      BlockPos var2 = O0000000000.player.getBlockPos();
      Vec3d var3 = O0000000000.player.getEyePos();
      BlockPos var4 = null;
      double var5 = Double.MAX_VALUE;

      for (int var7 = -i; var7 <= i; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            for (int var9 = -i; var9 <= i; var9++) {
               BlockPos var10 = var2.add(var7, var8, var9);
               Block var11 = O0000000000.world.getBlockState(var10).getBlock();
               if (this.O00000000(var11)) {
                  Vec3d var12 = new Vec3d(var10.getX() + 0.5, var10.getY() + 0.9, var10.getZ() + 0.5);
                  double var13 = var3.squaredDistanceTo(var12);
                  if (var13 < var5) {
                     var5 = var13;
                     var4 = var10.toImmutable();
                  }
               }
            }
         }
      }

      return var4;
   }

   private boolean O00000000(Block block) {
      return block == Blocks.ANVIL || block == Blocks.CHIPPED_ANVIL || block == Blocks.DAMAGED_ANVIL;
   }

   private boolean O00000000(BlockPos blockPos, Vec3d vec3d) {
      Vec3d var3 = O0000000000.player.getEyePos();
      BlockHitResult var4 = O0000000000.world.raycast(new RaycastContext(var3, vec3d, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var4.getType() == Type.BLOCK && var4.getBlockPos().equals(blockPos);
   }

   private boolean O00000000(Vec3d vec3d, double d) {
      return O0000000000.player.getEyePos().squaredDistanceTo(vec3d) <= d * d;
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = vec3d.x - var2.x;
      double var5 = vec3d.y - var2.y;
      double var7 = vec3d.z - var2.z;
      double var9 = Math.hypot(var3, var7);
      float var11 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      var11 += this.O00000000(-0.03F, 0.03F);
      var12 += this.O00000000(-0.03F, 0.03F);
      return new O000000O0O00OO(O00000000(var11), O000000000(var12));
   }

   private Vec3d O00000000(Vec3d vec3d, float f) {
      return new Vec3d(vec3d.x + this.O00000000(-f, f), vec3d.y + this.O00000000(-f * 0.5F, f * 0.5F), vec3d.z + this.O00000000(-f, f));
   }

   private void O000000000O0() {
      this.O000000000OOO0.O00000000();
      this.O00000000O000O = this.O00000000(85, 120);
   }

   private void O000000000(String string) {
      if (string != null && !string.isBlank()) {
         if (!string.equals(this.O00000000O0O) || this.O00000000O.O00000000(2500L)) {
            ChatUtil.O00000000("§8[§dPotionCombiner§8] §f" + string);
            this.O00000000O0O = string;
            this.O00000000O.O00000000();
         }
      }
   }

   private void O0000000000(String string) {
      this.O000000000(string);
      if (this.O0000000000000) {
         this.a_();
      }
   }

   private int O000000000O00() {
      return Math.max(1, Math.round(this.O000000000O0.O0000000000()));
   }

   private boolean O000000000O000() {
      return this.O000000000O.O000000000("Скорость 3 + Сила 3") || this.O000000000O.O000000000("Сила 3 + Скорость 3");
   }

   private float O00000000(float f, float g) {
      return f + (g - f) * this.O00000000O0.nextFloat();
   }

   private int O00000000(int i, int j) {
      return i + this.O00000000O0.nextInt(Math.max(1, j - i + 1));
   }

   private static float O00000000(float f) {
      f %= 360.0F;
      if (f >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   private static float O000000000(float f) {
      return Math.max(-90.0F, Math.min(90.0F, f));
   }

   private void O00000000000(boolean bl) {
      this.O0000000000(bl);
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
   }

   @Override
   public void O000000000() {
      this.O00000000000(true);
      super.O000000000();
   }
}
