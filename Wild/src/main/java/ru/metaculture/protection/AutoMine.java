package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.utils.BetterBlockPos;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoMine",
   O000000000 = "Полная автоматизация шахты",
   O0000000000 = Category.Misc
)
public class AutoMine extends Module {
   public final TextSetting O000000000O = new TextSetting("Анархия для сброса", "903");
   public final KeybindSetting O000000000O0 = new KeybindSetting("Бинд на сундук", -1);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Не отображать экран", false);
   private final TextSetting O000000000O000 = new TextSetting("AutoMineLayoutData", "").O00000000(() -> true);
   private final TextSetting O000000000O00O = new TextSetting("AutoMineDropChest", "").O00000000(() -> true);
   private final O0000O00O0000 O000000000O0O = new O0000O00O0000();
   private final O0000O00O0000 O000000000O0O0 = new O0000O00O0000();
   private final O0000O00O0000 O000000000O0OO = new O0000O00O0000();
   private final O0000O00O0000 O000000000OO = new O0000O00O0000();
   private final O0000O00O0000 O000000000OO0 = new O0000O00O0000();
   private final O0000O00O0000 O000000000OO00 = new O0000O00O0000();
   private int O000000000OO0O = 0;
   private final List<String> O000000000OOO = Arrays.asList(
      "405", "503", "504", "505", "304", "902", "901", "404", "402", "401", "903", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210"
   );
   private static final BlockPos O000000000OOO0 = new BlockPos(-55, 93, 30);
   private static final BlockPos O000000000OOOO = new BlockPos(-73, 84, 48);
   private static final double O00000000O = 4.0;
   private static final double O00000000O0 = 3.5;
   private static final int O00000000O00 = 2500;
   private static final int O00000000O000 = 2500;
   private AutoMine.W67 O00000000O0000 = AutoMine.W67.IDLE;
   private boolean O00000000O000O = false;
   private BlockPos O00000000O00O = null;
   private BlockPos O00000000O00O0 = null;
   private BlockPos O00000000O00OO = null;
   private BlockPos O00000000O0O = null;
   private BlockPos O00000000O0O0 = null;
   private boolean O00000000O0O00 = false;
   private double O00000000O0O0O = -1.0;
   private double O00000000O0OO = -1.0;
   private boolean O00000000O0OO0;
   private boolean O00000000O0OOO;
   private boolean O00000000OO;
   private boolean O00000000OO0;
   private List<Block> O00000000OO00 = List.of();
   private final Queue<Runnable> O00000000OO000 = new ArrayDeque<>();
   private final Map<Integer, AutoMine.W66> O00000000OO00O = new HashMap<>();
   private static final AutoMine.W66 O00000000OO0O = new AutoMine.W66("", 0);
   private GenericContainerScreen O00000000OO0O0;
   private static final int O00000000OO0OO = 1024;
   private static final RenderPipeline O00000000OOO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "automine_block_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000OOO0 = RenderLayer.of(
      "automine_block_box", 1024, false, true, O00000000OOO, MultiPhaseParameters.builder().build(false)
   );

   public AutoMine() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O});
   }

   @Override
   public void O00000000() {
      if (WildClient.O00000000.O000000000.O00000000(AttackAura.class).O0000000000000) {
         ChatUtil.O00000000("Отключите ауру для включения модуля");
         this.a_();
      } else {
         super.O00000000();
         if (O0000000000.options != null) {
            O0000000000.options.setPerspective(Perspective.FIRST_PERSON);
         }

         O000000O0O00O.O00000000 = true;
         this.O00000000O0000 = AutoMine.W67.IDLE;
         this.O00000000O000O = false;
         this.O00000000O00O = null;
         this.O00000000O00O0 = null;
         this.O00000000O00OO = null;
         this.O00000000O0O0 = null;
         this.O00000000O0O00 = false;
         this.O00000000O0O0O = -1.0;
         this.O00000000O0OO = -1.0;
         this.O00000000OO000.clear();
         this.O000000000OO0O();
         this.O00000000O00();
         this.O00000000O0OO0 = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
         this.O00000000O0OOO = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
         this.O00000000OO = (Boolean)BaritoneAPI.getSettings().legitMine.value;
         this.O00000000OO0 = (Boolean)BaritoneAPI.getSettings().walkWhileBreaking.value;
         List var1 = (List)BaritoneAPI.getSettings().blocksToAvoidBreaking.value;
         this.O00000000OO00 = (List<Block>)(Object)(var1 == null ? List.of() : new ArrayList<>(var1));
         BaritoneAPI.getSettings().allowPlace.value = false;
         BaritoneAPI.getSettings().allowBreak.value = true;
         BaritoneAPI.getSettings().legitMine.value = false;
         BaritoneAPI.getSettings().walkWhileBreaking.value = false;
         List var2 = Arrays.asList(
            Blocks.SPRUCE_LOG,
            Blocks.SPRUCE_WOOD,
            Blocks.SPRUCE_PLANKS,
            Blocks.STRIPPED_SPRUCE_LOG,
            Blocks.STRIPPED_SPRUCE_WOOD,
            Blocks.OAK_LOG,
            Blocks.OAK_WOOD,
            Blocks.OAK_PLANKS,
            Blocks.DIRT,
            Blocks.GRASS_BLOCK,
            Blocks.COARSE_DIRT,
            Blocks.PODZOL,
            Blocks.STONE_BRICKS,
            Blocks.CRACKED_STONE_BRICKS,
            Blocks.MOSSY_STONE_BRICKS,
            Blocks.LADDER,
            Blocks.BEDROCK,
            Blocks.BARREL,
            Blocks.CHEST,
            Blocks.TRAPPED_CHEST
         );
         List var3 = (List)BaritoneAPI.getSettings().blocksToAvoidBreaking.value;
         if (var3 != null) {
            for (Block var5 : (List<Block>)var2) {
               if (!var3.contains(var5)) {
                  var3.add(var5);
               }
            }
         }

         if (O0000000000.player != null && O0000000000.world != null) {
            if (this.O000000000O0OO()) {
               this.O000000000O00();
            } else if (this.O000000000OOO0()) {
               this.O0000000000O00();
            } else if (this.O000000000OOO()) {
               this.O0000000000O0O();
            } else {
               O0000000000.player.networkHandler.sendChatCommand("warp mine");
               this.O00000000O0000 = AutoMine.W67.WAITING_FOR_TP;
               this.O000000000O0O.O00000000();
            }
         }
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      if (O0000000000.options != null) {
         O0000000000.options.setPerspective(Perspective.FIRST_PERSON);
         if (this.O00000000O0O00) {
            O0000000000.options.sneakKey.setPressed(false);
            this.O00000000O0O00 = false;
         }
      }

      O000000O0O00O.O00000000 = false;
      this.O0000000000OOO();
      this.O00000000OO000.clear();
      BaritoneAPI.getSettings().allowPlace.value = this.O00000000O0OO0;
      BaritoneAPI.getSettings().allowBreak.value = this.O00000000O0OOO;
      BaritoneAPI.getSettings().legitMine.value = this.O00000000OO;
      BaritoneAPI.getSettings().walkWhileBreaking.value = this.O00000000OO0;
      List var1 = (List)BaritoneAPI.getSettings().blocksToAvoidBreaking.value;
      if (var1 != null) {
         var1.clear();
         var1.addAll(this.O00000000OO00);
      }

      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (this.O00000000O000O) {
         var2.getCommandManager().execute("resume");
         this.O00000000O000O = false;
      }

      var2.getCommandManager().execute("stop");
      var2.getSelectionManager().removeAllSelections();
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      this.O00000000OO0O0 = null;
   }

   @EventHandler
   public void O00000000(O0000000O00OO o0000000O00OO) {
      if (this.O000000000O00.O0000000000() && o0000000O00OO.O0000000000() instanceof GenericContainerScreen var2) {
         if (this.O00000000O0000 == AutoMine.W67.OPENING_DROP_CHEST
            || this.O00000000O0000 == AutoMine.W67.WAITING_FOR_DROP_GUI
            || this.O00000000O0000 == AutoMine.W67.DROPPING) {
            this.O00000000OO0O0 = var2;
            o0000000O00OO.O00000000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         boolean var3 = PlayerHelper.O0000000000O0();
         if (var3) {
            if (!this.O00000000O000O) {
               var2.getCommandManager().execute("pause");
               this.O00000000O000O = true;
               this.O0000000000OOO();
            }
         } else {
            if (this.O00000000O000O) {
               var2.getCommandManager().execute("resume");
               this.O00000000O000O = false;
            }

            if (this.O00000000O0000 == AutoMine.W67.MINING && this.O00000000O00O != null) {
               if (O0000000000.player.isClimbing() && O0000000000.options.attackKey.isPressed()) {
                  O0000000000.options.sneakKey.setPressed(true);
                  this.O00000000O0O00 = true;
               } else if (this.O00000000O0O00) {
                  O0000000000.options.sneakKey.setPressed(false);
                  this.O00000000O0O00 = false;
               }
            } else if (this.O00000000O0O00) {
               O0000000000.options.sneakKey.setPressed(false);
               this.O00000000O0O00 = false;
            }

            if (!this.O000000000O0OO() || this.O00000000O0000 != AutoMine.W67.MINING && this.O00000000O0000 != AutoMine.W67.GOING_TO_MINE) {
               GenericContainerScreen var4 = this.O00000000O0000();
               if (this.O00000000O0000 == AutoMine.W67.DROPPING && var4 != null) {
                  this.O00000000((GenericContainerScreenHandler)var4.getScreenHandler());
               } else {
                  switch (this.O00000000O0000) {
                     case WAITING_FOR_TP:
                        if (this.O000000000O0O.O000000000000(5500L)) {
                           this.O0000000000O0O();
                        }
                        break;
                     case GOING_TO_MINE:
                        this.O00000000(var2);
                        break;
                     case MINING:
                        this.O0000000000OO0();
                        if (this.O00000000O00O == null || this.O00000000000(this.O00000000O00O)) {
                           this.O0000000000OO();
                        }

                        if (this.O000000000O0O.O000000000000(2000L)) {
                           if (!this.O000000000OOOO()) {
                              var2.getCommandManager().execute("stop");
                              this.O000000000O0();
                           }

                           this.O000000000O0O.O00000000();
                        }
                        break;
                     case TELEPORTING_TO_DROP:
                        if (this.O000000000O0O.O000000000000(6000L)) {
                           this.O000000000O000();
                        }
                        break;
                     case GOING_TO_DROP_CHEST:
                        this.O000000000(var2);
                        break;
                     case ROTATING_DROP_CHEST:
                        this.O000000000O00O();
                        break;
                     case OPENING_DROP_CHEST:
                        this.O000000000O0O();
                        break;
                     case WAITING_FOR_DROP_GUI:
                        if (this.O00000000O0000() != null) {
                           this.O00000000O0000 = AutoMine.W67.DROPPING;
                           this.O000000000O0O0.O00000000();
                        } else if (this.O000000000OO.O000000000000(3000L)) {
                           this.O00000000O0000 = AutoMine.W67.OPENING_DROP_CHEST;
                           this.O000000000OO.O00000000();
                        }
                     case DROPPING:
                     default:
                        break;
                     case CHANGING_ANARCHY:
                        if (this.O000000000O0O.O000000000000(2000L)) {
                           if (this.O000000000OOO0()) {
                              this.O0000000000O00();
                           } else if (this.O000000000OOO()) {
                              this.O0000000000O0O();
                           } else {
                              O0000000000.player.networkHandler.sendChatCommand("warp mine");
                              this.O00000000O0000 = AutoMine.W67.WAITING_FOR_TP;
                              this.O000000000O0O.O00000000();
                           }
                        }
                  }
               }
            } else {
               var2.getCommandManager().execute("stop");
               this.O000000000O00();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString();
         if ((var4.contains("Телепорт") || var4.contains("teleport") || var4.contains("Teleport"))
            && (
               this.O00000000O0000 == AutoMine.W67.WAITING_FOR_TP
                  || this.O00000000O0000 == AutoMine.W67.TELEPORTING_TO_DROP
                  || this.O00000000O0000 == AutoMine.W67.CHANGING_ANARCHY
            )) {
            this.O000000000O0O.O00000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (this.O000000000O0.O0000000000() != -1 && o0000000O0O0.O00000000000() == this.O000000000O0.O0000000000()) {
            if (O0000000000.crosshairTarget instanceof BlockHitResult var2) {
               BlockPos var4 = var2.getBlockPos();
               if (this.O00000000000O(var4)) {
                  this.O00000000000O0(var4);
                  ChatUtil.O00000000("§8[§6AutoMine§8] §aСундук для сброса установлен: " + var4.toShortString());
               } else {
                  ChatUtil.O00000000("§8[§6AutoMine§8] §cСмотрите на сундук, бочку или шалкер.");
               }
            }
         }
      }
   }

   private void O0000000000O00() {
      if (this.O000000000OOOO()) {
         this.O00000000O0000 = AutoMine.W67.MINING;
         this.O000000000O0O.O00000000();
         this.O0000000000OO();
      } else {
         this.O000000000O0();
      }
   }

   private void O0000000000O0O() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.O0000000000OOO();
      var1.getSelectionManager().removeAllSelections();
      var1.getCommandManager().execute("stop");
      this.O00000000O00OO = this.O00000000O();
      if (this.O00000000O00OO == null) {
         this.O00000000O00OO = this.O00000000O000O();
      }

      this.O00000000O0000 = AutoMine.W67.GOING_TO_MINE;
      this.O00000000O0O0O = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O00OO));
      this.O000000000O0O.O00000000();
      this.O000000000OO0.O00000000();
      this.O000000000OO00.O00000000();
      var1.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000O00OO, 2));
   }

   private void O00000000(IBaritone iBaritone) {
      if (this.O000000000OOO0()) {
         iBaritone.getPathingBehavior().cancelEverything();
         this.O00000000O00OO = null;
         this.O0000000000O00();
      } else {
         if (this.O00000000O00OO == null || this.O000000000OO0.O000000000000(10000L)) {
            this.O00000000O00OO = this.O00000000O();
            if (this.O00000000O00OO == null) {
               this.O00000000O00OO = this.O00000000O000O();
            }
         }

         double var2 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O00OO));
         if (this.O00000000O0O0O < 0.0 || var2 < this.O00000000O0O0O - 1.0) {
            this.O00000000O0O0O = var2;
            this.O000000000OO00.O00000000();
         }

         if (!iBaritone.getCustomGoalProcess().isActive() || this.O000000000OO0.O000000000000(2500L)) {
            iBaritone.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000O00OO, 2));
            this.O000000000OO0.O00000000();
         }

         if (this.O000000000OO00.O000000000000(45000L)) {
            iBaritone.getPathingBehavior().cancelEverything();
            this.O000000000O0();
         }
      }
   }

   private void O0000000000OO() {
      BlockPos var1 = this.O000000000O();
      if (var1 != null) {
         this.O00000000O00O = var1;
         this.O00000000O00O0 = null;
         this.O0000000000OOO();
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         var2.getCommandManager().execute("stop");
         var2.getSelectionManager().removeAllSelections();
         var2.getSelectionManager().addSelection(new BetterBlockPos(var1), new BetterBlockPos(var1));
         var2.getCommandManager().execute("sel cleararea");
      } else {
         this.O00000000O00O = null;
         this.O00000000O00O0 = null;
         this.O0000000000OOO();
      }
   }

   private void O0000000000OO0() {
      if (this.O00000000O00O != null && O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (!this.O00000000000(this.O00000000O00O)
            && !(O0000000000.player.squaredDistanceTo(this.O00000000O00O.getX() + 0.5, this.O00000000O00O.getY() + 0.5, this.O00000000O00O.getZ() + 0.5) > 36.0)
            )
          {
            O000000O0O00OO var1 = this.O00000000(Vec3d.ofCenter(this.O00000000O00O));
            O000000O0O0O0.O00000000(var1, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
            if (new O000000O0O00OO(O0000000000.player).O00000000(var1) > 6.0F) {
               if (O0000000000.options != null) {
                  O0000000000.options.attackKey.setPressed(false);
               }
            } else {
               BlockHitResult var2 = this.O00000000(this.O00000000O00O);
               if (var2 == null) {
                  this.O0000000000OOO();
               } else {
                  O0000000000.options.attackKey.setPressed(true);
                  if (!this.O00000000O00O.equals(this.O00000000O00O0)) {
                     O0000000000.interactionManager.attackBlock(this.O00000000O00O, var2.getSide());
                     this.O00000000O00O0 = this.O00000000O00O;
                     this.O000000000O0OO.O00000000();
                  } else if (this.O000000000O0OO.O000000000000(45L)) {
                     O0000000000.interactionManager.updateBlockBreakingProgress(this.O00000000O00O, var2.getSide());
                     O0000000000.player.swingHand(Hand.MAIN_HAND);
                     this.O000000000O0OO.O00000000();
                  }
               }
            }
         } else {
            this.O0000000000OOO();
         }
      } else {
         this.O0000000000OOO();
      }
   }

   private BlockHitResult O00000000(BlockPos blockPos) {
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

      return this.O000000000(blockPos) ? new BlockHitResult(Vec3d.ofCenter(blockPos), this.O0000000000(blockPos), blockPos, false) : null;
   }

   private boolean O000000000(BlockPos blockPos) {
      for (Direction var5 : Direction.values()) {
         if (this.O00000000000(blockPos.offset(var5))) {
            return true;
         }
      }

      return false;
   }

   private Direction O0000000000(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos().subtract(Vec3d.ofCenter(blockPos));
      double var3 = Math.abs(var2.x);
      double var5 = Math.abs(var2.y);
      double var7 = Math.abs(var2.z);
      if (var5 >= var3 && var5 >= var7) {
         return var2.y > 0.0 ? Direction.UP : Direction.DOWN;
      } else if (var3 >= var7) {
         return var2.x > 0.0 ? Direction.EAST : Direction.WEST;
      } else {
         return var2.z > 0.0 ? Direction.SOUTH : Direction.NORTH;
      }
   }

   private void O0000000000OOO() {
      if (O0000000000.options != null) {
         O0000000000.options.attackKey.setPressed(false);
      }

      this.O00000000O00O0 = null;
   }

   private BlockPos O000000000O() {
      int var1 = this.O00000000O00O();
      int var2 = this.O00000000O00O0();
      int var3 = this.O00000000O00OO();
      int var4 = this.O00000000O0O();
      int var5 = this.O00000000O0O0();
      int var6 = this.O00000000O0O00();

      for (int var7 = var4; var7 >= var3; var7--) {
         BlockPos var8 = null;

         for (int var9 = var1; var9 <= var2; var9++) {
            for (int var10 = var5; var10 <= var6; var10++) {
               BlockPos var11 = new BlockPos(var9, var7, var10);
               Block var12 = O0000000000.world.getBlockState(var11).getBlock();
               if ((var12 == Blocks.DIAMOND_ORE || var12 == Blocks.DEEPSLATE_DIAMOND_ORE)
                  && (var8 == null || O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(var11)) < O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(var8)))
                  )
                {
                  var8 = var11;
               }
            }
         }

         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   private boolean O00000000000(BlockPos blockPos) {
      Block var2 = O0000000000.world.getBlockState(blockPos).getBlock();
      return var2 == Blocks.AIR || var2 == Blocks.CAVE_AIR || var2 == Blocks.VOID_AIR;
   }

   private void O000000000O0() {
      if (this.O000000000OO0O >= this.O000000000OOO.size()) {
         this.O000000000OO0O = 0;
      }

      String var1 = this.O00000000O000();
      String var2 = this.O000000000OOO.get(this.O000000000OO0O);
      if (var1 != null && var2.equals(var1)) {
         this.O000000000OO0O++;
         if (this.O000000000OO0O >= this.O000000000OOO.size()) {
            this.O000000000OO0O = 0;
         }

         var2 = this.O000000000OOO.get(this.O000000000OO0O);
      }

      O0000000000.player.networkHandler.sendChatCommand("an" + var2);
      this.O000000000OO0O++;
      this.O00000000O0000 = AutoMine.W67.CHANGING_ANARCHY;
      this.O000000000O0O.O00000000();
   }

   private boolean O000000000O00() {
      String var1 = this.O00000000O000();
      if (var1 == null) {
         this.O00000000("Укажите анархию для сброса.");
         return false;
      } else if (this.O00000000O0O == null) {
         this.O00000000("Установите сундук для сброса через бинд.");
         return false;
      } else {
         this.O0000000000OOO();
         this.O00000000OO000.clear();
         O0000000000.player.networkHandler.sendChatCommand("an" + var1);
         this.O00000000O0000 = AutoMine.W67.TELEPORTING_TO_DROP;
         this.O000000000O0O.O00000000();
         return true;
      }
   }

   private void O000000000O000() {
      if (this.O00000000O0O == null) {
         this.O00000000("Сундук для сброса не установлен.");
      } else {
         this.O0000000000OOO();
         this.O00000000OO000.clear();
         IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
         var1.getSelectionManager().removeAllSelections();
         var1.getCommandManager().execute("stop");
         this.O00000000O0O0 = this.O000000000000(this.O00000000O0O);
         this.O00000000O0000 = AutoMine.W67.GOING_TO_DROP_CHEST;
         this.O00000000O0OO = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O));
         this.O000000000OO.O00000000();
         this.O000000000OO0.O00000000();
         this.O000000000OO00.O00000000();
      }
   }

   private void O000000000(IBaritone iBaritone) {
      if (this.O00000000O0O == null) {
         this.O00000000("Сундук для сброса не установлен.");
      } else {
         double var2 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O));
         if (var2 <= 3.5 && this.O000000000000O(this.O00000000O0O)) {
            iBaritone.getPathingBehavior().cancelEverything();
            this.O00000000O0000 = AutoMine.W67.ROTATING_DROP_CHEST;
            this.O000000000OO.O00000000();
         } else {
            if (this.O00000000O0O0 == null || this.O000000000OO0.O000000000000(10000L)) {
               this.O00000000O0O0 = this.O000000000000(this.O00000000O0O);
            }

            BlockPos var4 = this.O00000000O0O0 == null ? this.O00000000O0O : this.O00000000O0O0;
            int var5 = this.O00000000O0O0 == null ? 3 : 1;
            if (!iBaritone.getCustomGoalProcess().isActive() || this.O000000000OO0.O000000000000(2500L)) {
               iBaritone.getCustomGoalProcess().setGoalAndPath(new GoalNear(var4, var5));
               this.O000000000OO0.O00000000();
            }

            if (this.O00000000O0OO < 0.0 || var2 < this.O00000000O0OO - 1.0) {
               this.O00000000O0OO = var2;
               this.O000000000OO00.O00000000();
            }

            if (this.O000000000OO00.O000000000000(45000L)) {
               this.O00000000("Не удалось дойти до сундука для сброса.");
            }
         }
      }
   }

   private void O000000000O00O() {
      if (this.O00000000O0O != null && O0000000000.player != null) {
         O000000O0O00OO var1 = this.O00000000(Vec3d.ofCenter(this.O00000000O0O));
         O000000O0O0O0.O00000000(var1, 35.0F, 35.0F, 35.0F, 35.0F, 20, 1, false);
         if (new O000000O0O00OO(O0000000000.player).O00000000(var1) < 5.0F && this.O000000000OO.O000000000000(150L)) {
            O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
            this.O00000000O0000 = AutoMine.W67.OPENING_DROP_CHEST;
            this.O000000000OO.O00000000();
         }
      } else {
         this.O00000000("Сундук для сброса потерян.");
      }
   }

   private void O000000000O0O() {
      if (this.O00000000O0O != null && O0000000000.interactionManager != null) {
         this.O00000000O0();
         if (this.O000000000OO.O000000000000(150L)) {
            BlockHitResult var1 = new BlockHitResult(Vec3d.ofCenter(this.O00000000O0O), Direction.UP, this.O00000000O0O, false);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var1);
            this.O00000000O0000 = AutoMine.W67.WAITING_FOR_DROP_GUI;
            this.O000000000OO.O00000000();
         }
      } else {
         this.O00000000("Сундук для сброса потерян.");
      }
   }

   private void O00000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (!this.O00000000OO000.isEmpty()) {
            if (this.O000000000O0O0.O000000000000(50L)) {
               this.O00000000OO000.poll().run();
               this.O000000000O0O0.O00000000();
            }
         } else {
            int var2 = genericContainerScreenHandler.slots.size() - 36;
            if (var2 <= 0) {
               this.O00000000("Открыт не контейнер для сброса.");
            } else if (this.O000000000OO0()) {
               this.O00000000(genericContainerScreenHandler, var2);
            } else {
               this.O000000000(genericContainerScreenHandler, var2);
            }
         }
      }
   }

   private void O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      for (int var3 = i; var3 < genericContainerScreenHandler.slots.size(); var3++) {
         Slot var4 = (Slot)genericContainerScreenHandler.slots.get(var3);
         int var5 = this.O00000000(var3, i);
         AutoMine.W66 var6 = this.O00000000OO00O.getOrDefault(var5, O00000000OO0O);
         if (!var4.hasStack()) {
            if (var6.count > 0) {
               if (!this.O00000000(genericContainerScreenHandler, i, var6, var3, 0)) {
                  this.O00000000("В сундуке нет предметов для восстановления раскладки.");
               }

               return;
            }
         } else {
            ItemStack var7 = var4.getStack();
            boolean var8 = var6.matches(var7);
            if (var6.count <= 0 || !var8) {
               if (!this.O00000000(genericContainerScreenHandler, i, var7)) {
                  this.O00000000("Сундук для сброса заполнен.");
                  return;
               } else {
                  int var11 = var3;
                  int var12 = genericContainerScreenHandler.syncId;
                  this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(var12, var11, 0, SlotActionType.QUICK_MOVE, O0000000000.player));
                  return;
               }
            }

            if (var7.getCount() > var6.count) {
               int var9 = var7.getCount() - var6.count;
               int var10 = this.O00000000(genericContainerScreenHandler, i, var7, var9);
               if (var10 == -1) {
                  this.O00000000("Сундук для сброса заполнен.");
                  return;
               }

               this.O00000000(genericContainerScreenHandler.syncId, var3, var10, var6.count, var9);
               return;
            }

            if (var7.getCount() < var6.count) {
               if (!this.O00000000(genericContainerScreenHandler, i, var6, var3, var7.getCount())) {
                  this.O00000000("В сундуке нет предметов для восстановления раскладки.");
               }

               return;
            }
         }
      }

      this.O000000000O0O0();
   }

   private void O000000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      for (int var3 = i; var3 < genericContainerScreenHandler.slots.size(); var3++) {
         Slot var4 = (Slot)genericContainerScreenHandler.slots.get(var3);
         if (var4.hasStack()) {
            ItemStack var5 = var4.getStack();
            int var6 = this.O00000000(var3, i);
            int var7 = this.O00000000(var6, var5);
            int var8 = var5.getCount() - var7;
            if (var8 > 0) {
               if (var7 <= 0) {
                  if (!this.O00000000(genericContainerScreenHandler, i, var5)) {
                     this.O00000000("Сундук для сброса заполнен.");
                     return;
                  }

                  int var11 = var3;
                  int var10 = genericContainerScreenHandler.syncId;
                  this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(var10, var11, 0, SlotActionType.QUICK_MOVE, O0000000000.player));
                  return;
               }

               int var9 = this.O00000000(genericContainerScreenHandler, i, var5, var8);
               if (var9 == -1) {
                  this.O00000000("Сундук для сброса заполнен.");
                  return;
               }

               this.O00000000(genericContainerScreenHandler.syncId, var3, var9, var7, var8);
               return;
            }
         }
      }

      this.O000000000O0O0();
   }

   private void O00000000(int i, int j, int k, int l, int m) {
      this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, j, 0, SlotActionType.PICKUP, O0000000000.player));
      if (l <= m) {
         for (int var6 = 0; var6 < l; var6++) {
            this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, j, 1, SlotActionType.PICKUP, O0000000000.player));
         }

         this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, k, 0, SlotActionType.PICKUP, O0000000000.player));
      } else {
         for (int var7 = 0; var7 < m; var7++) {
            this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, k, 1, SlotActionType.PICKUP, O0000000000.player));
         }

         this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, j, 0, SlotActionType.PICKUP, O0000000000.player));
      }
   }

   private boolean O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, AutoMine.W66 o00000000, int j, int k) {
      int var6 = o00000000.count - k;
      if (var6 <= 0) {
         return true;
      } else {
         int var7 = this.O00000000(genericContainerScreenHandler, i, o00000000);
         if (var7 == -1) {
            return false;
         } else {
            int var8 = ((Slot)genericContainerScreenHandler.slots.get(var7)).getStack().getCount();
            int var9 = Math.min(var6, var8);
            this.O000000000(genericContainerScreenHandler.syncId, var7, j, var8, var9);
            return true;
         }
      }
   }

   private void O000000000(int i, int j, int k, int l, int m) {
      this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, j, 0, SlotActionType.PICKUP, O0000000000.player));
      if (m >= l) {
         this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, k, 0, SlotActionType.PICKUP, O0000000000.player));
      } else if (m <= l / 2) {
         for (int var6 = 0; var6 < m; var6++) {
            this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, k, 1, SlotActionType.PICKUP, O0000000000.player));
         }

         this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, j, 0, SlotActionType.PICKUP, O0000000000.player));
      } else {
         int var8 = l - m;

         for (int var7 = 0; var7 < var8; var7++) {
            this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, j, 1, SlotActionType.PICKUP, O0000000000.player));
         }

         this.O00000000OO000.add(() -> O0000000000.interactionManager.clickSlot(i, k, 0, SlotActionType.PICKUP, O0000000000.player));
      }
   }

   private int O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, AutoMine.W66 o00000000) {
      for (int var4 = 0; var4 < i; var4++) {
         Slot var5 = (Slot)genericContainerScreenHandler.slots.get(var4);
         if (var5.hasStack() && o00000000.matches(var5.getStack())) {
            return var4;
         }
      }

      return -1;
   }

   private void O000000000O0O0() {
      this.O00000000OO000.clear();
      this.O00000000OO0O0 = null;
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }

      this.O00000000O0000 = AutoMine.W67.IDLE;
      this.O00000000O0O0 = null;
      this.O000000000O0();
   }

   private boolean O000000000O0OO() {
      return O0000000000.player.getInventory().getEmptySlot() != -1 ? false : this.O000000000OO();
   }

   private boolean O000000000OO() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (!var2.isEmpty() && var2.getCount() > this.O00000000(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   private int O00000000(int i, ItemStack itemStack) {
      AutoMine.W66 var3 = this.O00000000OO00O.get(i);
      if (var3 != null) {
         return var3.matches(itemStack) ? Math.min(var3.count, itemStack.getCount()) : 0;
      } else {
         return 1;
      }
   }

   private int O00000000(int i, int j) {
      int var3 = i - j;
      return var3 >= 27 ? var3 - 27 : var3 + 9;
   }

   private int O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, ItemStack itemStack, int j) {
      int var5 = -1;

      for (int var6 = 0; var6 < i; var6++) {
         Slot var7 = (Slot)genericContainerScreenHandler.slots.get(var6);
         if (!var7.hasStack()) {
            if (var5 == -1) {
               var5 = var6;
            }
         } else {
            ItemStack var8 = var7.getStack();
            if (this.O00000000(itemStack, var8) && var8.getCount() + j <= var8.getMaxCount()) {
               return var6;
            }
         }
      }

      return var5;
   }

   private boolean O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, ItemStack itemStack) {
      for (int var4 = 0; var4 < i; var4++) {
         Slot var5 = (Slot)genericContainerScreenHandler.slots.get(var4);
         if (!var5.hasStack()) {
            return true;
         }

         ItemStack var6 = var5.getStack();
         if (this.O00000000(itemStack, var6) && var6.getCount() < var6.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(ItemStack itemStack, ItemStack itemStack2) {
      return ItemStack.areItemsAndComponentsEqual(itemStack, itemStack2);
   }

   public void O0000000000O0() {
      this.O000000000OO00();
   }

   private boolean O000000000OO0() {
      return this.O00000000OO00O.size() >= 36;
   }

   private void O000000000OO00() {
      if (O0000000000.player == null) {
         ChatUtil.O00000000("§8[§6AutoMine§8] §cИгрок не загружен.");
      } else {
         this.O00000000OO00O.clear();
         StringBuilder var1 = new StringBuilder();
         Encoder var2 = Base64.getEncoder();

         for (int var3 = 0; var3 < 36; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            String var5 = var4.isEmpty() ? "" : this.O00000000(var4);
            int var6 = var4.isEmpty() ? 0 : var4.getCount();
            this.O00000000OO00O.put(var3, new AutoMine.W66(var5, var6));
            if (var3 > 0) {
               var1.append(';');
            }

            var1.append(var6).append(',').append(var2.encodeToString(var5.getBytes(StandardCharsets.UTF_8)));
         }

         this.O000000000O000.O000000000(var1.toString());
         if (WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O0000000000();
         }

         ChatUtil.O00000000("§8[§6AutoMine§8] §aРаскладка инвентаря сохранена.");
      }
   }

   private void O000000000OO0O() {
      this.O00000000OO00O.clear();
      String var1 = this.O000000000O000.O0000000000();
      if (var1 != null && !var1.isBlank()) {
         String[] var2 = var1.split(";", -1);
         Decoder var3 = Base64.getDecoder();

         for (int var4 = 0; var4 < Math.min(36, var2.length); var4++) {
            String[] var5 = var2[var4].split(",", 2);
            if (var5.length == 2) {
               try {
                  int var6 = Integer.parseInt(var5[0]);
                  String var7 = new String(var3.decode(var5[1]), StandardCharsets.UTF_8);
                  this.O00000000OO00O.put(var4, new AutoMine.W66(var7, var6));
               } catch (IllegalArgumentException var8) {
               }
            }
         }
      }
   }

   private String O00000000(ItemStack itemStack) {
      return itemStack.getItem().toString() + "|" + itemStack.getName().getString();
   }

   private boolean O000000000OOO() {
      if (O0000000000.player == null) {
         return false;
      } else {
         double var1 = O0000000000.player.getX() - O000000000OOO0.getX();
         double var3 = O0000000000.player.getZ() - O000000000OOO0.getZ();
         return Math.sqrt(var1 * var1 + var3 * var3) < 300.0;
      }
   }

   private boolean O000000000OOO0() {
      if (O0000000000.player == null) {
         return false;
      } else {
         BlockPos var1 = O0000000000.player.getBlockPos();
         return var1.getX() >= this.O00000000O00O() - 4.0
            && var1.getX() <= this.O00000000O00O0() + 4.0
            && var1.getY() >= this.O00000000O00OO() - 6
            && var1.getY() <= this.O00000000O0O() + 8
            && var1.getZ() >= this.O00000000O0O0() - 4.0
            && var1.getZ() <= this.O00000000O0O00() + 4.0;
      }
   }

   private boolean O000000000OOOO() {
      return this.O000000000O() != null;
   }

   private BlockPos O00000000O() {
      if (O0000000000.world != null && O0000000000.player != null) {
         ArrayList var1 = new ArrayList();

         for (int var2 = this.O00000000O00OO() - 2; var2 <= this.O00000000O0O() + 2; var2++) {
            for (int var3 = this.O00000000O00O() - 3; var3 <= this.O00000000O00O0() + 3; var3++) {
               for (int var4 = this.O00000000O0O0() - 3; var4 <= this.O00000000O0O00() + 3; var4++) {
                  BlockPos var5 = new BlockPos(var3, var2, var4);
                  if (this.O0000000000000(var5)) {
                     var1.add(var5);
                  }
               }
            }
         }

         BlockPos var6 = this.O00000000O000O();
         return (BlockPos)var1.stream()
            .min(
               Comparator.<BlockPos>comparingDouble(blockPos2 -> Vec3d.ofCenter(blockPos2).squaredDistanceTo(Vec3d.ofCenter(var6)))
                  .thenComparingDouble(blockPos -> O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(blockPos)))
            )
            .orElse(var6);
      } else {
         return null;
      }
   }

   private BlockPos O000000000000(BlockPos blockPos) {
      if (O0000000000.world != null && O0000000000.player != null && blockPos != null) {
         ArrayList var2 = new ArrayList();

         for (int var3 = -1; var3 <= 1; var3++) {
            for (int var4 = 1; var4 <= 3; var4++) {
               for (int var5 = -var4; var5 <= var4; var5++) {
                  for (int var6 = -var4; var6 <= var4; var6++) {
                     if (Math.max(Math.abs(var5), Math.abs(var6)) == var4) {
                        var2.add(blockPos.add(var5, var3, var6));
                     }
                  }
               }
            }
         }

         var2.sort(Comparator.<BlockPos>comparingDouble(blockPosx -> O0000000000.player.getPos().squaredDistanceTo(Vec3d.ofCenter(blockPosx))));
         BlockPos var7 = null;

         for (BlockPos var9 : (List<BlockPos>)var2) {
            if (this.O0000000000000(var9)) {
               if (this.O00000000(var9, blockPos)) {
                  return var9;
               }

               if (var7 == null) {
                  var7 = var9;
               }
            }
         }

         return var7;
      } else {
         return null;
      }
   }

   private boolean O0000000000000(BlockPos blockPos) {
      if (O0000000000.world == null) {
         return false;
      } else {
         BlockState var2 = O0000000000.world.getBlockState(blockPos);
         BlockState var3 = O0000000000.world.getBlockState(blockPos.up());
         BlockState var4 = O0000000000.world.getBlockState(blockPos.down());
         return var2.getCollisionShape(O0000000000.world, blockPos).isEmpty()
            && var3.getCollisionShape(O0000000000.world, blockPos.up()).isEmpty()
            && !var4.getCollisionShape(O0000000000.world, blockPos.down()).isEmpty();
      }
   }

   private boolean O00000000(BlockPos blockPos, BlockPos blockPos2) {
      Vec3d var3 = Vec3d.ofCenter(blockPos).add(0.0, 1.2, 0.0);
      Vec3d var4 = Vec3d.ofCenter(blockPos2);
      BlockHitResult var5 = O0000000000.world.raycast(new RaycastContext(var3, var4, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var5.getType() == Type.MISS || var5.getBlockPos().equals(blockPos2);
   }

   private boolean O000000000000O(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      Vec3d var3 = Vec3d.ofCenter(blockPos);
      BlockHitResult var4 = O0000000000.world.raycast(new RaycastContext(var2, var3, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var4.getType() == Type.MISS || var4.getBlockPos().equals(blockPos);
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      if (O0000000000.player == null) {
         return new O000000O0O00OO(0.0F, 0.0F);
      } else {
         Vec3d var2 = O0000000000.player.getEyePos();
         double var3 = vec3d.x - var2.x;
         double var5 = vec3d.y - var2.y;
         double var7 = vec3d.z - var2.z;
         float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
         float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
         return new O000000O0O00OO(var9, var10);
      }
   }

   private void O00000000O0() {
      int var1 = O0000000000.player.getInventory().getSelectedSlot();
      ItemStack var2 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var1);
      if (var2.getItem() == Items.TRIPWIRE_HOOK || var2.getName().getString().contains("[★]")) {
         for (int var3 = 0; var3 < 9; var3++) {
            ItemStack var4 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var3);
            if (var4.isEmpty() || var4.getItem() != Items.TRIPWIRE_HOOK && !var4.getName().getString().contains("[★]")) {
               O0000000000.player.getInventory().setSelectedSlot(var3);
               this.O000000000OO.O00000000();
               break;
            }
         }
      }
   }

   private boolean O00000000000O(BlockPos blockPos) {
      return O0000000000.world != null && blockPos != null
         ? O0000000000.world.getBlockEntity(blockPos) instanceof ChestBlockEntity
            || O0000000000.world.getBlockEntity(blockPos) instanceof BarrelBlockEntity
            || O0000000000.world.getBlockEntity(blockPos) instanceof ShulkerBoxBlockEntity
         : false;
   }

   private void O00000000000O0(BlockPos blockPos) {
      this.O00000000O0O = blockPos.toImmutable();
      this.O00000000O0O0 = this.O000000000000(this.O00000000O0O);
      this.O000000000O00O.O000000000(blockPos.getX() + "," + blockPos.getY() + "," + blockPos.getZ());
      if (WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   private void O00000000O00() {
      String var1 = this.O000000000O00O.O0000000000();
      if (var1 != null && !var1.isBlank()) {
         String[] var2 = var1.split(",");
         if (var2.length == 3) {
            try {
               this.O00000000O0O = new BlockPos(Integer.parseInt(var2[0]), Integer.parseInt(var2[1]), Integer.parseInt(var2[2]));
            } catch (NumberFormatException var4) {
               this.O00000000O0O = null;
            }
         }
      }
   }

   private String O00000000O000() {
      String var1 = this.O000000000O.O0000000000();
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.trim()
            .toLowerCase()
            .replace("/", "")
            .replace("anarchy", "")
            .replace("анархия", "")
            .replace("an", "")
            .replace("аn", "")
            .replace(" ", "");
         return var2.isBlank() ? null : var2;
      }
   }

   private void O00000000(String string) {
      ChatUtil.O00000000("§8[§6AutoMine§8] §c" + string);
      this.O00000000OO000.clear();
      this.O00000000OO0O0 = null;
      this.O0000000000OOO();
      this.O00000000O0000 = AutoMine.W67.IDLE;
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }

      if (this.O0000000000000) {
         this.a_();
      }
   }

   private GenericContainerScreen O00000000O0000() {
      GenericContainerScreen var1 = ScreenUtil.O00000000(O0000000000, this.O00000000OO0O0, GenericContainerScreen.class);
      if (var1 == null) {
         this.O00000000OO0O0 = null;
      }

      return var1;
   }

   private BlockPos O00000000O000O() {
      return new BlockPos((this.O00000000O00O() + this.O00000000O00O0()) / 2, this.O00000000O00OO(), (this.O00000000O0O0() + this.O00000000O0O00()) / 2);
   }

   private int O00000000O00O() {
      return Math.min(O000000000OOO0.getX(), O000000000OOOO.getX());
   }

   private int O00000000O00O0() {
      return Math.max(O000000000OOO0.getX(), O000000000OOOO.getX());
   }

   private int O00000000O00OO() {
      return Math.min(O000000000OOO0.getY(), O000000000OOOO.getY());
   }

   private int O00000000O0O() {
      return Math.max(O000000000OOO0.getY(), O000000000OOOO.getY());
   }

   private int O00000000O0O0() {
      return Math.min(O000000000OOO0.getZ(), O000000000OOOO.getZ());
   }

   private int O00000000O0O00() {
      return Math.max(O000000000OOO0.getZ(), O000000000OOOO.getZ());
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         if (this.O00000000O0O != null || this.O00000000O00O != null) {
            Immediate var2 = O0000O00O0O00.O00000000();

            try {
               Vec3d var3 = O0000000000.gameRenderer.getCamera().getPos();
               Matrix4f var4 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
               VertexConsumer var5 = var2.getBuffer(O00000000OOO0);
               if (this.O00000000O0O != null) {
                  this.O00000000(var5, var4, this.O00000000O0O, var3, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
               }

               if (this.O00000000O00O != null && !this.O00000000000(this.O00000000O00O)) {
                  this.O00000000(var5, var4, this.O00000000O00O, var3, new Color(0, 180, 255, 130), new Color(0, 180, 255, 0));
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, BlockPos blockPos, Vec3d vec3d, Color color, Color color2) {
      float var7 = (float)(blockPos.getX() - vec3d.x);
      float var8 = (float)(blockPos.getY() - vec3d.y);
      float var9 = (float)(blockPos.getZ() - vec3d.z);
      float var10 = (float)(blockPos.getX() + 1 - vec3d.x);
      float var11 = (float)(blockPos.getY() + 1 - vec3d.y);
      float var12 = (float)(blockPos.getZ() + 1 - vec3d.z);
      this.O00000000(vertexConsumer, matrix4f, var7, var8, var9, var10, var11, var12, color, color2);
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, Color color, Color color2) {
      int var11 = color.getRed();
      int var12 = color.getGreen();
      int var13 = color.getBlue();
      int var14 = color.getAlpha();
      int var15 = color2.getRed();
      int var16 = color2.getGreen();
      int var17 = color2.getBlue();
      int var18 = color2.getAlpha();
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var18);
   }

   record W66(String key, int count) {

      boolean matches(ItemStack itemStack) {
         return !itemStack.isEmpty() && this.count > 0 && this.key.equals(itemStack.getItem().toString() + "|" + itemStack.getName().getString());
      }
   }

   static enum W67 {
      IDLE,
      WAITING_FOR_TP,
      GOING_TO_MINE,
      MINING,
      TELEPORTING_TO_DROP,
      GOING_TO_DROP_CHEST,
      ROTATING_DROP_CHEST,
      OPENING_DROP_CHEST,
      WAITING_FOR_DROP_GUI,
      DROPPING,
      CHANGING_ANARCHY;
   }
}
