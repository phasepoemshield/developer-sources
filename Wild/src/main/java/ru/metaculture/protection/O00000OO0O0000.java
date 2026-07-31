package ru.metaculture.protection;

import java.util.Objects;
import org.wild.module.api.Module;

abstract class O00000OO0O0000<T> implements O00000OO0O00O0 {
   private static final O00000OO0O0OOO O000000000 = (module, o0000000OOO00O, d, e, object) -> {};
   protected static final String O00000000 = "New Value";
   private final O00000OO0O00 O0000000000;
   private final O00000OO0OO00 O00000000000;
   private O00000OO0O000.W231 O000000000000 = new O00000OO0O000.W231(0.0F, 0.0F, 0.0F, 0.0F);

   O00000OO0O0000(O00000OO0O00 o00000OO0O00, O00000OO0OO00 o00000OO0OO00) {
      this.O0000000000 = Objects.requireNonNull(o00000OO0O00, "model");
      this.O00000000000 = Objects.requireNonNull(o00000OO0OO00, "widget");
   }

   protected final O00000OO0O00 O00000000() {
      return this.O0000000000;
   }

   protected final O00000OO0OO00 O000000000() {
      return this.O00000000000;
   }

   protected final O00000OO0O0OOO O0000000000() {
      return O000000000;
   }

   protected static O00000OO0O0OOO O00000000000() {
      return O000000000;
   }

   protected static Module O00000000(O00000OO0O00 o00000OO0O00) {
      Module var1 = o00000OO0O00.O000000000();
      if (var1 == null) {
         throw new IllegalStateException("Bind popup model is missing module context");
      } else {
         return var1;
      }
   }

   @Override
   public void O00000000(O00000OO0O000.W231 o000000000) {
      Objects.requireNonNull(o000000000, "area");
      this.O000000000000 = o000000000;
      this.O00000000000.O00000000(o000000000.O00000000(), o000000000.O000000000(), o000000000.O0000000000());
   }

   @Override
   public float O000000000000() {
      return this.O00000000000.O000000000();
   }

   @Override
   public void O0000000000000() {
      this.O00000000000.O00000000();
   }

   @Override
   public void O00000000(double d, double e) {
      this.O00000000000.O00000000(d, e);
   }

   @Override
   public boolean O00000000(double d, double e, int i) {
      if (this.O00000000000.O000000000000()) {
         return this.O00000000000.O000000000(d, e, i) ? true : true;
      } else {
         return !this.O000000000000.O00000000(d, e) ? false : this.O00000000000.O00000000(d, e, i);
      }
   }

   @Override
   public boolean O00000000(double d, double e, double f, double g) {
      if (this.O00000000000.O000000000000()) {
         return this.O00000000000.O00000000(d, e, f, g) ? true : true;
      } else {
         return !this.O000000000000.O00000000(d, e) ? false : this.O00000000000.O000000000(d, e, f, g);
      }
   }

   @Override
   public void O00000000(RenderManager o0000O00OO0O0, float f, float g) {
      this.O00000000000.O00000000(o0000O00OO0O0, f, g, 0.0F);
   }

   @Override
   public void O000000000(RenderManager o0000O00OO0O0, float f, float g) {
      this.O00000000000.O00000000(o0000O00OO0O0, f, g);
   }

   @Override
   public boolean O000000000000O() {
      return this.O00000000000.O000000000000();
   }

   protected static <V> O00000OO0OO0<V> O00000000(O00000OO0O00 o00000OO0O00, V object, O00000OO0O0000.W233<V> o00000000) {
      Objects.requireNonNull(o00000OO0O00, "model");
      Objects.requireNonNull(o00000000, "adapter");
      return new O00000OO0OO0<V>() {
         @Override
         public V O00000000() {
            return (V)o00000000.O00000000(o00000OO0O00);
         }

         @Override
         public void O00000000(V object) {
            o00000000.O00000000(o00000OO0O00, object);
         }

         @Override
         public V O000000000() {
            return (V)object;
         }

         @Override
         public void O0000000000() {
         }
      };
   }

   @FunctionalInterface
   protected interface W233<V> {
      V O00000000(O00000OO0O00 o00000OO0O00);

      default void O00000000(O00000OO0O00 o00000OO0O00, V object) {
         o00000OO0O00.O000000000(object);
      }
   }
}
