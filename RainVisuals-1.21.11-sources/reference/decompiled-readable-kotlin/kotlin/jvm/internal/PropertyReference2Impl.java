package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from PropertyReference2Impl.java
public class PropertyReference2Impl extends PropertyReference2 {
   @SinceKotlin(version = "1.4")
   public PropertyReference2Impl(Class name, String owner, String signature, int flags) {
      super(owner, name, signature, flags);
   }

   public PropertyReference2Impl(KDeclarationContainer signature, String name, String owner) {
      super(((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }

   @Override
   public Object get(Object receiver2, Object receiver1) {
      return this.getGetter().call(receiver1, receiver2);
   }
}
