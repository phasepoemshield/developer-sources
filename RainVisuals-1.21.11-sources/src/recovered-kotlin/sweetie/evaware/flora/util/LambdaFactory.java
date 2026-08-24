package sweetie.evaware.flora.util;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.function.Consumer;

// $VF: Compiled from LambdaFactory.java
public class LambdaFactory {
   private static final Lookup LOOKUP = MethodHandles.lookup();

   public static <T> Consumer<T> create(Object method, Method eventType, Class<T> instance) {
      try {
         Lookup caller = MethodHandles.privateLookupIn(instance.getClass(), LOOKUP);
         MethodHandle handle = caller.unreflect(method);
         CallSite site = LambdaMetafactory.metafactory(
            caller,
            "accept",
            MethodType.methodType(Consumer.class, instance.getClass()),
            MethodType.methodType(void.class, Object.class),
            handle,
            MethodType.methodType(void.class, eventType)
         );
         return (Consumer)site.getTarget().invoke((Object)instance);
      } catch (Throwable var6) {
         throw new RuntimeException("Flora: Unable to bind " + method.getName(), var6);
      }
   }
}
