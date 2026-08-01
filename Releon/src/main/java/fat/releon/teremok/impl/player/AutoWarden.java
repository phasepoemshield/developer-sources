package fat.releon.teremok.impl.player;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.goals.GoalNear;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.Helper80;
import l.Helper104;
import l.Setting2;
import l.Setting3;
import l.Helper242;
import l.Setting6;
import l.Helper264;
import l.Helper269;
import l.Helper339;
import l.Event8;
import l.Helper386;
import l.Event20;
import l.Helper66;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CandleBlock;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.block.entity.SignText;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.decoration.DisplayEntity.TextDisplayEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;

public class AutoWarden extends Helper242 {
   private static final String Clan = "clan home ";
   private final Setting6 warehouse = new Setting6("Хом стежа", "").method2407("home").method2408(1).method2409(64);
   private final Setting6 House = new Setting6("Хом склада", "").method2407("st").method2408(1).method2409(64);
   private final Setting6 Loot = new Setting6("Хом лута", "").method2407("warden").method2408(1).method2409(64);
   private final Setting3 autoLoot = new Setting3("", "").method2201(true);
   private final Setting3 autoDeposit = new Setting3("", "").method2201(true);
   private final Setting3 autoSupplies = new Setting3("", "").method2201(true);
   private final Setting3 timedChestsOnly = new Setting3("Только сундуки с таймером", "Игнорировать обычные сундуки без таймера").method2201(true);
   private final Setting6 supplySign = new Setting6("Название таблички", "")
      .method2407("инвиз,еда")
      .method2408(1)
      .method2409(64)
      .method2400(this.autoSupplies::method2200);
   private final Setting2 openRetryDelay = new Setting2("Задержка открытия", "").method2086(150.0F).method2079(50, 1500);
   private final Setting2 rejoinLead = new Setting2("Заходить за (мс)", "").method2086(3000.0F).method2079(500, 15000);
   private final Setting6 zaxdod = new Setting6("Выходить меньше чем", "").method2407("60").method2408(1).method2409(9999).method2402();
   private final Helper339 stateTimer = new Helper339();
   private final Helper339 foodUseTimer = new Helper339();
   private final Helper339 invisibilityUseTimer = new Helper339();
   private final Helper339 candleBreakTimer = new Helper339();
   private final Map<BlockPos, Long> ignoredChests = new ConcurrentHashMap<>();
   private static final int SUPPLY_SEARCH_RADIUS = 32;
   private static final int SUPPLY_SEARCH_Y_RANGE = 1;
   private static final int MIN_INVISIBILITY_POTIONS = 1;
   private static final int MIN_FOOD_ITEMS = 8;
   private static final int FOOD_TAKE_COUNT = 4;
   private static final long SUPPLY_RETRY_DELAY_MS = 15000L;
   private static final long SUPPLY_TIMEOUT_MS = 45000L;
   private static final long SCAN_FIND_TIMEOUT_MS = 750L;
   private static final long CHEST_OPEN_TIMEOUT_MS = 20000L;
   private static final long OPEN_MISSED_TIMEOUT_MS = 10000L;
   private static final long OPEN_CONFIRM_TIMEOUT_MS = 5000L;
   private static final long LOOT_EMPTY_CHECK_DELAY_MS = 200L;
   private static final long TIMED_CHEST_LOOT_GRACE_MS = 3000L;
   private static final long HOLOGRAM_TIMER_SAFETY_MS = 0L;
   private static final long TIMED_CHEST_OPEN_DELAY_MS = 500L;
   private static final long BARITONE_NO_PATH_RESET_MS = 4000L;
   private static final long CANDLE_BREAK_DELAY_MS = 120L;
   private static final int LOOT_EMPTY_REQUIRED_CHECKS = 2;
   private static final long MIN_HUB_WAIT_MS = 10000L;
   private static final long HOME_TELEPORT_WAIT_MS = 8500L;
   private static final long AFTER_TELEPORT_ACTION_WAIT_MS = 500L;
   private static final long ARENA_HOME_TELEPORT_WAIT_MS = 500L;
   private static final long ARENA_RETURN_LEAD_MS = 9000L;
   private static final long LAST_KNOWN_CHEST_FALLBACK_MS = 300000L;
   private static final long AFTER_LOOT_RETREAT_TIMEOUT_MS = 3000L;
   private static final double CHEST_OPEN_RANGE = 3.0;
   private static final double CHEST_OPEN_RANGE_SQ = 9.0;
   private static final double AFTER_LOOT_RETREAT_DISTANCE_SQ = 16.0;
   private static final int AFTER_LOOT_RETREAT_BLOCKS = 25;
   private static final double HOLOGRAM_READ_RADIUS_SQ = 4.0;
   private static final String[] DEFAULT_SUPPLY_SIGN_KEYWORDS = new String[]{"инвиз", "невид", "еда", "invis", "food"};
   private static final String[] LOOT_ITEMS = new String[]{
      "Totem",
      "Netherite Helmet",
      "Netherite Chestplate",
      "Netherite Leggings",
      "Netherite Boots",
      "Netherite Sword",
      "Netherite Pickaxe",
      "Enchanted Golden Apple",
      "Player Head",
      "ENDER_EYE",
      "Shulker Box",
      "Netherite Ingot",
      "Dragon Head",
      "Elytra",
      "Snowball",
      "Splash Potion",
      "Tripwire Hook",
      "Netherite Scrap",
      "Beacon",
      "Villager Spawn Egg",
      "DRAGON_HEAD",
      "NETHERITE_SCRAP",
      "Paper",
      "FIREWORK_ROCKET",
      "PHANTOM_MEMBRANE",
      "Diamond",
      "phantom_membrane",
      "TOTEM_OF_UNDYING",
      " Golden Apple",
      "Golden Carrot",
      "tnt",
      "IRON_NUGGET",
      "AMETHYST_SHARD",
      "ENDER_EYE",
      "GOAT_HORN",
      "NAME_TAG",
      "FEATHER",
      "COMPASS",
      "POPPED_CHORUS_FRUIT",
      "GOLDEN_APPLE",
      "BUCKET"
   };
   private static final String[] STRICT_LOOT_ITEM_IDS = new String[]{
      "totem of undying",
      "netherite helmet",
      "netherite chestplate",
      "netherite leggings",
      "netherite boots",
      "netherite sword",
      "netherite pickaxe",
      "enchanted golden apple",
      "shulker box",
      "netherite ingot",
      "dragon head",
      "elytra",
      "snowball",
      "splash potion",
      "phantom_membrane",
      "tripwire hook",
      "netherite scrap",
      "beacon",
      "ender_eye",
      "villager spawn egg",
      "paper",
      "firework rocket",
      "phantom membrane",
      "diamond",
      "golden apple",
      "golden carrot",
      "tnt",
      "iron_nugget",
      "IRON_NUGGET",
      "AMETHYST_SHARD",
      "ENDER_EYE",
      "GOAT_HORN",
      "NAME_TAG",
      "FEATHER",
      "COMPASS",
      "POPPED_CHORUS_FRUIT",
      "GOLDEN_APPLE",
      "BUCKET"
   };
   private AutoWarden.FarmState state = AutoWarden.FarmState.IDLE;
   private int targetAnarchy = -1;
   private BlockPos targetChest;
   private BlockPos lastKnownLootChest;
   private long lastKnownLootChestAt = -1L;
   private long targetOpenTime = -1L;
   private long targetFoundOpenTime = -1L;
   private long scannedChestOpenTime = -1L;
   private int scanIndex = 0;
   private int depositSlotIndex = 0;
   private boolean lootedCurrentChest = false;
   private boolean openedCurrentChest = false;
   private boolean aimedCurrentChest = false;
   private boolean checkingUntimedChest = false;
   private boolean openingTimedChestImmediately = false;
   private boolean pendingDeposit = false;
   private boolean warehouseHomeCommandSent = false;
   private boolean pendingClanStorageWithdraw = false;
   private boolean farmHomeCommandSent = false;
   private boolean supplyHomeCommandSent = false;
   private boolean returnCommandSent = false;
   private long lootContainerOpenedAt = -1L;
   private int emptyLootChecks = 0;
   private boolean pausedByTeleportBossBar = false;
   private long lastTeleportBossBarEndedAt = -1L;
   private boolean arenaReturnTeleportSeen = false;
   private long baritoneNoPathSince = -1L;
   private boolean pausedByHomeTeleport = false;
   private long homeTeleportPauseUntil = 0L;
   private AutoWarden.FarmState openTimeoutState = null;
   private long openTimeoutStartedAt = -1L;
   private BlockPos lastOpenAttemptChest;
   private long lastOpenAttemptAt = -1L;
   private BlockPos breakingCandle;
   private BlockPos pendingOpenedChest;
   private BlockPos afterLootRetreatTarget;
   private boolean afterLootRetreatGoalStarted;
   private int openAttemptSyncId = -1;
   private long openAttemptStartedAt = -1L;
   private int chestOpenRecoveries = 0;
   private BlockPos supplyChest;
   private AutoWarden.FarmState supplyReturnState = AutoWarden.FarmState.RUSH_JOIN;
   private long supplyStartedAt = -1L;
   private long supplyRetryAfter = 0L;
   private boolean aimedSupplyChest = false;
   private boolean initialSupplyPending = false;
   private boolean forceSupplyPending = false;
   private boolean supplyTookInvisibility = false;
   private boolean supplyTookFood = false;
   private boolean autoEatingFood = false;
   private int previousFoodSlot = -1;
   private int foodHotbarSlot = -1;
   private int foodUseDelayTicks = 0;
   private boolean autoDrinkingInvisibility = false;
   private int previousInvisibilitySlot = -1;
   private int invisibilityHotbarSlot = -1;
   private int invisibilityUseDelayTicks = 0;
   private Boolean previousBaritoneFreeLook;
   private Boolean previousBaritoneRightClickContainerOnArrival;
   private static final Pattern TIME_PATTERN = Pattern.compile("(?<!\\d)(\\d{1,2})\\s*[:\\uFF1A]\\s*(\\d{1,2})(?:\\s*[:\\uFF1A]\\s*(\\d{1,2}))?(?!\\d)");
   private static final Pattern SECONDS_PATTERN = Pattern.compile(
      "(?<![:\\d])(\\d{1,3})\\s*(?:\\u0441\\u0435\\u043a\\u0443\\u043d\\u0434(?:\\u0430|\\u044b)?|\\u0441\\u0435\\u043a\\.?|sec(?:\\.|ond)?s?|seconds?|\\u0441\\.?|s\\.?|c\\.?)"
   );
   private static final Pattern MIN_SEC_PATTERN = Pattern.compile(
      "(?<!\\d)(\\d{1,3})\\s*(?:\\u043c\\u0438\\u043d(?:\\.|\\u0443\\u0442(?:\\u0430|\\u044b)?)?|\\u043c\\.?|min(?:\\.|ute)?s?|m\\.?)\\s*(?:(\\d{1,2})\\s*(?:\\u0441\\u0435\\u043a\\u0443\\u043d\\u0434(?:\\u0430|\\u044b)?|\\u0441\\u0435\\u043a\\.?|sec(?:\\.|ond)?s?|seconds?|\\u0441\\.?|s\\.?|c\\.?))?"
   );

   public AutoWarden() {
      super("AutoWarden", "Auto Warden", Helper269.PLAYER);
      this.setup(new Helper264[]{this.House, this.Loot, this.timedChestsOnly, this.openRetryDelay, this.rejoinLead, this.zaxdod, this.supplySign});
   }

