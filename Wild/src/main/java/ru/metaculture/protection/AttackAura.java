package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.BlockState;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.AmbientEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AttackAura",
   O000000000 = "Автоматически бьет энтити - таргетов",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.GRIM}
)
public class AttackAura extends Module {
   public static NumberSetting O000000000O = new NumberSetting("Радиус атаки", 3.0F, 3.0F, 6.0F, 0.1F, false);
   public static NumberSetting O000000000O0 = new NumberSetting("Радиус обнаружения", 1.0F, 0.0F, 5.0F, 0.1F, false);
   public static ModeSetting O000000000O00 = new ModeSetting("Режим ротации", "Smooth", O0000000000OO0());
   public static ButtonSetting O000000000O000 = new ButtonSetting("Конструктор ротации", 0)
      .O000000000("Открыть")
      .O00000000(AttackAura::O00000000OO0O)
      .O00000000(() -> !O000000000O00.O000000000("Custom"));
   public static NumberSetting O000000000O00O = new NumberSetting("AI Jitter", 1.0F, 0.0F, 2.0F, 0.05F, false).O00000000(() -> !O000000000O00.O000000000("AI"));
   public static BooleanSetting O000000000O0O = new BooleanSetting("AI Debug Log", false).O00000000(() -> !O000000000O00.O000000000("AI"));
   public static BooleanSetting O000000000O0O0 = new BooleanSetting("AI Human Misses", false).O00000000(() -> !O000000000O00.O000000000("AI"));
   public static ButtonSetting O000000000O0OO = new ButtonSetting("AI Lab", 0)
      .O000000000("Открыть")
      .O00000000(AttackAura::O00000000OO0O0)
      .O00000000(() -> !O000000000O00.O000000000("AI"));
   public static ModeSetting O000000000OO = new ModeSetting("Режим снапа", "Fast", "Fast", "Smooth", "Random")
      .O00000000(() -> !O000000000O00.O000000000("Snap") && !O000000000O00.O000000000("FOV"));
   public static NumberSetting O000000000OO0 = new NumberSetting("FOV", 90.0F, 5.0F, 180.0F, 1.0F, true).O00000000(() -> !O000000000O00.O000000000("FOV"));
   public static BooleanSetting O000000000OO00 = new BooleanSetting("Отображать FOV", true).O00000000(() -> !O000000000O00.O000000000("FOV"));
   public static NumberSetting O000000000OO0O = new NumberSetting("Скорость Legit", 0.08F, 0.02F, 0.4F, 0.01F, false)
      .O00000000(() -> !O000000000O00.O000000000("Legit"));
   public static BooleanSetting O000000000OOO = new BooleanSetting("SidePoint Extra Checks", false).O00000000(() -> !O000000000O00.O000000000("Side Point"));
   public static O0000000OOOO00 O000000000OOO0 = new O0000000OOOO00("Neuro Status", 0, O000000O0OO00O::O0000000000)
      .O000000000(() -> !O000000000O00.O000000000("Neuro") || !O0000000000OOO());
   public static BooleanSetting O000000000OOOO = new BooleanSetting("Neuro Debug", false)
      .O00000000(() -> !O000000000O00.O000000000("Neuro") || !O0000000000OOO());
   public static ModeSetting O00000000O = new ModeSetting("Neuro Profile", "Human", "Stable", "Human", "Dynamic")
      .O00000000(() -> !O000000000O00.O000000000("Neuro") || !O0000000000OOO());
   public static NumberSetting O00000000O0 = new NumberSetting("Neuro Strength", 1.25F, 0.0F, 2.0F, 0.05F, false)
      .O00000000(() -> !O000000000O00.O000000000("Neuro") || !O0000000000OOO());
   public static BooleanSetting O00000000O00 = new BooleanSetting("Neuro Client Finish", false)
      .O00000000(() -> !O000000000O00.O000000000("Neuro") || !O0000000000OOO());
   public static GroupSetting O00000000O000 = new GroupSetting(
      "Цели",
      new BooleanSetting("Игроки", true),
      new BooleanSetting("Голые", true),
      new BooleanSetting("Невидимки", true),
      new BooleanSetting("Голые невидимки", false),
      new BooleanSetting("Друзья", false),
      new BooleanSetting("NPC", true),
      new BooleanSetting("Мобы", false),
      new BooleanSetting("Животные", false),
      new BooleanSetting("Жители", false)
   );
   public static ModeSetting O00000000O0000 = new ModeSetting("Тайминг удара", "Быстрый", "Быстрый", "Динамичный");
   public static BooleanSetting O00000000O000O = new BooleanSetting("Адаптивный тайминг", false);
   public static ModeSetting O00000000O00O = new ModeSetting("Режим спринта", "Обычный", "Обычный", "Обновленный", "Тестовый", "Легит");
   public static GroupSetting O00000000O00O0 = new GroupSetting(
      "Проверки до удара",
      new BooleanSetting("Бить через блоки", false),
      new BooleanSetting("Бить только оружием", false),
      new BooleanSetting("Не бить если кушаешь", true),
      new BooleanSetting("Не бить в контейнерах ", false),
      new BooleanSetting("Ломать щит", false),
      new BooleanSetting("Отжим щита", false)
   );
   public static GroupSetting O00000000O00OO = new GroupSetting(
      "Дополнительные настройки",
      new BooleanSetting("Расширенная настройки для атаки", true),
      new BooleanSetting("Умные криты", false),
      new BooleanSetting("Увеличенная дистанция удара", false),
      new BooleanSetting("Приоритет ближайшей цели", false)
   );
   public static NumberSetting O00000000O0O = new NumberSetting("Радиус атаки для мобов", 3.0F, 3.0F, 6.0F, 0.1F, false)
      .O00000000(() -> !O00000000O00OO.O000000000("Расширенная настройки для атаки") && !O00000000O000.O000000000("Мобы"));
   public static NumberSetting O00000000O0O0 = new NumberSetting("Радиус атаки для игроков", 3.0F, 3.0F, 6.0F, 0.1F, false)
      .O00000000(() -> !O00000000O00OO.O000000000("Расширенная настройки для атаки") && !O00000000O000.O000000000("Игроки"));
   public static ModeSetting O00000000O0O00 = new ModeSetting("Режим движения", "Default", "Default", "Free", "Target", "Преследование");
   public static BooleanSetting O00000000O0O0O = new BooleanSetting("Булава", false);
   public static ModeSetting O00000000O0OO = new ModeSetting("Режим булавы", "Авто", "Авто", "Бинд").O00000000(() -> !O00000000O0O0O.O0000000000());
   public static KeybindSetting O00000000O0OO0 = new KeybindSetting("Кнопка булавы", -1)
      .O00000000(() -> !O00000000O0O0O.O0000000000() || !O00000000O0OO.O000000000("Бинд"));
   public static NumberSetting O00000000O0OOO = new NumberSetting("Высота булавы", 2.0F, 0.5F, 6.0F, 0.1F, false)
      .O00000000(() -> !O00000000O0O0O.O0000000000() || !O00000000O0OO.O000000000("Авто"));
   public static BooleanSetting O00000000OO = new BooleanSetting("Отладка булавы", false).O00000000(() -> !O00000000O0O0O.O0000000000());
   public static LivingEntity O00000000OO0;
   public static boolean O00000000OO00 = false;
   private static final Runnable O00000000OOO0 = O000000O0O0OOO::O00000000;
   private static long O00000000OOO00 = 0L;
   private static boolean O00000000OOO0O = false;
   private static float O00000000OOOO = 0.0F;
   private static long O00000000OOOO0 = 0L;
   private static float O00000000OOOOO = 0.0F;
   private static long O0000000O = 0L;
   private static long O0000000O0 = 0L;
   private static int O0000000O00 = Integer.MIN_VALUE;
   private boolean O0000000O000 = false;
   private boolean O0000000O0000 = false;
   private static final String O0000000O00000 = "AuraMace";
   private static final int O0000000O0000O = 40;
   private static final int O0000000O000O = 4;
   private static final long O0000000O000O0 = 300L;
   private static int O0000000O000OO = 0;
   private static int O0000000O00O = 0;
   private static boolean O0000000O00O0 = false;
   private static int O0000000O00O00 = -1;
   private static int O0000000O00O0O = -1;
   private static boolean O0000000O00OO = false;
   private static int O0000000O00OO0 = -1;
   private static boolean O0000000O00OOO = false;
   private static boolean O0000000O0O = false;
   private static int O0000000O0O0 = 0;
   private static int O0000000O0O00 = 0;
   private static long O0000000O0O000 = 0L;
   public static long O00000000OO000 = 0L;
   public static long O00000000OO00O = ThreadLocalRandom.current().nextLong(90000L, 180000L);
   public static boolean O00000000OO0O = false;
   public static long O00000000OO0O0 = 0L;
   public static int O00000000OO0OO = 0;

