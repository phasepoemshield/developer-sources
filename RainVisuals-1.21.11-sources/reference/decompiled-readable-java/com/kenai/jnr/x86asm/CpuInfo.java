/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

@Deprecated
public class CpuInfo {
    public static final CpuInfo GENERIC = new CpuInfo(Vendor.GENERIC, 0);
    final int family;
    final Vendor vendor;

    public CpuInfo(Vendor vendor, int family) {
        this.vendor = vendor;
        this.family = family;
    }

    /*
     * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
     */
    public static final class Vendor
    extends Enum<Vendor> {
        private static final /* synthetic */ Vendor[] $VALUES;
        public static final /* enum */ Vendor AMD;
        public static final /* enum */ Vendor INTEL;
        public static final /* enum */ Vendor GENERIC;

        public static Vendor valueOf(String name) {
            return Enum.valueOf(Vendor.class, name);
        }

        static {
            INTEL = new Vendor();
            AMD = new Vendor();
            GENERIC = new Vendor();
            Vendor[] vendorArray = new Vendor[3];
            vendorArray[0] = INTEL;
            vendorArray[1] = AMD;
            vendorArray[2] = GENERIC;
            $VALUES = vendorArray;
        }

        public static Vendor[] values() {
            return (Vendor[])$VALUES.clone();
        }
    }
}

