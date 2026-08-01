package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AppleFarmer",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически фармит для вас яблоки"
)
public class AppleFarmer extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Дистанция", 4.5F, 3.0F, 4.5F, 0.1F, true);
   public final BooleanSetting O000000000O0 = new BooleanSetting("Авто-пополнение из сундуков", true);
   public final NumberSetting O000000000O00 = new NumberSetting("Чинить при прочности <", 150.0F, 20.0F, 1000.0F, 10.0F, false)
      .O00000000(() -> !this.O000000000O0.O0000000000());
   public final NumberSetting O000000000O000 = new NumberSetting("Радиус поиска сундуков", 12.0F, 4.0F, 40.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O0000000000());
   public final NumberSetting O000000000O00O = new NumberSetting("Разгрузка при свободных слотах ≤", 3.0F, 0.0F, 10.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O0000000000());
   private AppleFarmer.W48 O000000000O0O = AppleFarmer.W48.FIND_SPOT;
   private BlockPos O000000000O0O0 = null;
   private final List<BlockPos> O000000000O0OO = new ArrayList<>();
   private static final int O000000000OO = 2;
   private static final int O000000000OO0 = 4;
   private static final int O000000000OO00 = 8;
   private Direction O000000000OO0O = Direction.NORTH;
   private BlockPos O000000000OOO = null;
   private int O000000000OOO0 = 0;
   private int O000000000OOOO = 0;
   private IBaritone O00000000O;
   private boolean O00000000O0 = false;
   private BlockPos O00000000O00 = null;
   private AppleFarmer.W50 O00000000O000 = AppleFarmer.W50.NONE;
   private AppleFarmer.W49 O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
   private BlockPos O00000000O000O = null;
   private boolean O00000000O00O = false;
   private boolean O00000000O00O0 = false;
   private int O00000000O00OO = 0;
   private boolean O00000000O0O = false;
   private int O00000000O0O0 = -1;
   private int O00000000O0O00 = -1;
   private float O00000000O0O0O = 0.0F;
   private final O0000O00O0000 O00000000O0OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0OO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0OOO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO00 = new O0000O00O0000();
   private final Queue<Runnable> O00000000OO000 = new ArrayDeque<>();
   private boolean O00000000OO00O = false;
   private static final int O00000000OO0O = 64;
   private static final int O00000000OO0O0 = 64;
   private static final int O00000000OO0OO = 128;
   private static final int O00000000OOO = 64;

   public AppleFarmer() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O00000000O = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
      this.O000000000O0O0 = null;
      this.O000000000O0OO.clear();
      this.O000000000OOO = null;
      this.O000000000OOOO = 0;
      this.O00000000O0 = false;
      this.O00000000O00 = null;
      this.O00000000OO00O = false;
      this.O00000000O0000();
      this.O000000000OOO0 = 0;
   }

   @Override
   public void O000000000() {
      if (O0000000000.player != null && this.O00000000O0O) {
         try {
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, 45, this.O00000000O0O0, SlotActionType.SWAP, O0000000000.player);
            if (this.O00000000O0O0 >= 0) {
               O0000000000.player.getInventory().setSelectedSlot(this.O00000000O0O0);
            }

            O0000000000.player.setPitch(this.O00000000O0O0O);
         } catch (Exception var2) {
         }
      }

      this.O00000000O0O = false;
      if (this.O00000000O != null) {
         this.O00000000O.getPathingBehavior().cancelEverything();
      }

      this.O00000000O0000();
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      this.O000000000OOO = null;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (!PlayerHelper.O0000000000O0()) {
            if (this.O000000000O0.O0000000000()) {
               if (this.O00000000O000 != AppleFarmer.W50.NONE && O0000000000.currentScreen instanceof GenericContainerScreen var4) {
                  if (this.O00000000O000 == AppleFarmer.W50.UNLOAD) {
                     this.O000000000(var4);
                  } else {
                     this.O00000000(var4);
                  }

                  return;
               }

               if (this.O00000000O000 == AppleFarmer.W50.NONE && this.O00000000O0 && O0000000000.currentScreen == null) {
                  AppleFarmer.W50 var2 = this.O0000000000OOO();
                  if (var2 != AppleFarmer.W50.NONE) {
                     this.O00000000O000 = var2;
                     this.O000000000O000();
                  }
               }

               if (this.O00000000O000 != AppleFarmer.W50.NONE) {
                  this.O000000000O00O();
                  return;
               }
            }

            if (O0000000000.currentScreen == null) {
               this.O000000000OOOO++;
               if (this.O000000000OOOO > 4) {
                  this.O00000000O0OO();
                  this.O000000000OOOO = 0;
               }

               this.O000000000OOO0++;
               if (this.O000000000O0O == AppleFarmer.W48.BREAKING || this.O000000000OOO0 >= 2) {
                  switch (this.O000000000O0O) {
                     case FIND_SPOT:
                        this.O0000000000O0();
                        break;
                     case PLACE:
                        this.O0000000000O00();
                        break;
                     case BONEMEAL:
                        this.O0000000000O0O();
                        break;
                     case SCAN_TREE:
                        this.O0000000000OO();
                        break;
                     case BREAKING:
                        this.O0000000000OO0();
                  }
               }
            }
         }
      }
   }

   private void O0000000000O0() {
      if (!this.O00000000O0) {
         this.O00000000O00 = O0000000000.player.getBlockPos();
         this.O000000000OO0O = O0000000000.player.getHorizontalFacing();
         this.O00000000O0 = true;
      }

      BlockPos var1 = this.O00000000O00;
      BlockPos var2 = var1.offset(this.O000000000OO0O);
      BlockPos var3 = var1.offset(this.O000000000OO0O, 2);
      BlockState var4 = O0000000000.world.getBlockState(var3);
      if (this.O00000000000O(var2) && this.O00000000000O(var2.up())) {
         if (var4.getBlock() == Blocks.OAK_SAPLING) {
            this.O000000000O0O0 = var3;
            this.O000000000O0O = AppleFarmer.W48.BONEMEAL;
            this.O000000000OOO0 = 0;
         } else if (this.O000000000(var4)) {
            this.O000000000O0O0 = var3;
            this.O000000000O0O = AppleFarmer.W48.SCAN_TREE;
            this.O000000000OOO0 = 0;
         } else {
            BlockPos var5 = var3.down();
            if (this.O000000000000O(var5) && var4.isReplaceable()) {
               this.O000000000O0O0 = var5.up();
               this.O000000000O0O = AppleFarmer.W48.PLACE;
            } else {
               ChatUtil.O00000000("§c[AppleFarmer] §fВстаньте напротив места посадки: земля должна быть через один блок перед вами");
               this.a_();
            }

            this.O000000000OOO0 = 0;
         }
      } else {
         ChatUtil.O00000000("§c[AppleFarmer] §fМежду вами и местом посадки должен быть свободный блок");
         this.a_();
         this.O000000000OOO0 = 0;
      }
   }

   private void O0000000000O00() {
      if (this.O000000000O0O0 == null) {
         this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
      } else {
         BlockState var1 = O0000000000.world.getBlockState(this.O000000000O0O0);
         if (var1.getBlock() == Blocks.OAK_SAPLING) {
            this.O000000000O0O = AppleFarmer.W48.BONEMEAL;
            this.O000000000OOO0 = 0;
         } else if (!var1.isReplaceable()) {
            this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
            this.O000000000OOO0 = 0;
         } else {
            int var2 = this.O000000000(Items.OAK_SAPLING);
            if (var2 == -1) {
               var2 = this.O0000000000(Items.OAK_SAPLING);
            }

            if (var2 == -1) {
               if (this.O000000000O0.O0000000000()) {
                  this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
                  this.O000000000OOO0 = 0;
               } else {
                  ChatUtil.O00000000("§c[AppleFarmer] §fНет саженцев");
                  this.a_();
               }
            } else if (this.O000000000000(this.O000000000O0O0.down())) {
               int var3 = O0000000000.player.getInventory().getSelectedSlot();
               O0000000000.player.getInventory().setSelectedSlot(var2);
               this.O00000000000(this.O000000000O0O0.down());
               O0000000000.player.getInventory().setSelectedSlot(var3);
               this.O000000000O0O = AppleFarmer.W48.BONEMEAL;
               this.O000000000OOO0 = 0;
            }
         }
      }
   }

   private void O0000000000O0O() {
      if (this.O000000000O0O0 != null) {
         BlockState var1 = O0000000000.world.getBlockState(this.O000000000O0O0);
         if (this.O000000000(var1)) {
            this.O000000000O0O = AppleFarmer.W48.SCAN_TREE;
         } else if (var1.isReplaceable()) {
            this.O000000000O0O = AppleFarmer.W48.PLACE;
         } else if (var1.getBlock() != Blocks.OAK_SAPLING) {
            this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
         } else {
            int var2 = this.O000000000(Items.BONE_MEAL);
            if (var2 == -1) {
               var2 = this.O0000000000(Items.BONE_MEAL);
            }

            if (var2 == -1) {
               if (this.O000000000O0.O0000000000()) {
                  this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
                  this.O000000000OOO0 = 0;
               } else {
                  ChatUtil.O00000000("§c[AppleFarmer] §fНет костной муки");
                  this.a_();
               }
            } else if (this.O000000000000(this.O000000000O0O0)) {
               int var3 = O0000000000.player.getInventory().getSelectedSlot();
               O0000000000.player.getInventory().setSelectedSlot(var2);
               this.O00000000000(this.O000000000O0O0);
               O0000000000.player.getInventory().setSelectedSlot(var3);
               this.O000000000OOO0 = 0;
            }
         }
      }
   }

   private void O0000000000OO() {
      this.O000000000O0OO.clear();
      BlockPos var1 = this.O000000000O0O0;
      if (var1 == null) {
         this.O000000000O0O = AppleFarmer.W48.PLACE;
      } else {
         double var2 = Math.min(this.O000000000O.O0000000000(), 4.5F);
         int var4 = (int)Math.ceil(var2) + 1;
         BlockPos var5 = this.O00000000O0 && this.O00000000O00 != null ? this.O00000000O00 : O0000000000.player.getBlockPos();

         for (int var6 = -var4; var6 <= var4; var6++) {
            for (int var7 = -2; var7 <= 8; var7++) {
               for (int var8 = -var4; var8 <= var4; var8++) {
                  BlockPos var9 = var5.add(var6, var7, var8);
                  BlockState var10 = O0000000000.world.getBlockState(var9);
                  if (this.O00000000(var10) && this.O00000000000O0(var9) && (!this.O000000000(var10) || this.O00000000(var9, var1))) {
                     this.O000000000O0OO.add(var9);
                  }
               }
            }
         }

         if (this.O000000000O0OO.isEmpty()) {
            this.O000000000O0O = AppleFarmer.W48.PLACE;
         } else {
            this.O000000000O0OO.sort(this::O000000000);
            this.O000000000OOO = null;
            this.O000000000O0O = AppleFarmer.W48.BREAKING;
         }
      }
   }

   private boolean O00000000(BlockPos blockPos, BlockPos blockPos2) {
      return Math.abs(blockPos.getX() - blockPos2.getX()) <= 4 && Math.abs(blockPos.getZ() - blockPos2.getZ()) <= 4;
   }

   private void O0000000000OO0() {
      this.O000000000O0OO.removeIf(blockPos -> !this.O00000000(O0000000000.world.getBlockState(blockPos)) || !this.O00000000000O0(blockPos));
      if (this.O000000000O0OO.isEmpty()) {
         this.O000000000O0O = AppleFarmer.W48.PLACE;
         this.O000000000OOO = null;
      } else {
         BlockPos var1 = this.O00000000O0O00();
         if (var1 == null) {
            this.O000000000O0O = AppleFarmer.W48.SCAN_TREE;
            this.O000000000OOO = null;
            this.O000000000OOO0 = 0;
         } else {
            BlockState var2 = O0000000000.world.getBlockState(var1);
            BlockHitResult var3 = this.O00000000000OO(var1);
            if (var3 == null) {
               this.O000000000OOO = null;
            } else {
               boolean var4 = this.O0000000000(var2);
               boolean var5 = this.O000000000(var2);
               if (var5) {
                  this.O0000000000(true);
               } else if (var4) {
                  this.O0000000000(false);
               }

               O000000O0O00OO var6 = this.O00000000(var3.getPos());
               O000000O0O0O0.O00000000(var6, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
               if (!(new O000000O0O00OO(O0000000000.player).O00000000(var6) > 6.0F)) {
                  if (!var1.equals(this.O000000000OOO)) {
                     O0000000000.interactionManager.attackBlock(var1, var3.getSide());
                     this.O000000000OOO = var1;
                  } else {
                     O0000000000.interactionManager.updateBlockBreakingProgress(var1, var3.getSide());
                  }

                  O0000000000.player.swingHand(Hand.MAIN_HAND);
               }
            }
         }
      }
   }

   private AppleFarmer.W50 O0000000000OOO() {
      if (this.O000000000O()) {
         return AppleFarmer.W50.UNLOAD;
      } else if (this.O000000000O00.O0000000000() > 0.0F && this.O00000000O000O() != -1) {
         return AppleFarmer.W50.REPAIR;
      } else {
         if (this.O000000000O0O == AppleFarmer.W48.FIND_SPOT) {
            if (this.O00000000(Items.BONE_MEAL) == 0) {
               return AppleFarmer.W50.BONEMEAL;
            }

            if (this.O00000000(Items.OAK_SAPLING) == 0) {
               return AppleFarmer.W50.SAPLING;
            }
         }

         return AppleFarmer.W50.NONE;
      }
   }

   private boolean O000000000O() {
      if (this.O00000000OO00O) {
         if (!this.O00000000OO00.O000000000000(30000L)) {
            return false;
         }

         this.O00000000OO00O = false;
      }

      return this.O000000000O0() <= (int)this.O000000000O00O.O0000000000() && this.O000000000O00();
   }

   private int O000000000O0() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isEmpty()) {
            var1++;
         }
      }

      return var1;
   }

   private boolean O000000000O00() {
      return this.O00000000(Items.OAK_LOG) > 0 || this.O00000000(Items.APPLE) > 0 || this.O00000000(Items.STICK) > 0 || this.O00000000(Items.OAK_SAPLING) > 64;
   }

   private void O000000000O000() {
      this.O00000000O00O = false;
      this.O00000000O00O0 = false;
      this.O00000000O00OO = 0;
      this.O00000000O000O = null;
      this.O00000000O0O = false;
      this.O00000000O0O00 = -1;
      this.O00000000OO000.clear();
      this.O000000000OOO = null;
      this.O000000000O0OO.clear();
      this.O00000000O0OO.O00000000();
      this.O00000000O0OO0.O00000000();
      this.O00000000O0OOO.O00000000();
      this.O00000000OO.O00000000();
      switch (this.O00000000O000) {
         case REPAIR:
            this.O00000000O0000 = this.O00000000(Items.EXPERIENCE_BOTTLE) > 0 ? AppleFarmer.W49.REPAIRING : AppleFarmer.W49.FIND_CHEST;
            break;
         case BONEMEAL:
            this.O00000000O0000 = this.O00000000O00O0() ? AppleFarmer.W49.CRAFTING : AppleFarmer.W49.FIND_CHEST;
            break;
         default:
            this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
      }
   }

   private void O000000000O00O() {
      if (O0000000000.currentScreen == null || O0000000000.currentScreen instanceof GenericContainerScreen) {
         switch (this.O00000000O0000) {
            case FIND_CHEST:
               this.O000000000O0O();
               break;
            case GOING:
               this.O000000000O0O0();
               break;
            case ROTATING:
               this.O000000000O0OO();
               break;
            case OPENING:
               this.O000000000OO();
               break;
            case WAIT_GUI:
               this.O000000000OO0();
               break;
            case CRAFTING:
               this.O000000000OO0O();
               break;
            case REPAIRING:
               this.O000000000OOO0();
               break;
            case RETURNING:
               this.O00000000O();
               break;
            case FACING:
               this.O00000000O0();
               break;
            default:
               this.O00000000O000();
         }
      }
   }

   private void O000000000O0O() {
      this.O00000000O000O = this.O0000000000(this.O00000000O000);
      if (this.O00000000O000O == null) {
         this.O000000000(
            "§c[AppleFarmer] §fНе найден сундук «" + this.O00000000000(this.O00000000O000) + "» в радиусе " + (int)this.O000000000O000.O0000000000() + " бл."
         );
      } else {
         if (this.O00000000000O0(this.O00000000O000O) && this.O0000000000(this.O00000000O000O)) {
            this.O00000000O0000 = AppleFarmer.W49.ROTATING;
            this.O00000000O0OO.O00000000();
         } else {
            this.O00000000O00O = true;
            this.O00000000O0000 = AppleFarmer.W49.GOING;
            this.O00000000O0OO0.O00000000();
            this.O00000000O0OOO.O00000000();
         }
      }
   }

   private void O000000000O0O0() {
      if (this.O00000000O000O != null && this.O000000000(this.O00000000O000O)) {
         double var1 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O000O));
         if (var1 <= this.O000000000O.O0000000000() && this.O0000000000(this.O00000000O000O)) {
            if (this.O00000000O != null) {
               this.O00000000O.getPathingBehavior().cancelEverything();
            }

            this.O00000000O0000 = AppleFarmer.W49.ROTATING;
            this.O00000000O0OO.O00000000();
         } else {
            if (this.O00000000O != null && (!this.O00000000O.getCustomGoalProcess().isActive() || this.O00000000O0OO0.O000000000000(1500L))) {
               this.O00000000O.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000O000O, 2));
               this.O00000000O0OO0.O00000000();
            }

            if (this.O00000000O0OOO.O000000000000(15000L)) {
               this.O000000000("§c[AppleFarmer] §fНе удалось дойти до сундука «" + this.O00000000000(this.O00000000O000) + "»");
            }
         }
      } else {
         this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
      }
   }

   private void O000000000O0OO() {
      if (this.O00000000O000O == null) {
         this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
      } else {
         if (this.O000000000000(this.O00000000O000O)) {
            this.O00000000O0000 = AppleFarmer.W49.OPENING;
            this.O00000000O0OO.O00000000();
         }
      }
   }

   private void O000000000OO() {
      if (this.O00000000O0OO.O000000000000(200L)) {
         this.O00000000000(this.O00000000O000O);
         this.O00000000O0000 = AppleFarmer.W49.WAIT_GUI;
         this.O00000000O0OO.O00000000();
      }
   }

   private void O000000000OO0() {
      if (!(O0000000000.currentScreen instanceof GenericContainerScreen)) {
         if (this.O00000000O0OO.O000000000000(2500L)) {
            this.O00000000O00OO++;
            if (this.O00000000O00OO > 3) {
               this.O000000000("§c[AppleFarmer] §fНе удалось открыть сундук «" + this.O00000000000(this.O00000000O000) + "»");
            } else {
               this.O00000000O0000 = AppleFarmer.W49.ROTATING;
               this.O00000000O0OO.O00000000();
            }
         }
      }
   }

   private void O00000000(GenericContainerScreen genericContainerScreen) {
      GenericContainerScreenHandler var2 = (GenericContainerScreenHandler)genericContainerScreen.getScreenHandler();
      int var3 = var2.slots.size() - 36;
      if (var3 <= 0) {
         this.O00000000("§c[AppleFarmer] §fСундук пуст");
      } else if (this.O00000000OO.O000000000000(120L)) {
         if (this.O00000000(this.O00000000O000)) {
            this.O000000000OO00();
         } else {
            int var4 = this.O00000000(var2, var3, this.O00000000O000);
            if (var4 == -1) {
               if (this.O00000000O00O0) {
                  this.O000000000OO00();
               } else {
                  this.O00000000("§c[AppleFarmer] §fВ сундуке «" + this.O00000000000(this.O00000000O000) + "» нет нужных предметов");
               }
            } else {
               O0000000000.interactionManager.clickSlot(var2.syncId, var4, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O00000000O00O0 = true;
               this.O00000000OO.O00000000();
            }
         }
      }
   }

   private void O000000000(GenericContainerScreen genericContainerScreen) {
      GenericContainerScreenHandler var2 = (GenericContainerScreenHandler)genericContainerScreen.getScreenHandler();
      int var3 = var2.slots.size() - 36;
      if (var3 <= 0) {
         this.O00000000("§c[AppleFarmer] §fСундук пуст");
      } else if (this.O00000000OO.O000000000000(120L)) {
         for (int var4 = var3; var4 < var2.slots.size(); var4++) {
            ItemStack var5 = ((Slot)var2.slots.get(var4)).getStack();
            if (this.O00000000(var5) && this.O00000000(var2, var3, var5)) {
               O0000000000.interactionManager.clickSlot(var2.syncId, var4, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O00000000O00O0 = true;
               this.O00000000OO.O00000000();
               return;
            }
         }

         if (!this.O00000000O00O0) {
            this.O00000000OO00O = true;
            this.O00000000OO00.O00000000();
            ChatUtil.O00000000("§c[AppleFarmer] §fСундук «яблоки» переполнен — некуда разгружать");
         }

         if (O0000000000.player != null) {
            O0000000000.player.closeHandledScreen();
         }

         this.O00000000O00();
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else {
         Item var2 = itemStack.getItem();
         if (var2 == Items.OAK_LOG || var2 == Items.APPLE || var2 == Items.STICK) {
            return true;
         } else {
            return var2 == Items.OAK_SAPLING ? this.O00000000(Items.OAK_SAPLING) > 64 : false;
         }
      }
   }

   private boolean O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, ItemStack itemStack) {
      for (int var4 = 0; var4 < i; var4++) {
         ItemStack var5 = ((Slot)genericContainerScreenHandler.slots.get(var4)).getStack();
         if (var5.isEmpty()) {
            return true;
         }

         if (var5.getItem() == itemStack.getItem() && var5.getCount() < var5.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(AppleFarmer.W50 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> this.O00000000(Items.EXPERIENCE_BOTTLE) >= 64;
         case BONEMEAL -> this.O00000000O00O() >= 128;
         case SAPLING -> this.O00000000(Items.OAK_SAPLING) >= 64;
         default -> true;
      };
   }

   private int O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, AppleFarmer.W50 o0000000000) {
      for (int var4 = 0; var4 < i; var4++) {
         ItemStack var5 = ((Slot)genericContainerScreenHandler.slots.get(var4)).getStack();
         if (!var5.isEmpty() && this.O00000000(var5.getItem(), o0000000000)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean O00000000(Item item, AppleFarmer.W50 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> item == Items.EXPERIENCE_BOTTLE;
         case BONEMEAL -> item == Items.BONE_MEAL || item == Items.BONE || item == Items.BONE_BLOCK;
         case SAPLING -> item == Items.OAK_SAPLING;
         default -> false;
      };
   }

   private void O000000000OO00() {
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }

      AppleFarmer.W49 var1 = this.O000000000(this.O00000000O000);
      this.O00000000O0000 = var1;
      if (var1 == AppleFarmer.W49.RETURNING) {
         this.O00000000O0OO0.O00000000();
         this.O00000000O0OOO.O00000000();
      }

      this.O00000000O0OO.O00000000();
      this.O00000000OO.O00000000();
      this.O00000000OO000.clear();
   }

   private AppleFarmer.W49 O000000000(AppleFarmer.W50 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> AppleFarmer.W49.REPAIRING;
         case BONEMEAL -> AppleFarmer.W49.CRAFTING;
         default -> AppleFarmer.W49.RETURNING;
      };
   }

   private void O00000000(String string) {
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }

      this.O000000000(string);
   }

   private void O000000000OO0O() {
      if (O0000000000.currentScreen == null) {
         if (!this.O00000000OO000.isEmpty()) {
            if (this.O00000000OO.O000000000000(90L)) {
               this.O00000000OO000.poll().run();
               this.O00000000OO.O00000000();
            }
         } else if (this.O00000000(Items.BONE_MEAL) >= 128) {
            this.O00000000O00();
         } else {
            int var1 = this.O00000000O00OO();
            if (var1 == -1) {
               this.O00000000O00();
            } else {
               int var2 = O0000000000.player.playerScreenHandler.syncId;
               this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(var2, var1, 0, SlotActionType.PICKUP, O0000000000.player));
               this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(var2, 1, 0, SlotActionType.PICKUP, O0000000000.player));
               this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(var2, 0, 0, SlotActionType.QUICK_MOVE, O0000000000.player));
               this.O00000000OO000.add(this::O000000000OOO);
            }
         }
      }
   }

   private void O000000000OOO() {
      int var1 = O0000000000.player.playerScreenHandler.syncId;

      for (int var2 = 1; var2 <= 4; var2++) {
         if (((Slot)O0000000000.player.playerScreenHandler.slots.get(var2)).hasStack()) {
            O0000000000.interactionManager.clickSlot(var1, var2, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
         }
      }

      if (!O0000000000.player.playerScreenHandler.getCursorStack().isEmpty()) {
         int var3 = this.O00000000O0O();
         if (var3 != -1) {
            O0000000000.interactionManager.clickSlot(var1, var3, 0, SlotActionType.PICKUP, O0000000000.player);
         }
      }
   }

   private void O000000000OOO0() {
      if (O0000000000.currentScreen == null) {
         int var1 = O0000000000.player.playerScreenHandler.syncId;
         if (!this.O00000000O0O) {
            int var4 = this.O00000000O000O();
            if (var4 == -1) {
               this.O00000000O00();
            } else if (this.O00000000(Items.EXPERIENCE_BOTTLE) == 0) {
               this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
            } else if (!O0000000000.player.getOffHandStack().isEmpty()) {
               int var5 = this.O00000000O0O();
               if (var5 == -1) {
                  this.O000000000("§c[AppleFarmer] §fОсвободите офф-хенд или место в инвентаре для починки");
               } else {
                  O0000000000.interactionManager.clickSlot(var1, 45, 0, SlotActionType.PICKUP, O0000000000.player);
                  O0000000000.interactionManager.clickSlot(var1, var5, 0, SlotActionType.PICKUP, O0000000000.player);
               }
            } else {
               this.O00000000O0O0 = var4;
               this.O00000000O0O0O = O0000000000.player.getPitch();
               O0000000000.player.getInventory().setSelectedSlot(var4);
               O0000000000.interactionManager.clickSlot(var1, 45, var4, SlotActionType.SWAP, O0000000000.player);
               if (!this.O000000000OOOO()) {
                  O0000000000.interactionManager.clickSlot(var1, 45, var4, SlotActionType.SWAP, O0000000000.player);
                  O0000000000.player.getInventory().setSelectedSlot(var4);
                  this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
               } else {
                  this.O00000000O0O = true;
                  this.O00000000O0O00 = -1;
                  this.O00000000OO0.O00000000();
                  this.O00000000O0OO.O00000000();
               }
            }
         } else {
            ItemStack var2 = O0000000000.player.getOffHandStack();
            if (!var2.isEmpty() && var2.isDamageable() && var2.getDamage() != 0) {
               if (O0000000000.player.getMainHandStack().getItem() != Items.EXPERIENCE_BOTTLE && !this.O000000000OOOO()) {
                  this.O00000000(var1);
                  this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
               } else {
                  int var3 = var2.getDamage();
                  if (this.O00000000O0O00 == -1) {
                     this.O00000000O0O00 = var3;
                  }

                  if (var3 < this.O00000000O0O00) {
                     this.O00000000O0O00 = var3;
                     this.O00000000OO0.O00000000();
                  } else if (this.O00000000OO0.O000000000000(4000L)) {
                     this.O00000000(var1);
                     this.O000000000("§c[AppleFarmer] §fИнструмент не чинится (нет «Починки»?)");
                     return;
                  }

                  if (this.O00000000O0OO.O000000000000(120L)) {
                     O0000000000.player.setPitch(90.0F);
                     O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
                     O0000000000.player.swingHand(Hand.MAIN_HAND);
                     this.O00000000O0OO.O00000000();
                  }
               }
            } else {
               this.O00000000(var1);
            }
         }
      }
   }

   private void O00000000(int i) {
      O0000000000.interactionManager.clickSlot(i, 45, this.O00000000O0O0, SlotActionType.SWAP, O0000000000.player);
      if (this.O00000000O0O0 >= 0) {
         O0000000000.player.getInventory().setSelectedSlot(this.O00000000O0O0);
      }

      O0000000000.player.setPitch(this.O00000000O0O0O);
      if (!O0000000000.player.getOffHandStack().isEmpty()) {
         int var2 = this.O00000000O0O();
         if (var2 != -1) {
            O0000000000.interactionManager.clickSlot(i, 45, 0, SlotActionType.PICKUP, O0000000000.player);
            O0000000000.interactionManager.clickSlot(i, var2, 0, SlotActionType.PICKUP, O0000000000.player);
         }
      }

      this.O00000000O0O = false;
   }

   private boolean O000000000OOOO() {
      int var1 = this.O00000000O0O0();
      if (var1 == -1) {
         return false;
      } else {
         if (var1 >= 36 && var1 <= 44) {
            O0000000000.player.getInventory().setSelectedSlot(var1 - 36);
         } else {
            O0000000000.interactionManager
               .clickSlot(
                  O0000000000.player.playerScreenHandler.syncId,
                  var1,
                  O0000000000.player.getInventory().getSelectedSlot(),
                  SlotActionType.SWAP,
                  O0000000000.player
               );
         }

         return true;
      }
   }

   private void O00000000O() {
      if (this.O00000000O00O && this.O00000000O00 != null && this.O00000000O != null) {
         if (!O0000000000.player.getBlockPos().equals(this.O00000000O00) && !(O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O00)) <= 0.7)
            )
          {
            if (!this.O00000000O.getCustomGoalProcess().isActive() || this.O00000000O0OO0.O000000000000(1500L)) {
               this.O00000000O.getCustomGoalProcess().setGoalAndPath(new GoalBlock(this.O00000000O00));
               this.O00000000O0OO0.O00000000();
            }

            if (this.O00000000O0OOO.O000000000000(20000L)) {
               this.O00000000O.getPathingBehavior().cancelEverything();
               this.O00000000O0000 = AppleFarmer.W49.FACING;
            }
         } else {
            this.O00000000O.getPathingBehavior().cancelEverything();
            this.O00000000O0000 = AppleFarmer.W49.FACING;
            this.O00000000O0OO.O00000000();
         }
      } else {
         this.O00000000O0000 = AppleFarmer.W49.FACING;
      }
   }

   private void O00000000O0() {
      if (this.O00000000O0) {
         O0000000000.player.setYaw(this.O00000000(this.O000000000OO0O));
         O0000000000.player.setPitch(0.0F);
      }

      this.O00000000O000();
   }

   private float O00000000(Direction direction) {
      return switch (direction) {
         case SOUTH -> 0.0F;
         case WEST -> 90.0F;
         case NORTH -> 180.0F;
         case EAST -> -90.0F;
         default -> O0000000000.player.getYaw();
      };
   }

   private void O00000000O00() {
      this.O00000000O0000 = AppleFarmer.W49.RETURNING;
      this.O00000000O0OO0.O00000000();
      this.O00000000O0OOO.O00000000();
   }

   private void O00000000O000() {
      if (this.O00000000O != null) {
         this.O00000000O.getPathingBehavior().cancelEverything();
      }

      this.O00000000O0000();
      this.O000000000O0O = AppleFarmer.W48.FIND_SPOT;
      this.O000000000OOO0 = 0;
      this.O000000000OOO = null;
      this.O000000000O0OO.clear();
   }

   private void O000000000(String string) {
      ChatUtil.O00000000(string);
      if (this.O00000000O != null) {
         this.O00000000O.getPathingBehavior().cancelEverything();
      }

      this.O00000000O0000();
      this.a_();
   }

   private void O00000000O0000() {
      this.O00000000O000 = AppleFarmer.W50.NONE;
      this.O00000000O0000 = AppleFarmer.W49.FIND_CHEST;
      this.O00000000O000O = null;
      this.O00000000O00O = false;
      this.O00000000O00O0 = false;
      this.O00000000O00OO = 0;
      this.O00000000O0O = false;
      this.O00000000O0O0 = -1;
      this.O00000000O0O00 = -1;
      this.O00000000OO000.clear();
   }

   private int O00000000O000O() {
      for (int var1 = 0; var1 < 9; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (!var2.isEmpty() && var2.isDamageable() && (var2.getItem() instanceof AxeItem || var2.getItem() instanceof HoeItem)) {
            int var3 = var2.getMaxDamage() - var2.getDamage();
            if (var3 <= (int)this.O000000000O00.O0000000000()) {
               return var1;
            }
         }
      }

      return -1;
   }

   private int O00000000(Item item) {
      int var2 = 0;

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
         if (var4.getItem() == item) {
            var2 += var4.getCount();
         }
      }

      return var2;
   }

   private int O00000000O00O() {
      return this.O00000000(Items.BONE_MEAL) + this.O00000000(Items.BONE) * 3 + this.O00000000(Items.BONE_BLOCK) * 9;
   }

   private boolean O00000000O00O0() {
      return this.O00000000(Items.BONE) > 0 || this.O00000000(Items.BONE_BLOCK) > 0;
   }

   private int O00000000O00OO() {
      for (int var1 = 9; var1 <= 44; var1++) {
         Item var2 = ((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).getStack().getItem();
         if (var2 == Items.BONE || var2 == Items.BONE_BLOCK) {
            return var1;
         }
      }

      return -1;
   }

   private int O00000000O0O() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (!((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).hasStack()) {
            return var1;
         }
      }

      return -1;
   }

   private int O00000000O0O0() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).getStack().getItem() == Items.EXPERIENCE_BOTTLE) {
            return var1;
         }
      }

      return -1;
   }

   private BlockPos O0000000000(AppleFarmer.W50 o0000000000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         BlockPos var2 = this.O00000000O0 && this.O00000000O00 != null ? this.O00000000O00 : O0000000000.player.getBlockPos();
         int var3 = (int)this.O000000000O000.O0000000000();
         BlockPos var4 = null;
         double var5 = Double.MAX_VALUE;

         for (BlockPos var8 : BlockPos.iterate(var2.add(-var3, -5, -var3), var2.add(var3, 5, var3))) {
            if (this.O000000000(var8) && this.O00000000(var8, o0000000000)) {
               double var9 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(var8));
               if (var9 < var5) {
                  var5 = var9;
                  var4 = var8.toImmutable();
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private boolean O00000000(BlockPos blockPos, AppleFarmer.W50 o0000000000) {
      String var3 = this.O00000000(blockPos).toLowerCase(Locale.ROOT);
      if (var3.isEmpty()) {
         return false;
      } else {
         String var4;
         String[] var5;
         switch (o0000000000) {
            case REPAIR:
               var4 = "опыт";
               var5 = new String[]{"кост", "яблок"};
               break;
            case BONEMEAL:
               var4 = "кост";
               var5 = new String[]{"опыт", "яблок"};
               break;
            case SAPLING:
            case UNLOAD:
               var4 = "яблок";
               var5 = new String[]{"опыт", "кост"};
               break;
            default:
               return false;
         }

         if (!var3.contains(var4)) {
            return false;
         } else {
            for (String var9 : var5) {
               if (var3.contains(var9)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private String O00000000(BlockPos blockPos) {
      if (blockPos != null && O0000000000.world != null) {
         SignBlockEntity var2 = null;
         double var3 = Double.MAX_VALUE;
         BlockPos var5 = blockPos.add(-1, -1, -1);
         BlockPos var6 = blockPos.add(1, 1, 1);

         for (BlockPos var8 : BlockPos.iterate(var5, var6)) {
            if (O0000000000.world.getBlockEntity(var8) instanceof SignBlockEntity var10) {
               double var11 = var8.getSquaredDistance(blockPos);
               if (var11 < var3) {
                  var3 = var11;
                  var2 = var10;
               }
            }
         }

         return var2 == null ? "" : this.O00000000(var2);
      } else {
         return "";
      }
   }

   private String O00000000(SignBlockEntity signBlockEntity) {
      StringBuilder var2 = new StringBuilder();

      for (Text var6 : signBlockEntity.getFrontText().getMessages(false)) {
         var2.append(var6.getString()).append(' ');
      }

      for (Text var10 : signBlockEntity.getBackText().getMessages(false)) {
         var2.append(var10.getString()).append(' ');
      }

      return var2.toString().replaceAll("§.", "").trim();
   }

   private boolean O000000000(BlockPos blockPos) {
      if (O0000000000.world == null) {
         return false;
      } else {
         BlockEntity var2 = O0000000000.world.getBlockEntity(blockPos);
         return var2 instanceof ChestBlockEntity || var2 instanceof BarrelBlockEntity || var2 instanceof ShulkerBoxBlockEntity;
      }
   }

   private boolean O0000000000(BlockPos blockPos) {
      return this.O00000000000OO(blockPos) != null;
   }

   private String O00000000000(AppleFarmer.W50 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> "опыт";
         case BONEMEAL -> "кости";
         case SAPLING, UNLOAD -> "яблоки";
         default -> "";
      };
   }

   private void O00000000000(BlockPos blockPos) {
      Vec3d var2 = this.O00000000(blockPos, Direction.UP);
      BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, blockPos, false);
      O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var3);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
   }

   private boolean O000000000000(BlockPos blockPos) {
      O000000O0O00OO var2 = this.O00000000(this.O00000000(blockPos, Direction.UP));
      O000000O0O0O0.O00000000(var2, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
      return new O000000O0O00OO(O0000000000.player).O00000000(var2) <= 6.0F;
   }

   private Vec3d O00000000(BlockPos blockPos, Direction direction) {
      return new Vec3d(
         blockPos.getX() + 0.5 + direction.getOffsetX() * 0.5,
         blockPos.getY() + 0.5 + direction.getOffsetY() * 0.5,
         blockPos.getZ() + 0.5 + direction.getOffsetZ() * 0.5
      );
   }

   private O000000O0O00OO O0000000000000(BlockPos blockPos) {
      return this.O00000000(new Vec3d(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5));
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      if (O0000000000.player == null) {
         return new O000000O0O00OO(0.0F, 0.0F);
      } else {
         Vec3d var2 = O0000000000.player.getEyePos();
         double var3 = vec3d.x - var2.x;
         double var5 = vec3d.y - var2.y;
         double var7 = vec3d.z - var2.z;
         double var9 = Math.sqrt(var3 * var3 + var7 * var7);
         float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
         float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
         return new O000000O0O00OO(var11, var12);
      }
   }

   private boolean O000000000000O(BlockPos blockPos) {
      Block var2 = O0000000000.world.getBlockState(blockPos).getBlock();
      return var2 == Blocks.GRASS_BLOCK || var2 == Blocks.DIRT || var2 == Blocks.COARSE_DIRT || var2 == Blocks.PODZOL;
   }

   private boolean O00000000000O(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      return var2.isAir() || var2.isReplaceable();
   }

   private boolean O00000000(BlockState blockState) {
      return this.O000000000(blockState) || this.O0000000000(blockState);
   }

   private boolean O000000000(BlockState blockState) {
      return blockState.getBlock() == Blocks.OAK_LOG;
   }

   private boolean O0000000000(BlockState blockState) {
      return blockState.getBlock() == Blocks.OAK_LEAVES;
   }

   private boolean O00000000000O0(BlockPos blockPos) {
      double var2 = Math.min(this.O000000000O.O0000000000(), 4.5F);
      return O0000000000.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter(blockPos)) <= var2 * var2;
   }

   private int O000000000(BlockPos blockPos, BlockPos blockPos2) {
      boolean var3 = this.O000000000(O0000000000.world.getBlockState(blockPos));
      boolean var4 = this.O000000000(O0000000000.world.getBlockState(blockPos2));
      if (var3 != var4) {
         return var3 ? 1 : -1;
      } else if (var3) {
         return Integer.compare(blockPos.getY(), blockPos2.getY());
      } else {
         Vec3d var5 = O0000000000.player.getEyePos();
         double var6 = var5.squaredDistanceTo(Vec3d.ofCenter(blockPos));
         double var8 = var5.squaredDistanceTo(Vec3d.ofCenter(blockPos2));
         return Double.compare(var6, var8);
      }
   }

   private BlockPos O00000000O0O00() {
      for (BlockPos var2 : this.O000000000O0OO) {
         if (this.O00000000000OO(var2) != null) {
            return var2;
         }
      }

      return null;
   }

   private BlockHitResult O00000000000OO(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               Vec3d var19 = new Vec3d(blockPos.getX() + var7, blockPos.getY() + var12, blockPos.getZ() + var17);
               BlockHitResult var20 = O0000000000.world.raycast(new RaycastContext(var2, var19, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
               if (var20.getType() == Type.BLOCK && var20.getBlockPos().equals(blockPos)) {
                  return var20;
               }
            }
         }
      }

      return null;
   }

   private int O000000000(Item item) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).getItem() == item) {
            return var2;
         }
      }

      return -1;
   }

   private void O0000000000(boolean bl) {
      int var2 = -1;
      ItemStack var3 = O0000000000.player.getMainHandStack();
      if (!bl || !(var3.getItem() instanceof AxeItem)) {
         if (bl || !(var3.getItem() instanceof HoeItem)) {
            for (int var4 = 0; var4 < 9; var4++) {
               ItemStack var5 = O0000000000.player.getInventory().getStack(var4);
               if (!var5.isEmpty()) {
                  if (bl && var5.getItem() instanceof AxeItem) {
                     var2 = var4;
                     break;
                  }

                  if (!bl && var5.getItem() instanceof HoeItem) {
                     var2 = var4;
                     break;
                  }
               }
            }

            if (var2 != -1) {
               O0000000000.player.getInventory().setSelectedSlot(var2);
            }
         }
      }
   }

   private int O0000000000(Item item) {
      int var2 = -1;

      for (int var3 = 9; var3 < 36; var3++) {
         if (O0000000000.player.getInventory().getStack(var3).getItem() == item) {
            var2 = var3;
            break;
         }
      }

      if (var2 == -1) {
         return -1;
      } else {
         int var4 = this.O00000000O0O0O();
         if (var4 == -1) {
            return -1;
         } else {
            O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, var4, SlotActionType.SWAP, O0000000000.player);
            return var4;
         }
      }
   }

   private int O00000000O0O0O() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isEmpty()) {
            return var1;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         Item var2 = O0000000000.player.getInventory().getStack(var3).getItem();
         if (!(var2 instanceof AxeItem)
            && !(var2 instanceof HoeItem)
            && var2 != Items.OAK_SAPLING
            && var2 != Items.BONE_MEAL
            && var2 != Items.BONE
            && var2 != Items.BONE_BLOCK
            && var2 != Items.EXPERIENCE_BOTTLE) {
            return var3;
         }
      }

      return -1;
   }

   private void O00000000O0OO() {
      for (int var1 = 0; var1 < 9; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         boolean var3 = var2.getItem() == Items.BONE_MEAL || var2.getItem() == Items.OAK_SAPLING;
         if (var3 && var2.getCount() < 64) {
            int var4 = -1;
            int var5 = var2.getCount();

            for (int var6 = 9; var6 < 36; var6++) {
               ItemStack var7 = O0000000000.player.getInventory().getStack(var6);
               if (var7.getItem() == var2.getItem() && var7.getCount() > var5) {
                  var4 = var6;
                  var5 = var7.getCount();
                  if (var5 == 64) {
                     break;
                  }
               }
            }

            if (var4 != -1) {
               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var4, var1, SlotActionType.SWAP, O0000000000.player);
               this.O000000000OOOO = 0;
               return;
            }
         }
      }
   }

   static enum W48 {
      FIND_SPOT,
      PLACE,
      BONEMEAL,
      SCAN_TREE,
      BREAKING;
   }

   static enum W49 {
      FIND_CHEST,
      GOING,
      ROTATING,
      OPENING,
      WAIT_GUI,
      CRAFTING,
      REPAIRING,
      RETURNING,
      FACING;
   }

   static enum W50 {
      NONE,
      REPAIR,
      BONEMEAL,
      SAPLING,
      UNLOAD;
   }
}
