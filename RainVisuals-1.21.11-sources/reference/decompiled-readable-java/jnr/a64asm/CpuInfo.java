/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public class CpuInfo {
    public static final CpuInfo GENERIC = new CpuInfo(Vendor.GENERIC, 0);
    final Vendor vendor;
    final int family;

    public CpuInfo(Vendor vendor, int family) {
        this.vendor = vendor;
        this.family = family;
    }

    public static final class Vendor
    extends Enum<Vendor> {
        private static final /* synthetic */ Vendor[] $VALUES;
        public static final /* enum */ Vendor GENERIC;
        public static final /* enum */ Vendor ARM;
        public static final /* enum */ Vendor AMD;
        public static final /* enum */ Vendor INTEL;

        static {
            INTEL = new Vendor();
            AMD = new Vendor();
            ARM = new Vendor();
            GENERIC = new Vendor();
            Vendor[] vendorArray = new Vendor[4];
            vendorArray[0] = INTEL;
            vendorArray[1] = AMD;
            vendorArray[2] = ARM;
            vendorArray[3] = GENERIC;
            $VALUES = vendorArray;
        }

        public static Vendor[] values() {
            return (Vendor[])$VALUES.clone();
        }

        public static Vendor valueOf(String name) {
            return Enum.valueOf(Vendor.class, name);
        }
    }
}

