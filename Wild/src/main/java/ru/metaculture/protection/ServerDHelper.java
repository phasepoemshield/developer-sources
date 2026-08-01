package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.AbstractSkullBlock;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.Vector2f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ServerDHelper",
   O0000000000 = Category.Misc,
   O000000000 = "Удобный модуль для данжа варден, подсветка а так же автоматический лут сундуков"
)
public class ServerDHelper extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим", "Варден", "Варден", "Медный данж");
   public final ModeSetting O000000000O0 = new ModeSetting("Режим работы", "Лутающий", "Лутающий", "Складывающий");
   public final BooleanSetting O000000000O00 = new BooleanSetting("Складывать дроп в клан", false);
   public final ModeSetting O000000000O000 = new ModeSetting("Режим", "Авто", "Авто", "По бинду").O00000000(() -> !this.O000000000O00.O0000000000());
   public final KeybindSetting O000000000O00O = new KeybindSetting("Бинд", -1).O00000000(() -> !this.O000000000O000.O000000000("По бинду"));
   public final GroupSetting O000000000O0O = new GroupSetting(
      "Предметы для лута",
      new BooleanSetting("Дон зелья", false),
      new BooleanSetting("Сферы", false),
      new BooleanSetting("Талисманы", false),
      new BooleanSetting("Стрелы", false),
      new BooleanSetting("Ценные предметы", false),
      new BooleanSetting("Яйца", false).O00000000(() -> !this.O000000000O00.O0000000000())
   );
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Установка точки на сундук", true);
   public final BooleanSetting O000000000O0OO = new BooleanSetting("Ротация на сундук", false);
   public final KeybindSetting O000000000OO = new KeybindSetting("Бинд на уст. сундука", -1).O00000000(() -> !this.O000000000O0.O000000000("Складывающий"));
   public final BooleanSetting O000000000OO0 = new BooleanSetting("Не отображать экран", false);
   public static final Map<BlockPos, Long> O000000000OO00 = new HashMap<>();
   public static final Map<BlockPos, Long> O000000000OO0O = new HashMap<>();
   private final Queue<Runnable> O000000000OOO = new ArrayDeque<>();
   private final Set<BlockPos> O000000000OOO0 = new HashSet<>();
   private final Set<BlockPos> O000000000OOOO = new HashSet<>();
   private final Map<BlockPos, ServerDHelper.W97> O00000000O = new HashMap<>();
   private final Map<BlockPos, Long> O00000000O0 = new HashMap<>();
   private final Map<String, Integer> O00000000O00 = new HashMap<>();
   private BlockPos O00000000O000 = null;
   private BlockPos O00000000O0000 = null;
   private ServerDHelper.W98 O00000000O000O = ServerDHelper.W98.IDLE;
   private ServerDHelper.W96 O00000000O00O = ServerDHelper.W96.IDLE;
   private final O0000O00O0000 O00000000O00O0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O00OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0O = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0O0 = new O0000O00O0000();
   private final Set<BlockPos> O00000000O0O00 = new HashSet<>();
   private final Map<BlockPos, Long> O00000000O0O0O = new HashMap<>();
   private int O00000000O0OO = 0;
   private boolean O00000000O0OO0 = true;
   private boolean O00000000O0OOO = false;
   private final O0000O00O0000 O00000000OO = new O0000O00O0000();
   private String O00000000OO0 = "N/A";
   private long O00000000OO00 = 500L;
   private static final long O00000000OO000 = 45000L;
   private boolean O00000000OO00O = false;
   private long O00000000OO0O = 0L;
   private GenericContainerScreen O00000000OO0O0;
   private static final int[] O00000000OO0OO = new int[]{10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34};
   private static final Pattern O00000000OOO = Pattern.compile("(\\d{1,2}):(\\d{1,2})");
   private static final Pattern O00000000OOO0 = Pattern.compile("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?");
   private static final Pattern O00000000OOO00 = Pattern.compile("(\\d+)\\s*(с|s|сек|sec)");
   private static final double O00000000OOO0O = 2000.0;
   private static final double O00000000OOOO = 2000.0;
   private static final double O00000000OOOO0 = 62500.0;
   private static final int O00000000OOOOO = 1024;
   private static final RenderPipeline O0000000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "block_esp_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O0000000O0 = RenderLayer.of("chest_esp_box", 1024, false, true, O0000000O, MultiPhaseParameters.builder().build(false));

   public ServerDHelper() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000OO,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      if (O0000000000.options != null) {
         this.O00000000O0OO0 = O0000000000.options.pauseOnLostFocus;
         O0000000000.options.pauseOnLostFocus = false;
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O000000000OOO.clear();
      this.O00000000O.clear();
      this.O00000000O0.clear();
      if (O0000000000.options != null) {
         O0000000000.options.pauseOnLostFocus = this.O00000000O0OO0;
      }

      if (!this.O000000000OOOO.isEmpty()) {
         GpsCommand.O00000000 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
         this.O000000000OOOO.clear();
      }

      this.O00000000O000O = ServerDHelper.W98.IDLE;
      this.O00000000O00O = ServerDHelper.W96.IDLE;
      this.O00000000O0000 = null;
      this.O00000000O0OO = 0;
      this.O00000000OO0O0 = null;
      this.O00000000O0O0O.clear();
      this.O000000000O00();
      this.O00000000O0OOO = false;
   }

   @EventHandler
   public void O00000000(O0000000O00OO o0000000O00OO) {
      if (this.O000000000OO0.O0000000000() && o0000000O00OO.O0000000000() instanceof GenericContainerScreen var2) {
         this.O00000000OO0O0 = var2;
         o0000000O00OO.O00000000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O000000000OOO0.clear();
      this.O000000000OOOO.clear();
      this.O00000000O0O00.clear();
      this.O00000000O0O0O.clear();
      this.O00000000O0000 = null;
      this.O00000000O00O = ServerDHelper.W96.IDLE;
      this.O00000000O0OO = 0;
      this.O00000000OO0O0 = null;
      this.O000000000OOO.clear();
      this.O00000000O.clear();
      this.O00000000O0.clear();
      this.O000000000O00();
   }

   private boolean O0000000000O0() {
      if (O0000000000.player == null) {
         return false;
      } else {
         double var1 = O0000000000.player.getX();
         double var3 = O0000000000.player.getY();
         double var5 = O0000000000.player.getZ();
         return !this.O000000000O.O000000000("Варден")
            ? (var1 - 2000.0) * (var1 - 2000.0) + (var5 - 2000.0) * (var5 - 2000.0) <= 62500.0
            : var1 >= -2072.0 && var1 <= -1928.0 && var3 >= -56.0 && var3 <= -29.0 && var5 >= -2071.0 && var5 <= -1929.0;
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (this.O00000000O0OOO) {
            if (this.O00000000OO.O000000000000(2000L)) {
               if (!"N/A".equals(this.O00000000OO0)) {
                  O0000000000.player.networkHandler.sendChatCommand("an" + this.O00000000OO0);
                  ChatUtil.O00000000("§8[§6ServerDHelper§8] §aВозвращаемся на Анархию-" + this.O00000000OO0);
               } else {
                  ChatUtil.O00000000("§8[§6ServerDHelper§8] §cНе удалось определить номер анархии для реконнекта!");
               }

               this.O00000000O0OOO = false;
               if (this.O000000000O0.O000000000("Складывающий")) {
                  this.O00000000OO00 = 4000L;
                  this.O00000000O000O = ServerDHelper.W98.REOPEN_CLAN;
                  this.O00000000O00O0.O00000000();
               }
            }
         } else {
            boolean var2 = this.O0000000000O0();
            if (!this.O000000000O0.O000000000("Лутающий") || var2) {
               if (this.O000000000O0.O000000000("Лутающий")) {
                  this.O0000000000OO0();
                  if (this.O00000000OO00O && !this.O0000000000OO() && System.currentTimeMillis() > this.O00000000OO0O) {
                     O0000000000.player.networkHandler.sendChatCommand("clan storage");
                     this.O00000000OO00O = false;
                  }
               } else if (this.O000000000O0.O000000000("Складывающий") && this.O00000000O000 != null) {
                  this.O0000000000OOO();
               }

               GenericContainerScreen var3 = this.O0000000000O00();
               if (var3 != null) {
                  GenericContainerScreenHandler var4 = (GenericContainerScreenHandler)var3.getScreenHandler();
                  String var5 = var3.getTitle().getString().toLowerCase().replaceAll("§.", "").trim();
                  boolean var6 = var5.contains("клан") || var5.contains("clan") || var5.contains("хранилище");
                  if (this.O000000000O0.O000000000("Лутающий")) {
                     if (var6) {
                        this.O00000000000(var4);
                     } else {
                        boolean var7 = this.O000000000O.O000000000("Варден")
                           ? var5.equals("сундук") || var5.equals("большой сундук") || var5.equals("chest") || var5.equals("large chest")
                           : var5.equals("бочка") || var5.equals("barrel");
                        if (var7) {
                           this.O0000000000(var4);
                        }
                     }
                  } else if (this.O000000000O0.O000000000("Складывающий")) {
                     if (var6) {
                        this.O00000000(var4);
                     } else {
                        this.O000000000(var4);
                     }
                  }
               }
            }
         }
      }
   }

   private GenericContainerScreen O0000000000O00() {
      GenericContainerScreen var1 = ScreenUtil.O00000000(O0000000000, this.O00000000OO0O0, GenericContainerScreen.class);
      if (var1 == null) {
         this.O00000000OO0O0 = null;
      }

      return var1;
   }

   private boolean O0000000000O0O() {
      return this.O0000000000O00() != null;
   }

   private boolean O0000000000OO() {
      return ScreenUtil.O000000000(O0000000000, this.O00000000OO0O0) || ScreenUtil.O00000000(O0000000000);
   }

   private void O0000000000OO0() {
      if (!this.O000000000O0OO.O0000000000()
         || !this.O000000000O0.O000000000("Лутающий")
         || O0000000000.player == null
         || O0000000000.world == null
         || O0000000000.interactionManager == null) {
         this.O000000000O0();
      } else if (this.O0000000000O0O()) {
         if (this.O00000000O0000 != null) {
            this.O00000000(this.O00000000O0000);
         }

         this.O000000000O0();
      } else {
         if (this.O00000000O00O == ServerDHelper.W96.IDLE) {
            BlockPos var1 = this.O000000000O();
            if (var1 == null) {
               return;
            }

            this.O00000000O0000 = var1;
            this.O00000000O00O = ServerDHelper.W96.ROTATING;
            this.O00000000O0OO = 0;
            this.O00000000O00OO.O00000000();
         }

         if (this.O00000000O0000 != null && this.O00000000000(this.O00000000O0000)) {
            switch (this.O00000000O00O) {
               case IDLE:
               default:
                  break;
               case ROTATING:
                  O000000O0O00OO var2 = this.O00000000(Vec3d.ofCenter(this.O00000000O0000));
                  O000000O0O0O0.O00000000(var2, 999.0F, 999.0F, 60.0F, 60.0F, 2, 3, false);
                  if (new O000000O0O00OO(O0000000000.player).O00000000(var2) < 3.0F || this.O00000000O00OO.O000000000000(120L)) {
                     this.O000000000O00();
                     this.O00000000O00O = ServerDHelper.W96.OPENING;
                     this.O00000000O00OO.O00000000();
                  }
                  break;
               case OPENING:
                  if (this.O000000000O000()) {
                     this.O00000000O00OO.O00000000();
                     return;
                  }

                  if (this.O00000000O00OO.O000000000000(90L)) {
                     this.O000000000(this.O00000000O0000);
                     this.O00000000O0OO++;
                     this.O00000000O00O = ServerDHelper.W96.WAITING_SCREEN;
                     this.O00000000O00OO.O00000000();
                  }
                  break;
               case WAITING_SCREEN:
                  if (this.O00000000O00OO.O000000000000(1400L)) {
                     if (this.O00000000O0OO >= 2) {
                        this.O00000000(this.O00000000O0000);
                        this.O000000000O0();
                     } else {
                        this.O00000000O00O = ServerDHelper.W96.ROTATING;
                        this.O00000000O00OO.O00000000();
                     }
                  }
            }
         } else {
            this.O000000000O0();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (O0000000000.player != null) {
         if (this.O000000000O0.O000000000("Складывающий") && o0000000O0O0.O00000000000() == this.O000000000OO.O0000000000()) {
            if (O0000000000.crosshairTarget instanceof BlockHitResult var2) {
               BlockPos var4 = var2.getBlockPos();
               if (O0000000000.world == null
                  || !(O0000000000.world.getBlockEntity(var4) instanceof ChestBlockEntity)
                     && !(O0000000000.world.getBlockEntity(var4) instanceof BarrelBlockEntity)) {
                  ChatUtil.O00000000("§8[§6ServerDHelper§8] §cСмотрите на сундук или бочку!");
               } else {
                  this.O00000000O000 = var4;
                  ChatUtil.O00000000("§8[§6ServerDHelper§8] §aБазовый сундук установлен: " + var4.toShortString());
               }
            }
         } else if (!this.O000000000O0.O000000000("Лутающий") || this.O0000000000O0()) {
            if (this.O000000000O0.O000000000("Лутающий")
               && this.O000000000O00.O0000000000()
               && this.O000000000O000.O000000000("По бинду")
               && o0000000O0O0.O00000000000() == this.O000000000O00O.O0000000000()
               && !this.O00000000O00.isEmpty()) {
               O0000000000.player.networkHandler.sendChatCommand("clan storage");
            }
         }
      }
   }

   private void O0000000000OOO() {
      if (!this.O0000000000OO() && O0000000000.player != null && O0000000000.interactionManager != null) {
         switch (this.O00000000O000O) {
            case IDLE:
            default:
               break;
            case ROTATING:
               O000000O0O00OO var1 = this.O00000000(
                  new Vec3d(this.O00000000O000.getX() + 0.5, this.O00000000O000.getY() + 0.5, this.O00000000O000.getZ() + 0.5)
               );
               O000000O0O0O0.O00000000(var1, 35.0F, 35.0F, 35.0F, 35.0F, 20, 1, false);
               if (new O000000O0O00OO(O0000000000.player).O00000000(var1) < 4.0F) {
                  this.O000000000O00();
                  this.O00000000O000O = ServerDHelper.W98.OPENING;
                  this.O00000000O00O0.O00000000();
               }
               break;
            case OPENING:
               if (this.O000000000O000()) {
                  this.O00000000O00O0.O00000000();
               } else if (this.O00000000O00O0.O000000000000(100L)) {
                  this.O000000000(this.O00000000O000);
                  this.O00000000O000O = ServerDHelper.W98.IDLE;
               }
               break;
            case REOPEN_CLAN:
               if (this.O00000000O00O0.O000000000000(this.O00000000OO00)) {
                  O0000000000.player.networkHandler.sendChatCommand("clan storage");
                  this.O00000000O000O = ServerDHelper.W98.IDLE;
                  this.O00000000OO00 = 500L;
               }
         }
      }
   }

   private BlockPos O000000000O() {
      long var1 = System.currentTimeMillis();
      this.O00000000(var1);
      BlockPos var3 = null;
      double var4 = Double.MAX_VALUE;

      for (Entry var7 : new HashMap<>(O000000000OO0O).entrySet()) {
         BlockPos var8 = (BlockPos)var7.getKey();
         if ((Long)var7.getValue() > var1 && !this.O00000000O0O00.contains(var8) && !this.O00000000(var8, var1) && this.O00000000000(var8)) {
            double var9 = O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(var8));
            if (!(var9 > 36.0) && var9 < var4) {
               var4 = var9;
               var3 = var8.toImmutable();
            }
         }
      }

      return var3;
   }

   private void O000000000O0() {
      boolean var1 = this.O00000000O00O != ServerDHelper.W96.IDLE || this.O00000000O0000 != null || this.O00000000O0OO != 0;
      this.O00000000O0000 = null;
      this.O00000000O00O = ServerDHelper.W96.IDLE;
      this.O00000000O0OO = 0;
      if (var1) {
         this.O000000000O00();
      }
   }

   private void O00000000(BlockPos blockPos) {
      if (blockPos != null) {
         BlockPos var2 = blockPos.toImmutable();
         this.O00000000O0O00.add(var2);
         this.O00000000O0O0O.put(var2, System.currentTimeMillis() + 45000L);
         O000000000OO0O.remove(var2);
         this.O000000000OOOO.remove(var2);
      }
   }

   private boolean O00000000(BlockPos blockPos, long l) {
      Long var4 = this.O00000000O0O0O.get(blockPos);
      if (var4 == null) {
         return false;
      } else if (var4 <= l) {
         this.O00000000O0O0O.remove(blockPos);
         return false;
      } else {
         return true;
      }
   }

   private void O00000000(long l) {
      this.O00000000O0O0O.entrySet().removeIf(entry -> entry.getValue() <= l);
   }

   private void O000000000O00() {
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
   }

   private boolean O000000000O000() {
      int var1 = O0000000000.player.getInventory().getSelectedSlot();
      ItemStack var2 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var1);
      if (!this.O00000000(var2)) {
         return false;
      } else {
         for (int var3 = 0; var3 < 9; var3++) {
            ItemStack var4 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var3);
            if (var4.isEmpty() || !this.O00000000(var4)) {
               O0000000000.player.getInventory().setSelectedSlot(var3);
               return true;
            }
         }

         return false;
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else {
         String var2 = itemStack.getName().getString();
         return itemStack.getItem() == Items.TRIPWIRE_HOOK || var2.contains("[★]") || var2.contains("[в\u0098…]");
      }
   }

   private void O000000000(BlockPos blockPos) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         Direction var2 = this.O0000000000(blockPos);
         Vec3d var3 = new Vec3d(
            blockPos.getX() + 0.5 + var2.getOffsetX() * 0.5, blockPos.getY() + 0.5 + var2.getOffsetY() * 0.5, blockPos.getZ() + 0.5 + var2.getOffsetZ() * 0.5
         );
         BlockHitResult var4 = new BlockHitResult(var3, var2, blockPos, false);
         O0000000000.player.swingHand(Hand.MAIN_HAND);
         O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var4);
      }
   }

   private Direction O0000000000(BlockPos blockPos) {
      Vec3d var2 = Vec3d.ofCenter(blockPos);
      Vec3d var3 = O0000000000.player.getEyePos().subtract(var2);
      return Direction.getFacing(var3.x, var3.y, var3.z);
   }

   private boolean O00000000000(BlockPos blockPos) {
      if (O0000000000.world == null) {
         return false;
      } else {
         BlockEntity var2 = O0000000000.world.getBlockEntity(blockPos);
         return this.O000000000O.O000000000("Варден") ? var2 instanceof ChestBlockEntity : var2 instanceof BarrelBlockEntity;
      }
   }

   private void O00000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (this.O00000000O0O.O000000000000(100L)) {
            boolean var2 = true;
            boolean var3 = false;

            for (int var4 = 0; var4 < 36; var4++) {
               ItemStack var5 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var4);
               if (var5.isEmpty()) {
                  var2 = false;
               } else {
                  var3 = true;
               }
            }

            boolean var11 = false;
            boolean var12 = false;

            for (int var9 : O00000000OO0OO) {
               if (var9 < genericContainerScreenHandler.slots.size()) {
                  Slot var10 = (Slot)genericContainerScreenHandler.slots.get(var9);
                  if (var10.hasStack() && var10.getStack().getItem() != Items.AIR) {
                     var12 = true;
                     if (!var2) {
                        O0000000000.interactionManager.clickSlot(genericContainerScreenHandler.syncId, var9, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                        var11 = true;
                     }
                  }
               }
            }

            if (var11) {
               this.O00000000O0O.O00000000();
            } else if (var3 && (var2 || !var12)) {
               O0000000000.player.closeHandledScreen();
               this.O00000000O000O = ServerDHelper.W98.ROTATING;
            }
         }
      }
   }

   private void O000000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         int var2 = genericContainerScreenHandler.slots.size() - 36;

         for (int var3 = var2; var3 < genericContainerScreenHandler.slots.size(); var3++) {
            Slot var4 = (Slot)genericContainerScreenHandler.slots.get(var3);
            if (var4.hasStack() && var4.getStack().getItem() != Items.AIR) {
               if (this.O00000000O0O0.O000000000000(150L)) {
                  O0000000000.interactionManager.clickSlot(genericContainerScreenHandler.syncId, var3, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                  this.O00000000O0O0.O00000000();
               }

               return;
            }
         }

         O0000000000.player.closeHandledScreen();
         this.O00000000O000O = ServerDHelper.W98.REOPEN_CLAN;
         this.O00000000O00O0.O00000000();
      }
   }

   private void O0000000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         int var2 = genericContainerScreenHandler.slots.size() - 36;

         for (int var3 = 0; var3 < var2; var3++) {
            Slot var4 = (Slot)genericContainerScreenHandler.slots.get(var3);
            if (var4.hasStack() && this.O0000000000(var4.getStack())) {
               if (this.O00000000O0O.O000000000000(50L)) {
                  ItemStack var5 = var4.getStack().copy();
                  String var6 = this.O000000000(var5);
                  this.O00000000O00.put(var6, this.O00000000O00.getOrDefault(var6, 0) + var5.getCount());
                  O0000000000.interactionManager.clickSlot(genericContainerScreenHandler.syncId, var3, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                  this.O00000000O0O.O00000000();
               }

               return;
            }
         }

         O0000000000.player.closeHandledScreen();
         this.O00000000(this.O00000000O0000);
         this.O000000000O0();
         if (this.O000000000O00.O0000000000() && this.O000000000O000.O000000000("Авто") && !this.O00000000O00.isEmpty()) {
            this.O00000000OO00O = true;
            this.O00000000OO0O = System.currentTimeMillis() + 400L;
         }
      }
   }

   private void O00000000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (!this.O000000000OOO.isEmpty()) {
            if (this.O00000000O0O.O000000000000(50L)) {
               this.O000000000OOO.poll().run();
               this.O00000000O0O.O00000000();
            }
         } else if (this.O00000000O00.isEmpty()) {
            O0000000000.player.closeHandledScreen();
         } else {
            int var2 = genericContainerScreenHandler.slots.size() - 36;
            boolean var3 = false;

            for (int var4 = var2; var4 < genericContainerScreenHandler.slots.size(); var4++) {
               Slot var5 = (Slot)genericContainerScreenHandler.slots.get(var4);
               if (var5.hasStack()) {
                  String var6 = this.O000000000(var5.getStack());
                  int var7 = this.O00000000O00.getOrDefault(var6, 0);
                  if (var7 > 0) {
                     var3 = true;
                     int var8 = var5.getStack().getCount();
                     int var4Copy = var4;
                     if (var8 <= var7) {
                        this.O000000000OOO
                           .add(
                              () -> O0000000000.interactionManager
                                 .clickSlot(genericContainerScreenHandler.syncId, var4Copy, 0, SlotActionType.QUICK_MOVE, O0000000000.player)
                           );
                        int var10 = var7 - var8;
                        if (var10 <= 0) {
                           this.O00000000O00.remove(var6);
                        } else {
                           this.O00000000O00.put(var6, var10);
                        }
                     } else {
                        int var9 = -1;

                        for (int var15 = 0; var15 < var2; var15++) {
                           if (!((Slot)genericContainerScreenHandler.slots.get(var15)).hasStack()) {
                              var9 = var15;
                              break;
                           }
                        }

                        if (var9 == -1) {
                           this.O00000000O00.clear();
                           this.O000000000OOO.clear();
                           O0000000000.player.closeHandledScreen();
                           return;
                        }

                        int var16 = var9;
                        int var11 = var4;
                        this.O000000000OOO
                           .add(
                              () -> O0000000000.interactionManager
                                 .clickSlot(genericContainerScreenHandler.syncId, var11, 0, SlotActionType.PICKUP, O0000000000.player)
                           );
                        if (var7 <= var8 / 2) {
                           for (int var17 = 0; var17 < var7; var17++) {
                              this.O000000000OOO
                                 .add(
                                    () -> O0000000000.interactionManager
                                       .clickSlot(genericContainerScreenHandler.syncId, var16, 1, SlotActionType.PICKUP, O0000000000.player)
                                 );
                           }

                           this.O000000000OOO
                              .add(
                                 () -> O0000000000.interactionManager
                                    .clickSlot(genericContainerScreenHandler.syncId, var11, 0, SlotActionType.PICKUP, O0000000000.player)
                              );
                        } else {
                           int var12 = var8 - var7;

                           for (int var13 = 0; var13 < var12; var13++) {
                              this.O000000000OOO
                                 .add(
                                    () -> O0000000000.interactionManager
                                       .clickSlot(genericContainerScreenHandler.syncId, var11, 1, SlotActionType.PICKUP, O0000000000.player)
                                 );
                           }

                           this.O000000000OOO
                              .add(
                                 () -> O0000000000.interactionManager
                                    .clickSlot(genericContainerScreenHandler.syncId, var16, 0, SlotActionType.PICKUP, O0000000000.player)
                              );
                        }

                        this.O00000000O00.remove(var6);
                     }

                     return;
                  }
               }
            }

            if (!var3) {
               this.O00000000O00.clear();
               this.O000000000OOO.clear();
               O0000000000.player.closeHandledScreen();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         boolean var2 = this.O0000000000O0();
         if (!this.O000000000O0.O000000000("Лутающий") || var2) {
            Immediate var3 = O0000O00O0O00.O00000000();

            try {
               Vec3d var4 = O0000000000.gameRenderer.getCamera().getPos();
               Matrix4f var5 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
               VertexConsumer var6 = var3.getBuffer(O0000000O0);
               if (!var2) {
                  if (this.O00000000O000 != null) {
                     this.O00000000(var6, var5, this.O00000000O000, var4, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
                  }

                  return;
               }

               ChunkPos var7 = O0000000000.player.getChunkPos();
               int var8 = (Integer)O0000000000.options.getViewDistance().getValue();
               HashSet var9 = new HashSet();
               boolean var10 = this.O000000000O.O000000000("Варден");

               for (int var11 = var7.x - var8; var11 <= var7.x + var8; var11++) {
                  for (int var12 = var7.z - var8; var12 <= var7.z + var8; var12++) {
                     WorldChunk var13 = O0000000000.world.getChunk(var11, var12);
                     if (var13 != null) {
                        for (BlockEntity var15 : var13.getBlockEntities().values()) {
                           BlockPos var16 = var15.getPos();
                           if (this.O00000000O000 != null && var16.equals(this.O00000000O000)) {
                              this.O00000000(var6, var5, this.O00000000O000, var4, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
                           } else {
                              boolean var17 = var10 ? var15 instanceof ChestBlockEntity : var15 instanceof BarrelBlockEntity;
                              if (var17) {
                                 double var18 = var16.getX() + 0.5;
                                 double var20 = var16.getY() + 0.5;
                                 double var22 = var16.getZ() + 0.5;
                                 Iterator var24 = O0000000000.world.getEntities().iterator();

                                 while (true) {
                                    if (var24.hasNext()) {
                                       Entity var25 = (Entity)var24.next();
                                       if (!(var25 instanceof ArmorStandEntity) || !(var25.squaredDistanceTo(var18, var20, var22) <= 4.0)) {
                                          continue;
                                       }

                                       long var26 = this.O00000000(var25.getName().getString(), var10);
                                       if (var26 == -1L) {
                                          continue;
                                       }

                                       O000000000OO00.put(var16, System.currentTimeMillis() + var26);
                                       this.O00000000O0.merge(var16, var26, Long::max);
                                       if (!this.O00000000(var16, System.currentTimeMillis())) {
                                          this.O00000000O0O00.remove(var16);
                                       }
                                    }

                                    boolean var36 = false;
                                    long var37 = 0L;
                                    if (O000000000OO00.containsKey(var16)) {
                                       var37 = O000000000OO00.get(var16) - System.currentTimeMillis();
                                       if (var37 > 0L) {
                                          var36 = true;
                                          var9.add(var16);
                                          this.O000000000OOO0.add(var16);
                                          if (var37 <= 5000L && this.O000000000O0O0.O0000000000() && !this.O000000000OOOO.contains(var16)) {
                                             GpsCommand.O00000000(var16.getX(), var16.getZ());
                                             this.O000000000OOOO.add(var16);
                                          }
                                       } else {
                                          O000000000OO00.remove(var16);
                                          this.O00000000O0.remove(var16);
                                          O000000000OO0O.put(var16, System.currentTimeMillis() + 45000L);
                                       }
                                    }

                                    if (O000000000OO0O.containsKey(var16)) {
                                       if (O000000000OO0O.get(var16) - System.currentTimeMillis() > 0L) {
                                          var9.add(var16);
                                          this.O000000000OOO0.add(var16);
                                          if (this.O000000000OOOO.contains(var16) && O0000000000.player.squaredDistanceTo(var18, var20, var22) < 20.25) {
                                             this.O00000000(var16, "§aВы у цели. Метка снята.");
                                          }
                                       } else {
                                          O000000000OO0O.remove(var16);
                                          if (this.O000000000OOOO.contains(var16)) {
                                             this.O00000000(var16, "§cВремя вышло. Метка снята.");
                                          }
                                       }
                                    }

                                    Color var27;
                                    Color var28;
                                    if (var36) {
                                       float var29 = (float)(Math.sin(System.currentTimeMillis() / 150.0) * 0.15 + 0.85);
                                       if (var37 <= 20000L) {
                                          float var30 = (float)(Math.sin(System.currentTimeMillis() / 60.0) * 0.5 + 0.5);
                                          var27 = new Color(255, 140, 0, Math.min(255, (int)((80.0F + 150.0F * var30) * var29)));
                                          var28 = new Color(255, 140, 0, 0);
                                       } else {
                                          var27 = new Color(255, 0, 0, Math.min(255, (int)(150.0F * var29)));
                                          var28 = new Color(255, 0, 0, 0);
                                       }
                                    } else {
                                       var27 = new Color(0, 255, 150, 120);
                                       var28 = new Color(0, 255, 150, 0);
                                    }

                                    this.O00000000(var6, var5, var16, var4, var27, var28);
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               Iterator var34 = this.O000000000OOO0.iterator();

               while (var34.hasNext()) {
                  BlockPos var35 = (BlockPos)var34.next();
                  if (!var9.contains(var35)) {
                     var34.remove();
                     if (this.O000000000OOOO.contains(var35)) {
                        this.O000000000OOOO.remove(var35);
                        if (GpsCommand.O00000000.getX() == var35.getX() && GpsCommand.O00000000.getY() == var35.getZ()) {
                           GpsCommand.O00000000 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
                        }
                     }
                  }
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (O0000000000.world != null && O0000000000.player != null && this.O0000000000O0()) {
         RenderManager var2 = o0000000O00O.O00000000000();
         Camera var3 = O0000000000.gameRenderer.getCamera();
         Vec3d var4 = var3.getPos();
         long var5 = System.currentTimeMillis();
         HashSet var7 = new HashSet();

         for (Entry var9 : new HashMap<>(O000000000OO00).entrySet()) {
            BlockPos var10 = (BlockPos)var9.getKey();
            long var11 = (Long)var9.getValue() - var5;
            if (var11 > 0L) {
               BlockEntity var13 = O0000000000.world.getBlockEntity(var10);
               boolean var14 = this.O000000000O.O00000000000.isEmpty() || this.O000000000O.O0000000000().equalsIgnoreCase(this.O000000000O.O00000000000.get(0));
               boolean var15 = var14 ? var13 instanceof ChestBlockEntity : var13 instanceof BarrelBlockEntity;
               if (var15) {
                  Vec3d var16 = new Vec3d(var10.getX() + 0.5, var10.getY() + 1.28, var10.getZ() + 0.5);
                  if (!(var16.squaredDistanceTo(var4) < 1.0E-6)) {
                     Vec3d var17 = O0000O000OOOOO.O00000000(var16);
                     if (var17 != null && !(var17.z <= 0.001F) && !(var17.z > 1.0)) {
                        double var18 = var4.distanceTo(var16);
                        long var20 = Math.max(var11, this.O00000000O0.getOrDefault(var10, var11));
                        float var22 = MathHelper.clamp((float)var11 / (float)Math.max(1L, var20), 0.0F, 1.0F);
                        ServerDHelper.W97 var23 = this.O00000000O.computeIfAbsent(var10, blockPos -> new ServerDHelper.W97(var22));
                        var23.O00000000(true, var22);
                        var7.add(var10);
                        this.O00000000(var2, var23, (float)var17.x, (float)var17.y, (float)var18, var11);
                     }
                  }
               }
            }
         }

         Iterator var24 = this.O00000000O.entrySet().iterator();

         while (var24.hasNext()) {
            Entry var25 = (Entry)var24.next();
            if (!var7.contains(var25.getKey())) {
               ((ServerDHelper.W97)var25.getValue()).O00000000(false, 0.0F);
               if (((ServerDHelper.W97)var25.getValue()).O00000000 <= 0.02F) {
                  var24.remove();
               }
            }
         }

         this.O00000000O0.keySet().removeIf(blockPos -> !O000000000OO00.containsKey(blockPos));
      } else {
         this.O00000000O.clear();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ServerDHelper.W97 o000000000, float f, float g, float h, long l) {
      float var8 = this.O00000000(o000000000.O00000000);
      if (!(var8 <= 0.03F)) {
         float var9 = (float)MathHelper.clamp(16.0 / Math.max((double)h, 12.0), 0.75, 1.15);
         float var10 = 6.0F * var9;
         float var11 = 4.0F * var9;
         float var12 = 23.0F * var9;
         float var13 = 22.0F * var9;
         float var14 = 18.0F * var9;
         float var15 = 4.0F * var9;
         String var16 = "КД";
         String var17 = this.O000000000(l);
         float var18 = RenderManager.O00000000(FontRegistry.O00000000, var16, var14).O00000000;
         float var19 = RenderManager.O00000000(FontRegistry.O00000000000, var17, var13).O00000000;
         float var20 = Math.max(48.0F * var9, var15 + var19 + var11 * 2.0F);
         float var21 = 0.88F + 0.12F * var8;
         float var22 = f - var20 / 2.0F;
         float var23 = g - var12 - 8.0F * var9 - (1.0F - var8) * 7.0F * var9;
         float var24 = var22 + var20 / 2.0F;
         float var25 = var23 + var12 / 2.0F;
         float var26 = 1.0F - MathHelper.clamp((float)l / 20000.0F, 0.0F, 1.0F);
         float var27 = var26 * (0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 90.0));
         int var28 = this.O00000000(RenderManager.W382.O0000000000(255, 70, 70, 255), RenderManager.W382.O0000000000(255, 175, 60, 255), var27);
         int var29 = this.O00000000(RenderManager.W382.O0000000000(25, 25, 26, 235), var8);
         int var30 = this.O00000000(RenderManager.W382.O0000000000(78, 78, 78, 176), var8);
         int var31 = this.O00000000(RenderManager.W382.O0000000000(160, 160, 165, 255), var8);
         int var32 = this.O00000000(RenderManager.W382.O0000000000(245, 245, 245, 255), var8);
         int var33 = this.O00000000(RenderManager.W382.O0000000000(0, 0, 0, 105), var8);
         int var34 = this.O00000000(var28, var8);
         o0000O00OO0O0.O0000000000(var21, var21, var24, var25);
         o0000O00OO0O0.O00000000(var22, var23, var20, var12, var10, var29);
         o0000O00OO0O0.O00000000(var22, var23, var20, var12, var10, var30, Math.max(1.0F, 0.8F * var9));
         float var35 = var23 + 15.3F * var9;
         float var36 = var22 + var11;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var36 + var15, var35, var13, var17, var32);
         o0000O00OO0O0.O00000000000O0();
      }
   }

   private String O000000000(long l) {
      long var3 = Math.max(0L, (l + 999L) / 1000L);
      long var5 = var3 / 3600L;
      long var7 = var3 % 3600L / 60L;
      long var9 = var3 % 60L;
      return var5 > 0L ? String.format(Locale.ROOT, "%d:%02d:%02d", var5, var7, var9) : String.format(Locale.ROOT, "%02d:%02d", var7, var9);
   }

   private float O00000000(float f) {
      float var2 = MathHelper.clamp(f, 0.0F, 1.0F);
      return 1.0F - (float)Math.pow(1.0F - var2, 3.0);
   }

   private int O00000000(int i, int j, float f) {
      float var4 = MathHelper.clamp(f, 0.0F, 1.0F);
      int var5 = i >> 24 & 0xFF;
      int var6 = i >> 16 & 0xFF;
      int var7 = i >> 8 & 0xFF;
      int var8 = i & 0xFF;
      int var9 = j >> 24 & 0xFF;
      int var10 = j >> 16 & 0xFF;
      int var11 = j >> 8 & 0xFF;
      int var12 = j & 0xFF;
      int var13 = (int)(var5 + (var9 - var5) * var4);
      int var14 = (int)(var6 + (var10 - var6) * var4);
      int var15 = (int)(var7 + (var11 - var7) * var4);
      int var16 = (int)(var8 + (var12 - var8) * var4);
      return RenderManager.W382.O0000000000(var14, var15, var16, var13);
   }

   private int O00000000(int i, float f) {
      int var3 = i >> 24 & 0xFF;
      int var4 = i >> 16 & 0xFF;
      int var5 = i >> 8 & 0xFF;
      int var6 = i & 0xFF;
      int var7 = (int)MathHelper.clamp(var3 * f, 0.0F, 255.0F);
      return RenderManager.W382.O0000000000(var4, var5, var6, var7);
   }

   private void O00000000(BlockPos blockPos, String string) {
      O000000000OO0O.remove(blockPos);
      this.O000000000OOOO.remove(blockPos);
      if (GpsCommand.O00000000.getX() == blockPos.getX() && GpsCommand.O00000000.getY() == blockPos.getZ()) {
         GpsCommand.O00000000 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
         ChatUtil.O00000000("§8[§6ServerDHelper§8] " + string);
      }
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

   private long O00000000(String string, boolean bl) {
      if (bl) {
         Matcher var3 = O00000000OOO.matcher(string);
         if (var3.find()) {
            try {
               return (Integer.parseInt(var3.group(1)) * 60L + Integer.parseInt(var3.group(2))) * 1000L;
            } catch (NumberFormatException var8) {
            }
         }
      } else {
         Matcher var9 = O00000000OOO0.matcher(string);
         if (var9.find()) {
            try {
               int var10 = Integer.parseInt(var9.group(1));
               int var5 = Integer.parseInt(var9.group(2));
               return var9.group(3) != null ? (var10 * 3600L + var5 * 60L + Integer.parseInt(var9.group(3))) * 1000L : (var10 * 60L + var5) * 1000L;
            } catch (NumberFormatException var7) {
            }
         }

         Matcher var4 = O00000000OOO00.matcher(string);
         if (var4.find()) {
            try {
               return Integer.parseInt(var4.group(1)) * 1000L;
            } catch (NumberFormatException var6) {
            }
         }
      }

      return -1L;
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

   private String O000000000(ItemStack itemStack) {
      return itemStack.getItem().toString() + "|" + itemStack.getName().getString();
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

   private boolean O0000000000(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else {
         String var2 = itemStack.getName().getString();
         if (var2.contains("[★]")) {
            return true;
         } else {
            Item var3 = itemStack.getItem();
            if (this.O000000000O0O.O000000000("Дон зелья") && this.O00000000000(itemStack)) {
               return true;
            } else if (this.O000000000O0O.O000000000("Сферы") && this.O000000000000(itemStack)) {
               return true;
            } else if (this.O000000000O0O.O000000000("Талисманы") && this.O0000000000000(itemStack)) {
               return true;
            } else if (!this.O000000000O0O.O000000000("Стрелы") || var3 != Items.ARROW && var3 != Items.TIPPED_ARROW && var3 != Items.SPECTRAL_ARROW) {
               return this.O000000000O0O.O000000000("Яйца") && var3 instanceof SpawnEggItem
                  ? true
                  : this.O000000000O0O.O000000000("Ценные предметы") && this.O000000000000O(itemStack);
            } else {
               return true;
            }
         }
      }
   }

   private boolean O00000000000(ItemStack itemStack) {
      return O000000OOOO00.O000000000O0(itemStack)
         || O000000OOOO00.O000000000O00(itemStack)
         || O000000OOOO00.O000000000O000(itemStack)
         || O000000OOOO00.O000000000O00O(itemStack)
         || O000000OOOO00.O000000000O0O(itemStack)
         || O000000OOOO00.O000000000O0O0(itemStack)
         || O000000OOOO00.O000000000O0OO(itemStack);
   }

   private boolean O000000000000(ItemStack itemStack) {
      return O000000OOOO00.O00000000(itemStack)
         || O000000OOOO00.O000000000(itemStack)
         || O000000OOOO00.O0000000000(itemStack)
         || O000000OOOO00.O00000000000(itemStack)
         || O000000OOOO00.O000000000000(itemStack)
         || O000000OOOO00.O0000000000000(itemStack)
         || O000000OOOO00.O000000000000O(itemStack)
         || O000000OOOO00.O00000000000O(itemStack)
         || O000000OOOO00.O00000000000O0(itemStack);
   }

   private boolean O0000000000000(ItemStack itemStack) {
      return O000000OOOO00.O00000000000OO(itemStack)
         || O000000OOOO00.O0000000000O(itemStack)
         || O000000OOOO00.O0000000000O0(itemStack)
         || O000000OOOO00.O0000000000O00(itemStack)
         || O000000OOOO00.O0000000000O0O(itemStack)
         || O000000OOOO00.O0000000000OO(itemStack)
         || O000000OOOO00.O0000000000OO0(itemStack)
         || O000000OOOO00.O0000000000OOO(itemStack);
   }

   private boolean O000000000000O(ItemStack itemStack) {
      Item var2 = itemStack.getItem();
      if (var2 instanceof BlockItem var3 && var3.getBlock() instanceof AbstractSkullBlock) {
         return true;
      } else if (var2 == Items.TOTEM_OF_UNDYING || var2 == Items.PAPER || var2 == Items.IRON_NUGGET || var2 == Items.TRIPWIRE_HOOK) {
         return true;
      } else if (var2 == Items.GUNPOWDER || var2 == Items.TNT || var2 == Items.NETHERITE_INGOT || var2 == Items.NETHER_STAR || var2 == Items.ENDER_EYE) {
         return true;
      } else if (var2 == Items.SNOWBALL || var2 == Items.SUGAR || var2 == Items.PHANTOM_MEMBRANE) {
         return true;
      } else {
         return var2 != Items.NETHERITE_SCRAP && var2 != Items.ELYTRA
            ? var2 == Items.CAMPFIRE
               || var2 == Items.SOUL_CAMPFIRE
               || var2 == Items.BEACON
               || var2 == Items.ENCHANTED_GOLDEN_APPLE
               || var2 == Items.GOLDEN_APPLE
               || var2 == Items.SPAWNER
            : true;
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString();
         if (var4.contains("Данная команда недоступна в режиме AFK")
            && !this.O00000000O0OOO
            && O0000000000.player != null
            && O0000000000.player.networkHandler != null) {
            O0000O000OOOO.O00000000.O00000000();
            this.O00000000OO0 = O0000O000OOOO.O00000000.O0000000000();
            O0000000000.player.networkHandler.sendChatCommand("hub");
            this.O00000000O0OOO = true;
            this.O00000000OO.O00000000();
            if (this.O0000000000OO()) {
               O0000000000.player.closeHandledScreen();
            }

            this.O00000000O000O = ServerDHelper.W98.IDLE;
         }
      }
   }

   static enum W96 {
      IDLE,
      ROTATING,
      OPENING,
      WAITING_SCREEN;
   }

   static class W97 {
      float O00000000;
      private float O000000000;
      private long O0000000000;

      W97(float f) {
         this.O000000000 = f;
         this.O0000000000 = System.currentTimeMillis();
      }

      void O00000000(boolean bl, float f) {
         long var3 = System.currentTimeMillis();
         float var5 = MathHelper.clamp((float)(var3 - this.O0000000000) / 16.666F, 0.5F, 3.0F);
         this.O0000000000 = var3;
         this.O00000000 = this.O00000000 + ((bl ? 1.0F : 0.0F) - this.O00000000) * MathHelper.clamp(0.18F * var5, 0.0F, 1.0F);
         this.O000000000 = this.O000000000 + (MathHelper.clamp(f, 0.0F, 1.0F) - this.O000000000) * MathHelper.clamp(0.12F * var5, 0.0F, 1.0F);
      }
   }

   static enum W98 {
      IDLE,
      ROTATING,
      OPENING,
      REOPEN_CLAN;
   }
}
