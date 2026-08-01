package zenith;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SecureRandomHolder_2 {
   private static final SecureRandom ZenithInternal153 = new SecureRandom();

   private SecureRandomHolder_2() {
   }

   public static byte[] ByteBufferHolder_2(String s) {
      if (s == null) {
         return null;
      } else {
         try {
            return s.getBytes("UTF-8");
         } catch (UnsupportedEncodingException unsupportedencodingexception) {
            return null;
         }
      }
   }

   public static String EventImpl_24(byte[] abyte) {
      return abyte == null ? null : EventBus(abyte, 0, abyte.length);
   }

   public static String EventBus(byte[] abyte, int i, int j) {
      if (abyte == null) {
         return null;
      } else {
         try {
            return new String(abyte, i, j, "UTF-8");
         } catch (UnsupportedEncodingException unsupportedencodingexception) {
            return null;
         } catch (IndexOutOfBoundsException indexoutofboundsexception) {
            return null;
         }
      }
   }

   public static byte[] nextBytes(byte[] abyte) {
      ZenithInternal153.nextBytes(abyte);
      return abyte;
   }

   public static byte[] nextBytes(int i) {
      byte[] abyte = new byte[i];
      return nextBytes(abyte);
   }

   public static String byteHolder_2(int i) {
      switch (i) {
         case 0:
            return "CONTINUATION";
         case 1:
            return "TEXT";
         case 2:
            return "BINARY";
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            if (1 <= i && i <= 7) {
               return String.format("DATA(0x%X)", i);
            } else {
               if (8 <= i && i <= 15) {
                  return String.format("CONTROL(0x%X)", i);
               }

               return String.format("0x%X", i);
            }
         case 8:
            return "CLOSE";
         case 9:
            return "PING";
         case 10:
            return "PONG";
      }
   }

   public static String StringHolder_8(InputStream inputstream, String s) throws IOException {
      ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();

      while (true) {
         int i = inputstream.read();
         if (i == -1) {
            if (bytearrayoutputstream.size() == 0) {
               return null;
            }
            break;
         }

         if (i == 10) {
            break;
         }

         if (i != 13) {
            bytearrayoutputstream.write(i);
         } else {
            int j = inputstream.read();
            if (j == -1) {
               bytearrayoutputstream.write(i);
               break;
            }

            if (j == 10) {
               break;
            }

            bytearrayoutputstream.write(i);
            bytearrayoutputstream.write(j);
         }
      }

      return bytearrayoutputstream.toString(s);
   }

   public static int EventBus(int[] aint) {
      int i = Integer.MAX_VALUE;

      for (int j = 0; j < aint.length; j++) {
         if (aint[j] < i) {
            i = aint[j];
         }
      }

      return i;
   }

   public static int EventTarget(int[] aint) {
      int i = Integer.MIN_VALUE;

      for (int j = 0; j < aint.length; j++) {
         if (i < aint[j]) {
            i = aint[j];
         }
      }

      return i;
   }

   public static String StringHolder_8(Collection<?> collection, String s) {
      StringBuilder stringbuilder = new StringBuilder();
      StringHolder_8(stringbuilder, collection, s);
      return stringbuilder.toString();
   }

   private static void StringHolder_8(StringBuilder stringbuilder, Collection<?> collection, String s) {
      boolean flag = true;

      for (Object object : collection) {
         if (flag) {
            flag = false;
         } else {
            stringbuilder.append(s);
         }

         stringbuilder.append(object.toString());
      }
   }

   public static String StringHolder_8(URI uri) {
      String s = uri.getHost();
      if (s != null) {
         return s;
      } else {
         s = ConnectThread(uri.getRawAuthority());
         return s != null ? s : CallableImpl(uri.toString());
      }
   }

   static String ConnectThread(String s) {
      if (s == null) {
         return null;
      } else {
         Matcher matcher = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(s);
         return matcher != null && matcher.matches() ? matcher.group(2) : null;
      }
   }

   static String CallableImpl(String s) {
      if (s == null) {
         return null;
      } else {
         Matcher matcher = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(s);
         return matcher != null && matcher.matches() ? matcher.group(2) : null;
      }
   }

   public static Constructor<?> StringHolder_8(String s, Class<?>[] aclass) {
      try {
         return Class.forName(s).getConstructor(aclass);
      } catch (Exception exception) {
         return null;
      }
   }

   public static Object StringHolder_8(Constructor<?> constructor, Object... aobject) {
      if (constructor == null) {
         return null;
      } else {
         try {
            return constructor.newInstance(aobject);
         } catch (Exception exception) {
            return null;
         }
      }
   }

   public static Method StringHolder_8(String s, String s1, Class<?>[] aclass) {
      try {
         return Class.forName(s).getMethod(s1, aclass);
      } catch (Exception exception) {
         return null;
      }
   }

   public static Object StringHolder_8(Method method, Object object, Object... aobject) {
      if (method == null) {
         return null;
      } else {
         try {
            return method.invoke(object, aobject);
         } catch (Exception exception) {
            return null;
         }
      }
   }
}
