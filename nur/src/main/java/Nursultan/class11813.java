package Nursultan;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11813 {
   public static Object N_0 = LogManager.getLogger(String.class);

   private static void L() {
      N_0 = null;
   }

   private class11813() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
      i();
      L();
   }

   private static void i() {
   }

   private static void y() {
   }

   private static void N(List<class11535> var0, Consumer<String> var1) {
      for (class11535 var3 : var0) {
         N(var1, () -> var3.E().N());
      }
   }

   private static void N(Consumer<String> var0, Supplier<String> var1) {
      try {
         String var2 = (String)var1.get();
         if (var2 != null && !var2.isEmpty()) {
            var0.accept(var2);
         }
      } catch (Throwable var3) {
      }
   }

   private static void N(Collection<class11536<?>> var0, Consumer<String> var1, Consumer<String> var2) {
      for (Object var4 : var0) {
         N(var1, ((class11536)var4).P()::N);
         Objects.requireNonNull(var4);
         switch (var4) {
            case class11523 var10:
               N(((class11523)var4).L(), var2);
               break;
            case class11517 var11:
               N(((class11517)var4).L(), var2);
               break;
            case class11533 var9:
               N(var1, var9::L);
               break;
         }
      }
   }

   public static void N() {
      if ((Boolean)class11938.L_4) {
         System.out.println();
         LinkedHashSet var0 = new LinkedHashSet();
         LinkedHashSet var1 = new LinkedHashSet();
         Consumer var2 = var1x -> {
            if (var1x != null && !var1x.isEmpty()) {
               var0.add(var1x);
            }
         };
         Consumer var3 = var1x -> {
            if (var1x != null && !var1x.isEmpty()) {
               var1.add(var1x);
            }
         };

         for (class11067 var5 : class11938.u().NN()) {
            N(var2, var5.B()::N);
            N(var5.w().values(), var2, var3);
         }

         for (class11999 var7 : class11999.values()) {
            Set<String> var9 = new class12020(var7, var7).y().keySet();
            TreeSet var10 = new TreeSet(var0);
            var10.removeAll(var9);
            TreeSet var11 = new TreeSet<>(var9);
            var11.removeAll(var0);
            var11.removeAll(var1);
            var11.removeIf(var0x -> !var0x.startsWith("module."));
            ((Logger)N_0).error("==== Locale: {} ====", var7.N());
            if (var10.isEmpty()) {
               ((Logger)N_0).error("[MISSING] отсутствует: 0");
            } else {
               ((Logger)N_0).error("[MISSING] отсутствуют ключи ({}):", var10.size());

               for (String var13 : var10) {
                  ((Logger)N_0).error(" - {}", var13);
               }
            }

            if (var11.isEmpty()) {
               ((Logger)N_0).error("[UNUSED] неиспользуемых описаний/настроек: 0");
            } else {
               ((Logger)N_0).error("[UNUSED] ключи присутствуют, но не используются ({}):", var11.size());

               for (String var17 : var11) {
                  ((Logger)N_0).error(" - {}", var17);
               }
            }

            System.out.println();
         }
      }
   }
}
