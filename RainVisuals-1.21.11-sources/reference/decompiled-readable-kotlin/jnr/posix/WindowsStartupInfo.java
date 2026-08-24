package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from WindowsStartupInfo.java
public class WindowsStartupInfo extends Struct {
   public final Struct.Unsigned32 cb = new Struct.Unsigned32();
   public final Struct.Unsigned32 dwX;
   public final Struct.Unsigned16 cbReserved2;
   public final Struct.Unsigned32 dwY;
   public final Struct.Unsigned32 dwXCountChars;
   public final Struct.Pointer lpReserved2;
   public final Struct.Unsigned32 dwFillAttribute;
   public final Struct.Unsigned16 wShowWindow;
   public final Struct.Pointer standardInput;
   public final Struct.Pointer standardError;
   public final Struct.Pointer standardOutput;
   public final Struct.Pointer lpReserved = new Struct.Pointer();
   public final Struct.Unsigned32 dwYSize;
   public final Struct.Pointer lpTitle;
   public final Struct.Pointer lpDesktop = new Struct.Pointer();
   public final Struct.Unsigned32 dwFlags;
   public final Struct.Unsigned32 dwXSize;
   public final Struct.Unsigned32 dwYCountChars;

   public WindowsStartupInfo(Runtime runtime) {
      super(runtime);
      this.lpTitle = new Struct.Pointer();
      this.dwX = new Struct.Unsigned32();
      this.dwY = new Struct.Unsigned32();
      this.dwXSize = new Struct.Unsigned32();
      this.dwYSize = new Struct.Unsigned32();
      this.dwXCountChars = new Struct.Unsigned32();
      this.dwYCountChars = new Struct.Unsigned32();
      this.dwFillAttribute = new Struct.Unsigned32();
      this.dwFlags = new Struct.Unsigned32();
      this.wShowWindow = new Struct.Unsigned16();
      this.cbReserved2 = new Struct.Unsigned16();
      this.lpReserved2 = new Struct.Pointer();
      this.standardInput = new Struct.Pointer();
      this.standardOutput = new Struct.Pointer();
      this.standardError = new Struct.Pointer();
   }

   public void setFlags(int value) {
      this.dwFlags.set(value);
   }

   public void setStandardInput(HANDLE standardInput) {
      this.standardInput.set(standardInput.toPointer());
   }

   public void setStandardOutput(HANDLE standardOutput) {
      this.standardOutput.set(standardOutput.toPointer());
   }

   public void setStandardError(HANDLE standardError) {
      this.standardError.set(standardError.toPointer());
   }
}
