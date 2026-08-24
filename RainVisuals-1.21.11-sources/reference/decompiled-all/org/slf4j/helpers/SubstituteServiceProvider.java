package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

// $VF: Compiled from SubstituteServiceProvider.java
public class SubstituteServiceProvider implements SLF4JServiceProvider {
   private final IMarkerFactory markerFactory;
   private final SubstituteLoggerFactory loggerFactory = new SubstituteLoggerFactory();
   private final MDCAdapter mdcAdapter;

   @Override
   public String getRequestedApiVersion() {
      throw new UnsupportedOperationException();
   }

   @Override
   public MDCAdapter getMDCAdapter() {
      return this.mdcAdapter;
   }

   public SubstituteLoggerFactory getSubstituteLoggerFactory() {
      return this.loggerFactory;
   }

   @Override
   public IMarkerFactory getMarkerFactory() {
      return this.markerFactory;
   }

   @Override
   public void initialize() {
   }

   @Override
   public ILoggerFactory getLoggerFactory() {
      return this.loggerFactory;
   }

   public SubstituteServiceProvider() {
      this.markerFactory = new BasicMarkerFactory();
      this.mdcAdapter = new BasicMDCAdapter();
   }
}
