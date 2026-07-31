package ru.metaculture.protection;

import java.util.HashMap;

public final class ListenerRegistry extends HashMap<Class<? extends O000000O0O0000>, O000000O0O0000> {
   public void O00000000() {
      this.O00000000(new O000000O0O00O(), new O000000O0O0O0(), new O000000O0O00O0());
      this.values().forEach(o000000O0O0000 -> EventManager.O00000000(o000000O0O0000));
   }

   public void O00000000(O000000O0O0000... o000000O0O0000s) {
      for (O000000O0O0000 var5 : o000000O0O0000s) {
         this.put((Class<? extends O000000O0O0000>)var5.getClass(), var5);
      }
   }

   public void O000000000(O000000O0O0000... o000000O0O0000s) {
      for (O000000O0O0000 var5 : o000000O0O0000s) {
         EventManager.O000000000(var5);
         this.remove(var5.getClass());
      }
   }

   public <T extends O000000O0O0000> T O00000000(Class<T> class_) {
      return this.values().stream().filter(o000000O0O0000 -> o000000O0O0000.getClass() == class_).map(class_::cast).findFirst().orElse(null);
   }
}
