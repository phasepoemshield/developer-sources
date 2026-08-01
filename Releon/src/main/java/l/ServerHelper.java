package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.StreamSupport;
import net.minecraft.block.BlockState;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.apache.commons.lang3.StringUtils;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class ServerHelper extends Helper242 {
   private static final long PRE_USE_STOP_DELAY_MS = 10L;
   private final Map<BlockPos, BlockState> blockStateMap = new HashMap<>();
   private final List<Helper447> serverEvents = new ArrayList<>();
   private final List<Helper445> structures = new ArrayList<>();
   private final List<Helper444> keyBindings = new ArrayList<>();
   private final Helper346 pointFinder = new Helper346();
   private final Helper339 itemsWatch = new Helper339();
   private final Helper339 shulkerWatch = new Helper339();
   private final Helper339 repairWatch = new Helper339();
   private final Helper159 script = new Helper159();
   private final Helper159 script2 = new Helper159();
   private UUID entityUUID;
   private final Map<Integer, Item> stacks = new HashMap<>();
   private final Setting5 mode = new Setting5("Тип сервера", "Позволяет выбрать тип сервера").method2381("HolyWorld", "FunTime").method2383("FunTime");
   private final Setting3 autoLootSetting = new Setting3("Авто лут", "Кража лута с ботов на ивенте")
      .method2201(true)
      .method2199(() -> this.mode.method2385("HolyWorld"));
   private final Setting3 autoShulkerSetting = new Setting3("Авто шалкер", "Автоматически кладет лут в шалкер")
      .method2201(true)
      .method2199(() -> this.mode.method2385("HolyWorld"));
   private final Setting3 autoRepairSetting = new Setting3("Авто ремонт", "Авто ремонтирует броню пузырем опыта при низкой прочности")
      .method2201(true)
      .method2199(() -> this.mode.method2385("HolyWorld"));
   private final Setting3 consumablesSetting = new Setting3("Таймер расходников", "Отображает время до окончания расходников")
      .method2201(true)
      .method2199(() -> this.mode.method2385("FunTime"));
   private final Setting9 funtimeAhSearchBind = new Setting9("Поиск на аукционе", "Клавиша для /ah search по предмету в руке")
      .method2705(() -> this.mode.method2385("FunTime"));
   private final Setting3 autoPointSetting = new Setting3("Авто поинт", "Отображает информацию об ивенте")
      .method2201(true)
      .method2199(() -> this.mode.method2385("FunTime"));
   private final List<String> potionQueue = new ArrayList<>();
   private final Helper339 potionTimer = new Helper339();
   private final Helper339 ahSearchTimer = new Helper339();
   private final Map<String, Helper446> itemConfig = new HashMap<>();
   private final Map<String, Boolean> itemStates = new HashMap<>();
   private final Map<String, Boolean> lastKeyStates = new HashMap<>();
   private final Map<String, Boolean> keyPressedThisTick = new HashMap<>();
   private int originalSlot = -1;
   private int targetSlot = -1;
   private Helper448 actionState = Helper448.IDLE;
   private long actionTimer = 0L;
   private String pendingItemKey = null;
   private long stopMovementUntil = 0L;
   private boolean keysOverridden = false;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private int originalSourceSlot = -1;
   private Slot pendingInventorySlot = null;
   private int pendingHotbarSlot = -1;
   private boolean ahSearchBindWasPressed = false;

   public static ServerHelper method4710() {
      return Helper222.method1979(ServerHelper.class);
   }

   public ServerHelper() {
      super("Server Helper", "Server Helper", Helper269.MISC);
      this.method4711();
   }

   public void method4711() {
      this.setup(
         new Helper264[]{
            this.mode,
            this.autoLootSetting,
            this.consumablesSetting,
            this.funtimeAhSearchBind,
            this.autoPointSetting,
            this.autoShulkerSetting,
            this.autoRepairSetting
         }
      );
      this.keyBindings
         .add(
            new Helper444(
               Items.FIREWORK_STAR, new Setting9("Анти полет", "Клавиша анти полета").method2705(() -> this.mode.method2385("ReallyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.FLOWER_BANNER_PATTERN, new Setting9("Свиток опыта", "Клавиша свитка опыта").method2705(() -> this.mode.method2385("ReallyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.PRISMARINE_SHARD, new Setting9("Взрывная трапка", "Клавиша взрывной трапки").method2705(() -> this.mode.method2385("HolyWorld")), 5.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.POPPED_CHORUS_FRUIT, new Setting9("Обычная трапка", "Клавиша обычной трапки").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(new Helper444(Items.NETHER_STAR, new Setting9("Стан", "Клавиша стана").method2705(() -> this.mode.method2385("HolyWorld")), 30.0F));
      this.keyBindings
         .add(
            new Helper444(
               Items.FIRE_CHARGE, new Setting9("Взрывная штучка", "Клавиша взрывной штучки").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.itemConfig.put("snow_fun", new Helper446("заморозка", Items.SNOWBALL, "Снежок заморозка"));
      this.itemConfig.put("snow_holy", new Helper446("ком снега", Items.SNOWBALL, "Ком Снега"));
      this.keyBindings
         .add(
            new Helper444(
               Items.PHANTOM_MEMBRANE, new Setting9("Божья аура", "Клавиша божьей ауры").method2705(() -> this.mode.method2385("FunTime")), 0.0F
            )
         );
      this.keyBindings
         .add(new Helper444(Items.NETHERITE_SCRAP, new Setting9("Трапка", "Клавиша трапки").method2705(() -> this.mode.method2385("FunTime")), 0.0F));
      this.keyBindings
         .add(new Helper444(Items.DRIED_KELP, new Setting9("Пласт", "Клавиша пласта").method2705(() -> this.mode.method2385("FunTime")), 0.0F));
      this.keyBindings
         .add(new Helper444(Items.SUGAR, new Setting9("Явная пыль", "Клавиша явной пыли").method2705(() -> this.mode.method2385("FunTime")), 10.0F));
      this.keyBindings
         .add(
            new Helper444(
               Items.FIRE_CHARGE, new Setting9("Огненный смерч", "Клавиша огненного смерча").method2705(() -> this.mode.method2385("FunTime")), 10.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(Items.ENDER_EYE, new Setting9("Дезориентация", "Клавиша дезориентации").method2705(() -> this.mode.method2385("FunTime")), 10.0F)
         );
      this.keyBindings
         .add(
            new Helper444(Items.WIND_CHARGE, new Setting9("Заряд ветра", "Клавиша заряда ветра").method2705(() -> this.mode.method2385("FunTime")), 10.0F)
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.SNOWBALL, new Setting9("Снежок заморозка", "Клавиша снежка заморозка").method2705(() -> this.mode.method2385("FunTime")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.JACK_O_LANTERN, new Setting9("Светильник Джека", "Клавиша светильника Джека").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.EXPERIENCE_BOTTLE, new Setting9("Пузырь опыта", "Клавиша пузыря опыта").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(new Helper444(Items.SNOWBALL, new Setting9("Ком Снега", "Клавиша кома снега").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F));
      this.keyBindings
         .add(
            new Helper444(
               Items.PINK_SHULKER_BOX, new Setting9("Рюкзак 1 уровня", "Клавиша рюкзака 1 уровня").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.BLUE_SHULKER_BOX, new Setting9("Рюкзак 2 уровня", "Клавиша рюкзака 2 уровня").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.RED_SHULKER_BOX, new Setting9("Рюкзак 3 уровня", "Клавиша рюкзака 3 уровня").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.PINK_SHULKER_BOX, new Setting9("Рюкзак 4 уровня", "Клавиша рюкзака 4 уровня").method2705(() -> this.mode.method2385("HolyWorld")), 0.0F
            )
         );
      this.keyBindings
         .add(new Helper444(Items.SPLASH_POTION, new Setting9("Хлопушка", "Клавиша Хлопушки").method2705(() -> this.mode.method2385("FunTime")), 0.0F));
      this.keyBindings
         .add(
            new Helper444(Items.SPLASH_POTION, new Setting9("Святая вода", "Клавиша Святой воды").method2705(() -> this.mode.method2385("FunTime")), 0.0F)
         );
      this.keyBindings
         .add(
            new Helper444(Items.SPLASH_POTION, new Setting9("Зелье Гнева", "Клавиша зелья гнева").method2705(() -> this.mode.method2385("FunTime")), 0.0F)
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.SPLASH_POTION, new Setting9("Зелье Ассасина", "Клавиша зелья ассасина").method2705(() -> this.mode.method2385("FunTime")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.SPLASH_POTION, new Setting9("Зелье Палладина", "Клавиша зелья палладина").method2705(() -> this.mode.method2385("FunTime")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.SPLASH_POTION, new Setting9("Зелье Радиации", "Клавиша зелья радиации").method2705(() -> this.mode.method2385("FunTime")), 0.0F
            )
         );
      this.keyBindings
         .add(
            new Helper444(
               Items.SPLASH_POTION, new Setting9("Зелье снотворное", "Клавиша зелья снотворное").method2705(() -> this.mode.method2385("FunTime")), 0.0F
            )
         );
      this.keyBindings.forEach(var1 -> this.setup(new Helper264[]{var1.setting}));
      this.itemConfig.put("disorientation", new Helper446("дезориентация", Items.ENDER_EYE, "Дезориентация"));
      this.itemConfig.put("sugar", new Helper446("явная", Items.SUGAR, "Явная пыль"));
      this.itemConfig.put("bojaura", new Helper446("божья аура", Items.PHANTOM_MEMBRANE, "Божья аура"));
      this.itemConfig.put("plast", new Helper446("пласт", Items.DRIED_KELP, "Пласт"));
      this.itemConfig.put("trap", new Helper446("трапка", Items.NETHERITE_SCRAP, "Трапка"));
      this.itemConfig.put("windcharge", new Helper446("заряд ветра", Items.WIND_CHARGE, "Заряд ветра"));
      this.itemConfig.put("fireSwirl", new Helper446("огненный смерч", Items.FIRE_CHARGE, "Огненный смерч"));
      this.itemConfig.put("hlopushka", new Helper446("хлопушка", Items.SPLASH_POTION, "Хлопушка"));
      this.itemConfig.put("svetaya", new Helper446("святая", Items.SPLASH_POTION, "Зелье Святой воды"));
      this.itemConfig.put("gneva", new Helper446("гнева", Items.SPLASH_POTION, "Зелье Гнева"));
      this.itemConfig.put("assassin", new Helper446("ассасина", Items.SPLASH_POTION, "Зелье ассасина"));
      this.itemConfig.put("paladina", new Helper446("палладина", Items.SPLASH_POTION, "Зелье палладина"));
      this.itemConfig.put("radiation", new Helper446("радиации", Items.SPLASH_POTION, "Зелье радиации"));
      this.itemConfig.put("snotvornoe", new Helper446("снотворное", Items.SPLASH_POTION, "Снотворное"));
      this.itemConfig.put("killer", new Helper446("киллера", Items.SPLASH_POTION, "Зелье киллера"));
      this.itemConfig.put("antiflight", new Helper446("анти полет", Items.FIREWORK_STAR, "Анти полет"));
      this.itemConfig.put("expscroll", new Helper446("свиток опыта", Items.FLOWER_BANNER_PATTERN, "Свиток опыта"));
      this.itemConfig.put("dtrap", new Helper446("взрывная трапка", Items.PRISMARINE_SHARD, "Взрывная трапка"));
      this.itemConfig.put("trap_holy", new Helper446("трапка", Items.POPPED_CHORUS_FRUIT, "Обычная трапка"));
      this.itemConfig.put("stan", new Helper446("стан", Items.NETHER_STAR, "Стан"));
      this.itemConfig.put("ditem", new Helper446("взрывная штучка", Items.FIRE_CHARGE, "Взрывная штучка"));
      this.itemConfig.put("tikva", new Helper446("светильник джейка", Items.JACK_O_LANTERN, "Светильник Джека"));
      this.itemConfig.put("exp", new Helper446("пузырь опыта", Items.EXPERIENCE_BOTTLE, "Пузырь опыта"));
      this.itemConfig.put("shulker1", new Helper446("рюкзак (i уровень)", Items.PINK_SHULKER_BOX, "Рюкзак 1 уровня"));
      this.itemConfig.put("shulker2", new Helper446("рюкзак (ii уровень)", Items.BLUE_SHULKER_BOX, "Рюкзак 2 уровня"));
      this.itemConfig.put("shulker3", new Helper446("рюкзак (iii уровень)", Items.RED_SHULKER_BOX, "Рюкзак 3 уровня"));
      this.itemConfig.put("shulker4", new Helper446("рюкзак (iv уровень)", Items.PINK_SHULKER_BOX, "Рюкзак 4 уровня"));
      this.itemConfig.keySet().forEach(var1 -> {
         this.itemStates.put(var1, false);
         this.lastKeyStates.put(var1, false);
         this.keyPressedThisTick.put(var1, false);
      });
   }

   @Override
   public void activate() {
      this.script2.method1314();
      this.stacks.clear();
      this.potionQueue.clear();
      this.potionTimer.method3358();
      this.itemStates.replaceAll((var0, var1) -> false);
      this.lastKeyStates.replaceAll((var0, var1) -> false);
      this.keyPressedThisTick.replaceAll((var0, var1) -> false);
      this.actionState = Helper448.IDLE;
      this.originalSlot = -1;
      this.targetSlot = -1;
      this.originalSourceSlot = -1;
      this.pendingInventorySlot = null;
      this.pendingHotbarSlot = -1;
      this.pendingItemKey = null;
      this.stopMovementUntil = 0L;
      this.keysOverridden = false;
      this.ahSearchBindWasPressed = false;
      this.ahSearchTimer.method3358();
   }

   @Override
   public void deactivate() {
      this.itemStates.replaceAll((var0, var1) -> false);
      this.lastKeyStates.replaceAll((var0, var1) -> false);
      this.keyPressedThisTick.replaceAll((var0, var1) -> false);
      this.potionQueue.clear();
      this.potionTimer.method3358();
      this.actionState = Helper448.IDLE;
      this.originalSlot = -1;
      this.targetSlot = -1;
      this.originalSourceSlot = -1;
      this.pendingInventorySlot = null;
      this.pendingHotbarSlot = -1;
      this.pendingItemKey = null;
      this.stopMovementUntil = 0L;
      this.ahSearchBindWasPressed = false;
      this.ahSearchTimer.method3358();
      if (this.keysOverridden) {
         mc.options.forwardKey.setPressed(false);
         mc.options.backKey.setPressed(false);
         mc.options.leftKey.setPressed(false);
         mc.options.rightKey.setPressed(false);
         mc.options.jumpKey.setPressed(false);
      }

      this.keysOverridden = false;
   }

   @Helper104
   public void onInput(Helper379 var1) {
      if (mc.player != null && mc.currentScreen == null) {
         boolean var2 = System.currentTimeMillis() < this.stopMovementUntil || this.actionState != Helper448.IDLE;
         if (var2) {
            var1.method3761(false, false, false, false);
            var1.method3760(false);
            var1.method3765(false);
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (!Helper38.method549()) {
         Packet packet = Objects.requireNonNull(var1.method3895());

         if (packet instanceof ItemPickupAnimationS2CPacket pickup) {
            if (this.autoShulkerSetting.method2200()
               && this.autoShulkerSetting.method2701()
               && pickup.getCollectorEntityId() == mc.player.getId()
               && mc.world.getEntityById(pickup.getEntityId()) instanceof ItemEntity itemEntity) {
               ItemStack stack = itemEntity.getStack();
               if (stack.get(DataComponentTypes.CONTAINER) == null) {
                  this.stacks.put(-Helper147.method1227(1, 999999999), stack.getItem());
                  this.shulkerWatch.method3358();
               }
            }
         } else if (packet instanceof ScreenHandlerSlotUpdateS2CPacket slotUpdate) {
            if (slotUpdate.getSyncId() == 0) {
               Item item = slotUpdate.getStack().getItem();
               this.stacks.entrySet().stream().filter(e -> e.getKey() < 0 && e.getValue().equals(item)).findFirst().ifPresent(e -> {
                  this.stacks.put(slotUpdate.getSlot() + 18, item);
                  this.stacks.remove(e.getKey());
               });
            }
         } else if (packet instanceof ChunkDeltaUpdateS2CPacket chunkDelta) {
            if (this.consumablesSetting.method2200() && this.consumablesSetting.method2701()) {
               chunkDelta.visitUpdates((pos, state) -> this.blockStateMap.put(pos.add(0, 0, 0), state));
               this.script.method1307(0, () -> chunkDelta.visitUpdates((pos, state) -> {
                  Vec3d center = pos.add(0, 0, 0).toCenterPos();
                  if (this.blockStateMap.size() > 50 && this.blockStateMap.size() < 600) {
                     if (this.method4734(pos.up(2))) {
                        this.method4731(Items.NETHERITE_SCRAP, center, System.currentTimeMillis() + 15000L);
                     } else if (this.method4735(pos.up(3))) {
                        this.method4731(Items.NETHERITE_SCRAP, center, System.currentTimeMillis() + 30000L);
                     }
                  }
               }));
            }
         } else if (packet instanceof GameMessageS2CPacket message) {
            this.handleGameMessage(message);
         } else if (packet instanceof OpenScreenS2CPacket openScreen) {
            if (openScreen.getName().getString().contains("Рюкзак") && !this.stacks.isEmpty()) {
               this.script.method1314().method1307(0, this.script2::method1315);
            }
         }
      }
   }

   private void handleGameMessage(GameMessageS2CPacket message) {
      if (this.autoPointSetting.method2200() && this.autoPointSetting.method2701()) {
         Text content = message.content();
         String raw = content.toString();
         String plain = content.getString();
         String eventName = StringUtils.substringBetween(plain, "||| [", "] ");
         if (eventName != null) {
            String gps = StringUtils.substringBetween(raw, "value='/gps ", "'");
            String lootLevel = StringUtils.substringBetween(plain, "Уровень лута: ", "\n ║");
            String summonedBy = StringUtils.substringBetween(plain, "Призван игроком: ", "\n ║");
            if (gps != null) {
               String[] coords = gps.split(" ");
               Vec3d pos = BlockPos.ofFloored(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]), Integer.parseInt(coords[2])).toCenterPos();
               switch (eventName) {
                  case "Мистический сундук":
                     this.method4730(eventName, lootLevel, summonedBy, pos, "overworld", 300, 0);
                     return;
                  case "Вулкан":
                     this.method4730(eventName, lootLevel, summonedBy, pos, "overworld", 300, 120);
                     return;
                  case "Метеоритный дождь":
                  case "Маяк убийца":
                  case "Мистический Алтарь":
                     this.method4730(eventName, lootLevel, summonedBy, pos, "overworld", 360, 0);
                     return;
                  case "Загадочный маяк":
                     this.method4730(eventName, lootLevel, summonedBy, pos, "overworld", 60, 180);
               }
            } else {
               switch (eventName) {
                  case "Сундук смерти":
                     this.method4730(eventName, lootLevel, summonedBy, BlockPos.ofFloored(-155.0, 64.0, 205.0).toCenterPos(), "lobby", 300, 0);
                     return;
                  case "Адская резня":
                     this.method4730(eventName, lootLevel, summonedBy, BlockPos.ofFloored(48.0, 87.0, 73.0).toCenterPos(), "lobby", 180, 120);
               }
            }
            return;
         }
      }

      // second GameMessage handler: experience-bottle cooldown
      String text = message.content().getString();
      if (text.contains("▶ Повторно активировать Пузырь опыта возможно через")) {
         String seconds = StringUtils.substringBetween(text, "через ", " секунд");
         if (seconds != null && !seconds.isEmpty()) {
            int ticks = Integer.parseInt(seconds) * 20;
            ItemCooldownManager cooldown = mc.player.getItemCooldownManager();
            cooldown.set(Items.EXPERIENCE_BOTTLE.getDefaultStack(), ticks);
            CoolDowns.method304()
               .method309(
                  new Helper386(
                     new CooldownUpdateS2CPacket(cooldown.getGroup(Items.EXPERIENCE_BOTTLE.getDefaultStack()), ticks), Helper385.RECEIVE
                  )
               );
         }
      }
   }

   @Helper104
   public void method4712(Event4 var1) {
      if (var1.method3646() instanceof GenericContainerScreen var2 && var2.getTitle().getString().contains("Рюкзак") && !this.script2.method1317()) {
         var1.method3647(null);
      }
   }

   @Helper104
   public void onRotationUpdate(Event28 var1) {
      if (var1.method4225() == 0 && mc.currentScreen == null) {
         this.method4728();
         boolean var2 = System.currentTimeMillis() < this.stopMovementUntil || this.actionState != Helper448.IDLE;
         if (var2) {
            mc.options.forwardKey.setPressed(false);
            mc.options.backKey.setPressed(false);
            mc.options.leftKey.setPressed(false);
            mc.options.rightKey.setPressed(false);
            mc.options.jumpKey.setPressed(false);
            if (mc.player.input != null) {
               mc.player.input.movementForward = 0.0F;
               mc.player.input.movementSideways = 0.0F;
            }

            if (mc.player.isSprinting()) {
               mc.player.setSprinting(false);
            }
         }

         for (Helper444 var4 : this.keyBindings) {
            String var6 = var4.setting.getName();

            String var5 = switch (var6) {
               case "Анти полет" -> "antiflight";
               case "Свиток опыта" -> "expscroll";
               case "Взрывная трапка" -> "dtrap";
               case "Обычная трапка" -> this.mode.method2385("HolyWorld") ? "trap_holy" : null;
               case "Трапка" -> this.mode.method2385("FunTime") ? "trap" : null;
               case "Стан" -> "stan";
               case "Взрывная штучка" -> "ditem";
               case "Снежок заморозка" -> this.mode.method2385("FunTime") ? "snow_fun" : null;
               case "Ком Снега" -> this.mode.method2385("HolyWorld") ? "snow_holy" : null;
               case "Божья аура" -> "bojaura";
               case "Пласт" -> "plast";
               case "Явная пыль" -> "sugar";
               case "Огненный смерч" -> "fireSwirl";
               case "Дезориентация" -> "disorientation";
               case "Заряд ветра" -> "windcharge";
               case "Светильник Джека" -> "tikva";
               case "Пузырь опыта" -> "exp";
               case "Рюкзак 1 уровня" -> "shulker1";
               case "Рюкзак 2 уровня" -> "shulker2";
               case "Рюкзак 3 уровня" -> "shulker3";
               case "Рюкзак 4 уровня" -> "shulker4";
               case "Хлопушка" -> "hlopushka";
               case "Святая вода" -> "svetaya";
               case "Зелье Гнева" -> "gneva";
               case "Зелье Ассасина" -> "assassin";
               case "Зелье Палладина" -> "paladina";
               case "Зелье Радиации" -> "radiation";
               case "Зелье снотворное" -> "snotvornoe";
               case "Зелье киллера" -> "killer";
               default -> null;
            };
            if (var5 != null && var4.setting.method2701()) {
               boolean var15 = false;
               if (var4.setting.getKey() != -1) {
                  if (var4.setting.getKey() >= 0 && var4.setting.getKey() <= 7) {
                     var15 = GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), var4.setting.getKey()) == 1;
                  } else {
                     var15 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), var4.setting.getKey());
                  }
               }

               boolean var17 = this.lastKeyStates.getOrDefault(var5, false);
               if (var15 && !var17) {
                  Helper446 var8 = this.itemConfig.get(var5);
                  if (var8 != null) {
                     Slot var9 = Helper66.method707(
                        var1x -> var1x.getStack().getItem().equals(var8.item)
                           && Helper66.method722(var1x.getStack().getName()).contains(var8.searchName.toLowerCase())
                     );
                     boolean var10 = this.method4729(var8.displayName);
                     if (var9 != null) {
                        ItemStack var11 = var9.getStack();
                        if (mc.player.getItemCooldownManager().isCoolingDown(var11)) {
                           CoolDowns.method304()
                              .list
                              .stream()
                              .filter(var1x -> var1x.method301().equals(var8.item))
                              .findFirst()
                              .ifPresent(
                                 var2x -> {
                                    int var3 = Math.toIntExact(-var2x.method302().method3359() / 1000L);
                                    String var4x = Helper209.method1794(var3);
                                    MutableText var5x = Text.empty()
                                       .append(Helper121.method1009(var8.displayName, Helper121.method1008(var8.displayName), var10))
                                       .append("  будет  доступен  через ")
                                       .append(Text.literal(var4x).formatted(Formatting.GRAY));
                                    Notifications.method1666().method1671(var5x, 4000L, Helper56.SOFT_NOTIFICATION);
                                 }
                              );
                        } else if (!this.potionQueue.contains(var5)) {
                           this.potionQueue.add(var5);
                        }
                     } else {
                        MutableText var20 = Text.empty()
                           .append(Helper121.method1009(var8.displayName, Helper121.method1008(var8.displayName), var10))
                           .append("  не  найдено");
                        Notifications.method1666().method1671(var20, 4000L, Helper56.SOFT_NOTIFICATION);
                     }
                  }
               }

               this.lastKeyStates.put(var5, var15);
               this.keyPressedThisTick.put(var5, var15);
            }
         }

         if (this.actionState != Helper448.IDLE) {
            this.method4714();
         }

         if (this.actionState == Helper448.IDLE && !this.potionQueue.isEmpty() && this.potionTimer.method3356(150.0)) {
            String var12 = this.potionQueue.remove(0);
            Helper446 var13 = this.itemConfig.get(var12);
            if (var13 != null) {
               Slot var14 = Helper66.method707(
                  var1x -> var1x.getStack().getItem().equals(var13.item)
                     && Helper66.method722(var1x.getStack().getName()).contains(var13.searchName.toLowerCase())
               );
               boolean var16 = this.method4729(var13.displayName);
               if (var14 != null) {
                  ItemStack var18 = var14.getStack();
                  if (!mc.player.getItemCooldownManager().isCoolingDown(var18)) {
                     this.method4713(var14, var13, var16);
                  } else {
                     CoolDowns.method304()
                        .list
                        .stream()
                        .filter(var1x -> var1x.method301().equals(var13.item))
                        .findFirst()
                        .ifPresent(
                           var2x -> {
                              int var3 = Math.toIntExact(-var2x.method302().method3359() / 1000L);
                              String var4x = Helper209.method1794(var3);
                              MutableText var5x = Text.empty()
                                 .append(Helper121.method1009(var13.displayName, Helper121.method1008(var13.displayName), var16))
                                 .append("  будет  доступен  через ")
                                 .append(Text.literal(var4x).formatted(Formatting.GRAY));
                              Notifications.method1666().method1671(var5x, 4000L, Helper56.SOFT_NOTIFICATION);
                           }
                        );
                  }
               } else {
                  MutableText var19 = Text.empty()
                     .append(Helper121.method1009(var13.displayName, Helper121.method1008(var13.displayName), var16))
                     .append("  не  найдено");
                  Notifications.method1666().method1671(var19, 4000L, Helper56.SOFT_NOTIFICATION);
               }

               this.potionTimer.method3358();
            }
         }

         if (this.autoRepairSetting.method2200()
            && this.autoRepairSetting.method2701()
            && StreamSupport.stream(mc.player.getArmorItems().spliterator(), false).anyMatch(var0 -> {
               if ((double)var0.getDamage() / var0.getMaxDamage() < 0.94) {
                  return false;
               } else {
                  RegistryEntry var1x = mc.world
                     .getRegistryManager()
                     .getOrThrow(RegistryKeys.ENCHANTMENT)
                     .getEntry(Enchantments.MENDING.getValue())
                     .orElse(null);
                  return var1x != null && EnchantmentHelper.getLevel(var1x, var0) > 0;
               }
            })) {
            Helper66.method720()
               .filter(
                  var1x -> {
                     ItemStack var2x = var1x.getStack();
                     NbtComponent var3 = var2x.get(DataComponentTypes.CUSTOM_DATA);
                     return !mc.player.getItemCooldownManager().isCoolingDown(var2x)
                        && var2x.getItem().equals(Items.EXPERIENCE_BOTTLE)
                        && var3 != null
                        && var3.toString().contains("\"text\":\" - при нажатие ПКМ, полностью ремонтирует\"")
                        && this.repairWatch.method3357(5000.0);
                  }
               )
               .findFirst()
               .ifPresent(var0 -> Helper59.method657(() -> Helper66.method699(var0, Helper349.method3473())));
         }

         if (!Helper66.method719() && !this.stacks.isEmpty() && this.script2.method1317() && this.shulkerWatch.method3356(300.0)) {
            Helper66.method720()
               .filter(var0 -> var0.getStack().get(DataComponentTypes.CONTAINER) != null)
               .max(
                  Comparator.comparingDouble(
                     var0 -> var0.getStack().getOrDefault(DataComponentTypes.CONTAINER, null).stacks.stream().filter(var0x -> !var0x.isEmpty()).toList().size()
                  )
               )
               .ifPresent(
                  var1x -> {
                     Helper66.method690(var1x, Hand.MAIN_HAND, false);
                     Helper66.method701(false);
                     Helper38.method521(Hand.MAIN_HAND);
                     this.script2
                        .method1314()
                        .method1307(
                           0,
                           () -> {
                              ArrayList var2x = new ArrayList();
                              Helper66.method720()
                                 .forEach(
                                    var2xx -> this.stacks
                                       .entrySet()
                                       .stream()
                                       .filter(
                                          var1xxxx -> var2xx.inventory.equals(mc.player.getInventory())
                                             && var1xxxx.getValue().equals(var2xx.getStack().getItem())
                                             && var1xxxx.getKey() == var2xx.id
                                       )
                                       .forEach(var2xxx -> {
                                          Helper66.method702(var2xx, 0, SlotActionType.QUICK_MOVE, false);
                                          var2x.add(var2xx.id);
                                       })
                                 );
                              var2x.forEach(this.stacks::remove);
                              Helper66.method701(false);
                              Helper66.method690(var1x, Hand.MAIN_HAND, false);
                              Helper66.method701(false);
                              this.shulkerWatch.method3358();
                           }
                        );
                  }
               );
         }

         if (this.autoLootSetting.method2200() && this.autoLootSetting.method2701()) {
            Helper38.method536()
               .filter(MerchantEntity.class::isInstance)
               .map(MerchantEntity.class::cast)
               .filter(var0 -> var0.hasStackEquipped(EquipmentSlot.MAINHAND) || var0.hasStackEquipped(EquipmentSlot.OFFHAND))
               .findFirst()
               .ifPresent(
                  var1x -> {
                     Vec3d var2x = this.pointFinder.method3385(var1x, 6.0F, Helper351.INSTANCE.method3483(), new Linear().method3149(), true).getLeft();
                     Helper336 var3 = Helper349.method3471(var2x);
                     this.itemsWatch.method3358();
                     this.entityUUID = var1x.getUuid();
                     if (mc.player.getEyePos().distanceTo(var1x.getBoundingBox().getCenter()) <= 6.0) {
                        mc.player
                           .networkHandler
                           .sendPacket(PlayerInteractEntityC2SPacket.interactAt(var1x, false, Hand.MAIN_HAND, var1x.getBoundingBox().getCenter()));
                        mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interact(var1x, false, Hand.MAIN_HAND));
                        Helper351.INSTANCE.method3502(var3, Helper334.DEFAULT, Helper153.HIGH_IMPORTANCE_3, this);
                     }
                  }
               );
         }

         this.script.method1313().method1315();
         this.blockStateMap.clear();
         this.structures.removeIf(var0 -> var0.time - System.currentTimeMillis() <= 0.0);
         this.serverEvents.removeIf(var0 -> var0.timeEnd + 90000.0 - System.currentTimeMillis() <= 0.0);
      }
   }

   private void method4713(Slot var1, Helper446 var2, boolean var3) {
      this.originalSlot = mc.player.getInventory().selectedSlot;
      this.originalSourceSlot = var1.id;
      this.targetSlot = var1.id;
      this.pendingItemKey = var2.searchName;
      this.wasForwardPressed = mc.options.forwardKey.isPressed();
      this.wasBackPressed = mc.options.backKey.isPressed();
      this.wasLeftPressed = mc.options.leftKey.isPressed();
      this.wasRightPressed = mc.options.rightKey.isPressed();
      this.wasJumpPressed = mc.options.jumpKey.isPressed();
      this.keysOverridden = true;
      mc.options.forwardKey.setPressed(false);
      mc.options.backKey.setPressed(false);
      mc.options.leftKey.setPressed(false);
      mc.options.rightKey.setPressed(false);
      mc.options.jumpKey.setPressed(false);
      if (mc.player.input != null) {
         mc.player.input.movementForward = 0.0F;
         mc.player.input.movementSideways = 0.0F;
      }

      if (mc.player.isSprinting()) {
         mc.player.setSprinting(false);
      }

      MutableText var4 = Text.empty().append(Helper121.method1009(var2.displayName, Helper121.method1008(var2.displayName), var3)).append("  использована");
      Notifications.method1666().method1669(var4, 4000L);
      this.actionState = Helper448.WAIT_BEFORE_USE;
      this.actionTimer = System.currentTimeMillis();
      this.stopMovementUntil = this.actionTimer + 10L;
   }

   private void method4714() {
      long var1 = System.currentTimeMillis() - this.actionTimer;
      if (var1 >= 10L) {
         switch (this.actionState) {
            case WAIT_BEFORE_USE:
               boolean var3 = this.originalSourceSlot >= 0 && this.originalSourceSlot < 9 || this.originalSourceSlot >= 36 && this.originalSourceSlot < 45;
               if (var3) {
                  this.pendingHotbarSlot = this.originalSourceSlot >= 36 ? this.originalSourceSlot - 36 : this.originalSourceSlot;
                  this.method4716(this.pendingHotbarSlot);
               } else {
                  this.pendingInventorySlot = mc.player.currentScreenHandler.getSlot(this.originalSourceSlot);
                  this.method4718(this.pendingInventorySlot);
               }

               this.actionState = Helper448.WAIT_BEFORE_RESTORE;
               this.actionTimer = System.currentTimeMillis();
               this.stopMovementUntil = this.actionTimer + 10L;
               break;
            case WAIT_BEFORE_RESTORE:
               if (this.pendingInventorySlot != null) {
                  this.method4719(this.pendingInventorySlot);
               } else if (this.pendingHotbarSlot != -1) {
                  this.method4717(this.pendingHotbarSlot);
               }

               this.method4715();
               this.actionState = Helper448.IDLE;
               this.actionTimer = 0L;
               this.stopMovementUntil = 0L;
               this.targetSlot = -1;
               this.originalSourceSlot = -1;
               this.pendingItemKey = null;
               this.pendingInventorySlot = null;
               this.pendingHotbarSlot = -1;
         }
      }
   }

   private void method4715() {
      if (this.keysOverridden) {
         mc.options.forwardKey.setPressed(this.wasForwardPressed);
         mc.options.backKey.setPressed(this.wasBackPressed);
         mc.options.leftKey.setPressed(this.wasLeftPressed);
         mc.options.rightKey.setPressed(this.wasRightPressed);
         mc.options.jumpKey.setPressed(this.wasJumpPressed);
         if (mc.player.input != null) {
            if (this.wasForwardPressed) {
               mc.player.input.movementForward = 1.0F;
            }

            if (this.wasBackPressed) {
               mc.player.input.movementForward = -1.0F;
            }

            if (this.wasLeftPressed) {
               mc.player.input.movementSideways = 1.0F;
            }

            if (this.wasRightPressed) {
               mc.player.input.movementSideways = -1.0F;
            }
         }

         this.keysOverridden = false;
      }
   }

   private void method4716(int var1) {
      Helper66.method696(var1);
      if (mc.interactionManager != null) {
         mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
      }

      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private void method4717(int var1) {
      if (var1 != this.originalSlot) {
         Helper66.method696(this.originalSlot);
      }
   }

   private void method4718(Slot var1) {
      Helper66.method692(var1, this.originalSlot, false);
      if (mc.interactionManager != null) {
         mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
      }

      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private void method4719(Slot var1) {
      Helper66.method692(var1, this.originalSlot, true);
      Helper66.method696(this.originalSlot);
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      MatrixStack var2 = var1.method3708();
      this.keyBindings.stream().filter(var0 -> Helper38.method543(var0.setting) && Helper66.method705(var0.item) != null).forEach(var2x -> {
         BlockPos var3 = mc.player.getBlockPos();
         Vec3d var4 = Helper147.method1247(mc.player).subtract(Vec3d.of(var3));
         int[] var5 = Helper121.method1008(var2x.setting.getName());
         int var6 = var5.length > 1 ? Helper133.method1122(10, 0, var5) : var5[0];
         String var7 = var2x.setting.getName();
         switch (var7) {
            case "Трапка":
            case "Обычная трапка":
               this.method4720(var3, var4, 1.99F, var6);
               break;
            case "Дезориентация":
            case "Огненный смерч":
            case "Явная пыль":
               this.method4721(var2, var2x.distance, var6);
               break;
            case "Взрывная штучка":
               this.method4721(var2, 5.0F, var6);
               break;
            case "Пласт":
               float var9 = MathHelper.wrapDegrees(mc.player.getYaw());
               if (Math.abs(mc.player.getPitch()) > 60.0F) {
                  BlockPos var10 = var3.up().offset(mc.player.getFacing(), 3);
                  Vec3d var11 = Vec3d.of(var10.east(3).south(3).down()).add(var4);
                  Vec3d var12 = Vec3d.of(var10.west(2).north(2).up()).add(var4);
                  Helper183.method1546(new Box(var11, var12), var6, 3.0F, true, true, true);
               } else if (var9 <= -157.5F || var9 >= 157.5F) {
                  BlockPos var16 = var3.north(3).up();
                  Vec3d var20 = Vec3d.of(var16.down(2).east(3)).add(var4);
                  Vec3d var24 = Vec3d.of(var16.up(3).west(2).south(2)).add(var4);
                  Helper183.method1546(new Box(var20, var24), var6, 3.0F, true, true, true);
               } else if (var9 <= -112.5F) {
                  this.method4723(var3.east(5).south().down(), var4, var6, -1, true);
               } else if (var9 <= -67.5F) {
                  BlockPos var13 = var3.east(2).up();
                  Vec3d var17 = Vec3d.of(var13.down(2).south(3)).add(var4);
                  Vec3d var21 = Vec3d.of(var13.up(3).north(2).east(2)).add(var4);
                  Helper183.method1546(new Box(var17, var21), var6, 3.0F, true, true, true);
               } else if (var9 <= -22.5F) {
                  this.method4723(var3.east(5).down(), var4, var6, 1, false);
               } else if (var9 >= -22.5 && var9 <= 22.5) {
                  BlockPos var15 = var3.south(2).up();
                  Vec3d var19 = Vec3d.of(var15.down(2).east(3)).add(var4);
                  Vec3d var23 = Vec3d.of(var15.up(3).west(2).south(2)).add(var4);
                  Helper183.method1546(new Box(var19, var23), var6, 3.0F, true, true, true);
               } else if (var9 <= 67.5F) {
                  this.method4723(var3.west(4).down(), var4, var6, 1, true);
               } else if (var9 <= 112.5F) {
                  BlockPos var14 = var3.west(3).up();
                  Vec3d var18 = Vec3d.of(var14.down(2).south(3)).add(var4);
                  Vec3d var22 = Vec3d.of(var14.up(3).north(2).east(2)).add(var4);
                  Helper183.method1546(new Box(var18, var22), var6, 3.0F, true, true, true);
               } else if (var9 <= 157.5F) {
                  this.method4723(var3.west(4).south().down(), var4, var6, -1, false);
               }
               break;
            case "Взрывная трапка":
               this.method4720(var3, var4, 3.99F, var6);
               break;
            case "Стан":
               this.method4720(var3, var4, 15.01F, var6);
               break;
            case "Ком Снега":
            case "Снежок заморозка":
               if (this.mode.method2385("HolyWorld") && var2x.setting.getName().equals("Ком Снега")) {
                  Predictions.method2289().method2290(var2, List.of(Items.SNOWBALL.getDefaultStack()), Helper349.method3473());
               } else if (this.mode.method2385("FunTime") && var2x.setting.getName().equals("Снежок заморозка")) {
                  Predictions.method2289().method2290(var2, List.of(Items.SNOWBALL.getDefaultStack()), Helper349.method3473());
               }
               break;
            case "Заряд ветра":
               Predictions.method2289().method2290(var2, List.of(Items.WIND_CHARGE.getDefaultStack()), Helper349.method3473());
         }
      });
   }

   @Helper104
   public void onDraw(Event20 var1) {
      DrawContext var2 = var1.method4058();
      MatrixStack var3 = var2.getMatrices();
      this.structures
         .forEach(
            var2x -> {
               double var3x = (var2x.time - System.currentTimeMillis()) / 1000.0;
               Vec3d var5 = Helper148.method1251(var2x.vec);
               String var6 = Helper147.method1235(var3x, 0.1F) + "с";
               Helper175 var7 = Helper103.method926(14);
               float var8 = var7.method1479(var6);
               float var9 = (float)(var5.x - var8 / 2.0F);
               float var10 = (float)var5.y;
               float var11 = 2.0F;
               if (Helper148.method1255(var2x.vec) && var2x.anarchy == Helper128.method1059() && Helper128.method1050().equals(var2x.world)) {
                  blur.method677(
                     Helper80.method841(var3, var9 - var11, var10 - var11, var8 + var11 * 2.0F, 10.0)
                        .method826(1.5F)
                        .method823(Helper133.HALF_BLACK)
                        .method840()
                  );
                  var7.method1474(var3, var6, var9, var10 + 1.0F, Helper133.method1160());
                  Helper178.method1502(var2, var2x.item.getDefaultStack(), var9 - 14.0F, var10 - 2.5F, true, false, 0.5F);
               }
            }
         );
      this.serverEvents
         .forEach(
            var2x -> {
               Vec3d var3x = Helper148.method1251(var2x.vec);
               double var4 = (var2x.timeOpen - System.currentTimeMillis()) / 1000.0;
               double var6 = (var2x.timeEnd - System.currentTimeMillis()) / 1000.0;
               String var8 = " [" + Helper147.method1235(mc.getEntityRenderDispatcher().camera.getPos().distanceTo(var2x.vec), 0.1) + "m]";
               String var9 = var4 > 0.0
                  ? ("До начала: " + Helper147.method1235(var4, var4 < 30.0 ? 0.1F : 1.0) + "с").replace(".0", "")
                  : (var6 > 0.0 ? ("До конца: " + Helper147.method1235(var6, var6 < 30.0 ? 0.1F : 1.0) + "с").replace(".0", "") : "Конец ивента!");
               if (Helper148.method1255(var2x.vec) && var2x.anarchy == Helper128.method1059() && Helper128.method1050().equals(var2x.world)) {
                  ArrayList var10 = new ArrayList<>(Collections.singletonList(var2x.name + var8));
                  if (var2x.owner != null) {
                     var10.add("Призван: " + Formatting.GOLD + var2x.owner);
                  }

                  var10.add(var9);
                  if (var2x.lvl != null) {
                     var10.add(var2x.lvl);
                  }

                  this.method4722(var3, Helper103.method926(14), var10, var3x);
               }
            }
         );
      Helper38.method536()
         .filter(var1x -> var1x.getUuid().equals(this.entityUUID))
         .forEach(
            var2x -> {
               Vec3d var3x = var2x.getBlockPos().down().toCenterPos();
               Vec3d var4 = Helper148.method1251(var3x);
               Object var5 = !this.itemsWatch.method3356(200.0)
                  ? "Можно забрать"
                  : (!this.itemsWatch.method3356(20000.0) ? Helper147.method1235(20.0F - (float)this.itemsWatch.method3359() / 1000.0F, 0.1F) + "с" : "Скоро");
               Helper175 var6 = Helper103.method926(14);
               float var7 = 4.0F;
               float var8 = var6.method1479((String)var5);
               float var9 = 3.0F;
               double var10 = var4.getX() - var8 / 2.0F;
               double var12 = var4.getY() - var7 / 2.0F;
               Formatting var14 = mc.player.getEyePos().distanceTo(var2x.getEyePos()) < 5.0 ? Formatting.GREEN : Formatting.RED;
               if (Helper148.method1255(var3x)) {
                  blur.method677(
                     Helper80.method841(var3, var10 - var9, var12 - var9, var8 + var9 * 2.0F, var7 + var9 * 2.0F)
                        .method826(2.0F)
                        .method823(Helper133.HALF_BLACK)
                        .method840()
                  );
                  var6.method1474(var3, var14.toString() + var5, var10, var12, Helper133.method1160());
               }
            }
         );
   }

   private void method4720(BlockPos var1, Vec3d var2, float var3, int var4) {
      Box var5 = new Box(var1.up()).offset(var2).expand(var3);
      boolean var6 = mc.world
         .getPlayers()
         .stream()
         .map(var0 -> Helper168.method1386(var0, 2))
         .anyMatch(var1x -> var1x.player != mc.player && var5.intersects(var1x.boundingBox) && !Helper309.method3075(var1x.player));
      Helper183.method1546(var5, var6 ? Helper133.method1164() : var4, 3.0F, true, true, true);
   }

   private void method4721(MatrixStack var1, float var2, int var3) {
      float var4 = mc.player.getWidth() / 2.0F;
      int var5 = this.method4733(var2) ? Helper133.method1164() : var3;
      Vec3d var6 = Helper147.method1247(mc.player).add(var4, 0.02, var4);
      GL11.glEnable(2881);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder var7 = Tessellator.getInstance().begin(DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
      int var8 = 0;

      for (byte var9 = 90; var8 <= var9; var8++) {
         Vec3d var10 = Helper147.method1242(var8, var9, var2);
         Vec3d var11 = Helper147.method1242(var8 + 1, var9, var2);
         Helper183.method1548(
            var1, var7, var6.add(var10), var6.add(var10.x, var10.y + 2.0, var10.z), Helper133.method1108(var5, 0.2F), Helper133.method1108(var5, 0.0F)
         );
         Helper183.method1563(var6.add(var10), var6.add(var11), var5, 2.0F, true);
      }

      var8 = 0;

      for (byte var13 = 90; var8 <= var13; var8++) {
         Vec3d var14 = Helper147.method1242(var8, var13, var2);
         Helper183.method1548(
            var1, var7, var6.add(var14), var6.add(var14.x, var14.y - 2.0, var14.z), Helper133.method1108(var5, 0.2F), Helper133.method1108(var5, 0.0F)
         );
      }

      BufferRenderer.drawWithGlobalProgram(var7.end());
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2881);
   }

   private void method4722(MatrixStack var1, Helper175 var2, List<String> var3, Vec3d var4) {
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var3.size(); var6++) {
         String var7 = (String)var3.get(var6);
         float var8 = var2.method1479(var7);
         float var9 = (float)(var4.x - var8 / 2.0F);
         blur.method677(
            Helper80.method841(var1, var9 - 2.0F, var4.y - 2.0 + var5, var8 + 4.0F, 10.0)
               .method834(3.0F)
               .method827(this.method4732(var2, var3, var6, var8))
               .method823(Helper133.HALF_BLACK)
               .method840()
         );
         var2.method1474(var1, var7, var9, var4.y + 1.0 + var5, Helper133.method1160());
         var5 += 10.0F;
      }
   }

   private void method4723(BlockPos var1, Vec3d var2, int var3, int var4, boolean var5) {
      Vec3d var6 = Vec3d.of(var1).add(var2);
      float var7 = 2.0F;
      int var8 = Helper133.method1108(var3, 0.15F);
      this.method4724(var6, var3, var7, var4, var5);
      this.method4724(var6, var3, var7, var4, var5);
      this.method4725(var6, var3, var7, var4, var5);
      this.method4726(var6, var8, var4, var5);
      this.method4726(var6, var8, var4, var5);
      this.method4727(var6, var8, var4, var5);
   }

   private void method4724(Vec3d var1, int var2, float var3, int var4, boolean var5) {
      float var6 = var5 ? var4 : -var4;
      Vec3d var8;
      Helper183.method1563(var1, var8 = var1.add(var6, 0.0, 0.0), var2, var3, true);

      for (int var7 = 0; var7 < 4; var7++) {
         Helper183.method1563(var8, var1 = var8.add(0.0, 0.0, var4), var2, var3, true);
         Helper183.method1563(var1, var8 = var1.add(var6, 0.0, 0.0), var2, var3, true);
      }

      Helper183.method1563(var8, var1 = var8.add(0.0, 0.0, var4), var2, var3, true);
      Vec3d var11;
      Helper183.method1563(var1, var11 = var1.add(var6 * -2.0F, 0.0, 0.0), var2, var3, true);

      for (int var13 = 0; var13 < 3; var13++) {
         Helper183.method1563(var11, var1 = var11.add(0.0, 0.0, var4 * -1), var2, var3, true);
         Helper183.method1563(var1, var11 = var1.add(var6 * -1.0F, 0.0, 0.0), var2, var3, true);
      }

      Helper183.method1563(var11, var11.add(0.0, 0.0, var4 * -2), var2, var3, true);
   }

   private void method4725(Vec3d var1, int var2, float var3, int var4, boolean var5) {
      float var6 = var5 ? var4 : -var4;
      Vec3d var8;
      Helper183.method1563(var1, var8 = var1.add(var6, 0.0, 0.0), var2, var3, true);

      for (int var7 = 0; var7 < 4; var7++) {
         Helper183.method1563(var8, var1 = var8.add(0.0, 0.0, var4), var2, var3, true);
         Helper183.method1563(var1, var8 = var1.add(var6, 0.0, 0.0), var2, var3, true);
      }

      Helper183.method1563(var8, var1 = var8.add(0.0, 0.0, var4), var2, var3, true);
      Vec3d var11;
      Helper183.method1563(var1, var11 = var1.add(var6 * -2.0F, 0.0, 0.0), var2, var3, true);

      for (int var13 = 0; var13 < 3; var13++) {
         Helper183.method1563(var11, var1 = var11.add(0.0, 0.0, var4 * -1), var2, var3, true);
         Helper183.method1563(var1, var11 = var1.add(var6 * -1.0F, 0.0, 0.0), var2, var3, true);
      }

      Helper183.method1563(var11, var11.add(0.0, 0.0, var4 * -2), var2, var3, true);
   }

   private void method4726(Vec3d var1, int var2, int var3, boolean var4) {
      var1 = var1.add(0.0, 0.001, 0.0);
      float var5 = var4 ? var3 : -var3;
      Helper183.method1566(var1, var1.add(var5, 0.0, 0.0), var1.add(var5, 0.0, var3 * 2), var1.add(0.0, 0.0, var3 * 2), var2, true);

      for (int var6 = 0; var6 < 3; var6++) {
         Helper183.method1566(
            var1 = var1.add(var5, 0.0, var3), var1.add(var5, 0.0, 0.0), var1.add(var5, 0.0, var3 * 2), var1.add(0.0, 0.0, var3 * 2), var2, true
         );
      }

      Vec3d var8;
      Helper183.method1566(var8 = var1.add(var5, 0.0, var3), var8.add(var5, 0.0, 0.0), var8.add(var5, 0.0, var3), var8.add(0.0, 0.0, var3), var2, true);
   }

   private void method4727(Vec3d var1, int var2, int var3, boolean var4) {
      float var5 = var4 ? var3 : -var3;
      Helper183.method1566(var1, var1.add(var5, 0.0, 0.0), var1.add(var5, 5.0, 0.0), var1.add(0.0, 5.0, 0.0), var2, true);

      for (int var6 = 0; var6 < 4; var6++) {
         Vec3d var7;
         Helper183.method1566(var7 = var1.add(var5, 0.0, 0.0), var7.add(0.0, 0.0, var3), var7.add(0.0, 5.0, var3), var7.add(0.0, 5.0, 0.0), var2, true);
         Helper183.method1566(var1 = var7.add(0.0, 0.0, var3), var1.add(var5, 0.0, 0.0), var1.add(var5, 5.0, 0.0), var1.add(0.0, 5.0, 0.0), var2, true);
      }

      Vec3d var8;
      Helper183.method1566(var8 = var1.add(var5, 0.0, 0.0), var8.add(0.0, 0.0, var3), var8.add(0.0, 5.0, var3), var8.add(0.0, 5.0, 0.0), var2, true);
      Helper183.method1566(
         var1 = var8.add(0.0, 0.0, var3), var1.add(var5 * -2.0F, 0.0, 0.0), var1.add(var5 * -2.0F, 5.0, 0.0), var1.add(0.0, 5.0, 0.0), var2, true
      );
      var1 = var1.add(var5 * -1.0F, 0.0, 0.0);

      for (int var13 = 0; var13 < 3; var13++) {
         Vec3d var11;
         Helper183.method1566(
            var11 = var1.add(var5 * -1.0F, 0.0, 0.0), var11.add(0.0, 0.0, var3 * -1), var11.add(0.0, 5.0, var3 * -1), var11.add(0.0, 5.0, 0.0), var2, true
         );
         Helper183.method1566(
            var1 = var11.add(0.0, 0.0, var3 * -1), var1.add(var5 * -1.0F, 0.0, 0.0), var1.add(var5 * -1.0F, 5.0, 0.0), var1.add(0.0, 5.0, 0.0), var2, true
         );
      }

      Vec3d var12;
      Helper183.method1566(
         var12 = var1.add(var5 * -1.0F, 0.0, 0.0), var12.add(0.0, 0.0, var3 * -2), var12.add(0.0, 5.0, var3 * -2), var12.add(0.0, 5.0, 0.0), var2, true
      );
   }

   private void method4728() {
      if (mc.player != null && mc.currentScreen == null && mc.getWindow() != null) {
         if (this.mode.method2385("FunTime") && this.funtimeAhSearchBind.getKey() != -1) {
            long var1 = mc.getWindow().getHandle();
            int var4 = this.funtimeAhSearchBind.getKey();
            boolean var3;
            if (var4 >= 0 && var4 <= 7) {
               var3 = GLFW.glfwGetMouseButton(var1, var4) == 1;
            } else {
               var3 = InputUtil.isKeyPressed(var1, var4);
            }

            if (!var3) {
               this.ahSearchBindWasPressed = false;
            } else if (!this.ahSearchBindWasPressed && this.ahSearchTimer.method3356(700.0)) {
               ItemStack var5 = mc.player.getMainHandStack();
               if (var5 != null && !var5.isEmpty() && mc.player.networkHandler != null) {
                  String var6 = Helper66.method722(var5.getName()).replaceAll("[^\\p{L}\\p{N}\\s]", " ").replaceAll("\\s+", " ").trim();
                  if (var6.isEmpty()) {
                     this.ahSearchBindWasPressed = true;
                     this.ahSearchTimer.method3358();
                  } else {
                     mc.player.networkHandler.sendChatMessage("/ah search " + var6);
                     this.ahSearchBindWasPressed = true;
                     this.ahSearchTimer.method3358();
                  }
               } else {
                  this.ahSearchBindWasPressed = true;
                  this.ahSearchTimer.method3358();
               }
            }
         }
      }
   }

   private boolean method4729(String var1) {
      return switch (var1) {
         case "Дезориентация", "Божья аура", "Пласт", "Трапка", "Огненный смерч", "Снежок заморозка", "Заряд ветра", "Явная пыль", "Хлопушка", "Святая вода", "Зелье Гнева", "Зелье Ассасина", "Зелье Палладина", "Зелье палладина", "Зелье Радиации", "Зелье радиации", "Снотворное", "Зелье киллера" -> true;
         default -> false;
      };
   }

   private void method4730(String var1, String var2, String var3, Vec3d var4, String var5, int var6, int var7) {
      if (this.serverEvents.stream().noneMatch(var1x -> var1x.vec.equals(var4))) {
         long var8 = System.currentTimeMillis() + var6 * 1000L;
         long var10 = var8 + var7 * 1000L;
         this.serverEvents.add(new Helper447(var1, var2, var3, var4, var5, Helper128.method1059(), var8, var10));
      }
   }

   private void method4731(Item var1, Vec3d var2, double var3) {
      if (this.structures.stream().noneMatch(var1x -> var1x.vec.equals(var2))) {
         this.structures.add(new Helper445(var1, var2, Helper128.method1050(), Helper128.method1059(), var3));
      }
   }

   private Vector4f method4732(Helper175 var1, List<String> var2, int var3, float var4) {
      if (var3 == 0) {
         float var8 = var1.method1479((String)var2.get(var3 + 1));
         return var8 >= var4 ? new Vector4f(2.0F, 0.0F, 2.0F, 0.0F) : new Vector4f(2.0F);
      } else if (var3 == var2.size() - 1) {
         float var7 = var1.method1479((String)var2.get(var3 - 1));
         return var7 >= var4 ? new Vector4f(0.0F, 2.0F, 0.0F, 2.0F) : new Vector4f(2.0F);
      } else {
         float var5 = var1.method1479((String)var2.get(var3 - 1));
         float var6 = var1.method1479((String)var2.get(var3 + 1));
         return var5 >= var4 ? (var6 >= var4 ? new Vector4f() : new Vector4f(0.0F, 2.0F, 0.0F, 2.0F)) : new Vector4f(2.0F);
      }
   }

   private boolean method4733(float var1) {
      return var1 == 0.0F
         || mc.world.getPlayers().stream().anyMatch(var1x -> var1x != mc.player && !Helper309.method3075(var1x) && mc.player.distanceTo(var1x) <= var1);
   }

   private boolean method4734(BlockPos var1) {
      int var2 = 0;

      for (BlockPos var4 : Helper38.method531(var1, 2.0F)) {
         if (var4.toCenterPos().distanceTo(var1.toCenterPos()) < 2.0) {
            BlockState var5 = this.blockStateMap.get(var4);
            if (var5 != null && !var5.isAir()) {
               var2++;
            }
         } else if (!var4.equals(var1.up(2).north().east())
            && !var4.equals(var1.up(2).north().west())
            && !var4.equals(var1.up(2).south().east())
            && !var4.equals(var1.up(2).south().west())) {
            BlockState var6 = this.blockStateMap.get(var4);
            if (var6 == null || var6.isAir()) {
               var2++;
            }
         }

         if (var2 > 1) {
            return false;
         }
      }

      return true;
   }

   private boolean method4735(BlockPos var1) {
      int var2 = 0;

      for (BlockPos var4 : Helper38.method531(var1, 3.0F)) {
         if (Math.abs(var4.getX() - var1.getX()) <= 2 && Math.abs(var4.getY() - var1.getY()) <= 2 && Math.abs(var4.getZ() - var1.getZ()) <= 2) {
            BlockState var6 = this.blockStateMap.get(var4);
            if (var6 != null && !var6.isAir()) {
               var2++;
            }
         } else if (!var4.equals(var1.up(3))) {
            BlockState var5 = this.blockStateMap.get(var4);
            if (var5 == null || var5.isAir()) {
               var2++;
            }
         }

         if (var2 > 1) {
            return false;
         }
      }

      return true;
   }

   public List<Helper444> method4736() {
      return this.keyBindings;
   }

   public Setting9 method4737(String var1) {
      return this.keyBindings.stream().filter(var1x -> var1x.method4694().getName().equals(var1)).map(Helper444::method4694).findFirst().orElse(null);
   }
}
