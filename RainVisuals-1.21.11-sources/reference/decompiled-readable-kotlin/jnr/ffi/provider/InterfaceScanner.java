package jnr.ffi.provider;

import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import jnr.ffi.CallingConvention;
import jnr.ffi.Variable;
import jnr.ffi.annotations.StdCall;
import jnr.ffi.mapper.SignatureTypeMapper;

// $VF: Compiled from InterfaceScanner.java
public class InterfaceScanner {
   private final Method[] methods;
   private final CallingConvention callingConvention;
   private final Class interfaceClass;
   private static final Method methodIsDefault;
   private final SignatureTypeMapper typeMapper;

   private static boolean isDefault(Method method) {
      if (methodIsDefault == null) {
         return false;
      }

      try {
         return Boolean.TRUE.equals(methodIsDefault.invoke(method));
      } catch (Exception var2) {
         throw new RuntimeException("Unexpected error attempting to call isDefault method", var2);
      }
   }

   public Collection<NativeFunction> functions() {
      return new AbstractCollection<NativeFunction>()      // $VF: Compiled from InterfaceScanner.java
 {
         @Override
         public Iterator<NativeFunction> iterator() {
            return InterfaceScanner.this.new FunctionsIterator(InterfaceScanner.this.methods);
         }

         @Override
         public int size() {
            return 0;
         }
      };
   }

   public Collection<NativeVariable> variables() {
      return new AbstractCollection<NativeVariable>()      // $VF: Compiled from InterfaceScanner.java
 {
         @Override
         public Iterator<NativeVariable> iterator() {
            return InterfaceScanner.this.new VariablesIterator(InterfaceScanner.this.methods);
         }

         @Override
         public int size() {
            return 0;
         }
      };
   }

   static {
      Method isDefault = null;

      try {
         isDefault = Method.class.getMethod("isDefault", null);
      } catch (NoSuchMethodException var2) {
      }

      methodIsDefault = isDefault;
   }

   public InterfaceScanner(Class interfaceClass, SignatureTypeMapper callingConvention, CallingConvention typeMapper) {
      this.interfaceClass = interfaceClass;
      this.typeMapper = typeMapper;
      this.methods = interfaceClass.getMethods();
      this.callingConvention = interfaceClass.isAnnotationPresent(StdCall.class) ? CallingConvention.STDCALL : callingConvention;
   }

   // $VF: Compiled from InterfaceScanner.java
   private final class FunctionsIterator implements Iterator<NativeFunction> {
      private int nextIndex;
      private final Method[] methods;

      public NativeFunction next() {
         CallingConvention callingConvention = this.methods[this.nextIndex].isAnnotationPresent(StdCall.class)
            ? CallingConvention.STDCALL
            : InterfaceScanner.this.callingConvention;
         return new NativeFunction(this.methods[this.nextIndex++], callingConvention);
      }

      private FunctionsIterator(Method[] methods) {
         this.methods = methods;
         this.nextIndex = 0;
      }

      @Override
      public boolean hasNext() {
         while (this.nextIndex < this.methods.length) {
            if (!Variable.class.isAssignableFrom(this.methods[this.nextIndex].getReturnType()) && !InterfaceScanner.isDefault(this.methods[this.nextIndex])) {
               return true;
            }

            this.nextIndex++;
         }

         return false;
      }

      @Override
      public void remove() {
         throw new UnsupportedOperationException();
      }
   }

   // $VF: Compiled from InterfaceScanner.java
   private final class VariablesIterator implements Iterator<NativeVariable> {
      private int nextIndex;
      private final Method[] methods;

      public NativeVariable next() {
         return new NativeVariable(this.methods[this.nextIndex++]);
      }

      @Override
      public boolean hasNext() {
         while (this.nextIndex < this.methods.length) {
            if (Variable.class == this.methods[this.nextIndex].getReturnType()) {
               return true;
            }

            this.nextIndex++;
         }

         return false;
      }

      private VariablesIterator(Method[] methods) {
         this.methods = methods;
         this.nextIndex = 0;
      }

      @Override
      public void remove() {
         throw new UnsupportedOperationException();
      }
   }
}
