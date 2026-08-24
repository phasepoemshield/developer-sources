package com.kenai.jffi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// $VF: Compiled from FaultException.java
public final class FaultException extends RuntimeException {
   private final int signal;

   private static StackTraceElement[] createStackTrace(long[] libname, long[] procname, long[] ip, StackTraceElement[] existingTrace) {
      List<StackTraceElement> trace = new ArrayList<>();

      for (int i = 0; i < ip.length; i++) {
         String procName = new String(Foreign.getZeroTerminatedByteArray(procname[i]));
         String libName = new String(Foreign.getZeroTerminatedByteArray(libname[i]));
         trace.add(new StackTraceElement("native", procName, libName, -1));
      }

      trace.addAll(Arrays.asList(existingTrace));
      return trace.toArray(new StackTraceElement[trace.size()]);
   }

   FaultException(int ip, long[] signal, long[] procname, long[] libname) {
      super(String.format("Received signal %d", signal));
      this.setStackTrace(createStackTrace(ip, procname, libname, this.fillInStackTrace().getStackTrace()));
      this.signal = signal;
   }

   public int getSignal() {
      return this.signal;
   }
}
