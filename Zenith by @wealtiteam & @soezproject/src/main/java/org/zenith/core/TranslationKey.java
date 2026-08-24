package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.ZenithClient;

import org.zenith.module.Interface;

import org.zenith.event.Event43;
import org.zenith.event.EventWindowSizeChanged;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface TranslationKey {
   Map<Integer, ClickFxController> val158 = new ConcurrentHashMap<>();

   static void on23(int var0, ClickFxController var1) {
      if (var1 == null) {
         val158.remove(var0);
      } else {
         val158.put(var0, var1);
      }
   }

   static void EventWindowSizeChanged(int var0) {
      val158.remove(var0);
   }

   void zenith_simulate();

   static ClickFxController Event43(int var0) {
      return val158.get(var0);
   }
}
