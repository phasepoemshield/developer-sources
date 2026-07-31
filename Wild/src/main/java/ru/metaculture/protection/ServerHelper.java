package ru.metaculture.protection;

import com.google.gson.JsonObject;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.LineWidth;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.InputUtil;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import org.joml.Matrix4f;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ServerHelper",
   O000000000 = "Позволяет юзать предметы по бинду",
   O0000000000 = Category.Misc
)
public class ServerHelper extends Module {
   public static ServerHelper O000000000O;
   private static final String O00000000OO0 = "Клавиша трапки";
   private static final String O00000000OO00 = "Клавиша трапки [FunTime]";
   private static final String O00000000OO000 = "Клавиша трапки [HolyWorld]";
   private static final String O00000000OO00O = "Клавиша снежка заморозки";
   private static final String O00000000OO0O = "Клавиша снежка заморозки [FunTime]";
   private static final String O00000000OO0O0 = "Клавиша снежка заморозки [HolyWorld]";
   public final ModeSetting O000000000O0 = new ModeSetting("Режим работы", "FunTime", "FunTime", "HolyWorld");
   public final ModeSetting O000000000O00 = new ModeSetting("Определение предмета", "По атрибуту", "По атрибуту", "По названию")
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final GroupSetting O000000000O000 = new GroupSetting(
      "Дополнительные настройки",
      new BooleanSetting("Стопы", true),
      new BooleanSetting("Рендерить границы", true),
      new BooleanSetting("Рендерить границы сквозь стены", false),
      new BooleanSetting("Авто GPS на ивенты", true)
   );
   public final KeybindSetting O000000000O00O = new KeybindSetting("Клавиша дезориентации", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000O0O = new KeybindSetting("Клавиша явной пыли", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000O0O0 = new KeybindSetting("Клавиша божьей ауры", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000O0OO = new KeybindSetting("Клавиша пласта", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OO = new KeybindSetting("Клавиша трапки", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OO0 = new KeybindSetting("Клавиша снежка заморозки", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OO00 = new KeybindSetting("Клавиша зелья ассасина", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OO0O = new KeybindSetting("Клавиша зелья паладина", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OOO = new KeybindSetting("Клавиша зелья снотворного", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OOO0 = new KeybindSetting("Клавиша зелья гнева", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O000000000OOOO = new KeybindSetting("Клавиша зелья святая вода", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O00000000O = new KeybindSetting("Клавиша зелья радиации", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O00000000O0 = new KeybindSetting("Клавиша зелья хлопушки", -1, true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O00000000O00 = new KeybindSetting("Клавиша трапки", -1, true).O00000000(() -> !this.O000000000O0.O000000000("HolyWorld"));
   public final KeybindSetting O00000000O000 = new KeybindSetting("Клавиша снежка заморозки", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("HolyWorld"));
   public final KeybindSetting O00000000O0000 = new KeybindSetting("Клавиша стана", -1, true).O00000000(() -> !this.O000000000O0.O000000000("HolyWorld"));
   public final KeybindSetting O00000000O000O = new KeybindSetting("Клавиша взрывной трапки", -1, true)
      .O00000000(() -> !this.O000000000O0.O000000000("HolyWorld"));
   public final KeybindSetting O00000000O00O = new KeybindSetting("Клавиша шалкера", -1, false);
   public final KeybindSetting O00000000O00O0 = new KeybindSetting("Клавиша воздухана", -1, false);
   public final BooleanSetting O00000000O00OO = new BooleanSetting("Кидать под себя", false);
   public final BooleanSetting O00000000O0O = new BooleanSetting("Проекция Мега-бульдозера", true).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final KeybindSetting O00000000O0O0 = new KeybindSetting("Хорус", -1, false);
   public final BooleanSetting O00000000O0O00 = new BooleanSetting("Таймеры структур", false).O00000000(() -> !this.O000000000O0.O000000000("FunTime"));
   public final ModeSetting O00000000O0O0O = new ModeSetting("Тип ивента", "Фантайм", "Фантайм", "Спуки тайм")
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime") || !this.O00000000O0O00.O0000000000());
   public final BooleanSetting O00000000O0OO = new BooleanSetting("Превью", false)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime") || !this.O00000000O0O00.O0000000000());
   public final BooleanSetting O00000000O0OO0 = new BooleanSetting("Лог звуков (дебаг)", false)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime") || !this.O00000000O0O00.O0000000000());
   public final BooleanSetting O00000000O0OOO = new BooleanSetting("Лог блока (дебаг)", false)
      .O00000000(() -> !this.O000000000O0.O000000000("FunTime") || !this.O00000000O0O00.O0000000000());
   private long O00000000OO0OO = 0L;
   private long O00000000OOO = 0L;
   private static final long O00000000OOO0 = 150L;
   private static final long O00000000OOO00 = 5000L;
   private static final double O00000000OOO0O = 0.25;
   private static final long O00000000OOOO = 0L;
   private static final long O00000000OOOO0 = 800L;
   private static final int O00000000OOOOO = 3;
   private static final long O0000000O = 150L;
   private static final int O0000000O0 = 3;
   private static final int O0000000O00 = 1;
   private static final float O0000000O000 = 90.0F;
   private static final float O0000000O0000 = 180.0F;
   private static final float O0000000O00000 = 180.0F;
   private static final int O0000000O0000O = 1;
   private static final int O0000000O000O = 30;
   private static final int O0000000O000O0 = 15;
   private static final double O0000000O000OO = 0.28;
   private final Queue<ServerHelper.W99> O0000000O00O = new ArrayDeque<>();
   private int O0000000O00O0 = 0;
   private int O0000000O00O00 = 0;
   private int O0000000O00O0O = -1;
   private int O0000000O00OO = -1;
   public static boolean O00000000OO = false;
   private static final O0000O00O0OO O0000000O00OO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O0000000O00OOO = new O0000O00O0OO();
   private static final O0000O00O0OO O0000000O0O = new O0000O00O0OO();
   private static final O0000O00O0OO O0000000O0O0 = new O0000O00O0OO();
   private static boolean O0000000O0O00;
   private float O0000000O0O000 = 100.0F;
   private float O0000000O0O00O = 100.0F;
   private ServerHelper.W106 O0000000O0O0O = ServerHelper.W106.IDLE;
   private final O000000OO O0000000O0O0O0 = new O000000OO();
   private final O0000O00O0000 O0000000O0O0OO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OO = new O0000O00O0000();
   private int O0000000O0OO0 = -1;
   private int O0000000O0OO00 = -1;
   private boolean O0000000O0OO0O = false;
   private int O0000000O0OOO = -1;
   private int O0000000O0OOO0 = -1;
   private Item O0000000O0OOOO = null;
   private int O0000000OO = 0;
   private final O0000O00O0000 O0000000OO0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000OO00 = new O0000O00O0000();
   private boolean O0000000OO000 = false;
   private boolean O0000000OO0000 = false;
   private boolean O0000000OO000O = false;
   private boolean O0000000OO00O = false;
   private boolean O0000000OO00O0 = false;
   private boolean O0000000OO00OO = false;
   private int O0000000OO0O = 0;
   private boolean O0000000OO0O0 = false;
   private boolean O0000000OO0O00 = false;
   private Vec3d O0000000OO0O0O = Vec3d.ZERO;
   private ServerHelper.W100 O0000000OO0OO;
   private static final long O0000000OO0OO0 = 15000L;
   private static final long O0000000OO0OOO = 20000L;
   private static final long O0000000OOO = 60000L;
   private static final long O0000000OOO0 = 30000L;
   private static final long O0000000OOO00 = 20000L;
   private static final String O0000000OOO000 = "block.piston.extend";
   private static final String O0000000OOO00O = "block.anvil.place";
   private static final String O0000000OOO0O = "entity.ender_dragon.growl";
   private static final long O0000000OOO0O0 = 250L;
   private static final double O0000000OOO0OO = 16.0;
   private static final long O0000000OOOO = 180L;
   private static final long O0000000OOOO0 = 1500L;
   private static final int O0000000OOOO00 = 128;
   private static final ServerHelper.W101[] O0000000OOOO0O = new ServerHelper.W101[]{
      new ServerHelper.W101(
         "Драконий скин",
         30000L,
         0L,
         new ServerHelper.W103("entity.wither.break_block", 1.0F, 0.7F),
         new ServerHelper.W103("entity.ender_dragon.growl", 1.5F, 0.2F),
         new ServerHelper.W103("ui.toast.challenge_complete", 1.5F, 0.35F),
         new ServerHelper.W103("entity.evoker_fangs.attack", 0.85F, 0.5F)
      )
   };
   private static ItemStack O0000000OOOOO;
   private static ItemStack O0000000OOOOO0;
   private static ItemStack O0000000OOOOOO;
   private static ItemStack O000000O0;
   private static final ServerHelper.W105[] O000000O00 = new ServerHelper.W105[]{
      ServerHelper.W105.TRAPKA, ServerHelper.W105.PLAST, ServerHelper.W105.DRAGON_TRAP, ServerHelper.W105.DRAGON_PLAST
   };
   private static final int[][] O000000O000 = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   private final List<ServerHelper.W104> O000000O0000 = new ArrayList<>();
   private final ArrayDeque<ServerHelper.W102> O000000O00000 = new ArrayDeque<>();
   private int O000000O000000 = -1;
   private String O000000O00000O = "";
   private static final Set<Block> O000000O0000O = Set.of(
      Blocks.GRASS_BLOCK,
      Blocks.DIRT,
      Blocks.COARSE_DIRT,
      Blocks.PODZOL,
      Blocks.ROOTED_DIRT,
      Blocks.MUD,
      Blocks.MYCELIUM,
      Blocks.MOSS_BLOCK,
      Blocks.DIRT_PATH,
      Blocks.FARMLAND,
      Blocks.STONE,
      Blocks.GRANITE,
      Blocks.DIORITE,
      Blocks.ANDESITE,
      Blocks.DEEPSLATE,
      Blocks.COBBLED_DEEPSLATE,
      Blocks.TUFF,
      Blocks.CALCITE,
      Blocks.COBBLESTONE,
      Blocks.MOSSY_COBBLESTONE,
      Blocks.GRAVEL,
      Blocks.SAND,
      Blocks.RED_SAND,
      Blocks.SANDSTONE,
      Blocks.CLAY,
      Blocks.BEDROCK,
      Blocks.DEAD_TUBE_CORAL_BLOCK,
      Blocks.SNOW_BLOCK,
      Blocks.ICE,
      Blocks.PACKED_ICE,
      Blocks.BLUE_ICE,
      Blocks.MAGMA_BLOCK,
      Blocks.NETHERRACK
   );
   private static final Pattern O000000O0000O0 = Pattern.compile("координатах\\s+(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)");
   private static final int O000000O0000OO = 1024;
   private static final RenderPipeline O000000O000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "helper_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000O000O0 = RenderLayer.of("helper_box", 1024, false, true, O000000O000O, MultiPhaseParameters.builder().build(false));
   private static final RenderPipeline O000000O000O00 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "helper_lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000O000O0O = RenderLayer.of(
      "helper_lines", 1024, false, true, O000000O000O00, MultiPhaseParameters.builder().lineWidth(new LineWidth(OptionalDouble.of(10.0))).build(false)
   );
   private static final RenderPipeline O000000O000OO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "helper_box_no_depth"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000O000OO0 = RenderLayer.of(
      "helper_box_no_depth", 1024, false, true, O000000O000OO, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderPipeline O000000O000OOO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "helper_lines_no_depth"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000O00O = RenderLayer.of(
      "helper_lines_no_depth", 1024, false, true, O000000O000OOO, MultiPhaseParameters.builder().lineWidth(new LineWidth(OptionalDouble.of(10.0))).build(false)
   );

   public ServerHelper() {
      O000000000O = this;
      this.O000000000OO.O00000000("Клавиша трапки [FunTime]");
      this.O00000000O00.O00000000("Клавиша трапки [HolyWorld]");
      this.O000000000OO0.O00000000("Клавиша снежка заморозки [FunTime]");
      this.O00000000O000.O00000000("Клавиша снежка заморозки [HolyWorld]");
      this.O00000000(
         new Setting[]{
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
            this.O000000000OOOO,
            this.O00000000O,
            this.O00000000O0,
            this.O00000000O0000,
            this.O00000000O00,
            this.O00000000O000,
            this.O00000000O000O,
            this.O00000000O00O,
            this.O00000000O00O0,
            this.O00000000O00OO,
            this.O00000000O0O,
            this.O00000000O0O0,
            this.O00000000O0O00,
            this.O00000000O0O0O
         }
      );
   }

   @Override
   public void O00000000(JsonObject jsonObject) {
      JsonObject var2 = jsonObject == null ? null : jsonObject.deepCopy();
      if (var2 != null && var2.has("Settings")) {
         try {
            JsonObject var3 = var2.getAsJsonObject("Settings");
            if (var3.has("Клавиша трапки")) {
               int var4 = var3.get("Клавиша трапки").getAsInt();
               if (!var3.has("Клавиша трапки [FunTime]")) {
                  var3.addProperty("Клавиша трапки [FunTime]", var4);
               }

               if (!var3.has("Клавиша трапки [HolyWorld]")) {
                  var3.addProperty("Клавиша трапки [HolyWorld]", var4);
               }
            }

            if (var3.has("Клавиша снежка заморозки")) {
               int var6 = var3.get("Клавиша снежка заморозки").getAsInt();
               if (!var3.has("Клавиша снежка заморозки [FunTime]")) {
                  var3.addProperty("Клавиша снежка заморозки [FunTime]", var6);
               }

               if (!var3.has("Клавиша снежка заморозки [HolyWorld]")) {
                  var3.addProperty("Клавиша снежка заморозки [HolyWorld]", var6);
               }
            }
         } catch (Throwable var5) {
         }
      }

      super.O00000000(var2);
   }

   private boolean O00000000(KeybindSetting o0000000OOO0O, O0000000O0O0 o0000000O0O0) {
      if (o0000000OOO0O.O0000000000() != -1 && o0000000O0O0.O00000000000() == o0000000OOO0O.O0000000000()) {
         return o0000000OOO0O.O0000000000000 ? o0000000O0O0.O0000000000000() == 0 : o0000000O0O0.O0000000000000() == 1;
      } else {
         return false;
      }
   }

   private boolean O00000000(ItemStack itemStack, String string) {
      return itemStack.getName().getString().toLowerCase(Locale.ROOT).contains(string.toLowerCase(Locale.ROOT));
   }

   private boolean O00000000(ItemStack itemStack, String... strings) {
      for (String var6 : strings) {
         if (this.O00000000(itemStack, var6)) {
            return true;
         }
      }

      return false;
   }

   public Predicate<ItemStack> O00000000(Predicate<ItemStack> predicate, String... strings) {
      return this.O000000000O00.O000000000("По названию") ? itemStack -> this.O00000000(itemStack, strings) : predicate;
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (O0000000000.currentScreen == null) {
         ServerHelper.W99 var2 = null;
         if (this.O000000000O0.O000000000("FunTime")) {
            if (this.O00000000(this.O000000000O00O, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000OO0, "Дезориентация"), false);
            } else if (this.O00000000(this.O000000000O0O, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000OO, "Явная пыль"), false);
            } else if (this.O00000000(this.O000000000O0OO, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000OOO, "Пласт"), false);
            } else if (this.O00000000(this.O000000000O0O0, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O00000000O0OOO, "Божья аура"), false);
            } else if (this.O00000000(this.O000000000OO, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000OO00, "Трапка"), false);
            } else if (this.O00000000(this.O000000000OO0, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O00000000O0OO0, "Снежок заморозка"), false);
            } else if (this.O00000000(this.O000000000OO00, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O0, "Зелье Ассасина"), false);
            } else if (this.O00000000(this.O000000000OO0O, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O0O, "Зелье Паладина", "Зелье Палладина"), false);
            } else if (this.O00000000(this.O000000000OOO, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O0OO, "Снотворное"), false);
            } else if (this.O00000000(this.O000000000OOO0, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O00, "Зелье Гнева"), false);
            } else if (this.O00000000(this.O000000000OOOO, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O00O, "Святая вода"), false);
            } else if (this.O00000000(this.O00000000O, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O0O0, "Зелье Радиации"), false);
            } else if (this.O00000000(this.O00000000O0, o0000000O0O0)) {
               var2 = new ServerHelper.W99(this.O00000000(O000000OOOO00::O000000000O000, "Хлопушка"), false);
            }
         }

         if (this.O000000000O0.O000000000("HolyWorld")) {
            if (this.O00000000(this.O00000000O00, o0000000O0O0)) {
               var2 = new ServerHelper.W99(O000000OOOO000::O00000000, false);
            } else if (this.O00000000(this.O00000000O000, o0000000O0O0)) {
               var2 = new ServerHelper.W99(O000000OOOO000::O000000000, false);
            } else if (this.O00000000(this.O00000000O0000, o0000000O0O0)) {
               var2 = new ServerHelper.W99(O000000OOOO000::O0000000000, false);
            } else if (this.O00000000(this.O00000000O000O, o0000000O0O0)) {
               var2 = new ServerHelper.W99(O000000OOOO000::O00000000000, false);
            }
         }

         if (this.O00000000(this.O00000000O00O, o0000000O0O0)) {
            var2 = new ServerHelper.W99(itemStack -> itemStack.getItem().toString().contains("shulker_box"), true);
         }

         if (this.O00000000(this.O00000000O00O0, o0000000O0O0)) {
            var2 = new ServerHelper.W99(itemStack -> itemStack.isOf(Items.WIND_CHARGE), false, false, this.O00000000O00OO.O0000000000());
         }

         if (this.O00000000(this.O00000000O0O0, o0000000O0O0)) {
            var2 = new ServerHelper.W99(itemStack -> itemStack.isOf(Items.CHORUS_FRUIT), false, true);
         }

         if (var2 != null && System.currentTimeMillis() - this.O00000000OOO >= 150L) {
            this.O00000000OOO = System.currentTimeMillis();
            this.O0000000O00O.add(var2);
         }
      }
   }

   @EventHandler
   private void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         this.O00000000O000O();
         this.O000000000O0O();
         if (this.O0000000O0O0O == ServerHelper.W106.IDLE) {
            if (!this.O0000000O00O.isEmpty()) {
               ServerHelper.W99 var6 = this.O0000000O00O.poll();
               int var3 = -1;

               for (int var4 = 0; var4 < 36; var4++) {
                  ItemStack var5 = O0000000000.player.getInventory().getStack(var4);
                  if (var5 != null && !var5.isEmpty() && var6.O00000000.test(var5)) {
                     var3 = var4;
                     break;
                  }
               }

               if (var3 == -1) {
                  return;
               }

               this.O0000000O0OO0 = var3;
               this.O0000000O0OO00 = O0000000000.player.getInventory().getSelectedSlot();
               this.O0000000OO000 = var6.O000000000;
               this.O0000000OO0000 = var6.O0000000000;
               this.O0000000OO000O = var6.O00000000000;
               this.O0000000OO00O = var3 >= 9 && !var6.O000000000;
               if (this.O0000000OO00O) {
                  this.O0000000O0OOO = this.O0000000O0OO00;
                  this.O0000000O0OOO0 = var3;
                  this.O0000000O0OOOO = O0000000000.player.getInventory().getStack(this.O0000000O0OO00).getItem();
               }

               this.O0000000OO00O0 = false;
               this.O0000000OO00OO = false;
               this.O0000000OO0O = 0;
               this.O0000000OO0O0 = false;
               this.O0000000OO0O00 = false;
               this.O0000000OO0O0O = O0000000000.player.getPos();
               this.O0000000O00O00 = 0;
               this.O0000000O0O0OO.O00000000();
               this.O0000000O0OO.O00000000();
               this.O0000000O0O0O = ServerHelper.W106.PREPARE;
               O00000000OO = true;
               if (this.O0000000000O0O()) {
                  this.O000000000O0();
               } else {
                  this.O0000000000O0();
               }
            }
         } else {
            if (!this.O0000000000O0O()) {
               this.O0000000000O0();
               Sprint.O000000000O000 = 2;
               O0000000000.options.sprintKey.setPressed(false);
               O0000000000.player.setSprinting(false);
            }

            switch (this.O0000000O0O0O) {
               case PREPARE:
                  if (this.O0000000OO000) {
                     if (this.O0000000O0O0OO.O00000000(0L)) {
                        this.O0000000O0O0OO.O00000000();
                        int var2 = this.O0000000O0OO0 < 9 ? 36 + this.O0000000O0OO0 : this.O0000000O0OO0;
                        O0000000000.interactionManager
                           .clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, 1, SlotActionType.PICKUP, O0000000000.player);
                        this.O0000000O0O0O = ServerHelper.W106.COOLDOWN;
                     }
                  } else if (this.O0000000000O0O()) {
                     this.O0000000000OO();
                  } else {
                     this.O0000000O0O0O = ServerHelper.W106.SWAP;
                  }
                  break;
               case PRE_SWAP_STOP:
                  this.O000000000O0();
                  if (!this.O000000000O()) {
                     return;
                  }

                  this.O000000000O00();
                  if (this.O0000000OO0000 && !this.O00000000O()) {
                     this.O00000000O000();
                     return;
                  }

                  if (this.O0000000OO0000) {
                     if (this.O0000000O0OO0 < 9 && this.O00000000O()) {
                        this.O000000000OO0O();
                     } else {
                        this.O0000000O00O00 = 0;
                        this.O0000000O0O0O = ServerHelper.W106.WAIT_MAIN_HAND;
                     }
                  } else {
                     this.O000000000O0O0();
                     this.O0000000000OO0();
                  }
                  break;
               case WAIT_MAIN_HAND:
                  this.O000000000O0();
                  if (this.O0000000OO0000 && this.O00000000O()) {
                     this.O000000000OO0O();
                     return;
                  }

                  if (this.O0000000O00O00++ >= 3) {
                     this.O00000000O000();
                  }
                  break;
               case SWAP:
                  if (this.O0000000O0OO0 >= 9) {
                     this.O0000000000OO();
                     return;
                  }

                  O0000000000.player.getInventory().setSelectedSlot(this.O0000000O0OO0);
                  ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
                  if (this.O0000000OO0000) {
                     this.O000000000OO0O();
                     this.O0000000O0O0O = ServerHelper.W106.USE;
                  } else {
                     this.O000000000O0O0();
                     this.O0000000O0O0O = ServerHelper.W106.RESTORE;
                  }
                  break;
               case USE:
                  if (this.O0000000OO0000) {
                     if (this.O0000000OO00OO) {
                        this.O000000000OOO();
                     } else {
                        this.O000000000OO0O();
                     }
                  } else {
                     this.O0000000O0O0O = ServerHelper.W106.RESTORE;
                  }
                  break;
               case PRE_RESTORE_STOP:
                  this.O000000000O0();
                  if (!this.O000000000O()) {
                     return;
                  }

                  this.O000000000O000();
                  this.O0000000O0O0O = ServerHelper.W106.COOLDOWN;
                  break;
               case RESTORE:
                  if (this.O0000000OO0000) {
                     this.O00000000O0();
                  }

                  if (this.O0000000O0OO0 >= 9) {
                     this.O0000000000OO0();
                     return;
                  }

                  O0000000000.player.getInventory().setSelectedSlot(this.O0000000O0OO00);
                  ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
                  this.O0000000O0O0O = ServerHelper.W106.COOLDOWN;
                  break;
               case COOLDOWN:
                  if (!this.O0000000OO000 && this.O0000000O0OO0 >= 9) {
                     O0000000000.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
                     O0000000000.player.closeHandledScreen();
                  }

                  if (this.O000000000O000.O000000000("Стопы")) {
                     O0000O00O00O.O00000000().O000000000("ServerHelper_Lock");
                  }

                  this.O000000000OO0();
                  if (this.O0000000OO00O) {
                     this.O0000000O0OO0O = true;
                     this.O0000000OO = 3;
                     this.O0000000OO0.O00000000();
                     this.O0000000OO00.O00000000();
                  }

                  this.O0000000O0O0O = ServerHelper.W106.IDLE;
                  O00000000OO = false;
                  this.O0000000OO000 = false;
                  this.O0000000OO0000 = false;
                  this.O0000000OO000O = false;
                  this.O0000000OO00O = false;
                  this.O0000000OO00OO = false;
                  this.O0000000OO0O = 0;
            }
         }
      }
   }

   private void O0000000000O0() {
      if (this.O000000000O000.O000000000("Стопы")) {
         O0000O00O00O.O00000000().O00000000("ServerHelper_Lock");
      }
   }

   private void O0000000000O00() {
      if (this.O000000000O000.O000000000("Стопы")) {
         O0000O00O00O.O00000000().O000000000("ServerHelper_Lock");
      }
   }

   private boolean O0000000000O0O() {
      return this.O0000000OO0000 || this.O0000000OO00O;
   }

   private void O0000000000OO() {
      this.O00000000O0();
      this.O0000000O0O0O = ServerHelper.W106.PRE_SWAP_STOP;
      this.O0000000000OOO();
      this.O000000000O0();
   }

   private void O0000000000OO0() {
      this.O00000000O0();
      this.O0000000O0O0O = ServerHelper.W106.PRE_RESTORE_STOP;
      this.O0000000000OOO();
      this.O000000000O0();
   }

   private void O0000000000OOO() {
      this.O0000000O0OO.O00000000();
   }

   private boolean O000000000O() {
      return this.O0000000O0OO.O00000000000O(0L);
   }

   private void O000000000O0() {
      this.O0000000000O0();
      Sprint.O000000000O000 = Math.max(Sprint.O000000000O000, 2);
      O0000000000.options.sprintKey.setPressed(false);
      O0000000000.options.useKey.setPressed(false);
      O0000000000.player.setSprinting(false);
   }

   private void O000000000O00() {
      if (this.O0000000O0OO0 < 9) {
         O0000000000.player.getInventory().setSelectedSlot(this.O0000000O0OO0);
         ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
      } else {
         this.O000000000O00O();
      }
   }

   private void O000000000O000() {
      if (this.O0000000O0OO0 < 9) {
         O0000000000.player.getInventory().setSelectedSlot(this.O0000000O0OO00);
         ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
      } else {
         this.O000000000O00O();
      }
   }

   private void O000000000O00O() {
      O0000000000.interactionManager
         .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O0000000O0OO0, this.O0000000O0OO00, SlotActionType.SWAP, O0000000000.player);
   }

   private void O000000000O0O() {
      if (this.O0000000O0OO0O) {
         if (O0000000000.player == null || O0000000000.interactionManager == null) {
            this.O0000000O0OO0O = false;
         } else if (this.O0000000OO <= 0 || this.O0000000OO0.O00000000000O(800L)) {
            this.O0000000O0OO0O = false;
         } else if (this.O0000000O0O0O == ServerHelper.W106.IDLE) {
            Item var1 = O0000000000.player.getInventory().getStack(this.O0000000O0OOO).getItem();
            Item var2 = O0000000000.player.getInventory().getStack(this.O0000000O0OOO0).getItem();
            if (var1 != this.O0000000O0OOOO && var2 == this.O0000000O0OOOO) {
               if (this.O0000000OO00.O00000000000O(150L)) {
                  this.O0000000OO00.O00000000();
                  O0000000000.interactionManager
                     .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O0000000O0OOO0, this.O0000000O0OOO, SlotActionType.SWAP, O0000000000.player);
                  this.O0000000OO--;
               }
            }
         }
      }
   }

   private void O000000000O0O0() {
      if (this.O0000000OO000O) {
         this.O000000000O0OO();
      }

      O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
   }

   private void O000000000O0OO() {
      this.O0000000O0O0O0.O00000000(new O000000O0O00OO(O0000000000.player.getYaw(), 90.0F), 180.0F, 180.0F, 180.0F, 180.0F, 1, this.O000000000OO());
      O0000000000.options.jumpKey.setPressed(true);
      this.O0000000OO00O0 = true;
      if (O0000000000.player.isOnGround()) {
         O0000000000.player.jump();
      }
   }

   private int O000000000OO() {
      return AttackAura.O00000000OO0 != null ? 30 : 15;
   }

   private void O000000000OO0() {
      if (this.O0000000OO00O0) {
         this.O000000000OO00();
         this.O0000000OO00O0 = false;
      }
   }

   private void O000000000OO00() {
      if (O0000000000.options != null && O0000000000.getWindow() != null) {
         boolean var1 = InputUtil.isKeyPressed(O0000000000.getWindow().getHandle(), O0000000000.options.jumpKey.getDefaultKey().getCode());
         O0000000000.options.jumpKey.setPressed(var1);
      }
   }

   private void O000000000OO0O() {
      this.O0000000OO0O0O = O0000000000.player.getPos();
      this.O0000000OO00OO = true;
      this.O0000000OO0O0 = false;
      this.O0000000OO0O00 = false;
      this.O0000000O0O0OO.O00000000();
      O0000000000.options.useKey.setPressed(true);
      O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
      this.O0000000O0O0O = ServerHelper.W106.USE;
   }

   private void O000000000OOO() {
      if (O0000000000.player == null || O0000000000.interactionManager == null) {
         this.O000000000OOO0();
      } else if (this.O000000000OOOO()) {
         if (!this.O0000000OO0O0) {
            this.O0000000000O00();
         }

         this.O0000000OO0O0 = true;
         this.O0000000OO0O = 0;
         O0000000000.options.useKey.setPressed(true);
      } else {
         if (this.O0000000OO0O0 && !this.O0000000OO0O00) {
            this.O0000000OO0O00 = true;
            O0000000000.options.useKey.setPressed(false);
         }

         if (this.O0000000OO0O00 && this.O00000000O00()) {
            this.O000000000OOO0();
         } else if (!this.O0000000OO0O0) {
            this.O000000000O0();
            if (this.O00000000O() && this.O0000000OO0O++ < 1) {
               this.O000000000OO0O();
            } else {
               this.O000000000OOO0();
            }
         } else {
            if (this.O0000000O0O0OO.O00000000000O(5000L)) {
               this.O000000000OOO0();
            }
         }
      }
   }

   private void O000000000OOO0() {
      this.O00000000O0();
      this.O0000000000OO0();
   }

   private boolean O000000000OOOO() {
      return O0000000000.player != null
         && O0000000000.player.isUsingItem()
         && O0000000000.player.getActiveHand() == Hand.MAIN_HAND
         && O0000000000.player.getActiveItem().isOf(Items.CHORUS_FRUIT);
   }

   private boolean O00000000O() {
      return O0000000000.player != null && O0000000000.player.getMainHandStack().isOf(Items.CHORUS_FRUIT);
   }

   private void O00000000O0() {
      if (O0000000000.options != null) {
         O0000000000.options.useKey.setPressed(false);
      }

      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.isUsingItem()) {
         O0000000000.interactionManager.stopUsingItem(O0000000000.player);
         O0000000000.player.stopUsingItem();
      }
   }

   private boolean O00000000O00() {
      return O0000000000.player != null && O0000000000.player.getPos().squaredDistanceTo(this.O0000000OO0O0O) >= 0.25;
   }

   private void O0000000000(boolean bl) {
      if (O0000000000.getWindow() != null) {
         KeyBinding[] var2 = new KeyBinding[]{
            O0000000000.options.forwardKey, O0000000000.options.backKey, O0000000000.options.leftKey, O0000000000.options.rightKey, O0000000000.options.jumpKey
         };
         long var3 = O0000000000.getWindow().getHandle();

         for (KeyBinding var8 : var2) {
            boolean var9 = bl && InputUtil.isKeyPressed(var3, var8.getDefaultKey().getCode());
            var8.setPressed(var9);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var9 = var2.content().getString();
         if (this.O000000000O000.O000000000("Авто GPS на ивенты") && var9.contains("Появился на координатах")) {
            Matcher var5 = O000000O0000O0.matcher(var9);
            if (var5.find()) {
               try {
                  float var6 = Float.parseFloat(var5.group(1));
                  float var7 = Float.parseFloat(var5.group(3));
                  GpsCommand.O00000000(var6, var7);
               } catch (NumberFormatException var8) {
               }
            }
         }
      } else if (o0000000O000OO.O00000000000() instanceof PlaySoundS2CPacket var3) {
         this.O00000000(var3);
      }
   }

   private void O00000000O000() {
      this.O000000000OO0();
      if (this.O0000000O0O0O != ServerHelper.W106.IDLE) {
         O0000O00O00O.O00000000().O000000000("ServerHelper_Lock");
      }

      if (O0000000000.options != null) {
         O0000000000.options.useKey.setPressed(false);
      }

      if (this.O0000000O00O0 > 0 && this.O000000000O000.O000000000("Стопы")) {
         O0000O00O00O.O00000000().O000000000("ServerHelper_Lock");
      }

      this.O0000000O00O0 = 0;
      this.O0000000O00O00 = 0;
      this.O0000000O0OO0 = -1;
      this.O0000000O0OO00 = -1;
      this.O0000000OO000 = false;
      this.O0000000OO0000 = false;
      this.O0000000OO000O = false;
      this.O0000000OO00O = false;
      this.O0000000OO00OO = false;
      this.O0000000OO0O = 0;
      this.O0000000OO0O0 = false;
      this.O0000000OO0O00 = false;
      this.O0000000O0OO.O00000000();
      this.O0000000O0OO0O = false;
      this.O0000000O0O0O = ServerHelper.W106.IDLE;
      O00000000OO = false;
   }

   @Override
   public void O000000000() {
      this.O00000000OO0OO = 0L;
      this.O00000000OOO = 0L;
      this.O0000000O00O.clear();
      this.O000000O0000.clear();
      this.O000000O00000.clear();
      this.O000000O000000 = -1;
      this.O00000000O000();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (!O0000O00O0000O.O00000000()) {
         boolean var2 = this.O000000000O000.O000000000("Рендерить границы");
         if (var2 || this.O00000000O0O.O0000000000()) {
            RenderLayer var3 = this.O000000000O000.O000000000("Рендерить границы сквозь стены") ? O000000O000OO0 : O000000O000O0;
            RenderLayer var4 = this.O000000000O000.O000000000("Рендерить границы сквозь стены") ? O000000O00O : O000000O000O0O;
            if (this.O00000000O0000()) {
               var3 = O000000O000OO0;
               var4 = O000000O00O;
            }

            if (this.O00000000O0O.O0000000000()) {
               this.O00000000(o0000000OO0000, O000000O000OO0, O000000O00O);
            }

            if (var2) {
               if (this.O000000000O0O.O0000000000() != -1 && KeybindSetting.O000000000(this.O000000000O0O.O0000000000())) {
                  double var5 = MathHelper.lerp(o0000000OO0000.O00000000000(), O0000000000.player.lastRenderX, O0000000000.player.getX());
                  double var7 = MathHelper.lerp(o0000000OO0000.O00000000000(), O0000000000.player.lastRenderY, O0000000000.player.getY());
                  double var9 = MathHelper.lerp(o0000000OO0000.O00000000000(), O0000000000.player.lastRenderZ, O0000000000.player.getZ());
                  double var11 = 3.0;
                  double var13 = 1.0;
                  boolean var15 = this.O00000000(var5, var7, var9, var11, var13);
                  int var16 = var15
                     ? O0000O000OO000.O000000000000(new Color(255, 50, 50).getRGB(), 10)
                     : O0000O000OO000.O000000000000(new Color(50, 150, 255).getRGB(), 255);
                  int var17 = var15 ? new Color(255, 0, 0).getRGB() : new Color(0, 100, 255).getRGB();
                  Immediate var18 = O0000O00O0O00.O00000000();

                  try {
                     Vec3d var19 = O0000000000.gameRenderer.getCamera().getPos();
                     Matrix4f var20 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
                     VertexConsumer var21 = var18.getBuffer(var3);
                     O0000O00O0O0.O000000000(
                        var21, var20, (float)(var5 - var19.x), (float)(var7 - var19.y), (float)(var9 - var19.z), (float)var11, (float)var13, var16, 40
                     );
                     VertexConsumer var22 = var18.getBuffer(var4);
                     O0000O00O0O0.O00000000(
                        var22,
                        var20,
                        (float)(var5 - var19.x),
                        (float)(var7 - 0.005F - var19.y),
                        (float)(var9 - var19.z),
                        (float)var11 + 0.005F,
                        (float)var13 + 0.01F,
                        var17,
                        40
                     );
                  } finally {
                     O0000O00O0O00.O000000000();
                  }
               }

               this.O00000000(this.O000000000OO, 2.0, 3.0, o0000000OO0000, var3, var4);
               this.O00000000(this.O000000000O0O0, 4.0, 2.0, o0000000OO0000, var3, var4);
               this.O00000000(this.O000000000O0OO, 2.0, 2.0, o0000000OO0000, var3, var4);
               this.O00000000(this.O000000000OO0, 2.0, 2.0, o0000000OO0000, var3, var4);
               this.O00000000(this.O000000000O00O, 2.0, 2.0, o0000000OO0000, var3, var4);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(O0000000OO0000 o0000000OO0000, RenderLayer renderLayer, RenderLayer renderLayer2) {
      if (O0000000000.world == null || !(O0000000000.crosshairTarget instanceof BlockHitResult var4 && var4.getType() == Type.BLOCK)) {
         this.O0000000OO0OO = null;
      } else if (!this.O00000000(O0000000000.player.getMainHandStack())) {
         this.O0000000OO0OO = null;
      } else {
         BlockPos var27 = var4.getBlockPos();
         if (O0000000000.world.getBlockState(var27).isAir()) {
            this.O0000000OO0OO = null;
         } else {
            ServerHelper.W100 var6 = this.O00000000(var27, var4.getSide());
            ServerHelper.W100 var7 = this.O0000000OO0OO == null ? var6 : this.O0000000OO0OO.lerp(var6, 0.28);
            this.O0000000OO0OO = var7;
            int var8 = new Color(40, 220, 170).getRGB();
            int var9 = O0000O000OO000.O000000000000(var8, 80);
            int var10 = O0000O000OO000.O000000000000(var8, 8);
            int var11 = new Color(40, 255, 180, 235).getRGB();
            Immediate var12 = O0000O00O0O00.O00000000();
            boolean var25 = false /* VF: Semaphore variable */;

            try {
               var25 = true;
               Vec3d var13 = O0000000000.gameRenderer.getCamera().getPos();
               Matrix4f var14 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
               float var15 = (float)(var7.minX - var13.x);
               float var16 = (float)(var7.minY - var13.y);
               float var17 = (float)(var7.minZ - var13.z);
               float var18 = (float)(var7.maxX - var13.x);
               float var19 = (float)(var7.maxY - var13.y);
               float var20 = (float)(var7.maxZ - var13.z);
               VertexConsumer var21 = var12.getBuffer(renderLayer);
               O0000O00O0O0.O00000000(var21, var14, var15, var16, var17, var18, var19, var20, var9, var10);
               VertexConsumer var22 = var12.getBuffer(renderLayer2);
               O0000O00O0O0.O000000000(var22, var14, var15 - 0.008F, var16 - 0.008F, var17 - 0.008F, var18 + 0.008F, var19 + 0.008F, var20 + 0.008F, var11);
               var25 = false;
            } finally {
               if (var25) {
                  O0000O00O0O00.O000000000();
               }
            }

            O0000O00O0O00.O000000000();
         }
      }
   }

   private ServerHelper.W100 O00000000(BlockPos blockPos, Direction direction) {
      return switch (direction) {
         case EAST -> new ServerHelper.W100(
            blockPos.getX() - 4, blockPos.getY() - 4, blockPos.getZ() - 4, blockPos.getX() + 1, blockPos.getY() + 5, blockPos.getZ() + 5
         );
         case WEST -> new ServerHelper.W100(
            blockPos.getX(), blockPos.getY() - 4, blockPos.getZ() - 4, blockPos.getX() + 5, blockPos.getY() + 5, blockPos.getZ() + 5
         );
         case UP -> new ServerHelper.W100(
            blockPos.getX() - 4, blockPos.getY() - 4, blockPos.getZ() - 4, blockPos.getX() + 5, blockPos.getY() + 1, blockPos.getZ() + 5
         );
         case DOWN -> new ServerHelper.W100(
            blockPos.getX() - 4, blockPos.getY(), blockPos.getZ() - 4, blockPos.getX() + 5, blockPos.getY() + 5, blockPos.getZ() + 5
         );
         case SOUTH -> new ServerHelper.W100(
            blockPos.getX() - 4, blockPos.getY() - 4, blockPos.getZ() - 4, blockPos.getX() + 5, blockPos.getY() + 5, blockPos.getZ() + 1
         );
         case NORTH -> new ServerHelper.W100(
            blockPos.getX() - 4, blockPos.getY() - 4, blockPos.getZ(), blockPos.getX() + 5, blockPos.getY() + 5, blockPos.getZ() + 5
         );
         default -> throw new MatchException(null, null);
      };
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack == null || itemStack.isEmpty() || !itemStack.isOf(Items.NETHERITE_PICKAXE)) {
         return false;
      } else if (O000000OOOO00.O00000000OO000(itemStack)) {
         return true;
      } else {
         StringBuilder var2 = new StringBuilder(itemStack.getName().getString());
         LoreComponent var3 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
         if (var3 != null) {
            for (Text var5 : var3.lines()) {
               var2.append(' ').append(var5.getString());
            }
         }

         String var6 = var2.toString().replaceAll("§.", "").replace('ё', 'е').replace('Ё', 'Е').toLowerCase(Locale.ROOT);
         return var6.contains("мега-бульдозер") || var6.contains("мега бульдозер");
      }
   }

   private boolean O00000000(double d, double e, double f, double g, double h) {
      if (O0000000000.world == null) {
         return false;
      } else {
         Box var11 = new Box(d - g, e, f - g, d + g, e + h, f + g);

         for (PlayerEntity var13 : O0000000000.world.getPlayers()) {
            if (var13 != O0000000000.player && var13.getBoundingBox().intersects(var11)) {
               return true;
            }
         }

         return false;
      }
   }

   private void O00000000(KeybindSetting o0000000OOO0O, double d, double e, O0000000OO0000 o0000000OO0000, RenderLayer renderLayer, RenderLayer renderLayer2) {
      if (o0000000OOO0O.O0000000000() != -1 && KeybindSetting.O000000000(o0000000OOO0O.O0000000000())) {
         this.O00000000(o0000000OO0000, d, e, renderLayer, renderLayer2);
      }
   }

   private boolean O00000000O0000() {
      if (O0000000000.world != null && O0000000000.gameRenderer != null) {
         Vec3d var1 = O0000000000.gameRenderer.getCamera().getPos();
         BlockPos var2 = BlockPos.ofFloored(var1);
         BlockState var3 = O0000000000.world.getBlockState(var2);
         return !var3.getCollisionShape(O0000000000.world, var2).isEmpty();
      } else {
         return false;
      }
   }

   private void O00000000(O0000000OO0000 o0000000OO0000, double d, double e, RenderLayer renderLayer, RenderLayer renderLayer2) {
      double var8 = MathHelper.lerp(o0000000OO0000.O00000000000(), O0000000000.player.lastRenderX, O0000000000.player.getX());
      double var10 = MathHelper.lerp(o0000000OO0000.O00000000000(), O0000000000.player.lastRenderY, O0000000000.player.getY());
      double var12 = MathHelper.lerp(o0000000OO0000.O00000000000(), O0000000000.player.lastRenderZ, O0000000000.player.getZ());
      boolean var14 = this.O00000000(var8, var10, var12, d, e);
      int var15 = var14 ? new Color(255, 30, 30).getRGB() : new Color(0, 130, 255).getRGB();
      int var16 = O0000O000OO000.O000000000000(var15, 60);
      int var17 = O0000O000OO000.O000000000000(var15, 0);
      int var18 = var14 ? new Color(255, 0, 0, 255).getRGB() : new Color(0, 150, 255, 255).getRGB();
      Immediate var19 = O0000O00O0O00.O00000000();

      try {
         Vec3d var20 = O0000000000.gameRenderer.getCamera().getPos();
         Matrix4f var21 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
         float var22 = (float)(var8 - d - var20.x);
         float var23 = (float)(var10 - var20.y);
         float var24 = (float)(var12 - d - var20.z);
         float var25 = (float)(var8 + d - var20.x);
         float var26 = (float)(var10 + e - var20.y);
         float var27 = (float)(var12 + d - var20.z);
         VertexConsumer var28 = var19.getBuffer(renderLayer);
         O0000O00O0O0.O00000000(var28, var21, var22, var23, var24, var25, var26, var27, var16, var17);
         VertexConsumer var29 = var19.getBuffer(renderLayer2);
         O0000O00O0O0.O000000000(var29, var21, var22 - 0.005F, var23 - 0.005F, var24 - 0.005F, var25 + 0.005F, var26 + 0.005F, var27 + 0.005F, var18);
      } finally {
         O0000O00O0O00.O000000000();
      }
   }

   public String O00000000(int i, String string) {
      if (i == -1 || i == 0) {
         return "-";
      } else if (i <= -100 && i >= -110) {
         int var5 = -(i + 100);

         return switch (var5) {
            case 0 -> "LMB";
            case 1 -> "RMB";
            case 2 -> "MMB";
            default -> "M" + (var5 + 1);
         };
      } else if (string != null && !string.isEmpty() && !string.equals("Неизвестно")) {
         String var3 = string.toUpperCase();
         var3 = var3.replace("KEY.KEYBOARD.", "")
            .replace("KEY.MOUSE.", "M")
            .replace("MOUSE ", "M")
            .replace("MOUSE", "M")
            .replace("BUTTON ", "M")
            .replace("BUTTON", "M")
            .replace("LEFT.SHIFT", "LSHIFT")
            .replace("LEFT SHIFT", "LSHIFT")
            .replace("RIGHT.SHIFT", "RSHIFT")
            .replace("RIGHT SHIFT", "RSHIFT")
            .replace("LEFT.ALT", "LALT")
            .replace("LEFT ALT", "LALT")
            .replace("RIGHT.ALT", "RALT")
            .replace("RIGHT ALT", "RALT")
            .replace("LEFT.CONTROL", "LCTRL")
            .replace("LEFT CONTROL", "LCTRL")
            .replace("RIGHT.CONTROL", "RCTRL")
            .replace("RIGHT CONTROL", "RCTRL")
            .replace("CONTROL", "CTRL")
            .replace("NUMPAD.", "N")
            .replace("NUMPAD ", "N")
            .replace("NUMPAD", "N")
            .replace("SPACE", "SPC")
            .replace("ПРОБЕЛ", "SPC")
            .replace("LEFT ", "L")
            .replace("RIGHT ", "R")
            .replace("ЛЕВАЯ ", "L")
            .replace("ПРАВАЯ ", "R")
            .replace("КНОПКА МЫШИ", "MB");
         if (var3.equals("M1") || var3.equals("LMB") || var3.equals("LEFT")) {
            return "LMB";
         } else if (var3.equals("M2") || var3.equals("RMB") || var3.equals("RIGHT")) {
            return "RMB";
         } else {
            return !var3.equals("M3") && !var3.equals("MMB") && !var3.equals("MIDDLE") ? var3 : "MMB";
         }
      } else {
         return String.valueOf(i);
      }
   }

   private void O00000000O000O() {
      if (this.O00000000O0O00.O0000000000() && this.O000000000O0.O000000000("FunTime")) {
         if (O0000000000.player != null && O0000000000.world != null) {
            long var1 = System.currentTimeMillis();
            this.O00000000(var1);
            this.O00000000O00O();
            int var3 = this.O00000000O00O0();
            if (this.O000000O000000 > 0 && var3 < this.O000000O000000) {
               this.O00000000(O0000000000.player.getPos(), ServerHelper.W105.TRAPKA, 15000L);
            }

            this.O000000O000000 = var3;

            for (int var4 = this.O000000O0000.size() - 1; var4 >= 0; var4--) {
               ServerHelper.W104 var5 = this.O000000O0000.get(var4);
               long var6 = var1 - var5.O000000000;
               if (var5.O000000000000 && var6 >= 500L) {
                  if (this.O00000000(var5.O00000000, Blocks.NETHERITE_BLOCK, 5, 9, 5)) {
                     var5.O0000000000 = ServerHelper.W105.DRAGON_PLAST;
                     var5.O00000000000 = 30000L;
                     var5.O000000000000 = false;
                  } else {
                     var5.O0000000000 = ServerHelper.W105.PLAST;
                     var5.O000000000000 = false;
                     var5.O000000000000O = true;
                     this.O0000000000(var5);
                  }
               } else if (var5.O00000000000O) {
                  if (var6 <= 450L) {
                     this.O00000000(var5);
                  } else {
                     var5.O00000000000O = false;
                  }
               } else if (var5.O000000000000O) {
                  if (var6 <= 450L) {
                     this.O0000000000(var5);
                  } else {
                     var5.O000000000000O = false;
                  }
               } else if (var5.O0000000000000) {
                  if (var6 <= 350L) {
                     this.O000000000000(var5);
                  } else {
                     var5.O0000000000000 = false;
                  }
               }

               if (var6 > var5.O00000000000) {
                  this.O000000O0000.remove(var4);
               }
            }
         }
      } else {
         if (!this.O000000O0000.isEmpty()) {
            this.O000000O0000.clear();
         }

         if (!this.O000000O00000.isEmpty()) {
            this.O000000O00000.clear();
         }

         this.O000000O000000 = -1;
      }
   }

   private void O00000000(PlaySoundS2CPacket playSoundS2CPacket) {
      if (this.O00000000O0O00.O0000000000() && this.O000000000O0.O000000000("FunTime") && O0000000000.world != null) {
         String var2 = ((SoundEvent)playSoundS2CPacket.getSound().value()).id().getPath();
         float var3 = playSoundS2CPacket.getPitch();
         float var4 = playSoundS2CPacket.getVolume();
         double var5 = playSoundS2CPacket.getX();
         double var7 = playSoundS2CPacket.getY();
         double var9 = playSoundS2CPacket.getZ();
         if (this.O00000000O0OO0.O0000000000()) {
            ChatUtil.O00000000(String.format(Locale.US, "§e%s§7 pitch=§f%.2f§7 vol=§f%.2f§7 @ §f%.0f %.0f %.0f", var2, var3, var4, var5, var7, var9));
         }

         this.O000000O00000.add(new ServerHelper.W102(var2, var3, var4, var5, var7, var9, System.currentTimeMillis()));

         while (this.O000000O00000.size() > 128) {
            this.O000000O00000.pollFirst();
         }
      }
   }

   private void O00000000(long l) {
      if (!this.O000000O00000.isEmpty()) {
         for (ServerHelper.W101 var6 : O0000000OOOO0O) {
            this.O00000000(var6);
         }

         for (ServerHelper.W102 var8 : this.O000000O00000) {
            if (!var8.O00000000000O && l - var8.O000000000000O >= 180L) {
               this.O00000000(var8);
               var8.O00000000000O = true;
            }
         }

         this.O000000O00000.removeIf(o00000000000 -> l - o00000000000.O000000000000O > 1500L);
      }
   }

   private void O00000000(ServerHelper.W101 o0000000000) {
      for (ServerHelper.W102 var3 : this.O000000O00000) {
         if (!var3.O00000000000O && o0000000000.O00000000(var3)) {
            ServerHelper.W102[] var4 = new ServerHelper.W102[o0000000000.O00000000000.length];
            boolean var5 = true;

            for (int var6 = 0; var6 < o0000000000.O00000000000.length; var6++) {
               ServerHelper.W102 var7 = null;

               for (ServerHelper.W102 var9 : this.O000000O00000) {
                  if (!var9.O00000000000O
                     && !O00000000(var4, var9)
                     && o0000000000.O00000000000[var6].O00000000(var9)
                     && Math.abs(var9.O000000000000O - var3.O000000000000O) <= 250L) {
                     double var10 = var9.O00000000000 - var3.O00000000000;
                     double var12 = var9.O000000000000 - var3.O000000000000;
                     double var14 = var9.O0000000000000 - var3.O0000000000000;
                     if (!(var10 * var10 + var12 * var12 + var14 * var14 > 16.0)) {
                        var7 = var9;
                        break;
                     }
                  }
               }

               if (var7 == null) {
                  var5 = false;
                  break;
               }

               var4[var6] = var7;
            }

            if (var5) {
               for (ServerHelper.W102 var19 : var4) {
                  var19.O00000000000O = true;
               }

               this.O00000000(new Vec3d(var3.O00000000000, var3.O000000000000, var3.O0000000000000), o0000000000);
            }
         }
      }
   }

   private static boolean O00000000(ServerHelper.W102[] o00000000000s, ServerHelper.W102 o00000000000) {
      for (ServerHelper.W102 var5 : o00000000000s) {
         if (var5 == o00000000000) {
            return true;
         }
      }

      return false;
   }

   private void O00000000(Vec3d vec3d, ServerHelper.W101 o0000000000) {
      if (!this.O00000000000(vec3d)) {
         ServerHelper.W104 var3 = new ServerHelper.W104(vec3d, System.currentTimeMillis(), ServerHelper.W105.TRAPKA, o0000000000.O000000000);
         var3.O00000000000O0 = o0000000000;
         var3.O00000000000O = true;
         this.O000000O0000.add(var3);
         this.O00000000(var3);
      }
   }

   private void O00000000(ServerHelper.W104 o0000000000000) {
      int var2 = this.O000000000(o0000000000000);
      if (var2 != 0) {
         o0000000000000.O00000000000O = false;
         if (var2 == 1) {
            o0000000000000.O0000000000 = ServerHelper.W105.TRAPKA;
            o0000000000000.O00000000000 = o0000000000000.O00000000000O0.O000000000;
            o0000000000000.O00000000000OO = null;
         } else {
            o0000000000000.O0000000000 = ServerHelper.W105.PLAST;
            o0000000000000.O00000000000 = o0000000000000.O00000000000O0.O0000000000 > 0L
               ? o0000000000000.O00000000000O0.O0000000000
               : (var2 == 3 ? 60000L : 20000L);
         }
      }
   }

   private int O000000000(ServerHelper.W104 o0000000000000) {
      if (O0000000000.world == null) {
         return 0;
      } else {
         int var2 = MathHelper.floor(o0000000000000.O00000000.x);
         int var3 = MathHelper.floor(o0000000000000.O00000000.y);
         int var4 = MathHelper.floor(o0000000000000.O00000000.z);
         Mutable var5 = new Mutable();
         long var6 = Long.MIN_VALUE;
         double var8 = Double.MAX_VALUE;

         for (int var10 = -2; var10 <= 2; var10++) {
            for (int var11 = -2; var11 <= 2; var11++) {
               for (int var12 = -2; var12 <= 2; var12++) {
                  var5.set(var2 + var10, var3 + var11, var4 + var12);
                  if (this.O00000000(O0000000000.world.getBlockState(var5), var5)) {
                     double var13 = var10 * var10 + var11 * var11 + var12 * var12;
                     if (var13 < var8) {
                        var8 = var13;
                        var6 = var5.asLong();
                     }
                  }
               }
            }
         }

         if (var6 == Long.MIN_VALUE) {
            return 0;
         } else {
            short var32 = 9000;
            byte var33 = 18;
            ArrayDeque var34 = new ArrayDeque();
            HashSet var35 = new HashSet();
            var34.add(var6);
            var35.add(var6);
            int var14 = Integer.MAX_VALUE;
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            int var17 = Integer.MIN_VALUE;
            int var18 = Integer.MIN_VALUE;
            int var19 = Integer.MIN_VALUE;
            int var20 = 0;

            while (!var34.isEmpty() && var35.size() <= var32) {
               long var21 = (Long)var34.poll();
               int var23 = BlockPos.unpackLongX(var21);
               int var24 = BlockPos.unpackLongY(var21);
               int var25 = BlockPos.unpackLongZ(var21);
               var20++;
               if (var23 < var14) {
                  var14 = var23;
               }

               if (var23 > var17) {
                  var17 = var23;
               }

               if (var24 < var15) {
                  var15 = var24;
               }

               if (var24 > var18) {
                  var18 = var24;
               }

               if (var25 < var16) {
                  var16 = var25;
               }

               if (var25 > var19) {
                  var19 = var25;
               }

               for (int var26 = 0; var26 < 6; var26++) {
                  int var27 = var23 + O000000O000[var26][0];
                  int var28 = var24 + O000000O000[var26][1];
                  int var29 = var25 + O000000O000[var26][2];
                  if (Math.abs(var27 - var2) <= var33 && Math.abs(var28 - var3) <= var33 && Math.abs(var29 - var4) <= var33) {
                     var5.set(var27, var28, var29);
                     long var30 = var5.asLong();
                     if (!var35.contains(var30) && this.O00000000(O0000000000.world.getBlockState(var5), var5)) {
                        var35.add(var30);
                        var34.add(var30);
                     }
                  }
               }
            }

            if (var20 < 12) {
               return 0;
            } else {
               int var36 = var17 - var14;
               int var22 = var18 - var15;
               int var37 = var19 - var16;
               int var38 = Math.min(var36, Math.min(var22, var37));
               int var39 = Math.max(var36, Math.max(var22, var37));
               if (var38 * 3 > var39) {
                  return 1;
               } else {
                  boolean var40 = var22 <= var36 && var22 <= var37;
                  o0000000000000.O00000000000OO = new Vec3d((var14 + var17) / 2.0 + 0.5, (var15 + var18) / 2.0 + 0.5, (var16 + var19) / 2.0 + 0.5);
                  return var40 ? 3 : 2;
               }
            }
         }
      }
   }

   private boolean O00000000(BlockState blockState, BlockPos blockPos) {
      return !blockState.isAir() && !O000000O0000O.contains(blockState.getBlock())
         ? !blockState.getCollisionShape(O0000000000.world, blockPos).isEmpty()
         : false;
   }

   private void O00000000O00O() {
      if (this.O00000000O0OOO.O0000000000()) {
         if (O0000000000.crosshairTarget instanceof BlockHitResult var1 && var1.getType() == Type.BLOCK) {
            String var3 = Registries.BLOCK.getId(O0000000000.world.getBlockState(var1.getBlockPos()).getBlock()).toString();
            if (!var3.equals(this.O000000O00000O)) {
               this.O000000O00000O = var3;
               ChatUtil.O00000000("§bблок:§f " + var3);
            }
         }
      }
   }

   private void O00000000(ServerHelper.W102 o00000000000) {
      String var2 = o00000000000.O00000000;
      float var3 = o00000000000.O000000000;
      float var4 = o00000000000.O0000000000;
      Vec3d var5 = new Vec3d(o00000000000.O00000000000, o00000000000.O000000000000, o00000000000.O0000000000000);
      if (!this.O00000000O0O0O.O000000000("Спуки тайм")) {
         if (var2.equals("block.anvil.place") && O00000000(var3, 1.1F) && O00000000(var4, 0.7F)) {
            this.O0000000000(var5);
         } else if (var2.equals("block.piston.extend") && O00000000(var3, 0.5F) && O00000000(var4, 0.7F)) {
            this.O00000000(var5, ServerHelper.W105.TRAPKA, 15000L);
         } else if (var2.equals("entity.ender_dragon.growl") && O00000000(var3, 1.0F) && O00000000(var4, 0.2F)) {
            this.O00000000(var5);
         }
      } else if (var2.equals("block.piston.extend") && O00000000(var3, 0.5F) && O00000000(var4, 0.5F)) {
         this.O00000000(var5, ServerHelper.W105.TRAPKA, 15000L);
      } else if (var2.equals("block.anvil.place") && O00000000(var3, 0.5F) && O00000000(var4, 0.5F)) {
         this.O000000000(var5);
      } else if (var2.equals("entity.ender_dragon.growl") && O00000000(var3, 0.7F) && O00000000(var4, 0.5F)) {
         this.O00000000(var5);
      }
   }

   private void O00000000(Vec3d vec3d, ServerHelper.W105 o000000000000O, long l) {
      if (!this.O00000000000(vec3d)) {
         this.O000000O0000.add(new ServerHelper.W104(vec3d, System.currentTimeMillis(), o000000000000O, l));
      }
   }

   private void O00000000(Vec3d vec3d) {
      if (!this.O00000000000(vec3d)) {
         ServerHelper.W104 var2 = new ServerHelper.W104(vec3d, System.currentTimeMillis(), ServerHelper.W105.DRAGON_PLAST, 20000L);
         var2.O0000000000000 = true;
         this.O000000O0000.add(var2);
         this.O000000000000(var2);
      }
   }

   private void O000000000(Vec3d vec3d) {
      if (!this.O00000000000(vec3d)) {
         ServerHelper.W104 var2 = new ServerHelper.W104(vec3d, System.currentTimeMillis(), ServerHelper.W105.PLAST, 20000L);
         var2.O000000000000 = true;
         this.O000000O0000.add(var2);
      }
   }

   private void O0000000000(Vec3d vec3d) {
      if (!this.O00000000000(vec3d)) {
         ServerHelper.W104 var2 = new ServerHelper.W104(vec3d, System.currentTimeMillis(), ServerHelper.W105.PLAST, 20000L);
         var2.O000000000000O = true;
         this.O000000O0000.add(var2);
         this.O0000000000(var2);
      }
   }

   private void O0000000000(ServerHelper.W104 o0000000000000) {
      int var2 = this.O00000000000(o0000000000000);
      if (var2 > 0) {
         o0000000000000.O00000000000 = var2 == 2 ? 60000L : 20000L;
         o0000000000000.O000000000000O = false;
      }
   }

   private int O00000000000(ServerHelper.W104 o0000000000000) {
      if (O0000000000.world == null) {
         return 0;
      } else {
         Vec3d var2 = o0000000000000.O00000000;
         int var3 = MathHelper.floor(var2.x);
         int var4 = MathHelper.floor(var2.y);
         int var5 = MathHelper.floor(var2.z);
         Mutable var6 = new Mutable();
         long var7 = Long.MIN_VALUE;
         double var9 = Double.MAX_VALUE;

         for (int var11 = -3; var11 <= 3; var11++) {
            for (int var12 = -3; var12 <= 3; var12++) {
               for (int var13 = -3; var13 <= 3; var13++) {
                  var6.set(var3 + var11, var4 + var12, var5 + var13);
                  if (this.O00000000(O0000000000.world.getBlockState(var6))) {
                     double var14 = var11 * var11 + var12 * var12 + var13 * var13;
                     if (var14 < var9) {
                        var9 = var14;
                        var7 = var6.asLong();
                     }
                  }
               }
            }
         }

         if (var7 == Long.MIN_VALUE) {
            return 0;
         } else {
            short var33 = 6000;
            byte var34 = 16;
            ArrayDeque var35 = new ArrayDeque();
            HashSet var36 = new HashSet();
            var35.add(var7);
            var36.add(var7);
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            int var17 = Integer.MAX_VALUE;
            int var18 = Integer.MIN_VALUE;
            int var19 = Integer.MIN_VALUE;
            int var20 = Integer.MIN_VALUE;
            int var21 = 0;

            while (!var35.isEmpty() && var36.size() <= var33) {
               long var22 = (Long)var35.poll();
               int var24 = BlockPos.unpackLongX(var22);
               int var25 = BlockPos.unpackLongY(var22);
               int var26 = BlockPos.unpackLongZ(var22);
               var6.set(var24, var25, var26);
               if (O0000000000.world.getBlockState(var6).isOf(Blocks.DEAD_TUBE_CORAL_BLOCK)) {
                  var21++;
                  if (var24 < var15) {
                     var15 = var24;
                  }

                  if (var24 > var18) {
                     var18 = var24;
                  }

                  if (var25 < var16) {
                     var16 = var25;
                  }

                  if (var25 > var19) {
                     var19 = var25;
                  }

                  if (var26 < var17) {
                     var17 = var26;
                  }

                  if (var26 > var20) {
                     var20 = var26;
                  }
               }

               for (int var27 = 0; var27 < 6; var27++) {
                  int var28 = var24 + O000000O000[var27][0];
                  int var29 = var25 + O000000O000[var27][1];
                  int var30 = var26 + O000000O000[var27][2];
                  if (Math.abs(var28 - var3) <= var34 && Math.abs(var29 - var4) <= var34 && Math.abs(var30 - var5) <= var34) {
                     var6.set(var28, var29, var30);
                     long var31 = var6.asLong();
                     if (!var36.contains(var31) && this.O00000000(O0000000000.world.getBlockState(var6))) {
                        var36.add(var31);
                        var35.add(var31);
                     }
                  }
               }
            }

            if (var21 < 3) {
               return 0;
            } else {
               o0000000000000.O00000000000OO = new Vec3d((var15 + var18) / 2.0 + 0.5, (var16 + var19) / 2.0 + 0.5, (var17 + var20) / 2.0 + 0.5);
               int var37 = var18 - var15;
               int var23 = var19 - var16;
               int var38 = var20 - var17;
               boolean var39 = var23 < var37 && var23 < var38;
               return var39 ? 2 : 1;
            }
         }
      }
   }

   private boolean O00000000(BlockState blockState) {
      return blockState.isOf(Blocks.COBBLESTONE) || blockState.isOf(Blocks.ANDESITE) || blockState.isOf(Blocks.DEAD_TUBE_CORAL_BLOCK);
   }

   private boolean O00000000000(Vec3d vec3d) {
      long var2 = System.currentTimeMillis();

      for (ServerHelper.W104 var5 : this.O000000O0000) {
         if (var2 - var5.O000000000 <= 500L && var5.O00000000.squaredDistanceTo(vec3d) <= 2.25) {
            return true;
         }
      }

      return false;
   }

   private void O000000000000(ServerHelper.W104 o0000000000000) {
      if (O0000000000.world != null) {
         if (this.O00000000(o0000000000000.O00000000, Blocks.RESPAWN_ANCHOR, 6, 3, 6)) {
            o0000000000000.O0000000000 = ServerHelper.W105.DRAGON_TRAP;
            o0000000000000.O00000000000 = 30000L;
            o0000000000000.O0000000000000 = false;
         }
      }
   }

   private boolean O00000000(Vec3d vec3d, Block block, int i, int j, int k) {
      if (O0000000000.world == null) {
         return false;
      } else {
         Mutable var6 = new Mutable();
         int var7 = MathHelper.floor(vec3d.x);
         int var8 = MathHelper.floor(vec3d.y);
         int var9 = MathHelper.floor(vec3d.z);

         for (int var10 = -i; var10 <= i; var10++) {
            for (int var11 = -k; var11 <= k; var11++) {
               for (int var12 = -j; var12 <= j; var12++) {
                  var6.set(var7 + var10, var8 + var12, var9 + var11);
                  if (O0000000000.world.getBlockState(var6).isOf(block)) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private int O00000000O00O0() {
      if (O0000000000.player == null) {
         return 0;
      } else {
         int var1 = 0;
         PlayerInventory var2 = O0000000000.player.getInventory();
         int var3 = var2.size();

         for (int var4 = 0; var4 < var3; var4++) {
            ItemStack var5 = var2.getStack(var4);
            if (var5.isOf(Items.NETHERITE_HOE)) {
               var1 += var5.getCount();
            }
         }

         return var1;
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (this.O00000000O0O00.O0000000000() && this.O000000000O0.O000000000("FunTime") && O0000000000.player != null && O0000000000.world != null) {
         RenderManager var2 = o0000000O00O.O00000000000();
         if (var2 != null && O0000000000.gameRenderer != null) {
            boolean var3 = this.O00000000O0OO.O0000000000();
            if (!this.O000000O0000.isEmpty() || var3) {
               var2.O00000000(20.0F);
               if (var3) {
                  this.O00000000(var2, o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
               }

               long var4 = System.currentTimeMillis();
               Vec3d var6 = O0000000000.gameRenderer.getCamera().getPos();

               for (ServerHelper.W104 var8 : this.O000000O0000) {
                  long var9 = var8.O00000000000 - (var4 - var8.O000000000);
                  if (var9 > 0L) {
                     boolean var11 = var8.O0000000000 == ServerHelper.W105.PLAST && var8.O00000000000OO != null;
                     Vec3d var12 = var11 ? var8.O00000000000OO : new Vec3d(var8.O00000000.x, var8.O00000000.y + 1.4, var8.O00000000.z);
                     double var13 = var6.distanceTo(var12);
                     if (!(var13 > 110.0)) {
                        Vec3d var15 = O0000O000OOOOO.O00000000(var12);
                        if (var15 != null && !(var15.z <= 0.001) && !(var15.z > 1.0)) {
                           float var16 = (float)MathHelper.clamp(1.0 - (var13 - 6.0) / 390.0, 0.667, 1.033);
                           float var17 = MathHelper.clamp((float)var9 / (float)var8.O00000000000, 0.0F, 1.0F);
                           this.O00000000(var2, (float)var15.x, (float)var15.y, var16, var8.O0000000000, var9, var17, var11);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, int i, int j) {
      long var4 = System.currentTimeMillis();
      float var6 = 0.9F;
      float var7 = 62.0F * var6;
      float var8 = i * 0.5F;
      float var9 = j * 0.36F;

      for (int var10 = 0; var10 < O000000O00.length; var10++) {
         ServerHelper.W105 var11 = O000000O00[var10];
         long var12 = O00000000(var11);
         long var14 = var12 - var4 % var12;
         float var16 = MathHelper.clamp((float)var14 / (float)var12, 0.0F, 1.0F);
         float var17 = var9 + var10 * var7;
         this.O00000000(o0000O00OO0O0, var8, var17, var6, var11, var14, var16, false);
      }
   }

   private static long O00000000(ServerHelper.W105 o000000000000O) {
      return switch (o000000000000O) {
         case TRAPKA -> 15000L;
         case PLAST -> 20000L;
         case DRAGON_TRAP -> 30000L;
         case DRAGON_PLAST -> 20000L;
      };
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, ServerHelper.W105 o000000000000O, long l, float i, boolean bl) {
      FontObject var10 = FontRegistry.O00000000000;
      float var11 = (float)l / 1000.0F;
      String var12 = String.format(Locale.US, "%.1f", var11).replace('.', ',') + " Second";
      float var13 = 26.0F * h;
      FontRenderer.W409 var14 = RenderManager.O00000000(var10, var12, var13);
      float var15 = var14.O00000000;
      float var16 = var14.O000000000;
      float var17 = 19.0F * h;
      float var18 = 3.6F * h;
      float var19 = var17 * 0.5F + 3.2F * h;
      float var20 = var19 + var18;
      float var21 = var20 * 2.0F;
      float var22 = 8.0F * h;
      float var23 = 14.0F * h;
      float var24 = 7.5F * h;
      float var25 = 9.0F * h;
      float var26 = Math.max(var21, var16);
      float var27 = var26 + var24 * 2.0F;
      float var28 = var22 + var21 + var25 + var15 + var23;
      float var29 = f - var28 * 0.5F;
      float var30 = bl ? g - var27 * 0.5F : g - var27 - 5.0F * h;
      float var31 = MathHelper.clamp((float)l / 500.0F, 0.0F, 1.0F);
      o0000O00OO0O0.O000000000000(var31);
      int var32 = O000000000(o000000000000O);
      float var33 = var27 * 0.5F;
      o0000O00OO0O0.O00000000(var29, var30, var28, var27, var33, 1.0F);
      o0000O00OO0O0.O00000000(var29, var30, var28, var27, var33, O0000O000OO000.O0000000000(15, 16, 22, 210));
      o0000O00OO0O0.O00000000(var29, var30, var28, var27, var33, O0000O000OO000.O0000000000(255, 255, 255, 28), 1.0F);
      float var34 = var29 + var22 + var20;
      float var35 = var30 + var27 * 0.5F;
      o0000O00OO0O0.O000000000(var34, var35, var19, 0.0F, 1.0F, O0000O000OO000.O0000000000(12, 13, 18, 245));
      int var36 = O0000O000OO000.O0000000000(O0000O000OO000.O000000000(255, 72, 72), var32, i);
      int var37 = O0000O000OO000.O0000000000(255, 255, 255, 40);
      float var38 = (var19 + var20) * 0.5F;
      float var39 = var18 * 0.62F;
      byte var40 = 46;
      int var41 = (int)Math.ceil(var40 * i);

      for (int var42 = 0; var42 < var40; var42++) {
         double var43 = (-Math.PI / 2) + (double)var42 / var40 * Math.PI * 2.0;
         float var45 = (float)(Math.cos(var43) * var38);
         float var46 = (float)(Math.sin(var43) * var38);
         o0000O00OO0O0.O000000000(var34 + var45, var35 + var46, var39, 0.0F, 1.0F, var42 < var41 ? var36 : var37);
      }

      ItemRenderUtil.O00000000(o0000O00OO0O0, O0000000000(o000000000000O), var34 - var17 * 0.5F, var35 - var17 * 0.5F, var17 / 16.0F, 0, false, 0);
      float var47 = var29 + var22 + var21 + var25;
      float var48 = var30 + (var27 - var16) * 0.5F + var16 * 0.72F;
      o0000O00OO0O0.O00000000(var10, var47 + 1.0F, var48 + 1.0F, var13, var12, O0000O000OO000.O0000000000(0, 0, 0, 165));
      o0000O00OO0O0.O00000000(var10, var47, var48, var13, var12, O0000O000OO000.O0000000000(242, 244, 250, 255));
      o0000O00OO0O0.O00000000000OO();
   }

   static boolean O00000000(float f, float g) {
      return Math.abs(f - g) < 0.01F;
   }

   private static int O000000000(ServerHelper.W105 o000000000000O) {
      return switch (o000000000000O) {
         case TRAPKA -> O0000O000OO000.O000000000(255, 150, 60);
         case PLAST -> O0000O000OO000.O000000000(90, 210, 150);
         case DRAGON_TRAP -> O0000O000OO000.O000000000(190, 110, 255);
         case DRAGON_PLAST -> O0000O000OO000.O000000000(225, 120, 210);
      };
   }

   private static ItemStack O0000000000(ServerHelper.W105 o000000000000O) {
      return switch (o000000000000O) {
         case TRAPKA -> O0000000OOOOO != null ? O0000000OOOOO : (O0000000OOOOO = new ItemStack(Items.NETHERITE_SCRAP));
         case PLAST -> O0000000OOOOO0 != null ? O0000000OOOOO0 : (O0000000OOOOO0 = new ItemStack(Items.DRIED_KELP));
         case DRAGON_TRAP -> O0000000OOOOOO != null ? O0000000OOOOOO : (O0000000OOOOOO = new ItemStack(Items.DRAGON_EGG));
         case DRAGON_PLAST -> O000000O0 != null ? O000000O0 : (O000000O0 = new ItemStack(Items.DRAGON_BREATH));
      };
   }

   record W100(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {

      ServerHelper.W100 lerp(ServerHelper.W100 o000000000, double d) {
         return new ServerHelper.W100(
            MathHelper.lerp(d, this.minX, o000000000.minX),
            MathHelper.lerp(d, this.minY, o000000000.minY),
            MathHelper.lerp(d, this.minZ, o000000000.minZ),
            MathHelper.lerp(d, this.maxX, o000000000.maxX),
            MathHelper.lerp(d, this.maxY, o000000000.maxY),
            MathHelper.lerp(d, this.maxZ, o000000000.maxZ)
         );
      }
   }

   static final class W101 {
      final String O00000000;
      final long O000000000;
      final long O0000000000;
      final ServerHelper.W103[] O00000000000;

      W101(String string, long l, long m, ServerHelper.W103... o000000000000s) {
         this.O00000000 = string;
         this.O000000000 = l;
         this.O0000000000 = m;
         this.O00000000000 = o000000000000s;
      }

      boolean O00000000(ServerHelper.W102 o00000000000) {
         for (ServerHelper.W103 var5 : this.O00000000000) {
            if (var5.O00000000(o00000000000)) {
               return true;
            }
         }

         return false;
      }
   }

   static final class W102 {
      final String O00000000;
      final float O000000000;
      final float O0000000000;
      final double O00000000000;
      final double O000000000000;
      final double O0000000000000;
      final long O000000000000O;
      boolean O00000000000O;

      W102(String string, float f, float g, double d, double e, double h, long l) {
         this.O00000000 = string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = d;
         this.O000000000000 = e;
         this.O0000000000000 = h;
         this.O000000000000O = l;
      }
   }

   static final class W103 {
      final String O00000000;
      final float O000000000;
      final float O0000000000;

      W103(String string, float f, float g) {
         this.O00000000 = string;
         this.O000000000 = f;
         this.O0000000000 = g;
      }

      boolean O00000000(ServerHelper.W102 o00000000000) {
         return o00000000000.O00000000.equals(this.O00000000)
            && ServerHelper.O00000000(o00000000000.O000000000, this.O000000000)
            && ServerHelper.O00000000(o00000000000.O0000000000, this.O0000000000);
      }
   }

   static final class W104 {
      final Vec3d O00000000;
      final long O000000000;
      ServerHelper.W105 O0000000000;
      long O00000000000;
      boolean O000000000000;
      boolean O0000000000000;
      boolean O000000000000O;
      boolean O00000000000O;
      ServerHelper.W101 O00000000000O0;
      Vec3d O00000000000OO;

      W104(Vec3d vec3d, long l, ServerHelper.W105 o000000000000O, long m) {
         this.O00000000 = vec3d;
         this.O000000000 = l;
         this.O0000000000 = o000000000000O;
         this.O00000000000 = m;
      }
   }

   static enum W105 {
      TRAPKA,
      PLAST,
      DRAGON_TRAP,
      DRAGON_PLAST;
   }

   static enum W106 {
      IDLE,
      PREPARE,
      PRE_SWAP_STOP,
      WAIT_MAIN_HAND,
      SWAP,
      USE,
      PRE_RESTORE_STOP,
      RESTORE,
      COOLDOWN;
   }

   static class W99 {
      public final Predicate<ItemStack> O00000000;
      public final boolean O000000000;
      public final boolean O0000000000;
      public final boolean O00000000000;

      public W99(Predicate<ItemStack> predicate, boolean bl) {
         this(predicate, bl, false);
      }

      public W99(Predicate<ItemStack> predicate, boolean bl, boolean bl2) {
         this(predicate, bl, bl2, false);
      }

      public W99(Predicate<ItemStack> predicate, boolean bl, boolean bl2, boolean bl3) {
         this.O00000000 = predicate;
         this.O000000000 = bl;
         this.O0000000000 = bl2;
         this.O00000000000 = bl3;
      }
   }
}
