package jnr.posix;

// $VF: Compiled from WindowsChildRecord.java
public class WindowsChildRecord {
   private final int pid;
   private final HANDLE process;

   public int getPid() {
      return this.pid;
   }

   public WindowsChildRecord(HANDLE process, int pid) {
      this.process = process;
      this.pid = pid;
   }

   public HANDLE getProcess() {
      return this.process;
   }
}
