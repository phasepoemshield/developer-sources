package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from MutablePropertyReference0Impl.java
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
   @SinceKotlin(version = "1.4")
   public MutablePropertyReference0Impl(Object name, Class flags, String owner, String receiver, int signature) {
      super(receiver, owner, name, signature, flags);
   }

   @Override
   public Object get() {
      return this.getGetter().call();
   }

   @Override
   public void set(Object value) {
      this.getSetter().call(value);
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference0Impl(Class flags, String owner, String name, int signature) {
      super(NO_RECEIVER, owner, name, signature, flags);
   }

   public MutablePropertyReference0Impl(KDeclarationContainer owner, String signature, String name) {
      super(NO_RECEIVER, ((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }
}
