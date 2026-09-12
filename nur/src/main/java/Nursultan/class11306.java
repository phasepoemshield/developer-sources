package Nursultan;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11306 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public boolean y_init;

   private void L() {
      class11938.z().N(class11967.L());
   }

   public synchronized void L(class11290 var1) {
      ((Deque)this.y_0).add(class11323.L(var1.u()));
      this.y();
   }

   public class11306(class11325 var1) {
      this.Z();
      this.y_0 = new ArrayDeque();
      this.y_1 = new HashSet();
      this.y_2 = var1;
   }

   static {
      i();
      u();
   }

   private void Z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_3 = false;
      }
   }

   private static void i() {
   }

   private void U() {
      if (!(Boolean)this.y_3) {
         this.y_3 = true;
         ((Logger)N_0).warn("preset sync deferred, retrying list in {} ticks", 1500);
         class11938.Z().y(1500, () -> {
            this.y_3 = false;
            if (class11938.z().R()) {
               this.L();
            }
         });
      }
   }

   public synchronized void u(class11290 var1) {
      ((Deque)this.y_0).add(class11323.N(var1.u()));
      this.y();
   }

   private static void u() {
      N_0 = null;
      N_1 = 1500;
   }

   private void y(class11827 var1) {
      ((class11325)this.y_2).N(var1.u()).ifPresent(var2 -> {
         var2.N(var1.L());
         var2.N(var1.N());
         var2.L(var1.N());
         var2.u(var1.i());
         if (var2.M() == class11296.DIRTY) {
            var2.N(class11296.SYNCED);
         }

         ((class11325)this.y_2).N(var2);
      });
   }

   public synchronized void y(class11290 var1) {
      ((Deque)this.y_0).add(class11323.y(var1.u()));
      this.y();
   }

   private void y() {
      class11405 var1 = class11938.z();
      if (var1.R()) {
         while (!((Deque)this.y_0).isEmpty()) {
            class11323 var2 = (class11323)((Deque)this.y_0).poll();
            class11290 var3 = ((class11325)this.y_2).N(var2.N()).orElse(null);
            if (var3 != null) {
               switch (((int[])class11314.N_1)[var2.y().ordinal()]) {
                  case 1:
                     if (var3.N() && var3.U() != null) {
                        var1.N(class11967.N(var3.u(), var3.i(), var3.U(), var3.L()));
                     }
                     break;
                  case 2:
                     if (!var3.E() && var3.N() && var3.U() != null) {
                        var1.N(class11967.N(var3.Z(), var3.U(), var3.L()));
                     }
                     break;
                  case 3:
                     if (var3.E()) {
                        ((class11325)this.y_2).y(var3.u());
                     } else {
                        var1.N(class11967.N(var3.Z()));
                     }
                     break;
                  case 4:
                     if (!var3.E()) {
                        var1.N(class11967.N(var3.Z(), var3.i()));
                     }
                     break;
                  case 5:
                     if (var3.E()) {
                        ((Set)this.y_1).remove(var3.u());
                     } else {
                        var1.N(class11967.y(var3.Z()));
                     }
               }
            }
         }
      }
   }

   private String y(class09274 var1) {
      class09279 var2 = var1.y();

      return switch (((int[])class11314.N_0)[var1.N().ordinal()]) {
         case 1 -> "list: " + ((class09272)var2).N().size() + " entries";
         case 2 -> {
            class11827 var10 = ((class09291)var2).N();
            yield "create: id=" + var10.R() + " name=" + var10.L();
         }
         case 3 -> {
            class09292 var9 = (class09292)var2;
            class11827 var11 = var9.N();
            int var12 = var9.y() == null ? 0 : var9.y().length;
            yield "update: id=" + var11.R() + " name=" + var11.L() + " bytes=" + var12;
         }
         case 4 -> {
            class09261 var8 = (class09261)var2;
            class11827 var4 = var8.N();
            int var5 = var8.L() == null ? 0 : var8.L().length;
            yield "get: id=" + var4.R() + " name=" + var4.L() + " bytes=" + var5;
         }
         case 5 -> {
            class09293 var7 = (class09293)var2;
            yield "delete: id=" + var7.N();
         }
         case 6 -> {
            class11827 var6 = ((class09258)var2).N();
            yield "rename: id=" + var6.R() + " name=" + var6.L();
         }
         case 7 -> {
            class09281 var3 = (class09281)var2;
            yield "nack: id=" + var3.y() + " code=" + var3.L();
         }
         default -> throw new MatchException(null, null);
      };
   }

   public synchronized void N(UUID var1) {
      ((Set)this.y_1).add(var1);
      ((Deque)this.y_0).add(class11323.u(var1));
      this.y();
   }

   public synchronized void N(class09274 var1) {
      switch (((int[])class11314.N_0)[var1.N().ordinal()]) {
         case 1:
            this.N(((class09272)var1.y()).N());
            break;
         case 2:
            this.N(((class09291)var1.y()).N());
            break;
         case 3:
            this.N((class09292)var1.y());
            break;
         case 4:
            this.N((class09261)var1.y());
            break;
         case 5:
            this.N((class09293)var1.y());
            break;
         case 6:
            this.y(((class09258)var1.y()).N());
            break;
         case 7:
            this.N((class09281)var1.y());
      }

      this.y();
   }

   private void N(class09292 var1) {
      class11827 var2 = var1.N();
      ((class11325)this.y_2).N(var2.u()).ifPresent(var3 -> {
         var3.N(var2.N());
         var3.L(var2.N());
         var3.u(var2.i());
         var3.N(var1.L());
         var3.N(var1.y());
         var3.N(var1.y() != null && var1.y().length > 0);
         var3.N(class11296.SYNCED);
         ((class11325)this.y_2).N(var3);
      });
   }

   private void N(class09293 var1) {
      ((class11325)this.y_2).N(var1.N()).ifPresent(var1x -> ((class11325)this.y_2).y(var1x.u()));
   }

   private void N(List<class11827> var1) {
      HashSet var2 = new HashSet();

      for (class11827 var4 : var1) {
         var2.add(var4.u());
         class11290 var5 = ((class11325)this.y_2).N(var4.u()).orElse(null);
         if (var5 == null) {
            class11290 var11 = new class11290(var4.u(), var4.R(), var4.L(), var4.y(), var4.N(), var4.N(), var4.i(), class11296.SYNCED, 1, false, null);
            ((class11325)this.y_2).N(var11);
         } else {
            switch (((int[])class11314.N_2)[var5.M().ordinal()]) {
               case 1:
                  boolean var10 = var4.i() != var5.R();
                  var5.y(var4.R());
                  var5.u(var4.i());
                  var5.N(var4.L());
                  var5.y(var4.y());
                  if (var4.N() > var5.y()) {
                     var5.N(var4.N());
                     var5.L(var4.N());
                  }

                  if (var10) {
                     var5.N(false);
                     var5.N(null);
                  }

                  ((class11325)this.y_2).N(var5);
                  break;
               case 2:
                  var5.y(var4.R());
                  var5.u(var4.i());
                  boolean var6 = !var4.L().equals(var5.i());
                  boolean var7 = var5.N() && var5.U() != null;
                  if (var6) {
                     ((Deque)this.y_0).add(class11323.i(var5.u()));
                  }

                  if (var7) {
                     ((Deque)this.y_0).add(class11323.L(var5.u()));
                  }

                  if (!var6 && !var7) {
                     if (var4.N() > var5.y()) {
                        var5.N(var4.N());
                        var5.L(var4.N());
                     }

                     var5.N(class11296.SYNCED);
                     ((class11325)this.y_2).N(var5);
                  }
                  break;
               case 3:
                  var5.y(var4.R());
                  var5.u(var4.i());
                  ((class11325)this.y_2).N(var5);
                  ((Deque)this.y_0).add(class11323.L(var5.u()));
                  break;
               case 4:
                  var5.y(var4.R());
                  var5.u(var4.i());
                  ((Deque)this.y_0).add(class11323.N(var5.u()));
            }
         }
      }

      for (class11290 var9 : ((class11325)this.y_2).L()) {
         if (!var2.contains(var9.u())) {
            switch (((int[])class11314.N_2)[var9.M().ordinal()]) {
               case 1:
               case 4:
                  ((class11325)this.y_2).y(var9.u());
                  break;
               case 2:
                  if (!var9.E()) {
                     var9.y(0L);
                     var9.u(0L);
                     var9.N(class11296.LOCAL);
                     ((class11325)this.y_2).N(var9);
                  }

                  ((Deque)this.y_0).add(class11323.y(var9.u()));
                  break;
               case 3:
                  ((Deque)this.y_0).add(class11323.y(var9.u()));
            }
         }
      }

      this.R();
      this.y();
   }

   public synchronized void N(class11290 var1) {
      ((Deque)this.y_0).add(class11323.i(var1.u()));
      this.y();
   }

   private void N(class09261 var1) {
      class11827 var2 = var1.N();
      class11290 var3 = ((class11325)this.y_2).N(var2.u()).orElse(null);
      if (var3 == null) {
         var3 = new class11290(var2.u(), var2.R(), var2.L(), var2.y(), var2.N(), var2.N(), var2.i(), class11296.SYNCED, var1.y(), true, var1.L());
      } else {
         var3.y(var2.R());
         var3.N(var2.L());
         var3.y(var2.y());
         var3.N(var2.N());
         var3.L(var2.N());
         var3.u(var2.i());
         var3.N(var1.y());
         var3.N(var1.L());
         var3.N(var1.L() != null && var1.L().length > 0);
         if (var3.M() == class11296.LOCAL || var3.M() == class11296.DIRTY) {
            var3.N(class11296.SYNCED);
         }
      }

      ((class11325)this.y_2).N(var3);
      if (((Set)this.y_1).remove(var2.u()) && var3.N() && var3.U() != null) {
         try {
            new class11291().N(var3.L(), var3.U());
         } catch (RuntimeException var5) {
            ((Logger)N_0).error("Failed to apply preset {}", var3.i(), var5);
         }
      }
   }

   private void N(class11827 var1) {
      ((class11325)this.y_2).N(var1.u()).ifPresent(var2 -> {
         var2.y(var1.R());
         var2.N(var1.L());
         var2.y(var1.y());
         var2.N(var1.N());
         var2.L(var1.N());
         var2.u(var1.i());
         var2.N(class11296.SYNCED);
         ((class11325)this.y_2).N(var2);
      });
   }

   private void N(class09281 var1) {
      class11790 var2 = class11790.N(var1.L());
      if (var2 == null) {
         ((Logger)N_0).warn("preset NACK with unknown error code {}", var1.L());
      } else if (var2 == class11790.staticFields_1e32a81813f643834bbda8f07cef7f07f_0) {
         this.U();
      } else {
         class11290 var3 = var1.y() > 0L ? ((class11325)this.y_2).N(var1.y()).orElse(null) : ((class11325)this.y_2).N(var1.N()).orElse(null);
         if (var3 == null) {
            ((Logger)N_0).warn("preset NACK for unknown id={} clientId={}", var1.y(), var1.N());
         } else {
            ((Set)this.y_1).remove(var3.u());
            if (var2 == class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_1) {
               this.U();
            }

            ((Logger)N_0).warn("preset NACK id={} clientId={} code={}", var1.y(), var1.N(), var2);
         }
      }
   }

   public synchronized void N() {
      ((Deque)this.y_0).clear();
      ((Set)this.y_1).clear();
      this.y_3 = false;
      this.L();
   }

   private void R() {
      UUID var1 = class11938.M().N(class11521.class).y();
      if (var1 != null) {
         class11290 var2 = ((class11325)this.y_2).N(var1).orElse(null);
         if (var2 != null && !var2.E()) {
            if (!var2.N() || var2.U() == null) {
               ((Set)this.y_1).add(var1);
               ((Deque)this.y_0).add(class11323.u(var1));
            }
         }
      }
   }
}
