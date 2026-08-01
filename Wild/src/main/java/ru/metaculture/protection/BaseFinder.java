package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.ChestMinecartEntity;
import net.minecraft.entity.vehicle.HopperMinecartEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.WorldChunk;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "BaseFinder",
   O0000000000 = Category.Misc,
   O000000000 = "Ищет базы, пишет в ТГ и копает"
)
public class BaseFinder extends Module {
   public final GroupSetting O000000000O = new GroupSetting(
      "Блоки",
      new BooleanSetting("Сундуки", true),
      new BooleanSetting("Шалкера", true),
      new BooleanSetting("Бочки", true),
      new BooleanSetting("Наковальни", true),
      new BooleanSetting("Печка", false),
      new BooleanSetting("Эндер сундук", true)
   );
   public final BooleanSetting O000000000O0 = new BooleanSetting("Искать вагонетки", true);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Авто-туннель (#)", true);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Копать к находке", true).O00000000(() -> !this.O000000000O00.O0000000000());
   public final BooleanSetting O000000000O00O = new BooleanSetting("Выкл при игроке", true);
   public final BooleanSetting O000000000O0O = new BooleanSetting("Проверки на свет", false);
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Избегать мобов", false);
   public final BooleanSetting O000000000O0OO = new BooleanSetting("Рендерить находки", true);
   public final NumberSetting O000000000OO = new NumberSetting("Радиус чанков", 4.0F, 1.0F, 8.0F, 1.0F, true);
   public final ModeSetting O000000000OO0 = new ModeSetting("Режим работы", "Tonnel", "Поиск приватом", "Tonnel");
   private final Set<BlockPos> O000000000OO0O = Collections.newSetFromMap(new ConcurrentHashMap<>());
   private final Map<BlockPos, BlockEntityType<?>> O000000000OOO = new ConcurrentHashMap<>();
   private final Set<Integer> O000000000OOO0 = Collections.newSetFromMap(new ConcurrentHashMap<>());
   private static final int O000000000OOOO = 8;
   private static final int O00000000O = 8;
   private int O00000000O0 = 0;
   private boolean O00000000O00 = false;
   private BaseFinder.W83 O00000000O000 = BaseFinder.W83.CHECK_SUPPLIES;
   private int O00000000O0000 = 0;
   private BlockPos O00000000O000O = null;
   private BlockPos O00000000O00O = null;
   private int O00000000O00O0 = 30;
   private int O00000000O00OO = -1;
   public static final Map<Object, Integer> O000000000OO00 = new HashMap<>();
   private static final int O00000000O0O = 1024;
   private static final RenderPipeline O00000000O0O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "block_esp_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000O0O00 = RenderLayer.of(
      "block_esp_box", 1024, false, true, O00000000O0O0, MultiPhaseParameters.builder().build(false)
   );

