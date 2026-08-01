package zenith;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ClearHeadersHandler {
   private static final String[] ConstructorHolder = new String[]{"Connection", "Upgrade"};
   private static final String[] SocketFactoryHolder_3 = new String[]{"Upgrade", "websocket"};
   private static final String[] SocketFactoryHolder_2 = new String[]{"Sec-WebSocket-Version", "13"};
   private static final String SocketFactoryHolder = "\r\n";
   private boolean ZenithInternal086;
   private String StringHolder_13;
   private final String ZenithInternal072;
   private final String ZenithInternal056;
   private final URI GetSocketHandler;
   private String ZenithInternal142;
   private Set<String> ZenithInternal023;
   private List<StringHolder_10> ZenithInternal148;
   private List<String[]> ZenithException;

   public ClearHeadersHandler(boolean flag, String s, String s1, String s2) {
      this.ZenithInternal086 = flag;
      this.StringHolder_13 = s;
      this.ZenithInternal072 = s1;
      this.ZenithInternal056 = s2;
      this.GetSocketHandler = URI.create(String.format("%s://%s%s", flag ? "wss" : "ws", s1, s2));
   }

   public ClearHeadersHandler(ClearHeadersHandler il11i1ii1iili1lllllili1ll11i1) {
      this.ZenithInternal086 = il11i1ii1iili1lllllili1ll11i1.ZenithInternal086;
      this.StringHolder_13 = il11i1ii1iili1lllllili1ll11i1.StringHolder_13;
      this.ZenithInternal072 = il11i1ii1iili1lllllili1ll11i1.ZenithInternal072;
      this.ZenithInternal056 = il11i1ii1iili1lllllili1ll11i1.ZenithInternal056;
      this.GetSocketHandler = il11i1ii1iili1lllllili1ll11i1.GetSocketHandler;
      this.ZenithInternal142 = il11i1ii1iili1lllllili1ll11i1.ZenithInternal142;
      this.ZenithInternal023 = StringHolder_8(il11i1ii1iili1lllllili1ll11i1.ZenithInternal023);
      this.ZenithInternal148 = StringHolder_8(il11i1ii1iili1lllllili1ll11i1.ZenithInternal148);
      this.ZenithException = EventBus(il11i1ii1iili1lllllili1ll11i1.ZenithException);
   }

   public void EventTarget(String s) {
      if (!Event(s)) {
         throw new IllegalArgumentException(
            "'protocol' must be a non-empty string with characters in the range U+0021 to U+007E not including separator characters."
         );
      } else {
         synchronized (this) {
            if (this.ZenithInternal023 == null) {
               this.ZenithInternal023 = new LinkedHashSet<>();
            }

            this.ZenithInternal023.add(s);
         }
      }
   }

   public void ZenithInternal095(String s) {
      if (s != null) {
         synchronized (this) {
            if (this.ZenithInternal023 != null) {
               this.ZenithInternal023.remove(s);
               if (this.ZenithInternal023.size() == 0) {
                  this.ZenithInternal023 = null;
               }
            }
         }
      }
   }

   public void ZenithInternal021() {
      synchronized (this) {
         this.ZenithInternal023 = null;
      }
   }

   private static boolean Event(String s) {
      if (s != null && s.length() != 0) {
         int i = s.length();

         for (int j = 0; j < i; j++) {
            char c0 = s.charAt(j);
            if (c0 < '!' || '~' < c0 || zenith.ZenithInternal056.StringHolder_8(c0)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean EventImpl_24(String s) {
      synchronized (this) {
         return this.ZenithInternal023 == null ? false : this.ZenithInternal023.contains(s);
      }
   }

   public void StringHolder_8(StringHolder_10 iiil1lil1i1111llili1iilili) {
      if (iiil1lil1i1111llili1iilili != null) {
         synchronized (this) {
            if (this.ZenithInternal148 == null) {
               this.ZenithInternal148 = new ArrayList<>();
            }

            this.ZenithInternal148.add(iiil1lil1i1111llili1iilili);
         }
      }
   }

   public void ZenithInternal028(String s) {
      this.StringHolder_8(StringHolder_10.SocketFactoryHolder_3(s));
   }

   public void EventBus(StringHolder_10 iiil1lil1i1111llili1iilili) {
      if (iiil1lil1i1111llili1iilili != null) {
         synchronized (this) {
            if (this.ZenithInternal148 != null) {
               this.ZenithInternal148.remove(iiil1lil1i1111llili1iilili);
               if (this.ZenithInternal148.size() == 0) {
                  this.ZenithInternal148 = null;
               }
            }
         }
      }
   }

   public void EventImpl_21(String s) {
      if (s != null) {
         synchronized (this) {
            if (this.ZenithInternal148 != null) {
               ArrayList arraylist = new ArrayList();

               for (StringHolder_10 iiil1lil1i1111llili1iilili : this.ZenithInternal148) {
                  if (iiil1lil1i1111llili1iilili.getName().equals(s)) {
                     arraylist.add(iiil1lil1i1111llili1iilili);
                  }
               }

               for (StringHolder_10 iiil1lil1i1111llili1iilili1 : arraylist) {
                  this.ZenithInternal148.remove(iiil1lil1i1111llili1iilili1);
               }

               if (this.ZenithInternal148.size() == 0) {
                  this.ZenithInternal148 = null;
               }
            }
         }
      }
   }

   public void ZenithException_2() {
      synchronized (this) {
         this.ZenithInternal148 = null;
      }
   }

   public boolean EventTarget(StringHolder_10 iiil1lil1i1111llili1iilili) {
      if (iiil1lil1i1111llili1iilili == null) {
         return false;
      } else {
         synchronized (this) {
            return this.ZenithInternal148 == null ? false : this.ZenithInternal148.contains(iiil1lil1i1111llili1iilili);
         }
      }
   }

   public boolean EventImpl_13(String s) {
      if (s == null) {
         return false;
      } else {
         synchronized (this) {
            if (this.ZenithInternal148 == null) {
               return false;
            } else {
               for (StringHolder_10 iiil1lil1i1111llili1iilili : this.ZenithInternal148) {
                  if (iiil1lil1i1111llili1iilili.getName().equals(s)) {
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   public void addHeader(String s, String s1) {
      if (s != null && s.length() != 0) {
         if (s1 == null) {
            s1 = "";
         }

         synchronized (this) {
            if (this.ZenithException == null) {
               this.ZenithException = new ArrayList<>();
            }

            this.ZenithException.add(new String[]{s, s1});
         }
      }
   }

   public void byteHolder_2(String s) {
      if (s != null && s.length() != 0) {
         synchronized (this) {
            if (this.ZenithException != null) {
               ArrayList arraylist = new ArrayList();

               for (String[] astring : this.ZenithException) {
                  if (astring[0].equals(s)) {
                     arraylist.add(astring);
                  }
               }

               for (String[] astring1 : arraylist) {
                  this.ZenithException.remove(astring1);
               }

               if (this.ZenithException.size() == 0) {
                  this.ZenithException = null;
               }
            }
         }
      }
   }

   public void clearHeaders() {
      synchronized (this) {
         this.ZenithException = null;
      }
   }

   public void byteHolder(String s) {
      synchronized (this) {
         this.StringHolder_13 = s;
      }
   }

   public void StringHolder_8(String s, String s1) {
      if (s == null) {
         s = "";
      }

      if (s1 == null) {
         s1 = "";
      }

      String s2 = String.format("%s:%s", s, s1);
      this.byteHolder(s2);
   }

   public void ClearHeadersHandler() {
      synchronized (this) {
         this.StringHolder_13 = null;
      }
   }

   public URI getURI() {
      return this.GetSocketHandler;
   }

   public void StringHolder_4(String s) {
      this.ZenithInternal142 = s;
   }

   public String StringHolder_5() {
      return String.format("GET %s HTTP/1.1", this.ZenithInternal056);
   }

   public List<String[]> longHolder_3() {
      ArrayList arraylist = new ArrayList();
      arraylist.add(new String[]{"Host", this.ZenithInternal072});
      arraylist.add(ConstructorHolder);
      arraylist.add(SocketFactoryHolder_3);
      arraylist.add(SocketFactoryHolder_2);
      arraylist.add(new String[]{"Sec-WebSocket-Key", this.ZenithInternal142});
      if (this.ZenithInternal023 != null && this.ZenithInternal023.size() != 0) {
         arraylist.add(new String[]{"Sec-WebSocket-Protocol", SecureRandomHolder_2.StringHolder_8(this.ZenithInternal023, ", ")});
      }

      if (this.ZenithInternal148 != null && this.ZenithInternal148.size() != 0) {
         arraylist.add(new String[]{"Sec-WebSocket-Extensions", SecureRandomHolder_2.StringHolder_8(this.ZenithInternal148, ", ")});
      }

      if (this.StringHolder_13 != null && this.StringHolder_13.length() != 0) {
         arraylist.add(new String[]{"Authorization", "Basic " + ZenithInternal128.StringHolder_8(this.StringHolder_13)});
      }

      if (this.ZenithException != null && this.ZenithException.size() != 0) {
         arraylist.addAll(this.ZenithException);
      }

      return arraylist;
   }

   public static String StringHolder_8(String s, List<String[]> list) {
      StringBuilder stringbuilder = new StringBuilder();
      stringbuilder.append(s).append("\r\n");

      for (String[] astring : list) {
         stringbuilder.append(astring[0]).append(": ").append(astring[1]).append("\r\n");
      }

      stringbuilder.append("\r\n");
      return stringbuilder.toString();
   }

   private static Set<String> StringHolder_8(Set<String> set) {
      if (set == null) {
         return null;
      } else {
         LinkedHashSet linkedhashset = new LinkedHashSet(set.size());
         linkedhashset.addAll(set);
         return linkedhashset;
      }
   }

   private static List<StringHolder_10> StringHolder_8(List<StringHolder_10> list) {
      if (list == null) {
         return null;
      } else {
         ArrayList arraylist = new ArrayList(list.size());

         for (StringHolder_10 iiil1lil1i1111llili1iilili : list) {
            arraylist.add(new StringHolder_10(iiil1lil1i1111llili1iilili));
         }

         return arraylist;
      }
   }

   private static List<String[]> EventBus(List<String[]> list) {
      if (list == null) {
         return null;
      } else {
         ArrayList arraylist = new ArrayList(list.size());

         for (String[] astring : list) {
            arraylist.add(StringHolder_8(astring));
         }

         return arraylist;
      }
   }

   private static String[] StringHolder_8(String[] astring) {
      return new String[]{astring[0], astring[1]};
   }
}
