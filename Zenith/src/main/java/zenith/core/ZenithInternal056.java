package zenith;

class ZenithInternal056 {
   public static boolean StringHolder_5(String s) {
      if (s != null && s.length() != 0) {
         int i = s.length();

         for (int j = 0; j < i; j++) {
            if (StringHolder_8(s.charAt(j))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean StringHolder_8(char c0) {
      switch (c0) {
         case '\t':
         case ' ':
         case '"':
         case '(':
         case ')':
         case ',':
         case '/':
         case ':':
         case ';':
         case '<':
         case '=':
         case '>':
         case '?':
         case '@':
         case '[':
         case '\\':
         case ']':
         case '{':
         case '}':
            return true;
         default:
            return false;
      }
   }

   public static String longHolder_3(String s) {
      if (s == null) {
         return null;
      } else {
         int i = s.length();
         if (i >= 2 && s.charAt(0) == '"' && s.charAt(i - 1) == '"') {
            s = s.substring(1, i - 1);
            return ZenithInternal070(s);
         } else {
            return s;
         }
      }
   }

   public static String ZenithInternal070(String s) {
      if (s == null) {
         return null;
      } else if (s.indexOf(92) < 0) {
         return s;
      } else {
         int i = s.length();
         boolean flag = false;
         StringBuilder stringbuilder = new StringBuilder();

         for (int j = 0; j < i; j++) {
            char c0 = s.charAt(j);
            if (c0 == '\\' && !flag) {
               flag = true;
            } else {
               flag = false;
               stringbuilder.append(c0);
            }
         }

         return stringbuilder.toString();
      }
   }
}
