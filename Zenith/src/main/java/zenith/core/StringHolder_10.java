package zenith;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringHolder_10 {
   public static final String Pathteleport = "permessage-deflate";
   private final String Pvpsafe;
   private final Map<String, String> Serverhelper;

   public StringHolder_10(String s) {
      if (!ZenithInternal056.StringHolder_5(s)) {
         throw new IllegalArgumentException("'name' is not a valid token.");
      } else {
         this.Pvpsafe = s;
         this.Serverhelper = new LinkedHashMap<>();
      }
   }

   public StringHolder_10(StringHolder_10 iiil1lil1i1111llili1iilili1) {
      if (iiil1lil1i1111llili1iilili1 == null) {
         throw new IllegalArgumentException("'source' is null.");
      } else {
         this.Pvpsafe = iiil1lil1i1111llili1iilili1.getName();
         this.Serverhelper = new LinkedHashMap<>(iiil1lil1i1111llili1iilili1.Vec3dHolder_2());
      }
   }

   public String getName() {
      return this.Pvpsafe;
   }

   public Map<String, String> Vec3dHolder_2() {
      return this.Serverhelper;
   }

   public boolean ReadingThread(String s) {
      return this.Serverhelper.containsKey(s);
   }

   public String ConstructorHolder(String s) {
      return this.Serverhelper.get(s);
   }

   public StringHolder_10 byteHolder_2(String s, String s1) {
      if (!ZenithInternal056.StringHolder_5(s)) {
         throw new IllegalArgumentException("'key' is not a valid token.");
      } else if (s1 != null && !ZenithInternal056.StringHolder_5(s1)) {
         throw new IllegalArgumentException("'value' is not a valid token.");
      } else {
         this.Serverhelper.put(s, s1);
         return this;
      }
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder(this.Pvpsafe);

      for (Entry entry : this.Serverhelper.entrySet()) {
         stringbuilder.append("; ").append((String)entry.getKey());
         String s = (String)entry.getValue();
         if (s != null && s.length() != 0) {
            stringbuilder.append("=").append(s);
         }
      }

      return stringbuilder.toString();
   }

   void permessagedeflate() throws ZenithException {
   }

   public static StringHolder_10 SocketFactoryHolder_3(String s) {
      if (s == null) {
         return null;
      } else {
         String[] astring = s.trim().split("\\s*;\\s*");
         if (astring.length == 0) {
            return null;
         } else {
            String s1 = astring[0];
            if (!ZenithInternal056.StringHolder_5(s1)) {
               return null;
            } else {
               StringHolder_10 iiil1lil1i1111llili1iilili = SocketFactoryHolder_2(s1);

               for (int i = 1; i < astring.length; i++) {
                  String[] astring1 = astring[i].split("\\s*=\\s*", 2);
                  if (astring1.length != 0 && astring1[0].length() != 0) {
                     String s2 = astring1[0];
                     if (ZenithInternal056.StringHolder_5(s2)) {
                        String s3 = ZenithInternal095(astring1);
                        if (s3 == null || ZenithInternal056.StringHolder_5(s3)) {
                           iiil1lil1i1111llili1iilili.byteHolder_2(s2, s3);
                        }
                     }
                  }
               }

               return iiil1lil1i1111llili1iilili;
            }
         }
      }
   }

   private static String ZenithInternal095(String[] astring) {
      return astring.length != 2 ? null : ZenithInternal056.longHolder_3(astring[1]);
   }

   private static StringHolder_10 SocketFactoryHolder_2(String s) {
      return (StringHolder_10)("permessage-deflate".equals(s) ? new permessagedeflate(s) : new StringHolder_10(s));
   }
}
