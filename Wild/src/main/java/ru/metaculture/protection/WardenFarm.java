package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.pathing.goals.GoalXZ;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.block.AbstractCandleBlock;
import net.minecraft.block.AbstractSkullBlock;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PointedDripstoneBlock;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import net.minecraft.world.chunk.WorldChunk;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "WardenFarm",
   O0000000000 = Category.Misc,
   O000000000 = "Умный авто-фарм Варден данжа"
)
public class WardenFarm extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим", "Варден", "Варден", "Медный данж");
   public final GroupSetting O000000000O0 = new GroupSetting(
      "Предметы для лута",
      new BooleanSetting("Дон зелья", false),
      new BooleanSetting("Сферы", true),
      new BooleanSetting("Талисманы", true),
      new BooleanSetting("Стрелы", false),
      new BooleanSetting("Оружие", false),
      new BooleanSetting("Броня", false),
      new BooleanSetting("Ценные предметы", true),
      new BooleanSetting("Яйца", false)
   );
   public final BooleanSetting O000000000O00 = new BooleanSetting("Стелс режим (Варден)", true);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Отходить после лута", true);
   public final BooleanSetting O000000000O00O = new BooleanSetting("Подбирать лут после смерти", true);
   public final BooleanSetting O000000000O0O = new BooleanSetting("Освобождать хотбар", true);
   public final NumberSetting O000000000O0O0 = new NumberSetting("Ждать сундук до (сек)", 240.0F, 5.0F, 600.0F, 10.0F, false);
   public final BooleanSetting O000000000O0OO = new BooleanSetting("Авто еда и инвиз", true);
   public final BooleanSetting O000000000OO = new BooleanSetting("Зелья скорости (брать и пить)", true).O00000000(() -> !this.O000000000O0OO.O0000000000());
   public final BooleanSetting O000000000OO0 = new BooleanSetting("Складывать дроп", true);
   public final ModeSetting O000000000OO00 = new ModeSetting("Куда складывать", "Ресы", "Ресы", "В клан").O00000000(() -> !this.O000000000OO0.O0000000000());
   public final BooleanSetting O000000000OO0O = new BooleanSetting("Свапать анархии", true);
   public final TextSetting O000000000OOO = new TextSetting("Анархии для фарма", "903,102,504").O00000000(() -> !this.O000000000OO0O.O0000000000());
   public final TextSetting O000000000OOO0 = new TextSetting("Базовая анархия", "109").O00000000(() -> !this.O000000000OO0O.O0000000000());
   public final TextSetting O000000000OOOO = new TextSetting("Хом для вардена", "warden").O00000000(() -> !this.O000000000OO0O.O0000000000());
   private final Map<String, Map<BlockPos, Long>> O00000000O = new ConcurrentHashMap<>();
   private final Map<String, Map<BlockPos, Long>> O00000000O0 = new ConcurrentHashMap<>();
   private final Map<String, Integer> O00000000O00 = new HashMap<>();
   private final List<BlockPos> O00000000O000 = new ArrayList<>();
   private final Queue<Runnable> O00000000O0000 = new ArrayDeque<>();
   private String O00000000O000O = "UNKNOWN";
   private Map<BlockPos, Long> O00000000O00O = new ConcurrentHashMap<>();
   private Map<BlockPos, Long> O00000000O00O0 = new ConcurrentHashMap<>();
   private IBaritone O00000000O00OO;
   private WardenFarm.W110 O00000000O0O = WardenFarm.W110.SEARCHING;
   private BlockPos O00000000O0O0 = null;
   private BlockPos O00000000O0O00 = null;
   private double O00000000O0O0O = -1.0;
   private final O0000O00O0000 O00000000O0OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0OO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0OOO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO00 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO000 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO00O = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO0O = new O0000O00O0000();
   private boolean O00000000OO0O0 = false;
   private long O00000000OO0OO = 0L;
   private String O00000000OOO = "N/A";
   private int O00000000OOO0 = 0;
   private boolean O00000000OOO00 = true;
   private BlockPos O00000000OOO0O = null;
   private int O00000000OOOO = 0;
   private int O00000000OOOO0 = -1;
   private static final Pattern O00000000OOOOO = Pattern.compile("(\\d{1,2}):(\\d{1,2})");
   private static final Pattern O0000000O = Pattern.compile("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?");
   private static final Pattern O0000000O0 = Pattern.compile("(\\d+)\\s*(с|s|сек|sec)");
   private static final Pattern O0000000O00 = Pattern.compile(
      "Смерть на координатах \\[(-?\\d+(?:[.,]\\d+)?),\\s*(-?\\d+(?:[.,]\\d+)?),\\s*(-?\\d+(?:[.,]\\d+)?)]"
   );
   private static final double O0000000O000 = -2000.0;
   private static final double O0000000O0000 = -2000.0;
   private static final double O0000000O00000 = 2000.0;
   private static final double O0000000O0000O = 2000.0;
   private static final double O0000000O000O = 62500.0;
   private static final double O0000000O000O0 = -2068.0;
   private static final double O0000000O000OO = -1932.0;
   private static final double O0000000O00O = -60.0;
   private static final double O0000000O00O0 = -20.0;
   private static final double O0000000O00O00 = -2066.0;
   private static final double O0000000O00O0O = -1934.0;
   private static final long O0000000O00OO = 3000L;
   private static final double O0000000O00OO0 = 3.0;
   private static final long O0000000O00OOO = 5000L;
   private static final int O0000000O0O = 1;
   private static final int O0000000O0O0 = 3;
   private static final int O0000000O0O00 = 1;
   private static final int O0000000O0O000 = 16;
   private static final double O0000000O0O00O = 24.0;
   private static final double O0000000O0O0O = 40.0;
   private static final double O0000000O0O0O0 = 16.0;
   private static final long O0000000O0O0OO = 270000L;
   private static final long O0000000O0OO = 1200L;
   private static final long O0000000O0OO0 = 4000L;
   private static final double O0000000O0OO00 = 4.0;
   private static final long O0000000O0OO0O = 1500L;
   private static final long O0000000O0OOO = 250L;
   private static final double O0000000O0OOO0 = 14.0;
   private static final long O0000000O0OOOO = 15000L;
   private static final String[] O0000000OO = new String[]{"ресы", "ресурс"};
   private static final String[] O0000000OO0 = new String[]{"кит", "kit", "инвиз", "invis", "зель", "морков", "carrot", "припас", "скор", "speed"};
   private long O0000000OO00 = 0L;
   private Runnable O0000000OO000 = null;
   private boolean O0000000OO0000 = false;
   private final Set<BlockPos> O0000000OO000O = new HashSet<>();
   private BlockPos O0000000OO00O = null;
   private int O0000000OO00O0 = 0;
   private WardenFarm.W113 O0000000OO00OO = WardenFarm.W113.NONE;
   private int[] O0000000OO0O = null;
   private BlockPos O0000000OO0O0 = null;
   private long O0000000OO0O00 = 0L;
   private boolean O0000000OO0O0O = false;
   private long O0000000OO0OO = 0L;
   private BlockPos O0000000OO0OO0 = null;
   private long O0000000OO0OOO = 0L;
   private WardenFarm.W112 O0000000OOO = WardenFarm.W112.NONE;
   private WardenFarm.W111 O0000000OOO0 = WardenFarm.W111.FIND;
   private BlockPos O0000000OOO00 = null;
   private String O0000000OOO000 = "N/A";
   private boolean O0000000OOO00O = false;
   private boolean O0000000OOO0O = false;
   private boolean O0000000OOO0O0 = false;
   private boolean O0000000OOO0OO = false;
   private boolean O0000000OOOO = false;
   private WardenFarm.W114 O0000000OOOO0 = WardenFarm.W114.NONE;
   private boolean O0000000OOOO00 = false;
   private boolean O0000000OOOO0O = false;
   private int O0000000OOOOO = 0;
   private final Set<BlockPos> O0000000OOOOO0 = new HashSet<>();
   private int O0000000OOOOOO = -1;
   private final O000000OO O000000O0 = new O000000OO();
   private double O000000O00;
   private double O000000O000;
   private long O000000O0000 = 0L;
   private List<Block> O000000O00000 = null;
   private Vec3d O000000O000000 = null;
   private long O000000O00000O = 0L;
   private long O000000O0000O = 0L;
   private WardenFarm.W109 O000000O0000O0 = WardenFarm.W109.NONE;
   private int O000000O0000OO = -1;
   private int O000000O000O = -1;
   private final O0000O00O0000 O000000O000O0 = new O0000O00O0000();
   private final O0000O00O0000 O000000O000O00 = new O0000O00O0000();
   private final O0000O00O0000 O000000O000O0O = new O0000O00O0000();
   private long O000000O000OO = 0L;
   private boolean O000000O000OO0 = false;
   private long O000000O000OOO = 0L;
   private boolean O000000O00O = false;
   private long O000000O00O0 = 0L;
   private static final int O000000O00O00 = 1024;
   private static final RenderPipeline O000000O00O000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "block_esp_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000O00O00O = RenderLayer.of(
      "chest_esp_box", 1024, false, true, O000000O00O000, MultiPhaseParameters.builder().build(false)
   );

   public WardenFarm() {
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
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0,
            this.O000000000OOOO
         }
      );
   }

   @Override
   public void O00000000() {
      O000000O0O00O.O00000000 = true;
      super.O00000000();
      this.O00000000O00OO = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.O00000000OOO00 = (Boolean)BaritoneAPI.getSettings().allowSprint.value;
      this.O00000000OOO0();
      this.O000000O00 = Math.random() * Math.PI * 2.0;
      this.O000000O000 = Math.random() * Math.PI * 2.0;
      this.O00000000OO.O00000000();
      this.O0000000000O00();
      O0000O000OOOO.O00000000.O00000000();
      if (this.O000000000O0OO.O0000000000()
         && this.O000000000OO0O.O0000000000()
         && this.O0000000000(O0000O000OOOO.O00000000.O0000000000())
         && this.O0000000O0O0O0()) {
         this.O0000000O00OOO();
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      if (this.O00000000O00OO != null) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
         BaritoneAPI.getSettings().allowSprint.value = this.O00000000OOO00;
      }

      this.O00000000OOO00();
      if (O0000000000.player != null) {
         O0000000000.player.setSneaking(false);
      }

      this.O0000000OO000();
      this.O0000000000O00();
      this.O000000O0.O00000000();
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
   }

   private void O0000000000O0() {
      if (this.O00000000OO000.O000000000000(1000L)) {
         O0000O000OOOO.O00000000.O00000000();
         String var1 = O0000O000OOOO.O00000000.O0000000000();
         String var2 = var1 != null && !var1.equals("N/A") ? var1 : "UNKNOWN";
         if (!var2.equals(this.O00000000O000O)) {
            this.O00000000O000O = var2;
            this.O00000000O00O = this.O00000000O.computeIfAbsent(this.O00000000O000O, string -> new ConcurrentHashMap<>());
            this.O00000000O00O0 = this.O00000000O0.computeIfAbsent(this.O00000000O000O, string -> new ConcurrentHashMap<>());
         }

         this.O00000000OO000.O00000000();
      }
   }

   private void O0000000000O00() {
      this.O00000000O000.clear();
      this.O00000000O00.clear();
      this.O00000000O0000.clear();
      this.O0000000OO000O.clear();
      this.O0000000OO00O = null;
      this.O0000000OO00O0 = 0;
      this.O0000000OO00OO = WardenFarm.W113.NONE;
      this.O00000000O0O0 = null;
      this.O00000000O0O00 = null;
      this.O00000000O0O0O = -1.0;
      this.O000000O000OOO = 0L;
      this.O000000O00O = false;
      this.O0000000OO0O = null;
      this.O0000000OO0O0 = null;
      this.O0000000OO0O00 = 0L;
      this.O00000000OO0();
      this.O0000000OO0OO0 = null;
      this.O0000000OO0OOO = 0L;
      this.O00000000O0O = WardenFarm.W110.SEARCHING;
      this.O00000000OO0O0 = false;
      this.O0000000OO00 = 0L;
      this.O0000000OO000 = null;
      this.O0000000OO0000 = false;
      this.O000000O000OO0 = false;
      this.O0000000OOO0O = false;
      this.O0000000O00O();
      this.O00000000OO00.O00000000();
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O00000000O000.clear();
      this.O0000000OO000O.clear();
      this.O00000000O0O0 = null;
      this.O0000000OO0O = null;
      this.O00000000O0O0O = -1.0;
      this.O0000000OO0OO0 = null;
      this.O0000000OO0OOO = 0L;
      this.O00000000OO0();
      this.O00000000OO.O00000000();
      this.O00000000O000O = "UNKNOWN";
      if (this.O0000000OOO == WardenFarm.W112.NONE
         && this.O00000000O0O != WardenFarm.W110.HUB_WAITING_FOR_CHEST
         && this.O00000000O0O != WardenFarm.W110.SWAPPING_TO_SAVE_ANARCHY
         && this.O00000000O0O != WardenFarm.W110.GOING_TO_STASH
         && this.O00000000O0O != WardenFarm.W110.OPENING_STASH
         && this.O00000000O0O != WardenFarm.W110.ROTATING_STASH
         && this.O00000000O0O != WardenFarm.W110.OPENING_STASH_BLOCK
         && this.O00000000O0O != WardenFarm.W110.WAITING_FOR_GUI_STASH
         && this.O00000000O0O != WardenFarm.W110.STORING_IN_CHEST) {
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      }
   }

   private boolean O00000000(Vec3d vec3d) {
      return this.O000000000O.O000000000("Варден")
         ? (vec3d.x - -2000.0) * (vec3d.x - -2000.0) + (vec3d.z - -2000.0) * (vec3d.z - -2000.0) <= 62500.0
         : (vec3d.x - 2000.0) * (vec3d.x - 2000.0) + (vec3d.z - 2000.0) * (vec3d.z - 2000.0) <= 62500.0;
   }

   private boolean O0000000000O0O() {
      return O0000000000.player == null ? false : this.O00000000(O0000000000.player.getPos());
   }

   private boolean O000000000(Vec3d vec3d) {
      return !this.O000000000O.O000000000("Варден")
         ? this.O00000000(vec3d)
         : vec3d.x >= -2068.0 && vec3d.x <= -1932.0 && vec3d.y >= -60.0 && vec3d.y <= -20.0 && vec3d.z >= -2066.0 && vec3d.z <= -1934.0;
   }

   private int[] O0000000000OO() {
      if (this.O000000000O.O000000000("Варден")) {
         int var7 = (int)(-2068.0 + Math.random() * 136.0);
         int var2 = (int)(-2066.0 + Math.random() * 132.0);
         return new int[]{var7, var2};
      } else {
         double var1 = Math.random() * Math.PI * 2.0;
         double var3 = Math.sqrt(Math.random()) * 240.0;
         int var5 = (int)(2000.0 + var3 * Math.cos(var1));
         int var6 = (int)(2000.0 + var3 * Math.sin(var1));
         return new int[]{var5, var6};
      }
   }

   private long O00000000(BlockPos blockPos) {
      long var2 = this.O00000000O00O.getOrDefault(blockPos, 0L);
      long var4 = 0L;

      try {
         var4 = ServerDHelper.O000000000OO00.getOrDefault(blockPos, 0L);
      } catch (Exception var7) {
      }

      return Math.max(var2, var4);
   }

   private String O0000000000OO0() {
      String[] var1 = this.O000000000OOO.O0000000000().split(",");
      if (var1.length != 0 && !var1[0].trim().isEmpty()) {
         this.O00000000OOO0 = (this.O00000000OOO0 + 1) % var1.length;
         return var1[this.O00000000OOO0].trim();
      } else {
         return this.O000000000OOO0.O0000000000();
      }
   }

   private boolean O0000000000OOO() {
      boolean var1;
      if (O0000O000OOOO.O000000000()) {
         var1 = true;
      } else if (PvPSafe.O0000000000O00()) {
         if (this.O000000O00O0 == 0L) {
            this.O000000O00O0 = System.currentTimeMillis();
         }

         var1 = System.currentTimeMillis() - this.O000000O00O0 <= 90000L;
      } else {
         this.O000000O00O0 = 0L;
         var1 = false;
      }

      if (var1) {
         this.O000000O000OO = System.currentTimeMillis();
      }

      return var1;
   }

   private boolean O000000000O() {
      return this.O000000O000OO > 0L && System.currentTimeMillis() - this.O000000O000OO < 1500L;
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (this.O00000000OO.O000000000000(1000L)) {
            this.O0000000000O0();
            this.O000000000O0();
            if (!O0000000000.player.isDead() && !(O0000000000.currentScreen instanceof DeathScreen)) {
               if (!(O0000000000.currentScreen instanceof GenericContainerScreen)) {
                  this.O00000000OOOO0 = -1;
               }

               if (!this.O0000000000O0O()) {
                  this.O00000000OO0();
               }

               if (!this.O0000000OO0000()) {
                  this.O00000000OOO0O();
                  if (this.O0000000OO0000 && !this.O000000000O0O0()) {
                     this.O0000000OO0000 = false;
                     this.O0000000O0000O();
                  } else if (this.O0000000OOO != WardenFarm.W112.NONE) {
                     if (O0000000000.currentScreen instanceof GenericContainerScreen var12) {
                        this.O00000000O00OO.getPathingBehavior().cancelEverything();
                        if (this.O00000000(var12)) {
                           this.O0000000OOO0 = WardenFarm.W111.WAIT_GUI;
                           this.O00000000000((GenericContainerScreenHandler)var12.getScreenHandler());
                        }
                     } else {
                        this.O0000000O0OO00();
                     }
                  } else if (this.O0000000OOOO0 == WardenFarm.W114.NONE || !this.O0000000O00O0O()) {
                     if (this.O0000000OOO00O && !O0000000000.player.isDead() && !(O0000000000.currentScreen instanceof DeathScreen)) {
                        this.O0000000OOO00O = false;
                        this.O000000000O000();
                     } else if (this.O00000000OO0O0) {
                        if (System.currentTimeMillis() >= this.O00000000OO0OO) {
                           O0000O000OOOO.O00000000.O00000000();
                           String var11 = O0000O000OOOO.O00000000.O0000000000();
                           String var13 = !"N/A".equals(this.O00000000OOO) && this.O00000000OOO != null ? this.O00000000OOO : this.O0000000O0O00();
                           if ("N/A".equals(var11) || !var11.equals(var13) && !this.O0000000000(var11)) {
                              if (!this.O000000000O0O0() && !"N/A".equals(var13)) {
                                 O0000000000.player.networkHandler.sendChatCommand("an" + var13);
                                 this.O00000000OO0OO = System.currentTimeMillis() + 8000L;
                              } else {
                                 this.O00000000OO0OO = System.currentTimeMillis() + 2000L;
                              }
                           } else {
                              this.O00000000OO0O0 = false;
                              this.O00000000O0OOO.O00000000();
                              this.O00000000O0O = WardenFarm.W110.SEARCHING;
                              this.O00000000OO00.O00000000();
                           }
                        }
                     } else if (this.O00000000O0O == WardenFarm.W110.HUB_WAITING_FOR_CHEST) {
                        if (this.O00000000O0O00 != null) {
                           long var10 = this.O00000000(this.O00000000O0O00) - System.currentTimeMillis();
                           if (var10 <= 2000L) {
                              this.O00000000O0O = WardenFarm.W110.SEARCHING;
                              this.O00000000OO00.O00000000();
                              this.O00000000OO0O0 = true;
                              this.O00000000OO0OO = System.currentTimeMillis();
                           }
                        } else {
                           this.O00000000O0O = WardenFarm.W110.SEARCHING;
                           this.O00000000OO00.O00000000();
                        }
                     } else {
                        if (this.O0000000OOO == WardenFarm.W112.NONE && this.O0000000OOOO0 == WardenFarm.W114.NONE && !this.O0000000000O0O()) {
                           if ("UNKNOWN".equals(this.O00000000O000O)) {
                              if (this.O000000O0000 == 0L) {
                                 this.O000000O0000 = System.currentTimeMillis();
                              } else if (System.currentTimeMillis() - this.O000000O0000 > 15000L) {
                                 this.O000000O0000 = 0L;
                                 this.O00000000OO0O0 = true;
                                 this.O00000000OO0OO = System.currentTimeMillis();
                                 return;
                              }
                           } else {
                              this.O000000O0000 = 0L;
                           }
                        }

                        boolean var2 = this.O0000000OOO != WardenFarm.W112.NONE;
                        boolean var3 = this.O00000000O0O == WardenFarm.W110.SWAPPING_TO_SAVE_ANARCHY
                           || this.O00000000O0O == WardenFarm.W110.GOING_TO_STASH
                           || this.O00000000O0O == WardenFarm.W110.OPENING_STASH
                           || this.O00000000O0O == WardenFarm.W110.ROTATING_STASH
                           || this.O00000000O0O == WardenFarm.W110.OPENING_STASH_BLOCK
                           || this.O00000000O0O == WardenFarm.W110.WAITING_FOR_GUI_STASH
                           || this.O00000000O0O == WardenFarm.W110.STORING_IN_CHEST;
                        boolean var4 = O0000000000.currentScreen instanceof GenericContainerScreen;
                        if (this.O00000000O00OO != null) {
                           if (!this.O0000000000O0O() && !var3 && !var2 && !var4) {
                              if (!this.O0000000OOO0O || !this.O0000000O00OO()) {
                                 if (this.O0000000000(O0000O000OOOO.O00000000.O0000000000())
                                    && (this.O0000000OOOO0 != WardenFarm.W114.NONE || this.O0000000O00O00())) {
                                    ;
                                 }
                              }
                           } else {
                              if (this.O0000000000O0O()) {
                                 this.O0000000OOO0O = false;
                                 this.O00000000OO();
                                 this.O0000000O0OOO();
                                 if (this.O00000000OO00O.O000000000000(500L)) {
                                    this.O00000000OO00();
                                    this.O00000000OO00O.O00000000();
                                 }
                              }

                              if (this.O000000O0000O0 != WardenFarm.W109.NONE && O0000000000.currentScreen == null) {
                                 if (this.O0000000000O0O()) {
                                    this.O00000000O00OO.getPathingBehavior().cancelEverything();
                                    if (O0000000000.player.isSprinting()) {
                                       O0000000000.player.setSprinting(false);
                                    }

                                    return;
                                 }

                                 this.O0000000OO000();
                              }

                              if (!(O0000000000.currentScreen instanceof GenericContainerScreen var5)) {
                                 switch (this.O00000000O0O) {
                                    case SEARCHING:
                                       this.O000000000OO0();
                                       break;
                                    case GOING_TO_CHEST:
                                       this.O000000000OO0O();
                                       break;
                                    case ROTATING:
                                       this.O000000000OOO();
                                       break;
                                    case OPENING:
                                       this.O000000000OOO0();
                                       break;
                                    case WAITING_FOR_GUI:
                                       this.O00000000O0OO0();
                                       break;
                                    case RETREATING:
                                       this.O00000000O000();
                                       break;
                                    case GOING_TO_DEATH_LOOT:
                                       this.O00000000O000O();
                                       break;
                                    case COLLECTING_DEATH_LOOT:
                                       this.O00000000O00O();
                                    case HUB_WAITING_FOR_CHEST:
                                    default:
                                       break;
                                    case SWAPPING_TO_SAVE_ANARCHY:
                                       this.O00000000O00OO();
                                       break;
                                    case GOING_TO_STASH:
                                       this.O00000000O0O();
                                       break;
                                    case OPENING_STASH:
                                       this.O00000000O0OO();
                                       break;
                                    case ROTATING_STASH:
                                       this.O00000000O0O0();
                                       break;
                                    case OPENING_STASH_BLOCK:
                                       this.O00000000O0O00();
                                       break;
                                    case WAITING_FOR_GUI_STASH:
                                       this.O00000000O0O0O();
                                 }

                                 if (this.O0000000OOO == WardenFarm.W112.NONE) {
                                    this.O000000000O0O();
                                 }
                              } else {
                                 this.O00000000O00OO.getPathingBehavior().cancelEverything();
                                 String var15 = var5.getTitle().getString().toLowerCase().replaceAll("§.", "").trim();
                                 boolean var7 = var15.contains("клан") || var15.contains("clan") || var15.contains("хранилище");
                                 boolean var8 = this.O000000000O.O000000000("Варден")
                                    ? var15.equals("сундук") || var15.equals("большой сундук") || var15.equals("chest") || var15.equals("large chest")
                                    : var15.equals("бочка") || var15.equals("barrel");
                                 boolean var9 = this.O00000000O0O == WardenFarm.W110.WAITING_FOR_GUI_STASH
                                    || this.O00000000O0O == WardenFarm.W110.STORING_IN_CHEST
                                    || !this.O0000000000O0O() && this.O000000000OO0.O0000000000() && this.O0000000O0O000() && this.O0000000O000O();
                                 if (var7 && this.O000000000OO00.O000000000("В клан")) {
                                    this.O0000000000((GenericContainerScreenHandler)var5.getScreenHandler());
                                 } else if (var9) {
                                    this.O00000000O0O = WardenFarm.W110.STORING_IN_CHEST;
                                    this.O0000000000((GenericContainerScreenHandler)var5.getScreenHandler());
                                 } else if (this.O0000000000O0O() && var8) {
                                    this.O00000000((GenericContainerScreenHandler)var5.getScreenHandler());
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.O000000000O00();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && o0000000O000OO.O000000000000() == ru.metaculture.protection.O0000000O000OO.W24.RECEIVE) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var12 = var2.content().getString();
            if (this.O000000000O00O.O0000000000()) {
               Matcher var4 = O0000000O00.matcher(var12);
               if (var4.find()) {
                  try {
                     double var5 = Double.parseDouble(var4.group(1).replace(',', '.'));
                     double var7 = Double.parseDouble(var4.group(2).replace(',', '.'));
                     double var9 = Double.parseDouble(var4.group(3).replace(',', '.'));
                     if (this.O000000000(new Vec3d(var5, var7, var9))) {
                        this.O0000000OO0O0 = BlockPos.ofFloored(var5, var7, var9);
                        this.O0000000OO0O00 = System.currentTimeMillis() + 270000L;
                     }
                  } catch (NumberFormatException var11) {
                  }
               }
            }

            if (this.O0000000OOOO0 != WardenFarm.W114.NONE || this.O0000000OOO == WardenFarm.W112.TELEPORT_WARDEN) {
               if (this.O00000000000(var12)) {
                  this.O0000000OOO0OO = true;
               }
            }
         }
      }
   }

   private void O000000000O0() {
      if (this.O000000000O0OO.O0000000000() && this.O000000000OO0O.O0000000000() && O0000000000.player != null) {
         if (O0000000000.currentScreen instanceof DeathScreen || O0000000000.player.isDead()) {
            if (this.O0000000O0O00O()) {
               if (!this.O0000000OOO00O) {
                  O0000O000OOOO.O00000000.O00000000();
                  String var1 = O0000O000OOOO.O00000000.O0000000000();
                  if (!"N/A".equals(var1)) {
                     this.O0000000OOO000 = var1;
                  }

                  this.O0000000O00O0();
                  this.O0000000O00O();
                  this.O0000000OOO00O = true;
                  this.O0000000OOO0O = true;
                  this.O00000000O00.clear();
                  this.O00000000O0000.clear();
                  this.O000000O000OO0 = false;
                  this.O0000000OO000 = null;
                  this.O0000000OO0000 = false;
                  this.O00000000O0O0 = null;
                  this.O00000000OOO0O = null;
                  this.O0000000OO0O = null;
                  this.O00000000O0O = WardenFarm.W110.SEARCHING;
                  if (this.O00000000O00OO != null) {
                     this.O00000000O00OO.getPathingBehavior().cancelEverything();
                  }

                  this.O00000000OO00.O00000000();
                  this.O00000000O0OOO.O00000000();
               }
            }
         }
      }
   }

   private void O000000000O00() {
      if (this.O00000000O00OO != null) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
      }

      this.O0000000OO000();
      if (this.O000000O000O0O.O000000000000(1000L)) {
         O0000000000.player.requestRespawn();
         if (O0000000000.currentScreen instanceof DeathScreen) {
            O0000000000.setScreen(null);
         }

         this.O000000O000O0O.O00000000();
      }
   }

   private void O000000000O000() {
      this.O0000000O00O0();
      this.O00000000O0O0 = null;
      this.O00000000O0O = WardenFarm.W110.SEARCHING;
      this.O00000000OO00.O00000000();
      this.O00000000O0OOO.O00000000();
      this.O00000000O0OO.O00000000();
      if (this.O00000000O00OO != null) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
      }

      O0000O000OOOO.O00000000.O00000000();
      if (this.O0000000O0O0O0()) {
         this.O0000000O0O();
      } else {
         if (!this.O0000000000O0O()) {
            this.O0000000OOO0O = true;
            this.O00000000O0OO.O00000000();
         }
      }
   }

   private boolean O000000000O00O() {
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
         String var4 = var1.getTitle().getString().toLowerCase().replaceAll("§.", "").trim();
         boolean var3 = this.O000000000O.O000000000("Варден")
            ? var4.equals("сундук") || var4.equals("большой сундук") || var4.equals("chest") || var4.equals("large chest")
            : var4.equals("бочка") || var4.equals("barrel");
         if (this.O0000000000O0O() && var3) {
            return true;
         }
      }

      return this.O00000000O0O == WardenFarm.W110.ROTATING
         || this.O00000000O0O == WardenFarm.W110.OPENING
         || this.O00000000O0O == WardenFarm.W110.WAITING_FOR_GUI;
   }

   private void O000000000O0O() {
      if (this.O0000000OO000 != null && !this.O000000000O0O0() && !this.O000000000O00O()) {
         Runnable var1 = this.O0000000OO000;
         this.O0000000OO000 = null;
         var1.run();
      }
   }

   private boolean O000000000O0O0() {
      if (this.O0000000OO00 > 0L && System.currentTimeMillis() - this.O0000000OO00 < 3000L) {
         return true;
      } else {
         return this.O0000000000OOO() ? true : this.O000000000O();
      }
   }

   private void O000000000O0OO() {
      this.O0000000OO00 = System.currentTimeMillis();
   }

   private void O00000000(Runnable runnable) {
      this.O0000000000(runnable);
   }

   private void O000000000(Runnable runnable) {
      this.O0000000000(runnable);
   }

   private void O0000000000(Runnable runnable) {
      if (!this.O000000000O0O0()) {
         runnable.run();
      } else {
         this.O0000000OO000 = runnable;
         this.O000000000OO();
      }
   }

   private void O000000000OO() {
      if (this.O0000000000O0O()) {
         if (this.O00000000O0O != WardenFarm.W110.SWAPPING_TO_SAVE_ANARCHY
            && this.O00000000O0O != WardenFarm.W110.GOING_TO_STASH
            && this.O00000000O0O != WardenFarm.W110.OPENING_STASH
            && this.O00000000O0O != WardenFarm.W110.ROTATING_STASH
            && this.O00000000O0O != WardenFarm.W110.OPENING_STASH_BLOCK
            && this.O00000000O0O != WardenFarm.W110.WAITING_FOR_GUI_STASH
            && this.O00000000O0O != WardenFarm.W110.STORING_IN_CHEST
            && this.O00000000O0O != WardenFarm.W110.HUB_WAITING_FOR_CHEST) {
            this.O00000000O0O = WardenFarm.W110.SEARCHING;
            this.O00000000OO00.O00000000();
         }
      }
   }

   private void O000000000OO0() {
      if (!this.O0000000000O0O()) {
         if (this.O0000000000(O0000O000OOOO.O00000000.O0000000000())) {
            if (this.O0000000OOOO0 != WardenFarm.W114.NONE) {
               return;
            }

            this.O0000000O00O00();
         }
      } else if (this.O000000000O0OO.O0000000000()
         && this.O000000000OO0O.O0000000000()
         && this.O0000000000(O0000O000OOOO.O00000000.O0000000000())
         && this.O0000000O0O0O0()) {
         this.O0000000O00OOO();
      } else if (this.O00000000O0000()) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
         this.O00000000O0O = WardenFarm.W110.GOING_TO_DEATH_LOOT;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
         this.O00000000OO0.O00000000();
      } else {
         boolean var1 = this.O0000000OO000 != null || this.O0000000OO0000;
         if (var1) {
            if (this.O00000000O00OO.getCustomGoalProcess().isActive()) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
            }

            this.O00000000O00();
         } else if (this.O00000000OO00O()) {
            this.O0000000O00000();
         } else {
            this.O00000000OO000();
            this.O00000000O0O0 = this.O00000000OOO();
            if (this.O00000000O0O0 != null) {
               this.O00000000O0O = WardenFarm.W110.GOING_TO_CHEST;
               this.O00000000O0O0O = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O0));
               this.O000000O000OOO = 0L;
               this.O000000O00O = false;
               this.O00000000O0OOO.O00000000();
               this.O00000000OO00.O00000000();
            } else {
               boolean var2 = false;
               if (!this.O00000000O000.isEmpty() && this.O00000000OO00.O000000000000(20000L)) {
                  var2 = this.O00000000O0OOO();
               }

               if (!var2) {
                  BlockPos var3 = this.O000000000OO00();
                  if (var3 != null) {
                     double var6 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(var3));
                     if (var6 > 6.0) {
                        if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(3000L)) {
                           this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(var3, 3));
                           this.O00000000OO0.O00000000();
                        }
                     } else if (this.O00000000O00OO.getCustomGoalProcess().isActive()) {
                        this.O00000000O00OO.getPathingBehavior().cancelEverything();
                     }
                  } else {
                     if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(6000L)) {
                        int[] var4 = this.O0000000000OO();
                        this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalXZ(var4[0], var4[1]));
                        this.O00000000OO0.O00000000();
                     }
                  }
               }
            }
         }
      }
   }

   private BlockPos O000000000OO00() {
      long var1 = System.currentTimeMillis();
      return this.O00000000O000
         .stream()
         .filter(blockPos -> !this.O0000000OO000O.contains(blockPos))
         .filter(blockPos -> this.O00000000000O(blockPos) <= this.O00000000OO0OO())
         .filter(blockPos -> {
            Long var4 = this.O00000000O00O0.get(blockPos);
            return var4 == null || var4 <= var1;
         })
         .min(
            Comparator.<BlockPos>comparingLong(blockPos -> Math.max(0L, this.O00000000000O(blockPos)))
               .thenComparingDouble(blockPos -> O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(blockPos)))
         )
         .orElse(null);
   }

   private void O000000000OO0O() {
      if (this.O00000000O0O0 != null
         && !this.O0000000000(this.O00000000O0O0)
         && O0000000000.world.getBlockState(this.O00000000O0O0).getBlock() == (this.O000000000O.O000000000("Варден") ? Blocks.CHEST : Blocks.BARREL)) {
         double var1 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O0));
         if (var1 < this.O00000000O0O0O - 1.0) {
            this.O00000000O0O0O = var1;
            this.O00000000O0OOO.O00000000();
         }

         boolean var3 = var1 <= 4.0;
         boolean var4 = var3 && this.O00000000000OO(this.O00000000O0O0);
         if (var4) {
            this.O0000000OO0OO0 = null;
            long var5 = this.O00000000(this.O00000000O0O0) - System.currentTimeMillis();
            if (this.O000000O00O || var5 > 15000L || var5 <= 2500L) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
               boolean var8 = var5 <= -10L && !this.O000000000(this.O00000000O0O0);
               if (var8) {
                  if (this.O000000O000OOO == 0L) {
                     this.O000000O000OOO = System.currentTimeMillis();
                  }

                  if (System.currentTimeMillis() - this.O000000O000OOO >= 250L) {
                     this.O000000O000OOO = 0L;
                     this.O00000000O0O = WardenFarm.W110.ROTATING;
                     this.O00000000O0OO.O00000000();
                  }
               } else {
                  this.O000000O000OOO = 0L;
               }
            } else if (this.O000000000O0O0()) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
            } else {
               O0000O000OOOO.O00000000.O00000000();
               String var7 = O0000O000OOOO.O00000000.O0000000000();
               if (!"N/A".equals(var7)) {
                  this.O00000000OOO = var7;
               }

               this.O00000000O0O00 = this.O00000000O0O0;
               this.O000000000((Runnable)(() -> {
                  O0000000000.player.networkHandler.sendChatCommand("hub");
                  this.O00000000O0O = WardenFarm.W110.HUB_WAITING_FOR_CHEST;
               }));
            }
         } else if (!var3) {
            this.O0000000OO0OO0 = null;
            if (!this.O00000000O00OO.getCustomGoalProcess().isActive()) {
               this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000O0O0, 1));
            }

            if (this.O00000000O0OOO.O000000000000(15000L)) {
               this.O00000000O00O0.put(this.O00000000O0O0, System.currentTimeMillis() + 30000L);
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
               this.O00000000O0O0 = null;
               this.O0000000OO0OO0 = null;
               this.O00000000O0O0O = -1.0;
               this.O00000000O0OOO.O00000000();
               this.O00000000OO0.O00000000();
               this.O00000000O0O = WardenFarm.W110.SEARCHING;
               this.O00000000OO00.O00000000();
            }
         } else {
            if (this.O0000000OO0OO0 == null || !this.O0000000OO0OO0.equals(this.O00000000O0O0)) {
               this.O0000000OO0OO0 = this.O00000000O0O0;
               this.O0000000OO0OOO = System.currentTimeMillis();
            }

            if (!this.O00000000O00OO.getCustomGoalProcess().isActive()) {
               this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000O0O0, 1));
            }

            if (System.currentTimeMillis() - this.O0000000OO0OOO >= 4000L) {
               this.O00000000O00O0.put(this.O00000000O0O0, System.currentTimeMillis() + 30000L);
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
               this.O00000000O0O0 = null;
               this.O0000000OO0OO0 = null;
               this.O00000000O0O0O = -1.0;
               this.O00000000O0OOO.O00000000();
               this.O00000000OO0.O00000000();
               this.O00000000O0O = WardenFarm.W110.SEARCHING;
               this.O00000000OO00.O00000000();
            }
         }
      } else {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      }
   }

   private void O000000000OOO() {
      if (this.O00000000O0O0 == null) {
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      } else if (!this.O0000000000O0(this.O00000000O0O0)) {
         this.O00000000O0O0O = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O0));
         this.O00000000O0O = WardenFarm.W110.GOING_TO_CHEST;
         this.O00000000O0OOO.O00000000();
      } else {
         O000000O0O00OO var1 = this.O0000000000(this.O0000000000O(this.O00000000O0O0));
         this.O000000O0.O00000000(this.O00000000(var1, this.O00000000(var1)), 35.0F, 35.0F, 35.0F, 35.0F, 20, 1);
         if (this.O0000000000O00(this.O00000000O0O0) != null && this.O00000000O0OO.O000000000000(50L)) {
            this.O00000000O0O = WardenFarm.W110.OPENING;
            this.O00000000O0OO.O00000000();
         }
      }
   }

   private void O000000000OOO0() {
      if (this.O00000000O0O0 == null) {
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      } else if (!this.O0000000000O0(this.O00000000O0O0)) {
         this.O00000000O0O0O = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O0));
         this.O00000000O0O = WardenFarm.W110.GOING_TO_CHEST;
         this.O00000000O0OOO.O00000000();
      } else {
         int var1 = O0000000000.player.getInventory().getSelectedSlot();
         ItemStack var2 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var1);
         if (var2.getItem() == Items.TRIPWIRE_HOOK || var2.getName().getString().contains("[★]")) {
            for (int var3 = 0; var3 < 9; var3++) {
               ItemStack var4 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var3);
               if (var4.isEmpty() || var4.getItem() != Items.TRIPWIRE_HOOK && !var4.getName().getString().contains("[★]")) {
                  O0000000000.player.getInventory().setSelectedSlot(var3);
                  this.O00000000O0OO.O00000000();
                  break;
               }
            }
         }

         O000000O0O00OO var5 = this.O0000000000(this.O0000000000O(this.O00000000O0O0));
         this.O000000O0.O00000000(this.O00000000(var5, 0.6F), 18.0F, 18.0F, 20.0F, 20.0F, 20, 1);
         BlockHitResult var6 = this.O0000000000O00(this.O00000000O0O0);
         if (var6 == null) {
            if (this.O00000000O0OO.O000000000000(1200L)) {
               this.O00000000O0O = WardenFarm.W110.ROTATING;
               this.O00000000O0OO.O00000000();
            }
         } else {
            if (this.O00000000O0OO.O000000000000(10L)) {
               O0000000000.player.swingHand(Hand.MAIN_HAND);
               O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var6);
               O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
               this.O000000000O0OO();
               this.O00000000O00O0.put(this.O00000000O0O0, System.currentTimeMillis() + 5000L);
               this.O00000000O0O = WardenFarm.W110.WAITING_FOR_GUI;
               this.O00000000O0OO.O00000000();
            }
         }
      }
   }

   private boolean O000000000OOOO() {
      for (PlayerEntity var2 : O0000000000.world.getPlayers()) {
         if (var2 != O0000000000.player && !var2.isDead() && O0000000000.player.distanceTo(var2) <= 40.0) {
            return true;
         }
      }

      for (Entity var4 : O0000000000.world.getEntities()) {
         if (var4 instanceof WardenEntity && O0000000000.player.distanceTo(var4) <= 24.0) {
            return true;
         }
      }

      return false;
   }

   private Vec3d O00000000O() {
      double var1 = O0000000000.player.getX();
      double var3 = O0000000000.player.getZ();
      double var5 = 0.0;
      double var7 = 0.0;

      for (PlayerEntity var10 : O0000000000.world.getPlayers()) {
         if (var10 != O0000000000.player && !var10.isDead()) {
            double var11 = var1 - var10.getX();
            double var13 = var3 - var10.getZ();
            double var15 = Math.max(1.0, Math.hypot(var11, var13));
            double var17 = 1.0 / (var15 * var15);
            var5 += var11 / var15 * var17;
            var7 += var13 / var15 * var17;
         }
      }

      for (Entity var21 : O0000000000.world.getEntities()) {
         if (var21 instanceof WardenEntity) {
            double var22 = var1 - var21.getX();
            double var24 = var3 - var21.getZ();
            double var25 = Math.max(1.0, Math.hypot(var22, var24));
            double var26 = 1.5 / (var25 * var25);
            var5 += var22 / var25 * var26;
            var7 += var24 / var25 * var26;
         }
      }

      double var20 = Math.hypot(var5, var7);
      if (var20 < 1.0E-6) {
         double var23 = Math.random() * Math.PI * 2.0;
         return new Vec3d(Math.cos(var23), 0.0, Math.sin(var23));
      } else {
         return new Vec3d(var5 / var20, 0.0, var7 / var20);
      }
   }

   private double O00000000(double d, double e) {
      double var5 = 0.0;

      for (PlayerEntity var8 : O0000000000.world.getPlayers()) {
         if (var8 != O0000000000.player && !var8.isDead()) {
            double var9 = Math.hypot(var8.getX() - d, var8.getZ() - e);
            var5 += 12.0 / (var9 + 2.0);
            if (var9 < 10.0) {
               var5 += (10.0 - var9) * 2.0;
            }
         }
      }

      for (Entity var12 : O0000000000.world.getEntities()) {
         if (var12 instanceof WardenEntity) {
            double var13 = Math.hypot(var12.getX() - d, var12.getZ() - e);
            var5 += 18.0 / (var13 + 2.0);
            if (var13 < 14.0) {
               var5 += (14.0 - var13) * 3.0;
            }
         }
      }

      return var5;
   }

   private boolean O00000000(double d, double e, double f, double g) {
      byte var9 = 6;

      for (int var10 = 1; var10 <= var9; var10++) {
         double var11 = (double)var10 / var9;
         double var13 = d + (f - d) * var11;
         double var15 = e + (g - e) * var11;

         for (PlayerEntity var18 : O0000000000.world.getPlayers()) {
            if (var18 != O0000000000.player && !var18.isDead() && Math.hypot(var18.getX() - var13, var18.getZ() - var15) < 6.0) {
               return false;
            }
         }
      }

      return true;
   }

   private int[] O00000000O0() {
      Vec3d var1 = this.O00000000O();
      double var2 = Math.atan2(var1.z, var1.x);
      double var4 = O0000000000.player.getX();
      double var6 = O0000000000.player.getZ();
      double var8 = Double.MAX_VALUE;
      int[] var10 = null;
      int[] var11 = null;
      double var12 = Double.MAX_VALUE;

      for (int var14 = 0; var14 < 32; var14++) {
         double var15 = Math.toRadians(15.0 + Math.random() * 65.0);
         double var17 = Math.random() < 0.8 ? var2 + (Math.random() * 2.0 - 1.0) * var15 : Math.random() * Math.PI * 2.0;
         double var19 = 22.0 + Math.random() * 26.0;
         double var21 = var4 + var19 * Math.cos(var17);
         double var23 = var6 + var19 * Math.sin(var17);
         if (this.O000000000(new Vec3d(var21, O0000000000.player.getY(), var23))) {
            double var25 = this.O00000000(var21, var23);
            if (var25 < var12) {
               var12 = var25;
               var11 = new int[]{(int)var21, (int)var23};
            }

            if (this.O00000000(var4, var6, var21, var23) && var25 < var8) {
               var8 = var25;
               var10 = new int[]{(int)var21, (int)var23};
            }
         }
      }

      if (var10 != null) {
         return var10;
      } else if (var11 != null) {
         return var11;
      } else {
         double var27 = var4 + var1.x * 26.0;
         double var16 = var6 + var1.z * 26.0;
         return this.O000000000(new Vec3d(var27, O0000000000.player.getY(), var16)) ? new int[]{(int)var27, (int)var16} : null;
      }
   }

   private void O00000000O00() {
      if (this.O000000000O000.O0000000000() && this.O0000000000O0O() && this.O000000000OOOO()) {
         int[] var1 = this.O00000000O0();
         if (var1 != null) {
            this.O0000000OO0O = var1;
            this.O00000000O00OO.getPathingBehavior().cancelEverything();
            this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalXZ(var1[0], var1[1]));
            this.O00000000O0O = WardenFarm.W110.RETREATING;
            this.O00000000O0OOO.O00000000();
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O00000000O000() {
      if (this.O0000000OO0O == null) {
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      } else {
         boolean var1 = Math.hypot(O0000000000.player.getX() - this.O0000000OO0O[0], O0000000000.player.getZ() - this.O0000000OO0O[1]) <= 3.0;
         if (!var1 && this.O000000000OOOO() && !this.O00000000O0OOO.O000000000000(15000L)) {
            if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(2500L)) {
               this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalXZ(this.O0000000OO0O[0], this.O0000000OO0O[1]));
               this.O00000000OO0.O00000000();
            }
         } else {
            this.O00000000O00OO.getPathingBehavior().cancelEverything();
            this.O0000000OO0O = null;
            this.O00000000O0O = WardenFarm.W110.SEARCHING;
            this.O00000000OO00.O00000000();
         }
      }
   }

   private boolean O00000000O0000() {
      if (this.O0000000OO0O0 == null) {
         return false;
      } else if (this.O000000000O00O.O0000000000() && System.currentTimeMillis() <= this.O0000000OO0O00) {
         return true;
      } else {
         this.O0000000OO0O0 = null;
         return false;
      }
   }

   private void O00000000O000O() {
      if (!this.O00000000O0000()) {
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      } else {
         double var1 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O0000000OO0O0));
         if (var1 <= 6.0) {
            this.O00000000O00OO.getPathingBehavior().cancelEverything();
            this.O00000000O0O = WardenFarm.W110.COLLECTING_DEATH_LOOT;
            this.O00000000O0OO.O00000000();
            this.O00000000O0OOO.O00000000();
            this.O00000000OO0.O00000000();
         } else {
            if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(2500L)) {
               this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O0000000OO0O0, 2));
               this.O00000000OO0.O00000000();
            }

            if (this.O00000000O0OOO.O000000000000(40000L)) {
               this.O00000000O00O0();
            }
         }
      }
   }

   private void O00000000O00O() {
      if (!this.O00000000O0000()) {
         this.O00000000O00O0();
      } else {
         ItemEntity var1 = null;
         double var2 = Double.MAX_VALUE;

         for (Entity var5 : O0000000000.world.getEntities()) {
            if (var5 instanceof ItemEntity var6 && var6.isAlive() && !(var6.getPos().distanceTo(Vec3d.ofCenter(this.O0000000OO0O0)) > 16.0)) {
               double var7 = O0000000000.player.getPos().distanceTo(var6.getPos());
               if (var7 < var2) {
                  var2 = var7;
                  var1 = var6;
               }
            }
         }

         if (var1 == null) {
            if (this.O00000000O0OO.O000000000000(2000L)) {
               this.O00000000O00O0();
            }
         } else {
            this.O00000000O0OO.O00000000();
            if (this.O00000000O0OOO.O000000000000(90000L)) {
               this.O00000000O00O0();
            } else {
               if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(1500L)) {
                  this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(var1.getBlockPos(), 1));
                  this.O00000000OO0.O00000000();
               }
            }
         }
      }
   }

   private void O00000000O00O0() {
      this.O0000000OO0O0 = null;
      this.O0000000OO0O00 = 0L;
      this.O00000000O00OO.getPathingBehavior().cancelEverything();
      this.O00000000O0O = WardenFarm.W110.SEARCHING;
      this.O00000000OO00.O00000000();
      if (this.O000000000OO0.O0000000000() && this.O0000000O000O0()) {
         this.O0000000O00000();
      }
   }

   private void O00000000O00OO() {
      O0000O000OOOO.O00000000.O00000000();
      if (O0000O000OOOO.O00000000.O0000000000().equals(this.O000000000OOO0.O0000000000())) {
         if (this.O00000000O0OO.O000000000000(100L)) {
            this.O00000000O0O = WardenFarm.W110.GOING_TO_STASH;
            this.O00000000O0OO.O00000000();
            this.O00000000O0OOO.O00000000();
         }
      } else {
         this.O00000000O0OO.O00000000();
         if (!this.O000000000O0O0() && this.O00000000O0OOO.O000000000000(8000L)) {
            O0000000000.player.networkHandler.sendChatCommand("an" + this.O000000000OOO0.O0000000000());
            this.O00000000O0OOO.O00000000();
         }
      }
   }

   private void O00000000O0O() {
      if (this.O000000000OO00.O000000000("В клан")) {
         if (this.O00000000O0OO.O000000000000(500L)) {
            this.O00000000O0O = WardenFarm.W110.OPENING_STASH;
            this.O00000000O0OO.O00000000();
         }
      } else {
         if (this.O00000000O0OO.O000000000000(1000L)) {
            this.O0000000O00();
            this.O00000000O0OO.O00000000();
         }

         if (this.O00000000OOO0O != null && this.O0000000000OO0(this.O00000000OOO0O)) {
            double var1 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000OOO0O));
            if (var1 <= 4.0 && this.O00000000000OO(this.O00000000OOO0O)) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
               this.O00000000O0O = WardenFarm.W110.ROTATING_STASH;
               this.O00000000O0OO.O00000000();
            } else {
               if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(2500L)) {
                  this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000OOO0O, 1));
                  this.O00000000OO0.O00000000();
               }

               if (this.O00000000O0OOO.O000000000000(15000L)) {
                  this.O00000000O00OO.getPathingBehavior().cancelEverything();
                  this.O0000000O000OO();
               }
            }
         } else {
            if (this.O00000000O0OOO.O000000000000(15000L)) {
               this.O0000000O000OO();
            }
         }
      }
   }

   private void O00000000O0O0() {
      if (this.O00000000OOO0O == null) {
         this.O00000000O0O = WardenFarm.W110.GOING_TO_STASH;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      } else if (!this.O0000000000O0(this.O00000000OOO0O)) {
         this.O00000000O0O = WardenFarm.W110.GOING_TO_STASH;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      } else {
         O000000O0O00OO var1 = this.O0000000000(this.O0000000000O(this.O00000000OOO0O));
         this.O000000O0.O00000000(this.O00000000(var1, this.O00000000(var1)), 35.0F, 35.0F, 35.0F, 35.0F, 20, 1);
         if (this.O0000000000O00(this.O00000000OOO0O) != null && this.O00000000O0OO.O000000000000(200L)) {
            this.O00000000O0O = WardenFarm.W110.OPENING_STASH_BLOCK;
            this.O00000000O0OO.O00000000();
         }
      }
   }

   private void O00000000O0O00() {
      int var1 = O0000000000.player.getInventory().getSelectedSlot();
      ItemStack var2 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var1);
      if (var2.getItem() == Items.TRIPWIRE_HOOK || var2.getName().getString().contains("[★]")) {
         for (int var3 = 0; var3 < 9; var3++) {
            ItemStack var4 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var3);
            if (var4.isEmpty() || var4.getItem() != Items.TRIPWIRE_HOOK && !var4.getName().getString().contains("[★]")) {
               O0000000000.player.getInventory().setSelectedSlot(var3);
               this.O00000000O0OO.O00000000();
               break;
            }
         }
      }

      if (!this.O0000000000O0(this.O00000000OOO0O)) {
         this.O00000000O0O = WardenFarm.W110.GOING_TO_STASH;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      } else {
         O000000O0O00OO var5 = this.O0000000000(this.O0000000000O(this.O00000000OOO0O));
         this.O000000O0.O00000000(this.O00000000(var5, 0.6F), 18.0F, 18.0F, 20.0F, 20.0F, 20, 1);
         BlockHitResult var6 = this.O0000000000O00(this.O00000000OOO0O);
         if (var6 == null) {
            if (this.O00000000O0OO.O000000000000(1200L)) {
               this.O00000000O0O = WardenFarm.W110.ROTATING_STASH;
               this.O00000000O0OO.O00000000();
            }
         } else {
            if (this.O00000000O0OO.O000000000000(150L)) {
               O0000000000.player.swingHand(Hand.MAIN_HAND);
               O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var6);
               O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
               this.O00000000O0O = WardenFarm.W110.WAITING_FOR_GUI_STASH;
               this.O00000000O0OO.O00000000();
            }
         }
      }
   }

   private void O00000000O0O0O() {
      this.O00000000O00OO.getPathingBehavior().cancelEverything();
      if (this.O00000000O0OO.O000000000000(4000L)) {
         if (this.O00000000OOOO < 3) {
            this.O00000000OOOO++;
            this.O00000000O0O = WardenFarm.W110.GOING_TO_STASH;
            this.O00000000O0OO.O00000000();
            this.O00000000O0OOO.O00000000();
         } else {
            this.O0000000O000OO();
         }
      }
   }

   private void O00000000O0OO() {
      this.O00000000O00OO.getPathingBehavior().cancelEverything();
      if (this.O00000000O0OO.O000000000000(1500L) && O0000000000.currentScreen == null) {
         O0000000000.player.networkHandler.sendChatCommand("clan storage");
         this.O00000000O0O = WardenFarm.W110.WAITING_FOR_GUI_STASH;
         this.O00000000O0OO.O00000000();
      }
   }

   private void O00000000O0OO0() {
      this.O00000000O00OO.getPathingBehavior().cancelEverything();
      if (this.O00000000O0OO.O000000000000(1000L)) {
         this.O00000000O0O0 = null;
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
      }
   }

   private boolean O00000000O0OOO() {
      long var1 = Long.MAX_VALUE;

      for (BlockPos var4 : this.O00000000O000) {
         long var5 = this.O00000000(var4) - System.currentTimeMillis();
         if (var5 < var1) {
            var1 = var5;
         }
      }

      if (var1 <= this.O00000000OO0OO() || var1 == Long.MAX_VALUE) {
         return false;
      } else if (this.O000000000O0O0()) {
         return false;
      } else {
         O0000O000OOOO.O00000000.O00000000();
         String var7 = O0000O000OOOO.O00000000.O0000000000();
         if (!"N/A".equals(var7)) {
            this.O00000000OOO = var7;
         }

         this.O00000000O00OO.getPathingBehavior().cancelEverything();
         this.O00000000O0O0 = null;
         if (this.O000000000OO0O.O0000000000()) {
            String var8 = this.O0000000000OO0();
            this.O00000000OOO = var8;
            this.O000000000((Runnable)(() -> {
               O0000000000.player.networkHandler.sendChatCommand("hub");
               this.O00000000OO0O0 = true;
               this.O00000000OO0OO = System.currentTimeMillis() + 1700L;
            }));
         } else {
            long var9 = var1 - 25000L;
            this.O000000000((Runnable)(() -> {
               O0000000000.player.networkHandler.sendChatCommand("hub");
               this.O00000000OO0O0 = true;
               this.O00000000OO0OO = System.currentTimeMillis() + var9;
               this.O00000000O0O = WardenFarm.W110.SEARCHING;
               this.O00000000OO00.O00000000();
            }));
         }

         return true;
      }
   }

   private void O00000000OO() {
      if (!this.O000000000O00.O0000000000()) {
         this.O00000000OO0();
      } else {
         boolean var1 = false;
         BlockPos var2 = O0000000000.player.getBlockPos();

         for (BlockPos var4 : BlockPos.iterate(var2.add(-5, -5, -5), var2.add(5, 5, 5))) {
            Block var5 = O0000000000.world.getBlockState(var4).getBlock();
            if (var5 == Blocks.SCULK || var5 == Blocks.SCULK_SENSOR || var5 == Blocks.SCULK_SHRIEKER || var5 == Blocks.SCULK_CATALYST) {
               var1 = true;
               break;
            }
         }

         long var6 = System.currentTimeMillis();
         if (var1) {
            this.O0000000OO0OO = var6;
            this.O0000000OO0O0O = true;
         }

         if (this.O0000000OO0O0O) {
            if (!var1 && var6 - this.O0000000OO0OO >= 1200L) {
               this.O00000000OO0();
            } else {
               if (!O0000000000.player.isSneaking()) {
                  O0000000000.player.setSneaking(true);
               }

               if ((Boolean)BaritoneAPI.getSettings().allowSprint.value) {
                  BaritoneAPI.getSettings().allowSprint.value = false;
               }
            }
         }
      }
   }

   private void O00000000OO0() {
      if (this.O0000000OO0O0O) {
         this.O0000000OO0O0O = false;
         this.O0000000OO0OO = 0L;
         if (O0000000000.player != null) {
            O0000000000.player.setSneaking(false);
         }

         BaritoneAPI.getSettings().allowSprint.value = this.O00000000OOO00;
      }
   }

   private long O00000000(String string, boolean bl) {
      Matcher var3 = bl ? O00000000OOOOO.matcher(string) : O0000000O.matcher(string);
      if (var3.find()) {
         try {
            if (bl) {
               return (Integer.parseInt(var3.group(1)) * 60L + Integer.parseInt(var3.group(2))) * 1000L;
            }

            int var8 = Integer.parseInt(var3.group(1));
            int var5 = Integer.parseInt(var3.group(2));
            return var3.group(3) != null ? (var8 * 3600L + var5 * 60L + Integer.parseInt(var3.group(3))) * 1000L : (var8 * 60L + var5) * 1000L;
         } catch (NumberFormatException var7) {
         }
      }

      Matcher var4 = O0000000O0.matcher(string);
      if (var4.find()) {
         try {
            return Integer.parseInt(var4.group(1)) * 1000L;
         } catch (NumberFormatException var6) {
         }
      }

      return -1L;
   }

   private void O00000000OO00() {
      boolean var1 = this.O000000000O.O000000000("Варден");
      Block var2 = var1 ? Blocks.CHEST : Blocks.BARREL;

      for (Entity var4 : O0000000000.world.getEntities()) {
         if (var4 instanceof ArmorStandEntity) {
            long var5 = this.O00000000(var4.getName().getString(), var1);
            if (var5 >= 0L) {
               BlockPos var7 = new BlockPos(var4.getBlockX(), var4.getBlockY() - 1, var4.getBlockZ());
               if (O0000000000.world.getBlockState(var7).getBlock() == var2) {
                  this.O00000000O00O.put(var7, System.currentTimeMillis() + var5);
               } else {
                  var7 = var7.down();
                  if (O0000000000.world.getBlockState(var7).getBlock() == var2) {
                     this.O00000000O00O.put(var7, System.currentTimeMillis() + var5);
                  }
               }
            }
         }
      }
   }

   private boolean O000000000(BlockPos blockPos) {
      if (O0000000000.world != null && blockPos != null) {
         boolean var2 = this.O000000000O.O000000000("Варден");

         for (Entity var4 : O0000000000.world.getEntities()) {
            if (var4 instanceof ArmorStandEntity && this.O00000000(var4.getName().getString(), var2) > 250L) {
               BlockPos var5 = new BlockPos(var4.getBlockX(), var4.getBlockY() - 1, var4.getBlockZ());
               if (var5.equals(blockPos) || var5.down().equals(blockPos)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean O0000000000(BlockPos blockPos) {
      Long var2 = this.O00000000O00O0.get(blockPos);
      return var2 != null && var2 > System.currentTimeMillis() ? true : this.O00000000000O(blockPos) > this.O000000000000(blockPos);
   }

   private long O00000000000(BlockPos blockPos) {
      double var2 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(blockPos));
      return (long)(var2 / 3.0 * 1000.0);
   }

   private long O000000000000(BlockPos blockPos) {
      return Math.max(20000L, this.O00000000000(blockPos) + 5000L);
   }

   private long O0000000000000(BlockPos blockPos) {
      return Math.max(this.O00000000000(blockPos), Math.max(0L, this.O00000000000O(blockPos)));
   }

   private void O00000000OO000() {
      this.O00000000O000.clear();
      BlockPos var1 = O0000000000.player.getBlockPos();
      ChunkPos var2 = new ChunkPos(var1);
      byte var3 = 10;
      Block var4 = this.O000000000O.O000000000("Варден") ? Blocks.CHEST : Blocks.BARREL;

      for (int var5 = -var3; var5 <= var3; var5++) {
         for (int var6 = -var3; var6 <= var3; var6++) {
            WorldChunk var7 = O0000000000.world.getChunk(var2.x + var5, var2.z + var6);
            if (var7 != null) {
               for (BlockPos var9 : var7.getBlockEntities().keySet()) {
                  if (var7.getBlockState(var9).getBlock() == var4 && this.O000000000(Vec3d.ofCenter(var9))) {
                     this.O00000000O000.add(var9);
                  }
               }
            }
         }
      }
   }

   private boolean O00000000OO00O() {
      return this.O000000000OO0.O0000000000() && this.O0000000O000O0();
   }

   private void O000000000000O(BlockPos blockPos) {
      if (blockPos != null) {
         this.O0000000OO000O.add(blockPos);
      }

      this.O00000000O00OO.getPathingBehavior().cancelEverything();
      this.O00000000O0O0 = null;
      this.O0000000OO0OO0 = null;
      this.O00000000O0O0O = -1.0;
      this.O000000O000OOO = 0L;
      this.O00000000O0OOO.O00000000();
      this.O00000000OO0.O00000000();
      boolean var2 = this.O000000000OO0.O0000000000() && this.O0000000O000O0();
      if (var2 && this.O00000000OO0O()) {
         BlockPos var3 = this.O00000000OO0O0();
         if (var3 != null) {
            this.O00000000O0O0 = var3;
            this.O00000000O0O0O = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(var3));
            this.O00000000O0O = WardenFarm.W110.GOING_TO_CHEST;
            this.O000000O000OOO = 0L;
            this.O000000O00O = true;
            this.O00000000O0OOO.O00000000();
            this.O00000000OO00.O00000000();
            return;
         }
      }

      if (!var2) {
         this.O00000000O00.clear();
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000OO00.O00000000();
         this.O00000000O00();
      } else {
         this.O0000000O00000();
         if (this.O00000000O0O == WardenFarm.W110.SEARCHING) {
            this.O00000000O00();
         }
      }
   }

   private boolean O00000000OO0O() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private BlockPos O00000000OO0O0() {
      this.O00000000OO000();
      long var1 = System.currentTimeMillis();
      return this.O00000000O000
         .stream()
         .filter(blockPos -> !this.O0000000OO000O.contains(blockPos))
         .filter(blockPos -> {
            Long var4 = this.O00000000O00O0.get(blockPos);
            return var4 == null || var4 <= var1;
         })
         .filter(blockPos -> O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(blockPos)) <= 14.0)
         .filter(blockPos -> this.O00000000000O(blockPos) <= 15000L)
         .min(
            Comparator.<BlockPos>comparingLong(blockPos -> Math.max(0L, this.O00000000000O(blockPos)))
               .thenComparingDouble(blockPos -> O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(blockPos)))
         )
         .orElse(null);
   }

   private long O00000000000O(BlockPos blockPos) {
      return this.O00000000(blockPos) - System.currentTimeMillis();
   }

   private long O00000000OO0OO() {
      return (long)(this.O000000000O0O0.O0000000000() * 1000.0F);
   }

   private BlockPos O00000000OOO() {
      return this.O00000000O000
         .stream()
         .filter(blockPos -> !this.O0000000OO000O.contains(blockPos))
         .filter(blockPos -> !this.O0000000000(blockPos))
         .min(
            Comparator.<BlockPos>comparingLong(this::O0000000000000)
               .thenComparingDouble(blockPos -> O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(blockPos)))
         )
         .orElse(null);
   }

   private Vec3d O00000000000O0(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = blockPos.getX();
      double var5 = blockPos.getY();
      double var7 = blockPos.getZ();
      Vec3d[] var9 = new Vec3d[]{
         new Vec3d(var3 + 0.5, var5 + 0.5, var7 + 0.5),
         new Vec3d(var3 + 0.5, var5 + 0.9, var7 + 0.5),
         new Vec3d(var3 + 0.5, var5 + 0.5, var7 + 0.05),
         new Vec3d(var3 + 0.5, var5 + 0.5, var7 + 0.95),
         new Vec3d(var3 + 0.05, var5 + 0.5, var7 + 0.5),
         new Vec3d(var3 + 0.95, var5 + 0.5, var7 + 0.5)
      };

      for (Vec3d var13 : var9) {
         BlockHitResult var14 = O0000000000.world.raycast(new RaycastContext(var2, var13, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
         if (var14.getType() == Type.MISS || var14.getBlockPos().equals(blockPos)) {
            return var13;
         }
      }

      return null;
   }

   private boolean O00000000000OO(BlockPos blockPos) {
      return this.O00000000000O0(blockPos) != null;
   }

   private Vec3d O0000000000O(BlockPos blockPos) {
      Vec3d var2 = this.O00000000000O0(blockPos);
      return var2 != null ? var2 : Vec3d.ofCenter(blockPos);
   }

   private boolean O0000000000O0(BlockPos blockPos) {
      return blockPos != null && O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(blockPos)) <= 4.0 && this.O00000000000OO(blockPos);
   }

   private BlockHitResult O0000000000O00(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      Vec3d var3 = var2.add(O0000000000.player.getRotationVec(1.0F).multiply(4.5));
      BlockHitResult var4 = O0000000000.world.raycast(new RaycastContext(var2, var3, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var4.getType() == Type.BLOCK && var4.getBlockPos().equals(blockPos) ? var4 : null;
   }

   private float O00000000(O000000O0O00OO o000000O0O00OO) {
      float var2 = new O000000O0O00OO(O0000000000.player).O00000000(o000000O0O00OO);
      return Math.min(2.0F, 0.45F + var2 * 0.1F);
   }

   private void O00000000OOO0() {
      ArrayList var1 = new ArrayList((Collection)BaritoneAPI.getSettings().blocksToAvoid.value);
      this.O000000O00000 = new ArrayList<>(var1);

      for (Block var3 : Registries.BLOCK) {
         if ((
               var3 instanceof AbstractCandleBlock
                  || var3 instanceof AbstractSkullBlock
                  || var3 instanceof FlowerPotBlock
                  || var3 instanceof LanternBlock
                  || var3 instanceof ChainBlock
                  || var3 instanceof SeaPickleBlock
                  || var3 instanceof AmethystClusterBlock
                  || var3 instanceof PointedDripstoneBlock
            )
            && !var1.contains(var3)) {
            var1.add(var3);
         }
      }

      BaritoneAPI.getSettings().blocksToAvoid.value = var1;
   }

   private void O00000000OOO00() {
      if (this.O000000O00000 != null) {
         BaritoneAPI.getSettings().blocksToAvoid.value = this.O000000O00000;
         this.O000000O00000 = null;
      }
   }

   private void O00000000OOO0O() {
      if (O0000000000.player != null
         && this.O00000000O00OO != null
         && this.O00000000O00OO.getCustomGoalProcess().isActive()
         && O0000000000.currentScreen == null
         && this.O000000O0000O0 == WardenFarm.W109.NONE) {
         long var1 = System.currentTimeMillis();
         Vec3d var3 = O0000000000.player.getPos();
         if (this.O000000O000000 != null && !(var3.squaredDistanceTo(this.O000000O000000) > 0.36)) {
            if (var1 - this.O000000O00000O > 3500L) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
               this.O000000O000000 = null;
            }
         } else {
            this.O000000O000000 = var3;
            this.O000000O00000O = var1;
         }
      } else {
         this.O000000O000000 = null;
      }
   }

   private O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, float f) {
      double var3 = System.currentTimeMillis() / 1000.0;
      float var5 = (float)((Math.sin(var3 * 7.3 + this.O000000O00) * 0.62 + Math.sin(var3 * 13.7 + this.O000000O000) * 0.38) * f);
      float var6 = (float)((Math.sin(var3 * 9.1 + this.O000000O000) * 0.55 + Math.sin(var3 * 15.9 + this.O000000O00) * 0.45) * f * 0.6);
      float var7 = Math.max(-90.0F, Math.min(90.0F, o000000O0O00OO.O000000000 + var6));
      return new O000000O0O00OO(o000000O0O00OO.O00000000 + var5, var7);
   }

   private O000000O0O00OO O0000000000(Vec3d vec3d) {
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

   private void O00000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         this.O000000000(genericContainerScreenHandler);
         if (!this.O00000000O0000.isEmpty()) {
            if (this.O00000000O0OO0.O000000000000(50L)) {
               this.O00000000O0000.poll().run();
               this.O00000000O0OO0.O00000000();
            }
         } else {
            this.O00000000OOOO();
            boolean var2 = false;
            int var3 = genericContainerScreenHandler.slots.size() - 36;

            for (int var4 = 0; var4 < var3; var4++) {
               Slot var5 = (Slot)genericContainerScreenHandler.slots.get(var4);
               if (var5.hasStack()) {
                  ItemStack var6 = var5.getStack();
                  if (this.O000000000000O(var6) && this.O00000000O0OO0.O000000000000(50L)) {
                     ItemStack var12 = var6.copy();
                     String var8 = this.O0000000000000(var12);
                     this.O00000000O00.put(var8, this.O00000000O00.getOrDefault(var8, 0) + var12.getCount());
                     O0000000000.interactionManager.clickSlot(genericContainerScreenHandler.syncId, var4, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                     this.O00000000O0OO0.O00000000();
                     var2 = true;
                     return;
                  }

                  if (this.O00000000(var6) && this.O00000000O0OO0.O000000000000(50L)) {
                     int var7 = this.O00000000(this.O0000000OO00OO) - this.O0000000OO00O0;
                     this.O00000000(genericContainerScreenHandler, var4, var7);
                     var2 = true;
                     return;
                  }
               }
            }

            if (!var2 && var3 > 0) {
               boolean var11 = this.O00000000(genericContainerScreenHandler, var3);
               if (!var11) {
                  O0000000000.player.closeHandledScreen();
                  this.O000000000000O(this.O00000000O0O0);
               }
            }
         }
      }
   }

   private void O00000000OOOO() {
      if (this.O00000000O0O0 != null) {
         if (!this.O00000000O0O0.equals(this.O0000000OO00O)) {
            this.O0000000OO00O = this.O00000000O0O0;
            this.O0000000OO00O0 = 0;
            this.O0000000OO00OO = this.O0000000000O0O(this.O00000000O0O0);
         }
      }
   }

   private boolean O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      for (int var3 = 0; var3 < i; var3++) {
         ItemStack var4 = ((Slot)genericContainerScreenHandler.slots.get(var3)).getStack();
         if (!var4.isEmpty() && (this.O000000000000O(var4) || this.O00000000(var4))) {
            return true;
         }
      }

      return false;
   }

   private void O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, int j) {
      if (j > 0) {
         Slot var4 = (Slot)genericContainerScreenHandler.slots.get(i);
         if (var4.hasStack()) {
            int var5 = var4.getStack().getCount();
            O0000000000.interactionManager.clickSlot(genericContainerScreenHandler.syncId, i, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
            this.O0000000OO00O0 = this.O0000000OO00O0 + Math.min(var5, j);
            this.O00000000O0OO0.O00000000();
         }
      }
   }

   private void O000000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (genericContainerScreenHandler.syncId != this.O0000000OOOOOO) {
         this.O0000000OOOOOO = genericContainerScreenHandler.syncId;
         this.O00000000O0OO0.O00000000();
         this.O00000000O0OO.O00000000();
      }
   }

   private WardenFarm.W113 O0000000000O0O(BlockPos blockPos) {
      if (this.O000000000O0OO.O0000000000() && blockPos != null && O0000000000.world != null) {
         String var2 = this.O0000000000OO(blockPos).toLowerCase(Locale.ROOT);
         if (var2.contains("ресы") || var2.contains("ресурс")) {
            return WardenFarm.W113.NONE;
         } else if (var2.contains("инвиз")) {
            return WardenFarm.W113.INVIS;
         } else {
            return var2.contains("морков") ? WardenFarm.W113.CARROT : WardenFarm.W113.NONE;
         }
      } else {
         return WardenFarm.W113.NONE;
      }
   }

   private String O0000000000OO(BlockPos blockPos) {
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

   private boolean O00000000(BlockPos blockPos, String[] strings, String... strings2) {
      String var4 = this.O0000000000OO(blockPos).toLowerCase(Locale.ROOT);
      if (var4.isEmpty()) {
         return false;
      } else {
         boolean var5 = false;

         for (String var9 : strings) {
            if (var4.contains(var9.toLowerCase(Locale.ROOT))) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            return false;
         } else {
            for (String var13 : strings2) {
               if (var4.contains(var13.toLowerCase(Locale.ROOT))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean O0000000000OO0(BlockPos blockPos) {
      return blockPos != null && this.O00000000(blockPos, O0000000OO, "морков", "инвиз");
   }

   private boolean O00000000OOOO0() {
      return this.O0000000O0O0OO() < 1 && !this.O0000000O0OO0();
   }

   private boolean O00000000OOOOO() {
      return this.O0000000O0OO() < 3;
   }

   private boolean O0000000O() {
      return this.O000000000OO.O0000000000() && !this.O0000000OOOO0O && this.O0000000O0000() < 1;
   }

   private boolean O00000000(String string) {
      if (!string.isEmpty() && !string.contains("ресы") && !string.contains("ресурс")) {
         for (String var5 : O0000000OO0) {
            if (string.contains(var5)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean O000000000(String string) {
      if (!string.contains("кит") && !string.contains("kit") && !string.contains("зель") && !string.contains("припас")) {
         if (!this.O00000000OOOO0() || !string.contains("инвиз") && !string.contains("invis")) {
            return !this.O00000000OOOOO() || !string.contains("морков") && !string.contains("carrot")
               ? this.O0000000O() && (string.contains("скор") || string.contains("speed") || string.contains("инвиз") || string.contains("invis"))
               : true;
         } else {
            return true;
         }
      } else {
         return this.O00000000OOOO0() || this.O00000000OOOOO() || this.O0000000O();
      }
   }

   private BlockPos O0000000O0() {
      if (O0000000000.world != null && O0000000000.player != null) {
         ChunkPos var1 = new ChunkPos(O0000000000.player.getBlockPos());
         byte var2 = 10;
         BlockPos var3 = null;
         double var4 = Double.MAX_VALUE;

         for (int var6 = -var2; var6 <= var2; var6++) {
            for (int var7 = -var2; var7 <= var2; var7++) {
               WorldChunk var8 = O0000000000.world.getChunk(var1.x + var6, var1.z + var7);
               if (var8 != null) {
                  for (BlockPos var10 : var8.getBlockEntities().keySet()) {
                     if (this.O000000000O(var10) && !this.O0000000OOOOO0.contains(var10)) {
                        String var11 = this.O0000000000OO(var10).toLowerCase(Locale.ROOT);
                        if (this.O00000000(var11) && this.O000000000(var11)) {
                           double var12 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(var10));
                           if (var12 < var4) {
                              var4 = var12;
                              var3 = var10;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private void O0000000000OOO(BlockPos blockPos) {
      if (blockPos != null) {
         this.O0000000OOOOO0.add(blockPos);

         for (BlockPos var5 : new BlockPos[]{blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west()}) {
            if (O0000000000.world.getBlockEntity(var5) instanceof ChestBlockEntity) {
               this.O0000000OOOOO0.add(var5.toImmutable());
            }
         }
      }
   }

   private void O0000000O00() {
      if (this.O00000000OOO0O != null && !this.O0000000000OO0(this.O00000000OOO0O)) {
         this.O00000000OOO0O = null;
      }

      BlockPos var1 = this.O0000000O000();
      if (var1 != null) {
         this.O00000000OOO0O = var1;
      }
   }

   private boolean O000000000O(BlockPos blockPos) {
      if (O0000000000.world == null) {
         return false;
      } else {
         BlockEntity var2 = O0000000000.world.getBlockEntity(blockPos);
         return var2 instanceof ChestBlockEntity || var2 instanceof BarrelBlockEntity || var2 instanceof ShulkerBoxBlockEntity;
      }
   }

   private BlockPos O0000000O000() {
      return this.O00000000(O0000000OO, "морков", "инвиз");
   }

   private BlockPos O00000000(String[] strings, String... strings2) {
      if (O0000000000.world != null && O0000000000.player != null) {
         BlockPos var3 = O0000000000.player.getBlockPos();
         ChunkPos var4 = new ChunkPos(var3);
         byte var5 = 10;
         BlockPos var6 = null;
         double var7 = Double.MAX_VALUE;

         for (int var9 = -var5; var9 <= var5; var9++) {
            for (int var10 = -var5; var10 <= var5; var10++) {
               WorldChunk var11 = O0000000000.world.getChunk(var4.x + var9, var4.z + var10);
               if (var11 != null) {
                  for (BlockPos var13 : var11.getBlockEntities().keySet()) {
                     if (this.O000000000O(var13) && this.O00000000(var13, strings, strings2)) {
                        double var14 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(var13));
                        if (var14 < var7) {
                           var7 = var14;
                           var6 = var13;
                        }
                     }
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
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

   private int O00000000(WardenFarm.W113 o000000000000) {
      return switch (o000000000000) {
         case INVIS -> 1;
         case CARROT -> 3;
         default -> 0;
      };
   }

   private boolean O00000000(ItemStack itemStack) {
      if (this.O000000000O0OO.O0000000000() && this.O0000000OO00OO != WardenFarm.W113.NONE) {
         if (this.O0000000OO00O0 >= this.O00000000(this.O0000000OO00OO)) {
            return false;
         } else {
            return switch (this.O0000000OO00OO) {
               case INVIS -> this.O00000000000(itemStack);
               case CARROT -> this.O0000000000O0(itemStack);
               default -> false;
            };
         }
      } else {
         return false;
      }
   }

   private boolean O000000000(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else {
         String var2 = itemStack.getName().getString().toLowerCase(Locale.ROOT);
         if (!var2.contains("invis") && !var2.contains("невид")) {
            PotionContentsComponent var3 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
            if (var3 == null) {
               return false;
            } else {
               for (StatusEffectInstance var5 : var3.getEffects()) {
                  if (var5.getEffectType().equals(StatusEffects.INVISIBILITY)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return true;
         }
      }
   }

   private boolean O0000000000(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else {
         String var2 = itemStack.getName().getString().toLowerCase(Locale.ROOT);
         if (!var2.contains("скорост") && !var2.contains("speed") && !var2.contains("swift")) {
            PotionContentsComponent var3 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
            if (var3 == null) {
               return false;
            } else {
               for (StatusEffectInstance var5 : var3.getEffects()) {
                  if (var5.getEffectType().equals(StatusEffects.SPEED)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return true;
         }
      }
   }

   private boolean O00000000000(ItemStack itemStack) {
      return !itemStack.isEmpty() && itemStack.isOf(Items.POTION) && this.O000000000(itemStack) && !this.O000000000000O(itemStack);
   }

   private boolean O000000000000(ItemStack itemStack) {
      return !itemStack.isEmpty() && itemStack.isOf(Items.POTION) && this.O0000000000(itemStack) && !this.O000000000000O(itemStack);
   }

   private int O0000000O0000() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (this.O000000000000(var3)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   private void O0000000O00000() {
      if (this.O000000000OO0.O0000000000() && this.O0000000O000O0()) {
         O0000O000OOOO.O00000000.O00000000();
         boolean var1 = this.O000000000OO0O.O0000000000() && !O0000O000OOOO.O00000000.O0000000000().equals(this.O000000000OOO0.O0000000000());
         if (var1 && this.O000000000O0O0()) {
            this.O0000000OO000 = this::O0000000O0000O;
            this.O000000000OO();
         } else {
            this.O0000000O0000O();
         }
      } else {
         this.O00000000O00.clear();
         if (this.O000000O000OO0) {
            this.O000000O000OO0 = false;
            this.O0000000O0O();
         }
      }
   }

   private void O0000000O0000O() {
      O0000O000OOOO.O00000000.O00000000();
      this.O00000000OOO0O = null;
      this.O00000000OOOO = 0;
      this.O00000000OOOO0 = -1;
      this.O0000000O00();
      if (this.O000000000OO0O.O0000000000() && !O0000O000OOOO.O00000000.O0000000000().equals(this.O000000000OOO0.O0000000000())) {
         if (this.O000000000O0O0()) {
            this.O0000000OO0000 = true;
            this.O00000000O0O = WardenFarm.W110.SEARCHING;
            this.O00000000OO00.O00000000();
            return;
         }

         String var1 = O0000O000OOOO.O00000000.O0000000000();
         if (!"N/A".equals(var1)) {
            this.O00000000OOO = var1;
         }

         O0000000000.player.networkHandler.sendChatCommand("an" + this.O000000000OOO0.O0000000000());
         this.O00000000O0O = WardenFarm.W110.SWAPPING_TO_SAVE_ANARCHY;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      } else {
         this.O00000000O0O = WardenFarm.W110.GOING_TO_STASH;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      }
   }

   private void O0000000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         int var2 = genericContainerScreenHandler.slots.size() - 36;
         int var3 = this.O000000000(genericContainerScreenHandler, var2);
         if (this.O00000000OOOO0 >= 0 && var3 >= this.O00000000OOOO0) {
            if (this.O00000000OO0O.O000000000000(6000L)) {
               this.O0000000O000OO();
               return;
            }
         } else {
            this.O00000000OOOO0 = var3;
            this.O00000000OO0O.O00000000();
         }

         if (!this.O00000000O0000.isEmpty()) {
            if (this.O00000000O0OO0.O000000000000(50L)) {
               this.O00000000O0000.poll().run();
               this.O00000000O0OO0.O00000000();
            }
         } else {
            boolean var4 = false;

            for (int var5 = var2; var5 < genericContainerScreenHandler.slots.size(); var5++) {
               Slot var6 = (Slot)genericContainerScreenHandler.slots.get(var5);
               if (var6.hasStack()) {
                  ItemStack var7 = var6.getStack();
                  String var8 = this.O0000000000000(var7);
                  if (this.O00000000O00.getOrDefault(var8, 0) > 0 || this.O000000000000O(var7)) {
                     var4 = true;
                     int var9 = var5;
                     this.O00000000O0000
                        .add(
                           () -> O0000000000.interactionManager
                              .clickSlot(genericContainerScreenHandler.syncId, var9, 0, SlotActionType.QUICK_MOVE, O0000000000.player)
                        );
                     this.O00000000O00.remove(var8);
                     return;
                  }
               }
            }

            if (!var4) {
               this.O0000000O000OO();
            }
         }
      }
   }

   private int O000000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      int var3 = 0;

      for (int var4 = i; var4 < genericContainerScreenHandler.slots.size(); var4++) {
         Slot var5 = (Slot)genericContainerScreenHandler.slots.get(var4);
         if (var5.hasStack()) {
            ItemStack var6 = var5.getStack();
            if (this.O00000000O00.getOrDefault(this.O0000000000000(var6), 0) > 0 || this.O000000000000O(var6)) {
               var3++;
            }
         }
      }

      return var3;
   }

   private boolean O0000000O000O() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (this.O000000000000O(O0000000000.player.getInventory().getStack(var1))) {
            return true;
         }
      }

      return false;
   }

   private boolean O0000000O000O0() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (!var2.isEmpty() && (this.O000000000000O(var2) || this.O00000000O00.getOrDefault(this.O0000000000000(var2), 0) > 0)) {
            return true;
         }
      }

      return false;
   }

   private void O0000000O000OO() {
      this.O00000000O00.clear();
      this.O0000000OO000O.clear();
      this.O00000000O0000.clear();
      this.O00000000OOOO = 0;
      this.O00000000OOOO0 = -1;
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }

      this.O00000000O0O = WardenFarm.W110.SEARCHING;
      this.O00000000OO00.O00000000();
      if (!this.O000000O000OO0) {
         if (this.O000000000OO0.O0000000000()
            && this.O000000000OO0O.O0000000000()
            && !"N/A".equals(this.O00000000OOO)
            && !this.O00000000OOO.equals(this.O000000000OOO0.O0000000000())) {
            this.O000000000((Runnable)(() -> {
               this.O00000000OO0O0 = true;
               this.O00000000OO0OO = System.currentTimeMillis() + 500L;
            }));
         }
      } else {
         this.O000000O000OO0 = false;
         if ("N/A".equals(this.O0000000OOO000) || this.O0000000OOO000 == null) {
            this.O0000000OOO000 = "N/A".equals(this.O00000000OOO) ? this.O0000000O0O00() : this.O00000000OOO;
         }

         this.O0000000O0O();
      }
   }

   private String O0000000000000(ItemStack itemStack) {
      return itemStack.getItem().toString() + "|" + itemStack.getName().getString();
   }

   private boolean O000000000000O(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else {
         String var2 = itemStack.getName().getString();
         if (var2.contains("[★]")) {
            return true;
         } else {
            Item var3 = itemStack.getItem();
            if (this.O000000000O0.O000000000("Дон зелья") && this.O00000000000O(itemStack)) {
               return true;
            } else if (this.O000000000O0.O000000000("Сферы") && this.O00000000000O0(itemStack)) {
               return true;
            } else if (this.O000000000O0.O000000000("Талисманы") && this.O00000000000OO(itemStack)) {
               return true;
            } else if (!this.O000000000O0.O000000000("Стрелы") || var3 != Items.ARROW && var3 != Items.TIPPED_ARROW && var3 != Items.SPECTRAL_ARROW) {
               if (this.O000000000O0.O000000000("Оружие") && this.O00000000(var3)) {
                  return true;
               } else if (this.O000000000O0.O000000000("Броня") && AutoBuy.O000000000(var3)) {
                  return true;
               } else {
                  return this.O000000000O0.O000000000("Яйца") && var3 instanceof SpawnEggItem
                     ? true
                     : this.O000000000O0.O000000000("Ценные предметы") && this.O0000000000O(itemStack);
               }
            } else {
               return true;
            }
         }
      }
   }

   private boolean O00000000(Item item) {
      return item == Items.WOODEN_SWORD
         || item == Items.STONE_SWORD
         || item == Items.IRON_SWORD
         || item == Items.GOLDEN_SWORD
         || item == Items.DIAMOND_SWORD
         || item == Items.NETHERITE_SWORD
         || item == Items.WOODEN_AXE
         || item == Items.STONE_AXE
         || item == Items.IRON_AXE
         || item == Items.GOLDEN_AXE
         || item == Items.DIAMOND_AXE
         || item == Items.NETHERITE_AXE
         || item == Items.TRIDENT
         || item == Items.MACE
         || item == Items.BOW
         || item == Items.CROSSBOW;
   }

   private boolean O00000000000O(ItemStack itemStack) {
      return O000000OOOO00.O000000000O0(itemStack)
         || O000000OOOO00.O000000000O00(itemStack)
         || O000000OOOO00.O000000000O000(itemStack)
         || O000000OOOO00.O000000000O00O(itemStack)
         || O000000OOOO00.O000000000O0O(itemStack)
         || O000000OOOO00.O000000000O0O0(itemStack)
         || O000000OOOO00.O000000000O0OO(itemStack);
   }

   private boolean O00000000000O0(ItemStack itemStack) {
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

   private boolean O00000000000OO(ItemStack itemStack) {
      return O000000OOOO00.O00000000000OO(itemStack)
         || O000000OOOO00.O0000000000O(itemStack)
         || O000000OOOO00.O0000000000O0(itemStack)
         || O000000OOOO00.O0000000000O00(itemStack)
         || O000000OOOO00.O0000000000O0O(itemStack)
         || O000000OOOO00.O0000000000OO(itemStack)
         || O000000OOOO00.O0000000000OO0(itemStack)
         || O000000OOOO00.O0000000000OOO(itemStack);
   }

   private boolean O0000000000O(ItemStack itemStack) {
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         Immediate var2 = O0000O00O0O00.O00000000();
         boolean var16 = false /* VF: Semaphore variable */;

         label91: {
            try {
               var16 = true;
               Vec3d var3 = O0000000000.gameRenderer.getCamera().getPos();
               Matrix4f var4 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
               VertexConsumer var5 = var2.getBuffer(O000000O00O00O);
               if (this.O000000000OO0.O0000000000() && this.O000000000OO00.O000000000("Ресы") && this.O00000000OOO0O != null) {
                  this.O00000000(var5, var4, this.O00000000OOO0O, var3, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
               }

               if (this.O0000000OO0O0 != null) {
                  this.O00000000(var5, var4, this.O0000000OO0O0, var3, new Color(255, 220, 0, 140), new Color(255, 220, 0, 0));
               }

               if (!this.O0000000000O0O()) {
                  var16 = false;
                  break label91;
               }

               for (BlockPos var8 : this.O00000000O000.stream().sorted(Comparator.comparingLong(this::O00000000)).limit(5L).collect(Collectors.toList())) {
                  long var9 = this.O00000000(var8) - System.currentTimeMillis();
                  Color var11;
                  Color var12;
                  if (var8.equals(this.O00000000O0O0)) {
                     float var13 = (float)(Math.sin(System.currentTimeMillis() / 60.0) * 0.5 + 0.5);
                     var11 = new Color(0, 150, 255, Math.min(255, (int)(80.0F + 150.0F * var13)));
                     var12 = new Color(0, 150, 255, 0);
                  } else if (var9 <= 0L) {
                     var11 = new Color(0, 255, 150, 120);
                     var12 = new Color(0, 255, 150, 0);
                  } else if (var9 <= 20000L) {
                     float var18 = (float)(Math.sin(System.currentTimeMillis() / 60.0) * 0.5 + 0.5);
                     var11 = new Color(255, 140, 0, Math.min(255, (int)(80.0F + 150.0F * var18)));
                     var12 = new Color(255, 140, 0, 0);
                  } else {
                     var11 = new Color(255, 0, 0, 150);
                     var12 = new Color(255, 0, 0, 0);
                  }

                  this.O00000000(var5, var4, var8, var3, var11, var12);
               }

               var16 = false;
            } finally {
               if (var16) {
                  O0000O00O0O00.O000000000();
               }
            }

            O0000O00O0O00.O000000000();
            return;
         }

         O0000O00O0O00.O000000000();
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

   private void O0000000O00O() {
      this.O0000000OOO = WardenFarm.W112.NONE;
      this.O0000000OOO0 = WardenFarm.W111.FIND;
      this.O0000000OOO00 = null;
      this.O0000000OOO00O = false;
      this.O0000000O00O0();
      this.O0000000OO000();
   }

   private void O0000000O00O0() {
      this.O0000000OOO0O0 = false;
      this.O0000000OOO0OO = false;
      this.O0000000OOOO = false;
      this.O0000000OOOO0 = WardenFarm.W114.NONE;
   }

   private boolean O0000000O00O00() {
      if (this.O0000000000O0O() || O0000000000.player == null) {
         this.O0000000O00O0();
         return false;
      } else if (this.O0000000OOOO0 == WardenFarm.W114.WAITING) {
         return true;
      } else {
         if (!this.O0000000OOO0O0) {
            O0000000000.player.networkHandler.sendChatCommand("home " + this.O000000000OOOO.O0000000000().trim());
            this.O0000000OOO0O0 = true;
            this.O0000000OOOO0 = WardenFarm.W114.WAITING;
            this.O0000000OOO0OO = false;
            this.O0000000OOOO = false;
            this.O00000000O0OO.O00000000();
            this.O00000000O0OOO.O00000000();
         }

         return true;
      }
   }

   private boolean O0000000O00O0O() {
      if (this.O0000000OOOO0 != WardenFarm.W114.WAITING) {
         return false;
      } else if (this.O0000000OOO0OO) {
         if (!this.O0000000OOOO) {
            this.O0000000OOOO = true;
         }

         if (this.O00000000O0OOO.O000000000000(5000L)) {
            this.O0000000O00O0();
         }

         return true;
      } else if (!this.O0000000000O0O() && !this.O00000000O0OO.O000000000000(2500L)) {
         return true;
      } else {
         this.O0000000O00O0();
         return false;
      }
   }

   private boolean O0000000O00OO() {
      if (!this.O0000000OOO0O || O0000000000.player == null) {
         return false;
      } else if (!this.O0000000000O0O() && this.O000000000OO0O.O0000000000()) {
         O0000O000OOOO.O00000000.O00000000();
         String var1 = O0000O000OOOO.O00000000.O0000000000();
         if (this.O0000000000(var1)) {
            return this.O0000000OOOO0 != WardenFarm.W114.NONE || this.O0000000O00O00();
         } else if (this.O000000000O0O0()) {
            return true;
         } else {
            if (this.O00000000O0OO.O000000000000(3000L)) {
               String var2 = this.O0000000OOO000;
               if (!this.O0000000000(var2)) {
                  var2 = this.O0000000O0O00();
               }

               if (!this.O0000000000(var2)) {
                  this.O0000000OOO0O = false;
                  return false;
               }

               O0000000000.player.networkHandler.sendChatCommand("an" + var2);
               this.O00000000O0OO.O00000000();
            }

            return true;
         }
      } else {
         this.O0000000OOO0O = false;
         return false;
      }
   }

   private void O0000000O00OO0() {
      if (this.O0000000000O0O()) {
         this.O0000000OOO = WardenFarm.W112.USE_INVIS;
         this.O00000000O0OO.O00000000();
      } else {
         if (this.O0000000O00O00()) {
            this.O0000000OOO = WardenFarm.W112.TELEPORT_WARDEN;
         } else {
            this.O0000000OOO = WardenFarm.W112.USE_INVIS;
            this.O00000000O0OO.O00000000();
         }
      }
   }

   private void O0000000O00OOO() {
      this.O0000000OOO000 = this.O0000000O0O00();
      if (this.O000000000OO0.O0000000000() && this.O0000000O000O0()) {
         this.O000000O000OO0 = true;
         this.O0000000O00000();
      } else {
         this.O00000000O00.clear();
         this.O0000000O0O();
      }
   }

   private void O0000000O0O() {
      if (this.O000000000O0OO.O0000000000() && this.O000000000OO0O.O0000000000()) {
         if (this.O00000000O00OO != null) {
            this.O00000000O00OO.getPathingBehavior().cancelEverything();
         }

         if (O0000000000.player != null) {
            O0000000000.player.closeHandledScreen();
         }

         if ("N/A".equals(this.O0000000OOO000) || this.O0000000OOO000 == null) {
            this.O0000000OOO000 = this.O0000000O0O00();
         }

         this.O0000000OOOO00 = false;
         this.O0000000OOOO0O = false;
         this.O0000000OOOOO0.clear();
         this.O0000000O0O0();
         this.O0000000OOO = WardenFarm.W112.SWAP_TO_BASE;
         this.O00000000O0O = WardenFarm.W110.SEARCHING;
         this.O00000000O0O0 = null;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      }
   }

   private void O0000000O0O0() {
      this.O0000000OOO0 = WardenFarm.W111.FIND;
      this.O0000000OOO00 = null;
      this.O0000000OOOOO = 0;
      this.O0000000OO00O = null;
      this.O0000000OO00O0 = 0;
      this.O0000000OO00OO = WardenFarm.W113.NONE;
      this.O00000000O0000.clear();
      this.O0000000OOOOOO = -1;
   }

   private String O0000000O0O00() {
      O0000O000OOOO.O00000000.O00000000();
      String var1 = O0000O000OOOO.O00000000.O0000000000();
      if (this.O0000000000(var1)) {
         return var1;
      } else {
         String[] var2 = this.O000000000OOO.O0000000000().split(",");
         return var2.length > 0 && !var2[0].trim().isEmpty() ? var2[0].trim() : var1;
      }
   }

   private boolean O0000000000(String string) {
      if (string != null && !"N/A".equals(string) && !string.equals(this.O000000000OOO0.O0000000000())) {
         for (String var5 : this.O000000000OOO.O0000000000().split(",")) {
            if (var5.trim().equals(string)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean O0000000O0O000() {
      O0000O000OOOO.O00000000.O00000000();
      return O0000O000OOOO.O00000000.O0000000000().equals(this.O000000000OOO0.O0000000000());
   }

   private boolean O0000000O0O00O() {
      return !this.O0000000000(O0000O000OOOO.O00000000.O0000000000())
         ? false
         : this.O0000000000O0O()
            || this.O00000000O0O == WardenFarm.W110.GOING_TO_CHEST
            || this.O00000000O0O == WardenFarm.W110.ROTATING
            || this.O00000000O0O == WardenFarm.W110.OPENING
            || this.O00000000O0O == WardenFarm.W110.WAITING_FOR_GUI;
   }

   private boolean O0000000O0O0O() {
      if (!this.O000000000O0OO.O0000000000()) {
         return true;
      } else {
         boolean var1 = this.O0000000O0O0OO() >= 1 || this.O0000000O0OO0();
         boolean var2 = this.O0000000O0OO() >= 3 || this.O0000000OOOO00;
         return var1 && var2;
      }
   }

   private boolean O0000000O0O0O0() {
      if (!this.O000000000O0OO.O0000000000()) {
         return false;
      } else if (!this.O0000000O0OO0() && this.O0000000O0O0OO() == 0) {
         return true;
      } else {
         return this.O000000000OO.O0000000000()
               && !this.O0000000OOOO0O
               && !O0000000000.player.hasStatusEffect(StatusEffects.SPEED)
               && this.O0000000O0000() == 0
            ? true
            : this.O0000000O0OO() == 0 && !this.O0000000OOOO00;
      }
   }

   private int O0000000O0O0OO() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (this.O00000000000(var3)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   private boolean O0000000000O0(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else if (!itemStack.isOf(Items.GOLDEN_CARROT) && !itemStack.isOf(Items.CARROT)) {
         String var2 = itemStack.getName().getString().toLowerCase(Locale.ROOT);
         return var2.contains("морков") || var2.contains("carrot");
      } else {
         return true;
      }
   }

   private int O0000000O0OO() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (this.O0000000000O0(var3)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   private boolean O0000000O0OO0() {
      return O0000000000.player != null && O0000000000.player.hasStatusEffect(StatusEffects.INVISIBILITY);
   }

   private boolean O00000000000(String string) {
      String var2 = string.toLowerCase(Locale.ROOT).replaceAll("§.", "");
      return var2.contains("не найден")
         || var2.contains("не существует")
         || var2.contains("нет дома")
         || var2.contains("нет точки")
         || var2.contains("not found")
         || var2.contains("unknown home")
         || var2.contains("home") && var2.contains("нет");
   }

   private void O0000000O0OO00() {
      if (O0000000000.player != null && this.O00000000O00OO != null) {
         O0000O000OOOO.O00000000.O00000000();
         switch (this.O0000000OOO) {
            case SWAP_TO_BASE:
               if (this.O0000000O0O000()) {
                  this.O0000000OOO = WardenFarm.W112.COLLECT_KIT;
                  this.O0000000O0O0();
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
               } else if (this.O000000000O0O0()) {
                  this.O00000000O0OOO.O00000000();
               } else if (this.O00000000O0OO.O000000000000(700L)) {
                  O0000000000.player.networkHandler.sendChatCommand("an" + this.O000000000OOO0.O0000000000());
                  this.O0000000OOO = WardenFarm.W112.WAIT_BASE;
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
               }
               break;
            case WAIT_BASE:
               if (this.O0000000O0O000()) {
                  this.O0000000OOO = WardenFarm.W112.COLLECT_KIT;
                  this.O0000000O0O0();
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
               } else if (this.O00000000O0OOO.O000000000000(20000L)) {
                  this.O0000000O00O();
               }
               break;
            case COLLECT_KIT:
               this.O0000000O0OO0O();
               break;
            case SWAP_TO_FARM:
               if (this.O0000000O0O0O()) {
                  String var1 = this.O0000000OOO000;
                  if ("N/A".equals(var1) || var1 == null) {
                     var1 = this.O0000000O0O00();
                  }

                  if (O0000O000OOOO.O00000000.O0000000000().equals(var1)) {
                     this.O0000000O00OO0();
                  } else if (this.O000000000O0O0()) {
                     this.O00000000O0OOO.O00000000();
                  } else if (this.O00000000O0OO.O000000000000(700L)) {
                     O0000000000.player.networkHandler.sendChatCommand("an" + var1);
                     this.O0000000OOO = WardenFarm.W112.WAIT_FARM;
                     this.O00000000O0OO.O00000000();
                     this.O00000000O0OOO.O00000000();
                  }
               } else if (this.O00000000O0OOO.O000000000000(15000L)) {
                  this.O0000000O00O();
               } else {
                  this.O0000000OOO = WardenFarm.W112.COLLECT_KIT;
                  this.O0000000O0O0();
               }
               break;
            case WAIT_FARM:
               if (this.O0000000000(O0000O000OOOO.O00000000.O0000000000())) {
                  this.O0000000O00OO0();
                  this.O00000000O0OOO.O00000000();
               } else if (this.O00000000O0OOO.O000000000000(20000L)) {
                  this.O0000000O00O();
               }
               break;
            case TELEPORT_WARDEN:
               if (this.O0000000O00O0O()) {
                  return;
               }

               this.O0000000OOO = WardenFarm.W112.USE_INVIS;
               this.O00000000O0OO.O00000000();
               break;
            case USE_INVIS:
               if (!this.O0000000O0OO0()) {
                  if (this.O000000O0000O0 == WardenFarm.W109.NONE) {
                     if (this.O0000000O0OOO0() == -1) {
                        this.O0000000O0O();
                        return;
                     }

                     this.O00000000(WardenFarm.W109.DRINK_INVIS);
                  } else {
                     this.O0000000OO00();
                  }

                  return;
               }

               this.O0000000OO000();
               this.O0000000O00O();
               this.O00000000O0O = WardenFarm.W110.SEARCHING;
               this.O00000000OO00.O00000000();
         }
      }
   }

   private void O0000000O0OO0O() {
      if (this.O0000000O0O0O() && !this.O0000000O()) {
         this.O0000000O0O0();
         this.O0000000OOO = WardenFarm.W112.SWAP_TO_FARM;
         this.O00000000O0OO.O00000000();
         this.O00000000O0OOO.O00000000();
      } else {
         switch (this.O0000000OOO0) {
            case FIND:
               this.O0000000OOO00 = this.O0000000O0();
               if (this.O0000000OOO00 == null) {
                  boolean var5 = this.O0000000O0O0OO() >= 1 || this.O0000000O0OO0();
                  if (var5 && this.O00000000O0OOO.O000000000000(1500L)) {
                     this.O0000000OOOO00 = this.O0000000O0OO() < 3;
                     this.O0000000OOOO0O = this.O000000000OO.O0000000000() && this.O0000000O0000() < 1;
                     this.O0000000O0O0();
                     this.O0000000OOO = WardenFarm.W112.SWAP_TO_FARM;
                     this.O00000000O0OO.O00000000();
                     this.O00000000O0OOO.O00000000();
                  } else if (!var5 && this.O00000000O0OOO.O000000000000(12000L)) {
                     this.O0000000OOOOO0.clear();
                     this.O00000000O0OOO.O00000000();
                  }

                  return;
               }

               this.O0000000OOO0 = WardenFarm.W111.GOING;
               this.O00000000O0OO.O00000000();
               this.O00000000O0OOO.O00000000();
               break;
            case GOING:
               double var4 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O0000000OOO00));
               if (var4 <= 4.0 && this.O00000000000OO(this.O0000000OOO00)) {
                  this.O00000000O00OO.getPathingBehavior().cancelEverything();
                  this.O0000000OOO0 = WardenFarm.W111.ROTATING;
                  this.O00000000O0OO.O00000000();
               } else if (this.O00000000O0OOO.O000000000000(15000L)) {
                  this.O0000000000OOO(this.O0000000OOO00);
                  this.O0000000OOO00 = null;
                  this.O0000000OOO0 = WardenFarm.W111.FIND;
                  this.O00000000O0OOO.O00000000();
               } else if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO0.O000000000000(2500L)) {
                  this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O0000000OOO00, 1));
                  this.O00000000OO0.O00000000();
               }
               break;
            case ROTATING:
               if (!this.O0000000000O0(this.O0000000OOO00)) {
                  this.O0000000OOO0 = WardenFarm.W111.GOING;
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
                  return;
               }

               O000000O0O00OO var3 = this.O0000000000(this.O0000000000O(this.O0000000OOO00));
               this.O000000O0.O00000000(this.O00000000(var3, this.O00000000(var3)), 35.0F, 35.0F, 35.0F, 35.0F, 20, 1);
               if (this.O0000000000O00(this.O0000000OOO00) != null && this.O00000000O0OO.O000000000000(100L)) {
                  this.O0000000OOO0 = WardenFarm.W111.OPENING;
                  this.O00000000O0OO.O00000000();
               }
               break;
            case OPENING:
               if (!this.O0000000000O0(this.O0000000OOO00)) {
                  this.O0000000OOO0 = WardenFarm.W111.GOING;
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
                  return;
               }

               O000000O0O00OO var1 = this.O0000000000(this.O0000000000O(this.O0000000OOO00));
               this.O000000O0.O00000000(this.O00000000(var1, 0.6F), 18.0F, 18.0F, 20.0F, 20.0F, 20, 1);
               BlockHitResult var2 = this.O0000000000O00(this.O0000000OOO00);
               if (var2 == null) {
                  if (this.O00000000O0OO.O000000000000(1200L)) {
                     this.O0000000OOO0 = WardenFarm.W111.ROTATING;
                     this.O00000000O0OO.O00000000();
                  }

                  return;
               }

               if (System.currentTimeMillis() - this.O000000O0000O < 400L) {
                  return;
               }

               if (this.O00000000O0OO.O000000000000(100L)) {
                  O0000000000.player.swingHand(Hand.MAIN_HAND);
                  O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var2);
                  O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
                  this.O0000000OOO0 = WardenFarm.W111.WAIT_GUI;
                  this.O00000000O0OO.O00000000();
               }
               break;
            case WAIT_GUI:
               if (this.O00000000O0OO.O000000000000(1500L)) {
                  this.O0000000OOOOO++;
                  if (this.O0000000OOOOO >= 4) {
                     this.O0000000OOOOO = 0;
                     this.O0000000OOO00 = null;
                     this.O0000000OOO0 = WardenFarm.W111.FIND;
                  } else if (this.O0000000000O0(this.O0000000OOO00)) {
                     this.O0000000OOO0 = WardenFarm.W111.OPENING;
                  } else {
                     this.O0000000OOO0 = WardenFarm.W111.GOING;
                  }

                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
               }
         }
      }
   }

   private boolean O00000000(GenericContainerScreen genericContainerScreen) {
      String var2 = genericContainerScreen.getTitle().getString().toLowerCase(Locale.ROOT).replaceAll("§.", "").trim();
      return var2.contains("сундук") || var2.contains("chest") || var2.contains("бочка") || var2.contains("barrel") || var2.contains("шалкер");
   }

   private void O00000000000(GenericContainerScreenHandler genericContainerScreenHandler) {
      if (O0000000000.player != null && O0000000000.interactionManager != null && this.O0000000OOO00 != null) {
         this.O000000000(genericContainerScreenHandler);
         if (!this.O00000000O0000.isEmpty()) {
            if (this.O00000000O0OO0.O000000000000(60L)) {
               this.O00000000O0000.poll().run();
               this.O00000000O0OO0.O00000000();
            }
         } else {
            int var2 = genericContainerScreenHandler.slots.size() - 36;
            int var3 = this.O00000000OOOO0() ? 1 - this.O0000000O0O0OO() : 0;
            int var4 = this.O000000000OO.O0000000000() ? 1 - this.O0000000O0000() : 0;
            int var5 = 3 - this.O0000000O0OO();
            if (var3 <= 0 && var4 <= 0 && var5 <= 0) {
               this.O0000000OOOO00 = false;
               this.O0000000OOOO0O = false;
               O0000000000.player.closeHandledScreen();
               this.O0000000O0O0();
               this.O0000000OOO = WardenFarm.W112.SWAP_TO_FARM;
               this.O00000000O0OO.O00000000();
               this.O00000000O0OOO.O00000000();
            } else if (!this.O00000000(genericContainerScreenHandler, var2, this::O00000000000, var3)
               && !this.O00000000(genericContainerScreenHandler, var2, this::O000000000000, var4)
               && !this.O00000000(genericContainerScreenHandler, var2, this::O0000000000O0, var5)) {
               long var6 = this.O0000000000(genericContainerScreenHandler, var2) ? 350L : 1500L;
               if (this.O00000000O0OO.O000000000000(var6)) {
                  this.O0000000000OOO(this.O0000000OOO00);
                  O0000000000.player.closeHandledScreen();
                  this.O000000O0000O = System.currentTimeMillis();
                  this.O0000000O0O0();
                  this.O00000000O0OO.O00000000();
                  this.O00000000O0OOO.O00000000();
               }
            } else {
               this.O00000000O0OO.O00000000();
            }
         }
      }
   }

   private boolean O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, Predicate<ItemStack> predicate, int j) {
      if (j <= 0) {
         return false;
      } else {
         for (int var5 = 0; var5 < i; var5++) {
            Slot var6 = (Slot)genericContainerScreenHandler.slots.get(var5);
            if (var6.hasStack() && predicate.test(var6.getStack())) {
               int var7 = var5;
               int var8 = var6.getStack().getCount();
               int var9 = this.O00000000000(genericContainerScreenHandler, i);
               if (var8 > j && var9 != -1) {
                  this.O00000000O0000
                     .add(
                        () -> O0000000000.interactionManager
                           .clickSlot(genericContainerScreenHandler.syncId, var7, 0, SlotActionType.PICKUP, O0000000000.player)
                     );

                  for (int var10 = 0; var10 < j; var10++) {
                     this.O00000000O0000
                        .add(
                           () -> O0000000000.interactionManager
                              .clickSlot(genericContainerScreenHandler.syncId, var9, 1, SlotActionType.PICKUP, O0000000000.player)
                        );
                  }

                  this.O00000000O0000
                     .add(
                        () -> O0000000000.interactionManager
                           .clickSlot(genericContainerScreenHandler.syncId, var7, 0, SlotActionType.PICKUP, O0000000000.player)
                     );
                  return true;
               }

               this.O00000000O0000
                  .add(
                     () -> O0000000000.interactionManager
                        .clickSlot(genericContainerScreenHandler.syncId, var7, 0, SlotActionType.QUICK_MOVE, O0000000000.player)
                  );
               return true;
            }
         }

         return false;
      }
   }

   private boolean O0000000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      for (int var3 = 0; var3 < i; var3++) {
         if (((Slot)genericContainerScreenHandler.slots.get(var3)).hasStack()) {
            return true;
         }
      }

      return false;
   }

   private int O00000000000(GenericContainerScreenHandler genericContainerScreenHandler, int i) {
      for (int var3 = i; var3 < genericContainerScreenHandler.slots.size(); var3++) {
         if (!((Slot)genericContainerScreenHandler.slots.get(var3)).hasStack()) {
            return var3;
         }
      }

      return -1;
   }

   private void O0000000O0OOO() {
      if (!this.O000000000O0OO.O0000000000() || this.O0000000OOO != WardenFarm.W112.NONE || O0000000000.currentScreen != null) {
         this.O0000000OO000();
      } else if (this.O00000000O0O == WardenFarm.W110.SWAPPING_TO_SAVE_ANARCHY
         || this.O00000000O0O == WardenFarm.W110.GOING_TO_STASH
         || this.O00000000O0O == WardenFarm.W110.ROTATING_STASH
         || this.O00000000O0O == WardenFarm.W110.OPENING_STASH_BLOCK
         || this.O00000000O0O == WardenFarm.W110.WAITING_FOR_GUI_STASH
         || this.O00000000O0O == WardenFarm.W110.STORING_IN_CHEST
         || this.O00000000O0O == WardenFarm.W110.OPENING_STASH) {
         this.O0000000OO000();
      } else if (this.O000000O0000O0 != WardenFarm.W109.NONE) {
         this.O0000000OO00();
      } else if (O0000000000.player.getHungerManager().getFoodLevel() <= 16 && this.O0000000OO0() != -1) {
         this.O00000000(WardenFarm.W109.EAT_CARROT);
      } else if (!this.O0000000O0OO0()) {
         if (this.O0000000O0OOO0() != -1) {
            this.O00000000(WardenFarm.W109.DRINK_INVIS);
         } else if (this.O0000000O0O0O0()) {
            this.O0000000O00OOO();
         }
      } else {
         if (this.O000000000OO.O0000000000() && !O0000000000.player.hasStatusEffect(StatusEffects.SPEED)) {
            if (this.O0000000OO() != -1) {
               this.O00000000(WardenFarm.W109.DRINK_SPEED);
            } else if (this.O0000000O0O0O0()) {
               this.O0000000O00OOO();
            }
         }
      }
   }

   private int O0000000O0OOO0() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (this.O00000000000(O0000000000.player.getInventory().getStack(var1))) {
            return var1;
         }
      }

      return -1;
   }

   private int O0000000O0OOOO() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isOf(Items.GOLDEN_CARROT)) {
            return var1;
         }
      }

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var3);
         if (this.O0000000000O0(var2)) {
            return var3;
         }
      }

      return -1;
   }

   private int O0000000OO() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (this.O000000000000(var2) && !this.O000000000(var2)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean O0000000000O00(ItemStack itemStack) {
      if (itemStack.isEmpty()) {
         return false;
      } else if (this.O0000000000O0(itemStack)) {
         return true;
      } else {
         return itemStack.get(DataComponentTypes.FOOD) == null ? false : !this.O000000000000O(itemStack);
      }
   }

   private int O0000000OO0() {
      int var1 = this.O0000000O0OOOO();
      if (var1 != -1) {
         return var1;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
            if (this.O0000000000O00(var3)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private void O00000000(WardenFarm.W109 o00000000) {
      int var2 = switch (o00000000) {
         case DRINK_INVIS -> this.O0000000O0OOO0();
         case EAT_CARROT -> this.O0000000OO0();
         case DRINK_SPEED -> this.O0000000OO();
         default -> -1;
      };
      if (var2 != -1) {
         this.O000000O000O = O0000000000.player.getInventory().getSelectedSlot();
         this.O000000O0000OO = var2;
         this.O000000O0000O0 = o00000000;
         this.O000000O000O0.O00000000();
         this.O00000000(var2);
         O0000000000.options.useKey.setPressed(true);
      }
   }

   private void O0000000OO00() {
      ItemStack var1 = O0000000000.player.getMainHandStack();

      boolean var2 = switch (this.O000000O0000O0) {
         case DRINK_INVIS -> this.O00000000000(var1);
         case EAT_CARROT -> this.O0000000000O00(var1);
         case DRINK_SPEED -> this.O000000000000(var1);
         default -> false;
      };
      if (!var2) {
         this.O0000000OO000();
      } else {
         O0000000000.options.useKey.setPressed(true);

         boolean var3 = switch (this.O000000O0000O0) {
            case DRINK_INVIS -> this.O0000000O0OO0();
            case EAT_CARROT -> O0000000000.player.getHungerManager().getFoodLevel() > 16;
            case DRINK_SPEED -> O0000000000.player.hasStatusEffect(StatusEffects.SPEED);
            default -> true;
         };
         if (var3 || this.O000000O000O0.O000000000000(4500L)) {
            this.O0000000OO000();
         }
      }
   }

   private void O0000000OO000() {
      O0000000000.options.useKey.setPressed(false);
      if (O0000000000.player != null && this.O000000O0000OO != -1 && this.O000000O000O != -1) {
         O0000000000.player.getInventory().setSelectedSlot(this.O000000O000O);
      }

      this.O000000O0000O0 = WardenFarm.W109.NONE;
      this.O000000O0000OO = -1;
      this.O000000O000O = -1;
   }

   private boolean O0000000OO0000() {
      if (!this.O000000000O0O.O0000000000() || O0000000000.player == null || O0000000000.interactionManager == null) {
         return false;
      } else if (O0000000000.player.isDead() || O0000000000.currentScreen != null || this.O000000O0000O0 != WardenFarm.W109.NONE) {
         return false;
      } else if (this.O000000000O00O()
         || this.O00000000O0O == WardenFarm.W110.ROTATING_STASH
         || this.O00000000O0O == WardenFarm.W110.OPENING_STASH_BLOCK
         || this.O00000000O0O == WardenFarm.W110.WAITING_FOR_GUI_STASH
         || this.O00000000O0O == WardenFarm.W110.STORING_IN_CHEST
         || this.O00000000O0O == WardenFarm.W110.OPENING_STASH) {
         return false;
      } else if (this.O0000000OOO != WardenFarm.W112.NONE && this.O0000000OOO0 != WardenFarm.W111.FIND && this.O0000000OOO0 != WardenFarm.W111.GOING) {
         return false;
      } else {
         int var1 = this.O0000000OO000O();
         if (var1 == -1) {
            return false;
         } else {
            int var2 = this.O0000000OO00O();
            if (var2 == -1) {
               return false;
            } else {
               if (this.O00000000O00OO != null) {
                  this.O00000000O00OO.getPathingBehavior().cancelEverything();
               }

               if (this.O000000O000O00.O000000000000(150L)) {
                  O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, var1, SlotActionType.SWAP, O0000000000.player);
                  this.O000000O000O00.O00000000();
               }

               return true;
            }
         }
      }
   }

   private int O0000000OO000O() {
      for (int var1 = 0; var1 <= 8; var1++) {
         if (!O0000000000.player.getInventory().getStack(var1).isEmpty()) {
            return var1;
         }
      }

      return -1;
   }

   private int O0000000OO00O() {
      for (int var1 = 9; var1 < 36; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isEmpty()) {
            return var1;
         }
      }

      return -1;
   }

   private void O00000000(int i) {
      if (i <= 8) {
         O0000000000.player.getInventory().setSelectedSlot(i);
         this.O000000O0000OO = i;
      } else {
         int var2 = this.O0000000OO00O0();
         if (var2 == -1) {
            var2 = this.O000000O000O;
         }

         O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, i, var2, SlotActionType.SWAP, O0000000000.player);
         O0000000000.player.getInventory().setSelectedSlot(var2);
         this.O000000O0000OO = var2;
      }
   }

   private int O0000000OO00O0() {
      for (int var1 = 0; var1 <= 8; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isEmpty()) {
            return var1;
         }
      }

      return -1;
   }

   static enum W109 {
      NONE,
      DRINK_INVIS,
      EAT_CARROT,
      DRINK_SPEED;
   }

   static enum W110 {
      SEARCHING,
      GOING_TO_CHEST,
      ROTATING,
      OPENING,
      WAITING_FOR_GUI,
      RETREATING,
      GOING_TO_DEATH_LOOT,
      COLLECTING_DEATH_LOOT,
      HUB_WAITING_FOR_CHEST,
      SWAPPING_TO_SAVE_ANARCHY,
      GOING_TO_STASH,
      OPENING_STASH,
      ROTATING_STASH,
      OPENING_STASH_BLOCK,
      WAITING_FOR_GUI_STASH,
      STORING_IN_CHEST;
   }

   static enum W111 {
      FIND,
      GOING,
      ROTATING,
      OPENING,
      WAIT_GUI;
   }

   static enum W112 {
      NONE,
      SWAP_TO_BASE,
      WAIT_BASE,
      COLLECT_KIT,
      SWAP_TO_FARM,
      WAIT_FARM,
      TELEPORT_WARDEN,
      USE_INVIS;
   }

   static enum W113 {
      NONE,
      INVIS,
      CARROT;
   }

   static enum W114 {
      NONE,
      WAITING;
   }
}
