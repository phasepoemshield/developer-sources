package zenith;

import javax.net.ssl.SSLSocket;

public class longHolder_3 extends ZenithException {
   private static final long GetPayloadLengthHandler = 1L;
   private final SSLSocket FilterInputStreamImpl;
   private final String ZenithInternal123;

   public longHolder_3(SSLSocket sslsocket, String s) {
      super(
         ZenithInternal148.Itemusecontroller, String.format("The certificate of the peer%s does not match the expected hostname (%s)", StringHolder_8(sslsocket), s)
      );
      this.FilterInputStreamImpl = sslsocket;
      this.ZenithInternal123 = s;
   }

   private static String StringHolder_8(SSLSocket sslsocket) {
      try {
         return String.format(" (%s)", sslsocket.getSession().getPeerPrincipal().toString());
      } catch (Exception exception) {
         return "";
      }
   }

   public SSLSocket ZenithInternal070() {
      return this.FilterInputStreamImpl;
   }

   public String EventImpl_21() {
      return this.ZenithInternal123;
   }
}
