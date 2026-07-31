package zenith;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

class ConstructorHolder {
   private static Constructor<?> EventImpl_31;
   private static Method EventImpl_4;

   private static void initialize() throws Exception {
      EventImpl_31 = SecureRandomHolder_2.StringHolder_8("javax.net.ssl.SNIHostName", new Class[]{String.class});
      EventImpl_4 = SecureRandomHolder_2.StringHolder_8("javax.net.ssl.SSLParameters", "setServerNames", new Class[]{List.class});
   }

   private static Object ClearHeadersHandler(String s) {
      return SecureRandomHolder_2.StringHolder_8(EventImpl_31, s);
   }

   private static List<Object> EventTarget(String[] astring) {
      ArrayList arraylist = new ArrayList(astring.length);

      for (String s : astring) {
         arraylist.add(ClearHeadersHandler(s));
      }

      return arraylist;
   }

   private static void StringHolder_8(SSLParameters sslparameters, String[] astring) {
      SecureRandomHolder_2.StringHolder_8(EventImpl_4, sslparameters, EventTarget(astring));
   }

   static void StringHolder_8(Socket socket, String[] astring) {
      if (socket instanceof SSLSocket) {
         if (astring != null) {
            int i = ZenithClient();
            if (i > 0 && i < 24) {
               try {
                  Method method = socket.getClass().getMethod("setHostname", String.class);
                  method.invoke(socket, astring[0]);
               } catch (Exception exception) {
                  System.err.println("SNI configuration failed: " + exception.getMessage());
               }
            } else {
               SSLParameters sslparameters = ((SSLSocket)socket).getSSLParameters();
               if (sslparameters != null) {
                  StringHolder_8(sslparameters, astring);
               }
            }
         }
      }
   }

   public static int ZenithClient() {
      try {
         return Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
      } catch (Exception exception1) {
         try {
            return Integer.parseInt((String)Class.forName("android.os.Build$VERSION").getField("SDK").get(null));
         } catch (Exception exception) {
            return 0;
         }
      }
   }

   static {
      try {
         initialize();
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }
}
