package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

// $VF: Compiled from PropertyReference0.java
public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
   @SinceKotlin(version = "1.1")
   @Override
   public Object getDelegate() {
      return ((KProperty0)this.getReflected()).getDelegate();
   }

   @Override
   public Object invoke() {
      return this.get();
   }

   @SinceKotlin(version = "1.1")
   public PropertyReference0(Object receiver) {
      super(receiver);
   }

   public PropertyReference0() {
   }

   @SinceKotlin(version = "1.4")
   public PropertyReference0(Object receiver, Class flags, String name, String owner, int signature) {
      super(receiver, owner, name, signature, flags);
   }

   @Override
   protected KCallable computeReflected() {
      return Reflection.property0(this);
   }

   @Override
   public KProperty0.Getter getGetter() {
      return ((KProperty0)this.getReflected()).getGetter();
   }
}
