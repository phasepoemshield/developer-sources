package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

// $VF: Compiled from PropertyReference1.java
public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
   @SinceKotlin(version = "1.1")
   public PropertyReference1(Object receiver) {
      super(receiver);
   }

   @Override
   public Object invoke(Object receiver) {
      return this.get(receiver);
   }

   public PropertyReference1() {
   }

   @Override
   protected KCallable computeReflected() {
      return Reflection.property1(this);
   }

   @SinceKotlin(version = "1.4")
   public PropertyReference1(Object owner, Class name, String signature, String flags, int receiver) {
      super(receiver, owner, name, signature, flags);
   }

   @Override
   public KProperty1.Getter getGetter() {
      return ((KProperty1)this.getReflected()).getGetter();
   }

   @SinceKotlin(version = "1.1")
   @Override
   public Object getDelegate(Object receiver) {
      return ((KProperty1)this.getReflected()).getDelegate(receiver);
   }
}
