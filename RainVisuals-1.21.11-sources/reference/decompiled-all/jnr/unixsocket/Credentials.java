package jnr.unixsocket;

import jnr.constants.platform.SocketLevel;
import jnr.constants.platform.SocketOption;

// $VF: Compiled from Credentials.java
public final class Credentials {
   private final Ucred ucred;

   static Credentials getCredentials(int fd) {
      Ucred c = new Ucred();
      int error = Native.getsockopt(fd, SocketLevel.SOL_SOCKET, SocketOption.SO_PEERCRED, c);
      if (error != 0) {
         throw new UnsupportedOperationException(Native.getLastErrorString());
      } else {
         return new Credentials(c);
      }
   }

   Credentials(Ucred ucred) {
      this.ucred = ucred;
   }

   public int getPid() {
      return this.ucred.getPidField().intValue();
   }

   public int getGid() {
      return this.ucred.getGidField().intValue();
   }

   @Override
   public String toString() {
      return String.format("[uid=%d gid=%d pid=%d]", this.getUid(), this.getGid(), this.getPid());
   }

   public int getUid() {
      return this.ucred.getUidField().intValue();
   }
}
