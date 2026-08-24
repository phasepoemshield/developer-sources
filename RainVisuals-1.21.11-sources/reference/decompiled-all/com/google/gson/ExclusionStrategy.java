package com.google.gson;

// $VF: Compiled from ExclusionStrategy.java
public interface ExclusionStrategy {
   boolean shouldSkipClass(Class<?> var1);

   boolean shouldSkipField(FieldAttributes var1);
}
