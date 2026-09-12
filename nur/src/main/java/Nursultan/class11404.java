package Nursultan;

import java.net.URI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class06202;
import minecraft.class07536;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11404 {
   private static String[] i;
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1 = new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_0, null, null);
   public static Object N_2 = new AtomicReference<>(N_1);
   public static Object N_3;

   public static void L() {
      if (!(Boolean)N_3) {
         N_3 = true;
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_1, i[0], null));
         Thread var0 = new Thread(class11404::M, i[1]);
         var0.setDaemon(true);
         var0.start();
      }
   }

   private static void M() {
      try (class11222 var0 = new class11222()) {
         var0.u();
         class06202 var17 = class06202.Nq();
         String var18 = var0.N();
         var17.execute(() -> class07536.m().N(URI.create(var18)));
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_2, i[2], null));
         String var19 = var0.L().get(5L, TimeUnit.MINUTES);
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_3, i[3], null));
         class11540 var5 = class11108.N(class11108.N(var19, var0.y()));
         byte[] var6 = class09120.N(var5.u());
         class09250 var7 = new class09250(new class11166(true, var5.N(), var5.i(), var6), false, System.currentTimeMillis());
         var17.execute(() -> {
            class11938.s().L(var7);
            class11938.M().N(class11491.class).N(var7.R());
            class11519.y(class11491.class);
            class09303.N(var5.i(), var5.N(), var5.y(), var5.L());
         });
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_4, null, var5.i()));
      } catch (Throwable var15) {
         Throwable var1 = N(var15);
         ((Logger)N_0).error(i[4], var1);
         String var2 = var1 instanceof class11001 var3 ? var3.N() : i[5];
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_5, var2, null));
      } finally {
         N_3 = false;
      }
   }

   private class11404() {
      throw new UnsupportedOperationException(i[6]);
   }

   static {
      u();
      Z();
   }

   private static void Z() {
      N_3 = false;
   }

   private static void u() {
      i = new String[7];
      i[0] = "account.modal.microsoft.requesting";
      i[1] = "Nursultan-MS-Login";
      i[2] = "account.modal.microsoft.waiting";
      i[3] = "account.modal.microsoft.processing";
      i[4] = "Microsoft login failed";
      i[5] = "account.modal.microsoft.error.timeout";
      i[6] = "This is a utility class and cannot be instantiated";
   }

   public static void y() {
      ((AtomicReference)N_2).set((class11593)N_1);
   }

   public static class11593 N() {
      return (class11593)((AtomicReference)N_2).get();
   }

   private static Throwable N(Throwable var0) {
      Throwable var1 = var0.getCause();
      return var1 != null && var0 instanceof ExecutionException ? var1 : var0;
   }
}
