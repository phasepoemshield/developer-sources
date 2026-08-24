package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from UTimBuf64.java
public final class UTimBuf64 extends Struct {
   public final Struct.Signed64 modtime;
   public final Struct.Signed64 actime = new Struct.Signed64();

   public UTimBuf64(Runtime actime, long runtime, long modtime) {
      super(runtime);
      this.modtime = new Struct.Signed64();
      this.actime.set(actime);
      this.modtime.set(modtime);
   }
}
