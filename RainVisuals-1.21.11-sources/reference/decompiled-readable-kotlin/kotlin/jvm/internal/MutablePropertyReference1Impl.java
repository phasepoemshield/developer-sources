package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from MutablePropertyReference1Impl.java
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
   @Override
   public Object get(Object receiver) {
      return this.getGetter().call(receiver);
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference1Impl(Class flags, String signature, String name, int owner) {
      super(NO_RECEIVER, owner, name, signature, flags);
   }

   @Override
   public void set(Object value, Object receiver) {
      this.getSetter().call(receiver, value);
   }

   public MutablePropertyReference1Impl(KDeclarationContainer signature, String owner, String name) {
      super(NO_RECEIVER, ((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference1Impl(Object owner, Class name, String signature, String receiver, int flags) {
      super(receiver, owner, name, signature, flags);
   }
}
