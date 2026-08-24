package org.slf4j.helpers;

import java.util.Deque;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

// $VF: Compiled from NOPMDCAdapter.java
public class NOPMDCAdapter implements MDCAdapter {
   @Override
   public Deque<String> getCopyOfDequeByKey(String key) {
      return null;
   }

   @Override
   public String get(String key) {
      return null;
   }

   @Override
   public void clear() {
   }

   @Override
   public void setContextMap(Map<String, String> contextMap) {
   }

   @Override
   public void put(String key, String val) {
   }

   @Override
   public String popByKey(String key) {
      return null;
   }

   @Override
   public void remove(String key) {
   }

   @Override
   public Map<String, String> getCopyOfContextMap() {
      return null;
   }

   @Override
   public void clearDequeByKey(String key) {
   }

   @Override
   public void pushByKey(String value, String key) {
   }
}
