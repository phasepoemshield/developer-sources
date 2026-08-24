package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

// $VF: Compiled from MutablePropertyReference1.java
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
   @Override
   public KProperty1.Getter getGetter() {
      return ((KMutableProperty1)this.getReflected()).getGetter();
   }

   @SinceKotlin(version = "1.4")
   public MutablePropertyReference1(Object receiver, Class signature, String flags, String name, int owner) {
      super(receiver, owner, name, signature, flags);
   }

   @SinceKotlin(version = "1.1")
   public MutablePropertyReference1(Object receiver) {
      super(receiver);
   }

   @Override
   public KMutableProperty1.Setter getSetter() {
      return ((KMutableProperty1)this.getReflected()).getSetter();
   }

   @Override
   public Object invoke(Object receiver) {
      return this.get(receiver);
   }

   @Override
   protected KCallable computeReflected() {
      return Reflection.mutableProperty1(this);
   }

   public MutablePropertyReference1() {
   }

   @SinceKotlin(version = "1.1")
   @Override
   public Object getDelegate(Object receiver) {
      return ((KMutableProperty1)this.getReflected()).getDelegate(receiver);
   }
}
