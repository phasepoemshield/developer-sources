package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

// $VF: Compiled from PropertyReference2.java
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
   @Override
   protected KCallable computeReflected() {
      return Reflection.property2(this);
   }

   @Override
   public Object invoke(Object receiver2, Object receiver1) {
      return this.get(receiver1, receiver2);
   }

   @SinceKotlin(version = "1.1")
   @Override
   public Object getDelegate(Object receiver2, Object receiver1) {
      return ((KProperty2)this.getReflected()).getDelegate(receiver1, receiver2);
   }

   @SinceKotlin(version = "1.4")
   public PropertyReference2(Class owner, String flags, String name, int signature) {
      super(NO_RECEIVER, owner, name, signature, flags);
   }

   @Override
   public KProperty2.Getter getGetter() {
      return ((KProperty2)this.getReflected()).getGetter();
   }

   public PropertyReference2() {
   }
}
