/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants;

import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public final class PlatformConstants {
    public static final int LITTLE_ENDIAN = 1234;
    public static final boolean FAKE;
    public static final String NAME;
    public static final Map<String, String> OS_NAMES;
    public static final int BIG_ENDIAN = 4321;
    public static final int BYTE_ORDER;
    public static final String ARCH;
    public static final Map<String, String> ARCH_NAMES;
    private static final PlatformConstants INSTANCE;
    public static final String OS;

    public String getArchPackageName() {
        Object[] objectArray = new Object[3];
        objectArray[0] = PlatformConstants.getConstantsPackageName();
        objectArray[1] = OS;
        objectArray[2] = ARCH;
        return String.format("%s.platform.%s.%s", objectArray);
    }

    public String[] getPackagePrefixes() {
        if (FAKE) {
            String[] stringArray = new String[3];
            stringArray[0] = this.getArchPackageName();
            stringArray[1] = this.getOSPackageName();
            stringArray[2] = this.getFakePackageName();
            return stringArray;
        }
        String[] stringArray = new String[2];
        stringArray[0] = this.getArchPackageName();
        stringArray[1] = this.getOSPackageName();
        return stringArray;
    }

    public String getFakePackageName() {
        Object[] objectArray = new Object[1];
        objectArray[0] = PlatformConstants.getConstantsPackageName();
        return String.format("%s.platform.fake", objectArray);
    }

    private PlatformConstants() {
    }

    static {
        INSTANCE = new PlatformConstants();
        FAKE = Boolean.valueOf(System.getProperty("jnr.constants.fake", "true"));
        OS_NAMES = new HashMap<String, String>(){
            public static final long serialVersionUID = 1L;
            {
                this.put("Mac OS X", "darwin");
                this.put("SunOS", "solaris");
            }
        };
        ARCH_NAMES = new HashMap<String, String>(){
            public static final long serialVersionUID = 1L;
            {
                this.put("x86", "i386");
            }
        };
        ARCH = PlatformConstants.initArchitecture();
        OS = PlatformConstants.initOperatingSystem();
        Object[] objectArray = new Object[2];
        objectArray[0] = ARCH;
        objectArray[1] = OS;
        NAME = String.format("%s-%s", objectArray);
        BYTE_ORDER = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN) ? 4321 : 1234;
    }

    private static String getProperty(String property, String defValue) {
        try {
            return System.getProperty(property, defValue);
        }
        catch (SecurityException se) {
            return defValue;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String initOperatingSystem() {
        void var0;
        String osname = PlatformConstants.getProperty("os.name", "unknown").toLowerCase();
        for (String s : OS_NAMES.keySet()) {
            if (!s.equalsIgnoreCase(osname)) continue;
            return OS_NAMES.get(s);
        }
        if (osname.startsWith("windows")) {
            return "windows";
        }
        return var0;
    }

    public String getOSPackageName() {
        Object[] objectArray = new Object[2];
        objectArray[0] = PlatformConstants.getConstantsPackageName();
        objectArray[1] = OS;
        return String.format("%s.platform.%s", objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private static final String initArchitecture() {
        void var0;
        String arch = PlatformConstants.getProperty("os.arch", "unknown").toLowerCase();
        for (String s : ARCH_NAMES.keySet()) {
            if (!s.equalsIgnoreCase(arch)) continue;
            return ARCH_NAMES.get(s);
        }
        return var0;
    }

    public static PlatformConstants getPlatform() {
        return INSTANCE;
    }

    private static String getConstantsPackageName() {
        return PackageNameResolver.PACKAGE_NAME;
    }

    private static final class PackageNameResolver {
        public static final String PACKAGE_NAME = new PackageNameResolver().inferPackageName();

        private PackageNameResolver() {
        }

        private String inferPackageName() {
            try {
                Class<?> cls = this.getClass();
                Package pkg = cls.getPackage();
                return pkg != null ? pkg.getName() : cls.getName().substring(0, cls.getName().lastIndexOf(46));
            }
            catch (NullPointerException nullPointerException) {
                return "jnr.constants";
            }
        }
    }
}

