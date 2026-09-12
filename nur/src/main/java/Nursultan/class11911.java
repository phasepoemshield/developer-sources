package Nursultan;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class06202;

public class class11911 {
   public static Object N_0 = class06202.Nq();
   public static Object N_1 = new Gson();

   private static void L() {
      N_0 = null;
      N_1 = null;
   }

   public static class01079 L(String var0) {
      try {
         return ((class06202)N_0).Nm().L(N(var0));
      } catch (Throwable var1) {
         throw var1;
      }
   }

   private class11911() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   public static Reader y(String var0) {
      try {
         return ((class06202)N_0).Nm().i(N(var0));
      } catch (Throwable var1) {
         throw var1;
      }
   }

   public static Set<class01894> N(String var0, Predicate<class01894> var1) {
      return ((class06202)N_0).Nm().y(var0, var1).keySet();
   }

   private static String N(class01894 var0) {
      try {
         String var3;
         try (
            InputStream var1 = class06202.Nq().Nm().u(var0);
            BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));
         ) {
            var3 = var2.lines().collect(Collectors.joining("\n"));
         }

         return var3;
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }
   }

   public static <T> T N(class01894 var0, TypeToken<?> var1) {
      return (T)((Gson)N_1).fromJson(N(var0), var1.getType());
   }

   public static <T> T N(class01894 var0, Class<T> var1) {
      return (T)((Gson)N_1).fromJson(N(var0), var1);
   }

   public static class01894 N(String var0) {
      return class01894.N("nursultan-client", var0);
   }
}
