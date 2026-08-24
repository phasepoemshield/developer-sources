package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from SystemTime.java
public class SystemTime extends Struct {
   Struct.Unsigned16 wSecond;
   Struct.Unsigned16 wHour;
   Struct.Unsigned16 wDay;
   Struct.Unsigned16 wMonth;
   Struct.Unsigned16 wMilliseconds;
   Struct.Unsigned16 wYear = new Struct.Unsigned16();
   Struct.Unsigned16 wDayOfWeek;
   Struct.Unsigned16 wMinute;

   public SystemTime(Runtime runtime) {
      super(runtime);
      this.wMonth = new Struct.Unsigned16();
      this.wDayOfWeek = new Struct.Unsigned16();
      this.wDay = new Struct.Unsigned16();
      this.wHour = new Struct.Unsigned16();
      this.wMinute = new Struct.Unsigned16();
      this.wSecond = new Struct.Unsigned16();
      this.wMilliseconds = new Struct.Unsigned16();
   }

   @Override
   public java.lang.String toString() {
      return "" + this.wYear + "/" + this.wMonth + "/" + this.wDay + " " + this.wHour + ":" + this.wMinute + ":" + this.wSecond;
   }
}
