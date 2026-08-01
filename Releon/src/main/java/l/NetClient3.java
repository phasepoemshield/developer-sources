package l;

import java.net.URI;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class NetClient3 extends WebSocketClient {
   private String lastResponse;
   private CountDownLatch responseLatch;

   public NetClient3(URI var1) {
      super(var1);
   }

   public void onOpen(ServerHandshake var1) {
      Helper211.method1807("WebSocket connection opened");
   }

   public void onMessage(String var1) {
      this.lastResponse = var1;
      if (this.responseLatch != null) {
         this.responseLatch.countDown();
      }
   }

   public void onClose(int var1, String var2, boolean var3) {
      Helper211.method1807("WebSocket connection closed: " + var2);
   }

   public void onError(Exception var1) {
      Helper211.method1813("WebSocket error: " + var1.getMessage());
   }

   public boolean method1611() {
      return this.isOpen();
   }

   public String method1612(String var1) {
      if (!this.method1611()) {
         Helper211.method1813("Cannot send message: WebSocket not connected");
         return null;
      } else {
         try {
            this.responseLatch = new CountDownLatch(1);
            this.lastResponse = null;
            this.send(var1);
            this.responseLatch.await(5L, TimeUnit.SECONDS);
         } catch (InterruptedException var3) {
            Helper211.method1813("Interrupted while waiting for WebSocket response: " + var3.getMessage());
            return null;
         } catch (Exception var4) {
            Helper211.method1813("Error sending WebSocket message: " + var4.getMessage());
            return null;
         }

         return this.lastResponse;
      }
   }
}
