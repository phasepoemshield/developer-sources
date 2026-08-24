package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.net.DatagramSocket;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from FileDescriptorCast.java
public final class FileDescriptorCast implements FileDescriptorAccess {
   private static final Map<Class<?>, FileDescriptorCast.CastingProviderMap> PRIMARY_TYPE_PROVIDERS_MAP = Collections.synchronizedMap(new HashMap<>());
   private static final FileDescriptorCast.CastingProviderMap GLOBAL_PROVIDERS = new FileDescriptorCast.CastingProviderMap()   // $VF: Compiled from FileDescriptorCast.java
 {
      @Override
      protected void addProviders() {
         this.addProvider(
            WritableByteChannel.class, new FileDescriptorCast.CastingProvider<WritableByteChannel>()         // $VF: Compiled from FileDescriptorCast.java
    {
               public WritableByteChannel provideAs(FileDescriptorCast fdc, Class<? super WritableByteChannel> desiredType) throws IOException {
                  return new FileOutputStream(fdc.getFileDescriptor()).getChannel();
               }
            }
         );
         this.addProvider(
            ReadableByteChannel.class, new FileDescriptorCast.CastingProvider<ReadableByteChannel>()         // $VF: Compiled from FileDescriptorCast.java
    {
               public ReadableByteChannel provideAs(FileDescriptorCast desiredType, Class<? super ReadableByteChannel> fdc) throws IOException {
                  return FileDescriptorCast.FD_IS_PROVIDER.apply(fdc.getFileDescriptor()).getChannel();
               }
            }
         );
         this.addProvider(FileChannel.class, new FileDescriptorCast.CastingProvider<FileChannel>()         // $VF: Compiled from FileDescriptorCast.java
 {
            public FileChannel provideAs(FileDescriptorCast desiredType, Class<? super FileChannel> fdc) throws IOException {
               return RAFChannelProvider.getFileChannel(fdc.getFileDescriptor());
            }
         });
         this.addProvider(
            FileOutputStream.class, new FileDescriptorCast.CastingProvider<FileOutputStream>()         // $VF: Compiled from FileDescriptorCast.java
    {
               public FileOutputStream provideAs(FileDescriptorCast fdc, Class<? super FileOutputStream> desiredType) throws IOException {
                  return new FileOutputStream(fdc.getFileDescriptor());
               }
            }
         );
         this.addProvider(
            FileInputStream.class, new FileDescriptorCast.CastingProvider<FileInputStream>()         // $VF: Compiled from FileDescriptorCast.java
    {
               public FileInputStream provideAs(FileDescriptorCast fdc, Class<? super FileInputStream> desiredType) throws IOException {
                  return FileDescriptorCast.FD_IS_PROVIDER.apply(fdc.getFileDescriptor());
               }
            }
         );
         this.addProvider(FileDescriptor.class, new FileDescriptorCast.CastingProvider<FileDescriptor>()         // $VF: Compiled from FileDescriptorCast.java
 {
            public FileDescriptor provideAs(FileDescriptorCast desiredType, Class<? super FileDescriptor> fdc) throws IOException {
               return fdc.getFileDescriptor();
            }
         });
         this.addProvider(Integer.class, new FileDescriptorCast.CastingProvider<Integer>()         // $VF: Compiled from FileDescriptorCast.java
 {
            public Integer provideAs(FileDescriptorCast desiredType, Class<? super Integer> fdc) throws IOException {
               FileDescriptor fd = fdc.getFileDescriptor();
               int val = fd.valid() ? NativeUnixSocket.getFD(fd) : -1;
               if (val == -1) {
                  throw new IOException("Not a valid file descriptor");
               } else {
                  return val;
               }
            }
         });
         if (AFSocket.supports(AFSocketCapability.CAPABILITY_FD_AS_REDIRECT)) {
            this.addProvider(Redirect.class, new FileDescriptorCast.CastingProvider<Redirect>()            // $VF: Compiled from FileDescriptorCast.java
 {
               public Redirect provideAs(FileDescriptorCast fdc, Class<? super Redirect> desiredType) throws IOException {
                  Redirect red = NativeUnixSocket.initRedirect(fdc.getFileDescriptor());
                  if (red == null) {
                     throw new ClassCastException("Cannot access file descriptor as " + desiredType);
                  } else {
                     return red;
                  }
               }
            });
         }
      }
   };
   private static final int FD_ERR = getFdIfPossible(FileDescriptor.err);
   private static final FileDescriptorCast.CastingProviderMap GLOBAL_PROVIDERS_FINAL = new FileDescriptorCast.CastingProviderMap()   // $VF: Compiled from FileDescriptorCast.java
 {
      @Override
      protected void addProviders() {
         this.addProvider(FileDescriptor.class, new FileDescriptorCast.CastingProvider<FileDescriptor>()         // $VF: Compiled from FileDescriptorCast.java
 {
            public FileDescriptor provideAs(FileDescriptorCast desiredType, Class<? super FileDescriptor> fdc) throws IOException {
               return fdc.getFileDescriptor();
            }
         });
      }
   };
   private static final AFFunction<FileDescriptor, FileInputStream> FD_IS_PROVIDER = System.getProperty("osv.version") != null
      ? x$0 -> new FileDescriptorCast.LenientFileInputStream(x$0)
      : FileInputStream::new;
   private int remotePort;
   private static final int FD_IN = getFdIfPossible(FileDescriptor.in);
   private final FileDescriptor fdObj;
   private final FileDescriptorCast.CastingProviderMap cpm;
   private int localPort = 0;
   private static final int FD_OUT = getFdIfPossible(FileDescriptor.out);

