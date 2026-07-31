package l;

import java.util.List;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;

public class Helper326 {
   private final LivingEntity target;
   private final Helper336 angle;
   private final float maximumRange;
   private final boolean onlyCritical;
   private final boolean shouldBreakShield;
   private final boolean shouldUnPressShield;
   private final boolean eatAndAttack;
   private final boolean multiPoints;
   private final boolean ignoreWalls;
   private final boolean tpsSync;
   private final boolean legacyPvp;
   private final Box box;
   private final Setting5 aimMode;

   public Helper326(LivingEntity var1, Helper336 var2, float var3, List<String> var4, Setting5 var5, Box var6) {
      this(var1, var2, var3, var4, var5, var6, var4.contains("Only Critical"), false, false);
   }

   public Helper326(LivingEntity var1, Helper336 var2, float var3, List<String> var4, Setting5 var5, Box var6, boolean var7) {
      this(var1, var2, var3, var4, var5, var6, var7, false, false);
   }

   public Helper326(LivingEntity var1, Helper336 var2, float var3, List<String> var4, Setting5 var5, Box var6, boolean var7, boolean var8, boolean var9) {
      this.target = var1;
      this.angle = var2;
      this.maximumRange = var3;
      this.onlyCritical = var7;
      this.shouldBreakShield = var4.contains("Break Shield");
      this.shouldUnPressShield = var4.contains("UnPress Shield");
      this.multiPoints = var4.contains("Multi Points");
      this.tpsSync = var8;
      this.legacyPvp = var9;
      this.eatAndAttack = var4.contains("No Attack When Eat");
      this.ignoreWalls = var4.contains("Ignore The Walls") || var4.contains("Hit Through Walls") || var4.contains("Attack Through Walls");
      this.box = var6;
      this.aimMode = var5;
   }

   public LivingEntity getTarget() {
      return this.target;
   }

   public Helper336 method3236() {
      return this.angle;
   }

   public float method3237() {
      return this.maximumRange;
   }

   public boolean method3238() {
      return this.onlyCritical;
   }

   public boolean method3239() {
      return this.shouldBreakShield;
   }

   public boolean method3240() {
      return this.shouldUnPressShield;
   }

   public boolean method3241() {
      return this.eatAndAttack;
   }

   public boolean method3242() {
      return this.multiPoints;
   }

   public boolean method3243() {
      return this.ignoreWalls;
   }

   public boolean method3244() {
      return this.tpsSync;
   }

   public boolean method3245() {
      return this.legacyPvp;
   }

   public Box getBox() {
      return this.box;
   }

   public Setting5 getAimMode() {
      return this.aimMode;
   }
}
