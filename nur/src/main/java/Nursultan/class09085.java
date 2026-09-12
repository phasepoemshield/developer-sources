package Nursultan;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry;
import java.util.ArrayList;
import java.util.Iterator;

public class class09085 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   public class09086 L() {
      this.i();
      return ((class09083)this.N_2).y();
   }

   public boolean L(class09083 var1) {
      return var1 != null
         && (Integer)var1.N_0 == ((class09064)this.N_0).m()
         && (Integer)var1.N_1 == ((class09064)this.N_0).B()
         && ((class09096)var1.N_2).equals(((class09064)this.N_0).i((Integer)var1.N_0, (Integer)var1.N_1))
         && (class09057)var1.N_3 != null
         && ((class09057)var1.N_3).y()
         && !(Boolean)var1.N_6;
   }

   private class09083 L(int var1, int var2) {
      class09096 var3 = ((class09064)this.N_0).i(var1, var2);
      class09060 var4 = class09060.N();
      class09057 var5 = var4.N(var3.y());
      class09057 var6 = var3.L() == null ? null : var4.N(var3.L());
      return new class09083(var1, var2, var3, var5, var6);
   }

   public void M(class09083 var1) {
      if (var1 != null) {
         var1.N_6 = false;
         var1.N_7 = System.currentTimeMillis();
      }
   }

   public class09057 M() {
      if (!((class09064)this.N_0).v()) {
         return null;
      } else {
         this.i();
         this.u();
         return (class09057)((class09083)this.N_2).N_4;
      }
   }

   public class09085(class09064 var1) {
      this.U();
      this.N_1 = new Object2ObjectOpenHashMap();
      this.N_0 = var1;
   }

   public void B() {
      ObjectIterator var1 = ((Object2ObjectOpenHashMap)this.N_1).values().iterator();

      while (var1.hasNext()) {
         Iterator var3 = ((ArrayList)var1.next()).iterator();

         while (var3.hasNext()) {
            ((class09083)var3.next()).N();
         }
      }

      ((Object2ObjectOpenHashMap)this.N_1).clear();
      this.N_2 = null;
   }

   public class09086 B(class09083 var1) {
      return var1 == null ? null : var1.y();
   }

   private class09083 Z(class09083 var1) {
      class09062 var2 = new class09062((Integer)var1.N_0, (Integer)var1.N_1);
      ((ArrayList)((Object2ObjectOpenHashMap)this.N_1).computeIfAbsent(var2, var0 -> new ArrayList(1))).add(var1);
      return var1;
   }

   public boolean Z() {
      ObjectIterator var1 = ((Object2ObjectOpenHashMap)this.N_1).values().iterator();

      while (var1.hasNext()) {
         for (class09083 var4 : (ArrayList)var1.next()) {
            if ((class09057)var4.N_3 != null && ((class09057)var4.N_3).y()) {
               return true;
            }
         }
      }

      return false;
   }

   public void i() {
      int var1 = ((class09064)this.N_0).m();
      int var2 = ((class09064)this.N_0).B();
      if ((class09083)this.N_2 != null
         && (Integer)((class09083)this.N_2).N_0 == var1
         && (Integer)((class09083)this.N_2).N_1 == var2
         && (class09057)((class09083)this.N_2).N_3 != null
         && ((class09057)((class09083)this.N_2).N_3).y()) {
         ((class09064)this.N_0).L(var1, var2);
      } else {
         this.N_2 = this.N(var1, var2, false);
         ((class09064)this.N_0).L((Integer)((class09083)this.N_2).N_0, (Integer)((class09083)this.N_2).N_1);
         this.u();
      }
   }

   public class09057 i(class09083 var1) {
      return var1 == null ? null : (class09057)var1.N_3;
   }

   private void U() {
   }

   public class09057 u(class09083 var1) {
      return var1 == null ? null : (class09057)var1.N_4;
   }

   public void u() {
      if ((class09083)this.N_2 != null) {
         ((class09083)this.N_2).N_7 = System.currentTimeMillis();
      }
   }

   public void y(class09083 var1) {
      if (var1 != null) {
         this.Z(var1);
         this.M(var1);
      }
   }

   public void y(int var1, int var2) {
      if ((class09083)this.N_2 == null || (Integer)((class09083)this.N_2).N_0 != var1 || (Integer)((class09083)this.N_2).N_1 != var2) {
         this.N_2 = this.N(new class09062(var1, var2));
      }
   }

   public boolean y() {
      return (class09083)this.N_2 != null && (class09057)((class09083)this.N_2).N_4 != null && ((class09057)((class09083)this.N_2).N_4).y();
   }

   public class09083 N(int var1, int var2) {
      return this.L(var1, var2);
   }

   private class09083 N(class09062 var1) {
      ArrayList var2 = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get(var1);
      return var2 != null && !var2.isEmpty() ? (class09083)var2.getFirst() : null;
   }

   public class09083 N() {
      class09083 var1 = this.N(((class09064)this.N_0).m(), ((class09064)this.N_0).B(), true);
      var1.N_6 = true;
      this.N_2 = var1;
      ((class09064)this.N_0).L((Integer)var1.N_0, (Integer)var1.N_1);
      var1.N_7 = System.currentTimeMillis();
      return var1;
   }

   private class09083 N(int var1, int var2, boolean var3) {
      class09062 var4 = new class09062(var1, var2);
      ArrayList var5 = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get(var4);
      if (var5 != null) {
         for (class09083 var7 : var5) {
            if (!var3 || !(Boolean)var7.N_6) {
               return var7;
            }
         }
      } else {
         var5 = new ArrayList(1);
         ((Object2ObjectOpenHashMap)this.N_1).put(var4, var5);
      }

      class09083 var8 = this.L(var1, var2);
      var5.add(var8);
      return var8;
   }

   public class09083 N(class09083 var1) {
      class09083 var2 = var1 == null ? this.N() : this.Z(var1);
      var2.N_6 = true;
      this.N_2 = var2;
      ((class09064)this.N_0).L((Integer)var2.N_0, (Integer)var2.N_1);
      var2.N_7 = System.currentTimeMillis();
      return var2;
   }

   public void N(long var1, long var3) {
      ArrayList var5 = new ArrayList();
      ObjectIterator var6 = ((Object2ObjectOpenHashMap)this.N_1).object2ObjectEntrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         ArrayList var8 = (ArrayList)var7.getValue();
         var8.removeIf(var5x -> {
            if (!var5x.N(var1, var3, ((class09064)this.N_0).Z())) {
               return false;
            } else {
               if (var5x == (class09083)this.N_2) {
                  this.N_2 = null;
               }

               var5x.N();
               return true;
            }
         });
         if (var8.isEmpty()) {
            var5.add((class09062)var7.getKey());
         }
      }

      for (class09062 var10 : var5) {
         ((Object2ObjectOpenHashMap)this.N_1).remove(var10);
      }
   }

   public class09057 R() {
      this.i();
      this.u();
      return (class09057)((class09083)this.N_2).N_3;
   }

   public class09083 R(class09083 var1) {
      if (var1 == null) {
         return null;
      } else {
         class09062 var2 = new class09062((Integer)var1.N_0, (Integer)var1.N_1);
         ArrayList var3 = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get(var2);
         if (var3 != null) {
            var3.remove(var1);
            if (var3.isEmpty()) {
               ((Object2ObjectOpenHashMap)this.N_1).remove(var2);
            }
         }

         if ((class09083)this.N_2 == var1) {
            this.N_2 = this.N(var2);
         }

         var1.N_6 = false;
         var1.N_7 = System.currentTimeMillis();
         return var1;
      }
   }
}
