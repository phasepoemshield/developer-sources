package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

// $VF: Compiled from MutablePropertyReference0.java
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
   public MutablePropertyReference0() {
   }

   @Override
   public KMutableProperty0.Setter getSetter() {
      return ((KMutableProperty0)this.getReflected()).getSetter();
   }

   @Override
   public Object invoke() {
      return this.get();
   }

   @SinceKotlin(version = "1.1")
   public MutablePropertyReference0(Object receiver) {
      super(receiver);
   }

   @SinceKotlin(version = "1.1")
   @Override
   public Object getDelegate() {
      return ((KMutableProperty0)this.getReflected()).getDelegate();
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference0(Object flags, Class owner, String name, String signature, int receiver) {
      super(receiver, owner, name, signature, flags);
   }

   @Override
   protected KCallable computeReflected() {
      return Reflection.mutableProperty0(this);
   }

   @Override
   public KProperty0.Getter getGetter() {
      return ((KMutableProperty0)this.getReflected()).getGetter();
   }
}
