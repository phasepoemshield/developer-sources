/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u0632\u0642
extends \u062c\u0623 {
    private static final long serialVersionUID = -3115145506278122458L;

    public \u0632\u0642(String shaderName, String reason) {
        Object[] objectArray = new Object[2];
        objectArray[0] = shaderName;
        objectArray[1] = reason;
        String[] stringArray = new String[2];
        stringArray[0] = "Error in shader structure";
        stringArray[1] = "Out of GPU Memory (Very Rare)";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Check the shader structure for errors and fix them";
        stringArray2[1] = "Make sure you are not overloading the GPU memory (e.g. by loading something into the GPU in a infinity loop)";
        super("Compile shader error", String.format("Error compiling shader '%s', reason:\n%s", objectArray), stringArray, stringArray2);
    }
}

