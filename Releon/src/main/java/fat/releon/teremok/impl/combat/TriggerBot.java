package fat.releon.teremok.impl.combat;

import antidaunleak.api.annotation.Native;
import fat.releon.Releon;
import java.util.Objects;
import l.Helper104;
import l.Helper222;
import l.Setting2;
import l.Setting3;
import l.Helper242;
import l.Setting5;
import l.Setting8;
import l.Helper264;
import l.Helper269;
import l.Helper326;
import l.Helper328;
import l.Helper329;
import l.Helper331;
import l.Helper336;
import l.Helper346;
import l.Helper349;
import l.Linear;
import l.Helper351;
import l.Helper353;
import l.Event8;
import l.Event10;
import l.Helper379;
import l.Helper386;
import l.Helper38;
import l.Event28;
import l.AutoSprint;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Pair;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public class TriggerBot extends Helper242 {
   private final Helper329 targetSelector = new Helper329();
   private final Helper346 pointFinder = new Helper346();
   public LivingEntity target;
   private int sprintSuppressUntilTick = -1;
   public Setting2 attackRange = new Setting2("Дистанция удара", "Дальность атаки до цели").method2086(3.0F).method2078(1.0F, 6.0F);
   Setting8 targetType = new Setting8("Тип таргета", "Фильтрует список целей по типу")
      .method2585("Players", "Naked Players", "Mobs", "Animals", "Friends", "Armor Stand")
      .method2586("Players", "Mobs", "Animals");
   public Setting8 attackSetting = new Setting8("Настройки", "Параметры атаки")
      .method2585("Only Critical", "Break Shield", "UnPress Shield", "No Attack When Eat", "Ignore The Walls", "Hit Chance")
      .method2586("Only Critical", "Break Shield");
   public Setting2 hitChance = new Setting2("Шанс удара в %", "Шанс удара по цели")
      .method2086(100.0F)
      .method2078(1.0F, 100.0F)
      .method2081(() -> this.attackSetting.method2588("Hit Chance"));
   public Setting3 smartCrits = new Setting3("Удары на земле", "Криты только при нажатии пробела")
      .method2201(true)
      .method2199(() -> this.attackSetting.method2588("Only Critical"));
   public Setting3 tpsSync = new Setting3("Синхронизация с TPS", "Подгоняет тайминги под текущий TPS сервера").method2201(true);
   public Setting5 sprintReset = new Setting5("Режим спринта", "Sprint reset mode before attack")
      .method2381("Legit", "SpookyTime")
      .method2383("Legit")
      .method2382(() -> false);

   public TriggerBot() {
      super("TriggerBot", "Trigger Bot", Helper269.COMBAT);
      this.setup(new Helper264[]{this.attackRange, this.targetType, this.attackSetting, this.sprintReset, this.hitChance, this.smartCrits, this.tpsSync});
   }

   @Override
   public void deactivate() {
      this.target = null;
      this.sprintSuppressUntilTick = -1;
      super.deactivate();
   }

   public static TriggerBot getInstance() {
      return Helper222.method1979(TriggerBot.class);
   }

   private LivingEntity updateTarget() {
      Helper328 var1 = new Helper328(this.targetType.method2590());
      float var2 = this.attackRange.method2082();
      this.targetSelector.method3260(mc.world.getEntities(), var2, 360.0F, this.attackSetting.method2588("Ignore The Walls"));
      this.targetSelector.method3259(var1::method3251);
      return this.targetSelector.method3264();
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onRotationUpdate(Event28 var1) {
      if (!Helper38.method549()) {
         switch (var1.method4225()) {
            case 0:
               this.target = this.updateTarget();
               break;
            case 2:
               if (this.target != null) {
                  Releon.method71().method33().method3248(this.getConfig(), this);
               }
         }
      }
   }

   @Helper104
   public void onInput(Helper379 var1) {
      if (!Helper38.method549() && this.isState() && this.target != null && mc.currentScreen == null) {
         Helper331 var2 = Releon.method71().method33().method3250();
         Helper326 var3 = this.getConfig();
         boolean var4 = var3 != null
            && var2.method3283(var3, 1)
            && mc.player.distanceTo(this.target) <= this.attackRange.method2082()
            && !mc.player.isSwimming();
         if (var4) {
            AutoSprint.tickStop = Math.max(AutoSprint.tickStop, 1);
            var1.method3765(false);
            mc.player.setSprinting(false);
         }
      }
   }

   public Helper326 getConfig() {
      float var1 = this.attackRange.method2082();
      Pair var2 = this.pointFinder
         .method3385(this.target, var1, Helper351.INSTANCE.method3483(), this.getSmoothMode().method3149(), this.attackSetting.method2588("Ignore The Walls"));
      Vec3d var3 = (Vec3d)var2.getLeft();
      Box var4 = (Box)var2.getRight();
      Helper336 var5 = Helper349.method3469(var3.subtract(Objects.requireNonNull(mc.player).getEyePos()));
      return new Helper326(
         this.target, var5, var1, this.attackSetting.method2590(), null, var4, this.attackSetting.method2588("Only Critical"), this.tpsSync.method2200(), false
      );
   }

   public Helper353 getSmoothMode() {
      return new Linear();
   }

   public boolean shouldPreventSprinting() {
      if (!this.isState() || this.target == null || mc.player == null) {
         return false;
      } else if (!this.attackSetting.method2588("Only Critical")) {
         return false;
      } else if (mc.player.age <= this.sprintSuppressUntilTick) {
         return true;
      } else {
         Helper326 var1 = this.getConfig();
         if (var1 == null) {
            return false;
         } else {
            Helper331 var2 = Releon.method71().method33().method3250();
            boolean var3 = var2.method3283(var1, 4) && !var2.method3284(var1, 4);
            if (var3) {
               this.sprintSuppressUntilTick = mc.player.age + 2;
            }

            return var3;
         }
      }
   }

   @Helper104
   public void tick(Event8 var1) {
   }

   @Helper104
   public void onPacket(Helper386 var1) {
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
   }
}
