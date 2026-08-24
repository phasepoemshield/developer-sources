/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062b\u0642
extends \u062c\u0623 {
    private static final long serialVersionUID = 8335265683030650497L;

    public \u062b\u0642(String missingElements) {
        String[] stringArray = new String[1];
        stringArray[0] = "When building vertex in VertexBuilder, you missed one or more elements.";
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Check your vertex building method and fix it.";
        super("Bad vertex structure.", "Missing elements in vertex: " + missingElements, stringArray, stringArray2);
    }
}

