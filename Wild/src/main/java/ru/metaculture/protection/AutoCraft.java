package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Map.Entry;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ingame.CraftingScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoCraft",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически крафтит выбранный рецепт"
)
public class AutoCraft extends Module {
   public final TextArraySetting O000000000O = new TextArraySetting("Рецепт");
   public final TextSetting O000000000O0 = new TextSetting("Кол-во предметов", "64").O00000000(6);
   public final NumberSetting O000000000O00 = new NumberSetting("Задержка", 80.0F, 20.0F, 500.0F, 10.0F, false);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Не отображать экран", false);
   private final O0000O00O0000 O000000000O00O = new O0000O00O0000();
   private final O0000O00O0000 O000000000O0O = new O0000O00O0000();
   private final O0000O00O0000 O000000000O0O0 = new O0000O00O0000();
   private final Queue<Runnable> O000000000O0OO = new ArrayDeque<>();
   private IBaritone O000000000OO;
   private AutoCraft.W65 O000000000OO0 = AutoCraft.W65.IDLE;
   private BlockPos O000000000OO00;
   private int O000000000OO0O;
   private int O000000000OOO;
   private int O000000000OOO0;
   private String O000000000OOOO = "";
   private CraftingScreen O00000000O;

   public AutoCraft() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000OO = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.O000000000OO0O = 0;
      this.O000000000OOO = 0;
      this.O000000000OOO0 = 0;
      this.O000000000O0OO.clear();
      this.O000000000OOOO = "";
      if (this.O000000000O.O00000000000()) {
         this.O0000000000("§cРецепт пуст.");
      } else if (this.O000000000OO() <= 0) {
         this.O0000000000("§cНекорректное количество предметов.");
      } else {
         this.O000000000OO0 = AutoCraft.W65.FINDING_TABLE;
         this.O000000000O00O.O00000000();
         this.O000000000O0O.O00000000();
         this.O000000000O0O0.O00000000();
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O000000000O0OO.clear();
      this.O000000000OO00 = null;
      this.O000000000OOO = 0;
      this.O000000000OOO0 = 0;
      this.O000000000OO0 = AutoCraft.W65.IDLE;
      this.O00000000O = null;
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      if (this.O000000000OO != null) {
         this.O000000000OO.getPathingBehavior().cancelEverything();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00OO o0000000O00OO) {
      if (this.O000000000O000.O0000000000() && this.O000000000OO0 != AutoCraft.W65.IDLE && o0000000O00OO.O0000000000() instanceof CraftingScreen var2) {
         this.O00000000O = var2;
         o0000000O00OO.O00000000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (!this.O0000000000O0()) {
            if (!this.O000000000O00O()) {
               if (!this.O000000000OOOO.isBlank()) {
                  this.O0000000000("§cНе хватает предмета: §f" + this.O000000000(this.O000000000OOOO));
               } else {
                  switch (this.O000000000OO0) {
                     case IDLE:
                     default:
                        break;
                     case FINDING_TABLE:
                        this.O0000000000O00();
                        break;
                     case GOING_TO_TABLE:
                        this.O0000000000O0O();
                        break;
                     case AIMING_TABLE:
                        this.O0000000000OO();
                        break;
                     case OPENING_TABLE:
                        this.O0000000000OO0();
                        break;
                     case CLEARING_GRID:
                        this.O0000000000OOO();
                        break;
                     case PLACING_RECIPE:
                        this.O000000000O();
                        break;
                     case WAITING_RESULT:
                        this.O000000000O0();
                        break;
                     case TAKING_RESULT:
                        this.O000000000O00();
                        break;
                     case CLOSING:
                        this.O000000000O000();
                  }
               }
            }
         }
      }
   }

   private boolean O0000000000O0() {
      if (!PlayerHelper.O0000000000O0()) {
         return false;
      } else {
         if (this.O000000000OO != null) {
            this.O000000000OO.getPathingBehavior().cancelEverything();
         }

         O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
         O000000O0O0O0.O0000000000000 = 0;
         O000000O0O0O0.O00000000000O0 = null;
         return true;
      }
   }

   private void O0000000000O00() {
      if (this.O000000000O00O.O000000000000(this.O000000000O0OO())) {
         this.O000000000OO00 = this.O000000000O0O0();
         if (this.O000000000OO00 == null) {
            this.O0000000000("§cВерстак рядом не найден.");
         } else {
            this.O000000000OO0 = AutoCraft.W65.GOING_TO_TABLE;
            this.O000000000O00O.O00000000();
            this.O000000000O0O.O00000000();
            this.O000000000O0O0.O00000000();
         }
      }
   }

   private void O0000000000O0O() {
      if (!this.O00000000(this.O000000000OO00)) {
         this.O000000000OO0 = AutoCraft.W65.FINDING_TABLE;
         this.O000000000O00O.O00000000();
      } else {
         double var1 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O000000000OO00));
         if (var1 <= 4.0) {
            if (this.O000000000OO != null) {
               this.O000000000OO.getPathingBehavior().cancelEverything();
            }

            this.O000000000OO0 = AutoCraft.W65.AIMING_TABLE;
            this.O000000000O00O.O00000000();
         } else {
            if (this.O000000000OO != null && (!this.O000000000OO.getCustomGoalProcess().isActive() || this.O000000000O0O.O000000000000(1500L))) {
               this.O000000000OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O000000000OO00, 2));
               this.O000000000O0O.O00000000();
            }

