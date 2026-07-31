package l;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Helper159 {
   private final Helper339 time = new Helper339();
   private final List<Helper157> scriptSteps = Lists.newCopyOnWriteArrayList();
   private final List<Helper155> scriptTickSteps = Lists.newCopyOnWriteArrayList();
   private int currentStepIndex;
   private int currentTickStepIndex;
   private boolean interrupt;
   private Helper154 loopStrategy = new Helper158(1);

   public Helper159() {
      this.method1314();
   }

   public Helper159 method1303(int var1, Helper152 var2) {
      return this.method1306(var1, var2, () -> true, 0);
   }

   public Helper159 method1304(int var1, Helper152 var2, BooleanSupplier var3) {
      return this.method1306(var1, var2, var3, 0);
   }

   public Helper159 method1305(int var1, Helper152 var2, int var3) {
      return this.method1306(var1, var2, () -> true, var3);
   }

   public Helper159 method1306(int var1, Helper152 var2, BooleanSupplier var3, int var4) {
      this.scriptSteps.add(new Helper157(var1, var2, var3, var4));
      Collections.sort(this.scriptSteps);
      return this;
   }

   public Helper159 method1307(int var1, Helper152 var2) {
      return this.method1310(var1, var2, () -> true, 0);
   }

   public Helper159 method1308(int var1, Helper152 var2, BooleanSupplier var3) {
      return this.method1310(var1, var2, var3, 0);
   }

   public Helper159 method1309(int var1, Helper152 var2, int var3) {
      return this.method1310(var1, var2, () -> true, var3);
   }

   public Helper159 method1310(int var1, Helper152 var2, BooleanSupplier var3, int var4) {
      this.scriptTickSteps.add(new Helper155(var1, var2, var3, var4));
      Collections.sort(this.scriptTickSteps);
      return this;
   }

   public void method1311() {
      this.time.method3358();
   }

   public void method1312() {
      this.currentStepIndex = 0;
      this.currentTickStepIndex = 0;
   }

   public Helper159 method1313() {
      if (this.method1317()) {
         this.method1314();
      }

      return this;
   }

   public Helper159 method1314() {
      this.scriptSteps.clear();
      this.scriptTickSteps.clear();
      this.method1311();
      this.method1312();
      return this;
   }

   public void method1315() {
      if ((!this.scriptSteps.isEmpty() || !this.scriptTickSteps.isEmpty()) && !this.interrupt) {
         this.scriptSteps.forEach(var1 -> {
            if (this.currentStepIndex < this.scriptSteps.size()) {
               Helper157 var2 = this.scriptSteps.get(this.currentStepIndex);
               if (var2.method1297().getAsBoolean() && this.time.method3356(var2.method1295())) {
                  var2.method1296().perform();
                  this.currentStepIndex++;
                  this.method1311();
                  if (this.loopStrategy.method1281(this.currentStepIndex, this.scriptSteps.size())) {
                     this.method1312();
                     this.loopStrategy.method1282();
                  }
               }
            }
         });
         this.scriptTickSteps.forEach(var1 -> {
            if (this.currentTickStepIndex < this.scriptTickSteps.size()) {
               Helper155 var2 = this.scriptTickSteps.get(this.currentTickStepIndex);
               if (var2.method1288().getAsBoolean() && var2.method1286() <= 0) {
                  var2.method1287().perform();
                  this.currentTickStepIndex++;
                  this.method1311();
                  if (this.loopStrategy.method1281(this.currentTickStepIndex, this.scriptTickSteps.size())) {
                     this.method1312();
                     this.loopStrategy.method1282();
                  }
               }

               var2.method1285();
            }
         });
         this.currentStepIndex = Math.min(this.currentStepIndex, this.scriptSteps.size());
         this.currentTickStepIndex = Math.min(this.currentTickStepIndex, this.scriptTickSteps.size());
      }
   }

   public Helper159 method1316(Helper154 var1) {
      this.loopStrategy = var1;
      return this;
   }

   public boolean method1317() {
      return this.currentStepIndex >= this.scriptSteps.size()
         && this.currentTickStepIndex >= this.scriptTickSteps.size()
         && !this.interrupt
         && this.loopStrategy.method1283();
   }

   public Helper339 method1318() {
      return this.time;
   }

   public List<Helper157> method1319() {
      return this.scriptSteps;
   }

   public List<Helper155> method1320() {
      return this.scriptTickSteps;
   }

   public int method1321() {
      return this.currentStepIndex;
   }

   public int method1322() {
      return this.currentTickStepIndex;
   }

   public boolean method1323() {
      return this.interrupt;
   }

   public Helper154 method1324() {
      return this.loopStrategy;
   }

   public void method1325(int var1) {
      this.currentStepIndex = var1;
   }

   public void method1326(int var1) {
      this.currentTickStepIndex = var1;
   }

   public void method1327(boolean var1) {
      this.interrupt = var1;
   }
}