   @Override
   public void activate() {
      super.activate();
      this.state = AutoWarden.FarmState.IDLE;
      this.stateTimer.method3358();
      this.initialSupplyPending = this.autoSupplies.method2200();
      this.supplyRetryAfter = 0L;
      this.method94();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.method213();
      IBaritone var1 = this.method84();
      if (var1 != null) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.method95();
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (!var1.method3894() && var1.method3895() instanceof GameMessageS2CPacket var2) {
         String var5 = this.method115(var2.content().getString());
         if (var5.contains("помянем. вы погибли!")) {
            IBaritone var4 = this.method84();
            if (var4 != null) {
               var4.getPathingBehavior().cancelEverything();
            }

            if (mc.player != null && mc.currentScreen != null) {
               mc.player.closeHandledScreen();
            }

            this.method213();
            this.method146();
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      try {
         this.method78(var1);
      } catch (Throwable var3) {
         this.method80();
      }
   }

   private void method78(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         IBaritone var2 = this.method84();
         if (!this.method148(var2)) {
            if (this.method126()) {
               this.stateTimer.method3358();
            } else if (this.method231()) {
               this.pausedByTeleportBossBar = true;
               if (this.state == AutoWarden.FarmState.ARENA_RETURN_WAIT) {
                  this.arenaReturnTeleportSeen = true;
               }

               this.method141();
               this.method142();
               if (var2 != null) {
                  var2.getPathingBehavior().cancelEverything();
               }

               this.method218();
               if (mc.currentScreen != null) {
                  mc.player.closeHandledScreen();
               }

               this.stateTimer.method3358();
            } else {
               if (this.pausedByTeleportBossBar) {
                  this.pausedByTeleportBossBar = false;
                  this.lastTeleportBossBarEndedAt = System.currentTimeMillis();
                  this.stateTimer.method3358();
               }

               if (this.pausedByHomeTeleport) {
                  if (System.currentTimeMillis() < this.homeTeleportPauseUntil) {
                     return;
                  }

                  this.pausedByHomeTeleport = false;
                  this.stateTimer.method3358();
               }

               int var3 = this.method221();
               this.method86(var2);
               this.method201();
               if (this.method132(var3)) {
                  if (var2 != null) {
                     var2.getPathingBehavior().cancelEverything();
                  }

                  this.method218();
                  this.stateTimer.method3358();
               } else {
                  switch (this.state) {
                     case IDLE:
                        if (this.initialSupplyPending || this.forceSupplyPending) {
                           if (!this.autoSupplies.method2200()) {
                              this.initialSupplyPending = false;
                              this.forceSupplyPending = false;
                           } else {
                              if (this.method145(AutoWarden.FarmState.SCAN_NEXT, var3, this.forceSupplyPending)) {
                                 return;
                              }

                              if (this.forceSupplyPending) {
                                 this.stateTimer.method3358();
                                 return;
                              }

                              this.initialSupplyPending = false;
                           }
                        }

                        this.scanIndex = 0;
                        this.state = this.method202() ? AutoWarden.FarmState.HUB_WAITING : AutoWarden.FarmState.SCAN_NEXT;
                        break;
                     case SCAN_NEXT:
                        this.stateTimer.method3358();
                        this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                        break;
                     case SCAN_WAIT_JOIN:
                        this.stateTimer.method3358();
                        this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                        break;
                     case SCAN_FIND_HOLOGRAM:
                        if (var3 == -1) {
                           this.state = this.method202() ? AutoWarden.FarmState.HUB_WAITING : AutoWarden.FarmState.IDLE;
                           this.stateTimer.method3358();
                           return;
                        }

                        BlockPos var27 = this.method96();
                        long var34 = this.scannedChestOpenTime;
                        BlockPos var35 = this.timedChestsOnly.method2200() ? null : this.method97();
                        BlockPos var36 = this.timedChestsOnly.method2200() ? null : this.method108();
                        BlockPos var9 = this.method99(var36, this.method99(var27, var35));
                        boolean var37 = var27 != null && var27.equals(var9);
                        if (var9 != null) {
                           this.targetChest = var9;
                           this.method100(var9);
                           this.targetFoundOpenTime = var37 ? var34 : -1L;
                           this.lootedCurrentChest = false;
                           this.openedCurrentChest = false;
                           this.aimedCurrentChest = false;
                           this.checkingUntimedChest = !var37;
                           this.chestOpenRecoveries = 0;
                           if (var2 != null) {
                              var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.targetChest, 1));
                           }

                           this.stateTimer.method3358();
                           this.state = AutoWarden.FarmState.SCAN_PATHING;
                        } else if (this.stateTimer.method3356(750.0)) {
                           if (this.timedChestsOnly.method2200()) {
                              this.scanIndex++;
                              this.state = AutoWarden.FarmState.SCAN_NEXT;
                              this.stateTimer.method3358();
                              return;
                           }

                           BlockPos var11 = this.method101();
                           if (var11 != null) {
                              this.targetChest = var11;
                              this.targetFoundOpenTime = -1L;
                              this.lootedCurrentChest = false;
                              this.openedCurrentChest = false;
                              this.aimedCurrentChest = false;
                              this.checkingUntimedChest = true;
                              this.chestOpenRecoveries = 0;
                              if (var2 != null) {
                                 var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.targetChest, 1));
                              }

                              this.state = AutoWarden.FarmState.SCAN_PATHING;
                              this.stateTimer.method3358();
                              return;
                           }

                           this.scanIndex++;
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                        }
                        break;
                     case SCAN_PATHING:
                        if (var3 == -1) {
                           this.state = this.method202() ? AutoWarden.FarmState.HUB_WAITING : AutoWarden.FarmState.IDLE;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.targetChest == null) {
                           this.targetChest = null;
                           this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                           return;
                        }

                        double var26 = mc.player.getBlockPos().getSquaredDistance(this.targetChest);
                        if (this.method109(this.targetChest) || var26 <= 4.0 && (var2 == null || !var2.getPathingBehavior().isPathing())) {
                           if (var2 != null) {
                              var2.getPathingBehavior().cancelEverything();
                           }

                           this.stateTimer.method3358();
                           this.state = AutoWarden.FarmState.SCAN_READ_HOLOGRAM;
                        } else if (var2 != null && !var2.getPathingBehavior().isPathing() && this.stateTimer.method3356(2000.0)) {
                           var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.targetChest, 1));
                           this.stateTimer.method3358();
                        }
                        break;
                     case SCAN_READ_HOLOGRAM:
                        if (var3 == -1) {
                           this.state = this.method202() ? AutoWarden.FarmState.HUB_WAITING : AutoWarden.FarmState.IDLE;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.targetChest == null) {
                           this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                           return;
                        }

                        long var25 = this.method110(this.targetChest);
                        long var6 = -1L;
                        long var8 = -1L;
                        if (this.targetFoundOpenTime > System.currentTimeMillis()) {
                           var8 = Math.max(0L, (this.targetFoundOpenTime - System.currentTimeMillis() + 999L) / 1000L);
                        }

                        if (var25 >= 0L) {
                           var6 = this.method210(var25);
                        }

                        if (var8 >= 0L && (var25 < 0L || var8 < var25)) {
                           var25 = var8;
                           var6 = this.targetFoundOpenTime;
                        }

                        if (var25 < 0L && this.targetFoundOpenTime != -1L) {
                           var25 = var8;
                           var6 = this.targetFoundOpenTime;
                        }

                        if (var25 >= 0L && var6 != -1L) {
                           long var10 = var6 - System.currentTimeMillis();
                           this.targetAnarchy = var3;
                           this.returnCommandSent = false;
                           this.lootedCurrentChest = false;
                           this.openedCurrentChest = false;
                           this.aimedCurrentChest = false;
                           if (var10 > this.method208()) {
                              this.targetOpenTime = var6;
                              this.checkingUntimedChest = false;
                              this.openingTimedChestImmediately = false;
                              if (this.targetChest != null) {
                                 this.ignoredChests.put(this.targetChest.toImmutable(), Math.max(System.currentTimeMillis() + 1000L, var6 - this.method208()));
                              }

                              this.state = AutoWarden.FarmState.SCAN_NEXT;
                              this.stateTimer.method3358();
                              return;
                           }

                           this.targetOpenTime = var6;
                           this.checkingUntimedChest = false;
                           this.openingTimedChestImmediately = false;
                           this.state = this.method211(var10) ? AutoWarden.FarmState.ARENA_SET_HOME : AutoWarden.FarmState.WAIT_OPEN;
                           this.stateTimer.method3358();
                        } else if (var25 < 0L) {
                           if (this.timedChestsOnly.method2200()) {
                              if (this.targetChest != null) {
                                 this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 60000L);
                              }

                              this.targetChest = null;
                              this.targetFoundOpenTime = -1L;
                              this.checkingUntimedChest = false;
                              this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                              this.stateTimer.method3358();
                              return;
                           }

                           this.targetOpenTime = -1L;
                           this.checkingUntimedChest = true;
                           this.lootedCurrentChest = false;
                           this.openedCurrentChest = false;
                           this.aimedCurrentChest = false;
                           this.state = AutoWarden.FarmState.WAIT_OPEN;
                           this.stateTimer.method3358();
                        } else if (this.stateTimer.method3356(4000.0)) {
                           this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 300000L);
                           this.targetChest = null;
                           this.checkingUntimedChest = false;
                           this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                           this.stateTimer.method3358();
                        }
                        break;
                     case HUB_WAITING:
                        if (this.targetAnarchy == -1 || this.targetOpenTime == -1L) {
                           return;
                        }

                        long var24 = this.targetOpenTime - System.currentTimeMillis();
                        if (var24 < -10000L) {
                           this.method212();
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (var24 <= this.method207()) {
                           this.state = AutoWarden.FarmState.RUSH_JOIN;
                           this.stateTimer.method3358();
                        }
                        break;
                     case ARENA_SET_HOME:
                        if (this.targetChest == null || this.targetOpenTime == -1L) {
                           this.method212();
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (!this.method203()) {
                           this.state = AutoWarden.FarmState.RUSH_PATH;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (mc.currentScreen != null) {
                           mc.player.closeHandledScreen();
                        }

                        this.method218();
                        this.method216(this.method224());
                        this.state = AutoWarden.FarmState.ARENA_OPEN;
                        this.stateTimer.method3358();
                        break;
                     case ARENA_OPEN:
                        if (this.targetOpenTime == -1L) {
                           this.method212();
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.targetOpenTime - System.currentTimeMillis() <= 9000L) {
                           this.state = AutoWarden.FarmState.ARENA_RETURN;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler var23 && this.method116()) {
                           if (this.method153(var23)) {
                              this.state = AutoWarden.FarmState.ARENA_WAIT_RETURN;
                              this.stateTimer.method3358();
                           }
                        } else if (this.stateTimer.method3356(800.0)) {
                           this.method216("darena");
                           this.stateTimer.method3358();
                        }
                        break;
                     case ARENA_WAIT_RETURN:
                        if (this.targetOpenTime == -1L) {
                           this.method212();
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (mc.currentScreen != null) {
                           mc.player.closeHandledScreen();
                        }

                        long var22 = this.targetOpenTime - System.currentTimeMillis();
                        if (var22 <= 9000L) {
                           this.state = AutoWarden.FarmState.ARENA_RETURN;
                           this.stateTimer.method3358();
                        }
                        break;
                     case ARENA_RETURN:
                        if (mc.currentScreen != null) {
                           mc.player.closeHandledScreen();
                        }

                        this.arenaReturnTeleportSeen = false;
                        this.method216(this.method225());
                        this.state = AutoWarden.FarmState.ARENA_RETURN_WAIT;
                        this.stateTimer.method3358();
                        break;
                     case ARENA_RETURN_WAIT:
                        long var21 = this.arenaReturnTeleportSeen ? 500L : 8500L;
                        if (this.stateTimer.method3356(var21)) {
                           this.arenaReturnTeleportSeen = false;
                           this.aimedCurrentChest = false;
                           this.state = this.method203() ? AutoWarden.FarmState.WAIT_OPEN : AutoWarden.FarmState.RUSH_PATH;
                           this.stateTimer.method3358();
                        }
                        break;
                     case RUSH_JOIN:
                        if (this.method203()) {
                           this.aimedCurrentChest = false;
                           this.state = AutoWarden.FarmState.WAIT_OPEN;
                           this.stateTimer.method3358();
                        } else {
                           if (this.targetChest != null && var2 != null) {
                              var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.targetChest, 1));
                           }

                           this.state = AutoWarden.FarmState.RUSH_PATH;
                        }
                        break;
                     case RUSH_PATH:
                        if (this.targetChest == null) {
                           this.targetChest = null;
                           this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                           return;
                        }

                        if (this.method203()) {
                           if (var2 != null) {
                              var2.getPathingBehavior().cancelEverything();
                           }

                           this.aimedCurrentChest = false;
                           this.state = AutoWarden.FarmState.WAIT_OPEN;
                           this.stateTimer.method3358();
                        } else if (var2 != null && !var2.getPathingBehavior().isPathing() && this.stateTimer.method3356(2000.0)) {
                           var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.targetChest, 1));
                           this.stateTimer.method3358();
                        }
                        break;
                     case WAIT_OPEN:
                        if (var2 != null) {
                           var2.getPathingBehavior().cancelEverything();
                        }

                        BlockPos var20 = this.method106();
                        if (var20 == null) {
                           this.method128();
                           this.method82();
                           this.state = AutoWarden.FarmState.RUSH_PATH;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (!this.method109(var20)) {
                           this.method128();
                           this.method82();
                           this.aimedCurrentChest = false;
                           this.state = AutoWarden.FarmState.RUSH_PATH;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method117(var20)) {
                           this.method82();
                           this.method128();
                           this.method100(var20);
                           this.openedCurrentChest = true;
                           this.aimedCurrentChest = false;
                           this.chestOpenRecoveries = 0;
                           this.lootContainerOpenedAt = System.currentTimeMillis();
                           this.emptyLootChecks = 0;
                           this.state = AutoWarden.FarmState.LOOTING;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method116()) {
                           this.method128();
                           Helper66.method701(false);
                           this.method82();
                           this.aimedCurrentChest = false;
                           this.state = AutoWarden.FarmState.RUSH_PATH;
                           this.stateTimer.method3358();
                           return;
                        }

                        long var32 = this.targetOpenTime > 0L && !this.openingTimedChestImmediately ? this.targetOpenTime + 500L : this.targetOpenTime;
                        long var7 = var32 > 0L ? var32 - System.currentTimeMillis() : 0L;
                        if (this.targetOpenTime > 0L && var7 > 0L && !this.openingTimedChestImmediately) {
                           this.method128();
                           this.method82();
                           this.method130(var20);
                           return;
                        }

                        if (this.targetOpenTime > 0L && var7 < -10000L && !this.openingTimedChestImmediately) {
                           this.method128();
                           this.method212();
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method81(AutoWarden.FarmState.WAIT_OPEN)) {
                           this.method83(AutoWarden.FarmState.WAIT_OPEN);
                           return;
                        }

                        if (!this.aimedCurrentChest || this.method120(var20)) {
                           if (!this.method119(var20, true)) {
                              return;
                           }

                           this.aimedCurrentChest = true;
                           this.stateTimer.method3358();
                        }
                        break;
                     case LOOTING:
                        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler var19) {
                           if (this.stateTimer.method3356(20.0)) {
                              this.method179(var19);
                              this.stateTimer.method3358();
                           }
                        } else {
                           if (!this.lootedCurrentChest) {
                              if (this.method187()) {
                                 this.openedCurrentChest = false;
                                 this.aimedCurrentChest = false;
                                 this.state = AutoWarden.FarmState.WAIT_OPEN;
                                 this.stateTimer.method3358();
                                 return;
                              }

                              if (!this.openedCurrentChest && !this.checkingUntimedChest) {
                                 this.state = AutoWarden.FarmState.WAIT_OPEN;
                                 this.stateTimer.method3358();
                                 return;
                              }

                              if (this.targetChest != null) {
                                 this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 300000L);
                              }

                              this.targetChest = null;
                              this.openedCurrentChest = false;
                              this.aimedCurrentChest = false;
                              this.checkingUntimedChest = false;
                              this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
                              this.stateTimer.method3358();
                              return;
                           }

                           this.checkingUntimedChest = false;
                           this.openedCurrentChest = false;
                           this.aimedCurrentChest = false;
                           if (this.afterLootRetreatTarget != null) {
                              this.state = AutoWarden.FarmState.AFTER_LOOT_RETREAT;
                              this.stateTimer.method3358();
                              return;
                           }

                           this.method185();
                        }
                        break;
                     case AFTER_LOOT_RETREAT:
                        if (mc.currentScreen != null) {
                           mc.player.closeHandledScreen();
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.afterLootRetreatTarget != null && !this.method184() && !this.stateTimer.method3356(3000.0)) {
                           if (var2 != null && !this.afterLootRetreatGoalStarted) {
                              var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.afterLootRetreatTarget, 1));
                              this.afterLootRetreatGoalStarted = true;
                           }
                           break;
                        }

                        IBaritone var18 = this.method84();
                        if (var18 != null) {
                           var18.getPathingBehavior().cancelEverything();
                        }

                        this.afterLootRetreatTarget = null;
                        this.afterLootRetreatGoalStarted = false;
                        this.method185();
                        return;
                     case AFTER_LOOT_PVP_WAIT:
                        if (mc.currentScreen != null) {
                           mc.player.closeHandledScreen();
                        }

                        if (var2 != null) {
                           var2.getPathingBehavior().cancelEverything();
                        }

                        this.method218();
                        if (this.method113()) {
                           return;
                        }

                        this.method185();
                        break;
                     case SUPPLY_WAIT_JOIN:
                        String var17 = this.method223();
                        if (var17.isBlank()) {
                           this.supplyRetryAfter = System.currentTimeMillis() + 15000L;
                           this.method151(false);
                           return;
                        }

                        if (this.method150()) {
                           this.supplyStartedAt = System.currentTimeMillis();
                        }

                        if (!this.supplyHomeCommandSent) {
                           if (mc.currentScreen != null) {
                              mc.player.closeHandledScreen();
                           }

                           this.method216(var17);
                           this.supplyHomeCommandSent = true;
                           this.stateTimer.method3358();
                        } else if (this.method209()) {
                           this.state = AutoWarden.FarmState.SUPPLY_PATHING;
                           this.stateTimer.method3358();
                        }
                        break;
                     case SUPPLY_PATHING:
                        if (this.method223().isBlank()) {
                           this.supplyRetryAfter = System.currentTimeMillis() + 15000L;
                           this.method151(false);
                           return;
                        }

                        if (this.method150()) {
                           this.supplyStartedAt = System.currentTimeMillis();
                           this.supplyChest = null;
                        }

                        if (this.supplyChest == null) {
                           if (this.stateTimer.method3356(500.0)) {
                              this.supplyChest = this.method160();
                              this.stateTimer.method3358();
                           }

                           return;
                        }

                        if (this.method109(this.supplyChest)) {
                           if (var2 != null) {
                              var2.getPathingBehavior().cancelEverything();
                           }

                           this.aimedSupplyChest = false;
                           this.state = AutoWarden.FarmState.SUPPLY_OPEN;
                           this.stateTimer.method3358();
                        } else if (var2 != null && (!var2.getPathingBehavior().isPathing() || this.stateTimer.method3356(2000.0))) {
                           var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.supplyChest, 1));
                           this.stateTimer.method3358();
                        }
                        break;
                     case SUPPLY_OPEN:
                        if (var2 != null) {
                           var2.getPathingBehavior().cancelEverything();
                        }

                        if (this.method81(AutoWarden.FarmState.SUPPLY_OPEN)) {
                           this.method83(AutoWarden.FarmState.SUPPLY_OPEN);
                           return;
                        }

                        BlockPos var16 = this.method107();
                        if (this.method223().isBlank() || var16 == null || this.method150()) {
                           this.method128();
                           this.supplyRetryAfter = System.currentTimeMillis() + 15000L;
                           this.method151(false);
                           return;
                        }

                        if (!this.method109(var16)) {
                           this.method128();
                           this.method82();
                           this.aimedSupplyChest = false;
                           this.state = AutoWarden.FarmState.SUPPLY_PATHING;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method117(var16)) {
                           this.method82();
                           this.method128();
                           this.aimedSupplyChest = false;
                           this.state = AutoWarden.FarmState.SUPPLY_TAKE;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method116()) {
                           this.method128();
                           Helper66.method701(false);
                           this.method82();
                           this.stateTimer.method3358();
                           return;
                        }

                        if (!this.aimedSupplyChest || this.method120(var16)) {
                           if (!this.method119(var16, false)) {
                              return;
                           }

                           this.aimedSupplyChest = true;
                           this.openedCurrentChest = true;
                           this.stateTimer.method3358();
                        }
                        break;
                     case SUPPLY_TAKE:
                        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler var15) {
                           if (this.stateTimer.method3356(80.0)) {
                              this.method152(var15);
                              this.stateTimer.method3358();
                           }
                        } else {
                           this.method151(false);
                        }
                        break;
                     case CLAN_STORAGE_OPEN:
                        if (!this.method199()) {
                           this.method196();
                           return;
                        }

                        if (this.method116()) {
                           this.depositSlotIndex = 0;
                           this.state = AutoWarden.FarmState.CLAN_STORAGE_DEPOSIT;
                           this.stateTimer.method3358();
                        } else if (this.stateTimer.method3356(800.0)) {
                           this.method216("clan storage");
                           this.stateTimer.method3358();
                        }
                        break;
                     case CLAN_STORAGE_DEPOSIT:
                        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler var14) {
                           if (this.stateTimer.method3356(120.0)) {
                              this.method192(var14);
                              this.stateTimer.method3358();
                           }
                        } else if (this.method199()) {
                           this.pendingClanStorageWithdraw = true;
                           this.warehouseHomeCommandSent = false;
                           this.state = AutoWarden.FarmState.GO_WAREHOUSE;
                           this.stateTimer.method3358();
                        } else {
                           this.method196();
                        }
                        break;
                     case CLAN_STORAGE_WITHDRAW_OPEN:
                        if (this.method116()) {
                           this.depositSlotIndex = 0;
                           this.state = AutoWarden.FarmState.CLAN_STORAGE_WITHDRAW;
                           this.stateTimer.method3358();
                        } else if (this.stateTimer.method3356(800.0)) {
                           this.method216("clan storage");
                           this.stateTimer.method3358();
                        }
                        break;
                     case CLAN_STORAGE_WITHDRAW:
                        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler var13) {
                           if (this.stateTimer.method3356(120.0)) {
                              this.method194(var13);
                              this.stateTimer.method3358();
                           }
                        } else {
                           this.pendingDeposit = true;
                           this.targetChest = null;
                           this.depositSlotIndex = 0;
                           this.state = AutoWarden.FarmState.WAREHOUSE_OPEN;
                           this.stateTimer.method3358();
                        }
                        break;
                     case GO_WAREHOUSE:
                        String var12 = this.method223();
                        if (var12.isBlank()) {
                           this.state = AutoWarden.FarmState.IDLE;
                           return;
                        }

                        if (!this.method199()) {
                           if (this.pendingDeposit && !this.stateTimer.method3356(2000.0)) {
                              return;
                           }

                           this.pendingDeposit = false;
                           this.method212();
                           this.scanIndex = 0;
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                           return;
                        }

                        this.ignoredChests.clear();
                        this.targetChest = null;
                        if (!this.warehouseHomeCommandSent) {
                           if (mc.currentScreen != null) {
                              mc.player.closeHandledScreen();
                           }

                           this.method216(var12);
                           this.warehouseHomeCommandSent = true;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method209()) {
                           this.state = this.pendingClanStorageWithdraw ? AutoWarden.FarmState.CLAN_STORAGE_WITHDRAW_OPEN : AutoWarden.FarmState.WAREHOUSE_OPEN;
                           this.stateTimer.method3358();
                        }
                        break;
                     case RETURN_FARM_HOME:
                        if (!this.farmHomeCommandSent) {
                           if (mc.currentScreen != null) {
                              mc.player.closeHandledScreen();
                           }

                           this.method216(this.method222());
                           this.farmHomeCommandSent = true;
                           this.stateTimer.method3358();
                           return;
                        }

                        if (this.method209()) {
                           this.farmHomeCommandSent = false;
                           this.warehouseHomeCommandSent = false;
                           this.pendingDeposit = false;
                           this.ignoredChests.clear();
                           this.method212();
                           this.scanIndex = 0;
                           this.state = AutoWarden.FarmState.SCAN_NEXT;
                           this.stateTimer.method3358();
                        }
                        break;
                     case WAREHOUSE_WAIT_JOIN:
                        this.state = AutoWarden.FarmState.GO_WAREHOUSE;
                        this.stateTimer.method3358();
                        break;
                     case WAREHOUSE_FIND_CHEST:
                     case WAREHOUSE_PATHING:
                        this.state = AutoWarden.FarmState.WAREHOUSE_OPEN;
                        break;
                     case WAREHOUSE_OPEN:
                        if (var2 != null && (this.targetChest == null || this.method109(this.targetChest))) {
                           var2.getPathingBehavior().cancelEverything();
                        }

                        if (this.targetChest != null && this.method117(this.targetChest)) {
                           if (!this.method165(this.targetChest)) {
                              this.method79();
                              return;
                           }

                           this.method82();
                           this.depositSlotIndex = 0;
                           this.state = AutoWarden.FarmState.DEPOSITING;
                           this.stateTimer.method3358();
                        } else if (this.method116()) {
                           this.method128();
                           Helper66.method701(false);
                           this.method82();
                           this.stateTimer.method3358();
                        } else if (!this.method199()) {
                           if (this.pendingDeposit && !this.stateTimer.method3356(2000.0)) {
                              return;
                           }

                           this.method219();
                        } else if (this.stateTimer.method3356(this.method206())) {
                           if (this.targetChest == null || !this.method165(this.targetChest)) {
                              this.targetChest = this.method163();
                           }

                           if (this.targetChest == null) {
                              this.stateTimer.method3358();
                              return;
                           }

                           if (!this.method109(this.targetChest)) {
                              this.method82();
                              if (var2 != null) {
                                 var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.targetChest, 1));
                              }

                              this.stateTimer.method3358();
                              return;
                           }

                           if (this.method81(AutoWarden.FarmState.WAREHOUSE_OPEN)) {
                              this.method83(AutoWarden.FarmState.WAREHOUSE_OPEN);
                              return;
                           }

                           if (this.method119(this.targetChest, false)) {
                              this.stateTimer.method3358();
                           }
                        }
                        break;
                     case DEPOSITING:
                        if (mc.currentScreen instanceof GenericContainerScreen var4) {
                           if (this.targetChest == null || !this.method165(this.targetChest)) {
                              this.method79();
                              return;
                           }

                           if (this.stateTimer.method3356(150.0)) {
                              this.method197(var4);
                              this.stateTimer.method3358();
                           }
                        } else if (this.method199()) {
                           if (this.targetChest != null) {
                              this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 300000L);
                           }

                           this.targetChest = null;
                           this.state = AutoWarden.FarmState.WAREHOUSE_FIND_CHEST;
                           this.stateTimer.method3358();
                        } else {
                           this.method219();
                        }
                  }
               }
            }
         }
      }
   }

   private void method79() {
      this.method128();
      this.method82();
      if (this.targetChest != null) {
         this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 300000L);
      }

      this.targetChest = null;
      this.depositSlotIndex = 0;
      if (mc.player != null && mc.currentScreen != null) {
         Helper66.method701(false);
      }

      this.state = AutoWarden.FarmState.WAREHOUSE_FIND_CHEST;
      this.stateTimer.method3358();
   }

   private void method80() {
      try {
         this.method129();
         this.method141();
         this.method142();
         this.method218();
         IBaritone var1 = this.method84();
         if (var1 != null) {
            var1.getPathingBehavior().cancelEverything();
         }

         if (mc.player != null && mc.currentScreen != null) {
            mc.player.closeHandledScreen();
         }

         this.method82();
         this.targetChest = null;
         this.supplyChest = null;
         this.openedCurrentChest = false;
         this.aimedCurrentChest = false;
         this.aimedSupplyChest = false;
         this.arenaReturnTeleportSeen = false;
         this.checkingUntimedChest = false;
         this.openingTimedChestImmediately = false;
         this.chestOpenRecoveries = 0;
         this.depositSlotIndex = 0;
         this.emptyLootChecks = 0;
         this.pendingClanStorageWithdraw = false;
         this.warehouseHomeCommandSent = false;
         this.farmHomeCommandSent = false;
         this.supplyHomeCommandSent = false;
         this.forceSupplyPending = false;
         this.state = this.initialSupplyPending ? AutoWarden.FarmState.IDLE : AutoWarden.FarmState.SCAN_NEXT;
         this.stateTimer.method3358();
      } catch (Throwable var2) {
         this.state = AutoWarden.FarmState.IDLE;
      }
   }

   private boolean method81(AutoWarden.FarmState var1) {
      long var2 = System.currentTimeMillis();
      if (this.openTimeoutState != var1) {
         this.openTimeoutState = var1;
         this.openTimeoutStartedAt = var2;
         return false;
      } else {
         return var1 == AutoWarden.FarmState.WAIT_OPEN && this.openingTimedChestImmediately && this.targetOpenTime > 0L && var2 <= this.targetOpenTime + 20000L
            ? false
            : this.openTimeoutStartedAt > 0L && var2 - this.openTimeoutStartedAt > 20000L;
      }
   }

   private void method82() {
      this.openTimeoutState = null;
      this.openTimeoutStartedAt = -1L;
      this.method121();
   }

   private void method83(AutoWarden.FarmState var1) {
      this.method129();
      this.method218();
      this.method82();
      if (mc.player != null && mc.currentScreen != null) {
         mc.player.closeHandledScreen();
      }

      if (var1 == AutoWarden.FarmState.SUPPLY_OPEN) {
         this.supplyChest = null;
         this.aimedSupplyChest = false;
         this.supplyStartedAt = System.currentTimeMillis();
         this.state = AutoWarden.FarmState.SUPPLY_PATHING;
      } else if (var1 == AutoWarden.FarmState.WAREHOUSE_OPEN) {
         if (this.targetChest != null) {
            this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 60000L);
         }

         this.targetChest = null;
         this.state = AutoWarden.FarmState.WAREHOUSE_FIND_CHEST;
      } else {
         if (this.targetChest != null && this.chestOpenRecoveries < 4) {
            this.chestOpenRecoveries++;
            this.openedCurrentChest = false;
            this.aimedCurrentChest = false;
            this.checkingUntimedChest = false;
            this.openingTimedChestImmediately = false;
            this.state = this.method109(this.targetChest) ? AutoWarden.FarmState.WAIT_OPEN : AutoWarden.FarmState.RUSH_PATH;
            this.stateTimer.method3358();
            return;
         }

         if (this.targetChest != null) {
            this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 60000L);
         }

         this.targetChest = null;
         this.openedCurrentChest = false;
         this.aimedCurrentChest = false;
         this.checkingUntimedChest = false;
         this.openingTimedChestImmediately = false;
         this.chestOpenRecoveries = 0;
         this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
      }

      this.stateTimer.method3358();
   }

   @Helper104
   public void onDraw(Event20 var1) {
      if (mc.player != null) {
         String var2 = switch (this.state) {
            case AFTER_LOOT_RETREAT -> "Отхожу от сундука";
            case AFTER_LOOT_PVP_WAIT -> "Жду окончания PvP режима";
            case SUPPLY_WAIT_JOIN -> "Иду на склад за инвизом";
            case SUPPLY_PATHING -> this.supplyChest == null ? "Ищу сундук инвиза" : "Иду к сундуку инвиза";
            case SUPPLY_OPEN, SUPPLY_TAKE -> "Беру инвиз и еду";
            case CLAN_STORAGE_OPEN, CLAN_STORAGE_DEPOSIT -> "Складываю лут в clan storage";
            case CLAN_STORAGE_WITHDRAW_OPEN, CLAN_STORAGE_WITHDRAW -> "Забираю лут из clan storage";
            case GO_WAREHOUSE -> "Иду на склад";
            default -> this.targetAnarchy != -1 && this.targetOpenTime != -1L
               ? "Открытие через " + this.method230(this.targetOpenTime - System.currentTimeMillis())
               : "Поиск сундука";
         };
         int var3 = mc.textRenderer.getWidth(var2) + 12;
         int var4 = var1.method4058().getScaledWindowWidth() / 2 - var3 / 2;
         byte var5 = 50;
         MatrixStack var6 = var1.method4058().getMatrices();
         rectangle.method677(Helper80.method841(var6, var4, var5, var3, 18.0).method826(8.0F).method823(new Color(0, 0, 0, 255).getRGB()).method840());
         var1.method4058().drawText(mc.textRenderer, var2, var4 + 6, var5 + 5, new Color(255, 255, 255, 255).getRGB(), false);
      }
   }

   private IBaritone method84() {
      try {
         return BaritoneAPI.getProvider().getPrimaryBaritone();
      } catch (Throwable var2) {
         return null;
      }
   }

   private void method85() {
      IBaritone var1 = this.method84();
      if (var1 != null) {
         var1.getPathingBehavior().cancelEverything();
      }
   }

   private void method86(IBaritone var1) {
      if (var1 != null && this.method87()) {
         IPathingBehavior var2 = var1.getPathingBehavior();
         boolean var3 = var2.getInProgress().isPresent();
         boolean var4 = var2.getGoal() != null;
         boolean var5 = var4 && !var2.hasPath() && !var2.isPathing();
         if (!var3 && !var5) {
            this.baritoneNoPathSince = -1L;
         } else {
            long var6 = System.currentTimeMillis();
            if (this.baritoneNoPathSince == -1L) {
               this.baritoneNoPathSince = var6;
            } else {
               if (var6 - this.baritoneNoPathSince >= 4000L) {
                  this.method88();
               }
            }
         }
      } else {
         this.baritoneNoPathSince = -1L;
      }
   }

   private boolean method87() {
      return switch (this.state) {
         case SCAN_PATHING, RUSH_PATH, AFTER_LOOT_RETREAT, SUPPLY_PATHING, WAREHOUSE_PATHING -> true;
         case WAREHOUSE_OPEN -> this.targetChest != null && !this.method109(this.targetChest);
         default -> false;
      };
   }

   private void method88() {
      this.method85();
      this.method82();
      this.baritoneNoPathSince = -1L;
      this.aimedCurrentChest = false;
      this.aimedSupplyChest = false;
      this.openedCurrentChest = false;
      switch (this.state) {
         case AFTER_LOOT_RETREAT:
            this.afterLootRetreatTarget = null;
            this.afterLootRetreatGoalStarted = false;
            this.method185();
            break;
         case SUPPLY_PATHING:
            this.supplyChest = null;
            this.state = AutoWarden.FarmState.SUPPLY_PATHING;
            break;
         case WAREHOUSE_PATHING:
         case WAREHOUSE_OPEN:
            this.targetChest = null;
            this.state = AutoWarden.FarmState.WAREHOUSE_FIND_CHEST;
            break;
         default:
            this.targetChest = null;
            this.targetFoundOpenTime = -1L;
            this.scannedChestOpenTime = -1L;
            this.state = AutoWarden.FarmState.SCAN_FIND_HOLOGRAM;
      }

      this.stateTimer.method3358();
   }

   private boolean method89(IBaritone var1) {
      if (this.method91() && mc.player != null && mc.world != null && mc.interactionManager != null && mc.currentScreen == null && !mc.player.isUsingItem()) {
         BlockPos var2 = this.method92();
         if (var2 == null) {
            this.breakingCandle = null;
            return false;
         } else {
            this.method128();
            this.method218();
            if (var1 != null) {
               var1.getPathingBehavior().cancelEverything();
            }

            this.method90(var2);
            return true;
         }
      } else {
         return false;
      }
   }

   private void method90(BlockPos var1) {
      Direction var2 = Direction.UP;
      BlockHitResult var3 = new BlockHitResult(var1.toCenterPos(), var2, var1, false);
      this.method130(var1);
      mc.crosshairTarget = var3;
      if (this.breakingCandle == null || !this.breakingCandle.equals(var1) || this.candleBreakTimer.method3356(120.0)) {
         mc.interactionManager.attackBlock(var1, var2);
         this.breakingCandle = var1.toImmutable();
         this.candleBreakTimer.method3358();
      }

      mc.interactionManager.updateBlockBreakingProgress(var1, var2);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private boolean method91() {
      return switch (this.state) {
         case SCAN_PATHING, RUSH_PATH, WAIT_OPEN, AFTER_LOOT_RETREAT, SUPPLY_PATHING, SUPPLY_OPEN, WAREHOUSE_PATHING, WAREHOUSE_OPEN -> true;
         default -> false;
      };
   }

   private BlockPos method92() {
      BlockPos var1 = mc.player.getBlockPos();
      if (this.method93(var1)) {
         return var1.toImmutable();
      } else {
         BlockPos var2 = var1.down();
         return this.method93(var2) ? var2.toImmutable() : null;
      }
   }

   private boolean method93(BlockPos var1) {
      if (mc.world != null && var1 != null) {
         Block var2 = mc.world.getBlockState(var1).getBlock();
         return var2 instanceof CandleBlock || var2.getTranslationKey().contains("candle");
      } else {
         return false;
      }
   }

   private void method94() {
      try {
         if (this.previousBaritoneFreeLook == null) {
            this.previousBaritoneFreeLook = (Boolean)BaritoneAPI.getSettings().freeLook.value;
            this.previousBaritoneRightClickContainerOnArrival = (Boolean)BaritoneAPI.getSettings().rightClickContainerOnArrival.value;
         }

         BaritoneAPI.getSettings().freeLook.value = false;
         BaritoneAPI.getSettings().rightClickContainerOnArrival.value = false;
      } catch (Throwable var2) {
      }
   }

   private void method95() {
      try {
         if (this.previousBaritoneFreeLook != null) {
            BaritoneAPI.getSettings().freeLook.value = this.previousBaritoneFreeLook;
            BaritoneAPI.getSettings().rightClickContainerOnArrival.value = this.previousBaritoneRightClickContainerOnArrival;
         }
      } catch (Throwable var2) {
      }

      this.previousBaritoneFreeLook = null;
      this.previousBaritoneRightClickContainerOnArrival = null;
   }

   private BlockPos method96() {
      this.scannedChestOpenTime = -1L;
      if (mc.player != null && mc.world != null) {
         long var1 = System.currentTimeMillis();
         Vec3d var3 = mc.player.getPos();
         ArrayList<ChestTimerCandidate> var4 = new ArrayList<>();
         Box var5 = mc.player.getBoundingBox().expand(150.0);
         Iterator var6 = mc.world.getEntitiesByClass(Entity.class, var5, this::method111).iterator();

         while (true) {
            Entity var7;
            long var9;
            BlockPos var12;
            while (true) {
               if (!var6.hasNext()) {
                  AutoWarden.ChestTimerCandidate var21 = null;

                  for (AutoWarden.ChestTimerCandidate var23 : var4) {
                     boolean var24 = this.method103(var23.openTime);
                     boolean var10 = var21 != null && this.method103(var21.openTime);
                     if (var21 == null) {
                        var21 = var23;
                     } else if (var24 && !var10) {
                        var21 = var23;
                     } else if (var24 && var10) {
                        if (var23.openTime < var21.openTime || var23.openTime == var21.openTime && var23.distance < var21.distance) {
                           var21 = var23;
                        }
                     } else if (!var10 && var23.distance < var21.distance) {
                        var21 = var23;
                     }
                  }

                  if (var21 == null) {
                     return null;
                  }

                  this.scannedChestOpenTime = var21.openTime;
                  return var21.pos;
               }

               var7 = (Entity)var6.next();
               String var8 = this.method214(var7);
               var9 = this.method215(var8);
               if (var9 >= 0L) {
                  BlockPos var11 = var7.getBlockPos();
                  var12 = var11.down();
                  if (!mc.world.isChunkLoaded(var11.getX() >> 4, var11.getZ() >> 4)) {
                     break;
                  }

                  BlockPos var13 = null;

                  for (int var14 = 1; var14 <= 3; var14++) {
                     BlockPos var15 = var11.down(var14);
                     Block var16 = mc.world.getBlockState(var15).getBlock();
                     if (var16 == Blocks.CHEST || var16 == Blocks.TRAPPED_CHEST) {
                        var13 = var15.toImmutable();
                        break;
                     }
                  }

                  if (var13 != null) {
                     var12 = var13;
                     break;
                  }
               }
            }

            Long var25 = this.ignoredChests.get(var12);
            if (var25 == null || var25 <= var1) {
               long var26 = var1 + var9 * 1000L + 0L;
               double var27 = var7.squaredDistanceTo(var3);
               AutoWarden.ChestTimerCandidate var18 = null;

               for (AutoWarden.ChestTimerCandidate var20 : var4) {
                  if (var20.pos.equals(var12)) {
                     var18 = var20;
                     break;
                  }
               }

               if (var18 == null) {
                  var4.add(new AutoWarden.ChestTimerCandidate(var12.toImmutable(), var26, var27));
               } else {
                  var18.openTime = Math.max(var18.openTime, var26);
                  var18.distance = Math.min(var18.distance, var27);
               }
            }
         }
      } else {
         return null;
      }
   }

   private BlockPos method97() {
      if (mc.player != null && mc.world != null) {
         long var1 = System.currentTimeMillis();
         BlockPos var3 = mc.player.getBlockPos();
         BlockPos var4 = null;
         double var5 = Double.MAX_VALUE;
         byte var7 = 8;
         byte var8 = 48;
         double var9 = 22500.0;
         int var11 = var3.getX() >> 4;
         int var12 = var3.getZ() >> 4;

         for (int var13 = -var7; var13 <= var7; var13++) {
            for (int var14 = -var7; var14 <= var7; var14++) {
               int var15 = var11 + var13;
               int var16 = var12 + var14;
               if (mc.world.getChunkManager().isChunkLoaded(var15, var16)) {
                  WorldChunk var17 = mc.world.getChunkManager().getWorldChunk(var15, var16);
                  if (var17 != null) {
                     for (BlockPos var19 : var17.getBlockEntities().keySet()) {
                        BlockPos var20 = var19.toImmutable();
                        if (Math.abs(var20.getY() - var3.getY()) <= var8 && this.method105(var20)) {
                           Long var21 = this.ignoredChests.get(var20);
                           if (var21 == null || var21 <= var1) {
                              double var22 = var3.getSquaredDistance(var20);
                              if (!(var22 > var9) && var22 < var5) {
                                 var5 = var22;
                                 var4 = var20;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         BlockPos var24 = this.method98(var3, var1);
         return this.method99(var4, var24);
      } else {
         return null;
      }
   }

   private BlockPos method98(BlockPos var1, long var2) {
      if (mc.player != null && mc.world != null && var1 != null) {
         BlockPos var4 = null;
         double var5 = Double.MAX_VALUE;
         byte var7 = 24;
         byte var8 = 16;

         for (BlockPos var10 : BlockPos.iterate(var1.add(-var7, -var8, -var7), var1.add(var7, var8, var7))) {
            BlockPos var11 = var10.toImmutable();
            if (this.method105(var11)) {
               Long var12 = this.ignoredChests.get(var11);
               if (var12 == null || var12 <= var2) {
                  double var13 = var1.getSquaredDistance(var11);
                  if (var13 < var5) {
                     var5 = var13;
                     var4 = var11;
                  }
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private BlockPos method99(BlockPos var1, BlockPos var2) {
      if (mc.player == null) {
         return var1 != null ? var1 : var2;
      } else if (var1 == null) {
         return var2;
      } else if (var2 == null) {
         return var1;
      } else {
         BlockPos var3 = mc.player.getBlockPos();
         return var3.getSquaredDistance(var1) <= var3.getSquaredDistance(var2) ? var1 : var2;
      }
   }

   private void method100(BlockPos var1) {
      if (var1 != null) {
         this.lastKnownLootChest = var1.toImmutable();
         this.lastKnownLootChestAt = System.currentTimeMillis();
      }
   }

   private BlockPos method101() {
      if (this.lastKnownLootChest != null && this.lastKnownLootChestAt > 0L) {
         return System.currentTimeMillis() - this.lastKnownLootChestAt > 300000L ? null : this.lastKnownLootChest;
      } else {
         return null;
      }
   }

   private boolean method102(BlockPos var1, long var2) {
      return false;
   }

   private boolean method103(long var1) {
      if (var1 == -1L) {
         return false;
      } else {
         long var3 = var1 - System.currentTimeMillis();
         return var3 > 0L && var3 <= this.method208();
      }
   }

   private boolean method104(long var1) {
      if (var1 == -1L) {
         return false;
      } else {
         long var3 = var1 - System.currentTimeMillis();
         return var3 <= this.method208() && var3 > -10000L;
      }
   }

   private boolean method105(BlockPos var1) {
      if (mc.world != null && var1 != null) {
         Block var2 = mc.world.getBlockState(var1).getBlock();
         return var2 == Blocks.CHEST || var2 == Blocks.TRAPPED_CHEST || var2 == Blocks.ENDER_CHEST || var2 == Blocks.BARREL;
      } else {
         return false;
      }
   }

   private BlockPos method106() {
      if (this.targetChest != null && this.method105(this.targetChest)) {
         this.method100(this.targetChest);
         return this.targetChest;
      } else if (this.timedChestsOnly.method2200()) {
         return null;
      } else {
         BlockPos var1 = this.method108();
         if (var1 != null) {
            this.targetChest = var1.toImmutable();
            this.method100(this.targetChest);
            return this.targetChest;
         } else {
            return null;
         }
      }
   }

   private BlockPos method107() {
      if (this.supplyChest != null && this.method105(this.supplyChest)) {
         return this.supplyChest;
      } else {
         BlockPos var1 = this.method160();
         if (var1 != null) {
            this.supplyChest = var1.toImmutable();
            return this.supplyChest;
         } else {
            return null;
         }
      }
   }

   private BlockPos method108() {
      if (mc.player != null && mc.world != null) {
         long var1 = System.currentTimeMillis();
         BlockPos var3 = mc.player.getBlockPos();
         BlockPos var4 = null;
         double var5 = Double.MAX_VALUE;

         for (BlockPos var8 : BlockPos.iterate(var3.add(-8, -5, -8), var3.add(8, 5, 8))) {
            BlockPos var9 = var8.toImmutable();
            if (this.method105(var9) && this.method109(var9)) {
               Long var10 = this.ignoredChests.get(var9);
               if (var10 == null || var10 <= var1) {
                  double var11 = this.targetChest != null ? this.targetChest.getSquaredDistance(var9) * 10.0 : 0.0;
                  double var13 = mc.player.getEyePos().squaredDistanceTo(var9.toCenterPos());
                  double var15 = var11 + var13;
                  if (var15 < var5) {
                     var5 = var15;
                     var4 = var9;
                  }
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private boolean method109(BlockPos var1) {
      return mc.player != null && var1 != null && mc.player.getEyePos().squaredDistanceTo(var1.toCenterPos()) <= 9.0;
   }

   private long method110(BlockPos var1) {
      if (mc.player != null && mc.world != null && var1 != null) {
         Box var2 = new Box(var1.getX() - 2.0, var1.getY(), var1.getZ() - 2.0, var1.getX() + 3.0, var1.getY() + 7.0, var1.getZ() + 3.0);
         Vec3d var3 = var1.toCenterPos();
         double var4 = Double.MAX_VALUE;
         long var6 = -1L;

         for (Entity var9 : mc.world.getEntitiesByClass(Entity.class, var2, this::method111)) {
            if (!(var9.getY() + 0.25 < var1.getY())) {
               double var10 = var9.getX() - var3.x;
               double var12 = var9.getZ() - var3.z;
               double var14 = var10 * var10 + var12 * var12;
               if (!(var14 > 4.0)) {
                  long var16 = this.method215(this.method214(var9));
                  if (var16 >= 0L) {
                     if (var6 == -1L || var14 + 0.25 < var4) {
                        var4 = var14;
                        var6 = var16;
                     } else if (Math.abs(var14 - var4) <= 0.25 && var16 > var6) {
                        var6 = var16;
                     }
                  }
               }
            }
         }

         return var6;
      } else {
         return -1L;
      }
   }

   private boolean method111(Entity var1) {
      return var1 instanceof ArmorStandEntity var2 && var2.hasCustomName() || var1 instanceof TextDisplayEntity;
   }

   private boolean method112(String var1) {
      return var1.contains(":") || var1.contains("мин") || var1.contains("сек") || var1.contains("min") || var1.contains("sec");
   }

   private boolean method113() {
      return this.isEnabled() && mc.player != null && mc.world != null && mc.inGameHud != null && this.method114();
   }

   private boolean method114() {
      for (ClientBossBar var2 : mc.inGameHud.getBossBarHud().bossBars.values()) {
         String var3 = this.method115(var2.getName().getString());
         if (var3.contains("pvp") || var3.contains("пвп")) {
            return true;
         }
      }

      return false;
   }

   private String method115(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT);
   }

   private boolean method116() {
      return mc.currentScreen instanceof GenericContainerScreen && mc.player != null && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler;
   }

   private boolean method117(BlockPos var1) {
      if (!this.method116() || mc.player == null || var1 == null || this.pendingOpenedChest == null) {
         return false;
      } else if (!this.pendingOpenedChest.equals(var1)) {
         return false;
      } else {
         return this.openAttemptStartedAt <= 0L || System.currentTimeMillis() - this.openAttemptStartedAt > 5000L ? false : this.method109(var1);
      }
   }

   private boolean method118(BlockPos var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         this.method129();
         this.method218();
         this.method127();
         if (!this.method124(var2)) {
            return false;
         } else {
            this.method130(var1);
            return true;
         }
      }
   }

   private boolean method119(BlockPos var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (!this.method120(var1)) {
         return false;
      } else if (!this.method118(var1, var2)) {
         return false;
      } else {
         long var3 = System.currentTimeMillis();
         this.method122(var1, var3);
         this.method123(var1);
         this.lastOpenAttemptChest = var1.toImmutable();
         this.lastOpenAttemptAt = var3;
         return true;
      }
   }

   private boolean method120(BlockPos var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.lastOpenAttemptChest != null && this.lastOpenAttemptChest.equals(var1)
            ? System.currentTimeMillis() - this.lastOpenAttemptAt >= this.method206()
            : true;
      }
   }

   private void method121() {
      this.lastOpenAttemptChest = null;
      this.lastOpenAttemptAt = -1L;
      this.pendingOpenedChest = null;
      this.openAttemptSyncId = -1;
      this.openAttemptStartedAt = -1L;
   }

   private void method122(BlockPos var1, long var2) {
      this.pendingOpenedChest = var1.toImmutable();
      this.openAttemptSyncId = mc.player != null ? mc.player.currentScreenHandler.syncId : -1;
      this.openAttemptStartedAt = var2;
   }

   private void method123(BlockPos var1) {
      if (mc.player != null && mc.interactionManager != null && var1 != null) {
         this.method130(var1);
         BlockHitResult var2 = this.method131(var1);
         mc.crosshairTarget = var2;
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var2);
         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private boolean method124(boolean var1) {
      if (mc.player != null && mc.interactionManager != null) {
         int var2 = mc.player.getInventory().selectedSlot;
         ItemStack var3 = mc.player.getInventory().getStack(var2);
         if (var3.isEmpty()) {
            return true;
         } else if (var1) {
            return this.method125(var2);
         } else {
            int var4 = this.findEmptyHotbarSlot();
            if (var4 != -1) {
               this.method140(var4);
               return false;
            } else {
               int var5 = this.method139();
               if (var5 == -1) {
                  return true;
               } else {
                  int var6 = 36 + var2;
                  mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var6, 0, SlotActionType.PICKUP, mc.player);
                  mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var5, 0, SlotActionType.PICKUP, mc.player);
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   private boolean method125(int var1) {
      if (mc.player != null && mc.interactionManager != null && var1 >= 0 && var1 <= 8) {
         int var2 = this.method139();
         if (var2 == -1) {
            int var3 = this.findEmptyHotbarSlot();
            if (var3 != -1) {
               this.method140(var3);
            }

            return false;
         } else {
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, 36 + var1, 0, SlotActionType.PICKUP, mc.player);
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var2, 0, SlotActionType.PICKUP, mc.player);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method126() {
      if (mc.player == null || mc.interactionManager == null || mc.currentScreen != null || mc.player.isUsingItem()) {
         return false;
      } else if (!this.autoEatingFood && !this.autoDrinkingInvisibility) {
         int var1 = mc.player.getInventory().selectedSlot;
         ItemStack var2 = mc.player.getInventory().getStack(var1);
         if (var2.isEmpty()) {
            return false;
         } else {
            int var3 = this.method139();
            if (var3 == -1) {
               return false;
            } else {
               int var4 = 36 + var1;
               mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var4, 0, SlotActionType.PICKUP, mc.player);
               mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var3, 0, SlotActionType.PICKUP, mc.player);
               if (!mc.player.currentScreenHandler.getCursorStack().isEmpty()) {
                  mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var4, 0, SlotActionType.PICKUP, mc.player);
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   private void method127() {
      if (mc.player != null && mc.player.networkHandler != null) {
         if (mc.options != null) {
            mc.options.sneakKey.setPressed(false);
         }

         if (mc.player.isSneaking()) {
            mc.player.setSneaking(false);
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.RELEASE_SHIFT_KEY));
         }
      }
   }

   private void method128() {
      if (mc.options != null && !this.autoEatingFood && !this.autoDrinkingInvisibility) {
         mc.options.useKey.setPressed(false);
      }
   }

   private void method129() {
      if (mc.options != null) {
         mc.options.useKey.setPressed(false);
      }
   }

   private void method130(BlockPos var1) {
      if (mc.player != null && var1 != null) {
         Vec3d var2 = Vec3d.ofCenter(var1);
         double var3 = var2.x - mc.player.getX();
         double var5 = var2.y - (mc.player.getY() + mc.player.getEyeHeight(mc.player.getPose()));
         double var7 = var2.z - mc.player.getZ();
         mc.player.setYaw((float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F);
         mc.player.setPitch((float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)))));
      }
   }

   private BlockHitResult method131(BlockPos var1) {
      return new BlockHitResult(Vec3d.ofCenter(var1), Direction.UP, var1, false);
   }

   private boolean method132(int var1) {
      if (!this.method133(var1) || mc.currentScreen != null) {
         this.method141();
         this.method142();
         return false;
      } else if (this.autoDrinkingInvisibility) {
         return this.method135();
      } else if (this.autoEatingFood) {
         return this.method137();
      } else if (mc.player.isUsingItem()) {
         return true;
      } else {
         return this.method134() && this.method135() ? true : mc.player.getHungerManager().isNotFull() && this.method137();
      }
   }

   private boolean method133(int var1) {
      if (this.autoSupplies.method2200() && !this.initialSupplyPending && var1 > 0) {
         return switch (this.state) {
            case ARENA_SET_HOME, ARENA_OPEN, ARENA_WAIT_RETURN, ARENA_RETURN, ARENA_RETURN_WAIT, SUPPLY_WAIT_JOIN, SUPPLY_PATHING, SUPPLY_OPEN, SUPPLY_TAKE, CLAN_STORAGE_OPEN, CLAN_STORAGE_DEPOSIT, CLAN_STORAGE_WITHDRAW_OPEN, CLAN_STORAGE_WITHDRAW, GO_WAREHOUSE, RETURN_FARM_HOME, WAREHOUSE_WAIT_JOIN, WAREHOUSE_FIND_CHEST, WAREHOUSE_PATHING, WAREHOUSE_OPEN, DEPOSITING -> false;
            default -> true;
         };
      } else {
         return false;
      }
   }

   private boolean method134() {
      StatusEffectInstance var1 = mc.player.getStatusEffect(StatusEffects.INVISIBILITY);
      return var1 == null || !var1.isInfinite() && var1.getDuration() <= 200;
   }

   private boolean method135() {
      if (mc.player == null || mc.interactionManager == null || mc.currentScreen != null) {
         this.method142();
         return false;
      } else if (!this.method134()) {
         this.method142();
         return false;
      } else if (!this.autoDrinkingInvisibility && !this.method136()) {
         return false;
      } else if (this.invisibilityHotbarSlot >= 0
         && this.invisibilityHotbarSlot <= 8
         && this.method175(mc.player.getInventory().getStack(this.invisibilityHotbarSlot))) {
         this.method140(this.invisibilityHotbarSlot);
         this.method218();
         if (this.invisibilityUseDelayTicks > 0) {
            this.invisibilityUseDelayTicks--;
            return true;
         } else {
            if (mc.options != null) {
               mc.options.useKey.setPressed(true);
            }

            if (!mc.player.isUsingItem()) {
               mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            }

            if (this.invisibilityUseTimer.method3356(7000.0)) {
               this.method142();
               return false;
            } else {
               return true;
            }
         }
      } else {
         this.method142();
         return false;
      }
   }

   private boolean method136() {
      int var1 = this.findHotbarSlot(this::method175);
      this.previousInvisibilitySlot = mc.player.getInventory().selectedSlot;
      if (var1 != -1) {
         this.invisibilityHotbarSlot = var1;
         this.autoDrinkingInvisibility = true;
         this.invisibilityUseDelayTicks = 1;
         this.invisibilityUseTimer.method3358();
         return true;
      } else {
         Slot var2 = Helper66.method707(var1x -> this.method175(var1x.getStack()));
         if (var2 == null) {
            this.method143();
            return false;
         } else {
            this.invisibilityHotbarSlot = this.findEmptyHotbarSlot();
            if (this.invisibilityHotbarSlot == -1) {
               this.invisibilityHotbarSlot = this.previousInvisibilitySlot;
            }

            this.method140(this.invisibilityHotbarSlot);
            Helper66.method691(var2, Hand.MAIN_HAND, false, true);
            this.autoDrinkingInvisibility = true;
            this.invisibilityUseDelayTicks = 2;
            this.invisibilityUseTimer.method3358();
            return true;
         }
      }
   }

   private boolean method137() {
      if (mc.player == null || mc.interactionManager == null || mc.currentScreen != null) {
         this.method141();
         return false;
      } else if (!mc.player.getHungerManager().isNotFull()) {
         this.method141();
         return false;
      } else if (!this.autoEatingFood && !this.method138()) {
         return false;
      } else if (this.foodHotbarSlot >= 0 && this.foodHotbarSlot <= 8 && this.method176(mc.player.getInventory().getStack(this.foodHotbarSlot))) {
         this.method140(this.foodHotbarSlot);
         this.method218();
         if (this.foodUseDelayTicks > 0) {
            this.foodUseDelayTicks--;
            return true;
         } else {
            if (mc.options != null) {
               mc.options.useKey.setPressed(true);
            }

            if (!mc.player.isUsingItem()) {
               mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            }

            if (this.foodUseTimer.method3356(7000.0)) {
               this.method141();
               return false;
            } else {
               return true;
            }
         }
      } else {
         this.method141();
         return false;
      }
   }

   private boolean method138() {
      int var1 = this.findHotbarSlot(this::method176);
      this.previousFoodSlot = mc.player.getInventory().selectedSlot;
      if (var1 != -1) {
         this.foodHotbarSlot = var1;
         this.autoEatingFood = true;
         this.foodUseDelayTicks = 1;
         this.foodUseTimer.method3358();
         return true;
      } else {
         Slot var2 = Helper66.method710();
         if (var2 != null && this.method176(var2.getStack())) {
            this.foodHotbarSlot = this.findEmptyHotbarSlot();
            if (this.foodHotbarSlot == -1) {
               this.foodHotbarSlot = this.previousFoodSlot;
            }

            this.method140(this.foodHotbarSlot);
            Helper66.method691(var2, Hand.MAIN_HAND, false, true);
            this.autoEatingFood = true;
            this.foodUseDelayTicks = 2;
            this.foodUseTimer.method3358();
            return true;
         } else {
            this.method144();
            return false;
         }
      }
   }

   private int findHotbarSlot(Predicate<ItemStack> var1) {
      if (mc.player == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (var1.test(mc.player.getInventory().getStack(var2))) {
               return var2;
            }
         }

         return -1;
      }
   }

   private int findEmptyHotbarSlot() {
      return this.findHotbarSlot(ItemStack::isEmpty);
   }

   private int method139() {
      if (mc.player == null) {
         return -1;
      } else {
         for (int var1 = 9; var1 < 36; var1++) {
            if (mc.player.getInventory().getStack(var1).isEmpty()) {
               return var1;
            }
         }

         return -1;
      }
   }

   private void method140(int var1) {
      if (mc.player != null && mc.player.networkHandler != null && var1 >= 0 && var1 <= 8) {
         if (mc.player.getInventory().selectedSlot != var1) {
            mc.player.getInventory().selectedSlot = var1;
            mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(var1));
         }
      }
   }

   private void method141() {
      if (!this.autoEatingFood) {
         this.method144();
      } else {
         if (mc.options != null) {
            mc.options.useKey.setPressed(false);
         }

         if (this.previousFoodSlot != -1) {
            this.method140(this.previousFoodSlot);
         }

         this.method144();
      }
   }

   private void method142() {
      if (!this.autoDrinkingInvisibility) {
         this.method143();
      } else {
         if (mc.options != null) {
            mc.options.useKey.setPressed(false);
         }

         if (this.previousInvisibilitySlot != -1) {
            this.method140(this.previousInvisibilitySlot);
         }

         this.method143();
      }
   }

   private void method143() {
      this.autoDrinkingInvisibility = false;
      this.previousInvisibilitySlot = -1;
      this.invisibilityHotbarSlot = -1;
      this.invisibilityUseDelayTicks = 0;
      this.invisibilityUseTimer.method3358();
   }

   private void method144() {
      this.autoEatingFood = false;
      this.previousFoodSlot = -1;
      this.foodHotbarSlot = -1;
      this.foodUseDelayTicks = 0;
      this.foodUseTimer.method3358();
   }

   private boolean method145(AutoWarden.FarmState var1, int var2, boolean var3) {
      if (!this.autoSupplies.method2200() || !var3 && !this.method149() || mc.currentScreen != null) {
         return false;
      } else if (this.method223().isBlank()) {
         return false;
      } else {
         long var4 = System.currentTimeMillis();
         if (!var3 && var4 < this.supplyRetryAfter) {
            return false;
         } else {
            BlockPos var6 = this.method160();
            this.supplyChest = var6;
            this.supplyReturnState = var1;
            this.supplyStartedAt = var4;
            this.aimedSupplyChest = false;
            this.supplyTookInvisibility = this.method172();
            this.supplyTookFood = false;
            this.supplyHomeCommandSent = false;
            if (this.supplyChest == null) {
               this.state = AutoWarden.FarmState.SUPPLY_WAIT_JOIN;
            } else {
               this.state = this.method109(this.supplyChest) ? AutoWarden.FarmState.SUPPLY_OPEN : AutoWarden.FarmState.SUPPLY_PATHING;
            }

            this.stateTimer.method3358();
            return true;
         }
      }
   }

   private void method146() {
      this.forceSupplyPending = this.autoSupplies.method2200();
      this.initialSupplyPending = this.autoSupplies.method2200();
      String var1 = this.method223();
      if (this.autoSupplies.method2200() && !var1.isBlank()) {
         if (mc.player != null && mc.currentScreen != null) {
            mc.player.closeHandledScreen();
         }

         this.supplyChest = null;
         this.supplyReturnState = AutoWarden.FarmState.RETURN_FARM_HOME;
         this.supplyStartedAt = System.currentTimeMillis();
         this.aimedSupplyChest = false;
         this.supplyTookInvisibility = this.method172();
         this.supplyTookFood = false;
         this.method216(var1);
         this.supplyHomeCommandSent = true;
         this.state = AutoWarden.FarmState.SUPPLY_WAIT_JOIN;
         this.stateTimer.method3358();
      } else {
         this.method216(this.method222());
      }
   }

   private boolean method147() {
      return switch (this.state) {
         case SUPPLY_WAIT_JOIN, SUPPLY_PATHING, SUPPLY_OPEN, SUPPLY_TAKE, RETURN_FARM_HOME -> true;
         default -> false;
      };
   }

   private boolean method148(IBaritone var1) {
      if (!this.method229()) {
         return false;
      } else {
         long var2 = System.currentTimeMillis();
         if (this.pausedByHomeTeleport && var2 < this.homeTeleportPauseUntil) {
            return true;
         } else {
            String var4 = this.method223();
            if (var4.isBlank()) {
               var4 = "clan home " + this.House.method2403();
            }

            this.method216(var4);
            this.method141();
            this.method142();
            if (var1 != null) {
               var1.getPathingBehavior().cancelEverything();
            }

            this.method218();
            if (mc.currentScreen != null) {
               mc.player.closeHandledScreen();
            }

            this.pausedByHomeTeleport = true;
            this.homeTeleportPauseUntil = var2 + 5000L;
            this.stateTimer.method3358();
            return true;
         }
      }
   }

   private boolean method149() {
      return this.method171() < 1 || this.method173() < 8;
   }

   private boolean method150() {
      return this.supplyStartedAt > 0L && System.currentTimeMillis() - this.supplyStartedAt > 45000L;
   }

   private void method151(boolean var1) {
      this.method128();
      this.method82();
      if (mc.player != null && mc.currentScreen != null) {
         mc.player.closeHandledScreen();
      }

      this.supplyChest = null;
      this.supplyStartedAt = -1L;
      this.aimedSupplyChest = false;
      this.supplyTookInvisibility = false;
      this.supplyTookFood = false;
      this.supplyHomeCommandSent = false;
      if (!var1 && this.initialSupplyPending) {
         if (this.forceSupplyPending) {
            this.state = AutoWarden.FarmState.IDLE;
            this.stateTimer.method3358();
         } else {
            this.state = AutoWarden.FarmState.IDLE;
            this.stateTimer.method3358();
         }
      } else if (var1) {
         this.initialSupplyPending = false;
         this.forceSupplyPending = false;
         this.method219();
      } else {
         this.state = this.supplyReturnState == null ? AutoWarden.FarmState.RUSH_JOIN : this.supplyReturnState;
         if (this.state == AutoWarden.FarmState.HUB_WAITING) {
            this.returnCommandSent = false;
            this.method217();
         }

         this.stateTimer.method3358();
      }
   }

   private void method152(GenericContainerScreenHandler var1) {
      int var2 = var1.getRows() * 9;
      if (!this.supplyTookInvisibility) {
         int var3 = this.method154(var1, var2, this::method175);
         this.supplyTookInvisibility = true;
         if (var3 != -1) {
            if (!this.method155(var1, var3, var2)) {
               return;
            }

            return;
         }
      }

      if (!this.supplyTookFood) {
         int var4 = this.method154(var1, var2, this::method176);
         this.supplyTookFood = true;
         if (var4 != -1) {
            if (!this.method157(var1, var4, var2, 4)) {
               return;
            }

            return;
         }
      }

      Helper66.method701(false);
      this.method151(true);
   }

   private boolean method153(GenericContainerScreenHandler var1) {
      int var2 = var1.getRows() * 9;

      for (int var3 = 0; var3 < var2; var3++) {
         ItemStack var4 = var1.getSlot(var3).getStack();
         if (!var4.isEmpty() && var4.isOf(Items.PUFFERFISH)) {
            mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var3).id, 0, SlotActionType.PICKUP, mc.player);
            return true;
         }
      }

      return false;
   }

   private int method154(GenericContainerScreenHandler var1, int var2, Predicate<ItemStack> var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         ItemStack var5 = var1.getSlot(var4).getStack();
         if (!var5.isEmpty() && var3.test(var5)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean method155(GenericContainerScreenHandler var1, int var2, int var3) {
      ItemStack var4 = var1.getSlot(var2).getStack();
      int var5 = this.method156(var1, var3, var4);
      if (var5 == -1) {
         this.supplyRetryAfter = System.currentTimeMillis() + 15000L;
         Helper66.method701(false);
         this.method151(false);
         return false;
      } else {
         mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var2).id, 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var5).id, 1, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var2).id, 0, SlotActionType.PICKUP, mc.player);
         return true;
      }
   }

   private int method156(GenericContainerScreenHandler var1, int var2, ItemStack var3) {
      if (var3 != null && !var3.isEmpty()) {
         for (int var4 = var2; var4 < var1.slots.size(); var4++) {
            ItemStack var5 = var1.getSlot(var4).getStack();
            if (!var5.isEmpty() && ItemStack.areItemsAndComponentsEqual(var5, var3) && var5.getCount() < var5.getMaxCount()) {
               return var4;
            }
         }

         for (int var6 = var2; var6 < var1.slots.size(); var6++) {
            if (!var1.getSlot(var6).hasStack()) {
               return var6;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean method157(GenericContainerScreenHandler var1, int var2, int var3, int var4) {
      ItemStack var5 = var1.getSlot(var2).getStack();
      int var6 = Math.min(var4, var5.getCount());
      int var7 = this.method158(var1, var3, var5, var6);
      if (var6 > 0 && var7 != -1) {
         mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var2).id, 0, SlotActionType.PICKUP, mc.player);

         for (int var8 = 0; var8 < var6; var8++) {
            mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var7).id, 1, SlotActionType.PICKUP, mc.player);
         }

         mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var2).id, 0, SlotActionType.PICKUP, mc.player);
         return true;
      } else {
         this.supplyRetryAfter = System.currentTimeMillis() + 15000L;
         Helper66.method701(false);
         this.method151(false);
         return false;
      }
   }

   private int method158(GenericContainerScreenHandler var1, int var2, ItemStack var3, int var4) {
      if (var3 != null && !var3.isEmpty() && var4 > 0) {
         for (int var5 = var2; var5 < var1.slots.size(); var5++) {
            ItemStack var6 = var1.getSlot(var5).getStack();
            if (!var6.isEmpty() && ItemStack.areItemsAndComponentsEqual(var6, var3) && var6.getMaxCount() - var6.getCount() >= var4) {
               return var5;
            }
         }

         for (int var7 = var2; var7 < var1.slots.size(); var7++) {
            if (!var1.getSlot(var7).hasStack()) {
               return var7;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean method159(GenericContainerScreenHandler var1, int var2) {
      ItemStack var3 = var1.getSlot(var2).getStack();
      if (!this.method178(var3)) {
         this.supplyRetryAfter = System.currentTimeMillis() + 15000L;
         Helper66.method701(false);
         this.method151(false);
         return false;
      } else {
         mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var2).id, 0, SlotActionType.QUICK_MOVE, mc.player);
         return true;
      }
   }

   private BlockPos method160() {
      if (mc.player != null && mc.world != null) {
         BlockPos var1 = mc.player.getBlockPos();
         BlockPos var2 = null;
         double var3 = Double.MAX_VALUE;

         for (BlockPos var6 : BlockPos.iterate(var1.add(-32, -1, -32), var1.add(32, 1, 32))) {
            if (this.method105(var6) && this.method162(var6)) {
               double var7 = var1.getSquaredDistance(var6);
               if (var7 < var3) {
                  var3 = var7;
                  var2 = var6.toImmutable();
               }
            }
         }

         return var2 != null ? var2 : this.method161();
      } else {
         return null;
      }
   }

   private BlockPos method161() {
      if (mc.world != null && mc.crosshairTarget instanceof BlockHitResult var1) {
         BlockPos var3 = var1.getBlockPos();
         return this.method105(var3) && !(mc.player.getEyePos().squaredDistanceTo(var3.toCenterPos()) > 36.0) ? var3.toImmutable() : null;
      } else {
         return null;
      }
   }

   private boolean method162(BlockPos var1) {
      if (mc.world == null) {
         return false;
      } else {
         for (BlockPos var3 : BlockPos.iterate(var1.add(-1, -1, -1), var1.add(1, 2, 1))) {
            if (mc.world.getBlockEntity(var3) instanceof SignBlockEntity var5 && this.method167(var5)) {
               return true;
            }
         }

         return false;
      }
   }

   private BlockPos method163() {
      BlockPos var1 = this.method164();
      if (var1 != null) {
         return var1;
      } else if (mc.player != null && mc.world != null) {
         BlockPos var2 = mc.player.getBlockPos();
         BlockPos var3 = null;
         double var4 = Double.MAX_VALUE;
         long var6 = System.currentTimeMillis();

         for (BlockPos var9 : BlockPos.iterate(var2.add(-32, -1, -32), var2.add(32, 1, 32))) {
            BlockPos var10 = var9.toImmutable();
            Long var11 = this.ignoredChests.get(var10);
            if ((var11 == null || var11 <= var6) && this.method165(var10)) {
               double var12 = var2.getSquaredDistance(var10);
               if (var12 < var4) {
                  var4 = var12;
                  var3 = var10;
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private BlockPos method164() {
      if (mc.world != null && mc.player != null && mc.crosshairTarget instanceof BlockHitResult var1) {
         BlockPos var3 = var1.getBlockPos();
         return this.method165(var3) && !(mc.player.getEyePos().squaredDistanceTo(var3.toCenterPos()) > 36.0) ? var3.toImmutable() : null;
      } else {
         return null;
      }
   }

   private boolean method165(BlockPos var1) {
      return this.method105(var1) && !this.method166(var1);
   }

   private boolean method166(BlockPos var1) {
      if (mc.world != null && var1 != null) {
         for (BlockPos var3 : BlockPos.iterate(var1.add(-1, -1, -1), var1.add(1, 2, 1))) {
            if (mc.world.getBlockEntity(var3) instanceof SignBlockEntity) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean method167(SignBlockEntity var1) {
      String var2 = this.method115(this.method168(var1.getFrontText()) + " " + this.method168(var1.getBackText()));

      for (String var4 : this.method169()) {
         if (!var4.isBlank() && var2.contains(this.method115(var4))) {
            return true;
         }
      }

      return false;
   }

   private String method168(SignText var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < 4; var3++) {
         var2.append(' ').append(var1.getMessage(var3, false).getString());
      }

      return var2.toString().replaceAll("§.", "");
   }

   private List<String> method169() {
      ArrayList var1 = new ArrayList();
      String var2 = this.supplySign.method2403();
      if (var2 != null) {
         for (String var6 : var2.split("[,;\\s]+")) {
            String var7 = this.method115(var6).trim();
            if (!var7.isBlank()) {
               var1.add(var7);
            }
         }
      }

      if (var1.isEmpty()) {
         var1.addAll(List.of(DEFAULT_SUPPLY_SIGN_KEYWORDS));
      }

      return var1;
   }

   private boolean method170() {
      return this.supplyChest != null && this.method109(this.supplyChest);
   }

   private int method171() {
      return this.method174(this::method175);
   }

   private boolean method172() {
      if (mc.player == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (this.method175(mc.player.getInventory().getStack(var1))) {
               return true;
            }
         }

         return false;
      }
   }

   private int method173() {
      return this.method174(this::method176);
   }

   private int method174(Predicate<ItemStack> var1) {
      if (mc.player == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < mc.player.getInventory().size(); var3++) {
            ItemStack var4 = mc.player.getInventory().getStack(var3);
            if (var1.test(var4)) {
               var2 += var4.getCount();
            }
         }

         return var2;
      }
   }

   private boolean method175(ItemStack var1) {
      if (var1 == null || var1.isEmpty()) {
         return false;
      } else if (!var1.isOf(Items.POTION)) {
         return false;
      } else {
         PotionContentsComponent var2 = var1.get(DataComponentTypes.POTION_CONTENTS);
         if (var2 != null) {
            for (StatusEffectInstance var4 : var2.getEffects()) {
               if (var4.getEffectType().equals(StatusEffects.INVISIBILITY)) {
                  return true;
               }
            }
         }

         String var5 = this.method191(var1.getName().getString());
         return var5.contains("инвиз") || var5.contains("невид") || var5.contains("invis");
      }
   }

   private boolean method176(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && var1.get(DataComponentTypes.FOOD) != null && !var1.get(DataComponentTypes.FOOD).canAlwaysEat();
   }

   private boolean method177(ItemStack var1) {
      return this.method175(var1) || this.method176(var1);
   }

   private boolean method178(ItemStack var1) {
      if (mc.player != null && var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < 36; var2++) {
            ItemStack var3 = mc.player.getInventory().getStack(var2);
            if (var3.isEmpty()) {
               return true;
            }

            if (ItemStack.areItemsAndComponentsEqual(var3, var1) && var3.getCount() < var3.getMaxCount()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void method179(GenericContainerScreenHandler var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < var1.getRows() * 9; var3++) {
         if (var1.getSlot(var3).hasStack() && this.method188(var1.getSlot(var3).getStack())) {
            Helper66.method703(var3, 0, SlotActionType.QUICK_MOVE, true);
            var2 = true;
         }
      }

      if (var2) {
         this.lootedCurrentChest = true;
         this.emptyLootChecks = 0;
         this.pendingDeposit = true;
         this.method180();
      }

      this.method186(var1);
   }

   private void method180() {
      BlockPos var1 = this.targetChest != null ? this.targetChest : this.lastKnownLootChest;
      if (var1 != null && mc.player != null && mc.world != null) {
         this.afterLootRetreatTarget = this.method181(var1);
         this.afterLootRetreatGoalStarted = false;
      }
   }

   private BlockPos method181(BlockPos var1) {
      Vec3d var2 = mc.player.getPos();
      Vec3d var3 = var1.toCenterPos();
      Vec3d var4 = new Vec3d(var2.x - var3.x, 0.0, var2.z - var3.z);
      if (var4.lengthSquared() < 0.01) {
         var4 = new Vec3d(1.0, 0.0, 0.0);
      }

      var4 = var4.normalize();
      BlockPos var5 = BlockPos.ofFloored(var2.add(var4.multiply(25.0)));
      BlockPos var6 = this.method182(var5);
      return var6 != null ? var6 : var5;
   }

   private BlockPos method182(BlockPos var1) {
      for (int var2 = 0; var2 <= 2; var2++) {
         for (BlockPos var4 : BlockPos.iterate(var1.add(-var2, -1, -var2), var1.add(var2, 1, var2))) {
            if (this.method183(var4)) {
               return var4.toImmutable();
            }
         }
      }

      return null;
   }

   private boolean method183(BlockPos var1) {
      return mc.world != null
         && mc.world.getBlockState(var1).isAir()
         && mc.world.getBlockState(var1.up()).isAir()
         && !mc.world.getBlockState(var1.down()).isAir();
   }

   private boolean method184() {
      return mc.player == null
         || this.afterLootRetreatTarget == null
         || mc.player.squaredDistanceTo(this.afterLootRetreatTarget.toCenterPos()) <= 2.25
         || this.targetChest != null && mc.player.squaredDistanceTo(this.targetChest.toCenterPos()) >= 16.0;
   }

   private void method185() {
      if (this.method113()) {
         this.state = AutoWarden.FarmState.AFTER_LOOT_PVP_WAIT;
         this.stateTimer.method3358();
      } else if (!this.autoDeposit.method2200() || !this.pendingDeposit && !this.method199()) {
         this.pendingDeposit = false;
         this.method212();
         this.scanIndex = 0;
         this.state = AutoWarden.FarmState.SCAN_NEXT;
         this.stateTimer.method3358();
      } else {
         this.stateTimer.method3358();
         this.state = AutoWarden.FarmState.CLAN_STORAGE_OPEN;
      }
   }

   private void method186(GenericContainerScreenHandler var1) {
      if (this.method187()) {
         this.emptyLootChecks = 0;
      } else if (this.lootContainerOpenedAt <= 0L || System.currentTimeMillis() - this.lootContainerOpenedAt >= 200L) {
         boolean var2 = false;

         for (int var3 = 0; var3 < var1.getRows() * 9; var3++) {
            if (var1.getSlot(var3).hasStack()) {
               var2 = true;
               if (this.method188(var1.getSlot(var3).getStack())) {
                  this.emptyLootChecks = 0;
                  return;
               }
            }
         }

         if (var2) {
            Helper66.method701(false);
         } else {
            this.emptyLootChecks++;
            if (this.emptyLootChecks >= 2) {
               Helper66.method701(false);
            }
         }
      }
   }

   private boolean method187() {
      return this.openingTimedChestImmediately && this.targetOpenTime > 0L && System.currentTimeMillis() < this.targetOpenTime + 3000L;
   }

   private boolean method188(ItemStack var1) {
      if (var1 == null || var1.isEmpty()) {
         return false;
      } else {
         return !this.autoLoot.method2200() ? false : this.method189(var1);
      }
   }

   private boolean method189(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         String var2 = this.method191(var1.getName().getString());
         String var3 = this.method191(Registries.ITEM.getId(var1.getItem()).toString());

         for (String var7 : STRICT_LOOT_ITEM_IDS) {
            if (var3.equals(this.method191(var7))) {
               return true;
            }
         }

         for (String var12 : LOOT_ITEMS) {
            String var8 = this.method191(var12);
            if (!var8.isEmpty() && !this.method190(var8) && var2.contains(var8)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean method190(String var1) {
      for (String var5 : STRICT_LOOT_ITEM_IDS) {
         if (var1.equals(this.method191(var5))) {
            return true;
         }
      }

      return false;
   }

   private String method191(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT).replace("minecraft:", "").replace('_', ' ').trim();
   }

   private void method192(GenericContainerScreenHandler var1) {
      int var2 = this.method195(var1);
      if (var2 < 0) {
         Helper66.method701(false);
      } else {
         for (int var3 = var2 + this.depositSlotIndex; var3 < var1.slots.size(); var3++) {
            ItemStack var4 = var1.getSlot(var3).getStack();
            if (!var4.isEmpty() && this.method198(var4)) {
               ItemStack var5 = var4.copy();
               mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var3).id, 0, SlotActionType.QUICK_MOVE, mc.player);
               ItemStack var6 = var1.getSlot(var3).getStack();
               if (!var6.isEmpty() && ItemStack.areItemsAndComponentsEqual(var6, var5) && var6.getCount() >= var5.getCount()) {
                  this.method193();
                  return;
               }

               this.depositSlotIndex = var3 - var2 + 1;
               return;
            }
         }

         this.depositSlotIndex = 0;
         Helper66.method701(false);
      }
   }

   private void method193() {
      this.depositSlotIndex = 0;
      this.pendingClanStorageWithdraw = true;
      this.warehouseHomeCommandSent = false;
      Helper66.method701(false);
      this.state = AutoWarden.FarmState.GO_WAREHOUSE;
      this.stateTimer.method3358();
   }

   private void method194(GenericContainerScreenHandler var1) {
      int var2 = var1.getRows() * 9;

      for (int var3 = this.depositSlotIndex; var3 < var2; var3++) {
         ItemStack var4 = var1.getSlot(var3).getStack();
         if (!var4.isEmpty() && this.method198(var4)) {
            if (!this.method178(var4)) {
               this.pendingClanStorageWithdraw = true;
               this.pendingDeposit = true;
               this.depositSlotIndex = 0;
               Helper66.method701(false);
               this.targetChest = null;
               this.state = AutoWarden.FarmState.WAREHOUSE_OPEN;
               this.stateTimer.method3358();
               return;
            }

            mc.interactionManager.clickSlot(var1.syncId, var1.getSlot(var3).id, 0, SlotActionType.QUICK_MOVE, mc.player);
            this.pendingDeposit = true;
            this.depositSlotIndex = var3 + 1;
            return;
         }
      }

      this.depositSlotIndex = 0;
      this.pendingClanStorageWithdraw = false;
      this.pendingDeposit = true;
      Helper66.method701(false);
      this.targetChest = null;
      this.state = AutoWarden.FarmState.WAREHOUSE_OPEN;
      this.stateTimer.method3358();
   }

   private int method195(GenericContainerScreenHandler var1) {
      int var2 = var1.slots.size() - 36;
      return var2 >= 0 ? var2 : -1;
   }

   private void method196() {
      this.pendingDeposit = false;
      this.pendingClanStorageWithdraw = false;
      this.warehouseHomeCommandSent = false;
      this.method212();
      this.scanIndex = 0;
      this.state = AutoWarden.FarmState.SCAN_NEXT;
      this.stateTimer.method3358();
   }

   private void method197(GenericContainerScreen var1) {
      int var2 = var1.getScreenHandler().slots.size();
      int var3 = var2 - 36;

      for (int var4 = this.depositSlotIndex; var4 < 36; var4++) {
         int var5 = var3 + var4;
         ItemStack var6 = var1.getScreenHandler().getSlot(var5).getStack();
         if (!var6.isEmpty() && this.method198(var6)) {
            mc.interactionManager.clickSlot(var1.getScreenHandler().syncId, var5, 0, SlotActionType.QUICK_MOVE, mc.player);
            this.depositSlotIndex = var4 + 1;
            return;
         }
      }

      this.depositSlotIndex = 0;
      mc.player.closeHandledScreen();
      if (this.method199()) {
         if (this.targetChest != null) {
            this.ignoredChests.put(this.targetChest.toImmutable(), System.currentTimeMillis() + 300000L);
         }

         this.targetChest = null;
         this.state = AutoWarden.FarmState.WAREHOUSE_FIND_CHEST;
      } else if (this.pendingClanStorageWithdraw) {
         this.state = AutoWarden.FarmState.CLAN_STORAGE_WITHDRAW_OPEN;
      } else {
         this.pendingDeposit = false;
         this.method219();
      }

      this.stateTimer.method3358();
   }

   private boolean method198(ItemStack var1) {
      return !this.method177(var1) && this.method189(var1);
   }

   private boolean method199() {
      if (mc.player == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < mc.player.getInventory().size(); var1++) {
            ItemStack var2 = mc.player.getInventory().getStack(var1);
            if (!var2.isEmpty() && this.method198(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean method200() {
      if (mc.player == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < mc.player.getInventory().size(); var1++) {
            if (!mc.player.getInventory().getStack(var1).isEmpty()) {
               return true;
            }
         }

         return false;
      }
   }

   private void method201() {
      long var1 = System.currentTimeMillis();
      this.ignoredChests.entrySet().removeIf(var2 -> var2.getValue() <= var1);
   }

   private boolean method202() {
      return this.targetAnarchy != -1 && this.targetOpenTime != -1L && this.targetChest != null ? this.method104(this.targetOpenTime) : false;
   }

   private boolean method203() {
      return this.targetChest != null && this.method109(this.targetChest);
   }

   private void method204(long var1) {
      if (this.targetChest != null) {
         long var3 = Math.max(System.currentTimeMillis() + 1000L, var1 - this.method208());
         this.ignoredChests.put(this.targetChest.toImmutable(), var3);
      }

      this.targetAnarchy = -1;
      this.targetChest = null;
      this.targetOpenTime = -1L;
      this.targetFoundOpenTime = -1L;
      this.scannedChestOpenTime = -1L;
      this.lootedCurrentChest = false;
      this.openedCurrentChest = false;
      this.aimedCurrentChest = false;
      this.checkingUntimedChest = false;
      this.openingTimedChestImmediately = false;
      this.returnCommandSent = false;
   }

   private boolean method205(long var1) {
      if (var1 != -1L && !this.method113()) {
         long var3 = var1 - System.currentTimeMillis();
         long var5 = Math.max(10000L, this.method207() + 2000L);
         return var3 <= this.method208() && var3 > var5;
      } else {
         return false;
      }
   }

   private long method206() {
      return Math.max(0, this.openRetryDelay.method2080());
   }

   private long method207() {
      return Math.max(500L, (long)this.rejoinLead.method2080());
   }

   private long method208() {
      try {
         return Math.max(1L, Long.parseLong(this.zaxdod.method2403())) * 1000L;
      } catch (Exception var2) {
         return 60000L;
      }
   }

   private boolean method209() {
      return this.lastTeleportBossBarEndedAt > 0L && System.currentTimeMillis() - this.lastTeleportBossBarEndedAt <= 10000L
         ? this.stateTimer.method3356(500.0)
         : this.stateTimer.method3356(8500.0);
   }

   private long method210(long var1) {
      return System.currentTimeMillis() + Math.max(0L, var1) * 1000L + 0L;
   }

   private boolean method211(long var1) {
      return var1 > 9000L && var1 <= this.method208();
   }

   private void method212() {
      this.method128();
      this.method142();
      this.method82();
      this.targetAnarchy = -1;
      this.targetChest = null;
      this.targetOpenTime = -1L;
      this.targetFoundOpenTime = -1L;
      this.scannedChestOpenTime = -1L;
      this.lootedCurrentChest = false;
      this.openedCurrentChest = false;
      this.aimedCurrentChest = false;
      this.checkingUntimedChest = false;
      this.openingTimedChestImmediately = false;
      this.chestOpenRecoveries = 0;
      this.lootContainerOpenedAt = -1L;
      this.emptyLootChecks = 0;
      this.returnCommandSent = false;
      this.warehouseHomeCommandSent = false;
      this.pendingClanStorageWithdraw = false;
      this.farmHomeCommandSent = false;
      this.supplyHomeCommandSent = false;
      this.supplyChest = null;
      this.supplyReturnState = AutoWarden.FarmState.RUSH_JOIN;
      this.supplyStartedAt = -1L;
      this.aimedSupplyChest = false;
      this.supplyTookInvisibility = false;
      this.supplyTookFood = false;
      this.afterLootRetreatTarget = null;
      this.afterLootRetreatGoalStarted = false;
   }

   private void method213() {
      this.method128();
      this.method141();
      this.method142();
      this.method82();
      this.method212();
      this.ignoredChests.clear();
      this.depositSlotIndex = 0;
      this.scanIndex = 0;
      this.pendingDeposit = false;
      this.warehouseHomeCommandSent = false;
      this.pendingClanStorageWithdraw = false;
      this.farmHomeCommandSent = false;
      this.supplyHomeCommandSent = false;
      this.chestOpenRecoveries = 0;
      this.lootContainerOpenedAt = -1L;
      this.emptyLootChecks = 0;
      this.supplyRetryAfter = 0L;
      this.initialSupplyPending = this.autoSupplies.method2200();
      this.forceSupplyPending = false;
      this.state = AutoWarden.FarmState.IDLE;
      this.stateTimer.method3358();
   }

   private String method214(Entity var1) {
      String var2 = "";
      if (var1 instanceof ArmorStandEntity var3 && var3.getCustomName() != null) {
         var2 = var3.getCustomName().getString();
      } else if (var1 instanceof TextDisplayEntity var4 && var4.getText() != null) {
         var2 = var4.getText().getString();
      }

      return var2.replaceAll("§.", "").toLowerCase(Locale.ROOT).trim();
   }

   private long method215(String var1) {
      if (var1 != null && !var1.isBlank()) {
         var1 = this.method115(var1)
            .replaceAll("§.", "")
            .replace(' ', ' ')
            .replace(' ', ' ')
            .replace('﹕', ':')
            .replace('：', ':')
            .replace('꞉', ':')
            .replace('∶', ':');
         Matcher var2 = TIME_PATTERN.matcher(var1);
         if (var2.find()) {
            long var10 = Long.parseLong(var2.group(1));
            long var5 = Long.parseLong(var2.group(2));
            return var2.group(3) == null ? var10 * 60L + var5 : var10 * 3600L + var5 * 60L + Long.parseLong(var2.group(3));
         } else {
            var2 = MIN_SEC_PATTERN.matcher(var1);
            if (var2.find()) {
               long var3 = Integer.parseInt(var2.group(1)) * 60L;
               if (var2.group(2) != null) {
                  var3 += Integer.parseInt(var2.group(2));
               }

               return var3;
            } else if (var1.contains(":")) {
               return -1L;
            } else {
               var2 = SECONDS_PATTERN.matcher(var1);
               return var2.find() ? Long.parseLong(var2.group(1)) : -1L;
            }
         }
      } else {
         return -1L;
      }
   }

   private void method216(String var1) {
      if (var1 != null && !var1.isBlank()) {
         if (mc.player != null && mc.player.networkHandler != null) {
            mc.player.networkHandler.sendChatCommand(var1.trim());
         }
      }
   }

   private void method217() {
      this.method128();
      this.method141();
      this.method142();
      IBaritone var1 = this.method84();
      if (var1 != null) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.method218();
      if (mc.player != null && mc.currentScreen != null) {
         mc.player.closeHandledScreen();
      }

      this.method216("hub");
   }

   private void method218() {
      if (mc.options != null) {
         mc.options.forwardKey.setPressed(false);
         mc.options.backKey.setPressed(false);
         mc.options.leftKey.setPressed(false);
         mc.options.rightKey.setPressed(false);
         mc.options.jumpKey.setPressed(false);
         mc.options.sneakKey.setPressed(false);
         mc.options.sprintKey.setPressed(false);
      }
   }

   private void method219() {
      this.method128();
      this.method141();
      this.method142();
      IBaritone var1 = this.method84();
      if (var1 != null) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.method218();
      if (mc.player != null && mc.currentScreen != null) {
         mc.player.closeHandledScreen();
      }

      this.pendingDeposit = false;
      this.pendingClanStorageWithdraw = false;
      this.targetChest = null;
      this.depositSlotIndex = 0;
      this.farmHomeCommandSent = false;
      this.state = AutoWarden.FarmState.RETURN_FARM_HOME;
      this.stateTimer.method3358();
   }

   private int method220() {
      return -1;
   }

   private int method221() {
      return 1;
   }

   private String method222() {
      return this.method226(this.Loot);
   }

   private String method223() {
      return this.method226(this.House);
   }

   private String method224() {
      return this.method227(this.warehouse, "sethome ");
   }

   private String method225() {
      return this.method227(this.warehouse, "home ");
   }

   private String method226(Setting6 var1) {
      String var2 = this.method228(var1);
      if (var2.isBlank()) {
         return "";
      } else {
         return var2.regionMatches(true, 0, "clan home ", 0, "clan home ".length()) ? var2 : "clan home " + var2;
      }
   }

   private String method227(Setting6 var1, String var2) {
      String var3 = this.method228(var1);
      if (var3.isBlank()) {
         return "";
      } else {
         return var3.regionMatches(true, 0, var2, 0, var2.length()) ? var3 : var2 + var3;
      }
   }

   private String method228(Setting6 var1) {
      String var2 = var1.method2403();
      if (var2 == null) {
         return "";
      } else {
         String var3 = var2.trim();
         if (var3.startsWith("/")) {
            var3 = var3.substring(1).trim();
         }

         return var3;
      }
   }

   private boolean method229() {
      if (mc.player == null) {
         return false;
      } else {
         BlockPos var1 = mc.player.getBlockPos();
         return var1.getX() == 0 && var1.getZ() == 0 && var1.getY() == 90;
      }
   }

   private String method230(long var1) {
      if (var1 <= 0L) {
         return "READY";
      } else {
         long var3 = (var1 + 999L) / 1000L;
         long var5 = var3 / 60L;
         long var7 = var3 % 60L;
         return String.format(Locale.ROOT, "%02d:%02d", var5, var7);
      }
   }

   private boolean method231() {
      if (mc.inGameHud == null) {
         return false;
      } else {
         for (ClientBossBar var2 : mc.inGameHud.getBossBarHud().bossBars.values()) {
            String var3 = this.method115(var2.getName().getString().trim());
            if (var3.contains("телепортац") || var3.contains("teleport")) {
               return true;
            }
         }

         return false;
      }
   }

   static class ChestTimerCandidate {
      final BlockPos pos;
      long openTime;
      double distance;

      ChestTimerCandidate(BlockPos var1, long var2, double var4) {
         this.pos = var1;
         this.openTime = var2;
         this.distance = var4;
      }
   }

   static enum FarmState {
      IDLE,
      SCAN_NEXT,
      SCAN_WAIT_JOIN,
      SCAN_FIND_HOLOGRAM,
      SCAN_PATHING,
      SCAN_READ_HOLOGRAM,
      HUB_WAITING,
      ARENA_SET_HOME,
      ARENA_OPEN,
      ARENA_WAIT_RETURN,
      ARENA_RETURN,
      ARENA_RETURN_WAIT,
      RUSH_JOIN,
      RUSH_PATH,
      WAIT_OPEN,
      LOOTING,
      AFTER_LOOT_RETREAT,
      AFTER_LOOT_PVP_WAIT,
      SUPPLY_WAIT_JOIN,
      SUPPLY_PATHING,
      SUPPLY_OPEN,
      SUPPLY_TAKE,
      CLAN_STORAGE_OPEN,
      CLAN_STORAGE_DEPOSIT,
      CLAN_STORAGE_WITHDRAW_OPEN,
      CLAN_STORAGE_WITHDRAW,
      GO_WAREHOUSE,
      RETURN_FARM_HOME,
      WAREHOUSE_WAIT_JOIN,
      WAREHOUSE_FIND_CHEST,
      WAREHOUSE_PATHING,
      WAREHOUSE_OPEN,
      DEPOSITING;

      private FarmState() {
      }
   }
}
