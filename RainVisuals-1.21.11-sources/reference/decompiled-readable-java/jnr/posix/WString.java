/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.posix.util.WindowsHelpers;

public final class WString {
    private final byte[] bytes;
    static final Runtime runtime = Runtime.getSystemRuntime();
    public static final ToNativeConverter<WString, Pointer> Converter = new ToNativeConverter<WString, Pointer>(){

        @Override
        public Class<Pointer> nativeType() {
            return Pointer.class;
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public Pointer toNative(WString value, ToNativeContext context) {
            void var3_3;
            if (value == null) {
                return null;
            }
            Pointer memory = Memory.allocateDirect(runtime, value.bytes.length + 1, true);
            memory.put(0L, value.bytes, 0, value.bytes.length);
            return var3_3;
        }
    };

    public static byte[] path(String path, boolean longPathExtensionNeeded) {
        if (longPathExtensionNeeded && path.length() > 240) {
            if (path.startsWith("//")) {
                path = "//?/UNC/" + path.substring(2);
            } else if (path.startsWith("\\\\")) {
                path = "\\\\?\\UNC\\" + path.substring(2);
            } else if (WindowsHelpers.isDriveLetterPath(path)) {
                path = path.contains("/") ? "//?/" + path : "\\\\?\\" + path;
            }
        }
        return WindowsHelpers.toWPath(path);
    }

    WString(String string) {
        this.bytes = WindowsHelpers.toWString(string);
    }

    public static WString path(String path) {
        return new WString(WString.path(path, false));
    }

    private WString(byte[] bytes) {
        this.bytes = bytes;
    }
}