   private static void registerCastingProviders(Class<?> cpm, FileDescriptorCast.CastingProviderMap primaryType) {
      Objects.requireNonNull(primaryType);
      FileDescriptorCast.CastingProviderMap prev;
      if ((prev = PRIMARY_TYPE_PROVIDERS_MAP.put(primaryType, cpm)) != null) {
         PRIMARY_TYPE_PROVIDERS_MAP.put(primaryType, prev);
         throw new IllegalStateException("Already registered: " + primaryType);
      }
   }

   public FileDescriptorCast withRemotePort(int port) {
      if (port < 0) {
         throw new IllegalArgumentException();
      }

      this.remotePort = port;
      return this;
   }

   private static int getFdIfPossible(FileDescriptor fd) {
      if (!NativeUnixSocket.isLoaded()) {
         return -1;
      }

      try {
         return !fd.valid() ? -1 : NativeUnixSocket.getFD(fd);
      } catch (IOException var2) {
         return -1;
      }
   }

   static {
      registerGenericSocketSupport();
   }

   private static <S extends AFServerSocket<?>> S reconfigure(boolean socket, S isChannel) throws IOException {
      reconfigure(isChannel, socket.getChannel());
      socket.getAFImpl().getCore().disableCleanFd();
      return socket;
   }

   private static <S extends AFSocket<?>> S reconfigure(boolean socket, S isChannel) throws IOException {
      reconfigure(isChannel, socket.getChannel());
      socket.getAFImpl().getCore().disableCleanFd();
      return socket;
   }

   public static FileDescriptorCast duplicating(FileDescriptor fdObj) throws IOException {
      if (!fdObj.valid()) {
         throw new IOException("Not a valid file descriptor");
      } else {
         FileDescriptor duplicate = NativeUnixSocket.duplicate(fdObj, new FileDescriptor());
         if (duplicate == null) {
            throw new IOException("Could not duplicate file descriptor");
         } else {
            return using(duplicate);
         }
      }
   }

   private FileDescriptorCast(FileDescriptor fdObj, FileDescriptorCast.CastingProviderMap cpm) {
      this.remotePort = 0;
      this.fdObj = Objects.requireNonNull(fdObj);
      this.cpm = Objects.requireNonNull(cpm);
   }

   private static <S extends AFSomeSocketChannel> void reconfigureKeepBlockingState(S socketChannel) throws IOException {
      int result = NativeUnixSocket.checkBlocking(socketChannel.getFileDescriptor());
      boolean blocking;
      switch (result) {
         case 0:
            blocking = false;
            break;
         case 1:
            blocking = true;
            break;
         case 2:
            socketChannel.configureBlocking(false);
            socketChannel.configureBlocking(true);
            return;
         default:
            throw new OperationNotSupportedSocketException("Invalid blocking state");
      }

      socketChannel.configureBlocking(blocking);
   }

