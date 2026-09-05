/*
 * Decompiled with CFR 0.152.
 */
package org.ietf.jgss;

public class MessageProp {
    private boolean privacyState;
    private int qop;
    private boolean dupToken;
    private boolean oldToken;
    private boolean unseqToken;
    private boolean gapToken;
    private int minorStatus;
    private String minorString;

    public MessageProp(boolean bl) {
        this(0, bl);
    }

    public MessageProp(int n, boolean bl) {
        this.qop = n;
        this.privacyState = bl;
        this.resetStatusValues();
    }

    public int getQOP() {
        return this.qop;
    }

    public boolean getPrivacy() {
        return this.privacyState;
    }

    public void setQOP(int n) {
        this.qop = n;
    }

    public void setPrivacy(boolean bl) {
        this.privacyState = bl;
    }

    public boolean isDuplicateToken() {
        return this.dupToken;
    }

    public boolean isOldToken() {
        return this.oldToken;
    }

    public boolean isUnseqToken() {
        return this.unseqToken;
    }

    public boolean isGapToken() {
        return this.gapToken;
    }

    public int getMinorStatus() {
        return this.minorStatus;
    }

    public String getMinorString() {
        return this.minorString;
    }

    public void setSupplementaryStates(boolean bl, boolean bl2, boolean bl3, boolean bl4, int n, String string) {
        this.dupToken = bl;
        this.oldToken = bl2;
        this.unseqToken = bl3;
        this.gapToken = bl4;
        this.minorStatus = n;
        this.minorString = string;
    }

    private void resetStatusValues() {
        this.dupToken = false;
        this.oldToken = false;
        this.unseqToken = false;
        this.gapToken = false;
        this.minorStatus = 0;
        this.minorString = null;
    }
}

