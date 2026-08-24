package org.slf4j.helpers;

import org.slf4j.Marker;

// $VF: Compiled from LegacyAbstractLogger.java
public abstract class LegacyAbstractLogger extends AbstractLogger {
   private static final long serialVersionUID = -7041884104854048950L;

   @Override
   public boolean isDebugEnabled(Marker marker) {
      return this.isDebugEnabled();
   }

   @Override
   public boolean isInfoEnabled(Marker marker) {
      return this.isInfoEnabled();
   }

   @Override
   public boolean isErrorEnabled(Marker marker) {
      return this.isErrorEnabled();
   }

   @Override
   public boolean isWarnEnabled(Marker marker) {
      return this.isWarnEnabled();
   }

   @Override
   public boolean isTraceEnabled(Marker marker) {
      return this.isTraceEnabled();
   }
}
