/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package eu.donyka.discord.enums;

import lombok.Generated;

public final class ErrorCode
extends Enum<ErrorCode> {
    public static final /* enum */ ErrorCode USER_LOGOUT;
    public static final /* enum */ ErrorCode UNKNOWN;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    public static final /* enum */ ErrorCode PIPE_CLOSED;
    public static final /* enum */ ErrorCode SUCCESS;
    public static final /* enum */ ErrorCode READ_CORRUPT;
    private final int id;

    private ErrorCode(int id) {
        this.id = id;
    }

    @Generated
    public int getId() {
        return this.id;
    }

    static {
        SUCCESS = new ErrorCode(0);
        PIPE_CLOSED = new ErrorCode(1);
        READ_CORRUPT = new ErrorCode(2);
        UNKNOWN = new ErrorCode(-1);
        USER_LOGOUT = new ErrorCode(1000);
        ErrorCode[] errorCodeArray = new ErrorCode[5];
        errorCodeArray[0] = SUCCESS;
        errorCodeArray[1] = PIPE_CLOSED;
        errorCodeArray[2] = READ_CORRUPT;
        errorCodeArray[3] = UNKNOWN;
        errorCodeArray[4] = USER_LOGOUT;
        $VALUES = errorCodeArray;
    }

    public static ErrorCode[] values() {
        return (ErrorCode[])$VALUES.clone();
    }

    public static ErrorCode valueOf(String name) {
        return Enum.valueOf(ErrorCode.class, name);
    }
}