   public FileDescriptorCast withLocalPort(int port) {
      if (port < 0) {
         throw new IllegalArgumentException();
      }

      this.localPort = port;
      return this;
   }

   private static void registerGenericSocketSupport() {
      registerCastingProviders(Socket.class, new FileDescriptorCast.CastingProviderMap()      // $VF: Compiled from FileDescriptorCast.java
 {
         @Override
         protected void addProviders() {
            this.addProviders(FileDescriptorCast.GLOBAL_PROVIDERS);
            this.registerGenericSocketProviders();
         }
      });
      registerCastingProviders(DatagramSocket.class, new FileDescriptorCast.CastingProviderMap()      // $VF: Compiled from FileDescriptorCast.java
 {
         @Override
         protected void addProviders() {
            this.addProviders(FileDescriptorCast.GLOBAL_PROVIDERS);
            this.registerGenericDatagramSocketProviders();
         }
      });
   }

   private static <S extends AFSomeSocketChannel> void reconfigureSetBlocking(S socketChannel) throws IOException {
      int result = NativeUnixSocket.checkBlocking(socketChannel.getFileDescriptor());
      switch (result) {
         case 0:
         case 2:
            socketChannel.configureBlocking(false);
            socketChannel.configureBlocking(true);
            return;
         case 1:
            return;
         default:
            throw new OperationNotSupportedSocketException("Invalid blocking state");
      }
   }

   static <A extends AFSocketAddress> void registerCastingProviders(AFAddressFamilyConfig<A> config) {
      final Class<? extends AFSocket<A>> socketClass = config.socketClass();
      final Class<? extends AFDatagramSocket<A>> datagramSocketClass = config.datagramSocketClass();
      registerCastingProviders(
         socketClass,
         new FileDescriptorCast.CastingProviderMap()      // $VF: Compiled from FileDescriptorCast.java
    {
            @Override
            protected void addProviders() {
               this.addProviders(FileDescriptorCast.GLOBAL_PROVIDERS);
               FileDescriptorCast.CastingProviderSocketOrChannel<AFSocket<A>> cpSocketOrChannel = (fdc, desiredType, isChannel) -> FileDescriptorCast.reconfigure(
                  isChannel, AFSocket.newInstance(config.socketConstructor(), (AFSocketFactory<A>)null, fdc.getFileDescriptor(), fdc.localPort, fdc.remotePort)
               );
               FileDescriptorCast.CastingProviderSocketOrChannel<AFServerSocket<A>> cpServerSocketOrChannel = (fdc, desiredType, isChannel) -> FileDescriptorCast.reconfigure(
                  isChannel, AFServerSocket.newInstance(config.serverSocketConstructor(), fdc.getFileDescriptor(), fdc.localPort, fdc.remotePort)
               );
               this.registerGenericSocketProviders();
               this.addProvider(socketClass, (fdc, desiredType) -> cpSocketOrChannel.provideAs(fdc, desiredType, false));
               this.addProvider(config.serverSocketClass(), (fdc, desiredType) -> cpServerSocketOrChannel.provideAs(fdc, desiredType, false));
               this.addProvider(config.socketChannelClass(), (fdc, desiredType) -> cpSocketOrChannel.provideAs(fdc, AFSocket.class, true).getChannel());
               this.addProvider(
                  config.serverSocketChannelClass(), (fdc, desiredType) -> cpServerSocketOrChannel.provideAs(fdc, AFServerSocket.class, true).getChannel()
               );
            }
         }
      );
      registerCastingProviders(
         datagramSocketClass,
         new FileDescriptorCast.CastingProviderMap()      // $VF: Compiled from FileDescriptorCast.java
    {
            @Override
            protected void addProviders() {
               this.addProviders(FileDescriptorCast.GLOBAL_PROVIDERS);
               FileDescriptorCast.CastingProviderSocketOrChannel<AFDatagramSocket<A>> cpDatagramSocketOrChannel = (fdc, desiredType, isChannel) -> FileDescriptorCast.reconfigure(
                  isChannel, AFDatagramSocket.newInstance(config.datagramSocketConstructor(), fdc.getFileDescriptor(), fdc.localPort, fdc.remotePort)
               );
               this.registerGenericDatagramSocketProviders();
               this.addProvider(datagramSocketClass, (fdc, desiredType) -> cpDatagramSocketOrChannel.provideAs(fdc, desiredType, false));
               this.addProvider(
                  config.datagramChannelClass(), (fdc, desiredType) -> cpDatagramSocketOrChannel.provideAs(fdc, AFDatagramSocket.class, true).getChannel()
               );
            }
         }
      );
   }

