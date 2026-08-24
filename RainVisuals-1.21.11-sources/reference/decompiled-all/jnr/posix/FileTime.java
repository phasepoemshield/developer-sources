package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from FileTime.java
public class FileTime extends Struct {
   public final Struct.Unsigned32 dwHighDateTime;
   public final Struct.Unsigned32 dwLowDateTime = new Struct.Unsigned32();

   FileTime(Runtime runtime) {
      super(runtime);
      this.dwHighDateTime = new Struct.Unsigned32();
   }
}
