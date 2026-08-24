package com.google.gson;

import com.google.gson.internal.ReflectionAccessFilterHelper;

// $VF: Compiled from ReflectionAccessFilter.java
public interface ReflectionAccessFilter {
   ReflectionAccessFilter BLOCK_ALL_ANDROID = new ReflectionAccessFilter()   // $VF: Compiled from ReflectionAccessFilter.java
 {
      @Override
      public ReflectionAccessFilter.FilterResult check(Class<?> rawClass) {
         return ReflectionAccessFilterHelper.isAndroidType(rawClass)
            ? ReflectionAccessFilter.FilterResult.BLOCK_ALL
            : ReflectionAccessFilter.FilterResult.INDECISIVE;
      }
   };
   ReflectionAccessFilter BLOCK_ALL_PLATFORM = new ReflectionAccessFilter()   // $VF: Compiled from ReflectionAccessFilter.java
 {
      @Override
      public ReflectionAccessFilter.FilterResult check(Class<?> rawClass) {
         return ReflectionAccessFilterHelper.isAnyPlatformType(rawClass)
            ? ReflectionAccessFilter.FilterResult.BLOCK_ALL
            : ReflectionAccessFilter.FilterResult.INDECISIVE;
      }
   };
   ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA = new ReflectionAccessFilter()   // $VF: Compiled from ReflectionAccessFilter.java
 {
      @Override
      public ReflectionAccessFilter.FilterResult check(Class<?> rawClass) {
         return ReflectionAccessFilterHelper.isJavaType(rawClass)
            ? ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            : ReflectionAccessFilter.FilterResult.INDECISIVE;
      }
   };
   ReflectionAccessFilter BLOCK_ALL_JAVA = new ReflectionAccessFilter()   // $VF: Compiled from ReflectionAccessFilter.java
 {
      @Override
      public ReflectionAccessFilter.FilterResult check(Class<?> rawClass) {
         return ReflectionAccessFilterHelper.isJavaType(rawClass)
            ? ReflectionAccessFilter.FilterResult.BLOCK_ALL
            : ReflectionAccessFilter.FilterResult.INDECISIVE;
      }
   };

   ReflectionAccessFilter.FilterResult check(Class<?> var1);

   // $VF: Compiled from ReflectionAccessFilter.java
   enum FilterResult {
      INDECISIVE,
      ALLOW,
      BLOCK_INACCESSIBLE,
      BLOCK_ALL;
   }
}