   @Unsafe
   public static FileDescriptorCast unsafeUsing(int fd) throws IOException {
      AFSocket.ensureUnsafeSupported();
      if (fd == -1) {
         throw new IOException("Not a valid file descriptor");
      }

      FileDescriptor fdObj;
      if (fd == FD_IN) {
         fdObj = FileDescriptor.in;
      } else if (fd == FD_OUT) {
         fdObj = FileDescriptor.out;
      } else if (fd == FD_ERR) {
         fdObj = FileDescriptor.err;
      } else {
         fdObj = null;
      }

      if (fdObj != null) {
         int check = getFdIfPossible(fdObj);
         if (fd == check) {
            return using(fdObj);
         }
      }

      fdObj = new FileDescriptor();
      NativeUnixSocket.initFD(fdObj, fd);
      return using(fdObj);
   }

   public boolean isAvailable(Class<?> desiredType) throws IOException {
      return this.cpm.providers.containsKey(desiredType);
   }

   public static FileDescriptorCast using(FileDescriptor fdObj) throws IOException {
      if (!fdObj.valid()) {
         throw new IOException("Not a valid file descriptor");
      }

      Class<?> primaryType = NativeUnixSocket.isLoaded() ? NativeUnixSocket.primaryType(fdObj) : null;
      if (primaryType == null) {
         primaryType = FileDescriptor.class;
      }

      triggerInit();
      FileDescriptorCast.CastingProviderMap map = PRIMARY_TYPE_PROVIDERS_MAP.get(primaryType);
      return new FileDescriptorCast(fdObj, map == null ? GLOBAL_PROVIDERS : map);
   }

   private static <S extends AFDatagramSocket<?>> S reconfigure(boolean socket, S isChannel) throws IOException {
      reconfigure(isChannel, socket.getChannel());
      socket.getAFImpl().getCore().disableCleanFd();
      return socket;
   }

   private static <S extends AFSomeSocketChannel> void reconfigure(boolean isChannel, S socketChannel) throws IOException {
      if (isChannel) {
         reconfigureKeepBlockingState(socketChannel);
      } else {
         reconfigureSetBlocking(socketChannel);
      }
   }

