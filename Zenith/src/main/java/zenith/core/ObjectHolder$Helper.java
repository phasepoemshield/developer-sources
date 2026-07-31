package zenith;

import java.lang.reflect.Method;

final class EventListener {
   private final Object EventImpl_24;
   private final Method ZenithInternal028;
   private final byte EventImpl_21;

   public EventListener(Object object, Method method, byte b0) {
      this.EventImpl_24 = object;
      this.ZenithInternal028 = method;
      this.EventImpl_21 = b0;
   }

   public Object StringHolder_8() {
      return this.EventImpl_24;
   }

   public Method EventBus() {
      return this.ZenithInternal028;
   }

   public byte EventTarget() {
      return this.EventImpl_21;
   }
}
