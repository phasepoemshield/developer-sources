/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.macos;

import de.maxhenkel.voicechat.macos.VersionCheck;
import de.maxhenkel.voicechat.macos.avfoundation.AVAuthorizationStatus;
import de.maxhenkel.voicechat.macos.avfoundation.AVCaptureDevice;
import de.maxhenkel.voicechat.macos.foundation.NSString;

public class PermissionCheck {
    private static final NSString AVMediaTypeAudio = new NSString("soun");

    public static AVAuthorizationStatus checkMicrophonePermissions(boolean bl) {
        if (!VersionCheck.isMacOSNativeCompatible()) {
            return AVAuthorizationStatus.AUTHORIZED;
        }
        AVAuthorizationStatus aVAuthorizationStatus = AVCaptureDevice.getAuthorizationStatus(AVMediaTypeAudio);
        if (bl && aVAuthorizationStatus == AVAuthorizationStatus.NOT_DETERMINED) {
            AVCaptureDevice.requestAccessForMediaType(AVMediaTypeAudio);
        }
        return aVAuthorizationStatus;
    }

    public static AVAuthorizationStatus getMicrophonePermissions() {
        return PermissionCheck.checkMicrophonePermissions(false);
    }

    public static void requestMicrophonePermissions() {
        PermissionCheck.checkMicrophonePermissions(true);
    }
}

