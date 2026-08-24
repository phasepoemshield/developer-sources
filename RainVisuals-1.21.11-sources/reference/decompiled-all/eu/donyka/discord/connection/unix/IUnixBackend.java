package eu.donyka.discord.connection.unix;

import java.io.IOException;

// $VF: Compiled from IUnixBackend.java
public interface IUnixBackend {
   void openPipe(String var1) throws IOException;

   int read(byte[] var1) throws IOException;

   void closePipe() throws IOException;

   boolean isConnected();

   int getAvailable() throws IOException;

   void write(byte[] var1) throws IOException;
}
