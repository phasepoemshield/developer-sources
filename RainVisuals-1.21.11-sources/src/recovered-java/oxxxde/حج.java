/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062d\u062c
extends \u062c\u0623 {
    private static final long serialVersionUID = 577228207931063158L;

    public \u062d\u062c(String message) {
        String[] stringArray = new String[2];
        stringArray[0] = "You did not specify all the required arguments before building library builder";
        stringArray[1] = "The argument you specified in library builder is null";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Check if you are specifying all arguments when building library builder.";
        stringArray2[1] = "Check if you are not passing any arguments that are null.";
        super("Illegal argument in library builder.", message, stringArray, stringArray2);
    }
}

