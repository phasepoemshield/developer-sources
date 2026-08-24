package jnr.unixsocket;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from Ucred.java
final class Ucred extends Struct {
   final Struct.uid_t uid;
   final Struct.gid_t gid;
   final Struct.pid_t pid = new Struct.pid_t();

   Struct.gid_t getGidField() {
      return this.gid;
   }

   public Ucred() {
      super(Runtime.getSystemRuntime());
      this.uid = new Struct.uid_t();
      this.gid = new Struct.gid_t();
   }

   Struct.uid_t getUidField() {
      return this.uid;
   }

   Struct.pid_t getPidField() {
      return this.pid;
   }
}
