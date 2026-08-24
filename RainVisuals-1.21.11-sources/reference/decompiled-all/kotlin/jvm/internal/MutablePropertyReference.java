package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KMutableProperty;

// $VF: Compiled from MutablePropertyReference.java
public abstract class MutablePropertyReference extends PropertyReference implements KMutableProperty {
   public MutablePropertyReference() {
   }

   @SinceKotlin(version = "1.1")
   public MutablePropertyReference(Object receiver) {
      super(receiver);
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference(Object receiver, Class owner, String flags, String name, int signature) {
      super(receiver, owner, name, signature, flags);
   }
}
