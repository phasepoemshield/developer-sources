package org.intellij.lang.annotations;

// $VF: Compiled from PrintFormat.java
class PrintFormatPattern {
   @Language("RegExp")
   private static final String WIDTH = "(?:\\d+)?";
   @Language("RegExp")
   private static final String FLAGS = "(?:[-#+ 0,(<]*)?";
   @Language("RegExp")
   static final String PRINT_FORMAT = "(?:[^%]|%%|(?:%(?:\\d+\\$)?(?:[-#+ 0,(<]*)?(?:\\d+)?(?:\\.\\d+)?(?:[tT])?(?:[a-zA-Z%])))*";
   @Language("RegExp")
   private static final String CONVERSION = "(?:[tT])?(?:[a-zA-Z%])";
   @Language("RegExp")
   private static final String ARG_INDEX = "(?:\\d+\\$)?";
   @Language("RegExp")
   private static final String TEXT = "[^%]|%%";
   @Language("RegExp")
   private static final String PRECISION = "(?:\\.\\d+)?";
}
