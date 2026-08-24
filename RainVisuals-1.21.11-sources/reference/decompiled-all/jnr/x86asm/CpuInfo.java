package jnr.x86asm;

// $VF: Compiled from CpuInfo.java
public class CpuInfo {
   public static final CpuInfo GENERIC = new CpuInfo(CpuInfo.Vendor.GENERIC, 0);
   final int family;
   final CpuInfo.Vendor vendor;

   public CpuInfo(CpuInfo.Vendor vendor, int family) {
      this.vendor = vendor;
      this.family = family;
   }

   // $VF: Compiled from CpuInfo.java
   public enum Vendor {
      GENERIC,
      AMD,
      INTEL;
   }
}
