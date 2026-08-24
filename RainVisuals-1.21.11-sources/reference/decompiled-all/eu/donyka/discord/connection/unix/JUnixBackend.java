package eu.donyka.discord.connection.unix;

import java.io.File;
import java.io.IOException;
import org.newsclub.net.unix.AFUNIXSocket;
import org.newsclub.net.unix.AFUNIXSocketAddress;

// $VF: Compiled from JUnixBackend.java
public class JUnixBackend implements IUnixBackend {
   private AFUNIXSocket socket;

   @Override
   public int read(byte[] bytes) throws IOException {
      return this.socket != null && this.socket.isConnected() ? this.socket.getInputStream().read(bytes) : -1;
   }

   @Override
   public boolean isConnected() {
      return this.socket != null && this.socket.isConnected();
   }

   @Override
   public void openPipe(String path) throws IOException {
      AFUNIXSocket socket = AFUNIXSocket.newInstance();

      try {
         socket.connect(AFUNIXSocketAddress.of(new File(path)));
         this.socket = socket;
      } catch (IOException var4) {
         socket.close();
         throw var4;
      }
   }

   @Override
   public void closePipe() throws IOException {
      if (this.socket != null) {
         this.socket.close();
      }
   }

   @Override
   public int getAvailable() throws IOException {
      return this.socket != null && this.socket.isConnected() ? this.socket.getInputStream().available() : -1;
   }

   @Override
   public void write(byte[] bytes) throws IOException {
      if (this.socket != null && this.socket.isConnected()) {
         this.socket.getOutputStream().write(bytes);
      }
   }
}
