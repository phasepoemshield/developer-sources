package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from RLimit.java
public abstract class RLimit extends Struct {
   public abstract long rlimCur();

   public abstract long rlimMax();

   protected RLimit(Runtime runtime) {
      super(runtime);
   }

   public abstract void init(long var1, long var3);
}
