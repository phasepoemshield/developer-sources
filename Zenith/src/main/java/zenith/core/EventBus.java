package zenith;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventBus {
   private static final Map<Class<? extends Event>, List<EventListener>> EventTarget = new HashMap<>();

   private EventBus() {
   }

   public static void StringHolder_8(Object object) {
      for (Method method : object.getClass().getDeclaredMethods()) {
         if (!StringHolder_8(method)) {
            StringHolder_8(method, object);
         }
      }
   }

   public static void StringHolder_8(Object object, Class<? extends Event> oclass) {
      for (Method method : object.getClass().getDeclaredMethods()) {
         if (!StringHolder_8(method, oclass)) {
            StringHolder_8(method, object);
         }
      }
   }

   public static void EventBus(Object object) {
      for (List list : EventTarget.values()) {
         for (EventListener l1i1illlili$ii1il11l111ii11iil : list) {
            if (l1i1illlili$ii1il11l111ii11iil.StringHolder_8().equals(object)) {
               list.remove(l1i1illlili$ii1il11l111ii11iil);
            }
         }
      }

      StringHolder_8(true);
   }

   public static void EventBus(Object object, Class<? extends Event> oclass) {
      if (EventTarget.containsKey(oclass)) {
         for (EventListener l1i1illlili$ii1il11l111ii11iil : EventTarget.get(oclass)) {
            if (l1i1illlili$ii1il11l111ii11iil.StringHolder_8().equals(object)) {
               EventTarget.get(oclass).remove(l1i1illlili$ii1il11l111ii11iil);
            }
         }

         StringHolder_8(true);
      }
   }

   private static void StringHolder_8(Method method, Object object) {
      if (method.getParameterCount() == 1) {
         Class oclass = method.getParameterTypes()[0];
         EventListener l1i1illlili$ii1il11l111ii11iil = new EventListener(
            object, method, method.getAnnotation(EventTarget.class).ZenithInternal095()
         );
         if (!l1i1illlili$ii1il11l111ii11iil.EventBus().isAccessible()) {
            l1i1illlili$ii1il11l111ii11iil.EventBus().setAccessible(true);
         }

         if (EventTarget.containsKey(oclass)) {
            if (!EventTarget.get(oclass).contains(l1i1illlili$ii1il11l111ii11iil)) {
               EventTarget.get(oclass).add(l1i1illlili$ii1il11l111ii11iil);
               EventBus(oclass);
            }
         } else {
            EventTarget.put(oclass, new EventBus$1(l1i1illlili$ii1il11l111ii11iil));
         }
      }
   }

   public static void StringHolder_8(Class<? extends Event> oclass) {
      Iterator iterator = EventTarget.entrySet().iterator();

      while (iterator.hasNext()) {
         if (((Class)((Entry)iterator.next()).getKey()).equals(oclass)) {
            iterator.remove();
            break;
         }
      }
   }

   public static void StringHolder_8(boolean flag) {
      Iterator iterator = EventTarget.entrySet().iterator();

      while (iterator.hasNext()) {
         if (!flag || ((List)((Entry)iterator.next()).getValue()).isEmpty()) {
            iterator.remove();
         }
      }
   }

   private static void EventBus(Class<? extends Event> oclass) {
      CopyOnWriteArrayList copyonwritearraylist = new CopyOnWriteArrayList();

      for (byte b0 : byteHolder.ZenithInternal061) {
         for (EventListener l1i1illlili$ii1il11l111ii11iil : EventTarget.get(oclass)) {
            if (l1i1illlili$ii1il11l111ii11iil.EventTarget() == b0) {
               copyonwritearraylist.add(l1i1illlili$ii1il11l111ii11iil);
            }
         }
      }

      EventTarget.put(oclass, copyonwritearraylist);
   }

   private static boolean StringHolder_8(Method method) {
      return method.getParameterTypes().length != 1 || !method.isAnnotationPresent(EventTarget.class);
   }

   private static boolean StringHolder_8(Method method, Class<? extends Event> oclass) {
      return StringHolder_8(method) || !method.getParameterTypes()[0].equals(oclass);
   }

   public static final Event StringHolder_8(Event liil11l111liil1ll) {
      try {
         List list = EventTarget.get(liil11l111liil1ll.getClass());
         if (list != null) {
            if (liil11l111liil1ll instanceof EventImpl_24 l1iil11li) {
               for (EventListener l1i1illlili$ii1il11l111ii11iilx : list) {
                  l1i1illlili$ii1il11l111ii11iilx.EventBus().invoke(l1i1illlili$ii1il11l111ii11iilx.StringHolder_8(), liil11l111liil1ll);
                  if (l1iil11li.EventImpl_24()) {
                     break;
                  }
               }
            } else {
               for (EventListener l1i1illlili$ii1il11l111ii11iilx : list) {
                  try {
                     l1i1illlili$ii1il11l111ii11iilx.EventBus().invoke(l1i1illlili$ii1il11l111ii11iilx.StringHolder_8(), liil11l111liil1ll);
                  } catch (Exception exception) {
                     exception.printStackTrace();
                     System.out.println(l1i1illlili$ii1il11l111ii11iilx.StringHolder_8() + " " + l1i1illlili$ii1il11l111ii11iilx.ZenithInternal028);
                  }
               }
            }
         }
      } catch (Exception exception1) {
         exception1.printStackTrace();
      }

      return liil11l111liil1ll;
   }
}