   public BaseFinder() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0
         }
      );
      O000000000OO00.put(BlockEntityType.CHEST, O0000O000OO000.O000000000000(new Color(255, 194, 84).getRGB(), 100));
      O000000000OO00.put(BlockEntityType.TRAPPED_CHEST, O0000O000OO000.O000000000000(new Color(143, 109, 62).getRGB(), 100));
      O000000000OO00.put(BlockEntityType.ENDER_CHEST, O0000O000OO000.O000000000000(new Color(153, 49, 238).getRGB(), 100));
      O000000000OO00.put(BlockEntityType.BARREL, O0000O000OO000.O000000000000(new Color(250, 225, 62).getRGB(), 100));
      O000000000OO00.put(BlockEntityType.FURNACE, O0000O000OO000.O000000000000(new Color(115, 115, 115).getRGB(), 100));
      O000000000OO00.put(BlockEntityType.SHULKER_BOX, O0000O000OO000.O000000000000(new Color(246, 123, 123).getRGB(), 100));
      O000000000OO00.put(ChestMinecartEntity.class, O0000O000OO000.O000000000000(new Color(255, 100, 0).getRGB(), 100));
      O000000000OO00.put(HopperMinecartEntity.class, O0000O000OO000.O000000000000(new Color(100, 100, 100).getRGB(), 100));
   }

   @Override
   public void O00000000() {
      O000000O0O00O.O00000000 = true;
      super.O00000000();
      this.O000000000OO0O.clear();
      this.O000000000OOO.clear();
      this.O000000000OOO0.clear();
      this.O00000000O0 = 0;
      this.O00000000O00 = false;
      this.O00000000O000 = BaseFinder.W83.CHECK_SUPPLIES;
      this.O00000000O0000 = 0;
      this.O00000000O000O = null;
      this.O00000000O00O = null;
      this.O00000000O00OO = -1;
      if (O0000000000.player != null) {
         if (this.O000000000OO0.O000000000("Tonnel") && this.O000000000O00.O0000000000()) {
            try {
               O0000000000.player.networkHandler.sendChatMessage("#tunnel");
            } catch (Exception var2) {
               var2.printStackTrace();
            }
         }

         if (!ClientUtil.O000000000O.O0000000000()) {
            if (!O0000000OO0O00.O00000000()) {
               this.O00000000("§cВнимание! Telegram не настроен. Используйте .tapi");
            } else {
               this.O00000000("§aУведомления в Telegram включены.");
            }
         }
      }
   }

   @Override
   public void O000000000() {
      O000000O0O00O.O00000000 = false;
      super.O000000000();
      if (O0000000000.player != null && this.O000000000O00.O0000000000()) {
         try {
            O0000000000.player.networkHandler.sendChatMessage("#stop");
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

      this.O00000000O00 = false;
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.world != null && O0000000000.player != null) {
         if (this.O000000000O00O.O0000000000()) {
            this.O0000000000O0O();
            if (!this.O0000000000000) {
               return;
            }
         }

         if (this.O000000000OO0.O000000000("Поиск приватом")) {
            this.O0000000000O0();
         }

         if (this.O00000000O0++ >= 10) {
            this.O00000000O0 = 0;
            if (!this.O000000000O0O0.O0000000000() || !this.O0000000000OOO()) {
               this.O0000000000OO();
               if (this.O000000000O0.O0000000000()) {
                  this.O0000000000OO0();
               }
            }
         }
      }
   }

   private void O0000000000O0() {
      if (this.O00000000O0000 > 0) {
         this.O00000000O0000--;
      } else {
         switch (this.O00000000O000) {
            case CHECK_SUPPLIES:
               int var1 = this.O0000000000O00();
               if (var1 == -1) {
                  return;
               }

               this.O00000000O000O = O0000000000.player.getBlockPos();
               this.O00000000O00O0 = ThreadLocalRandom.current().nextInt(20, 30);

               try {
                  O0000000000.player.networkHandler.sendChatMessage("#tunnel");
               } catch (Exception var12) {
                  var12.printStackTrace();
               }

               this.O00000000O000 = BaseFinder.W83.TUNNELING;
               break;
            case TUNNELING:
               if (this.O00000000O000O != null && O0000000000.player.getBlockPos().getManhattanDistance(this.O00000000O000O) >= this.O00000000O00O0) {
                  O0000000000.player.networkHandler.sendChatMessage("#stop");
                  this.O00000000O000 = BaseFinder.W83.STOPPING;
                  this.O00000000O0000 = 10;
               }
               break;
            case STOPPING:
               this.O00000000O00OO = O0000000000.player.getInventory().getSelectedSlot();
               int var2 = this.O0000000000O00();
               if (var2 != -1) {
                  O0000000000.player.getInventory().setSelectedSlot(var2);
                  this.O00000000O000 = BaseFinder.W83.PLACING;
                  this.O00000000O0000 = 5;
               } else {
                  this.O00000000("§cРуда закончилась! Жду пополнения...");
                  this.O00000000O000 = BaseFinder.W83.CHECK_SUPPLIES;
               }
               break;
            case PLACING:
               Direction var3 = O0000000000.player.getHorizontalFacing();
               BlockPos var4 = O0000000000.player.getBlockPos();
               BlockPos var5 = var4.offset(var3.rotateYCounterclockwise());
               BlockPos var6 = var4.offset(var3.rotateYClockwise());
               BlockPos var7 = var4.offset(var3);
               BlockPos var8 = var5.up();
               BlockPos var9 = var6.up();
               BlockPos var10 = var7.up();
               boolean var11 = false;
               if (this.O00000000(var8)) {
                  this.O00000000O00O = var8;
                  var11 = true;
               } else if (this.O00000000(var9)) {
                  this.O00000000O00O = var9;
                  var11 = true;
               } else if (this.O00000000(var5)) {
                  this.O00000000O00O = var5;
                  var11 = true;
               } else if (this.O00000000(var6)) {
                  this.O00000000O00O = var6;
                  var11 = true;
               } else if (this.O00000000(var10)) {
                  this.O00000000O00O = var10;
                  var11 = true;
               } else if (this.O00000000(var7)) {
                  this.O00000000O00O = var7;
                  var11 = true;
               }

               if (var11) {
                  this.O00000000O000 = BaseFinder.W83.WAITING_CHAT;
                  this.O00000000O0000 = 10;
               } else {
                  this.O00000000("§7Некуда поставить блок. Пропуск.");
                  if (this.O00000000O00OO != -1) {
                     O0000000000.player.getInventory().setSelectedSlot(this.O00000000O00OO);
                  }

                  this.O00000000O000 = BaseFinder.W83.RESUMING;
                  this.O00000000O0000 = 5;
               }
               break;
            case WAITING_CHAT:
               this.O00000000O000 = BaseFinder.W83.BREAKING;
               break;
            case BREAKING:
               if (this.O00000000O00O != null) {
                  if (this.O00000000O00OO != -1 && O0000000000.player.getInventory().getSelectedSlot() != this.O00000000O00OO) {
                     O0000000000.player.getInventory().setSelectedSlot(this.O00000000O00OO);
                  }

                  if (!O0000000000.world.getBlockState(this.O00000000O00O).isAir()) {
                     this.O00000000(Vec3d.ofCenter(this.O00000000O00O));
                     O0000000000.interactionManager.updateBlockBreakingProgress(this.O00000000O00O, Direction.UP);
                     O0000000000.player.swingHand(Hand.MAIN_HAND);
                     return;
                  }
               }

               this.O00000000O000 = BaseFinder.W83.RESUMING;
               this.O00000000O0000 = 5;
               break;
            case RESUMING:
               this.O00000000O000O = O0000000000.player.getBlockPos();
               this.O00000000O00O0 = ThreadLocalRandom.current().nextInt(20, 30);
               O0000000000.player.networkHandler.sendChatMessage("#tunnel");
               this.O00000000O000 = BaseFinder.W83.TUNNELING;
         }
      }
   }

   private void O00000000(Vec3d vec3d) {
      double var2 = vec3d.x - O0000000000.player.getX();
      double var4 = vec3d.y - O0000000000.player.getEyeY();
      double var6 = vec3d.z - O0000000000.player.getZ();
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      float var10 = (float)(Math.toDegrees(Math.atan2(var6, var2)) - 90.0);
      float var11 = (float)Math.toDegrees(-Math.atan2(var4, var8));
      O0000000000.player.setYaw(var10);
      O0000000000.player.setPitch(var11);
   }

   private boolean O00000000(BlockPos blockPos) {
      if (!O0000000000.world.getBlockState(blockPos).isAir()) {
         return false;
      } else {
         for (Direction var5 : Direction.values()) {
            BlockPos var6 = blockPos.offset(var5);
            if (!O0000000000.world.getBlockState(var6).isAir()) {
               Direction var7 = var5.getOpposite();
               Vec3d var8 = new Vec3d(
                  var6.getX() + 0.5 + var7.getOffsetX() * 0.5, var6.getY() + 0.5 + var7.getOffsetY() * 0.5, var6.getZ() + 0.5 + var7.getOffsetZ() * 0.5
               );
               BlockHitResult var9 = new BlockHitResult(var8, var7, var6, false);
               this.O00000000(var8);
               O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var9);
               O0000000000.player.swingHand(Hand.MAIN_HAND);
               return true;
            }
         }

         return false;
      }
   }

   private int O0000000000O00() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).getItem() == Items.EMERALD_ORE
            || O0000000000.player.getInventory().getStack(var1).getItem() == Items.DEEPSLATE_EMERALD_ORE) {
            return var1;
         }
      }

      return -1;
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && this.O000000000OO0.O000000000("Поиск приватом")) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var4 = var2.content().getString();
            if (this.O00000000O000 == BaseFinder.W83.WAITING_CHAT) {
               if (!var4.contains("Ваш регион пересекается") && (!var4.contains("[✠]") || !var4.contains("пересекается"))) {
                  if (var4.contains("Регион успешно создан") || var4.contains("[✠]") && var4.contains("успешно")) {
                     this.O00000000O000 = BaseFinder.W83.BREAKING;
                     this.O00000000O0000 = 2;
                  }
               } else {
                  this.O00000000("§d!!! НАЙДЕНО ПЕРЕСЕЧЕНИЕ РЕГИОНОВ !!!");
                  if (ClientUtil.O000000000O.O0000000000()) {
                     this.O000000000("ПРИВАТ (Emerald Check)", O0000000000.player.getBlockX(), O0000000000.player.getBlockY(), O0000000000.player.getBlockZ());
                  }

                  O0000000000.player.networkHandler.sendChatMessage("#stop");
                  this.a_();
               }
            }
         }
      }
   }

   private void O0000000000O0O() {
      for (PlayerEntity var2 : O0000000000.world.getPlayers()) {
         if (var2 != O0000000000.player && !FriendCommand.O00000000(var2.getName().getString())) {
            String var3 = var2.getName().getString();
            int var4 = var2.getBlockX();
            int var5 = var2.getBlockY();
            int var6 = var2.getBlockZ();
            ChatUtil.O00000000("§4[BaseFinder] §cОБНАРУЖЕН ИГРОК: §f" + var3);
            if (ClientUtil.O000000000O.O0000000000()) {
               this.O0000000000(var3, var4, var5, var6);
            }

            if (this.O000000000O00.O0000000000()) {
               O0000000000.player.networkHandler.sendChatMessage("#stop");
            }

            this.a_();
            return;
         }
      }
   }

   private void O0000000000OO() {
      ChunkPos var1 = O0000000000.player.getChunkPos();
      int var2 = (int)this.O000000000OO.O0000000000();

      for (int var3 = var1.x - var2; var3 <= var1.x + var2; var3++) {
         for (int var4 = var1.z - var2; var4 <= var1.z + var2; var4++) {
            WorldChunk var5 = O0000000000.world.getChunk(var3, var4);
            if (var5 != null) {
               for (BlockEntity var7 : var5.getBlockEntities().values()) {
                  BlockEntityType var8 = var7.getType();
                  if (O000000000OO00.containsKey(var8) && this.O00000000(var7)) {
                     BlockPos var9 = var7.getPos();
                     if (!this.O000000000OO0O.contains(var9) && (!this.O000000000O0O.O0000000000() || this.O000000000(var9))) {
                        this.O000000000OO0O.add(var9);
                        this.O000000000OOO.put(var9, var8);
                        String var10 = this.O000000000(var7);
                        this.O00000000(var10, var9.getX(), var9.getY(), var9.getZ());
                     }
                  }
               }
            }
         }
      }
   }

   private void O0000000000OO0() {
      for (Entity var2 : O0000000000.world.getEntities()) {
         if ((var2 instanceof ChestMinecartEntity || var2 instanceof HopperMinecartEntity)
            && !this.O000000000OOO0.contains(var2.getId())
            && !(var2.distanceTo(O0000000000.player) > this.O000000000OO.O0000000000() * 16.0F)) {
            this.O000000000OOO0.add(var2.getId());
            String var3 = var2 instanceof ChestMinecartEntity ? "Грузовая вагонетка" : "Вагонетка с воронкой";
            BlockPos var4 = var2.getBlockPos();
            this.O00000000(var3, var4.getX(), var4.getY(), var4.getZ());
         }
      }
   }

   private void O00000000(String string, int i, int j, int k) {
      ChatUtil.O00000000(String.format("§5[BaseFinder] §aНайден §f%s §aна XYZ: §f%d %d %d", string, i, j, k));
      if (ClientUtil.O000000000O.O0000000000()) {
         this.O000000000(string, i, j, k);
      }

      if (!this.O000000000OO0.O000000000("Поиск приватом") && this.O000000000O00.O0000000000() && this.O000000000O000.O0000000000() && !this.O00000000O00) {
         this.O00000000O00 = true;
         ChatUtil.O00000000("§5[BaseFinder] §aНайдена цель! Перенаправляю Baritone...");

         try {
            if (O0000000000.player != null) {
               O0000000000.player.networkHandler.sendChatMessage("#tunnel " + i + " " + j + " " + k);
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }
   }

   private void O000000000(String string, int i, int j, int k) {
      if (O0000000OO0O00.O00000000()) {
         ClientUtil var5 = (ClientUtil)WildClient.O00000000.O000000000.O000000000(ClientUtil.class);
         if (var5 == null || ClientUtil.O000000000O.O0000000000()) {
            Thread var6 = new Thread(() -> {
               try {
                  String var4 = O0000000000.getCurrentServerEntry() != null ? O0000000000.getCurrentServerEntry().address : "Singleplayer";
                  String var5x = String.format("База найдена!\n\nТип: %s\nКоординаты: %d %d %d\nСервер: %s\n", string, i, j, k, var4);
                  O0000000OO0O00.O00000000(var5x);
               } catch (Exception var6x) {
                  ChatUtil.O00000000("§cОшибка отправки в Telegram: " + var6x.getMessage());
               }
            }, "Wild-BaseFinder-Telegram");
            var6.setDaemon(true);
            var6.start();
         }
      }
   }

   private void O0000000000(String string, int i, int j, int k) {
      if (O0000000OO0O00.O00000000()) {
         Thread var5 = new Thread(() -> {
            try {
               String var4 = O0000000000.getCurrentServerEntry() != null ? O0000000000.getCurrentServerEntry().address : "Singleplayer";
               String var5x = String.format("Был обнаружен игрокНик: %s\nКоординаты: %d %d %d\nСервер: %s\n", string, i, j, k, var4);
               O0000000OO0O00.O00000000(var5x);
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }, "Wild-BaseFinder-PlayerAlert");
         var5.setDaemon(true);
         var5.start();
      }
   }

   private boolean O00000000(BlockEntity blockEntity) {
      if (blockEntity instanceof ChestBlockEntity && !this.O000000000O.O000000000("Сундуки")) {
         return false;
      } else if (blockEntity instanceof EnderChestBlockEntity && !this.O000000000O.O000000000("Эндер сундук")) {
         return false;
      } else if (blockEntity instanceof BarrelBlockEntity && !this.O000000000O.O000000000("Бочки")) {
         return false;
      } else {
         return blockEntity instanceof FurnaceBlockEntity && !this.O000000000O.O000000000("Печка")
            ? false
            : !(blockEntity instanceof ShulkerBoxBlockEntity) || this.O000000000O.O000000000("Шалкера");
      }
   }

   private boolean O000000000(BlockPos blockPos) {
      return O0000000000.world == null ? false : O0000000000.world.getLightLevel(LightType.BLOCK, blockPos) >= 8;
   }

   private boolean O0000000000OOO() {
      Box var1 = new Box(O0000000000.player.getBlockPos()).expand(8.0);

      for (Entity var4 : O0000000000.world.getOtherEntities(O0000000000.player, var1)) {
         if (var4 instanceof HostileEntity && var4.isAlive()) {
            return true;
         }
      }

      return false;
   }

   private String O000000000(BlockEntity blockEntity) {
      if (blockEntity instanceof ChestBlockEntity) {
         return "Сундук";
      } else if (blockEntity instanceof EnderChestBlockEntity) {
         return "Эндер сундук";
      } else if (blockEntity instanceof BarrelBlockEntity) {
         return "Бочка";
      } else if (blockEntity instanceof FurnaceBlockEntity) {
         return "Печка";
      } else {
         return blockEntity instanceof ShulkerBoxBlockEntity ? "Шалкер" : "Неизвестный блок";
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null && this.O000000000O0OO.O0000000000()) {
         Immediate var2 = O0000O00O0O00.O00000000();

         try {
            Vec3d var3 = O0000000000.gameRenderer.getCamera().getPos();
            Matrix4f var4 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
            VertexConsumer var5 = var2.getBuffer(O00000000O0O00);

            for (BlockPos var7 : this.O000000000OO0O) {
               BlockEntityType var8 = this.O000000000OOO.get(var7);
               if (var8 != null && O000000000OO00.containsKey(var8)) {
                  this.O00000000(var5, var4, var3, var7, O000000000OO00.get(var8));
               }
            }

            if (this.O000000000O0.O0000000000()) {
               for (Entity var13 : O0000000000.world.getEntities()) {
                  if (this.O000000000OOO0.contains(var13.getId())) {
                     int var14 = -1;
                     if (var13 instanceof ChestMinecartEntity) {
                        var14 = O000000000OO00.get(ChestMinecartEntity.class);
                     } else if (var13 instanceof HopperMinecartEntity) {
                        var14 = O000000000OO00.get(HopperMinecartEntity.class);
                     }

                     if (var14 != -1) {
                        O00000OO00OOO0$W226$W227.O00000000(
                           var5,
                           var4,
                           (float)(var13.getX() - 0.5 - var3.x),
                           (float)(var13.getY() - var3.y),
                           (float)(var13.getZ() - 0.5 - var3.z),
                           (float)(var13.getX() + 0.5 - var3.x),
                           (float)(var13.getY() + 0.5 - var3.y),
                           (float)(var13.getZ() + 0.5 - var3.z),
                           var14
                        );
                     }
                  }
               }
            }
         } finally {
            O0000O00O0O00.O000000000();
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, BlockPos blockPos, int i) {
      float var6 = (float)(blockPos.getX() - vec3d.x);
      float var7 = (float)(blockPos.getY() - vec3d.y);
      float var8 = (float)(blockPos.getZ() - vec3d.z);
      float var9 = (float)(blockPos.getX() + 1 - vec3d.x);
      float var10 = (float)(blockPos.getY() + 1 - vec3d.y);
      float var11 = (float)(blockPos.getZ() + 1 - vec3d.z);
      O00000OO00OOO0$W226$W227.O00000000(vertexConsumer, matrix4f, var6, var7, var8, var9, var10, var11, i);
   }

   private void O00000000(String string) {
      ChatUtil.O00000000("§5[BaseFinder] " + string);
   }

   static enum W83 {
      CHECK_SUPPLIES,
      TUNNELING,
      STOPPING,
      PLACING,
      WAITING_CHAT,
      BREAKING,
      RESUMING;
   }
}
