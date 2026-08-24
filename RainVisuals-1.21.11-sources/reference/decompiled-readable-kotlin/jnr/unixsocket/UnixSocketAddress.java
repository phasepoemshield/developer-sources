package jnr.unixsocket;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.SocketAddress;
import jnr.constants.platform.ProtocolFamily;

// $VF: Compiled from UnixSocketAddress.java
public class UnixSocketAddress extends SocketAddress {
   private static final long serialVersionUID = 4821337010221569096L;
   private transient SockAddrUnix address = SockAddrUnix.create();

   int length() {
      return this.address.length();
   }

   SockAddrUnix getStruct() {
      return this.address;
   }

   @Override
   public boolean equals(Object _other) {
      if (!(_other instanceof UnixSocketAddress)) {
         return false;
      }

      UnixSocketAddress other = (UnixSocketAddress)_other;
      return this.address.getFamily() == other.address.getFamily() && this.path().equals(other.path());
   }

   public String humanReadablePath() {
      String ret = this.path();
      return ret.indexOf(0) == 0 ? ret.replace('\u0000', '@') : ret;
   }

   public UnixSocketAddress(File path) {
      this.address.setFamily(ProtocolFamily.PF_UNIX);
      this.address.setPath(path.getPath());
   }

   private void writeObject(ObjectOutputStream o) throws IOException {
      o.defaultWriteObject();
      o.writeObject(this.path());
   }

   UnixSocketAddress() {
      this.address.setFamily(ProtocolFamily.PF_UNIX);
   }

   @Override
   public String toString() {
      return "[family=" + this.address.getFamily() + " path=" + this.humanReadablePath() + "]";
   }

   public UnixSocketAddress(String path) {
      this.address.setFamily(ProtocolFamily.PF_UNIX);
      this.address.setPath(path);
   }

   @Override
   public int hashCode() {
      return this.address.hashCode();
   }

   private void readObject(ObjectInputStream o) throws IOException, ClassNotFoundException {
      o.defaultReadObject();
      String path = (String)o.readObject();
      if (null == this.address) {
         this.address = SockAddrUnix.create();
      }

      this.address.setPath(path);
      this.address.setFamily(ProtocolFamily.PF_UNIX);
   }

   public String path() {
      return this.address.getPath();
   }
}
