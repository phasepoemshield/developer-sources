package jnr.a64asm;

// $VF: Compiled from CpuInfo.java
public class CpuInfo {
   public static final CpuInfo GENERIC = new CpuInfo(CpuInfo.Vendor.GENERIC, 0);
   final CpuInfo.Vendor vendor;
   final int family;

   public CpuInfo(CpuInfo.Vendor family, int vendor) {
      this.vendor = vendor;
      this.family = family;
   }

   // $VF: Compiled from CpuInfo.java
   public enum Vendor {
      GENERIC,
      ARM,
      AMD,
      INTEL;
   }
}
