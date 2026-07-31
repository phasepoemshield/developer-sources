package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CocoaBlock;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Type;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "CocoaFarm",
   O0000000000 = Category.Misc,
   O000000000 = "Авто-ферма какао-бобов на тропических брёвнах"
)
public class CocoaFarm extends Module {
   private static BlockPos O000000000O000;
   private static BlockPos O000000000O00O;
   public final BooleanSetting O000000000O = new BooleanSetting("Авто-посадка", true);
   public final BooleanSetting O000000000O0 = new BooleanSetting("Склад в сундук", true);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Логи", true);
   private static final double O000000000O0O = 4.6;
   private static final double O000000000O0O0 = 3.6;
   private static final float O000000000O0OO = 60.0F;
   private static final float O000000000OO = 5.0F;
   private static final float O000000000OO0 = 0.5F;
   private static final float O000000000OO00 = 4.0F;
   private static final long O000000000OO0O = 300L;
   private static final int O000000000OOO = 32;
   private static final long O000000000OOO0 = 300L;
   private static final long O000000000OOOO = 2500L;
   private static final long O00000000O = 5000L;
   private static final long O00000000O0 = 4000L;
   private static final long O00000000O00 = 12000L;
   private static final long O00000000O000 = 30000L;
   private static final int O00000000O0000 = 6;
   private static final double O00000000O000O = 4.2;
   private static final long O00000000O00O = 6000L;
   private static final int O00000000O00O0 = 3;
   private static final long O00000000O00OO = 30000L;
   private final O0000O00O0000 O00000000O0O = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0O0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0O00 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0O0O = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0OO0 = new O0000O00O0000();
   private final List<CocoaFarm.W91> O00000000O0OOO = new ArrayList<>();
   private final HashMap<BlockPos, Long> O00000000OO = new HashMap<>();
   private final HashMap<Integer, Long> O00000000OO0 = new HashMap<>();
   private final HashMap<BlockPos, long[]> O00000000OO00 = new HashMap<>();
   private CocoaFarm.W90 O00000000OO000 = CocoaFarm.W90.FARM;
   private CocoaFarm.W91 O00000000OO00O;
   private BlockPos O00000000OO0O;
   private BlockPos O00000000OO0O0;
   private BlockPos O00000000OO0OO;
   private BlockPos O00000000OOO;
   private int O00000000OOO0 = -1;
   private int O00000000OOO00;
   private int O00000000OOO0O = -1;
   private int O00000000OOOO;
   private long O00000000OOOO0;
   private long O00000000OOOOO;
   private double O0000000O;
   private int O0000000O0;
   private boolean O0000000O00;
   private int O0000000O000;
   private int O0000000O0000 = -1;
   private boolean O0000000O00000;
   private boolean O0000000O0000O;
   private boolean O0000000O000O;
   private static final int[] O0000000O000O0 = new int[]{0, -1, 1, -2, 2, -3, -4};
   private static final int O0000000O000OO = 4096;
   private static final RenderPipeline O0000000O00O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "cocoa_zone_fill"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O0000000O00O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "cocoa_zone_glow"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O0000000O00O00 = RenderLayer.of(
      "cocoa_zone_fill", 4096, false, true, O0000000O00O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O0000000O00O0O = RenderLayer.of(
      "cocoa_zone_glow", 4096, false, true, O0000000O00O0, MultiPhaseParameters.builder().build(false)
   );
   private static final int O0000000O00OO = -65409;
   private static final int O0000000O00OO0 = -8781569;
   private static final int O0000000O00OOO = 657938;
   private static final int O0000000O0O = 20;

   public static void O0000000000O0() {
      O000000000O000 = null;
      O000000000O00O = null;
   }

   public CocoaFarm() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0});

      try {
         BaritoneAPI.getSettings().chunkCaching.value = false;
      } catch (Throwable var2) {
      }
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O00000000OO000 = CocoaFarm.W90.FARM;
      this.O00000000O0OOO.clear();
      this.O00000000OO.clear();
      this.O00000000OO00O = null;
      this.O00000000OO0O = null;
      this.O00000000OO0O0 = null;
      this.O00000000OO0OO = null;
      this.O00000000OOO = null;
      this.O00000000OOO0 = -1;
      this.O00000000OOO00 = 0;
      this.O00000000OOO0O = -1;
      this.O00000000OOOO = 0;
      this.O00000000OOOO0 = 0L;
      this.O00000000OOOOO = 0L;
      this.O0000000O = Double.MAX_VALUE;
      this.O0000000O0 = 0;
      this.O0000000O00 = false;
      this.O0000000O000 = 0;
      this.O0000000O0000 = -1;
      this.O00000000OO0.clear();
      this.O00000000OO00.clear();
      this.O00000000O0O0.O00000000();
      this.O00000000O0O.O00000000();
      this.O00000000O0O00.O00000000();
      this.O00000000O0O0O.O00000000();
      this.O00000000O0OO0.O00000000();
      this.O0000000O00000 = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.O0000000O0000O = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      this.O0000000O000O = (Boolean)BaritoneAPI.getSettings().allowSprint.value;
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
      BaritoneAPI.getSettings().chunkCaching.value = false;
      if (O000000000O000 != null && O000000000O00O != null) {
         this.O000000000("Запуск, зона " + this.O0000000000O(O000000000O000) + " — " + this.O0000000000O(O000000000O00O));
      } else {
         ChatUtil.O00000000("§c[CocoaFarm] §fСначала задайте зону: §e.cocoa pos1 §fи §e.cocoa pos2");
      }
   }

   @Override
   public void O000000000() {
      this.O000000000O0O0();
      BaritoneAPI.getSettings().allowBreak.value = this.O0000000O00000;
      BaritoneAPI.getSettings().allowPlace.value = this.O0000000O0000O;
      BaritoneAPI.getSettings().allowSprint.value = this.O0000000O000O;
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      this.O00000000OO0O0 = null;
      this.O00000000OO00O = null;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (O000000000O000 != null && O000000000O00O != null) {
            if (PlayerHelper.O0000000000O0()) {
               this.O000000000O0O0();
            } else if (this.O00000000OO000 != CocoaFarm.W90.FARM && System.currentTimeMillis() > this.O00000000OOOO0) {
               this.O000000000("Тайм-аут депозит-сессии, блокирую сундук");
               this.O0000000000(true);
            } else {
               switch (this.O00000000OO000) {
                  case FARM:
                     this.O0000000000OO();
                     break;
                  case NAVIGATING:
                     this.O0000000000OOO();
                     break;
                  case INTERACTING:
                     this.O000000000O();
                     break;
                  case WAITING_FOR_CONTAINER:
                     this.O000000000O0();
                     break;
                  case DEPOSITING:
                     this.O000000000O00();
               }
            }
         }
      }
   }

   private void O0000000000OO() {
      if (this.O000000000O0.O0000000000()
         && System.currentTimeMillis() >= this.O00000000OOOOO
         && (this.O00000000O0() == 0 || this.O00000000O() >= 4)
         && this.O00000000O() > 1) {
         BlockPos var1 = this.O000000000OO0O();
         if (var1 != null) {
            this.O00000000OOO = var1;
            this.O00000000OO000 = CocoaFarm.W90.NAVIGATING;
            this.O00000000O0OO.O00000000();
            this.O00000000O0O00.O00000000();
            this.O0000000O = Double.MAX_VALUE;
            this.O000000000O0O0();
            this.O00000000OOO00 = 0;
            this.O00000000OOOO = 0;
            this.O00000000OOO0O = -1;
            this.O00000000OOOO0 = System.currentTimeMillis() + 30000L;
            this.O000000000("Инвентарь полон, иду к сундуку " + this.O0000000000O(var1));
            return;
         }
      }

      if (this.O00000000OO00O == null || !this.O00000000000(this.O00000000OO00O)) {
         this.O00000000OO00O = null;
         if (this.O00000000O0O0.O000000000000(300L)) {
            this.O000000000O00O();
            this.O00000000O0O0.O00000000();
         }

         CocoaFarm.W91 var9 = this.O000000000O0O();
         if (var9 != null && this.O00000000000(var9.O000000000)) {
            var9 = null;
         }

         if (var9 != null && !var9.O000000000.equals(this.O00000000OO0O)) {
            this.O00000000OO0O = var9.O000000000;
            this.O0000000O0 = 0;
            this.O00000000O0O00.O00000000();
            this.O0000000O = Double.MAX_VALUE;
         }

         this.O00000000OO00O = var9;
      }

      if (!this.O000000000O0OO()) {
         if (this.O00000000OO00O == null) {
            if (!this.O0000000O00) {
               this.O000000000("Целей нет, жду созревания");
               this.O0000000O00 = true;
            }

            this.O000000000O0O0();
         } else {
            this.O0000000O00 = false;
            BlockPos var10 = this.O0000000000000(this.O00000000OO00O);
            double var2 = O0000000000.player.getX() - (var10.getX() + 0.5);
            double var4 = O0000000000.player.getZ() - (var10.getZ() + 0.5);
            boolean var6 = var2 * var2 + var4 * var4 <= 1.44;
            double var7 = O0000000000.player.getEyePos().distanceTo(this.O000000000000(this.O00000000OO00O));
            if (var7 > 4.6 || !var6 && var7 > 3.6) {
               if (!this.O00000000(var7, var10)) {
                  this.O00000000("не могу дойти до " + this.O0000000000O(this.O00000000OO00O.O000000000) + " (дист " + Math.round(var7 * 10.0) / 10.0 + ")");
               }
            } else {
               if (this.O00000000OO00O.O00000000 == CocoaFarm.W89.HARVEST) {
                  this.O00000000(this.O00000000OO00O);
               } else {
                  this.O000000000(this.O00000000OO00O);
               }
            }
         }
      }
   }

   private boolean O00000000(double d, BlockPos blockPos) {
      if (d < this.O0000000O - 0.4) {
         this.O0000000O = d;
         this.O00000000O0O00.O00000000();
      }

      if (this.O00000000O0O00.O000000000000(5000L)) {
         return false;
      } else {
         this.O000000000000O(blockPos);
         return true;
      }
   }

   private void O00000000(String string) {
      this.O000000000("Пропуск: " + string);
      this.O00000000OO.put(this.O00000000OO00O.O000000000, System.currentTimeMillis() + 12000L);
      this.O00000000OO00O = null;
      this.O00000000OO0O0 = null;
      this.O000000000O0O0();
   }

   private void O0000000000(BlockPos blockPos) {
      O0000000000.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, blockPos, Direction.DOWN));
   }

   private boolean O00000000000(BlockPos blockPos) {
      long var2 = System.currentTimeMillis();
      long[] var4 = this.O00000000OO00.get(blockPos);
      if (var4 != null && var2 - var4[1] <= 6000L) {
         var4[0]++;
         var4[1] = var2;
         if (var4[0] >= 3L) {
            this.O00000000OO00.remove(blockPos);
            this.O00000000OO.put(blockPos, var2 + 30000L);
            this.O0000000000(blockPos);
            this.O000000000("Фантомный блок " + this.O0000000000O(blockPos) + ", ресинк и пропуск");
            return true;
         } else {
            return false;
         }
      } else {
         this.O00000000OO00.put(blockPos.toImmutable(), new long[]{1L, var2});
         if (this.O00000000OO00.size() > 128) {
            this.O00000000OO00.entrySet().removeIf(entry -> var2 - entry.getValue()[1] > 6000L);
         }

         return false;
      }
   }

   private void O00000000(CocoaFarm.W91 o0000000000) {
      BlockHitResult var2 = this.O000000000000O(o0000000000);
      if (var2 != null && !(O0000000000.player.getEyePos().distanceTo(var2.getPos()) > 4.2)) {
         this.O00000000O0O00.O00000000();
         this.O000000000O0O0();
         O000000O0O00OO var3 = this.O00000000(var2.getPos());
         this.O00000000(var3);
         if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
            if (!this.O000000000OOO()) {
               BlockHitResult var4 = this.O00000000O00();
               BlockHitResult var5 = var4 != null && var4.getBlockPos().equals(o0000000000.O000000000) ? var4 : var2;
               if (!o0000000000.O000000000.equals(this.O00000000OO0O0)) {
                  if (!this.O00000000O0O.O000000000000(300L)) {
                     return;
                  }

                  O0000000000.interactionManager.attackBlock(o0000000000.O000000000, var5.getSide());
                  this.O00000000OO0O0 = o0000000000.O000000000;
                  this.O00000000O0O0O.O00000000();
                  this.O00000000O0O.O00000000();
               } else {
                  if (this.O00000000O0O0O.O000000000000(4000L)) {
                     this.O0000000000(o0000000000.O000000000);
                     this.O00000000("какао " + this.O0000000000O(o0000000000.O000000000) + " не ломается, ресинк фантома");
                     return;
                  }

                  O0000000000.interactionManager.updateBlockBreakingProgress(o0000000000.O000000000, var5.getSide());
               }

               O0000000000.player.swingHand(Hand.MAIN_HAND);
            }
         }
      } else {
         this.O0000000000(o0000000000);
      }
   }

   private void O000000000(CocoaFarm.W91 o0000000000) {
      if (!this.O000000000OOOO()) {
         this.O000000000("Бобы закончились, посадка недоступна");
         this.O00000000OO00O = null;
      } else if (!this.O000000000OOO0()) {
         if (O0000000000.player.getMainHandStack().isOf(Items.COCOA_BEANS)) {
            if (this.O0000000O0 >= 6) {
               this.O0000000000(o0000000000.O000000000);
               this.O0000000000(o0000000000.O000000000.offset(o0000000000.O0000000000));
               this.O00000000("посадка " + this.O0000000000O(o0000000000.O000000000.offset(o0000000000.O0000000000)) + " не проходит, ресинк фантома");
            } else {
               BlockHitResult var2 = this.O00000000(o0000000000.O000000000, o0000000000.O0000000000);
               if (var2 != null && !(O0000000000.player.getEyePos().distanceTo(var2.getPos()) > 4.2)) {
                  this.O00000000O0O00.O00000000();
                  this.O000000000O0O0();
                  O000000O0O00OO var3 = this.O00000000(var2.getPos());
                  this.O00000000(var3);
                  if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
                     if (this.O00000000O0O.O000000000000(300L)) {
                        BlockHitResult var4 = this.O00000000O00();
                        BlockHitResult var5 = var4 != null && var4.getBlockPos().equals(o0000000000.O000000000) && var4.getSide() == o0000000000.O0000000000
                           ? var4
                           : var2;
                        O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var5);
                        O0000000000.player.swingHand(Hand.MAIN_HAND);
                        this.O0000000O0++;
                        this.O00000000O0O.O00000000();
                        this.O00000000OO0O0 = null;
                     }
                  }
               } else {
                  this.O0000000000(o0000000000);
               }
            }
         }
      }
   }

   private void O0000000000(CocoaFarm.W91 o0000000000) {
      BlockPos var2 = this.O0000000000000(o0000000000);
      double var3 = O0000000000.player.getX() - (var2.getX() + 0.5);
      double var5 = O0000000000.player.getZ() - (var2.getZ() + 0.5);
      double var7 = var3 * var3 + var5 * var5;
      if (var7 > 2.5) {
         if (!this.O00000000(Math.sqrt(var7), var2)) {
            this.O00000000("не могу подойти к " + this.O0000000000O(o0000000000.O000000000));
         }
      } else {
         if (this.O00000000O0O00.O000000000000(2500L)) {
            this.O00000000("нет прямой видимости " + this.O0000000000O(o0000000000.O000000000));
         }
      }
   }

   private boolean O0000000000OO0() {
      return this.O00000000OOO != null && this.O00000000(O0000000000.world.getBlockState(this.O00000000OOO));
   }

   private void O0000000000(boolean bl) {
      if (bl) {
         this.O00000000OOOOO = System.currentTimeMillis() + 30000L;
      }

      this.O00000000OOO = null;
      this.O00000000OOO0 = -1;
      this.O000000000O0O0();
      this.O00000000OO000 = CocoaFarm.W90.FARM;
   }

   private void O0000000000OOO() {
      if (!this.O0000000000OO0()) {
         this.O0000000000(false);
      } else if (this.O00000000O0OO.O000000000000(15000L)) {
         this.O000000000("Не смог дойти до сундука, вернусь позже");
         this.O0000000000(true);
      } else if (O0000000000.player.getEyePos().distanceTo(Vec3d.ofCenter(this.O00000000OOO)) <= 4.5) {
         this.O000000000O0O0();
         this.O00000000O0O.O00000000();
         this.O00000000OO000 = CocoaFarm.W90.INTERACTING;
      } else {
         this.O000000000000O(this.O00000000OOO);
      }
   }

   private void O000000000O() {
      if (!this.O0000000000OO0()) {
         this.O0000000000(false);
      } else if (this.O00000000OOO00 >= 3) {
         this.O000000000("Сундук не открывается, блокирую");
         this.O0000000000(true);
      } else {
         this.O000000000O0O0();
         if (O0000000000.player.getEyePos().distanceTo(Vec3d.ofCenter(this.O00000000OOO)) > 4.6) {
            this.O00000000O0OO.O00000000();
            this.O00000000OO000 = CocoaFarm.W90.NAVIGATING;
         } else {
            BlockHitResult var1 = this.O00000000000OO(this.O00000000OOO);
            Vec3d var2 = var1 != null ? var1.getPos() : Vec3d.ofCenter(this.O00000000OOO);
            O000000O0O00OO var3 = this.O00000000(var2);
            this.O00000000(var3);
            if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
               if (this.O00000000O0O.O000000000000(300L)) {
                  BlockHitResult var4 = var1 != null ? var1 : new BlockHitResult(var2, Direction.UP, this.O00000000OOO, false);
                  O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var4);
                  O0000000000.player.swingHand(Hand.MAIN_HAND);
                  this.O00000000OOO00++;
                  this.O00000000OOO0 = -1;
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0O.O00000000();
                  this.O00000000OO000 = CocoaFarm.W90.WAITING_FOR_CONTAINER;
               }
            }
         }
      }
   }

   private void O000000000O0() {
      this.O000000000O0O0();
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
         int var3 = ((GenericContainerScreenHandler)var1.getScreenHandler()).syncId;
         if (O0000000000.player.currentScreenHandler != null && O0000000000.player.currentScreenHandler.syncId == var3) {
            this.O00000000OOO0 = var3;
            this.O00000000OOO0O = -1;
            this.O00000000OOOO = 0;
            this.O00000000O0OO.O00000000();
            this.O00000000OO000 = CocoaFarm.W90.DEPOSITING;
            return;
         }
      }

      if (this.O00000000O0OO.O000000000000(4000L)) {
         this.O000000000("Сундук не ответил открытием, повтор подхода");
         this.O00000000O0OO.O00000000();
         this.O00000000OO000 = CocoaFarm.W90.NAVIGATING;
      }
   }

   private void O000000000O00() {
      if (!(
         O0000000000.currentScreen instanceof GenericContainerScreen var1
            && O0000000000.player.currentScreenHandler != null
            && O0000000000.player.currentScreenHandler.syncId == this.O00000000OOO0
            && ((GenericContainerScreenHandler)var1.getScreenHandler()).syncId == this.O00000000OOO0
      )) {
         this.O0000000000(false);
      } else if (this.O00000000O0OO.O000000000000(50L)) {
         int var6 = this.O000000000O000();
         if (this.O00000000OOO0O >= 0 && var6 >= this.O00000000OOO0O) {
            this.O00000000OOOO++;
         } else {
            this.O00000000OOOO = 0;
         }

         this.O00000000OOO0O = var6;
         if (this.O00000000OOOO >= 3) {
            ChatUtil.O00000000("§c[CocoaFarm] §fСундук заполнен, освободите место");
            O0000000000.player.closeHandledScreen();
            this.O0000000000(true);
         } else {
            GenericContainerScreenHandler var3 = (GenericContainerScreenHandler)var1.getScreenHandler();
            int var4 = var3.getRows() * 9;
            int var5 = this.O00000000(var3, var4);
            if (var5 == -1) {
               O0000000000.player.closeHandledScreen();
               this.O000000000("Депозит завершён");
               this.O0000000000(false);
            } else {
               O0000000000.interactionManager.clickSlot(this.O00000000OOO0, var5, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O00000000O0OO.O00000000();
            }
         }
      }
   }

   private int O000000000O000() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (var3.isOf(Items.COCOA_BEANS)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   private int O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      boolean var3 = this.O000000000O.O0000000000();
      boolean var4 = false;

      for (int var5 = i; var5 < genericContainerScreenHandler.slots.size(); var5++) {
         Slot var6 = genericContainerScreenHandler.getSlot(var5);
         if (var6.hasStack() && var6.getStack().isOf(Items.COCOA_BEANS)) {
            if (!var3 || var4) {
               return var5;
            }

            var4 = true;
         }
      }

      return -1;
   }

   private void O000000000O00O() {
      this.O00000000O0OOO.clear();
      boolean var1 = this.O000000000O.O0000000000() && this.O000000000OOOO();
      int[] var2 = this.O000000000OO00();
      int var3 = 0;
      int var4 = 0;

      for (BlockPos var6 : BlockPos.iterate(var2[0], var2[1], var2[2], var2[3], var2[4], var2[5])) {
         BlockState var7 = O0000000000.world.getBlockState(var6);
         if (var7.isIn(BlockTags.JUNGLE_LOGS)) {
            BlockPos var8 = var6.toImmutable();

            for (Direction var10 : Type.HORIZONTAL) {
               BlockPos var11 = var8.offset(var10);
               if (!this.O00000000000O0(var11) && !this.O00000000000O0(var8)) {
                  BlockState var12 = O0000000000.world.getBlockState(var11);
                  if (var12.isOf(Blocks.COCOA)) {
                     if ((Integer)var12.get(CocoaBlock.AGE) >= 2) {
                        this.O00000000O0OOO.add(new CocoaFarm.W91(CocoaFarm.W89.HARVEST, var11, var10));
                        var3++;
                     }
                  } else if (var1 && (var12.isAir() || var12.isReplaceable())) {
                     this.O00000000O0OOO.add(new CocoaFarm.W91(CocoaFarm.W89.PLANT, var8, var10));
                     var4++;
                  }
               }
            }
         }
      }

      int var13 = var3 + var4;
      if (var13 > 0 && this.O0000000O000 == 0) {
         this.O000000000("Найдено целей: сбор " + var3 + ", посадка " + var4);
      }

      this.O0000000O000 = var13;
   }

   private CocoaFarm.W91 O000000000O0O() {
      Vec3d var1 = O0000000000.player.getEyePos();
      CocoaFarm.W91 var2 = null;
      double var3 = Double.MAX_VALUE;

      for (CocoaFarm.W91 var6 : this.O00000000O0OOO) {
         if (this.O00000000000(var6) && !this.O00000000000O0(var6.O000000000)) {
            double var7 = var1.squaredDistanceTo(this.O000000000000(var6));
            if (var6.O00000000 == CocoaFarm.W89.PLANT) {
               var7 += 0.001;
            }

            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }
      }

      return var2;
   }

   private boolean O00000000000(CocoaFarm.W91 o0000000000) {
      if (o0000000000 == null) {
         return false;
      } else if (o0000000000.O00000000 == CocoaFarm.W89.HARVEST) {
         BlockState var4 = O0000000000.world.getBlockState(o0000000000.O000000000);
         return var4.isOf(Blocks.COCOA) && (Integer)var4.get(CocoaBlock.AGE) >= 2;
      } else if (!this.O000000000OOOO()) {
         return false;
      } else {
         BlockState var2 = O0000000000.world.getBlockState(o0000000000.O000000000);
         if (!var2.isIn(BlockTags.JUNGLE_LOGS)) {
            return false;
         } else {
            BlockState var3 = O0000000000.world.getBlockState(o0000000000.O000000000.offset(o0000000000.O0000000000));
            return var3.isAir() || var3.isReplaceable();
         }
      }
   }

   private Vec3d O000000000000(CocoaFarm.W91 o0000000000) {
      return o0000000000.O00000000 == CocoaFarm.W89.HARVEST
         ? Vec3d.ofCenter(o0000000000.O000000000)
         : this.O0000000000(o0000000000.O000000000, o0000000000.O0000000000);
   }

   private BlockPos O0000000000000(CocoaFarm.W91 o0000000000) {
      BlockPos var2 = o0000000000.O00000000 == CocoaFarm.W89.HARVEST ? o0000000000.O000000000 : o0000000000.O000000000.offset(o0000000000.O0000000000);
      BlockPos var3 = o0000000000.O00000000 == CocoaFarm.W89.HARVEST
         ? o0000000000.O000000000.offset(o0000000000.O0000000000)
         : o0000000000.O000000000.offset(o0000000000.O0000000000, 2);
      int var4 = O0000000000.player.getBlockPos().getY();
      BlockPos[] var5 = new BlockPos[]{var2, var3};

      for (BlockPos var9 : var5) {
         for (int var13 : O0000000O000O0) {
            BlockPos var14 = new BlockPos(var9.getX(), var4 + var13, var9.getZ());
            if (this.O000000000000(var14) && this.O0000000000000(var14)) {
               return var14;
            }
         }
      }

      return new BlockPos(var2.getX(), var4, var2.getZ());
   }

   private boolean O000000000000(BlockPos blockPos) {
      int var2 = Math.min(O000000000O000.getX(), O000000000O00O.getX());
      int var3 = Math.max(O000000000O000.getX(), O000000000O00O.getX());
      int var4 = Math.min(O000000000O000.getY(), O000000000O00O.getY());
      int var5 = Math.max(O000000000O000.getY(), O000000000O00O.getY());
      int var6 = Math.min(O000000000O000.getZ(), O000000000O00O.getZ());
      int var7 = Math.max(O000000000O000.getZ(), O000000000O00O.getZ());
      return blockPos.getX() >= var2
         && blockPos.getX() <= var3
         && blockPos.getY() >= var4
         && blockPos.getY() <= var5
         && blockPos.getZ() >= var6
         && blockPos.getZ() <= var7;
   }

   private boolean O0000000000000(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      BlockState var3 = O0000000000.world.getBlockState(blockPos.up());
      BlockState var4 = O0000000000.world.getBlockState(blockPos.down());
      boolean var5 = var2.isAir() || var2.getCollisionShape(O0000000000.world, blockPos).isEmpty();
      boolean var6 = var3.isAir() || var3.getCollisionShape(O0000000000.world, blockPos.up()).isEmpty();
      boolean var7 = !var4.isAir() && !var4.isOf(Blocks.COCOA) && !var4.getCollisionShape(O0000000000.world, blockPos.down()).isEmpty();
      return var5 && var6 && var7;
   }

   private void O000000000000O(BlockPos blockPos) {
      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      boolean var3 = !blockPos.equals(this.O00000000OO0OO);
      if (var3 || !var2.getCustomGoalProcess().isActive()) {
         var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(blockPos, 1));
         if (var3) {
            this.O000000000("Иду к " + this.O0000000000O(blockPos));
         }

         this.O00000000OO0OO = blockPos;
      }
   }

   private void O000000000O0O0() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (var1.getCustomGoalProcess().isActive()) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.O00000000OO0OO = null;
   }

   private boolean O000000000O0OO() {
      if (!this.O000000000OO0()) {
         return false;
      } else {
         ItemEntity var1 = this.O000000000OO();
         if (var1 == null) {
            this.O0000000O0000 = -1;
            return false;
         } else {
            double var2 = O0000000000.player.getX() - var1.getX();
            double var4 = O0000000000.player.getZ() - var1.getZ();
            double var6 = var2 * var2 + var4 * var4;
            boolean var8 = this.O00000000OO00O == null;
            if (var6 > 36.0 && !var8) {
               return false;
            } else if (var6 <= 1.7) {
               this.O0000000O0000 = -1;
               return false;
            } else {
               if (var1.getId() != this.O0000000O0000) {
                  this.O0000000O0000 = var1.getId();
                  this.O00000000O0OO0.O00000000();
               }

               if (this.O00000000O0OO0.O000000000000(8000L)) {
                  this.O00000000OO0.put(var1.getId(), System.currentTimeMillis() + 45000L);
                  this.O0000000O0000 = -1;
                  return false;
               } else {
                  this.O00000000000O(this.O00000000(var1));
                  return true;
               }
            }
         }
      }
   }

   private BlockPos O00000000(ItemEntity itemEntity) {
      BlockPos var2 = BlockPos.ofFloored(itemEntity.getX(), itemEntity.getY() + 0.1, itemEntity.getZ());
      int var3 = O0000000000.player.getBlockPos().getY();

      for (int var7 : O0000000O000O0) {
         BlockPos var8 = new BlockPos(var2.getX(), var3 + var7, var2.getZ());
         if (this.O000000000000(var8) && this.O0000000000000(var8)) {
            return var8;
         }
      }

      return new BlockPos(var2.getX(), var3, var2.getZ());
   }

   private ItemEntity O000000000OO() {
      Box var1 = Box.enclosing(O000000000O000, O000000000O00O).expand(1.0);
      List var2 = O0000000000.world
         .getEntitiesByClass(ItemEntity.class, var1, itemEntity -> itemEntity.isAlive() && itemEntity.getStack().isOf(Items.COCOA_BEANS));
      ItemEntity var3 = null;
      double var4 = Double.MAX_VALUE;
      long var6 = System.currentTimeMillis();

      for (ItemEntity var9 : (Iterable<ItemEntity>)var2) {
         Long var10 = this.O00000000OO0.get(var9.getId());
         if (var10 != null) {
            if (var6 <= var10) {
               continue;
            }

            this.O00000000OO0.remove(var9.getId());
         }

         double var11 = O0000000000.player.squaredDistanceTo(var9);
         if (var11 < var4) {
            var4 = var11;
            var3 = var9;
         }
      }

      return var3;
   }

   private boolean O000000000OO0() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (var2.isEmpty()) {
            return true;
         }

         if (var2.isOf(Items.COCOA_BEANS) && var2.getCount() < var2.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private void O00000000000O(BlockPos blockPos) {
      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      boolean var3 = !blockPos.equals(this.O00000000OO0OO);
      if (var3 || !var2.getCustomGoalProcess().isActive()) {
         var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(blockPos, 1));
         if (var3) {
            this.O000000000("Подбираю лут " + this.O0000000000O(blockPos));
         }

         this.O00000000OO0OO = blockPos;
      }
   }

   private int[] O000000000OO00() {
      int var1 = Math.min(O000000000O000.getX(), O000000000O00O.getX());
      int var2 = Math.min(O000000000O000.getY(), O000000000O00O.getY());
      int var3 = Math.min(O000000000O000.getZ(), O000000000O00O.getZ());
      int var4 = Math.max(O000000000O000.getX(), O000000000O00O.getX());
      int var5 = Math.max(O000000000O000.getY(), O000000000O00O.getY());
      int var6 = Math.max(O000000000O000.getZ(), O000000000O00O.getZ());
      BlockPos var7 = O0000000000.player.getBlockPos();
      var1 = Math.max(var1, var7.getX() - 32);
      var3 = Math.max(var3, var7.getZ() - 32);
      var4 = Math.min(var4, var7.getX() + 32);
      var6 = Math.min(var6, var7.getZ() + 32);
      return new int[]{var1, var2, var3, var4, var5, var6};
   }

   private BlockPos O000000000OO0O() {
      int[] var1 = this.O000000000OO00();
      Vec3d var2 = O0000000000.player.getEyePos();
      BlockPos var3 = null;
      double var4 = Double.MAX_VALUE;

      for (BlockPos var7 : BlockPos.iterate(var1[0], var1[1], var1[2], var1[3], var1[4], var1[5])) {
         if (this.O00000000(O0000000000.world.getBlockState(var7))) {
            double var8 = var2.squaredDistanceTo(Vec3d.ofCenter(var7));
            if (var8 < var4) {
               var4 = var8;
               var3 = var7.toImmutable();
            }
         }
      }

      return var3;
   }

   private boolean O00000000(BlockState blockState) {
      return blockState.isOf(Blocks.CHEST) || blockState.isOf(Blocks.TRAPPED_CHEST) || blockState.isOf(Blocks.BARREL);
   }

   private boolean O00000000000O0(BlockPos blockPos) {
      Long var2 = this.O00000000OO.get(blockPos);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() > var2) {
         this.O00000000OO.remove(blockPos);
         return false;
      } else {
         return true;
      }
   }

   private int O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         ItemEnchantmentsComponent var2 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
         if (var2 != null && !var2.isEmpty()) {
            for (Entry var4 : var2.getEnchantmentEntries()) {
               if (((RegistryEntry)var4.getKey()).matchesKey(Enchantments.FORTUNE)) {
                  return var4.getIntValue();
               }
            }

            return 0;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private boolean O000000000OOO() {
      if (this.O00000000(O0000000000.player.getMainHandStack()) > 0) {
         return false;
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = 0; var3 < 9; var3++) {
            int var4 = this.O00000000(O0000000000.player.getInventory().getStack(var3));
            if (var4 > var2) {
               var2 = var4;
               var1 = var3;
            }
         }

         if (var1 != -1) {
            O0000000000.player.getInventory().setSelectedSlot(var1);
            return false;
         } else {
            for (int var5 = 9; var5 < 36; var5++) {
               int var6 = this.O00000000(O0000000000.player.getInventory().getStack(var5));
               if (var6 > var2) {
                  var2 = var6;
                  var1 = var5;
               }
            }

            if (var1 != -1) {
               O0000000000.interactionManager
                  .clickSlot(
                     O0000000000.player.playerScreenHandler.syncId,
                     var1,
                     O0000000000.player.getInventory().getSelectedSlot(),
                     SlotActionType.SWAP,
                     O0000000000.player
                  );
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private boolean O000000000OOO0() {
      if (O0000000000.player.getMainHandStack().isOf(Items.COCOA_BEANS)) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (O0000000000.player.getInventory().getStack(var1).isOf(Items.COCOA_BEANS)) {
               O0000000000.player.getInventory().setSelectedSlot(var1);
               return false;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (O0000000000.player.getInventory().getStack(var2).isOf(Items.COCOA_BEANS)) {
               O0000000000.interactionManager
                  .clickSlot(
                     O0000000000.player.playerScreenHandler.syncId,
                     var2,
                     O0000000000.player.getInventory().getSelectedSlot(),
                     SlotActionType.SWAP,
                     O0000000000.player
                  );
               return true;
            }
         }

         return false;
      }
   }

   private boolean O000000000OOOO() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isOf(Items.COCOA_BEANS)) {
            return true;
         }
      }

      return false;
   }

   private int O00000000O() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isOf(Items.COCOA_BEANS)) {
            var1++;
         }
      }

      return var1;
   }

   private int O00000000O0() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isEmpty()) {
            var1++;
         }
      }

      return var1;
   }

   private BlockHitResult O000000000000O(CocoaFarm.W91 o0000000000) {
      BlockHitResult var2 = this.O00000000000OO(o0000000000.O000000000);
      if (var2 != null) {
         return var2;
      } else {
         Vec3d var3 = O0000000000.player.getEyePos();
         Vec3d var4 = Vec3d.ofCenter(o0000000000.O000000000);
         return var3.distanceTo(var4) <= 4.6 && this.O00000000(var3, var4, o0000000000.O000000000)
            ? new BlockHitResult(var4, o0000000000.O0000000000, o0000000000.O000000000, false)
            : null;
      }
   }

   private BlockHitResult O00000000(BlockPos blockPos, Direction direction) {
      BlockHitResult var3 = this.O000000000(blockPos, direction);
      if (var3 != null) {
         return var3;
      } else {
         Vec3d var4 = O0000000000.player.getEyePos();
         Vec3d var5 = Vec3d.of(direction.getVector());
         if (var4.subtract(this.O0000000000(blockPos, direction)).dotProduct(var5) <= 0.05) {
            return null;
         } else {
            double[] var6 = new double[]{0.5, 0.3, 0.7};

            for (double var10 : var6) {
               for (double var15 : var6) {
                  Vec3d var17 = this.O00000000(blockPos, direction, var10, var15);
                  if (var4.distanceTo(var17) <= 4.6 && this.O00000000(var4, var17, blockPos)) {
                     return new BlockHitResult(var17, direction, blockPos, false);
                  }
               }
            }

            return null;
         }
      }
   }

   private boolean O00000000(Vec3d vec3d, Vec3d vec3d2, BlockPos blockPos) {
      Vec3d var4 = vec3d2.subtract(vec3d);
      double var5 = var4.length();
      if (var5 < 1.0E-6) {
         return true;
      } else {
         var4 = var4.multiply(1.0 / var5);

         for (double var7 = 0.25; var7 < var5 - 0.05; var7 += 0.25) {
            Vec3d var9 = vec3d.add(var4.multiply(var7));
            BlockPos var10 = BlockPos.ofFloored(var9.x, var9.y, var9.z);
            if (!var10.equals(blockPos)) {
               BlockState var11 = O0000000000.world.getBlockState(var10);
               if (!var11.isOf(Blocks.COCOA) && !var11.isAir() && !var11.getCollisionShape(O0000000000.world, var10).isEmpty()) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private BlockHitResult O00000000000OO(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               Vec3d var19 = new Vec3d(blockPos.getX() + var7, blockPos.getY() + var12, blockPos.getZ() + var17);
               BlockHitResult var20 = O0000000000.world.raycast(new RaycastContext(var2, var19, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
               if (var20.getType() == net.minecraft.util.hit.HitResult.Type.BLOCK && var20.getBlockPos().equals(blockPos)) {
                  return var20;
               }
            }
         }
      }

      return null;
   }

   private BlockHitResult O000000000(BlockPos blockPos, Direction direction) {
      Vec3d var3 = O0000000000.player.getEyePos();
      double[] var4 = new double[]{0.5, 0.3, 0.7};

      for (double var8 : var4) {
         for (double var13 : var4) {
            Vec3d var15 = this.O00000000(blockPos, direction, var8, var13);
            BlockHitResult var16 = O0000000000.world.raycast(new RaycastContext(var3, var15, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
            if (var16.getType() == net.minecraft.util.hit.HitResult.Type.BLOCK && var16.getBlockPos().equals(blockPos) && var16.getSide() == direction) {
               return var16;
            }
         }
      }

      return null;
   }

   private Vec3d O00000000(BlockPos blockPos, Direction direction, double d, double e) {
      double var7 = blockPos.getX();
      double var9 = blockPos.getY();
      double var11 = blockPos.getZ();

      return switch (direction) {
         case NORTH -> new Vec3d(var7 + d, var9 + e, var11);
         case SOUTH -> new Vec3d(var7 + d, var9 + e, var11 + 1.0);
         case WEST -> new Vec3d(var7, var9 + d, var11 + e);
         case EAST -> new Vec3d(var7 + 1.0, var9 + d, var11 + e);
         default -> Vec3d.ofCenter(blockPos);
      };
   }

   private Vec3d O0000000000(BlockPos blockPos, Direction direction) {
      return new Vec3d(
         blockPos.getX() + 0.5 + direction.getOffsetX() * 0.5,
         blockPos.getY() + 0.5 + direction.getOffsetY() * 0.5,
         blockPos.getZ() + 0.5 + direction.getOffsetZ() * 0.5
      );
   }

   private void O00000000(O000000O0O00OO o000000O0O00OO) {
      float var2 = new O000000O0O00OO(O0000000000.player).O00000000(o000000O0O00OO);
      float var3 = Math.max(5.0F, Math.min(60.0F, var2 * 0.5F));
      O000000O0O0O0.O00000000(o000000O0O00OO, var3, var3, var3, var3, 2, 20, false);
   }

   private BlockHitResult O00000000O00() {
      double var1 = Math.toRadians(O0000000000.player.getYaw());
      double var3 = Math.toRadians(O0000000000.player.getPitch());
      double var5 = Math.cos(var3);
      Vec3d var7 = new Vec3d(-Math.sin(var1) * var5, -Math.sin(var3), Math.cos(var1) * var5);
      Vec3d var8 = O0000000000.player.getEyePos();
      Vec3d var9 = var8.add(var7.multiply(5.0));
      BlockHitResult var10 = O0000000000.world.raycast(new RaycastContext(var8, var9, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var10.getType() == net.minecraft.util.hit.HitResult.Type.BLOCK ? var10 : null;
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = vec3d.x - var2.x;
      double var5 = vec3d.y - var2.y;
      double var7 = vec3d.z - var2.z;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new O000000O0O00OO(var11, var12);
   }

   private String O0000000000O(BlockPos blockPos) {
      return blockPos.getX() + " " + blockPos.getY() + " " + blockPos.getZ();
   }

   private void O000000000(String string) {
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null && O000000000O000 != null && O000000000O00O != null) {
         if (O0000O00O0O00.O00000000(O0000000000)) {
            Vec3d var2 = O0000000000.gameRenderer.getCamera().getPos();
            Matrix4f var3 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
            float var4 = (float)(Math.min(O000000000O000.getX(), O000000000O00O.getX()) - var2.x);
            float var5 = (float)(Math.min(O000000000O000.getY(), O000000000O00O.getY()) - var2.y);
            float var6 = (float)(Math.min(O000000000O000.getZ(), O000000000O00O.getZ()) - var2.z);
            float var7 = (float)(Math.max(O000000000O000.getX(), O000000000O00O.getX()) + 1 - var2.x);
            float var8 = (float)(Math.max(O000000000O000.getY(), O000000000O00O.getY()) + 1 - var2.y);
            float var9 = (float)(Math.max(O000000000O000.getZ(), O000000000O00O.getZ()) + 1 - var2.z);
            float var10 = (float)(System.nanoTime() / 1.0E9);
            Immediate var11 = O0000O00O0O00.O00000000();

            try {
               VertexConsumer var12 = var11.getBuffer(O0000000O00O00);
               VertexConsumer var13 = var11.getBuffer(O0000000O00O0O);
               this.O000000000(var13, var3, var4, var5, var6, var7, var8, var9, var10);
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k) {
      float var9 = j - g;

      for (int var10 = 0; var10 < 20; var10++) {
         float var11 = var10 / 20.0F;
         float var12 = (var10 + 1) / 20.0F;
         float var13 = g + var9 * var11;
         float var14 = g + var9 * var12;
         int var15 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-65409, -8781569, var11), (int)(140.0F * (1.0F - 0.55F * var11)));
         int var16 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-65409, -8781569, var12), (int)(140.0F * (1.0F - 0.55F * var12)));
         this.O00000000(vertexConsumer, matrix4f, f, h, i, h, var13, var14, var15, var16);
         this.O00000000(vertexConsumer, matrix4f, i, k, f, k, var13, var14, var15, var16);
         this.O00000000(vertexConsumer, matrix4f, f, k, f, h, var13, var14, var15, var16);
         this.O00000000(vertexConsumer, matrix4f, i, h, i, k, var13, var14, var15, var16);
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l, int m) {
      int var11 = O0000O000OO000.O000000000(l);
      int var12 = O0000O000OO000.O0000000000(l);
      int var13 = O0000O000OO000.O00000000000(l);
      int var14 = O0000O000OO000.O00000000(l);
      int var15 = O0000O000OO000.O000000000(m);
      int var16 = O0000O000OO000.O0000000000(m);
      int var17 = O0000O000OO000.O00000000000(m);
      int var18 = O0000O000OO000.O00000000(m);
      vertexConsumer.vertex(matrix4f, f, j, g).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, h, j, i).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, h, k, i).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, k, g).color(var15, var16, var17, var18);
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, float l) {
      float var10 = j - g;
      if (!(var10 <= 0.01F)) {
         float var11 = (l * 0.35F % 1.0F + 1.0F) % 1.0F;
         float var12 = var11 < 0.5F ? var11 * 2.0F : (1.0F - var11) * 2.0F;
         float var13 = g + var10 * var12;
         int var14 = O0000O000OO000.O00000000(-65409, 38);
         this.O00000000(vertexConsumer, matrix4f, f, h, i, k, var13, var14);
         int var15 = O0000O000OO000.O00000000(-16719617, 90);
         float var16 = i - f;
         float var17 = k - h;
         int var18 = Math.min(10, Math.max(1, Math.round(var16 / 3.0F)));
         int var19 = Math.min(10, Math.max(1, Math.round(var17 / 3.0F)));
         float var20 = 0.015F;

         for (int var21 = 0; var21 <= var18; var21++) {
            float var22 = f + var16 * ((float)var21 / var18);
            this.O000000000(vertexConsumer, matrix4f, var22 - var20, h, var22 + var20, k, var13, var15);
         }

         for (int var23 = 0; var23 <= var19; var23++) {
            float var24 = h + var17 * ((float)var23 / var19);
            this.O000000000(vertexConsumer, matrix4f, f, var24 - var20, i, var24 + var20, var13, var15);
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, int k) {
      int var9 = O0000O000OO000.O000000000(k);
      int var10 = O0000O000OO000.O0000000000(k);
      int var11 = O0000O000OO000.O00000000000(k);
      int var12 = O0000O000OO000.O00000000(k);
      vertexConsumer.vertex(matrix4f, f, j, g).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, h, j, g).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, h, j, i).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, i).color(var9, var10, var11, var12);
   }

   private void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, int k) {
      int var9 = O0000O000OO000.O000000000(k);
      int var10 = O0000O000OO000.O0000000000(k);
      int var11 = O0000O000OO000.O00000000000(k);
      int var12 = O0000O000OO000.O00000000(k);
      vertexConsumer.vertex(matrix4f, f, j, g).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, h, j, g).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, h, j, i).color(var9, var10, var11, var12);
      vertexConsumer.vertex(matrix4f, f, j, i).color(var9, var10, var11, var12);
   }

   private void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, float l) {
      float var10 = l * 1.4F;
      int var11 = O0000O000OO000.O00000000(-65409, 190);
      float var12 = 0.02F;
      float[][] var13 = new float[][]{
         {f, g, h, i, g, h},
         {i, g, h, i, g, k},
         {i, g, k, f, g, k},
         {f, g, k, f, g, h},
         {f, j, h, i, j, h},
         {i, j, h, i, j, k},
         {i, j, k, f, j, k},
         {f, j, k, f, j, h},
         {f, g, h, f, j, h},
         {i, g, h, i, j, h},
         {i, g, k, i, j, k},
         {f, g, k, f, j, k}
      };

      for (float[] var17 : var13) {
         this.O00000000(vertexConsumer, matrix4f, var17[0], var17[1], var17[2], var17[3], var17[4], var17[5], var12, var11, var10);
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, float l, int m, float n) {
      float var12 = i - f;
      float var13 = j - g;
      float var14 = k - h;
      float var15 = (float)Math.sqrt(var12 * var12 + var13 * var13 + var14 * var14);
      if (!(var15 < 1.0E-4F)) {
         float var16 = var12 / var15;
         float var17 = var13 / var15;
         float var18 = var14 / var15;
         float var19 = 0.45F;
         float var20 = 0.35F;
         float var21 = Math.max(var19 + var20, var15 / 40.0F);
         var19 = var21 * 0.56F;
         float var22 = -((n % var21 + var21) % var21);

         for (float var23 = var22; var23 < var15; var23 += var21) {
            float var24 = Math.max(0.0F, var23);
            float var25 = Math.min(var15, var23 + var19);
            if (!(var25 <= var24)) {
               float var26 = f + var16 * var24;
               float var27 = g + var17 * var24;
               float var28 = h + var18 * var24;
               float var29 = f + var16 * var25;
               float var30 = g + var17 * var25;
               float var31 = h + var18 * var25;
               O0000O00O0O0.O0000000000(
                  vertexConsumer,
                  matrix4f,
                  Math.min(var26, var29) - l,
                  Math.min(var27, var30) - l,
                  Math.min(var28, var31) - l,
                  Math.max(var26, var29) + l,
                  Math.max(var27, var30) + l,
                  Math.max(var28, var31) + l,
                  m
               );
            }
         }
      }
   }

   @Generated
   public static BlockPos O0000000000O00() {
      return O000000000O000;
   }

   @Generated
   public static void O00000000(BlockPos blockPos) {
      O000000000O000 = blockPos;
   }

   @Generated
   public static BlockPos O0000000000O0O() {
      return O000000000O00O;
   }

   @Generated
   public static void O000000000(BlockPos blockPos) {
      O000000000O00O = blockPos;
   }

   static enum W89 {
      HARVEST,
      PLANT;
   }

   static enum W90 {
      FARM,
      NAVIGATING,
      INTERACTING,
      WAITING_FOR_CONTAINER,
      DEPOSITING;
   }

   static final class W91 {
      final CocoaFarm.W89 O00000000;
      final BlockPos O000000000;
      final Direction O0000000000;

      W91(CocoaFarm.W89 o00000000, BlockPos blockPos, Direction direction) {
         this.O00000000 = o00000000;
         this.O000000000 = blockPos;
         this.O0000000000 = direction;
      }
   }
}
