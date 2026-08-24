package jnr.unixsocket;

import java.net.SocketOption;

// $VF: Compiled from UnixSocketOptions.java
public final class UnixSocketOptions {
   public static final SocketOption<Boolean> SO_PASSCRED = new UnixSocketOptions.GenericOption<>("SO_PASSCRED", Boolean.class);
   public static final SocketOption<Integer> SO_SNDTIMEO = new UnixSocketOptions.GenericOption<>("SO_SNDTIMEO", Integer.class);
   public static final SocketOption<Integer> SO_RCVBUF = new UnixSocketOptions.GenericOption<>("SO_RCVBUF", Integer.class);
   public static final SocketOption<Integer> SO_RCVTIMEO = new UnixSocketOptions.GenericOption<>("SO_RCVTIMEO", Integer.class);
   public static final SocketOption<Boolean> SO_KEEPALIVE = new UnixSocketOptions.GenericOption<>("SO_KEEPALIVE", Boolean.class);
   public static final SocketOption<Integer> SO_SNDBUF = new UnixSocketOptions.GenericOption<>("SO_SNDBUF", Integer.class);
   public static final SocketOption<Credentials> SO_PEERCRED = new UnixSocketOptions.GenericOption<>("SO_PEERCRED", Credentials.class);

   // $VF: Compiled from UnixSocketOptions.java
   private static class GenericOption<T> implements SocketOption<T> {
      private final String name;
      private final Class<T> type;

      @Override
      public Class<T> type() {
         return this.type;
      }

      @Override
      public String toString() {
         return this.name;
      }

      @Override
      public String name() {
         return this.name;
      }

      GenericOption(String name, Class<T> type) {
         this.name = name;
         this.type = type;
      }
   }
}