   public <K> @NonNull K as(Class<K> desiredType) throws IOException {
      Objects.requireNonNull(desiredType);
      FileDescriptorCast.CastingProvider<? extends K> provider = this.cpm.get(desiredType);
      if (provider != null) {
         K obj = desiredType.cast(provider.provideAs(this, desiredType));
         Objects.requireNonNull(obj);
         return (K)obj;
      } else {
         throw new ClassCastException("Cannot access file descriptor as " + desiredType);
      }
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   @Override
   public FileDescriptor getFileDescriptor() {
      return this.fdObj;
   }

   private static void triggerInit() {
      for (AFAddressFamily family : new AFAddressFamily[]{
         AFUNIXSocketAddress.addressFamily(), AFTIPCSocketAddress.addressFamily(), AFVSOCKSocketAddress.addressFamily(), AFSYSTEMSocketAddress.addressFamily()
      }) {
         Objects.requireNonNull(family.getClass());
      }
   }

   public Set<Class<?>> availableTypes() {
      return this.cpm.classes;
   }

   // $VF: Compiled from FileDescriptorCast.java
   @FunctionalInterface
   private interface CastingProvider<T> {
      T provideAs(FileDescriptorCast var1, Class<? super T> var2) throws IOException;
   }

   // $VF: Compiled from FileDescriptorCast.java
   private abstract static class CastingProviderMap {
      private final Map<Class<?>, FileDescriptorCast.CastingProvider<?>> providers = new HashMap<>();
      private final Set<Class<?>> classes = Collections.unmodifiableSet(this.providers.keySet());

      protected final <T> void addProvider(Class<T> cp, FileDescriptorCast.CastingProvider<?> type) {
         Objects.requireNonNull(type);
         this.addProvider0(type, cp);
      }

      protected void registerGenericDatagramSocketProviders() {
         FileDescriptorCast.CastingProviderSocketOrChannel<AFDatagramSocket<AFGenericSocketAddress>> cpDatagramSocketOrChannelGeneric = (fdc, desiredType, isChannel) -> FileDescriptorCast.reconfigure(
            isChannel, AFDatagramSocket.newInstance(AFGenericDatagramSocket::new, fdc.getFileDescriptor(), fdc.localPort, fdc.remotePort)
         );
         this.addProvider(AFDatagramSocket.class, (fdc, desiredType) -> cpDatagramSocketOrChannelGeneric.provideAs(fdc, desiredType, false));
         this.addProvider(
            AFDatagramChannel.class, (fdc, desiredType) -> cpDatagramSocketOrChannelGeneric.provideAs(fdc, AFDatagramSocket.class, true).getChannel()
         );
      }

      protected abstract void addProviders();

      private void addProvider0(Class<?> cp, FileDescriptorCast.CastingProvider<?> type) {
         if (this.providers.put(type, cp) != cp) {
            for (Class<?> cl : type.getInterfaces()) {
               this.addProvider0(cl, cp);
            }

            Class<?> var7 = type.getSuperclass();
            if (var7 != null) {
               this.addProvider0(var7, cp);
            }
         }
      }

      public <T> FileDescriptorCast.CastingProvider<? extends T> get(Class<T> desiredType) {
         return (FileDescriptorCast.CastingProvider<? extends T>)this.providers.get(desiredType);
      }

      protected CastingProviderMap() {
         this.addProviders();
         this.addProviders(FileDescriptorCast.GLOBAL_PROVIDERS_FINAL);
      }

      protected void registerGenericSocketProviders() {
         FileDescriptorCast.CastingProviderSocketOrChannel<AFSocket<AFGenericSocketAddress>> cpSocketOrChannelGeneric = (fdc, desiredType, isChannel) -> FileDescriptorCast.reconfigure(
            isChannel,
            AFSocket.newInstance(AFGenericSocket::new, (AFSocketFactory<AFGenericSocketAddress>)null, fdc.getFileDescriptor(), fdc.localPort, fdc.remotePort)
         );
         FileDescriptorCast.CastingProviderSocketOrChannel<AFServerSocket<AFGenericSocketAddress>> cpServerSocketOrChannelGeneric = (fdc, desiredType, isChannel) -> FileDescriptorCast.reconfigure(
            isChannel, AFServerSocket.newInstance(AFGenericServerSocket::new, fdc.getFileDescriptor(), fdc.localPort, fdc.remotePort)
         );
         this.addProvider(AFGenericSocket.class, (fdc, desiredType) -> cpSocketOrChannelGeneric.provideAs(fdc, desiredType, false));
         this.addProvider(AFGenericServerSocket.class, (fdc, desiredType) -> cpServerSocketOrChannelGeneric.provideAs(fdc, desiredType, false));
         this.addProvider(AFGenericSocketChannel.class, (fdc, desiredType) -> cpSocketOrChannelGeneric.provideAs(fdc, AFSocket.class, true).getChannel());
         this.addProvider(
            AFGenericServerSocketChannel.class, (fdc, desiredType) -> cpServerSocketOrChannelGeneric.provideAs(fdc, AFServerSocket.class, true).getChannel()
         );
      }

      protected final void addProviders(FileDescriptorCast.CastingProviderMap other) {
         if (other != null && other != this) {
            this.providers.putAll(other.providers);
         }
      }
   }

   // $VF: Compiled from FileDescriptorCast.java
   @FunctionalInterface
   private interface CastingProviderSocketOrChannel<T> {
      T provideAs(FileDescriptorCast var1, Class<? super T> var2, boolean var3) throws IOException;
   }

   // $VF: Compiled from FileDescriptorCast.java
   private static final class LenientFileInputStream extends FileInputStream {
      @Override
      public int available() throws IOException {
         try {
            return super.available();
         } catch (IOException e) {
            String msg = e.getMessage();
            if ("Invalid seek".equals(msg)) {
               return 0;
            } else {
               throw e;
            }
         }
      }

      private LenientFileInputStream(FileDescriptor fdObj) {
         super(fdObj);
      }
   }
}
