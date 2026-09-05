/*
 * Decompiled with CFR 0.152.
 */
package org.ietf.jgss;

import java.util.Objects;

public class GSSException
extends Exception {
    private static final long serialVersionUID = -2706218945227726672L;
    public static final int BAD_BINDINGS = 1;
    public static final int BAD_MECH = 2;
    public static final int BAD_NAME = 3;
    public static final int BAD_NAMETYPE = 4;
    public static final int BAD_STATUS = 5;
    public static final int BAD_MIC = 6;
    public static final int CONTEXT_EXPIRED = 7;
    public static final int CREDENTIALS_EXPIRED = 8;
    public static final int DEFECTIVE_CREDENTIAL = 9;
    public static final int DEFECTIVE_TOKEN = 10;
    public static final int FAILURE = 11;
    public static final int NO_CONTEXT = 12;
    public static final int NO_CRED = 13;
    public static final int BAD_QOP = 14;
    public static final int UNAUTHORIZED = 15;
    public static final int UNAVAILABLE = 16;
    public static final int DUPLICATE_ELEMENT = 17;
    public static final int NAME_NOT_MN = 18;
    public static final int DUPLICATE_TOKEN = 19;
    public static final int OLD_TOKEN = 20;
    public static final int UNSEQ_TOKEN = 21;
    public static final int GAP_TOKEN = 22;
    private static final String[] messages = new String[]{"Channel binding mismatch", "Unsupported mechanism requested", "Invalid name provided", "Name of unsupported type provided", "Invalid input status selector", "Token had invalid integrity check", "Specified security context expired", "Expired credentials detected", "Defective credential detected", "Defective token detected", "Failure unspecified at GSS-API level", "Security context init/accept not yet called or context deleted", "No valid credentials provided", "Unsupported QOP value", "Operation unauthorized", "Operation unavailable", "Duplicate credential element requested", "Name contains multi-mechanism elements", "The token was a duplicate of an earlier token", "The token's validity period has expired", "A later token has already been processed", "An expected per-message token was not received"};
    private final int major;
    private int minor = 0;
    private String minorMessage = null;
    private String majorString = null;

    public GSSException(int n) {
        this.major = this.validateMajor(n) ? n : 11;
    }

    GSSException(int n, String string) {
        this.major = this.validateMajor(n) ? n : 11;
        this.majorString = string;
    }

    public GSSException(int n, int n2, String string) {
        this.major = this.validateMajor(n) ? n : 11;
        this.minor = n2;
        this.minorMessage = string;
    }

    public int getMajor() {
        return this.major;
    }

    public int getMinor() {
        return this.minor;
    }

    public String getMajorString() {
        return Objects.requireNonNullElseGet(this.majorString, () -> messages[this.major - 1]);
    }

    public String getMinorString() {
        return this.minorMessage;
    }

    public void setMinor(int n, String string) {
        this.minor = n;
        this.minorMessage = string;
    }

    @Override
    public String toString() {
        return "GSSException: " + this.getMessage();
    }

    @Override
    public String getMessage() {
        if (this.minor == 0) {
            return this.getMajorString();
        }
        return this.getMajorString() + " (Mechanism level: " + this.getMinorString() + ")";
    }

    private boolean validateMajor(int n) {
        return n > 0 && n <= messages.length;
    }
}

