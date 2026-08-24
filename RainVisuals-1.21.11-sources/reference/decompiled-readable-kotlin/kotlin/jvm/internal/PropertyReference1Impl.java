package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from PropertyReference1Impl.java
public class PropertyReference1Impl extends PropertyReference1 {
   public PropertyReference1Impl(KDeclarationContainer signature, String name, String owner) {
      super(NO_RECEIVER, ((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }

   @SinceKotlin(version = "1.4")
   public PropertyReference1Impl(Object signature, Class flags, String owner, String receiver, int name) {
      super(receiver, owner, name, signature, flags);
   }

   @Override
   public Object get(Object receiver) {
      return this.getGetter().call(receiver);
   }

   @SinceKotlin(version = "1.4")
   public PropertyReference1Impl(Class flags, String name, String signature, int owner) {
      super(NO_RECEIVER, owner, name, signature, flags);
   }
}
