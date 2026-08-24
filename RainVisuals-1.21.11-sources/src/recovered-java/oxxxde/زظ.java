/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u0632\u0638
extends \u062c\u0623 {
    private static final long serialVersionUID = -8371118021144864550L;

    public \u0632\u0638(String programName, String reason) {
        Object[] objectArray = new Object[2];
        objectArray[0] = programName;
        objectArray[1] = reason;
        String[] stringArray = new String[3];
        stringArray[0] = "Renderer malfunction";
        stringArray[1] = "OpenGL malfunction (Very Rare)";
        stringArray[2] = "Out of GPU Memory (Very Rare)";
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Contact Ferra13671";
        stringArray2[1] = "Check the integrity of the OpenGL library";
        stringArray2[2] = "Make sure you are not overloading the GPU memory (e.g. by loading something into the GPU in a infinity loop)";
        super("Compile program error.", String.format("Error compiling program '%s', reason:\n%s", objectArray), stringArray, stringArray2);
    }
}