            if (this.O000000000O0O0.O000000000000(15000L)) {
               this.O0000000000("§cНе удалось дойти до верстака.");
            }
         }
      }
   }

   private void O0000000000OO() {
      O000000O0O00OO var1 = this.O00000000(Vec3d.ofCenter(this.O000000000OO00));
      O000000O0O0O0.O00000000(var1, 45.0F, 45.0F, 30.0F, 30.0F, 4, 5, false);
      if (!(new O000000O0O00OO(O0000000000.player).O00000000(var1) > 4.0F) && this.O000000000O00O.O000000000000(this.O000000000O0OO())) {
         BlockHitResult var2 = new BlockHitResult(Vec3d.ofCenter(this.O000000000OO00), Direction.UP, this.O000000000OO00, false);
         O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var2);
         O0000000000.player.swingHand(Hand.MAIN_HAND);
         this.O000000000OO0 = AutoCraft.W65.OPENING_TABLE;
         this.O000000000O00O.O00000000();
      }
   }

   private void O0000000000OO0() {
      if (this.O000000000O0O() != null) {
         this.O000000000OO0 = AutoCraft.W65.CLEARING_GRID;
         this.O000000000O00O.O00000000();
      } else {
         if (this.O000000000O00O.O000000000000(5000L)) {
            this.O0000000000("§cВерстак не открылся.");
         }
      }
   }

   private void O0000000000OOO() {
      CraftingScreen var1 = this.O000000000O0O();
      if (var1 == null) {
         this.O000000000OO0 = AutoCraft.W65.FINDING_TABLE;
         this.O000000000O00O.O00000000();
      } else {
         CraftingScreenHandler var2 = (CraftingScreenHandler)var1.getScreenHandler();

         for (int var3 = 1; var3 <= 9; var3++) {
            if (var2.getSlot(var3).hasStack()) {
               int var4 = var3;
               this.O000000000O0OO.add(() -> O0000000000.interactionManager.clickSlot(var2.syncId, var4, 0, SlotActionType.QUICK_MOVE, O0000000000.player));
            }
         }

         this.O000000000OO0 = AutoCraft.W65.PLACING_RECIPE;
         this.O000000000O00O.O00000000();
      }
   }

   private void O000000000O() {
      CraftingScreen var1 = this.O000000000O0O();
      if (var1 == null) {
         this.O000000000OO0 = AutoCraft.W65.FINDING_TABLE;
         this.O000000000O00O.O00000000();
      } else {
         CraftingScreenHandler var2 = (CraftingScreenHandler)var1.getScreenHandler();
         String var3 = this.O00000000(var2);
         if (!var3.isBlank()) {
            this.O0000000000("§cНе хватает предмета: §f" + this.O000000000(var3));
         } else {
            for (int var4 = 0; var4 < 9; var4++) {
               String var5 = this.O000000000O.O00000000(var4);
               if (!var5.isBlank()) {
                  int var6 = var4 + 1;
                  this.O000000000O0OO.add(() -> this.O00000000(var2, var5, var6));
               }
            }

            this.O000000000OO0 = AutoCraft.W65.WAITING_RESULT;
            this.O000000000O00O.O00000000();
         }
      }
   }

   private void O000000000O0() {
      CraftingScreen var1 = this.O000000000O0O();
      if (var1 == null) {
         this.O000000000OO0 = AutoCraft.W65.FINDING_TABLE;
         this.O000000000O00O.O00000000();
      } else if (this.O000000000O00O.O000000000000(Math.max(150, this.O000000000O0OO() * 2))) {
         if (!((CraftingScreenHandler)var1.getScreenHandler()).getSlot(0).hasStack()) {
            this.O0000000000("§cРецепт не даёт результат.");
         } else {
            ItemStack var2 = ((CraftingScreenHandler)var1.getScreenHandler()).getSlot(0).getStack().copy();
            int var3 = Math.max(1, var2.getCount());
            int var4 = Math.max(1, this.O000000000OO() - this.O000000000OO0O);
            int var5 = Math.max(1, (var4 + var3 - 1) / var3);
            this.O000000000OOO0 = Math.max(1, Math.min(var5, this.O000000000((CraftingScreenHandler)var1.getScreenHandler())));
            this.O000000000OOO = this.O000000000OOO0 * var3;
            int var6 = this.O000000000OOO0 - 1;
            if (var6 > 0) {
               this.O00000000((CraftingScreenHandler)var1.getScreenHandler(), var6);
            }

            this.O000000000OO0 = AutoCraft.W65.TAKING_RESULT;
            this.O000000000O00O.O00000000();
         }
      }
   }

   private void O000000000O00() {
      CraftingScreen var1 = this.O000000000O0O();
      if (var1 == null) {
         this.O000000000OO0 = AutoCraft.W65.FINDING_TABLE;
         this.O000000000O00O.O00000000();
      } else if (this.O000000000O00O.O000000000000(this.O000000000O0OO())) {
         ItemStack var2 = ((CraftingScreenHandler)var1.getScreenHandler()).getSlot(0).getStack().copy();
         int var3 = Math.max(1, var2.getCount());
         O0000000000.interactionManager.clickSlot(((CraftingScreenHandler)var1.getScreenHandler()).syncId, 0, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
         this.O000000000OO0O = this.O000000000OO0O + Math.max(var3, this.O000000000OOO);
         ChatUtil.O00000000("§8[§6AutoCraft§8] §aСкрафтил: §f" + Math.min(this.O000000000OO0O, this.O000000000OO()) + "/" + this.O000000000OO());
         this.O000000000OOO = 0;
         this.O000000000OOO0 = 0;
         this.O000000000OO0 = AutoCraft.W65.CLOSING;
         this.O000000000O00O.O00000000();
      }
   }

   private void O000000000O000() {
      if (this.O000000000O00O.O000000000000(this.O000000000O0OO())) {
         if (this.O000000000OO0O >= this.O000000000OO()) {
            if (O0000000000.player != null) {
               O0000000000.player.closeHandledScreen();
            }

            this.O00000000O = null;
            ChatUtil.O00000000("§8[§6AutoCraft§8] §aГотово.");
            this.O00000000(false);
         } else {
            this.O000000000OO0 = AutoCraft.W65.CLEARING_GRID;
            this.O000000000O00O.O00000000();
         }
      }
   }

   private boolean O000000000O00O() {
      if (this.O000000000O0OO.isEmpty()) {
         return false;
      } else if (!this.O000000000O00O.O000000000000(this.O000000000O0OO())) {
         return true;
      } else {
         this.O000000000O0OO.poll().run();
         this.O000000000O00O.O00000000();
         return true;
      }
   }

   private CraftingScreen O000000000O0O() {
      CraftingScreen var1 = ScreenUtil.O00000000(O0000000000, this.O00000000O, CraftingScreen.class);
      if (var1 == null) {
         this.O00000000O = null;
      }

      return var1;
   }

   private String O00000000(CraftingScreenHandler craftingScreenHandler) {
      HashMap var2 = new HashMap();

      for (String var6 : this.O000000000O.O000000000000()) {
         if (var6 != null && !var6.isBlank()) {
            var2.put(var6, (Integer)var2.getOrDefault(var6, 0) + 1);
         }
      }

      for (Entry var8 : ((HashMap<String, Integer>)var2).entrySet()) {
         int var9 = this.O00000000(craftingScreenHandler, (String)var8.getKey());
         if (var9 < (Integer)var8.getValue()) {
            return (String)var8.getKey();
         }
      }

      return "";
   }

   private int O00000000(CraftingScreenHandler craftingScreenHandler, String string) {
      int var3 = 0;

      for (int var4 = 10; var4 < craftingScreenHandler.slots.size(); var4++) {
         ItemStack var5 = craftingScreenHandler.getSlot(var4).getStack();
         if (this.O00000000(var5, string)) {
            var3 += var5.getCount();
         }
      }

      return var3;
   }

   private int O000000000(CraftingScreenHandler craftingScreenHandler) {
      HashMap var2 = new HashMap();
      int var3 = 64;

      for (String var7 : this.O000000000O.O000000000000()) {
         if (var7 != null && !var7.isBlank()) {
            var2.put(var7, (Integer)var2.getOrDefault(var7, 0) + 1);
            ItemStack var8 = this.O00000000(var7);
            if (!var8.isEmpty()) {
               var3 = Math.min(var3, var8.getMaxCount());
            }
         }
      }

      int var9 = var3;

      for (Entry var11 : ((HashMap<String, Integer>)var2).entrySet()) {
         int var12 = (Integer)var11.getValue();
         int var13 = this.O00000000(craftingScreenHandler, (String)var11.getKey()) + var12;
         var9 = Math.min(var9, var13 / (Integer)var11.getValue());
      }

      return Math.max(1, var9);
   }

   private void O00000000(CraftingScreenHandler craftingScreenHandler, int i) {
      for (int var3 = 0; var3 < 9; var3++) {
         String var4 = this.O000000000O.O00000000(var3);
         if (!var4.isBlank()) {
            int var5 = var3 + 1;
            this.O000000000O0OO.add(() -> this.O00000000(craftingScreenHandler, var4, var5, i));
         }
      }
   }

   private void O00000000(CraftingScreenHandler craftingScreenHandler, String string, int i) {
      int var4 = this.O000000000(craftingScreenHandler, string);
      if (var4 == -1) {
         this.O000000000OOOO = string;
      } else {
         O0000000000.interactionManager.clickSlot(craftingScreenHandler.syncId, var4, 0, SlotActionType.PICKUP, O0000000000.player);
         O0000000000.interactionManager.clickSlot(craftingScreenHandler.syncId, i, 1, SlotActionType.PICKUP, O0000000000.player);
         O0000000000.interactionManager.clickSlot(craftingScreenHandler.syncId, var4, 0, SlotActionType.PICKUP, O0000000000.player);
      }
   }

   private void O00000000(CraftingScreenHandler craftingScreenHandler, String string, int i, int j) {
      int var5 = j;

      while (var5 > 0) {
         int var6 = this.O000000000(craftingScreenHandler, string);
         if (var6 == -1) {
            this.O000000000OOOO = string;
            return;
         }

         O0000000000.interactionManager.clickSlot(craftingScreenHandler.syncId, var6, 0, SlotActionType.PICKUP, O0000000000.player);
         int var7 = var5;
         if (craftingScreenHandler.getCursorStack().isEmpty()) {
            this.O000000000OOOO = string;
            return;
         }

         while (var5 > 0 && !craftingScreenHandler.getCursorStack().isEmpty()) {
            O0000000000.interactionManager.clickSlot(craftingScreenHandler.syncId, i, 1, SlotActionType.PICKUP, O0000000000.player);
            var5--;
         }

         if (var5 == var7) {
            this.O000000000OOOO = string;
            return;
         }

         if (!craftingScreenHandler.getCursorStack().isEmpty()) {
            O0000000000.interactionManager.clickSlot(craftingScreenHandler.syncId, var6, 0, SlotActionType.PICKUP, O0000000000.player);
         }
      }
   }

   private int O000000000(CraftingScreenHandler craftingScreenHandler, String string) {
      for (int var3 = 10; var3 < craftingScreenHandler.slots.size(); var3++) {
         Slot var4 = craftingScreenHandler.getSlot(var3);
         if (var4.hasStack() && this.O00000000(var4.getStack(), string)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean O00000000(ItemStack itemStack, String string) {
      if (itemStack != null && !itemStack.isEmpty() && string != null && !string.isBlank()) {
         Identifier var3 = Registries.ITEM.getId(itemStack.getItem());
         return var3 != null && var3.toString().equals(string);
      } else {
         return false;
      }
   }

   private ItemStack O00000000(String string) {
      Identifier var2 = Identifier.tryParse(string == null ? "" : string);
      if (var2 == null) {
         return ItemStack.EMPTY;
      } else {
         Item var3 = (Item)Registries.ITEM.get(var2);
         return var3 == Items.AIR ? ItemStack.EMPTY : var3.getDefaultStack();
      }
   }

   private BlockPos O000000000O0O0() {
      BlockPos var1 = O0000000000.player.getBlockPos();
      BlockPos var2 = null;
      double var3 = Double.MAX_VALUE;
      byte var5 = 16;

      for (BlockPos var7 : BlockPos.iterate(var1.add(-var5, -5, -var5), var1.add(var5, 5, var5))) {
         if (this.O00000000(var7)) {
            double var8 = var1.getSquaredDistance(var7);
            if (var8 < var3) {
               var3 = var8;
               var2 = var7.toImmutable();
            }
         }
      }

      return var2;
   }

   private boolean O00000000(BlockPos blockPos) {
      return blockPos != null && O0000000000.world != null && O0000000000.world.getBlockState(blockPos).isOf(Blocks.CRAFTING_TABLE);
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = vec3d.x - var2.x;
      double var5 = vec3d.y - var2.y;
      double var7 = vec3d.z - var2.z;
      float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
      return new O000000O0O00OO(var9, var10);
   }

   private int O000000000O0OO() {
      return Math.max(20, (int)this.O000000000O00.O0000000000());
   }

   private int O000000000OO() {
      String var1 = this.O000000000O0.O0000000000().trim();
      if (var1.isEmpty()) {
         return 0;
      } else {
         try {
            return Math.max(0, Math.min(999999, Integer.parseInt(var1)));
         } catch (NumberFormatException var3) {
            return 0;
         }
      }
   }

   private String O000000000(String string) {
      Identifier var2 = Identifier.tryParse(string);
      if (var2 == null) {
         return string;
      } else {
         Item var3 = (Item)Registries.ITEM.get(var2);
         return var3 == Items.AIR ? string : var3.getName().getString();
      }
   }

   private void O0000000000(String string) {
      ChatUtil.O00000000("§8[§6AutoCraft§8] " + string);
      this.O00000000(false);
   }

   static enum W65 {
      IDLE,
      FINDING_TABLE,
      GOING_TO_TABLE,
      AIMING_TABLE,
      OPENING_TABLE,
      CLEARING_GRID,
      PLACING_RECIPE,
      WAITING_RESULT,
      TAKING_RESULT,
      CLOSING;
   }
}
