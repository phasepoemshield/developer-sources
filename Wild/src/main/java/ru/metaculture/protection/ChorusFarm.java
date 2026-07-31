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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ChorusFarm",
   O0000000000 = Category.Misc,
   O000000000 = "Авто-ферма плодов хоруса с отстрелом луком"
)
public class ChorusFarm extends Module {
   private static BlockPos O000000000O0O;
   private static BlockPos O000000000O0O0;
   public final BooleanSetting O000000000O = new BooleanSetting("Сбивать плоды", true);
   public final NumberSetting O000000000O0 = new NumberSetting("Высота для сбора", 6.0F, 2.0F, 24.0F, 1.0F, false);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Авто-посадка", true);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Склад в сундук", true);
   public final BooleanSetting O000000000O00O = new BooleanSetting("Логи", false);
   private static final double O000000000O0OO = 4.6;
   private static final double O000000000OO = 3.6;
   private static final double O000000000OO0 = 28.0;
   private static final float O000000000OO00 = 140.0F;
   private static final float O000000000OO0O = 34.0F;
   private static final float O000000000OOO = 1.35F;
   private static final float O000000000OOO0 = 4.0F;
   private static final float O000000000OOOO = 2.6F;
   private static final int O00000000O = 20;
   private static final int O00000000O0 = 8;
   private static final int O00000000O00 = 3;
   private static final long O00000000O000 = 90L;
   private static final int O00000000O0000 = 40;
   private static final int O00000000O000O = 32;
   private static final int O00000000O00O = 4;
   private static final long O00000000O00O0 = 150L;
   private static final long O00000000O00OO = 1800L;
   private static final long O00000000O0O = 5000L;
   private static final long O00000000O0O0 = 2000L;
   private static final long O00000000O0O00 = 900L;
   private static final int O00000000O0O0O = 4;
   private static final double O00000000O0OO = 1.62;
   private static final long O00000000O0OO0 = 60L;
   private static final int O00000000O0OOO = 6;
   private static final int O00000000OO = 4;
   private static final long O00000000OO0 = 8000L;
   private static final long O00000000OO00 = 6000L;
   private static final long O00000000OO000 = 30000L;
   private static final double O00000000OO00O = 4.2;
   private static final int O00000000OO0O = 400;
   private static final long O00000000OO0O0 = 4000L;
   private static final int O00000000OO0OO = 2;
   private static final long O00000000OOO = 30000L;
   private static final long O00000000OOO0 = 3000L;
   private static final long O00000000OOO00 = 18000L;
   private static final int O00000000OOO0O = 128;
   private final O0000O00O0000 O00000000OOOO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOOO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOOOO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O000 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0000 = new O0000O00O0000();
   private final List<ChorusFarm.W87> O0000000O00000 = new ArrayList<>();
   private final HashMap<BlockPos, Long> O0000000O0000O = new HashMap<>();
   private final HashMap<BlockPos, Long> O0000000O000O = new HashMap<>();
   private final HashMap<Integer, Long> O0000000O000O0 = new HashMap<>();
   private final HashMap<BlockPos, long[]> O0000000O000OO = new HashMap<>();
   private final Set<BlockPos> O0000000O00O = new HashSet<>();
   private Set<BlockPos> O0000000O00O0;
   private BlockPos O0000000O00O00;
   private int O0000000O00O0O = 20;
   private BlockPos O0000000O00OO;
   private ChorusFarm.W86 O0000000O00OO0 = ChorusFarm.W86.FARM;
   private ChorusFarm.W87 O0000000O00OOO;
   private BlockPos O0000000O0O;
   private BlockPos O0000000O0O0;
   private BlockPos O0000000O0O00;
   private BlockPos O0000000O0O000;
   private int O0000000O0O00O = -1;
   private int O0000000O0O0O;
   private int O0000000O0O0O0 = -1;
   private int O0000000O0O0OO;
   private long O0000000O0OO;
   private long O0000000O0OO0;
   private double O0000000O0OO00;
   private int O0000000O0OO0O;
   private int O0000000O0OOO;
   private int O0000000O0OOO0;
   private BlockPos O0000000O0OOOO;
   private boolean O0000000OO;
   private boolean O0000000OO0;
   private int O0000000OO00;
   private int O0000000OO000 = -1;
   private boolean O0000000OO0000;
   private boolean O0000000OO000O;
   private boolean O0000000OO00O;
   private static final int O0000000OO00O0 = 4096;
   private static final int O0000000OO00OO = 16;
   private static final RenderPipeline O0000000OO0O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "chorus_zone_fill"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O0000000OO0O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "chorus_zone_glow"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O0000000OO0O00 = RenderLayer.of(
      "chorus_zone_fill", 4096, false, true, O0000000OO0O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O0000000OO0O0O = RenderLayer.of(
      "chorus_zone_glow", 4096, false, true, O0000000OO0O0, MultiPhaseParameters.builder().build(false)
   );
   private static final int O0000000OO0OO = -2995201;
   private static final int O0000000OO0OO0 = -9822240;
   private static final int O0000000OO0OOO = 18;

   public static void O0000000000O0() {
      O000000000O0O = null;
      O000000000O0O0 = null;
   }

   public ChorusFarm() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O});

      try {
         BaritoneAPI.getSettings().chunkCaching.value = false;
      } catch (Throwable var2) {
      }
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O0000000O00OO0 = ChorusFarm.W86.FARM;
      this.O0000000O00000.clear();
      this.O0000000O0000O.clear();
      this.O0000000O00OOO = null;
      this.O0000000O0O = null;
      this.O0000000O0O0 = null;
      this.O0000000O0O00 = null;
      this.O0000000O0O000 = null;
      this.O0000000O0O00O = -1;
      this.O0000000O0O0O = 0;
      this.O0000000O0O0O0 = -1;
      this.O0000000O0O0OO = 0;
      this.O0000000O0OO = 0L;
      this.O0000000O0OO0 = 0L;
      this.O0000000O0OO00 = Double.MAX_VALUE;
      this.O0000000O0OO0O = 0;
      this.O0000000O0OOO = 0;
      this.O0000000O0OOO0 = 0;
      this.O0000000O0OOOO = null;
      this.O0000000OO = false;
      this.O0000000OO0 = false;
      this.O0000000OO00 = 0;
      this.O0000000OO000 = -1;
      this.O0000000O000O0.clear();
      this.O0000000O000OO.clear();
      this.O0000000O00O.clear();
      this.O0000000O000O.clear();
      this.O0000000O00O0 = null;
      this.O0000000O00O00 = null;
      this.O0000000O00O0O = 20;
      this.O0000000O00OO = null;
      this.O00000000OOOO0.O00000000();
      this.O00000000OOOO.O00000000();
      this.O00000000OOOOO.O00000000();
      this.O0000000O.O00000000();
      this.O0000000O0.O00000000();
      this.O0000000O00.O00000000();
      this.O0000000O0000.O00000000();
      this.O0000000OO0000 = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.O0000000OO000O = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      this.O0000000OO00O = (Boolean)BaritoneAPI.getSettings().allowSprint.value;
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
      BaritoneAPI.getSettings().chunkCaching.value = false;
      if (O000000000O0O != null && O000000000O0O0 != null) {
         this.O000000000("Запуск, площадь " + this.O0000000000O0O(O000000000O0O) + " — " + this.O0000000000O0O(O000000000O0O0));
      } else {
         ChatUtil.O00000000("§d[ChorusFarm] §fСначала задайте зону: §e.chorus pos1 §fи §e.chorus pos2");
      }
   }

   @Override
   public void O000000000() {
      this.O000000000O00O();
      this.O000000000O();
      BaritoneAPI.getSettings().allowBreak.value = this.O0000000OO0000;
      BaritoneAPI.getSettings().allowPlace.value = this.O0000000OO000O;
      BaritoneAPI.getSettings().allowSprint.value = this.O0000000OO00O;
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      this.O0000000O0O0 = null;
      this.O0000000O00O0 = null;
      this.O0000000O00O00 = null;
      this.O0000000O00OOO = null;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (O000000000O0O == null || O000000000O0O0 == null) {
            this.O000000000O();
         } else if (PlayerHelper.O0000000000O0()) {
            this.O000000000O();
            this.O000000000O00O();
         } else if (this.O0000000O00OO0 != ChorusFarm.W86.FARM && System.currentTimeMillis() > this.O0000000O0OO) {
            this.O000000000("Тайм-аут депозит-сессии, блокирую сундук");
            this.O0000000000(true);
         } else {
            switch (this.O0000000O00OO0) {
               case FARM:
                  this.O0000000000OO();
                  break;
               case NAVIGATING:
                  this.O000000000OO0O();
                  break;
               case INTERACTING:
                  this.O000000000OOO();
                  break;
               case WAITING_FOR_CONTAINER:
                  this.O000000000OOO0();
                  break;
               case DEPOSITING:
                  this.O000000000OOOO();
            }
         }
      }
   }

   private void O0000000000OO() {
      this.O00000000O000();
      if (this.O000000000O000.O0000000000() && System.currentTimeMillis() >= this.O0000000O0OO0 && this.O00000000O0000()) {
         BlockPos var1 = this.O000000000OO0();
         if (var1 != null) {
            this.O000000000O();
            this.O0000000O0O000 = var1;
            this.O0000000O00OO0 = ChorusFarm.W86.NAVIGATING;
            this.O0000000O000.O00000000();
            this.O00000000OOOOO.O00000000();
            this.O0000000O0OO00 = Double.MAX_VALUE;
            this.O000000000O00O();
            this.O0000000O0O0O = 0;
            this.O0000000O0O0OO = 0;
            this.O0000000O0O0O0 = -1;
            this.O0000000O0OO = System.currentTimeMillis() + 30000L;
            this.O000000000("Инвентарь полон, иду к сундуку " + this.O0000000000O0O(var1));
            return;
         }
      }

      if (this.O0000000O00OOO == null || !this.O000000000000(this.O0000000O00OOO)) {
         this.O0000000O00OOO = null;
         if (this.O00000000OOOO0.O000000000000(150L)) {
            this.O000000000O0();
            this.O00000000OOOO0.O00000000();
         }

         ChorusFarm.W87 var2 = this.O000000000O00();
         if (var2 != null && this.O000000000000O(var2.O000000000)) {
            var2 = null;
         }

         if (var2 != null && !var2.O000000000.equals(this.O0000000O0O)) {
            this.O0000000O0O = var2.O000000000;
            this.O0000000O0OO0O = 0;
            this.O0000000O0OOO = 0;
            this.O0000000O0OOO0 = 0;
            this.O0000000O0OOOO = null;
            this.O00000000OOOOO.O00000000();
            this.O0000000O00.O00000000();
            this.O0000000O0OO00 = Double.MAX_VALUE;
         }

         this.O0000000O00OOO = var2;
      }

      if (this.O0000000O00OOO == null || this.O0000000O00OOO.O00000000 != ChorusFarm.W84.SHOOT) {
         this.O000000000O();
         this.O0000000O0OOOO = null;
         if (this.O000000000O0O()) {
            return;
         }
      }

      if (this.O0000000O00OOO == null) {
         if (!this.O0000000OO0) {
            this.O000000000("Целей нет, жду роста");
            this.O0000000OO0 = true;
         }

         this.O000000000O00O();
      } else {
         this.O0000000OO0 = false;
         switch (this.O0000000O00OOO.O00000000) {
            case SHOOT:
               this.O00000000(this.O0000000O00OOO);
               break;
            case PLANT:
               this.O000000000(this.O0000000O00OOO);
               break;
            case CLEAR:
               this.O0000000000(this.O0000000O00OOO);
         }
      }
   }

   private void O00000000(ChorusFarm.W87 o00000000000) {
      Vec3d var2 = Vec3d.ofCenter(o00000000000.O000000000);
      if (this.O0000000O0OOOO != null) {
         double var3 = O0000000000.player.getX() - (this.O0000000O0OOOO.getX() + 0.5);
         double var5 = O0000000000.player.getZ() - (this.O0000000O0OOOO.getZ() + 0.5);
         if (!(var3 * var3 + var5 * var5 <= 1.4) && !this.O00000000OOOOO.O000000000000(5000L)) {
            this.O000000000O();
            this.O00000000(this.O0000000O0OOOO, 0);
            return;
         }

         this.O0000000O0OOOO = null;
         this.O0000000O00OO = null;
         this.O000000000O00O();
         this.O00000000OOOOO.O00000000();
         this.O0000000O00.O00000000();
         this.O0000000O0OO00 = Double.MAX_VALUE;
      }

      double var9 = O0000000000.player.getEyePos().distanceTo(var2);
      if (var9 > 28.0) {
         this.O000000000O();
         BlockPos var11 = new BlockPos(o00000000000.O000000000.getX(), this.O000000000O000(), o00000000000.O000000000.getZ());
         if (!this.O00000000(var9, var11, 3)) {
            this.O00000000("не подойти к плоду " + this.O0000000000O0O(o00000000000.O000000000));
         }
      } else {
         this.O000000000O00O();
         if (!this.O00000000O0O()) {
            this.O000000000("Нет стрел, пропускаю отстрел");
            this.O000000000O();
            this.O0000000O00OOO = null;
         } else if (!this.O00000000O000O()) {
            if (O0000000000.player.getMainHandStack().getItem() instanceof BowItem) {
               if (!o00000000000.O000000000.equals(this.O0000000O00OO)) {
                  this.O0000000O00OO = o00000000000.O000000000;
                  this.O0000000O00O0O = this.O00000000(o00000000000.O000000000, var2);
               }

               float var10 = this.O00000000(this.O0000000O00O0O);
               O000000O0O00OO var6 = this.O00000000(var2, var10);
               this.O00000000(var6);
               this.O0000000000OO0();
               if (O0000000000.player.getItemUseTime() < this.O0000000O00O0O) {
                  this.O0000000O00.O00000000();
               } else if (new O000000O0O00OO(O0000000000.player).O00000000(var6) > 2.6F) {
                  this.O0000000O00.O00000000();
               } else {
                  Vec3d var7 = O0000000000.player.getVelocity();
                  if (var7.x * var7.x + var7.z * var7.z > 0.0025) {
                     this.O0000000O00.O00000000();
                  } else if (!this.O00000000(o00000000000.O000000000, var10)) {
                     if (this.O0000000O00.O000000000000(900L)) {
                        BlockPos var8 = this.O0000000O0OOO0 < 4 ? this.O0000000000(o00000000000.O000000000) : null;
                        if (var8 != null) {
                           this.O0000000O0OOOO = var8;
                           this.O0000000O0OOO0++;
                           this.O00000000OOOOO.O00000000();
                           this.O0000000O0OO00 = Double.MAX_VALUE;
                           this.O000000000O();
                           this.O000000000("Меняю позицию для отстрела " + this.O0000000000O0O(o00000000000.O000000000));
                        } else {
                           this.O0000000O0000O.put(o00000000000.O000000000, System.currentTimeMillis() + 6000L);
                           this.O00000000("не навестись на плод " + this.O0000000000O0O(o00000000000.O000000000));
                        }
                     }
                  } else if (this.O0000000O0.O000000000000(60L)) {
                     this.O0000000000OOO();
                     this.O0000000O0.O00000000();
                     this.O0000000O00.O00000000();
                     this.O0000000O0OOO++;
                     if (this.O0000000O0OOO >= 6) {
                        this.O0000000O0000O.put(o00000000000.O000000000, System.currentTimeMillis() + 6000L);
                        this.O00000000("плод " + this.O0000000000O0O(o00000000000.O000000000) + " не сбивается за 6 выстрелов");
                     }
                  }
               }
            }
         }
      }
   }

   private BlockPos O0000000000(BlockPos blockPos) {
      BlockPos var2 = new BlockPos(blockPos.getX(), this.O000000000O000(), blockPos.getZ());
      Vec3d var3 = Vec3d.ofCenter(blockPos);
      BlockPos var4 = O0000000000.player.getBlockPos();
      BlockPos var5 = null;
      double var6 = -Double.MAX_VALUE;

      for (int var8 = 0; var8 < 16; var8++) {
         double var9 = var8 * Math.PI / 8.0;
         double var11 = Math.cos(var9);
         double var13 = Math.sin(var9);

         for (int var15 = 3; var15 <= 6; var15++) {
            int var16 = var2.getX() + (int)Math.round(var11 * var15);
            int var17 = var2.getZ() + (int)Math.round(var13 * var15);
            BlockPos var18 = new BlockPos(var16, this.O000000000O000(), var17);
            if (this.O00000000000O0(var18)) {
               BlockPos var19 = this.O00000000000(var18);
               if (var19 != null) {
                  double var20 = var19.getX() - var4.getX();
                  double var22 = var19.getZ() - var4.getZ();
                  if (!(var20 * var20 + var22 * var22 < 4.0)) {
                     Vec3d var24 = new Vec3d(var19.getX() + 0.5, var19.getY() + 1.62, var19.getZ() + 0.5);
                     if (this.O00000000(var24, var3, blockPos)) {
                        double var25 = Math.sqrt(
                           (var19.getX() + 0.5 - (var2.getX() + 0.5)) * (var19.getX() + 0.5 - (var2.getX() + 0.5))
                              + (var19.getZ() + 0.5 - (var2.getZ() + 0.5)) * (var19.getZ() + 0.5 - (var2.getZ() + 0.5))
                        );
                        double var27 = -Math.abs(var25 - 4.0);
                        if (var27 > var6) {
                           var6 = var27;
                           var5 = var19;
                        }
                     }
                  }
               }
            }
         }
      }

      return var5;
   }

   private BlockPos O00000000000(BlockPos blockPos) {
      int[] var2 = new int[]{0, -1, 1, -2, 2};

      for (int var6 : var2) {
         BlockPos var7 = new BlockPos(blockPos.getX(), this.O000000000O000() + var6, blockPos.getZ());
         if (this.O000000000000(var7)) {
            return var7;
         }
      }

      return null;
   }

   private boolean O000000000000(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      BlockState var3 = O0000000000.world.getBlockState(blockPos.up());
      BlockState var4 = O0000000000.world.getBlockState(blockPos.down());
      boolean var5 = var2.isAir() || var2.getCollisionShape(O0000000000.world, blockPos).isEmpty();
      boolean var6 = var3.isAir() || var3.getCollisionShape(O0000000000.world, blockPos.up()).isEmpty();
      boolean var7 = !var4.isAir() && !var4.getCollisionShape(O0000000000.world, blockPos.down()).isEmpty();
      return var5 && var6 && var7;
   }

   private boolean O00000000(Vec3d vec3d, Vec3d vec3d2, BlockPos blockPos) {
      Vec3d var4 = vec3d2.subtract(vec3d);
      double var5 = var4.length();
      if (var5 < 1.0E-6) {
         return true;
      } else {
         Vec3d var7 = var4.multiply(1.0 / var5);

         for (double var8 = 0.2; var8 < var5; var8 += 0.2) {
            Vec3d var10 = vec3d.add(var7.multiply(var8));
            BlockPos var11 = BlockPos.ofFloored(var10.x, var10.y, var10.z);
            if (var11.equals(blockPos)) {
               return true;
            }

            BlockState var12 = O0000000000.world.getBlockState(var11);
            if (!var12.isAir() && !var12.getCollisionShape(O0000000000.world, var11).isEmpty()) {
               return false;
            }
         }

         return true;
      }
   }

   private void O000000000(ChorusFarm.W87 o00000000000) {
      this.O000000000O();
      if (!this.O00000000O00OO()) {
         this.O000000000("Цветы хоруса закончились, посадка недоступна");
         this.O0000000O00OOO = null;
      } else if (!this.O00000000O00O()) {
         if (O0000000000.player.getMainHandStack().isOf(Items.CHORUS_FLOWER)) {
            if (this.O0000000O0OO0O >= 4) {
               this.O0000000000000(o00000000000.O000000000);
               this.O0000000000000(o00000000000.O000000000.up());
               this.O00000000("посадка на " + this.O0000000000O0O(o00000000000.O000000000) + " не проходит, ресинк фантома");
            } else {
               BlockHitResult var2 = this.O00000000(o00000000000.O000000000, Direction.UP);
               if (var2 != null && !(O0000000000.player.getEyePos().distanceTo(var2.getPos()) > 4.2)) {
                  this.O00000000OOOOO.O00000000();
                  this.O000000000O00O();
                  O000000O0O00OO var3 = this.O00000000(var2.getPos());
                  this.O00000000(var3);
                  if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
                     if (this.O00000000OOOO.O000000000000(90L)) {
                        BlockHitResult var4 = this.O00000000O0O0O();
                        BlockHitResult var5 = var4 != null && var4.getBlockPos().equals(o00000000000.O000000000) && var4.getSide() == Direction.UP
                           ? var4
                           : var2;
                        O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var5);
                        O0000000000.player.swingHand(Hand.MAIN_HAND);
                        this.O0000000O0OO0O++;
                        this.O00000000OOOO.O00000000();
                        this.O0000000O0O0 = null;
                     }
                  }
               } else {
                  this.O00000000000(o00000000000);
               }
            }
         }
      }
   }

   private void O0000000000(ChorusFarm.W87 o00000000000) {
      this.O000000000O();
      double var2 = O0000000000.player.getEyePos().distanceTo(Vec3d.ofCenter(o00000000000.O000000000));
      if (var2 > 4.6) {
         if (!this.O00000000(var2, o00000000000.O000000000, 2)) {
            this.O00000000("не подойти к корню " + this.O0000000000O0O(o00000000000.O000000000));
         }
      } else {
         BlockHitResult var4 = this.O0000000000O00(o00000000000.O000000000);
         if (var4 != null && !(O0000000000.player.getEyePos().distanceTo(var4.getPos()) > 4.2)) {
            this.O00000000OOOOO.O00000000();
            this.O000000000O00O();
            if (!this.O00000000O00O0()) {
               O000000O0O00OO var5 = this.O00000000(var4.getPos());
               this.O00000000(var5);
               if (!(new O000000O0O00OO(O0000000000.player).O00000000(var5) > 4.0F)) {
                  BlockHitResult var6 = this.O00000000O0O0O();
                  BlockHitResult var7 = var6 != null && var6.getBlockPos().equals(o00000000000.O000000000) ? var6 : var4;
                  if (!o00000000000.O000000000.equals(this.O0000000O0O0)) {
                     if (!this.O00000000OOOO.O000000000000(90L)) {
                        return;
                     }

                     O0000000000.interactionManager.attackBlock(o00000000000.O000000000, var7.getSide());
                     this.O0000000O0O0 = o00000000000.O000000000;
                     if (O0000000000.world.getBlockState(o00000000000.O000000000.down()).isOf(Blocks.END_STONE)) {
                        Set var8 = this.O00000000(List.of(o00000000000.O000000000));
                        var8.remove(o00000000000.O000000000);
                        this.O0000000O00O0 = var8;
                     } else {
                        this.O0000000O00O0 = null;
                     }

                     this.O0000000O.O00000000();
                     this.O00000000OOOO.O00000000();
                  } else {
                     if (this.O0000000O.O000000000000(2000L)) {
                        this.O0000000000000(o00000000000.O000000000);
                        this.O00000000("корень " + this.O0000000000O0O(o00000000000.O000000000) + " не ломается, ресинк фантома");
                        return;
                     }

                     O0000000000.interactionManager.updateBlockBreakingProgress(o00000000000.O000000000, var7.getSide());
                  }

                  O0000000000.player.swingHand(Hand.MAIN_HAND);
               }
            }
         } else {
            this.O00000000000(o00000000000);
         }
      }
   }

   private boolean O00000000(double d, BlockPos blockPos, int i) {
      if (d < this.O0000000O0OO00 - 0.4) {
         this.O0000000O0OO00 = d;
         this.O00000000OOOOO.O00000000();
      }

      if (this.O00000000OOOOO.O000000000000(5000L)) {
         return false;
      } else {
         this.O00000000(blockPos, i);
         return true;
      }
   }

   private void O00000000(String string) {
      this.O000000000("Пропуск: " + string);
      if (this.O0000000O00OOO != null) {
         this.O0000000O0000O.put(this.O0000000O00OOO.O000000000, System.currentTimeMillis() + 8000L);
         this.O0000000000000(this.O0000000O00OOO.O000000000);
      }

      this.O0000000O00OOO = null;
      this.O0000000O0O0 = null;
      this.O0000000O00O0 = null;
      this.O000000000O00O();
   }

   private void O0000000000000(BlockPos blockPos) {
      O0000000000.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, blockPos, Direction.DOWN));
   }

   private boolean O000000000000O(BlockPos blockPos) {
      long var2 = System.currentTimeMillis();
      long[] var4 = this.O0000000O000OO.get(blockPos);
      if (var4 != null && var2 - var4[1] <= 4000L) {
         var4[0]++;
         var4[1] = var2;
         if (var4[0] >= 2L) {
            this.O0000000O000OO.remove(blockPos);
            this.O0000000O0000O.put(blockPos, var2 + 30000L);
            this.O0000000000000(blockPos);
            this.O000000000("Фантомный блок " + this.O0000000000O0O(blockPos) + ", ресинк и пропуск");
            return true;
         } else {
            return false;
         }
      } else {
         this.O0000000O000OO.put(blockPos.toImmutable(), new long[]{1L, var2});
         if (this.O0000000O000OO.size() > 128) {
            this.O0000000O000OO.entrySet().removeIf(entry -> var2 - entry.getValue()[1] > 4000L);
         }

         return false;
      }
   }

   private void O00000000000(ChorusFarm.W87 o00000000000) {
      double var2 = O0000000000.player.getEyePos().distanceTo(Vec3d.ofCenter(o00000000000.O000000000));
      if (var2 > 4.6) {
         if (!this.O00000000(var2, o00000000000.O000000000, 1)) {
            this.O00000000("не подойти к " + this.O0000000000O0O(o00000000000.O000000000));
         }
      } else {
         if (this.O00000000OOOOO.O000000000000(1800L)) {
            this.O00000000("нет прямой видимости " + this.O0000000000O0O(o00000000000.O000000000));
         }
      }
   }

   private void O0000000000OO0() {
      O0000000000.options.useKey.setPressed(true);
      if (!O0000000000.player.isUsingItem() && O0000000000.interactionManager != null) {
         O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
      }

      this.O0000000OO = true;
   }

   private void O0000000000OOO() {
      O0000000000.options.useKey.setPressed(false);
      this.O0000000OO = false;
      if (O0000000000.interactionManager != null) {
         O0000000000.interactionManager.stopUsingItem(O0000000000.player);
      }

      O0000000000.player.swingHand(Hand.MAIN_HAND);
   }

   private void O000000000O() {
      if (this.O0000000OO) {
         O0000000000.options.useKey.setPressed(false);
         this.O0000000OO = false;
      }

      if (O0000000000.player != null
         && O0000000000.interactionManager != null
         && O0000000000.player.isUsingItem()
         && O0000000000.player.getActiveItem().getItem() instanceof BowItem) {
         O0000000000.interactionManager.stopUsingItem(O0000000000.player);
      }
   }

   private O000000O0O00OO O00000000(Vec3d vec3d, float f) {
      Vec3d var3 = O0000000000.player.getEyePos().subtract(0.0, 0.1, 0.0);
      double var4 = vec3d.x - var3.x;
      double var6 = vec3d.z - var3.z;
      double var8 = Math.sqrt(var4 * var4 + var6 * var6);
      double var10 = vec3d.y - var3.y;
      float var12 = (float)Math.toDegrees(Math.atan2(-var4, var6));
      float var13 = this.O00000000(var8, var10, f);
      return new O000000O0O00OO(var12, var13);
   }

   private float O00000000(int i) {
      float var2 = i / 20.0F;
      var2 = (var2 * var2 + var2 * 2.0F) / 3.0F;
      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return var2 * 3.0F;
   }

   private int O00000000(BlockPos blockPos, Vec3d vec3d) {
      for (int var3 = 8; var3 < 20; var3++) {
         float var4 = this.O00000000(var3);
         O000000O0O00OO var5 = this.O00000000(vec3d, var4);
         if (this.O00000000(var5.O00000000, var5.O000000000, var4, blockPos)) {
            return Math.min(20, var3 + 3);
         }
      }

      return 20;
   }

   private float O00000000(double d, double e, float f) {
      if (d < 0.35) {
         return e >= 0.0 ? -75.0F : 75.0F;
      } else {
         float var6 = -89.0F;
         float var7 = 89.0F;

         for (int var8 = 0; var8 < 60; var8++) {
            float var9 = (var6 + var7) / 2.0F;
            double var10 = this.O00000000(d, var9, f);
            if (var10 > e) {
               var6 = var9;
            } else {
               var7 = var9;
            }
         }

         return (var6 + var7) / 2.0F;
      }
   }

   private double O00000000(double d, float f, float g) {
      double var5 = Math.toRadians(f);
      double var7 = g * Math.cos(var5);
      double var9 = -g * Math.sin(var5);
      double var11 = 0.0;
      double var13 = 0.0;

      for (int var15 = 0; var15 < 600; var15++) {
         double var16 = var11;
         double var18 = var13;
         var11 += var7;
         var13 += var9;
         var7 *= 0.99;
         var9 *= 0.99;
         var9 -= 0.05;
         if (var11 >= d) {
            double var20 = var11 - var16 > 0.001 ? (d - var16) / (var11 - var16) : 1.0;
            return var18 + (var13 - var18) * var20;
         }
      }

      return var13;
   }

   private boolean O00000000(BlockPos blockPos, float f) {
      return this.O00000000(O0000000000.player.getYaw(), O0000000000.player.getPitch(), f, blockPos);
   }

   private boolean O00000000(double d, double e, float f, BlockPos blockPos) {
      double var7 = Math.toRadians(d);
      double var9 = Math.toRadians(e);
      double var11 = Math.cos(var9);
      Vec3d var13 = new Vec3d(-Math.sin(var7) * var11, -Math.sin(var9), Math.cos(var7) * var11);
      Vec3d var14 = var13.multiply(f);
      Vec3d var15 = O0000000000.player.getMovement();
      var14 = var14.add(var15.x, O0000000000.player.isOnGround() ? 0.0 : var15.y, var15.z);
      Vec3d var16 = O0000000000.player.getEyePos().subtract(0.0, 0.1, 0.0);
      double var17 = this.O000000000O000() - 6;

      for (int var19 = 0; var19 < 120; var19++) {
         Vec3d var20 = var16.add(var14);
         BlockHitResult var21 = O0000000000.world.raycast(new RaycastContext(var16, var20, ShapeType.COLLIDER, FluidHandling.NONE, O0000000000.player));
         if (var21.getType() == Type.BLOCK) {
            return var21.getBlockPos().equals(blockPos);
         }

         var16 = var20;
         var14 = var14.multiply(0.99).subtract(0.0, 0.05, 0.0);
         if (var20.y < var17) {
            break;
         }
      }

      return false;
   }

   private void O000000000O0() {
      this.O0000000O00000.clear();
      long var1 = System.currentTimeMillis();
      this.O0000000O000O.entrySet().removeIf(entry -> var1 > entry.getValue());
      if (this.O0000000O00O00 != null) {
         BlockState var3 = O0000000000.world.getBlockState(this.O0000000O00O00);
         if (this.O0000000000O(this.O0000000O00O00) || !var3.isOf(Blocks.CHORUS_PLANT) && !var3.isOf(Blocks.CHORUS_FLOWER)) {
            this.O0000000O00O00 = null;
         }
      }

      boolean var22 = this.O000000000O00.O0000000000() && this.O00000000O00OO();
      boolean var4 = this.O000000000O.O0000000000();
      int var5 = (int)this.O000000000O0.O0000000000();
      int[] var6 = this.O000000000OO();
      ArrayList var7 = new ArrayList();
      ArrayList var8 = new ArrayList();
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;

      for (BlockPos var13 : BlockPos.iterate(var6[0], var6[1], var6[2], var6[3], var6[4], var6[5])) {
         BlockState var14 = O0000000000.world.getBlockState(var13);
         boolean var15 = var14.isOf(Blocks.CHORUS_FLOWER);
         boolean var16 = var14.isOf(Blocks.CHORUS_PLANT);
         if (var15 || var16 || var14.isOf(Blocks.END_STONE)) {
            BlockPos var17 = var13.toImmutable();
            if (var14.isOf(Blocks.END_STONE)) {
               if (var22) {
                  BlockPos var18 = var17.up();
                  if (this.O00000000000O0(var18) && !this.O0000000000O(var18) && !this.O0000000000O(var17)) {
                     BlockState var19 = O0000000000.world.getBlockState(var18);
                     if (var19.isAir() || var19.isReplaceable()) {
                        this.O0000000O00000.add(new ChorusFarm.W87(ChorusFarm.W84.PLANT, var17, Direction.UP));
                        var10++;
                     }
                  }
               }
            } else {
               var8.add(var17);
               if (O0000000000.world.getBlockState(var17.down()).isOf(Blocks.END_STONE) && !this.O0000000000O(var17)) {
                  var7.add(var17);
               }
            }
         }
      }

      Set var23 = this.O00000000((List<BlockPos>)var7);
      int var24 = this.O000000000O000() + 4 + 1;

      for (BlockPos var27 : (List<BlockPos>)var8) {
         if (!var23.contains(var27) && !this.O0000000000O(var27) && var27.getY() <= var24) {
            this.O0000000O00000.add(new ChorusFarm.W87(ChorusFarm.W84.CLEAR, var27, null));
            var11++;
         }
      }

      HashSet var26 = new HashSet();

      for (BlockPos var30 : (List<BlockPos>)var7) {
         ChorusFarm.W85 var31 = this.O00000000000O(var30);
         boolean var32 = !var31.flowers().isEmpty();
         boolean var33 = this.O0000000O00O00 != null && var30.equals(this.O0000000O00O00);
         if (!var32) {
            if (!var33 && !this.O0000000O00O.contains(var30)) {
               var26.add(var30);
            } else {
               this.O0000000O00000.add(new ChorusFarm.W87(ChorusFarm.W84.CLEAR, var30, null));
               var11++;
            }
         } else if (var33 || var31.height() >= var5) {
            if (var4) {
               for (BlockPos var21 : var31.flowers()) {
                  if (!this.O0000000000O(var21)) {
                     this.O0000000O00000.add(new ChorusFarm.W87(ChorusFarm.W84.SHOOT, var21, null));
                     var9++;
                  }
               }
            } else {
               this.O0000000O00000.add(new ChorusFarm.W87(ChorusFarm.W84.CLEAR, var30, null));
               var11++;
            }
         }
      }

      this.O0000000O00O.clear();
      this.O0000000O00O.addAll(var26);
      int var29 = var9 + var10 + var11;
      if (var29 > 0 && this.O0000000OO00 == 0) {
         this.O000000000("Найдено: отстрел " + var9 + ", посадка " + var10 + ", очистка " + var11);
      }

      this.O0000000OO00 = var29;
   }

   private Set<BlockPos> O00000000(List<BlockPos> list) {
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();

      for (BlockPos var5 : list) {
         if (var2.add(var5)) {
            var3.add(var5);
         }
      }

      while (!var3.isEmpty() && var2.size() < 1600) {
         BlockPos var11 = (BlockPos)var3.poll();

         for (Direction var8 : Direction.values()) {
            if (var8 != Direction.DOWN) {
               BlockPos var9 = var11.offset(var8);
               if (!var2.contains(var9)) {
                  BlockState var10 = O0000000000.world.getBlockState(var9);
                  if (var10.isOf(Blocks.CHORUS_PLANT) || var10.isOf(Blocks.CHORUS_FLOWER)) {
                     var2.add(var9);
                     var3.add(var9);
                  }
               }
            }
         }
      }

      return var2;
   }

   private ChorusFarm.W85 O00000000000O(BlockPos blockPos) {
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();
      ArrayList var4 = new ArrayList();
      var3.add(blockPos);
      var2.add(blockPos);
      int var5 = blockPos.getY();
      int var6 = var5;

      while (!var3.isEmpty() && var2.size() < 400) {
         BlockPos var7 = (BlockPos)var3.poll();
         if (var7.getY() > var6) {
            var6 = var7.getY();
         }

         if (O0000000000.world.getBlockState(var7).isOf(Blocks.CHORUS_FLOWER)) {
            var4.add(var7);
         }

         for (Direction var11 : Direction.values()) {
            if (var11 != Direction.DOWN) {
               BlockPos var12 = var7.offset(var11);
               if (!var2.contains(var12)) {
                  BlockState var13 = O0000000000.world.getBlockState(var12);
                  if (var13.isOf(Blocks.CHORUS_PLANT) || var13.isOf(Blocks.CHORUS_FLOWER)) {
                     var2.add(var12);
                     var3.add(var12);
                  }
               }
            }
         }
      }

      return new ChorusFarm.W85(var6 - var5 + 1, var4);
   }

   private ChorusFarm.W87 O000000000O00() {
      Vec3d var1 = O0000000000.player.getEyePos();
      ChorusFarm.W87 var2 = null;
      double var3 = Double.MAX_VALUE;

      for (ChorusFarm.W87 var6 : this.O0000000O00000) {
         if (this.O000000000000(var6) && !this.O0000000000O(var6.O000000000) && !this.O0000000000O0(var6.O000000000)) {
            double var7 = var1.squaredDistanceTo(this.O0000000000000(var6));
            if (var6.O00000000 == ChorusFarm.W84.CLEAR) {
               var7 -= 64.0;
            } else if (var6.O00000000 == ChorusFarm.W84.PLANT) {
               var7 += 0.001;
            }

            if (this.O0000000O00O00 != null && var6.O000000000.getSquaredDistance(this.O0000000O00O00) < 64.0) {
               var7 -= 10000.0;
            }

            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }
      }

      return var2;
   }

   private boolean O000000000000(ChorusFarm.W87 o00000000000) {
      if (o00000000000 == null) {
         return false;
      } else {
         BlockState var2 = O0000000000.world.getBlockState(o00000000000.O000000000);

         return switch (o00000000000.O00000000) {
            case SHOOT -> this.O000000000O.O0000000000() && var2.isOf(Blocks.CHORUS_FLOWER);
            case PLANT -> {
               if (!this.O00000000O00OO()) {
                  yield false;
               } else if (!var2.isOf(Blocks.END_STONE)) {
                  yield false;
               } else {
                  BlockState var3 = O0000000000.world.getBlockState(o00000000000.O000000000.up());
                  yield var3.isAir() || var3.isReplaceable();
               }
            }
            case CLEAR -> var2.isOf(Blocks.CHORUS_PLANT) || var2.isOf(Blocks.CHORUS_FLOWER);
         };
      }
   }

   private Vec3d O0000000000000(ChorusFarm.W87 o00000000000) {
      return o00000000000.O00000000 == ChorusFarm.W84.PLANT
         ? new Vec3d(o00000000000.O000000000.getX() + 0.5, o00000000000.O000000000.getY() + 1.0, o00000000000.O000000000.getZ() + 0.5)
         : Vec3d.ofCenter(o00000000000.O000000000);
   }

   private int O000000000O000() {
      return Math.min(O000000000O0O.getY(), O000000000O0O0.getY());
   }

   private boolean O00000000000O0(BlockPos blockPos) {
      int var2 = Math.min(O000000000O0O.getX(), O000000000O0O0.getX());
      int var3 = Math.max(O000000000O0O.getX(), O000000000O0O0.getX());
      int var4 = Math.min(O000000000O0O.getZ(), O000000000O0O0.getZ());
      int var5 = Math.max(O000000000O0O.getZ(), O000000000O0O0.getZ());
      return blockPos.getX() >= var2 && blockPos.getX() <= var3 && blockPos.getZ() >= var4 && blockPos.getZ() <= var5;
   }

   private void O00000000(BlockPos blockPos, int i) {
      IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
      boolean var4 = !blockPos.equals(this.O0000000O0O00);
      if (var4 || !var3.getCustomGoalProcess().isActive()) {
         var3.getCustomGoalProcess().setGoalAndPath(new GoalNear(blockPos, i));
         if (var4) {
            this.O000000000("Иду к " + this.O0000000000O0O(blockPos));
         }

         this.O0000000O0O00 = blockPos;
      }
   }

   private void O000000000O00O() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (var1.getCustomGoalProcess().isActive()) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.O0000000O0O00 = null;
   }

   private boolean O000000000O0O() {
      if (this.O0000000O00O00 != null) {
         return false;
      } else if (!this.O000000000O0OO()) {
         return false;
      } else {
         ItemEntity var1 = this.O000000000O0O0();
         if (var1 == null) {
            this.O0000000OO000 = -1;
            return false;
         } else {
            double var2 = O0000000000.player.getX() - var1.getX();
            double var4 = O0000000000.player.getZ() - var1.getZ();
            double var6 = var2 * var2 + var4 * var4;
            double var8 = Math.abs(O0000000000.player.getY() - var1.getY());
            if (var6 <= 0.8 && var8 < 1.3) {
               this.O0000000OO000 = -1;
               return false;
            } else {
               if (var1.getId() != this.O0000000OO000) {
                  this.O0000000OO000 = var1.getId();
                  this.O0000000O0000.O00000000();
               }

               if (this.O0000000O0000.O000000000000(1500L)) {
                  BlockPos var10 = this.O00000000(var1);
                  if (var10 != null) {
                     this.O0000000O00O00 = var10;
                     this.O0000000OO000 = -1;
                     this.O000000000("Плод завис на растении, харвест корня " + this.O0000000000O0O(var10));
                     return false;
                  }
               }

               if (this.O0000000O0000.O000000000000(10000L)) {
                  this.O0000000O000O0.put(var1.getId(), System.currentTimeMillis() + 18000L);
                  this.O0000000OO000 = -1;
                  return false;
               } else {
                  this.O000000000O();
                  this.O00000000(BlockPos.ofFloored(var1.getX(), var1.getY() + 0.1, var1.getZ()), 0);
                  return true;
               }
            }
         }
      }
   }

   private ItemEntity O000000000O0O0() {
      Box var1 = new Box(
            Math.min(O000000000O0O.getX(), O000000000O0O0.getX()),
            this.O000000000O000() - 4,
            Math.min(O000000000O0O.getZ(), O000000000O0O0.getZ()),
            Math.max(O000000000O0O.getX(), O000000000O0O0.getX()) + 1,
            this.O000000000O000() + 32,
            Math.max(O000000000O0O.getZ(), O000000000O0O0.getZ()) + 1
         )
         .expand(2.5);
      List var2 = O0000000000.world
         .getEntitiesByClass(
            ItemEntity.class,
            var1,
            itemEntity -> itemEntity.isAlive() && (itemEntity.getStack().isOf(Items.CHORUS_FRUIT) || itemEntity.getStack().isOf(Items.CHORUS_FLOWER))
         );
      ItemEntity var3 = null;
      double var4 = Double.MAX_VALUE;
      long var6 = System.currentTimeMillis();

      for (ItemEntity var9 : (List<ItemEntity>)var2) {
         Long var10 = this.O0000000O000O0.get(var9.getId());
         if (var10 != null) {
            if (var6 <= var10) {
               continue;
            }

            this.O0000000O000O0.remove(var9.getId());
         }

         double var11 = O0000000000.player.squaredDistanceTo(var9);
         if (var11 < var4) {
            var4 = var11;
            var3 = var9;
         }
      }

      return var3;
   }

   private BlockPos O00000000(ItemEntity itemEntity) {
      if (itemEntity.getY() - this.O000000000O000() < 1.5) {
         return null;
      } else {
         BlockPos var2 = BlockPos.ofFloored(itemEntity.getX(), itemEntity.getY() + 0.05, itemEntity.getZ());
         BlockPos var3 = null;

         for (BlockPos var7 : new BlockPos[]{var2.down(), var2, var2.up()}) {
            BlockState var8 = O0000000000.world.getBlockState(var7);
            if (var8.isOf(Blocks.CHORUS_PLANT) || var8.isOf(Blocks.CHORUS_FLOWER)) {
               var3 = var7;
               break;
            }
         }

         return var3 == null ? null : this.O00000000000OO(var3);
      }
   }

   private BlockPos O00000000000OO(BlockPos blockPos) {
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();
      var2.add(blockPos);
      var3.add(blockPos);

      while (!var3.isEmpty() && var2.size() < 400) {
         BlockPos var4 = (BlockPos)var3.poll();
         BlockState var5 = O0000000000.world.getBlockState(var4);
         if ((var5.isOf(Blocks.CHORUS_PLANT) || var5.isOf(Blocks.CHORUS_FLOWER))
            && O0000000000.world.getBlockState(var4.down()).isOf(Blocks.END_STONE)
            && !this.O0000000000O(var4)) {
            return var4;
         }

         for (Direction var9 : Direction.values()) {
            BlockPos var10 = var4.offset(var9);
            if (!var2.contains(var10)) {
               BlockState var11 = O0000000000.world.getBlockState(var10);
               if (var11.isOf(Blocks.CHORUS_PLANT) || var11.isOf(Blocks.CHORUS_FLOWER)) {
                  var2.add(var10);
                  var3.add(var10);
               }
            }
         }
      }

      return null;
   }

   private boolean O000000000O0OO() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (var2.isEmpty()) {
            return true;
         }

         if ((var2.isOf(Items.CHORUS_FRUIT) || var2.isOf(Items.CHORUS_FLOWER)) && var2.getCount() < var2.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private int[] O000000000OO() {
      int var1 = Math.min(O000000000O0O.getX(), O000000000O0O0.getX());
      int var2 = Math.min(O000000000O0O.getZ(), O000000000O0O0.getZ());
      int var3 = Math.max(O000000000O0O.getX(), O000000000O0O0.getX());
      int var4 = Math.max(O000000000O0O.getZ(), O000000000O0O0.getZ());
      BlockPos var5 = O0000000000.player.getBlockPos();
      var1 = Math.max(var1, var5.getX() - 40);
      var2 = Math.max(var2, var5.getZ() - 40);
      var3 = Math.min(var3, var5.getX() + 40);
      var4 = Math.min(var4, var5.getZ() + 40);
      int var6 = this.O000000000O000() - 4;
      int var7 = this.O000000000O000() + 32;
      return new int[]{var1, var6, var2, var3, var7, var4};
   }

   private BlockPos O000000000OO0() {
      int[] var1 = this.O000000000OO();
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

   private boolean O000000000OO00() {
      return this.O0000000O0O000 != null && this.O00000000(O0000000000.world.getBlockState(this.O0000000O0O000));
   }

   private void O0000000000(boolean bl) {
      if (bl) {
         this.O0000000O0OO0 = System.currentTimeMillis() + 30000L;
      }

      this.O0000000O0O000 = null;
      this.O0000000O0O00O = -1;
      this.O000000000O00O();
      this.O0000000O00OO0 = ChorusFarm.W86.FARM;
   }

   private void O000000000OO0O() {
      if (!this.O000000000OO00()) {
         this.O0000000000(false);
      } else if (this.O0000000O000.O000000000000(15000L)) {
         this.O000000000("Не смог дойти до сундука, вернусь позже");
         this.O0000000000(true);
      } else if (O0000000000.player.getEyePos().distanceTo(Vec3d.ofCenter(this.O0000000O0O000)) <= 4.5) {
         this.O000000000O00O();
         this.O00000000OOOO.O00000000();
         this.O0000000O00OO0 = ChorusFarm.W86.INTERACTING;
      } else {
         this.O00000000(this.O0000000O0O000, 2);
      }
   }

   private void O000000000OOO() {
      if (!this.O000000000OO00()) {
         this.O0000000000(false);
      } else if (this.O0000000O0O0O >= 3) {
         this.O000000000("Сундук не открывается, блокирую");
         this.O0000000000(true);
      } else {
         this.O000000000O00O();
         if (O0000000000.player.getEyePos().distanceTo(Vec3d.ofCenter(this.O0000000O0O000)) > 4.6) {
            this.O0000000O000.O00000000();
            this.O0000000O00OO0 = ChorusFarm.W86.NAVIGATING;
         } else {
            BlockHitResult var1 = this.O0000000000O00(this.O0000000O0O000);
            Vec3d var2 = var1 != null ? var1.getPos() : Vec3d.ofCenter(this.O0000000O0O000);
            O000000O0O00OO var3 = this.O00000000(var2);
            this.O00000000(var3);
            if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
               if (this.O00000000OOOO.O000000000000(90L)) {
                  BlockHitResult var4 = var1 != null ? var1 : new BlockHitResult(var2, Direction.UP, this.O0000000O0O000, false);
                  O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var4);
                  O0000000000.player.swingHand(Hand.MAIN_HAND);
                  this.O0000000O0O0O++;
                  this.O0000000O0O00O = -1;
                  this.O0000000O000.O00000000();
                  this.O00000000OOOO.O00000000();
                  this.O0000000O00OO0 = ChorusFarm.W86.WAITING_FOR_CONTAINER;
               }
            }
         }
      }
   }

   private void O000000000OOO0() {
      this.O000000000O00O();
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
         int var3 = ((GenericContainerScreenHandler)var1.getScreenHandler()).syncId;
         if (O0000000000.player.currentScreenHandler != null && O0000000000.player.currentScreenHandler.syncId == var3) {
            this.O0000000O0O00O = var3;
            this.O0000000O0O0O0 = -1;
            this.O0000000O0O0OO = 0;
            this.O0000000O000.O00000000();
            this.O0000000O00OO0 = ChorusFarm.W86.DEPOSITING;
            return;
         }
      }

      if (this.O0000000O000.O000000000000(4000L)) {
         this.O000000000("Сундук не ответил открытием, повтор подхода");
         this.O0000000O000.O00000000();
         this.O0000000O00OO0 = ChorusFarm.W86.NAVIGATING;
      }
   }

   private void O000000000OOOO() {
      if (!(
         O0000000000.currentScreen instanceof GenericContainerScreen var1
            && O0000000000.player.currentScreenHandler != null
            && O0000000000.player.currentScreenHandler.syncId == this.O0000000O0O00O
            && ((GenericContainerScreenHandler)var1.getScreenHandler()).syncId == this.O0000000O0O00O
      )) {
         this.O0000000000(false);
      } else if (this.O0000000O000.O000000000000(50L)) {
         int var6 = this.O00000000O00();
         if (this.O0000000O0O0O0 >= 0 && var6 >= this.O0000000O0O0O0) {
            this.O0000000O0O0OO++;
         } else {
            this.O0000000O0O0OO = 0;
         }

         this.O0000000O0O0O0 = var6;
         if (this.O0000000O0O0OO >= 3) {
            ChatUtil.O00000000("§d[ChorusFarm] §fСундук заполнен, освободите место");
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
               O0000000000.interactionManager.clickSlot(this.O0000000O0O00O, var5, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O0000000O000.O00000000();
            }
         }
      }
   }

   private int O00000000O() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (var3.isOf(Items.CHORUS_FRUIT)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   private int O00000000O0() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (var3.isOf(Items.CHORUS_FLOWER)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   private int O00000000O00() {
      return this.O00000000O() + Math.max(0, this.O00000000O0() - 128);
   }

   private int O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      for (int var3 = i; var3 < genericContainerScreenHandler.slots.size(); var3++) {
         Slot var4 = genericContainerScreenHandler.getSlot(var3);
         if (var4.hasStack() && var4.getStack().isOf(Items.CHORUS_FRUIT)) {
            return var3;
         }
      }

      if (this.O00000000O0() > 128) {
         for (int var5 = i; var5 < genericContainerScreenHandler.slots.size(); var5++) {
            Slot var6 = genericContainerScreenHandler.getSlot(var5);
            if (var6.hasStack() && var6.getStack().isOf(Items.CHORUS_FLOWER)) {
               return var5;
            }
         }
      }

      return -1;
   }

   private boolean O0000000000O(BlockPos blockPos) {
      Long var2 = this.O0000000O0000O.get(blockPos);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() > var2) {
         this.O0000000O0000O.remove(blockPos);
         return false;
      } else {
         return true;
      }
   }

   private boolean O0000000000O0(BlockPos blockPos) {
      Long var2 = this.O0000000O000O.get(blockPos);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() > var2) {
         this.O0000000O000O.remove(blockPos);
         return false;
      } else {
         return true;
      }
   }

   private void O00000000O000() {
      if (this.O0000000O0O0 != null) {
         BlockState var1 = O0000000000.world.getBlockState(this.O0000000O0O0);
         if (!var1.isOf(Blocks.CHORUS_PLANT) && !var1.isOf(Blocks.CHORUS_FLOWER)) {
            if (this.O0000000O00O0 != null) {
               long var2 = System.currentTimeMillis() + 3000L;

               for (BlockPos var5 : this.O0000000O00O0) {
                  this.O0000000O000O.put(var5, var2);
               }

               this.O0000000O00O0 = null;
            }

            this.O0000000O0O0 = null;
         }
      }
   }

   private boolean O00000000O0000() {
      return this.O00000000O0O0() >= 4 ? true : this.O00000000O0O00() == 0 && (this.O00000000O() > 0 || this.O00000000O0() > 128);
   }

   private boolean O00000000O000O() {
      if (O0000000000.player.getMainHandStack().getItem() instanceof BowItem) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (O0000000000.player.getInventory().getStack(var1).getItem() instanceof BowItem) {
               O0000000000.player.getInventory().setSelectedSlot(var1);
               return false;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (O0000000000.player.getInventory().getStack(var2).getItem() instanceof BowItem) {
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

   private boolean O00000000O00O() {
      if (O0000000000.player.getMainHandStack().isOf(Items.CHORUS_FLOWER)) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (O0000000000.player.getInventory().getStack(var1).isOf(Items.CHORUS_FLOWER)) {
               O0000000000.player.getInventory().setSelectedSlot(var1);
               return false;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (O0000000000.player.getInventory().getStack(var2).isOf(Items.CHORUS_FLOWER)) {
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

   private boolean O00000000O00O0() {
      ItemStack var1 = O0000000000.player.getMainHandStack();
      if (!(var1.getItem() instanceof BowItem) && !var1.isOf(Items.CHORUS_FLOWER)) {
         return false;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
            if (!var3.isEmpty()
               && !(var3.getItem() instanceof BowItem)
               && !var3.isOf(Items.CHORUS_FLOWER)
               && !var3.isOf(Items.ARROW)
               && !var3.isOf(Items.CHORUS_FRUIT)) {
               O0000000000.player.getInventory().setSelectedSlot(var2);
               return false;
            }
         }

         return false;
      }
   }

   private boolean O00000000O00OO() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isOf(Items.CHORUS_FLOWER)) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000O0O() {
      ItemStack var1 = O0000000000.player.getMainHandStack();
      if (var1.getItem() instanceof BowItem && this.O00000000(var1)) {
         return true;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
            if (var3.isOf(Items.ARROW) || var3.isOf(Items.SPECTRAL_ARROW) || var3.isOf(Items.TIPPED_ARROW)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         ItemEnchantmentsComponent var2 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
         if (var2 != null && !var2.isEmpty()) {
            for (Entry var4 : var2.getEnchantmentEntries()) {
               if (((RegistryEntry)var4.getKey()).matchesKey(Enchantments.INFINITY)) {
                  return var4.getIntValue() > 0;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int O00000000O0O0() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isOf(Items.CHORUS_FRUIT)) {
            var1++;
         }
      }

      return var1;
   }

   private int O00000000O0O00() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isEmpty()) {
            var1++;
         }
      }

      return var1;
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
                  if (var4.distanceTo(var17) <= 4.6 && this.O000000000(var4, var17, blockPos)) {
                     return new BlockHitResult(var17, direction, blockPos, false);
                  }
               }
            }

            return null;
         }
      }
   }

   private boolean O000000000(Vec3d vec3d, Vec3d vec3d2, BlockPos blockPos) {
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
               if (!var11.isOf(Blocks.CHORUS_PLANT)
                  && !var11.isOf(Blocks.CHORUS_FLOWER)
                  && !var11.isAir()
                  && !var11.getCollisionShape(O0000000000.world, var10).isEmpty()) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private BlockHitResult O0000000000O00(BlockPos blockPos) {
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

   private BlockHitResult O000000000(BlockPos blockPos, Direction direction) {
      Vec3d var3 = O0000000000.player.getEyePos();
      double[] var4 = new double[]{0.5, 0.3, 0.7};

      for (double var8 : var4) {
         for (double var13 : var4) {
            Vec3d var15 = this.O00000000(blockPos, direction, var8, var13);
            BlockHitResult var16 = O0000000000.world.raycast(new RaycastContext(var3, var15, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
            if (var16.getType() == Type.BLOCK && var16.getBlockPos().equals(blockPos) && var16.getSide() == direction) {
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
         case DOWN -> new Vec3d(var7 + d, var9, var11 + e);
         case UP -> new Vec3d(var7 + d, var9 + 1.0, var11 + e);
         default -> throw new MatchException(null, null);
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
      float var3 = Math.max(34.0F, Math.min(140.0F, var2 * 1.35F));
      O000000O0O0O0.O00000000(o000000O0O00OO, var3, var3, var3, var3, 2, 20, false);
   }

   private BlockHitResult O00000000O0O0O() {
      double var1 = Math.toRadians(O0000000000.player.getYaw());
      double var3 = Math.toRadians(O0000000000.player.getPitch());
      double var5 = Math.cos(var3);
      Vec3d var7 = new Vec3d(-Math.sin(var1) * var5, -Math.sin(var3), Math.cos(var1) * var5);
      Vec3d var8 = O0000000000.player.getEyePos();
      Vec3d var9 = var8.add(var7.multiply(5.0));
      BlockHitResult var10 = O0000000000.world.raycast(new RaycastContext(var8, var9, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var10.getType() == Type.BLOCK ? var10 : null;
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

   private String O0000000000O0O(BlockPos blockPos) {
      return blockPos.getX() + " " + blockPos.getY() + " " + blockPos.getZ();
   }

   private void O000000000(String string) {
      if (this.O000000000O00O.O0000000000()) {
         ChatUtil.O00000000("§d[ChorusFarm] §7" + string);
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null && O000000000O0O != null && O000000000O0O0 != null) {
         if (O0000O00O0O00.O00000000(O0000000000)) {
            Vec3d var2 = O0000000000.gameRenderer.getCamera().getPos();
            Matrix4f var3 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
            int var4 = this.O000000000O000() - 1;
            float var5 = (float)(Math.min(O000000000O0O.getX(), O000000000O0O0.getX()) - var2.x);
            float var6 = (float)(var4 - var2.y);
            float var7 = (float)(Math.min(O000000000O0O.getZ(), O000000000O0O0.getZ()) - var2.z);
            float var8 = (float)(Math.max(O000000000O0O.getX(), O000000000O0O0.getX()) + 1 - var2.x);
            float var9 = (float)(var4 + 16 - var2.y);
            float var10 = (float)(Math.max(O000000000O0O.getZ(), O000000000O0O0.getZ()) + 1 - var2.z);
            float var11 = (float)(System.nanoTime() / 1.0E9);
            Immediate var12 = O0000O00O0O00.O00000000();

            try {
               VertexConsumer var13 = var12.getBuffer(O0000000OO0O00);
               VertexConsumer var14 = var12.getBuffer(O0000000OO0O0O);
               this.O00000000(var14, var3, var5, var6, var7, var8, var9, var10, var11);
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k) {
      float var9 = j - g;

      for (int var10 = 0; var10 < 18; var10++) {
         float var11 = var10 / 18.0F;
         float var12 = (var10 + 1) / 18.0F;
         float var13 = g + var9 * var11;
         float var14 = g + var9 * var12;
         int var15 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-2995201, -9822240, var11), (int)(120.0F * (1.0F - 0.7F * var11)));
         int var16 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-2995201, -9822240, var12), (int)(120.0F * (1.0F - 0.7F * var12)));
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
      float var10 = l * 1.4F;
      int var11 = O0000O000OO000.O00000000(-2995201, 200);
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
      return O000000000O0O;
   }

   @Generated
   public static void O00000000(BlockPos blockPos) {
      O000000000O0O = blockPos;
   }

   @Generated
   public static BlockPos O0000000000O0O() {
      return O000000000O0O0;
   }

   @Generated
   public static void O000000000(BlockPos blockPos) {
      O000000000O0O0 = blockPos;
   }

   static enum W84 {
      SHOOT,
      PLANT,
      CLEAR;
   }

   record W85(int height, List<BlockPos> flowers) {
   }

   static enum W86 {
      FARM,
      NAVIGATING,
      INTERACTING,
      WAITING_FOR_CONTAINER,
      DEPOSITING;
   }

   static final class W87 {
      final ChorusFarm.W84 O00000000;
      final BlockPos O000000000;
      final Direction O0000000000;

      W87(ChorusFarm.W84 o00000000, BlockPos blockPos, Direction direction) {
         this.O00000000 = o00000000;
         this.O000000000 = blockPos;
         this.O0000000000 = direction;
      }
   }
}
