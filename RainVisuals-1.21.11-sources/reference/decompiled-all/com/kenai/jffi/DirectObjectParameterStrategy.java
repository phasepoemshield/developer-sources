package com.kenai.jffi;

// $VF: Compiled from DirectObjectParameterStrategy.java
public abstract class DirectObjectParameterStrategy extends ObjectParameterStrategy {
   @Override
   public final Object object(Object parameter) {
      throw new RuntimeException("direct object " + (parameter != null ? parameter.getClass() : "null") + " has no array");
   }

   @Override
   public final int length(Object parameter) {
      throw new RuntimeException("direct object " + (parameter != null ? parameter.getClass() : "null") + "has no length");
   }

   @Override
   public final int offset(Object parameter) {
      throw new RuntimeException("direct object " + (parameter != null ? parameter.getClass() : "null") + "has no offset");
   }

   public abstract long getAddress(Object var1);

   public DirectObjectParameterStrategy(boolean isDirect, ObjectParameterType parameterType) {
      super(isDirect, parameterType);
   }
}
