package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from Timeval.java
public abstract class Timeval extends Struct {
   public abstract void sec(long var1);

   public abstract long sec();

   public abstract void usec(long var1);

   public abstract void setTime(long[] var1);

   public abstract long usec();

   public Timeval(Runtime runtime) {
      super(runtime);
   }
}
