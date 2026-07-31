package org.lwjgl.glfw;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

@FunctionalInterface
public interface GLFWErrorCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        LibFFI.FFI_DEFAULT_ABI,
        LibFFI.ffi_type_void,
        LibFFI.ffi_type_sint32, LibFFI.ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default void callback(long ret, long args) {
        int error = memGetInt(memGetAddress(args));
        long description = memGetAddress(memGetAddress(args + Pointer.POINTER_SIZE));
        
        if (error == 65548) {
            String descStr = memUTF8(description);
            if (descStr != null && (descStr.contains("icons on macOS") || descStr.contains("icons"))) {
                return;
            }
        }
        
        invoke(error, description);
    }

    void invoke(int error, long description);
}
