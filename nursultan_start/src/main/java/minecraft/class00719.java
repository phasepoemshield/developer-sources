/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 */
package minecraft;

import org.apache.commons.lang3.StringEscapeUtils;

public class class00719
extends RuntimeException {
    public class00719(String string) {
        super(StringEscapeUtils.escapeJava((String)string));
    }

    public class00719(String string, Throwable throwable) {
        super(StringEscapeUtils.escapeJava((String)string), throwable);
    }
}

