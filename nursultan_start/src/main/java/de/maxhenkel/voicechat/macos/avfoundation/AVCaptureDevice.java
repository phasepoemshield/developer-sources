/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLong
 *  com.sun.jna.Pointer
 */
package de.maxhenkel.voicechat.macos.avfoundation;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import de.maxhenkel.voicechat.macos.avfoundation.AVAuthorizationStatus;
import de.maxhenkel.voicechat.macos.avfoundation.AVFoundation;
import de.maxhenkel.voicechat.macos.foundation.NSObject;
import de.maxhenkel.voicechat.macos.foundation.NSString;

public class AVCaptureDevice
extends NSObject {
    private static final Pointer nativeClass = AVFoundation.INSTANCE.objc_getClass("AVCaptureDevice");
    private static final Pointer authorizationStatusForMediaTypeSelector = AVFoundation.INSTANCE.sel_registerName("authorizationStatusForMediaType:");
    private static final Pointer requestAccessForMediaTypeSelector = AVFoundation.INSTANCE.sel_registerName("requestAccessForMediaType:completionHandler:");

    public AVCaptureDevice() {
        super(new NativeLong(-1L));
    }

    public static AVAuthorizationStatus getAuthorizationStatus(NSString nSString) {
        NativeLong nativeLong = AVFoundation.INSTANCE.objc_msgSend(nativeClass, authorizationStatusForMediaTypeSelector, nSString.getId());
        return AVAuthorizationStatus.byValue(nativeLong);
    }

    public static void requestAccessForMediaType(NSString nSString) {
        AVFoundation.INSTANCE.objc_msgSend(nativeClass, requestAccessForMediaTypeSelector, nSString.getId(), null);
    }
}

