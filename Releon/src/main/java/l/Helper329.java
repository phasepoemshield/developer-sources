package l;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class Helper329 implements Helper160 {
   private final Helper346 pointFinder = new Helper346();
   private LivingEntity currentTarget = null;
   private Stream<LivingEntity> potentialTargets;

   public Helper329() {
   }

   public void method3257(LivingEntity var1) {
      if (this.currentTarget == null) {
         this.currentTarget = var1;
      }
   }

   public void method3258() {
      this.currentTarget = null;
   }

   public void method3259(Predicate<LivingEntity> var1) {
      this.method3263(var1).ifPresent(this::method3257);
      if (this.currentTarget != null && !var1.test(this.currentTarget)) {
         this.method3258();
      }
   }

   public void method3260(Iterable<Entity> var1, float var2, float var3, boolean var4) {
      if (this.currentTarget != null
         && (!this.pointFinder.method3390(this.currentTarget, var2, var4) || this.method3261(this.currentTarget, var2, var4) > var3)) {
         this.method3258();
      }

      this.potentialTargets = this.method3262(var1, var2, var3, var4);
   }

   private double method3261(LivingEntity var1, float var2, boolean var3) {
      Vec3d var4 = this.pointFinder.method3385(var1, var2, Helper351.INSTANCE.method3483(), new Linear().method3149(), var3).getLeft();
      return Helper351.method3506(Helper349.method3473(), Helper349.method3471(var4));
   }

   private Stream<LivingEntity> method3262(Iterable<Entity> var1, float var2, float var3, boolean var4) {
      return StreamSupport.<Entity>stream(var1.spliterator(), false)
         .filter(LivingEntity.class::isInstance)
         .map(LivingEntity.class::cast)
         .filter(var4x -> this.pointFinder.method3390(var4x, var2, var4) && this.method3261(var4x, var2, var4) < var3)
         .sorted(Comparator.comparingDouble(var0 -> var0.distanceTo(mc.player)));
   }

   private Optional<LivingEntity> method3263(Predicate<LivingEntity> var1) {
      return this.potentialTargets.filter(var1).findFirst();
   }

   public Helper346 getPointFinder() {
      return this.pointFinder;
   }

   public LivingEntity method3264() {
      return this.currentTarget;
   }

   public Stream<LivingEntity> method3265() {
      return this.potentialTargets;
   }
}
