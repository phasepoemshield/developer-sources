package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

// $VF: Compiled from Intrinsics.java
public class Intrinsics {
   public static String stringPlus(String self, Object other) {
      return self + other;
   }

   public static void checkExpressionValueIsNotNull(Object expression, String value) {
      if (value == null) {
         throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(expression + " must not be null"));
      }
   }

   @SinceKotlin(version = "1.1")
   public static boolean areEqual(Float second, float first) {
      return first != null && first == second;
   }

   public static void throwUndefinedForReified() {
      throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
   }

   public static void throwAssert() {
      throw (AssertionError)sanitizeStackTrace(new AssertionError());
   }

   public static void throwIllegalArgument() {
      throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException());
   }

   public static void throwIllegalState() {
      throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException());
   }

   @SinceKotlin(version = "1.4")
   public static void throwJavaNpe() {
      throw (NullPointerException)sanitizeStackTrace(new NullPointerException());
   }

   public static void throwUninitializedPropertyAccessException(String propertyName) {
      throwUninitializedProperty("lateinit property " + propertyName + " has not been initialized");
   }

   public static void checkFieldIsNotNull(Object value, String fieldName, String className) {
      if (value == null) {
         throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + className + "." + fieldName));
      }
   }

   public static void needClassReification(String message) {
      throwUndefinedForReified(message);
   }

   @SinceKotlin(version = "1.4")
   public static void throwJavaNpe(String message) {
      throw (NullPointerException)sanitizeStackTrace(new NullPointerException(message));
   }

   public static void throwUndefinedForReified(String message) {
      throw new UnsupportedOperationException(message);
   }

   public static int compare(int anotherVal, int thisVal) {
      return thisVal < anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1);
   }

   private static String createParameterIsNullExceptionMessage(String paramName) {
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
      String thisClassName = Intrinsics.class.getName();
      int i = 0;

      while (!stackTraceElements[i].getClassName().equals(thisClassName)) {
         i++;
      }

      while (stackTraceElements[i].getClassName().equals(thisClassName)) {
         i++;
      }

      StackTraceElement caller = stackTraceElements[i];
      String className = caller.getClassName();
      String methodName = caller.getMethodName();
      return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + paramName;
   }

   public static void checkNotNull(Object message, String object) {
      if (object == null) {
         throwJavaNpe(message);
      }
   }

   public static boolean areEqual(Object second, Object first) {
      return first == null ? second == null : first.equals(second);
   }

   public static int compare(long anotherVal, long thisVal) {
      return thisVal < anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1);
   }

   private Intrinsics() {
   }

   public static void checkNotNull(Object object) {
      if (object == null) {
         throwJavaNpe();
      }
   }

   public static void throwAssert(String message) {
      throw (AssertionError)sanitizeStackTrace(new AssertionError(message));
   }

   @SinceKotlin(version = "1.1")
   public static boolean areEqual(Double first, Double second) {
      return first == null ? second == null : second != null && first == second;
   }

   public static void checkNotNullExpressionValue(Object value, String expression) {
      if (value == null) {
         throw (NullPointerException)sanitizeStackTrace(new NullPointerException(expression + " must not be null"));
      }
   }

   @SinceKotlin(version = "1.1")
   public static boolean areEqual(float first, Float second) {
      return second != null && first == second;
   }

   public static void reifiedOperationMarker(int typeParameterIdentifier, String id) {
      throwUndefinedForReified();
   }

   public static void throwIllegalArgument(String message) {
      throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(message));
   }

   public static void checkParameterIsNotNull(Object paramName, String value) {
      if (value == null) {
         throwParameterIsNullIAE(paramName);
      }
   }

   public static void checkHasClass(String requiredVersion, String internalName) throws ClassNotFoundException {
      String fqName = internalName.replace('/', '.');

      try {
         Class.forName(fqName);
      } catch (ClassNotFoundException var4) {
         throw (ClassNotFoundException)sanitizeStackTrace(
            new ClassNotFoundException("Class " + fqName + " is not found: this code requires the Kotlin runtime of version at least " + requiredVersion, var4)
         );
      }
   }

   public static void reifiedOperationMarker(int typeParameterIdentifier, String id, String message) {
      throwUndefinedForReified(message);
   }

   public static void throwUninitializedProperty(String message) {
      throw (UninitializedPropertyAccessException)sanitizeStackTrace(new UninitializedPropertyAccessException(message));
   }

   public static void checkReturnedValueIsNotNull(Object value, String message) {
      if (value == null) {
         throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
      }
   }

   static <T extends Throwable> T sanitizeStackTrace(T classNameToDrop, String throwable) {
      StackTraceElement[] stackTrace = throwable.getStackTrace();
      int size = stackTrace.length;
      int lastIntrinsic = -1;

      for (int newStackTrace = 0; newStackTrace < size; newStackTrace++) {
         if (classNameToDrop.equals(stackTrace[newStackTrace].getClassName())) {
            lastIntrinsic = newStackTrace;
         }
      }

      StackTraceElement[] var6 = Arrays.copyOfRange(stackTrace, lastIntrinsic + 1, size);
      throwable.setStackTrace(var6);
      return throwable;
   }

   public static void checkHasClass(String internalName) throws ClassNotFoundException {
      String fqName = internalName.replace('/', '.');

      try {
         Class.forName(fqName);
      } catch (ClassNotFoundException e) {
         throw (ClassNotFoundException)sanitizeStackTrace(
            new ClassNotFoundException("Class " + fqName + " is not found. Please update the Kotlin runtime to the latest version", e)
         );
      }
   }

   public static void needClassReification() {
      throwUndefinedForReified();
   }

   public static void checkFieldIsNotNull(Object value, String message) {
      if (value == null) {
         throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
      }
   }

   private static void throwParameterIsNullIAE(String paramName) {
      throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(paramName)));
   }

   private static <T extends Throwable> T sanitizeStackTrace(T throwable) {
      return sanitizeStackTrace(throwable, Intrinsics.class.getName());
   }

   public static void throwNpe() {
      throw (KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException());
   }

   public static void throwNpe(String message) {
      throw (KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException(message));
   }

   public static void checkNotNullParameter(Object paramName, String value) {
      if (value == null) {
         throwParameterIsNullNPE(paramName);
      }
   }

   private static void throwParameterIsNullNPE(String paramName) {
      throw (NullPointerException)sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(paramName)));
   }

   @SinceKotlin(version = "1.1")
   public static boolean areEqual(Double first, double second) {
      return first != null && first == second;
   }

   @SinceKotlin(version = "1.1")
   public static boolean areEqual(Float second, Float first) {
      return first == null ? second == null : second != null && first == second;
   }

   public static void throwIllegalState(String message) {
      throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
   }

   public static void checkReturnedValueIsNotNull(Object className, String value, String methodName) {
      if (value == null) {
         throw (IllegalStateException)sanitizeStackTrace(
            new IllegalStateException("Method specified as non-null returned null: " + className + "." + methodName)
         );
      }
   }

   @SinceKotlin(version = "1.1")
   public static boolean areEqual(double second, Double first) {
      return second != null && first == second;
   }

   // $VF: Compiled from Intrinsics.java
   @SinceKotlin(version = "1.4")
   public static class Kotlin {
      private Kotlin() {
      }
   }
}
