package org.freedesktop.dbus.connections.config;

import org.freedesktop.dbus.connections.shared.IThreadPoolRetryHandler;

// $VF: Compiled from ReceivingServiceConfig.java
public final class ReceivingServiceConfig {
   private int signalThreadPriority;
   private int methodCallThreadPoolSize;
   private int signalThreadPoolSize = 1;
   private int methodCallThreadPriority;
   private IThreadPoolRetryHandler retryHandler;
   private int errorThreadPriority;
   private int methodReturnThreadPoolSize;
   private int errorThreadPoolSize = 1;
   private int methodReturnThreadPriority;

   public IThreadPoolRetryHandler getRetryHandler() {
      return this.retryHandler;
   }

   void setMethodReturnThreadPoolSize(int _methodReturnThreadPoolSize) {
      this.methodReturnThreadPoolSize = _methodReturnThreadPoolSize;
   }

   void setRetryHandler(IThreadPoolRetryHandler _retryHandler) {
      this.retryHandler = _retryHandler;
   }

   ReceivingServiceConfig() {
      this.methodCallThreadPoolSize = 4;
      this.methodReturnThreadPoolSize = 1;
      this.signalThreadPriority = 5;
      this.methodCallThreadPriority = 5;
      this.errorThreadPriority = 5;
      this.methodReturnThreadPriority = 5;
   }

   public int getErrorThreadPriority() {
      return this.errorThreadPriority;
   }

   void setMethodReturnThreadPriority(int _methodReturnThreadPriority) {
      this.methodReturnThreadPriority = _methodReturnThreadPriority;
   }

   void setErrorThreadPoolSize(int _errorThreadPoolSize) {
      this.errorThreadPoolSize = _errorThreadPoolSize;
   }

   public int getMethodReturnThreadPoolSize() {
      return this.methodReturnThreadPoolSize;
   }

   public int getMethodCallThreadPriority() {
      return this.methodCallThreadPriority;
   }

   public int getSignalThreadPriority() {
      return this.signalThreadPriority;
   }

   public int getSignalThreadPoolSize() {
      return this.signalThreadPoolSize;
   }

   public int getErrorThreadPoolSize() {
      return this.errorThreadPoolSize;
   }

   void setMethodCallThreadPriority(int _methodCallThreadPriority) {
      this.methodCallThreadPriority = _methodCallThreadPriority;
   }

   void setErrorThreadPriority(int _errorThreadPriority) {
      this.errorThreadPriority = _errorThreadPriority;
   }

   void setSignalThreadPriority(int _signalThreadPriority) {
      this.signalThreadPriority = _signalThreadPriority;
   }

   public int getMethodCallThreadPoolSize() {
      return this.methodCallThreadPoolSize;
   }

   void setSignalThreadPoolSize(int _signalThreadPoolSize) {
      this.signalThreadPoolSize = _signalThreadPoolSize;
   }

   void setMethodCallThreadPoolSize(int _methodCallThreadPoolSize) {
      this.methodCallThreadPoolSize = _methodCallThreadPoolSize;
   }

   public int getMethodReturnThreadPriority() {
      return this.methodReturnThreadPriority;
   }
}
