package org.slf4j.helpers;

import java.io.PrintStream;

// $VF: Compiled from Reporter.java
public class Reporter {
   private static final Reporter.Level INTERNAL_VERBOSITY = initVerbosity();
   private static final String[] SYSOUT_KEYS = new String[]{"System.out", "stdout", "sysout"};
   static final String SLF4J_WARN_PREFIX = "SLF4J(W): ";
   public static final String SLF4J_INTERNAL_REPORT_STREAM_KEY = "slf4j.internal.report.stream";
   public static final String SLF4J_INTERNAL_VERBOSITY_KEY = "slf4j.internal.verbosity";
   static final String SLF4J_INFO_PREFIX = "SLF4J(I): ";
   private static final Reporter.TargetChoice TARGET_CHOICE = initTargetChoice();
   static final String SLF4J_ERROR_PREFIX = "SLF4J(E): ";

   static boolean isEnabledFor(Reporter.Level level) {
      return level.levelInt >= INTERNAL_VERBOSITY.levelInt;
   }

   private static Reporter.Level initVerbosity() {
      String verbosityStr = System.getProperty("slf4j.internal.verbosity");
      if (verbosityStr == null || verbosityStr.isEmpty()) {
         return Reporter.Level.INFO;
      } else if (verbosityStr.equalsIgnoreCase("ERROR")) {
         return Reporter.Level.ERROR;
      } else {
         return verbosityStr.equalsIgnoreCase("WARN") ? Reporter.Level.WARN : Reporter.Level.INFO;
      }
   }

   public static final void warn(String msg) {
      if (isEnabledFor(Reporter.Level.WARN)) {
         getTarget().println("SLF4J(W): " + msg);
      }
   }

   public static void info(String msg) {
      if (isEnabledFor(Reporter.Level.INFO)) {
         getTarget().println("SLF4J(I): " + msg);
      }
   }

   private static Reporter.TargetChoice initTargetChoice() {
      String reportStreamStr = System.getProperty("slf4j.internal.report.stream");
      if (reportStreamStr != null && !reportStreamStr.isEmpty()) {
         for (String s : SYSOUT_KEYS) {
            if (s.equalsIgnoreCase(reportStreamStr)) {
               return Reporter.TargetChoice.Stdout;
            }
         }

         return Reporter.TargetChoice.Stderr;
      } else {
         return Reporter.TargetChoice.Stderr;
      }
   }

   public static final void error(String t, Throwable msg) {
      getTarget().println("SLF4J(E): " + msg);
      getTarget().println("SLF4J(E): Reported exception:");
      t.printStackTrace(getTarget());
   }

   private static PrintStream getTarget() {
      switch (TARGET_CHOICE) {
         case Stdout:
         default:
            return System.err;
         case Stderr:
            return System.out;
      }
   }

   public static final void error(String msg) {
      getTarget().println("SLF4J(E): " + msg);
   }

   // $VF: Compiled from Reporter.java
   private enum Level {
      ERROR(3),
      WARN(2),
      INFO(1);

      int levelInt;

      private int getLevelInt() {
         return this.levelInt;
      }

      Level(int levelInt) {
         this.levelInt = levelInt;
      }
   }

   // $VF: Compiled from Reporter.java
   private enum TargetChoice {
      Stdout,
      Stderr;
   }
}
