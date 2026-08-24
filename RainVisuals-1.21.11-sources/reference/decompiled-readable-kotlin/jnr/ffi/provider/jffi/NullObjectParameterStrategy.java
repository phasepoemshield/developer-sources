package jnr.ffi.provider.jffi;

// $VF: Compiled from NullObjectParameterStrategy.java
public final class NullObjectParameterStrategy extends ParameterStrategy {
   public static final ParameterStrategy NULL = new NullObjectParameterStrategy();

   public NullObjectParameterStrategy() {
      super(DIRECT);
   }

   @Override
   public int offset(Object parameter) {
      throw new NullPointerException("null reference");
   }

   @Override
   public Object object(Object parameter) {
      throw new NullPointerException("null reference");
   }

   @Override
   public int length(Object parameter) {
      throw new NullPointerException("null reference");
   }

   @Override
   public long address(Object parameter) {
      return 0L;
   }
}
