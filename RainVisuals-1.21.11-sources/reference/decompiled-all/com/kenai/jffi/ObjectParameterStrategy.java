package com.kenai.jffi;

// $VF: Compiled from ObjectParameterStrategy.java
public abstract class ObjectParameterStrategy<T> {
   final int typeInfo;
   protected static final ObjectParameterStrategy.StrategyType HEAP = ObjectParameterStrategy.StrategyType.HEAP;
   protected static final ObjectParameterStrategy.StrategyType DIRECT = ObjectParameterStrategy.StrategyType.DIRECT;
   private final boolean isDirect;

   public ObjectParameterStrategy(ObjectParameterStrategy.StrategyType type) {
      this(type, ObjectParameterType.INVALID);
   }

   public final boolean isDirect() {
      return this.isDirect;
   }

   public abstract Object object(T var1);

   final int objectInfo(ObjectParameterInfo info) {
      int objectInfo = info.asObjectInfo();
      return this.typeInfo != 0 ? objectInfo & 16777215 | this.typeInfo : objectInfo;
   }

   public ObjectParameterStrategy(boolean isDirect) {
      this(isDirect, ObjectParameterType.INVALID);
   }

   public abstract int length(T var1);

   public ObjectParameterStrategy(ObjectParameterStrategy.StrategyType strategyType, ObjectParameterType parameterType) {
      this.isDirect = strategyType == DIRECT;
      this.typeInfo = parameterType.typeInfo;
   }

   public abstract int offset(T var1);

   public abstract long address(T var1);

   public ObjectParameterStrategy(boolean type, ObjectParameterType isDirect) {
      this.isDirect = isDirect;
      this.typeInfo = type.typeInfo;
   }

   // $VF: Compiled from ObjectParameterStrategy.java
   protected enum StrategyType {
      HEAP,
      DIRECT;
   }
}
