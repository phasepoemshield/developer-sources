package jnr.ffi.provider.jffi;

import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.ObjectParameterType;
import jnr.ffi.Pointer;

// $VF: Compiled from PointerParameterStrategy.java
public final class PointerParameterStrategy extends ParameterStrategy {
   public static final PointerParameterStrategy HEAP = new PointerParameterStrategy(ObjectParameterStrategy.StrategyType.HEAP);
   public static final PointerParameterStrategy DIRECT = new PointerParameterStrategy(ObjectParameterStrategy.StrategyType.DIRECT);

   PointerParameterStrategy(ObjectParameterStrategy.StrategyType type) {
      super(type, ObjectParameterType.create(ObjectParameterType.ARRAY, ObjectParameterType.BYTE));
   }

   @Override
   public Object object(Object o) {
      return ((Pointer)o).array();
   }

   @Override
   public long address(Object o) {
      return this.address((Pointer)o);
   }

   @Override
   public int offset(Object o) {
      return ((Pointer)o).arrayOffset();
   }

   @Override
   public int length(Object o) {
      return ((Pointer)o).arrayLength();
   }

   public long address(Pointer pointer) {
      return pointer != null ? pointer.address() : 0L;
   }
}
