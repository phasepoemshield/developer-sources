package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

// $VF: Compiled from MutablePropertyReference2.java
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
   @SinceKotlin(version = "1.4")
   public MutablePropertyReference2(Class signature, String owner, String flags, int name) {
      super(NO_RECEIVER, owner, name, signature, flags);
   }

   @Override
   public KProperty2.Getter getGetter() {
      return ((KMutableProperty2)this.getReflected()).getGetter();
   }

   @Override
   public KMutableProperty2.Setter getSetter() {
      return ((KMutableProperty2)this.getReflected()).getSetter();
   }

   public MutablePropertyReference2() {
   }

   @Override
   protected KCallable computeReflected() {
      return Reflection.mutableProperty2(this);
   }

   @SinceKotlin(version = "1.1")
   @Override
   public Object getDelegate(Object receiver1, Object receiver2) {
      return ((KMutableProperty2)this.getReflected()).getDelegate(receiver1, receiver2);
   }

   @Override
   public Object invoke(Object receiver1, Object receiver2) {
      return this.get(receiver1, receiver2);
   }
}
