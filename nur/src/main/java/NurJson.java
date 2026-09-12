import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class NurJson {
   private final String s;
   private int i;

   private NurJson(String var1) {
      this.s = var1;
   }

   static Object parse(String var0) {
      NurJson var1 = new NurJson(var0);
      var1.ws();
      Object var2 = var1.value();
      var1.ws();
      return var2;
   }

   private void ws() {
      while (this.i < this.s.length()) {
         char var1 = this.s.charAt(this.i);
         if (var1 != ' ' && var1 != '\t' && var1 != '\r' && var1 != '\n' && var1 != '\ufeff') {
            return;
         }

         this.i++;
      }
   }

   private Object value() {
      char var1 = this.s.charAt(this.i);
      switch (var1) {
         case '"':
            return this.str();
         case '[':
            return this.arr();
         case 'f':
            this.i += 5;
            return Boolean.FALSE;
         case 'n':
            this.i += 4;
            return null;
         case 't':
            this.i += 4;
            return Boolean.TRUE;
         case '{':
            return this.obj();
         default:
            return this.num();
      }
   }

   private Map<String, Object> obj() {
      LinkedHashMap var1 = new LinkedHashMap();
      this.i++;
      this.ws();
      if (this.s.charAt(this.i) == '}') {
         this.i++;
         return var1;
      } else {
         char var3;
         do {
            this.ws();
            String var2 = this.str();
            this.ws();
            this.i++;
            this.ws();
            var1.put(var2, this.value());
            this.ws();
            var3 = this.s.charAt(this.i++);
         } while (var3 != '}');

         return var1;
      }
   }

   private List<Object> arr() {
      ArrayList var1 = new ArrayList();
      this.i++;
      this.ws();
      if (this.s.charAt(this.i) == ']') {
         this.i++;
         return var1;
      } else {
         char var2;
         do {
            this.ws();
            var1.add(this.value());
            this.ws();
            var2 = this.s.charAt(this.i++);
         } while (var2 != ']');

         return var1;
      }
   }

   private String str() {
      StringBuilder var1 = new StringBuilder();
      this.i++;

      while (true) {
         char var2 = this.s.charAt(this.i++);
         if (var2 == '"') {
            return var1.toString();
         }

         if (var2 != '\\') {
            var1.append(var2);
         } else {
            char var3 = this.s.charAt(this.i++);
            switch (var3) {
               case 'b':
                  var1.append('\b');
                  break;
               case 'c':
               case 'd':
               case 'e':
               case 'g':
               case 'h':
               case 'i':
               case 'j':
               case 'k':
               case 'l':
               case 'm':
               case 'o':
               case 'p':
               case 'q':
               case 's':
               default:
                  var1.append(var3);
                  break;
               case 'f':
                  var1.append('\f');
                  break;
               case 'n':
                  var1.append('\n');
                  break;
               case 'r':
                  var1.append('\r');
                  break;
               case 't':
                  var1.append('\t');
                  break;
               case 'u':
                  var1.append((char)Integer.parseInt(this.s.substring(this.i, this.i + 4), 16));
                  this.i += 4;
            }
         }
      }
   }

   private Number num() {
      int var1;
      for (var1 = this.i; this.i < this.s.length(); this.i++) {
         char var2 = this.s.charAt(this.i);
         if (var2 != '-' && var2 != '+' && var2 != '.' && var2 != 'e' && var2 != 'E' && (var2 < '0' || var2 > '9')) {
            break;
         }
      }

      String var5 = this.s.substring(var1, this.i);
      if (var5.indexOf(46) < 0 && var5.indexOf(101) < 0 && var5.indexOf(69) < 0) {
         try {
            return Integer.valueOf(var5);
         } catch (NumberFormatException var4) {
            return Long.valueOf(var5);
         }
      } else {
         return Double.valueOf(var5);
      }
   }
}
