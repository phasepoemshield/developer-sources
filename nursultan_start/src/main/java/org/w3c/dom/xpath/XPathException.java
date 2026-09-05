/*
 * Decompiled with CFR 0.152.
 */
package org.w3c.dom.xpath;

public class XPathException
extends RuntimeException {
    private static final long serialVersionUID = 3471034171575979943L;
    public short code;
    public static final short INVALID_EXPRESSION_ERR = 1;
    public static final short TYPE_ERR = 2;

    public XPathException(short s, String string) {
        super(string);
        this.code = s;
    }
}

