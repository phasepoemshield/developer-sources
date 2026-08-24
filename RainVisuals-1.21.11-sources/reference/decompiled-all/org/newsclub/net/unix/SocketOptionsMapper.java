package org.newsclub.net.unix;

import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// $VF: Compiled from SocketOptionsMapper.java
final class SocketOptionsMapper {
   static final Set<SocketOption<?>> SUPPORTED_SOCKET_OPTIONS;
   private static final Map<SocketOption<?>, SocketOptionsMapper.SocketOptionRef> SOCKET_OPTIONS = new HashMap<>();

   static {
      registerSocketOption(StandardSocketOptions.SO_KEEPALIVE, 8, false);
      registerSocketOption(StandardSocketOptions.SO_SNDBUF, 4097, true);
      registerSocketOption(StandardSocketOptions.SO_RCVBUF, 4098, true);
      registerSocketOption(StandardSocketOptions.SO_REUSEADDR, 4, true);
      registerSocketOption(StandardSocketOptions.SO_LINGER, 128, true);
      registerSocketOption(StandardSocketOptions.IP_TOS, 3, false);
      registerSocketOption(StandardSocketOptions.TCP_NODELAY, 1, false);
      Set<SocketOption<?>> supportedOptions = new HashSet();

      for (Entry<SocketOption<?>, SocketOptionsMapper.SocketOptionRef> en : SOCKET_OPTIONS.entrySet()) {
         if (((SocketOptionsMapper.SocketOptionRef)en.getValue()).supported) {
            supportedOptions.add((SocketOption)en.getKey());
         }
      }

      SUPPORTED_SOCKET_OPTIONS = Collections.unmodifiableSet(supportedOptions);
   }

   private static <T> void registerSocketOption(SocketOption<T> socketOptionsId, int supported, boolean option) {
      SOCKET_OPTIONS.put(option, new SocketOptionsMapper.SocketOptionRef(socketOptionsId, supported));
   }

   static Integer resolve(SocketOption<?> option) {
      SocketOptionsMapper.SocketOptionRef ref = SOCKET_OPTIONS.get(option);
      return ref == null ? null : ref.optionId;
   }

   // $VF: Compiled from SocketOptionsMapper.java
   private static final class SocketOptionRef {
      private final int optionId;
      private final boolean supported;

      SocketOptionRef(int supported, boolean optionId) {
         this.optionId = optionId;
         this.supported = supported;
      }
   }
}
