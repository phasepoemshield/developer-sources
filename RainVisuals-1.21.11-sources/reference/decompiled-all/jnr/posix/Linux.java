package jnr.posix;

import jnr.constants.platform.PosixFadvise;

// $VF: Compiled from Linux.java
public interface Linux extends POSIX {
   int ioprio_set(int var1, int var2, int var3);

   int posix_fadvise(int var1, long var2, long var4, PosixFadvise var6);

   int ioprio_get(int var1, int var2);
}
