/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062b\u064e
extends \u062c\u0623 {
    private static final long serialVersionUID = 1079198928491527937L;

    public \u062b\u064e(String uniformName, String programName) {
        Object[] objectArray = new Object[2];
        objectArray[0] = uniformName;
        objectArray[1] = programName;
        String[] stringArray = new String[2];
        stringArray[0] = "The uniform added to the program schema is not present in program itself";
        stringArray[1] = "You are trying to find a uniform that is not in the program schema";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Make sure the uniform is in both schema and program";
        stringArray2[1] = "Make sure you are search the right uniform and have not made a mistake in its name";
        super("No such uniform error.", String.format("Cannot find uniform '%s' in program '%s'.", objectArray), stringArray, stringArray2);
    }
}

