/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLong
 *  com.sun.jna.Pointer
 *  com.sun.jna.platform.mac.CoreFoundation$CFStringRef
 */
package de.maxhenkel.voicechat.macos.foundation;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.platform.mac.CoreFoundation;
import de.maxhenkel.voicechat.macos.foundation.Foundation;
import de.maxhenkel.voicechat.macos.foundation.NSObject;

public class NSString
extends NSObject {
    private static final Pointer nativeClass = Foundation.INSTANCE.objc_getClass("NSString");
    private static final Pointer stringWithUTF8StringSelector = Foundation.INSTANCE.sel_registerName("stringWithUTF8String:");

    public NSString(String string) {
        super(NSString.getNativeString(string));
    }

    public NSString(NativeLong nativeLong) {
        super(nativeLong);
    }

    public String toString() {
        return this.getJVMString();
    }

    private static NativeLong getNativeString(String string) {
        return Foundation.INSTANCE.objc_msgSend(nativeClass, stringWithUTF8StringSelector, string);
    }

    public String getJVMString() {
        return this.getCFStringRef().stringValue();
    }

    public CoreFoundation.CFStringRef getCFStringRef() {
        return new CoreFoundation.CFStringRef(new Pointer(this.getId().longValue()));
    }
}

