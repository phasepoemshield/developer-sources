package zenith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringHolder_31 {
   private final String II11II1lIlIl1IIIlII1I1;
   private final Map<String, String> I1l11l1IlI1I11ll11I1I1 = new HashMap<>();

   public StringHolder_31(String s, InputStream inputstream) throws IOException {
      this.II11II1lIlIl1IIIlII1I1 = s;
      this.EventTarget(inputstream);
   }

   private void EventTarget(InputStream inputstream) throws IOException {
      String s;
      try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream))) {
         while ((s = bufferedreader.readLine()) != null) {
            s = s.trim();
            if (!s.isEmpty() && !s.startsWith("#")) {
               String[] astring = s.split("=", 2);
               if (astring.length == 2) {
                  this.I1l11l1IlI1I11ll11I1I1.put(astring[0].trim(), astring[1].trim());
               }
            }
         }
      }
   }

   // $VF: renamed from: get (java.lang.String) java.lang.String
   public String method_97(String s) {
      return this.I1l11l1IlI1I11ll11I1I1.getOrDefault(s, s);
   }

   public String getName() {
      return this.II11II1lIlIl1IIIlII1I1;
   }
}
