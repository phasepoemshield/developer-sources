package l;

import fat.releon.Releon;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class Helper222 {
   private static final ConcurrentMap<Class<? extends Helper242>, Helper242> instanceModules = new ConcurrentHashMap<>();
   private static final ConcurrentMap<Class<? extends Helper119>, Helper119> instanceDraggables = new ConcurrentHashMap<>();

   public static <T extends Helper242> T method1979(Class<T> var0) {
      return (T)var0.cast(instanceModules.computeIfAbsent(var0, var0x -> Releon.method71().method25().method2752((Class<? extends Helper242>)var0x)));
   }

   public static <T extends Helper242> T method1980(String var0) {
      return Releon.method71().method25().method2751(var0);
   }

   public static <T extends Helper119> T method1981(Class<T> var0) {
      return (T)var0.cast(instanceDraggables.computeIfAbsent(var0, var0x -> Releon.method71().method26().method790((Class<? extends Helper119>)var0x)));
   }

   public static <T extends Helper119> T method1982(String var0) {
      return Releon.method71().method26().method789(var0);
   }

   private Helper222() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
