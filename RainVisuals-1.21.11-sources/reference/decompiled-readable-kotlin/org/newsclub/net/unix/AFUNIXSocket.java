package org.newsclub.net.unix;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from AFUNIXSocket.java
public final class AFUNIXSocket extends AFSocket<AFUNIXSocketAddress> implements AFUNIXSocketExtensions {
   private static final AFSocket.Constructor<AFUNIXSocketAddress> CONSTRUCTOR_STRICT = new AFSocket.Constructor<AFUNIXSocketAddress>()   // $VF: Compiled from AFUNIXSocket.java
 {
      @Override
      public @NonNull AFSocket<AFUNIXSocketAddress> newInstance(FileDescriptor fdObj, AFSocketFactory<AFUNIXSocketAddress> factory) throws SocketException {
         return new AFUNIXSocket(new AFUNIXSocketImpl(fdObj), factory);
      }
   };

   @Override
   public AFUNIXSocketCredentials getPeerCredentials() throws IOException {
      if (!this.isClosed() && this.isConnected()) {
         return ((AFUNIXSocketImpl)this.getAFImpl()).getPeerCredentials();
      } else {
         throw new SocketException("Not connected");
      }
   }

   static AFUNIXSocket newLenientInstance() throws IOException {
      return newInstance();
   }

   protected AFUNIXSocketChannel newChannel() {
      return new AFUNIXSocketChannel(this);
   }

   private AFUNIXSocket(AFSocketImpl<AFUNIXSocketAddress> impl, AFSocketFactory<AFUNIXSocketAddress> factory) throws SocketException {
      super(impl, factory);
   }

   @Override
   public void clearReceivedFileDescriptors() {
      ((AFUNIXSocketImpl)this.getAFImpl()).clearReceivedFileDescriptors();
   }

   private static void miniSelftest() {
      AtomicBoolean success = new AtomicBoolean(true);

      try {
         AFUNIXSocketAddress e = AFUNIXSocketAddress.ofNewTempFile();
         System.out.println("Using temporary address: " + e);

         try (AFUNIXServerSocket server = e.newBoundServerSocket()) {
            Thread t = new Thread(() -> {
               try {
                  try (AFUNIXSocket client = server.accept()) {
                     System.out.println("Server accepted client connection");

                     try (SocketChannel chann = client.getChannel()) {
                        ByteBuffer bb = ByteBuffer.allocate(64).order(ByteOrder.BIG_ENDIAN);
                        int numRead = 0;

                        while (bb.position() != 4 && numRead != -1) {
                           numRead = chann.read(bb);
                        }

                        if (bb.position() != 4) {
                           throw new IOException("Unexpected number of bytes read: " + bb.position());
                        }

                        bb.flip();
                        int vx;
                        if ((vx = bb.getInt()) != -1412567278) {
                           throw new IOException("Received unexpected data from client: 0x" + Integer.toHexString(vx));
                        }

                        bb.clear();
                        bb.putLong(18838586746761L);
                        bb.flip();
                        chann.write(bb);
                     }
                  } finally {
                     server.close();
                  }
               } catch (Exception var19) {
                  success.set(false);
                  var19.printStackTrace();
               }
            });
            t.start();

            try (
               AFUNIXSocket socket = e.newConnectedSocket();
               DataInputStream in = new DataInputStream(socket.getInputStream());
               DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            ) {
               out.writeInt(-1412567278);
               out.flush();
               long v = in.readLong();
               if (v != 18838586746761L) {
                  throw new IOException("Received unexpected data from server: 0x" + Long.toHexString(v));
               }
            }

            System.out.println("Data exchange succeeded");
         }
      } catch (Exception var28) {
         success.set(false);
         var28.printStackTrace();
         return;
      } finally {
         System.out.println("mini selftest " + (success.get() ? "passed" : "failed"));
      }
   }

   static AFUNIXSocket newInstance(AFUNIXSocketFactory factory) throws SocketException {
      return (AFUNIXSocket)AFSocket.<AFUNIXSocketAddress>newInstance(AFUNIXSocket::new, factory);
   }

   AFUNIXSocket(FileDescriptor factory, AFSocketFactory<AFUNIXSocketAddress> fd) throws SocketException {
      this(new AFUNIXSocketImpl.Lenient(fd), factory);
   }

   public static AFUNIXSocket newStrictInstance() throws IOException {
      return (AFUNIXSocket)AFSocket.<AFUNIXSocketAddress>newInstance(CONSTRUCTOR_STRICT, (AFUNIXSocketFactory)null);
   }

   public static AFUNIXSocket newInstance() throws IOException {
      return (AFUNIXSocket)AFSocket.<AFUNIXSocketAddress>newInstance(AFUNIXSocket::new, (AFUNIXSocketFactory)null);
   }

   @Override
   public void setOutboundFileDescriptors(FileDescriptor... fdescs) throws IOException {
      if (fdescs != null && fdescs.length > 0 && !this.isConnected()) {
         throw new SocketException("Not connected");
      }

      ((AFUNIXSocketImpl)this.getAFImpl()).setOutboundFileDescriptors(fdescs);
   }

   static AFUNIXSocket newInstance(FileDescriptor remotePort, int localPort, int fdObj) throws IOException {
      return (AFUNIXSocket)AFSocket.<AFUNIXSocketAddress>newInstance(AFUNIXSocket::new, (AFUNIXSocketFactory)null, fdObj, localPort, remotePort);
   }

   public AFUNIXSocketChannel getChannel() {
      return (AFUNIXSocketChannel)super.getChannel();
   }

   @Override
   public FileDescriptor[] getReceivedFileDescriptors() throws IOException {
      return ((AFUNIXSocketImpl)this.getAFImpl()).getReceivedFileDescriptors();
   }

   public static AFUNIXSocket connectTo(AFUNIXSocketAddress addr) throws IOException {
      return (AFUNIXSocket)AFSocket.<AFUNIXSocketAddress>connectTo(AFUNIXSocket::new, addr);
   }

   @Override
   public boolean hasOutboundFileDescriptors() {
      return ((AFUNIXSocketImpl)this.getAFImpl()).hasOutboundFileDescriptors();
   }

   public static boolean isSupported() {
      return AFSocket.isSupported() && AFSocket.supports(AFSocketCapability.CAPABILITY_UNIX_DOMAIN);
   }

   public static void main(String[] args) {
      System.out.print(AFUNIXSocket.class.getName() + ".isSupported(): ");
      System.out.flush();
      System.out.println(isSupported());

      for (AFSocketCapability cap : AFSocketCapability.values()) {
         System.out.print(cap + ": ");
         System.out.flush();
         System.out.println(AFSocket.supports(cap));
      }

      System.out.println();
      if (AFSocket.supports(AFSocketCapability.CAPABILITY_UNIX_DOMAIN)) {
         System.out.println("Starting mini selftest...");
         miniSelftest();
      } else {
         System.out.println("Skipping mini selftest; AFSocketCapability.CAPABILITY_UNIX_DOMAIN is missing");
      }
   }
}
