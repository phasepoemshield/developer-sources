package Nursultan;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11317 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;

   private synchronized void L(class09378 var1) {
      if (((Set)this.N_2).remove(var1)) {
         ((Deque)this.N_0).add(class11283.y(var1));
         this.B();
      }
   }

   private synchronized void M() {
      this.N_4 = false;
      if (class11938.z().R()) {
         ((Deque)this.N_0).add(class11283.N());
         this.B();
      }
   }

   public class11317(class11519 var1) {
      this.z();
      this.N_0 = new ArrayDeque();
      this.N_1 = new EnumMap<>(class09378.class);
      this.N_2 = EnumSet.noneOf(class09378.class);
      this.N_3 = var1;
   }

   static {
      y();
   }

   private void B() {
      class11405 var1 = class11938.z();
      if (var1.R()) {
         while (!((Deque)this.N_0).isEmpty()) {
            class11283 var2 = (class11283)((Deque)this.N_0).poll();
            switch (((int[])class11294.N_1)[var2.y().ordinal()]) {
               case 1:
                  var1.N(class11948.N());
                  break;
               case 2:
                  var1.N(class11948.N(var2.L().N()));
                  break;
               case 3:
                  if (!(Boolean)this.N_4) {
                     class11531 var3 = ((class11519)this.N_3).N(var2.L()).orElse(null);
                     if (var3 != null && !((Map)this.N_1).containsKey(var2.L())) {
                        try {
                           byte[] var4 = class11529.N((class11488)var3);
                           ((Map)this.N_1).put(var2.L(), var4);
                           var1.N(class11948.N(var2.L().N(), var4));
                        } catch (IOException var5) {
                           ((Logger)y_0).error("Failed to serialize {} for push", var2.L(), var5);
                        }
                     }
                  }
            }
         }
      }
   }

   private void Z() {
      if (!(Boolean)this.N_4) {
         this.N_4 = true;
         ((Logger)y_0).warn("user-config operations rate-limited, retrying in {} ticks", 1500);
         class11938.Z().y(1500, this::M);
      }
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = false;
      }
   }

   private static void y() {
      y_0 = null;
      y_1 = 1500;
      y_2 = 120;
   }

   private void N(class09267 var1) {
      HashSet var2 = new HashSet();

      for (class10732 var4 : var1.N()) {
         class09378 var5 = var4.N();
         if (var5 != null) {
            var2.add(var5);
            class11531 var6 = ((class11519)this.N_3).N(var5).orElse(null);
            if (var6 != null) {
               if (var6.y()) {
                  ((Deque)this.N_0).add(class11283.y(var5));
               } else {
                  ((Deque)this.N_0).add(class11283.N(var5));
               }
            }
         }
      }

      for (class11531 var8 : ((class11519)this.N_3).N()) {
         if (!var2.contains(var8.i()) && !((class11488)var8).d_()) {
            ((Deque)this.N_0).add(class11283.y(var8.i()));
         }
      }
   }

   public synchronized void N(class09283 var1) {
      switch (((int[])class11294.N_0)[var1.y().ordinal()]) {
         case 1:
            this.N((class09267)var1.N());
            break;
         case 2:
            this.N((class09275)var1.N());
            break;
         case 3:
            this.N((class09287)var1.N());
            break;
         case 4:
            this.N((class09265)var1.N());
      }

      this.B();
   }

   private void N(class09275 var1) {
      class09378 var2 = class09378.N(var1.y());
      if (var2 != null) {
         class11531 var3 = ((class11519)this.N_3).N(var2).orElse(null);
         if (var3 != null) {
            if (var3.y()) {
               ((Deque)this.N_0).add(class11283.y(var2));
            } else {
               try (class11299 var4 = class11299.N()) {
                  class11529.N((class11488)var3, var1.N());
                  var3.N(false);
                  ((class11519)this.N_3).N(var3);
               } catch (IOException var9) {
                  ((Logger)y_0).error("Failed to deserialize blob for {}", var2, var9);
               }
            }
         }
      }
   }

   public synchronized void N(class09378 var1) {
      if (((Set)this.N_2).add(var1)) {
         class11938.Z().y(120, () -> this.L(var1));
      }
   }

   private void N(class09265 var1) {
      class09378 var2 = class09378.N(var1.y());
      if (var2 != null) {
         ((Map)this.N_1).remove(var2);
         if (class11790.N(var1.N()) == class11790.staticFields_1e32a81813f643834bbda8f07cef7f07f_0) {
            this.Z();
         } else {
            class11531 var3 = ((class11519)this.N_3).N(var2).orElse(null);
            if (var3 != null) {
               var3.N(false);
               ((class11519)this.N_3).N(var3);
            }
         }
      }
   }

   private void N(class09287 var1) {
      class09378 var2 = class09378.N(var1.y());
      if (var2 != null) {
         class11531 var3 = ((class11519)this.N_3).N(var2).orElse(null);
         if (var3 != null) {
            byte[] var4 = (byte[])((Map)this.N_1).remove(var2);
            if (var4 != null) {
               try {
                  byte[] var5 = class11529.N((class11488)var3);
                  if (Arrays.equals(var4, var5)) {
                     var3.N(false);
                     ((class11519)this.N_3).N(var3);
                  } else {
                     var3.N(true);
                     ((class11519)this.N_3).N(var3);
                     this.N(var2);
                  }
               } catch (IOException var6) {
                  ((Logger)y_0).error("Failed to serialize {} after ack", var2, var6);
               }
            }
         }
      }
   }

   public synchronized void N() {
      ((Deque)this.N_0).clear();
      ((Map)this.N_1).clear();
      ((Set)this.N_2).clear();
      this.N_4 = false;
      ((Deque)this.N_0).add(class11283.N());
      this.B();
   }
}
