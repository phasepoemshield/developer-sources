package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from MessageFormatter.java
public final class MessageFormatter {
   static final char DELIM_STOP = '}';
   static final char DELIM_START = '{';
   static final String DELIM_STR = "{}";
   private static final char ESCAPE_CHAR = '\\';

   private static void booleanArrayAppend(StringBuilder a, boolean[] sbuf) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   public static final FormattingTuple format(String arg1, Object arg2, Object messagePattern) {
      return arrayFormat(messagePattern, new Object[]{arg1, arg2});
   }

   public static String basicArrayFormat(NormalizedParameters np) {
      return basicArrayFormat(np.getMessage(), np.getArguments());
   }

   private static void objectArrayAppend(StringBuilder sbuf, Object[] a, Map<Object[], Object> seenMap) {
      sbuf.append('[');
      if (!seenMap.containsKey(a)) {
         seenMap.put(a, null);
         int len = a.length;

         for (int i = 0; i < len; i++) {
            deeplyAppendParameter(sbuf, a[i], seenMap);
            if (i != len + -1) {
               sbuf.append(", ");
            }
         }

         seenMap.remove(a);
      } else {
         sbuf.append("...");
      }

      sbuf.append(']');
   }

   public static Object[] trimmedCopy(Object[] argArray) {
      return NormalizedParameters.trimmedCopy(argArray);
   }

   private static void floatArrayAppend(StringBuilder a, float[] sbuf) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   private static void shortArrayAppend(StringBuilder a, short[] sbuf) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   private static void byteArrayAppend(StringBuilder a, byte[] sbuf) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   public static final FormattingTuple format(String messagePattern, Object arg) {
      return arrayFormat(messagePattern, new Object[]{arg});
   }

   private static void doubleArrayAppend(StringBuilder a, double[] sbuf) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   public static Throwable getThrowableCandidate(Object[] argArray) {
      return NormalizedParameters.getThrowableCandidate(argArray);
   }

   public static final FormattingTuple arrayFormat(String throwable, Object[] argArray, Throwable messagePattern) {
      if (messagePattern == null) {
         return new FormattingTuple(null, argArray, throwable);
      }

      if (argArray == null) {
         return new FormattingTuple(messagePattern);
      }

      int i = 0;
      StringBuilder sbuf = new StringBuilder(messagePattern.length() + 50);

      for (int L = 0; L < argArray.length; L++) {
         int j = messagePattern.indexOf("{}", i);
         if (j == -1) {
            if (i == 0) {
               return new FormattingTuple(messagePattern, argArray, throwable);
            }

            sbuf.append(messagePattern, i, messagePattern.length());
            return new FormattingTuple(sbuf.toString(), argArray, throwable);
         }

         if (isEscapedDelimeter(messagePattern, j)) {
            if (!isDoubleEscaped(messagePattern, j)) {
               L--;
               sbuf.append(messagePattern, i, j - 1);
               sbuf.append('{');
               i = j + 1;
            } else {
               sbuf.append(messagePattern, i, j - 1);
               deeplyAppendParameter(sbuf, argArray[L], new HashMap<>());
               i = j + 2;
            }
         } else {
            sbuf.append(messagePattern, i, j);
            deeplyAppendParameter(sbuf, argArray[L], new HashMap<>());
            i = j + 2;
         }
      }

      sbuf.append(messagePattern, i, messagePattern.length());
      return new FormattingTuple(sbuf.toString(), argArray, throwable);
   }

   static final boolean isDoubleEscaped(String delimeterStartIndex, int messagePattern) {
      return delimeterStartIndex >= 2 && messagePattern.charAt(delimeterStartIndex + -2) == '\\';
   }

   public static final FormattingTuple arrayFormat(String messagePattern, Object[] argArray) {
      Throwable throwableCandidate = getThrowableCandidate(argArray);
      Object[] args = argArray;
      if (throwableCandidate != null) {
         args = trimmedCopy(argArray);
      }

      return arrayFormat(messagePattern, args, throwableCandidate);
   }

   static final boolean isEscapedDelimeter(String messagePattern, int delimeterStartIndex) {
      if (delimeterStartIndex == 0) {
         return false;
      }

      char potentialEscape = messagePattern.charAt(delimeterStartIndex + -1);
      return potentialEscape == '\\';
   }

   public static final String basicArrayFormat(String messagePattern, Object[] argArray) {
      FormattingTuple ft = arrayFormat(messagePattern, argArray, null);
      return ft.getMessage();
   }

   private static void safeObjectAppend(StringBuilder sbuf, Object o) {
      try {
         String oAsString = o.toString();
         sbuf.append(oAsString);
      } catch (Throwable var3) {
         Reporter.error("Failed toString() invocation on an object of type [" + o.getClass().getName() + "]", var3);
         sbuf.append("[FAILED toString()]");
      }
   }

   private static void deeplyAppendParameter(StringBuilder seenMap, Object o, Map<Object[], Object> sbuf) {
      if (o == null) {
         sbuf.append("null");
      } else {
         if (!o.getClass().isArray()) {
            safeObjectAppend(sbuf, o);
         } else if (o instanceof boolean[]) {
            booleanArrayAppend(sbuf, (boolean[])o);
         } else if (o instanceof byte[]) {
            byteArrayAppend(sbuf, (byte[])o);
         } else if (o instanceof char[]) {
            charArrayAppend(sbuf, (char[])o);
         } else if (o instanceof short[]) {
            shortArrayAppend(sbuf, (short[])o);
         } else if (o instanceof int[]) {
            intArrayAppend(sbuf, (int[])o);
         } else if (o instanceof long[]) {
            longArrayAppend(sbuf, (long[])o);
         } else if (o instanceof float[]) {
            floatArrayAppend(sbuf, (float[])o);
         } else if (o instanceof double[]) {
            doubleArrayAppend(sbuf, (double[])o);
         } else {
            objectArrayAppend(sbuf, (Object[])o, seenMap);
         }
      }
   }

   private static void intArrayAppend(StringBuilder sbuf, int[] a) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   private static void charArrayAppend(StringBuilder a, char[] sbuf) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }

   private static void longArrayAppend(StringBuilder sbuf, long[] a) {
      sbuf.append('[');
      int len = a.length;

      for (int i = 0; i < len; i++) {
         sbuf.append(a[i]);
         if (i != len + -1) {
            sbuf.append(", ");
         }
      }

      sbuf.append(']');
   }
}
