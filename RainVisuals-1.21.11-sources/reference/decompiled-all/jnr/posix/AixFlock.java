package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from AixFlock.java
public final class AixFlock extends Flock {
   public final Struct.SignedLong l_len;
   public final Struct.Signed32 l_vfs;
   public final Struct.SignedLong l_start;
   public final Struct.Signed16 l_whence;
   public final Struct.Signed32 l_pid;
   public final Struct.Unsigned32 l_sysid;
   public final Struct.Signed16 l_type = new Struct.Signed16();

   @Override
   public short whence() {
      return this.l_whence.get();
   }

   @Override
   public void whence(short whence) {
      this.l_whence.set(whence);
   }

   @Override
   public long start() {
      return this.l_start.get();
   }

   @Override
   public void len(long len) {
      this.l_len.set(len);
   }

   public AixFlock(Runtime runtime) {
      super(runtime);
      this.l_whence = new Struct.Signed16();
      this.l_sysid = new Struct.Unsigned32();
      this.l_pid = new Struct.Signed32();
      this.l_vfs = new Struct.Signed32();
      this.l_start = new Struct.SignedLong();
      this.l_len = new Struct.SignedLong();
   }

   @Override
   public long len() {
      return this.l_len.get();
   }

   @Override
   public void type(short type) {
      this.l_type.set(type);
   }

   @Override
   public void start(long start) {
      this.l_start.set(start);
   }

   @Override
   public int pid() {
      return this.l_pid.get();
   }

   @Override
   public short type() {
      return this.l_type.get();
   }

   @Override
   public void pid(int pid) {
      this.l_pid.set(pid);
   }
}
