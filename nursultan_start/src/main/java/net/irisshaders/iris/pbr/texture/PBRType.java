/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FilenameUtils
 */
package net.irisshaders.iris.pbr.texture;

import org.apache.commons.io.FilenameUtils;

public enum PBRType {
    NORMAL("_n", 0x7F7FFFFF),
    SPECULAR("_s", 0);

    private static final PBRType[] VALUES;
    private final String suffix;
    private final int defaultValue;

    public String getSuffix() {
        return this.suffix;
    }

    public String appendSuffix(String string) {
        int n = FilenameUtils.indexOfExtension((String)string);
        if (n != -1) {
            return string.substring(0, n) + this.suffix + string.substring(n);
        }
        return string + this.suffix;
    }

    private PBRType(String string2, int n2) {
        this.suffix = string2;
        this.defaultValue = n2;
    }

    public int getDefaultValue() {
        return this.defaultValue;
    }

    public static String removeSuffix(String string) {
        int n = FilenameUtils.indexOfExtension((String)string);
        String string2 = string.substring(0, n);
        PBRType pBRType = PBRType.fromFileLocation(string2);
        if (pBRType != null) {
            String string3 = pBRType.getSuffix();
            String string4 = string2.substring(0, string2.length() - string3.length());
            return string4 + string.substring(n);
        }
        return null;
    }

    public static PBRType fromFileLocation(String string) {
        for (PBRType pBRType : VALUES) {
            if (!string.endsWith(pBRType.getSuffix())) continue;
            return pBRType;
        }
        return null;
    }

    static {
        VALUES = PBRType.values();
    }
}

