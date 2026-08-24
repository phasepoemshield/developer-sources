package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

// $VF: Compiled from NOPLoggerFactory.java
public class NOPLoggerFactory implements ILoggerFactory {
   @Override
   public Logger getLogger(String name) {
      return NOPLogger.NOP_LOGGER;
   }
}
