package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from WindowsProcessInformation.java
public class WindowsProcessInformation extends Struct {
   final Struct.Unsigned32 dwThreadId;
   final Struct.Pointer hThread;
   final Struct.Unsigned32 dwProcessId;
   final Struct.Pointer hProcess = new Struct.Pointer();

   public HANDLE getProcess() {
      return new HANDLE(this.hProcess.get());
   }

   public HANDLE getThread() {
      return new HANDLE(this.hThread.get());
   }

   public WindowsProcessInformation(Runtime runtime) {
      super(runtime);
      this.hThread = new Struct.Pointer();
      this.dwProcessId = new Struct.Unsigned32();
      this.dwThreadId = new Struct.Unsigned32();
   }

   public int getPid() {
      return this.dwProcessId.intValue();
   }
}
