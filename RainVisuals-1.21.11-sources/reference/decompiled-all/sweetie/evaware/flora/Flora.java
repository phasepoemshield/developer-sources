package sweetie.evaware.flora;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sweetie.evaware.flora.core.FloraBus;

// $VF: Compiled from Flora.java
public class Flora {
   private static final Map<Class<?>, FloraBus<?>> BUSES = new ConcurrentHashMap<>();

   public static <T> FloraBus<T> getBus(Class<T> type) {
      return (FloraBus<T>)BUSES.computeIfAbsent(type, k -> new FloraBus());
   }

   public static void post(Object event) {
      ((FloraBus<Object>)BUSES.computeIfAbsent(event.getClass(), k -> new FloraBus())).post(event);
   }
}