   private static String[] O0000000000OO0() {
      return O0000000000OOO()
         ? new String[]{"Matrix", "Random Smooth ", "Snap", "FOV", "Smooth ", "FunTime", "FT-New", "SpookyTime", "Legit", "Custom", "AI", "Neuro"}
         : new String[]{"Matrix", "Random Smooth ", "Snap", "FOV", "Smooth ", "FunTime", "FT-New", "SpookyTime", "Legit", "Custom", "AI"};
   }

   private static boolean O0000000000OOO() {
      return ModuleManager.O00000000(AttackAura.W31.class.getAnnotation(ModuleAccess.class));
   }

   private static boolean O000000000O() {
      return O000000000O00.O000000000("Neuro") && !O0000000000OOO();
   }

   public AttackAura() {
      O000000O00OOOO.O00000000000OO();
      this.O00000000(
         new Setting[]{
            O000000000O,
            O000000000O0,
            O000000000O00,
            O000000000O000,
            O000000000O00O,
            O000000000O0O,
            O000000000O0O0,
            O000000000O0OO,
            O000000000OO,
            O000000000OO0,
            O000000000OO00,
            O000000000OO0O,
            O000000000OOO0,
            O000000000OOOO,
            O00000000O,
            O00000000O0,
            O00000000O00,
            O00000000O000,
            O00000000O0000,
            O00000000O000O,
            O00000000O00O,
            O00000000O00O0,
            O00000000O00OO,
            O00000000O0O,
            O00000000O0O0,
            O00000000O0O00,
            O00000000O0O0O,
            O00000000O0OO,
            O00000000O0OO0,
            O00000000O0OOO,
            O00000000OO,
            ElytraTarget.O000000000O000
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (this.O0000000000000 && !O0000000000O0O() && O000000000O00.O000000000("FOV") && o0000000O00O.O00000000000() != null && O000000000OO00.O0000000000()) {
         O000000O0O0OO0.O00000000(o0000000O00O.O00000000000(), O000000000OO0.O0000000000(), o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      O000000O0O0OO.O0000000000();
      if (O0000000000O0O()) {
         O000000O0O0OOO.O0000000000();
         O000000O0OO.O00000000();
         this.O00000000OO0OO();
         this.O00000000OOO();
      } else if (O00000000OO0 != null && O0000000000.player != null && O0000000000.world != null) {
         this.O00000000OO0();
         if (!O000000000O00.O000000000("Legit")) {
            this.O000000000O0();
         }
      } else {
         O000000O0O0OOO.O0000000000();
         O000000O0OO.O00000000();
         this.O00000000OO0OO();
         this.O00000000OOO();
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OOOO o0000000O0OOOO) {
      if (!O0000000000O0O() && O000000000O00.O000000000("Legit")) {
         if (O00000000OO0 != null && O0000000000.player != null && O0000000000.world != null) {
            O000000O0OO00.O00000000(O00000000OO0, o0000000O0OOOO);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OO0 o0000000O0OO0) {
      if (!O0000000000O0O() && O00000000O00O.O000000000("Тестовый")) {
         if (O00000000OO0 != null && O0000000000.player != null && O0000000000.world != null && O0000000000.currentScreen == null) {
            Vec3d var2 = O00000000OO0.getPos().add(0.0, O00000000OO0.getHeight() * 0.5, 0.0).subtract(O0000000000.player.getEyePos());
            float var3 = (float)Math.toDegrees(Math.atan2(-var2.x, var2.z));
            O0000O00O000OO.O00000000(o0000000O0OO0, var3);
            if (O000000O00OOOO.O000000000(O00000000OO0, O000000000(O00000000OO0))) {
               o0000000O0OO0.O00000000(0.0F);
               o0000000O0OO0.O000000000(0.0F);
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O0 o0000000O00O0) {
      if (!O0000000000O0O()) {
         if (O00000000O00O0.O000000000("Синхрон с ТПС")) {
            this.O00000000OO0();
            if (!O00000000O00O.O000000000("Легит") && this.O000000000O0O0()) {
               O0000000000.player.setSprinting(false);
               O0000000000.options.sprintKey.setPressed(false);
            }

            if (!this.O000000000OOO()) {
               this.O0000000000O00();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      this.O000000000OOOO();
      if (O0000000000O0O()) {
         this.O00000000OO0OO();
         this.O000000000O000();
         this.O000000000O0OO();
      } else if (!O0000000000.player.isAlive()) {
         this.O00000000OO0OO();
         this.O000000000O000();
         this.O000000000O0OO();
         this.a_();
      } else {
         if (O00000000OO0 == null || !this.O0000000000(O00000000OO0)) {
            this.O000000000OO0();
         }

         if (O00000000OO0 == null) {
            O000000O0O0OOO.O0000000000();
            O000000O0OO.O00000000();
            this.O00000000OO0OO();
            this.O00000000OOO();
            this.O000000000O000();
            this.O000000000O0OO();
         } else if (O0000000000.currentScreen != null) {
            this.O000000000O000();
            this.O000000000O0OO();
            this.O000000000OO();
         } else if (O0000000O000OO != 0) {
            this.O000000000O000();
            this.O000000000O0OO();
            O0000O00O00O.O00000000().O00000000("AuraMace");
         } else {
            this.O000000000O00O();
            if (O00000000O0O00.O000000000("Free")) {
               this.O000000000O000();
               O0000O00O000OO.O00000000(O0000000000.gameRenderer.getCamera().getYaw());
            }

            if (O00000000O0O00.O000000000("Target")) {
               this.O000000000O000();
               O0000O00O000OO.O00000000(O0000000000.player.getYaw(), O00000000OO0.getPos());
            }

            if (O00000000O0O00.O000000000("Преследование")) {
               this.O000000000O00();
            } else {
               this.O000000000O000();
            }

            if (!O00000000O00O0.O000000000("Синхрон с ТПС")) {
               this.O00000000OO0();
               if (!O00000000O00O.O000000000("Легит") && this.O000000000O0O0()) {
                  O0000000000.player.setSprinting(false);
                  O0000000000.options.sprintKey.setPressed(false);
               }

               if (!this.O000000000OOO()) {
                  this.O0000000000O00();
               }
            }
         }
      }
   }

   public static float O00000000(LivingEntity livingEntity) {
      if (livingEntity == null) {
         return O000000000O.O0000000000();
      } else {
         float var1 = O000000000O.O0000000000();
         if (O00000000O00OO.O000000000("Расширенная настройки для атаки")) {
            if (livingEntity instanceof PlayerEntity) {
               var1 = O00000000O0O0.O0000000000();
            } else {
               var1 = O00000000O0O.O0000000000();
            }
         }

         if (O00000000O00OO.O000000000("Увеличенная дистанция удара")) {
            float var2 = livingEntity.getHealth() + livingEntity.getAbsorptionAmount();
            if (var2 >= 10.0F && var2 <= 12.0F) {
               long var3 = System.currentTimeMillis();
               if (var3 >= O00000000OOO00) {
                  if (ThreadLocalRandom.current().nextInt(100) < 25) {
                     O00000000OOO0O = true;
                     O00000000OOOO = 0.1F + ThreadLocalRandom.current().nextFloat() * 0.05F;
                     O00000000OOO00 = var3 + ThreadLocalRandom.current().nextLong(400L, 700L);
                  } else {
                     O00000000OOO0O = false;
                     O00000000OOOO = 0.0F;
                     O00000000OOO00 = var3 + ThreadLocalRandom.current().nextLong(1500L, 2500L);
                  }
               }

               if (O00000000OOO0O) {
                  return var1 + O00000000OOOO;
               }
            } else {
               O00000000OOO0O = false;
               O00000000OOOO = 0.0F;
            }
         }

         return var1;
      }
   }

   public static float[] O000000000(LivingEntity livingEntity) {
      float var1 = O00000000(livingEntity);
      return new float[]{var1, O000000000O0.O0000000000(), var1 + O000000000O0.O0000000000()};
   }

   public boolean O0000000000O0() {
      return true;
   }

   public void O0000000000O00() {
      assert O0000000000.player != null;

      if (O0000000O000OO == 0) {
         float var1 = O00000000(O00000000OO0);
         if (!(O000000O0O.O00000000((Entity)O00000000OO0) >= var1)) {
            float[] var2 = O000000000(O00000000OO0);
            var2 = new float[]{var2[0], var2[1], var2[0] + var2[1]};
            if (!O0000000000.player.hasStatusEffect(StatusEffects.BLINDNESS) && !O0000000000.player.isFlyingVehicle() && O00000000O00O.O000000000("Обычный")) {
               boolean var19 = true;
            } else {
               boolean var10000 = false;
            }

            if (O00000000OO0 != null) {
               if (!O000000000O00.O000000000("FOV") || O000000O0O0OO0.O00000000(O00000000OO0, O000000000OO0.O0000000000())) {
                  if (!O000000000O00.O000000000("AI") || O000000O0O0O00.O000000000O00O()) {
                     O000000O00OOOO.O00000000(O00000000OO0, true, this.O0000000000O0(), false);
                     boolean var4 = O000000000O00.O000000000("FT-New");
                     boolean var5 = O00000000O0O0O.O0000000000() && O0000000000.player.getMainHandStack().getItem() == Items.MACE;
                     boolean var6;
                     if (var5 && O0000000O00O0) {
                        long var7 = O00000000O0OO.O000000000("Авто") ? -2000L : 0L;
                        boolean var9 = O000000O0O.O00000000(O00000000OO0, var2[0], true);
                        boolean var10 = O000000O00OOOO.O00000000(var7);
                        boolean var11 = !this.O0000000000O0() || O000000O00OOOO.O00000000(O00000000OO0, var2[0]);
                        boolean var12 = !O00000000O0OO.O000000000("Авто") || !O0000000O0O;
                        var6 = O0000000O000OO == 0 && !O0000000O00OOO && var12 && var9 && var10 && var11;
                     } else if (var4) {
                        var6 = O000000O0O0OO.O00000000(O00000000OO0, 0) && (!this.O0000000000O0() || O000000O00OOOO.O00000000(O00000000OO0, var2[0]));
                     } else {
                        var6 = O000000O00OOOO.O00000000(O00000000OO0, this.O0000000000O0(), true, true, O00000000OO000(), var2);
                     }

                     if (var6) {
                        if (!var4 || O000000O0O0OO.O000000000(O00000000OO0) && O000000O0O0OO.O00000000(O00000000O00O0.O000000000("Отжим щита"))) {
                           if (var4 || !O00000000O000O.O0000000000() || !O000000O00OOOO.O00000000(O00000000OO0)) {
                              Runnable[] var14 = O000000O00OOOO.O00000000(O00000000OO0, !var4 && O00000000O00O0.O000000000("Ломать щит"));
                              Runnable[] var8 = O000000O00OOOO.O00000000(!var4);
                              Runnable[] var15 = O000000O00OOOO.O000000000(false);
                              Runnable var16 = () -> {
                                 var15[0].run();
                                 var8[0].run();
                                 var14[0].run();
                              };
                              Runnable var17 = () -> {
                                 var14[1].run();
                                 var8[1].run();
                                 var15[1].run();
                              };
                              if (!var4
                                 && O00000000O00O0.O000000000("Отжим щита")
                                 && O0000000000.player.getActiveItem().getItem().equals(Items.SHIELD)
                                 && O0000000000.player.isUsingItem()) {
                                 O0000000000.interactionManager.stopUsingItem(O0000000000.player);
                              }

                              if (!var4 && O00000000O000O.O0000000000()) {
                                 Runnable var18 = O000000000O00.O000000000("FunTime") ? O00000000OOO0 : null;
                                 O000000O00OOOO.O00000000(O00000000OO0, var16, var17, Hand.MAIN_HAND, true, var18);
                              } else {
                                 if (O000000O00OOOO.O00000000(O00000000OO0, var16, var17, Hand.MAIN_HAND, true)) {
                                    if (O000000000O00.O000000000("FunTime")) {
                                       O000000O0O0OOO.O00000000();
                                    } else if (var4) {
                                       O000000O0O0OO.O00000000000();
                                    }

                                    this.O00000000O0OO();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void O000000000O0() {
      if (O00000000OO0 != null && !O0000000000O0O() && !O000000000O() && (O0000000O000OO == 0 || O0000000O00OO)) {
         if (!O000000000O00.O000000000("FT-New")) {
            O000000O0O0O0O.O0000000000();
            O000000O0OO.O000000000();
         }

         this.O00000000OO0();
         double var1 = O0000000000.player.getY() - O00000000OO0.getY();
         boolean var3 = O0000000000.player.getMainHandStack().getItem() == Items.MACE;
         boolean var4 = !O0000000000.player.isOnGround() && (var1 >= 2.0 || var3);
         if (!O000000000O00.O000000000("Legit") && var3 && var4 && O0000000000.player.getY() > O00000000OO0.getY()) {
            O000000O0OO0OO.O00000000(O00000000OO0);
         } else if (!O000000000O00.O000000000("Legit") && O00000000O0O0O.O0000000000() && var3) {
            O000000O0OO0.O00000000(O00000000OO0);
         } else {
            float[] var5 = O000000000(O00000000OO0);
            var5 = new float[]{var5[0], var5[1], var5[0] + var5[1]};
            boolean var6 = O000000O00OOOO.O00000000(O00000000OO0, false, true, true, O00000000OO000(), var5);
            String var7 = O000000000O00.O0000000000();
            switch (var7) {
               case "Random Smooth ":
                  O000000O0OOO00.O00000000(
                     O00000000OO0,
                     O000000O00OOOO.O00000000(O00000000OO0, false, true, true, O00000000(-50L), var5),
                     O00000000(O00000000OO0),
                     this.O000000000OOO()
                  );
                  break;
               case "Matrix":
                  if (O0000O00O00O0.O00000000("spookytime")) {
                     O000000O0OO0OO.O00000000(O00000000OO0, var6);
                  } else if (O0000O00O00O0.O00000000("holy")) {
                     O000000O0OO0OO.O000000000(O00000000OO0, var6);
                  } else if (O0000O00O00O0.O00000000("ares")) {
                     O000000O0OO0OO.O0000000000(O00000000OO0, var6);
                  } else {
                     O000000O0OO0OO.O00000000(O00000000OO0, var6);
                  }
                  break;
               case "Snap":
                  O000000O0OO0OO.O00000000(
                     O00000000OO0, O000000O00OOOO.O00000000(O00000000OO0, false, true, true, O00000000(-50L), var5), O000000000OO.O0000000000()
                  );
                  break;
               case "FOV":
                  boolean var9 = O000000O0O0OO0.O00000000(O00000000OO0, O000000000OO0.O0000000000());
                  boolean var10 = var9 && O000000O00OOOO.O00000000(O00000000OO0, false, true, true, O00000000(-50L), var5);
                  O000000O0OO0OO.O000000000(O00000000OO0, var10, O000000000OO.O0000000000());
                  break;
               case "Smooth ":
                  O000000O0OO0.O00000000(O00000000OO0);
                  break;
               case "FunTime":
                  O000000O0O0OOO.O00000000(O00000000OO0);
                  break;
               case "FT-New":
                  O000000O0OO.O00000000(O00000000OO0);
                  break;
               case "SpookyTime":
                  O000000O0OOO0.O00000000(O00000000OO0);
                  break;
               case "Custom":
                  O000000OO0.O00000000(O00000000OO0);
                  break;
               case "Lony Grief":
                  O000000O0OO000.O00000000(O00000000OO0);
                  break;
               case "Side Point":
                  O000000O0OOO.O00000000(O00000000OO0);
                  break;
               case "AI":
                  O000000O0O0O00.O00000000(O00000000OO0);
                  break;
               case "Neuro":
                  O000000O0OO00O.O00000000(O00000000OO0, var6, this.O000000000OOO(), O000000000OOOO.O0000000000());
            }
         }
      }
   }

   private void O000000000O00() {
      if (O0000000000.player != null && O00000000OO0 != null && O0000000000.options != null && O0000000000.getWindow() != null) {
         if (!O0000000000.player.isUsingItem() && !O0000000000.player.isSneaking() && !O0000000000.player.hasVehicle() && O0000000000.currentScreen == null) {
            float[] var1 = O0000O00O000OO.O000000000();
            float var2 = var1[0];
            float var3 = var1[1];
            Vec3d var4 = O00000000OO0.getPos();
            if (var2 != 0.0F || var3 != 0.0F) {
               Vec3d var5 = this.O00000000(O00000000OO0.getYaw());
               Vec3d var6 = this.O00000000(O00000000OO0.getYaw() + 90.0F);
               var4 = var4.add(var5.multiply(var2)).add(var6.multiply(-var3));
            }

            Vec3d var16 = var4.subtract(O0000000000.player.getPos());
            if (var16.x * var16.x + var16.z * var16.z < 1.0E-4) {
               this.O00000000(1.0F, 0.0F, true, false);
            } else {
               float var17 = (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var16.z, var16.x)) - 90.0);
               float var7 = O0000O00O00O0O.O00000000(O0000000000.player.getYaw());
               float var8 = 0.0F;
               float var9 = 0.0F;
               float var10 = Float.MAX_VALUE;

               for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
                  for (float var12 = -1.0F; var12 <= 1.0F; var12++) {
                     if (var11 != 0.0F || var12 != 0.0F) {
                        double var13 = MathHelper.wrapDegrees(Math.toDegrees(O0000O00O000OO.O00000000(var7, var11, var12)));
                        float var15 = this.O00000000(var17, (float)var13);
                        if (var15 < var10) {
                           var10 = var15;
                           var8 = var11;
                           var9 = var12;
                        }
                     }
                  }
               }

               boolean var18 = O0000000000.player.horizontalCollision && O0000000000.player.isOnGround();
               this.O00000000(var8, var9, true, var18);
            }
         } else {
            this.O000000000O000();
         }
      } else {
         this.O000000000O000();
      }
   }

   private Vec3d O00000000(float f) {
      double var2 = Math.toRadians(f);
      return new Vec3d(-Math.sin(var2), 0.0, Math.cos(var2));
   }

   private float O00000000(float f, float g) {
      return Math.abs(MathHelper.wrapDegrees(f - g));
   }

   private void O00000000(float f, float g, boolean bl, boolean bl2) {
      if (O0000000000.options != null) {
         this.O0000000O000 = true;
         O0000000000.options.forwardKey.setPressed(f > 0.0F);
         O0000000000.options.backKey.setPressed(f < 0.0F);
         O0000000000.options.leftKey.setPressed(g > 0.0F);
         O0000000000.options.rightKey.setPressed(g < 0.0F);
         boolean var5 = bl;
         if (O00000000O00O.O000000000("Легит") && O00000000OO0 != null && O000000O00OOOO.O000000000(O00000000OO0, O000000000(O00000000OO0))) {
            O0000000000.player.setSprinting(false);
            var5 = false;
         }

         O0000000000.options.sprintKey.setPressed(var5);
         if (bl2) {
            O0000000000.options.jumpKey.setPressed(true);
         } else if (!this.O000000000(O0000000000.options.jumpKey)) {
            O0000000000.options.jumpKey.setPressed(false);
         }
      }
   }

   private void O000000000O000() {
      if (this.O0000000O000 && O0000000000.options != null) {
         this.O0000000O000 = false;
         this.O00000000(O0000000000.options.forwardKey);
         this.O00000000(O0000000000.options.backKey);
         this.O00000000(O0000000000.options.leftKey);
         this.O00000000(O0000000000.options.rightKey);
         this.O00000000(O0000000000.options.jumpKey);
         this.O00000000(O0000000000.options.sprintKey);
      }
   }

   private void O000000000O00O() {
      if (O00000000O00O.O000000000("Легит")
         && O0000000000.player != null
         && O0000000000.world != null
         && O0000000000.options != null
         && O0000000000.currentScreen == null) {
         this.O0000000O0000 = true;
         boolean var1 = this.O000000000O0O0();
         if (var1) {
            O0000000000.player.setSprinting(false);
            O0000000000.options.sprintKey.setPressed(false);
         } else {
            O0000000000.options.sprintKey.setPressed(this.O000000000O0O());
         }
      } else {
         this.O000000000O0OO();
      }
   }

   private boolean O000000000O0O() {
      return O0000000000.options == null ? false : this.O000000000(O0000000000.options.forwardKey) && !this.O000000000(O0000000000.options.backKey);
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O000000000O00.O000000000("FT-New") && o0000000O000OO.O0000000000()) {
         if (o0000000O000OO.O00000000000() instanceof HandSwingC2SPacket || o0000000O000OO.O00000000000() instanceof UpdateSelectedSlotC2SPacket) {
            O000000O0O0OO.O000000000000();
         }
      }
   }

   private boolean O000000000O0O0() {
      if (O00000000OO0 == null || O0000000000.player == null) {
         return false;
      } else {
         return O000000000O00.O000000000("FT-New") ? O000000O0O0OO.O00000000(O00000000OO0) : O000000O00OOOO.O000000000(O00000000OO0, O000000000(O00000000OO0));
      }
   }

   private void O000000000O0OO() {
      if (this.O0000000O0000 && O0000000000.options != null) {
         this.O0000000O0000 = false;
         this.O00000000(O0000000000.options.sprintKey);
      }
   }

   private void O000000000OO() {
      if (O0000000000.options != null) {
         O0000000000.options.forwardKey.setPressed(false);
         O0000000000.options.backKey.setPressed(false);
         O0000000000.options.leftKey.setPressed(false);
         O0000000000.options.rightKey.setPressed(false);
         O0000000000.options.jumpKey.setPressed(false);
         this.O00000000(O0000000000.options.sprintKey);
      }
   }

   private void O00000000(KeyBinding keyBinding) {
      if (keyBinding != null) {
         keyBinding.setPressed(this.O000000000(keyBinding));
      }
   }

   private boolean O000000000(KeyBinding keyBinding) {
      return O0000000000.getWindow() != null && keyBinding != null
         ? InputUtil.isKeyPressed(O0000000000.getWindow().getHandle(), keyBinding.getDefaultKey().getCode())
         : false;
   }

   private void O000000000OO0() {
      LivingEntity var1 = O00000000OO0;
      LivingEntity var2 = null;
      double var3 = Double.MAX_VALUE;
      Vec3d var5 = O0000000000.player.getEyePos();
      Vec3d var6 = O0000000000.player.getRotationVec(1.0F).normalize();

      for (Entity var8 : O0000000000.world.getEntities()) {
         if (var8 instanceof LivingEntity var9 && this.O0000000000(var9)) {
            double var10;
            if (O00000000O00OO.O000000000("Приоритет ближайшей цели")) {
               var10 = O0000000000.player.squaredDistanceTo(var9);
            } else {
               Vec3d var12 = var9.getPos().add(0.0, var9.getHeight() * 0.5, 0.0);
               Vec3d var13 = var12.subtract(var5).normalize();
               var10 = Math.acos(MathHelper.clamp(var6.dotProduct(var13), -1.0, 1.0));
            }

            if (var10 < var3) {
               var3 = var10;
               var2 = var9;
            }
         }
      }

      O00000000OO0 = var2;
      if (O000000000O00.O000000000("FunTime") && var1 != null && var2 == null) {
         O000000O0O0OOO.O000000000();
      }
   }

   private float O000000000OO00() {
      return O00000000(O00000000OO0) + O000000000O0.O0000000000();
   }

   private boolean O0000000000(LivingEntity livingEntity) {
      return this.O00000000(livingEntity, O00000000(livingEntity) + O000000000O0.O0000000000());
   }

   private boolean O00000000(LivingEntity livingEntity, float f) {
      if (livingEntity instanceof ClientPlayerEntity || livingEntity == O0000000000.player) {
         return false;
      } else if (livingEntity.isAlive() && !livingEntity.isInvulnerable() && !(livingEntity instanceof ArmorStandEntity)) {
         if (O0000000000.player.distanceTo(livingEntity) > f) {
            return false;
         } else if (!O00000000O00O0.O000000000("Бить через блоки") && !O0000000000.player.canSee(livingEntity)) {
            return false;
         } else if (!O00000000O000.O000000000("NPC") && this.O00000000000(livingEntity)) {
            return false;
         } else if (livingEntity instanceof PlayerEntity var7) {
            if (!var7.isCreative() && !var7.isSpectator()) {
               boolean var8 = FriendCommand.O00000000(var7.getName().getString());
               if (var8 && !O00000000O000.O000000000("Друзья")) {
                  return false;
               } else if (!var8 && !O00000000O000.O000000000("Игроки")) {
                  return false;
               } else {
                  boolean var9 = !this.O00000000(var7);
                  boolean var6 = var7.isInvisible();
                  if (AntiBot.O00000000(var7)) {
                     return false;
                  } else if (var6) {
                     return var9 ? O00000000O000.O000000000("Голые невидимки") : O00000000O000.O000000000("Невидимки");
                  } else {
                     return !var9 || O00000000O000.O000000000("Голые");
                  }
               }
            } else {
               return false;
            }
         } else {
            boolean var3 = livingEntity instanceof Monster || livingEntity instanceof SlimeEntity;
            boolean var4 = livingEntity instanceof VillagerEntity || livingEntity instanceof MerchantEntity;
            boolean var5 = livingEntity instanceof AnimalEntity
               || livingEntity instanceof VillagerEntity
               || livingEntity instanceof WaterCreatureEntity
               || livingEntity instanceof AmbientEntity;
            if (var3 && O00000000O000.O000000000("Мобы")) {
               return true;
            } else {
               return var4 && O00000000O000.O000000000("Жители") ? true : var5 && O00000000O000.O000000000("Животные");
            }
         }
      } else {
         return false;
      }
   }

   private boolean O00000000(PlayerEntity playerEntity) {
      return !playerEntity.getEquippedStack(EquipmentSlot.HEAD).isEmpty()
         || !playerEntity.getEquippedStack(EquipmentSlot.CHEST).isEmpty()
         || !playerEntity.getEquippedStack(EquipmentSlot.LEGS).isEmpty()
         || !playerEntity.getEquippedStack(EquipmentSlot.FEET).isEmpty();
   }

   private boolean O00000000000(LivingEntity livingEntity) {
      String var2 = this.O000000000(livingEntity.getName().getString());
      String var3 = this.O000000000(livingEntity.getDisplayName().getString());
      String var4 = livingEntity.getCustomName() == null ? "" : this.O000000000(livingEntity.getCustomName().getString());
      String var5 = "";
      String var6 = "";
      if (livingEntity.getScoreboardTeam() != null) {
         var5 = this.O000000000(livingEntity.getScoreboardTeam().getPrefix().getString());
         var6 = this.O000000000(livingEntity.getScoreboardTeam().getSuffix().getString());
      }

      if (this.O00000000(var2) || this.O00000000(var3) || this.O00000000(var4) || this.O00000000(var5) || this.O00000000(var6)) {
         return true;
      } else if (!(livingEntity instanceof PlayerEntity var7)) {
         return false;
      } else {
         boolean var8 = O0000000000.getNetworkHandler() != null && O0000000000.getNetworkHandler().getPlayerListEntry(var7.getUuid()) == null;
         boolean var9 = var2.matches("\\d{1,8}") || var2.startsWith("cit-");
         return var8 || var9 && (!var3.equals(var2) || !var5.isEmpty() || !var6.isEmpty());
      }
   }

   private boolean O00000000(String string) {
      return string.contains("npc") || string.contains("znpc") || string.contains("нпс") || string.contains("наставник");
   }

   private String O000000000(String string) {
      return string == null ? "" : string.replaceAll("(?i)§.", "").replaceAll("(?i)&.", "").replaceAll("\\p{Cntrl}", "").trim().toLowerCase(Locale.ROOT);
   }

   @Override
   public void O00000000() {
      FreeLock var1 = WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null
         ? WildClient.O00000000.O000000000.O00000000(FreeLock.class)
         : null;
      if (var1 != null && var1.O0000000000000 && var1.O0000000000O0()) {
         this.O0000000000000 = false;
         ChatUtil.O00000000("Отключите FreeLock перед включением AttackAura");
      } else {
         O000000O0O0OO.O00000000();
         super.O00000000();
      }
   }

   @Override
   public void a_() {
      super.a_();
      this.O000000000OO0O();
   }

   private void O000000000OO0O() {
      this.O00000000O0OO0();
      this.O00000000OO0OO();
      this.O00000000OOO();
      O000000O00OOOO.O0000000000O();
      this.O000000000O000();
      this.O000000000O0OO();
      O000000O0O0O00.O000000000O0O();
      O000000O0O0OOO.O000000000();
      O000000O0O0O0O.O0000000000();
      if (this.O0000000000000) {
         O000000O0OO.O000000000();
      } else {
         O000000O0OO.O00000000();
      }

      O000000O0OOO0.O00000000();
      O00000000OO0 = null;
      O0000O00O00O.O00000000().O000000000("Aura");
      if (O0000000000.player != null) {
         O00000000OO0O = false;
         O00000000OO0O0 = 0L;
      }

      O00000000OOO0O = false;
      O00000000OOOO = 0.0F;
      O00000000OOO00 = 0L;
      O00000000OOOOO = 0.0F;
      O00000000OOOO0 = 0L;
      O0000000O = 0L;
      O0000000O0 = 0L;
      O0000000O00 = Integer.MIN_VALUE;
   }

   private boolean O000000000OOO() {
      return O0000000000O0O()
         ? true
         : O0000000000.player.isUsingItem()
               && O00000000O00O0.O000000000("Не бить если кушаешь")
               && !(O0000000000.player.getActiveItem().getItem() instanceof ShieldItem)
            || O0000000000.currentScreen != null && O00000000O00O0.O000000000("Не бить в контейнерах ")
            || !O0000000000.player.getMainHandStack().isIn(ItemTags.SWORDS)
               && !O0000000000.player.getMainHandStack().isIn(ItemTags.AXES)
               && O0000000000.player.getMainHandStack().getItem() != Items.MACE
               && O00000000O00O0.O000000000("Бить только оружием");
   }

   private int O00000000(Item item) {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (O0000000000.player.getInventory().getStack(var2).getItem() == item) {
               return var2;
            }
         }

         return -1;
      }
   }

   private int O000000000OOO0() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (O0000000000.player.getInventory().getStack(var1).isIn(ItemTags.SWORDS)) {
               return var1;
            }
         }

         return -1;
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (this.O0000000000000 && O00000000O0O0O.O0000000000() && O00000000O0OO.O000000000("Бинд")) {
         if (O00000000O0OO0.O0000000000() != -1 && o0000000O0O0.O00000000000() == O00000000O0OO0.O0000000000() && o0000000O0O0.O0000000000000() == 1) {
            if (O0000000000.currentScreen == null && !O0000000000O0O()) {
               this.O00000000O00();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O00 o0000000O0O00) {
      if (this.O0000000000000 && O00000000O0O0O.O0000000000() && O00000000O0OO.O000000000("Бинд")) {
         int var2 = -100 - o0000000O0O00.O00000000000();
         if (O00000000O0OO0.O0000000000() != -1 && O00000000O0OO0.O0000000000() == var2 && o0000000O0O00.O00000000000O0()) {
            if (O0000000000.currentScreen == null && !O0000000000O0O()) {
               this.O00000000O00();
            }
         }
      }
   }

   private void O000000000OOOO() {
      if (O0000000000.player == null || O0000000000.world == null || O0000000000.interactionManager == null) {
         this.O00000000O0OOO();
      } else if (O0000000O000OO != 0) {
         this.O00000000O000O();
      } else if (O00000000O0O0O.O0000000000() && !O0000000000O0O()) {
         if (O0000000000.currentScreen == null) {
            if (O00000000O0OO.O000000000("Авто")) {
               this.O00000000O();
            }
         }
      } else {
         if (O0000000O00O0) {
            this.O00000000O0000();
         }
      }
   }

   private void O00000000O() {
      LivingEntity var1 = this.O00000000O0();
      boolean var2 = var1 != null && O0000000000.player.getY() - var1.getY() >= O00000000O0OOO.O0000000000();
      if (!O0000000O00O0) {
         if (!var2) {
            O0000000O0O = false;
         } else {
            if (!O0000000O0O && O0000000000.player.getMainHandStack().getItem() != Items.MACE && this.O00000000OO() != -1) {
               O0000000O0O0 = 0;
               this.O00000000O000();
            }
         }
      } else {
         O0000000O0O0++;
         if (O0000000O00OOO || O0000000O0O0 > 40) {
            O0000000O0O = true;
            this.O00000000O0000();
         }
      }
   }

   private LivingEntity O00000000O0() {
      if (O0000000000.player != null && O0000000000.world != null) {
         float var1 = O00000000((LivingEntity)null) + O000000000O0.O0000000000() + O00000000O0OOO.O0000000000() + 2.0F;
         double var2 = O00000000((LivingEntity)null) + O000000000O0.O0000000000() + 1.5;
         double var4 = var2 * var2;
         LivingEntity var6 = null;
         double var7 = Double.MAX_VALUE;

         for (Entity var10 : O0000000000.world.getEntities()) {
            if (var10 instanceof LivingEntity var11 && !(O0000000000.player.getY() - var11.getY() < O00000000O0OOO.O0000000000())) {
               double var12 = var11.getX() - O0000000000.player.getX();
               double var14 = var11.getZ() - O0000000000.player.getZ();
               double var16 = var12 * var12 + var14 * var14;
               if (!(var16 > var4) && this.O00000000(var11, var1) && var16 < var7) {
                  var7 = var16;
                  var6 = var11;
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private void O00000000O00() {
      if (O0000000O000OO == 0 && O0000000000.player != null) {
         if (O0000000O00O0) {
            this.O00000000O0000();
         } else {
            this.O00000000O000();
         }
      }
   }

   private boolean O00000000O000() {
      if (!O0000000O00O0 && O0000000O000OO == 0 && O0000000000.player != null) {
         if (O00000000O0OO.O000000000("Авто") && System.currentTimeMillis() < O0000000O0O000) {
            return false;
         } else if (O0000000000.player.getMainHandStack().getItem() == Items.MACE) {
            return false;
         } else {
            int var1 = this.O00000000OO();
            if (var1 == -1) {
               return false;
            } else {
               int var2 = O0000000000.player.getInventory().getSelectedSlot();
               if (var1 == var2) {
                  return false;
               } else {
                  O0000000O00O0O = var2;
                  if (var1 < 9) {
                     O0000000O00OO = true;
                     O0000000O00OO0 = var1;
                     O0000000O00O00 = -1;
                  } else {
                     O0000000O00OO = false;
                     O0000000O00OO0 = -1;
                     O0000000O00O00 = var1;
                  }

                  this.O0000000000(O0000000O00OO ? "свап IN хотбар слот=" + var1 : "свап IN инвентарь слот=" + var1);
                  O0000000O000OO = 1;
                  O0000000O00O = 0;
                  this.O00000000O0O00();
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private boolean O00000000O0000() {
      if (O0000000O00O0 && O0000000O000OO == 0) {
         this.O0000000000("свап OUT старт");
         O0000000O000OO = 11;
         O0000000O00O = 0;
         this.O00000000O0O00();
         return true;
      } else {
         return false;
      }
   }

   private void O00000000O000O() {
      O0000O00O00O.O00000000().O00000000("AuraMace");
      this.O00000000O0O0O();
      if (O0000000O00O > 0) {
         O0000000O00O--;
      } else {
         switch (O0000000O000OO) {
            case 1:
               O0000000O000OO = 2;
               O0000000O00O = 0;
               break;
            case 2:
               this.O00000000O00OO();
               O0000000O00O0 = true;
               O0000000O000OO = 3;
               O0000000O00O = 1;
               break;
            case 3:
               this.O00000000O0O0();
               break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
               this.O00000000O0O0();
               break;
            case 11:
               O0000000O000OO = 12;
               O0000000O00O = 0;
               break;
            case 12:
               this.O00000000O0O();
               O0000000O0O00 = 4;
               O0000000O000OO = 13;
               O0000000O00O = 1;
               break;
            case 13:
               if (this.O00000000O00O()) {
                  this.O00000000O00O0();
               } else if (O0000000O0O00 > 0) {
                  O0000000O0O00--;
                  this.O00000000O0O();
                  O0000000O00O = 1;
               } else {
                  this.O00000000O00O0();
               }
         }
      }
   }

   private boolean O00000000O00O() {
      return O0000000000.player == null ? true : O0000000000.player.getMainHandStack().getItem() != Items.MACE;
   }

   private void O00000000O00O0() {
      this.O0000000000("восстановлено");
      O0000000O00O0 = false;
      O0000000O00O00 = -1;
      O0000000O00O0O = -1;
      O0000000O00OO = false;
      O0000000O00OO0 = -1;
      O0000000O0O00 = 0;
      O0000000O00OOO = false;
      O0000000O0O000 = System.currentTimeMillis() + 300L;
      this.O00000000O0O0();
   }

   private void O00000000O00OO() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (O0000000O00OO) {
            if (O0000000O00OO0 >= 0 && O0000000O00OO0 <= 8) {
               O0000000000.player.getInventory().setSelectedSlot(O0000000O00OO0);
            }
         } else if (O0000000O00O00 >= 0 && O0000000O00O0O >= 0 && O0000000O00O0O <= 8) {
            this.O0000000000("clickSlot IN");
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, O0000000O00O00, O0000000O00O0O, SlotActionType.SWAP, O0000000000.player);
         }
      }
   }

   private void O00000000O0O() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (O0000000O00OO) {
            if (O0000000O00O0O >= 0 && O0000000O00O0O <= 8) {
               O0000000000.player.getInventory().setSelectedSlot(O0000000O00O0O);
            }
         } else if (O0000000O00O00 >= 0 && O0000000O00O0O >= 0 && O0000000O00O0O <= 8) {
            this.O0000000000("clickSlot OUT");
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, O0000000O00O00, O0000000O00O0O, SlotActionType.SWAP, O0000000000.player);
         }
      }
   }

   private void O00000000O0O0() {
      O0000000O000OO = 0;
      O0000000O00O = 0;
      O0000O00O00O.O00000000().O000000000("AuraMace");
   }

   private void O00000000O0O00() {
      O000000O00OOOO.O0000000000O();
      O0000O00O00O.O00000000().O00000000("AuraMace");
      this.O00000000O0O0O();
   }

   private void O00000000O0O0O() {
      Sprint.O000000000O000 = 2;
      if (O0000000000.options != null) {
         O0000000000.options.sprintKey.setPressed(false);
      }

      if (O0000000000.player != null) {
         O0000000000.player.setSprinting(false);
      }
   }

   private void O0000000000(String string) {
      if (O00000000OO.O0000000000()) {
         int var2 = 0;
         int var3 = 0;
         if (O0000000000.player != null && O0000000000.player.input != null) {
            var2 = (O0000000000.player.input.playerInput.forward() ? 1 : 0) - (O0000000000.player.input.playerInput.backward() ? 1 : 0);
            var3 = (O0000000000.player.input.playerInput.left() ? 1 : 0) - (O0000000000.player.input.playerInput.right() ? 1 : 0);
         }

         ChatUtil.O00000000("[Булава] " + string + " (fwd=" + var2 + " str=" + var3 + ")");
      }
   }

   private void O00000000O0OO() {
      if (O00000000O0O0O.O0000000000() && O00000000O0OO.O000000000("Авто") && O0000000O00O0 && O0000000000.player != null) {
         if (O0000000000.player.getMainHandStack().getItem() == Items.MACE) {
            O0000000O00OOO = true;
            O0000000O0O = true;
         }
      }
   }

   private void O00000000O0OO0() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (O0000000O00O0) {
            this.O00000000O0O();
         }

         this.O00000000O0OOO();
      } else {
         this.O00000000O0OOO();
      }
   }

   private void O00000000O0OOO() {
      if (O0000000O000OO != 0) {
         O0000O00O00O.O00000000().O000000000("AuraMace");
      }

      O0000000O000OO = 0;
      O0000000O00O = 0;
      O0000000O00O0 = false;
      O0000000O00O00 = -1;
      O0000000O00O0O = -1;
      O0000000O00OO = false;
      O0000000O00OO0 = -1;
      O0000000O00OOO = false;
      O0000000O0O = false;
      O0000000O0O0 = 0;
      O0000000O0O00 = 0;
      O0000000O0O000 = 0L;
   }

   private int O00000000OO() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (O0000000000.player.getInventory().getStack(var1).getItem() == Items.MACE) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static boolean O0000000000O0O() {
      return ServerHelper.O00000000OO || ClickPearl.O000000000O00 || AutoSwap.O000000000O0O0 || AutoTotem.O000000000O;
   }

   private void O00000000OO0() {
      if (!O00000000OO00()) {
         O00000000OOOOO = 0.0F;
         O00000000OOOO0 = 0L;
      } else {
         long var1 = System.currentTimeMillis();
         if (var1 >= O00000000OOOO0 || O00000000OOOOO <= 0.0F) {
            O00000000OOOOO = ThreadLocalRandom.current().nextFloat(0.08F, 0.32F);
            O00000000OOOO0 = var1 + ThreadLocalRandom.current().nextLong(55L, 130L);
         }

         O0000000000.player.fallDistance = O00000000OOOOO;
      }
   }

   private static boolean O00000000OO00() {
      return O0000000000.player != null && O0000000000.world != null && O0000000000.player.isOnGround() && O0000000000OO();
   }

   public static boolean O0000000000OO() {
      if (O0000000000.player != null && O0000000000.world != null) {
         BlockPos var0 = BlockPos.ofFloored(O0000000000.player.getX(), O0000000000.player.getBoundingBox().minY - 0.05, O0000000000.player.getZ());
         BlockPos var1 = BlockPos.ofFloored(O0000000000.player.getX(), O0000000000.player.getBoundingBox().maxY + 0.2, O0000000000.player.getZ());
         return O00000000(var0) && O00000000(var1);
      } else {
         return false;
      }
   }

   private static boolean O00000000(BlockPos blockPos) {
      BlockState var1 = O0000000000.world.getBlockState(blockPos);
      return !var1.getCollisionShape(O0000000000.world, blockPos).isEmpty();
   }

   private static long O00000000OO000() {
      return O00000000(0L);
   }

   private static long O00000000(long l) {
      if (O00000000O00OO.O000000000("Умные криты") && O0000000000.player != null && O00000000OO0 != null) {
         long var2 = System.currentTimeMillis();
         int var4 = O00000000OO0.getId();
         if (var4 != O0000000O00 || var2 >= O0000000O || O000000O00OOOO.O0000000000OO() < 75.0F) {
            O0000000O00 = var4;
            O0000000O0 = O00000000OO00O();
            O0000000O = var2 + ThreadLocalRandom.current().nextLong(95L, 180L);
         }

         return l + O0000000O0;
      } else {
         return l;
      }
   }

   private static long O00000000OO00O() {
      long var0 = -35L;
      long var2 = 28L;
      boolean var4 = O0000000000.player.fallDistance > 0.0 || O0000000000.player.getVelocity().y < -0.0784;
      if (var4) {
         var0 -= 18L;
         var2 -= 8L;
      }

      if (O00000000OO00()) {
         var0 -= 22L;
         var2 -= 6L;
      } else if (O0000000000.player.isOnGround()) {
         var0 += 8L;
         var2 += 18L;
      }

      if (O00000000OO0.hurtTime > 0) {
         var0 = Math.max(var0, 4L);
         var2 += 34L;
      }

      double var5 = O00000000(O00000000OO0) - O000000O0O.O00000000((Entity)O00000000OO0);
      if (var5 < 0.35F) {
         var0 += 10L;
         var2 += 22L;
      } else if (var5 > 1.0) {
         var0 -= 8L;
      }

      if (var2 < var0) {
         var2 = var0;
      }

      return ThreadLocalRandom.current().nextLong(var0, var2 + 1L);
   }

   @Override
   public void O000000000() {
      this.O00000000O0OO0();
      this.O00000000OO0OO();
      this.O00000000OOO();
      O000000O00OOOO.O0000000000O();
      this.O000000000O0OO();
      O000000O0O0OOO.O000000000();
      O000000O0OO.O00000000();
      O000000O0O0OO.O000000000();
      O000000O0O0O0O.O0000000000();
      super.O000000000();
   }

   private static void O00000000OO0O() {
      if (O0000000000 != null) {
         O0000000000.execute(() -> O0000000000.setScreen(new RotationBuilderScreen()));
      }
   }

   private static void O00000000OO0O0() {
      if (O0000000000 != null) {
         O0000000000.execute(() -> O0000000000.setScreen(new AiLabScreen()));
      }
   }

   private void O00000000OO0OO() {
      if (O000000000O00.O000000000("Lony Grief")) {
         O000000O0OO000.O00000000();
      }

      if (O000000000O00.O000000000("Side Point")) {
         O000000O0OOO.O00000000();
      }
   }

   private void O00000000OOO() {
      if (O000000000O00.O000000000("Neuro")) {
         O000000O0OO00O.O00000000(O00000000O00.O0000000000());
      }
   }

   @ModuleAccess(
      O0000000000 = {"lichoday", "bitrixtime", "oblamovvv"}
   )
   static final class W31 {
      private W31() {
      }
   }
}
