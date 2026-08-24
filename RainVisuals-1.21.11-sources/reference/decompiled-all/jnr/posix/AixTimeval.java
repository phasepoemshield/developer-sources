package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from AixTimeval.java
public final class AixTimeval extends Timeval {
   public final Struct.Signed32 tv_usec;
   public final Struct.SignedLong tv_sec = new Struct.SignedLong();

   @Override
   public void usec(long usec) {
      this.tv_usec.set((int)usec);
   }

   @Override
   public long usec() {
      return this.tv_usec.get();
   }

   public AixTimeval(Runtime runtime) {
      super(runtime);
      this.tv_usec = new Struct.Signed32();
   }

   @Override
   public void sec(long sec) {
      this.tv_sec.set(sec);
   }

   @Override
   public long sec() {
      return this.tv_sec.get();
   }

   @Override
   public void setTime(long[] timeval) {
      if (!$assertionsDisabled && timeval.length != 2) {
         throw new AssertionError();
      }

      this.tv_sec.set(timeval[0]);
      this.tv_usec.set((int)timeval[1]);
   }
}
