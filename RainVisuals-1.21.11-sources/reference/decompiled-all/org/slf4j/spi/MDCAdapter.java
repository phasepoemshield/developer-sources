package org.slf4j.spi;

import java.util.Deque;
import java.util.Map;

// $VF: Compiled from MDCAdapter.java
public interface MDCAdapter {
   void setContextMap(Map<String, String> var1);

   void clear();

   void pushByKey(String var1, String var2);

   void put(String var1, String var2);

   String popByKey(String var1);

   String get(String var1);

   void clearDequeByKey(String var1);

   Map<String, String> getCopyOfContextMap();

   Deque<String> getCopyOfDequeByKey(String var1);

   void remove(String var1);
}
