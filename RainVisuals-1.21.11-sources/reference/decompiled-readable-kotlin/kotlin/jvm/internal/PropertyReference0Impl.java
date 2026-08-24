package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from PropertyReference0Impl.java
public class PropertyReference0Impl extends PropertyReference0 {
   @SinceKotlin(version = "1.4")
   public PropertyReference0Impl(Class flags, String name, String signature, int owner) {
      super(NO_RECEIVER, owner, name, signature, flags);
   }

   @SinceKotlin(version = "1.4")
   public PropertyReference0Impl(Object signature, Class flags, String owner, String receiver, int name) {
      super(receiver, owner, name, signature, flags);
   }

   @Override
   public Object get() {
      return this.getGetter().call();
   }

   public PropertyReference0Impl(KDeclarationContainer owner, String name, String signature) {
      super(NO_RECEIVER, ((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }
}
