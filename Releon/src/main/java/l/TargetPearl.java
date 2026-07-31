package l;

import antidaunleak.api.annotation.Native;
import fat.releon.teremok.impl.combat.Aura;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;

public class TargetPearl extends Helper242 {
   private final Helper339 stopWatch = new Helper339();
   private final Helper159 script = new Helper159();
   private final Setting5 modeSetting = new Setting5("Режим", "").method2381("Bind", "Always").method2383("Always");
   private final Setting5 targetSetting = new Setting5("Таргет", "").method2381("Aura Target", "All").method2383("Aura Target");
   private final Setting9 throwSetting = new Setting9("Бинд", "").method2705(() -> this.modeSetting.method2385("Bind"));
   private final Setting2 distanceSetting = new Setting2("Дистанция", "").method2086(10.0F).method2079(5, 15);

   public TargetPearl() {
      super("TargetPearl", "Target Pearl", Helper269.COMBAT);
      this.setup(new Helper264[]{this.modeSetting, this.targetSetting, this.throwSetting, this.distanceSetting});
   }

   @Helper104
   public void method4061(Helper389 var1) {
      if (var1.method3918() instanceof EnderPearlEntity var2) {
         mc.world
            .getPlayers()
            .stream()
            .filter(var1x -> var1x.distanceTo(var2) <= 3.0F)
            .min(Comparator.comparingDouble(var1x -> var1x.distanceTo(var2)))
            .ifPresent(var2::setOwner);
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onRotationUpdate(Event28 var1) {
      if (var1.method4225() == 0) {
         LivingEntity var2 = Aura.getInstance().getLastTarget();
         Slot var3 = Helper66.method705(Items.ENDER_PEARL);
         if (var3 == null || !this.stopWatch.method3356(1000.0)) {
            return;
         }

         if (this.modeSetting.method2385("Bind") && !Helper38.method543(this.throwSetting)) {
            return;
         }

         if (Helper38.method536()
            .filter(EnderPearlEntity.class::isInstance)
            .map(EnderPearlEntity.class::cast)
            .anyMatch(var0 -> Objects.equals(var0.getOwner(), mc.player))) {
            this.stopWatch.method3358();
            return;
         }

         Predictions var4 = Predictions.method2289();
         Helper38.method536()
            .filter(EnderPearlEntity.class::isInstance)
            .map(EnderPearlEntity.class::cast)
            .filter(
               var2x -> !Helper309.method3075(var2x.getOwner()) && (this.targetSetting.method2385("All") || var2 != null && var2.equals(var2x.getOwner()))
            )
            .min(Comparator.comparingDouble(var1x -> Helper351.method3506(Helper349.method3473(), Helper349.method3471(var4.method2295(var1x).getPos()))))
            .ifPresent(
               var3x -> {
                  HitResult var4x = var4.method2295(var3x);
                  if (var4x != null && !(mc.player.getPos().distanceTo(var4x.getPos()) <= this.distanceSetting.method2080())) {
                     Vec3d var5 = mc.player.getEyePos().add(mc.player.getPos().subtract(Helper168.method1385(1).pos));
                     float var6 = Helper349.method3469(var4x.getPos().subtract(var5)).method3333();
                     IntStream.range(-89, 89)
                        .mapToObj(var1xx -> new Helper336(var6, var1xx))
                        .filter(var3xx -> {
                           HitResult var4xx = var4.method2294(var3xx.method3329(), new EnderPearlEntity(mc.world, mc.player, var3.getStack()), 1.5);
                           return var4xx != null && var4xx.getPos().distanceTo(var4x.getPos()) <= 3.0;
                        })
                        .max(Comparator.comparingDouble(Helper336::method3334))
                        .ifPresent(
                           var2xx -> {
                              Helper351.INSTANCE
                                 .method3500(
                                    new Helper335(var2xx, var2xx.method3329()),
                                    mc.player,
                                    1,
                                    new Helper334(new Snap(), true, true),
                                    Helper153.HIGH_IMPORTANCE_3,
                                    this
                                 );
                              Helper59.method662();
                              this.script.method1314().method1307(0, () -> {
                                 Helper66.method698(Items.ENDER_PEARL, var2xx, false);
                                 Helper59.method661();
                              });
                              var3x.setOwner(null);
                              this.stopWatch.method3358();
                           }
                        );
                  }
               }
            );
      }
   }

   @Helper104
   public void method4062(Helper373 var1) {
      this.script.method1315();
   }
}
