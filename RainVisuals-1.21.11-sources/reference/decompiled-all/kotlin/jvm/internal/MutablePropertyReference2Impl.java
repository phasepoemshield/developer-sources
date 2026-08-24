package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from MutablePropertyReference2Impl.java
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
   @Override
   public Object get(Object receiver2, Object receiver1) {
      return this.getGetter().call(receiver1, receiver2);
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference2Impl(Class flags, String owner, String name, int signature) {
      super(owner, name, signature, flags);
   }

   @Override
   public void set(Object receiver2, Object value, Object receiver1) {
      this.getSetter().call(receiver1, receiver2, value);
   }

   public MutablePropertyReference2Impl(KDeclarationContainer owner, String signature, String name) {
      super(((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }
}
