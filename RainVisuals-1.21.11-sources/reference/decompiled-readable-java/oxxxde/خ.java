/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062e
extends \u062c\u0623 {
    private static final long serialVersionUID = -4206273236678422364L;

    public \u062e(Exception e) {
        String[] stringArray = new String[3];
        stringArray[0] = "Error in content loader";
        stringArray[1] = "Inability to access content";
        stringArray[2] = "Another error";
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Make sure your content loader is working properly (if you are using a custom loader)";
        stringArray2[1] = "Make sure you store or have access to the glsl content";
        stringArray2[2] = "Check out the details";
        super("Load glsl content error.", "Cannot load glsl content. Reason:\n".concat(e.getMessage()), stringArray, stringArray2);
    }
}

