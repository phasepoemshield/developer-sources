package zenith;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Map.Entry;

class StringHolder_12 {
   private static final String BlockPosHolder_2 = "\r\n";
   private final String GetSlotIdHandler_2;
   private final int ScreenHolder;
   private final booleanHolder_2 EventImpl_27;

   public StringHolder_12(String s, int i, booleanHolder_2 i1lll11il1l1lillill) {
      this.GetSlotIdHandler_2 = s;
      this.ScreenHolder = i;
      this.EventImpl_27 = i1lll11il1l1lillill;
   }

   public void StringHolder_8(Socket socket) throws IOException {
      this.EventBus(socket);
      this.EventTarget(socket);
   }

   private void EventBus(Socket socket) throws IOException {
      String s = this.SocketFactoryHolder_2();
      byte[] abyte = SecureRandomHolder_2.ByteBufferHolder_2(s);
      OutputStream outputstream = socket.getOutputStream();
      outputstream.write(abyte);
      outputstream.flush();
   }

   private String SocketFactoryHolder_2() {
      String s = String.format("%s:%d", this.GetSlotIdHandler_2, this.ScreenHolder);
      StringBuilder stringbuilder = new StringBuilder()
         .append("CONNECT ")
         .append(s)
         .append(" HTTP/1.1")
         .append("\r\n")
         .append("Host: ")
         .append(s)
         .append("\r\n");
      this.StringHolder_8(stringbuilder);
      this.EventBus(stringbuilder);
      return stringbuilder.append("\r\n").toString();
   }

   private void StringHolder_8(StringBuilder stringbuilder) {
      for (Entry entry : this.EventImpl_27.ZenithInternal045().entrySet()) {
         String s = (String)entry.getKey();

         for (String s1 : (List)entry.getValue()) {
            if (s1 == null) {
               s1 = "";
            }

            stringbuilder.append(s).append(": ").append(s1).append("\r\n");
         }
      }
   }

   private void EventBus(StringBuilder stringbuilder) {
      String s = this.EventImpl_27.GetSocketHandler();
      if (s != null && s.length() != 0) {
         String s1 = this.EventImpl_27.ZenithInternal142();
         if (s1 == null) {
            s1 = "";
         }

         String s2 = String.format("%s:%s", s, s1);
         stringbuilder.append("Proxy-Authorization: Basic ").append(ZenithInternal128.StringHolder_8(s2)).append("\r\n");
      }
   }

   private void EventTarget(Socket socket) throws IOException {
      InputStream inputstream = socket.getInputStream();
      this.StringHolder_8(inputstream);
      this.EventBus(inputstream);
   }

   private void StringHolder_8(InputStream inputstream) throws IOException {
      String s = SecureRandomHolder_2.StringHolder_8(inputstream, "UTF-8");
      if (s != null && s.length() != 0) {
         String[] astring = s.split(" +", 3);
         if (astring.length < 2) {
            throw new IOException("The status line in the response from the proxy server is badly formatted. The status line is: " + s);
         } else if (!"200".equals(astring[1])) {
            throw new IOException("The status code in the response from the proxy server is not '200 Connection established'. The status line is: " + s);
         }
      } else {
         throw new IOException("The response from the proxy server does not contain a status line.");
      }
   }

   private void EventBus(InputStream inputstream) throws IOException {
      int i = 0;

      while (true) {
         int j = inputstream.read();
         if (j == -1) {
            throw new EOFException("The end of the stream from the proxy server was reached unexpectedly.");
         }

         if (j == 10) {
            if (i == 0) {
               return;
            }

            i = 0;
         } else if (j != 13) {
            i++;
         } else {
            j = inputstream.read();
            if (j == -1) {
               throw new EOFException("The end of the stream from the proxy server was reached unexpectedly after a carriage return.");
            }

            if (j != 10) {
               i += 2;
            } else {
               if (i == 0) {
                  return;
               }

               i = 0;
            }
         }
      }
   }

   String SocketFactoryHolder() {
      return this.GetSlotIdHandler_2;
   }
}
