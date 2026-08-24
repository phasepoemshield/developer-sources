/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u0634\u064c
extends \u062c\u0623 {
    private static final long serialVersionUID = 6021165256752908695L;

    public \u0634\u064c(String message) {
        String[] stringArray = new String[2];
        stringArray[0] = "You did not specify all the required arguments before building program builder";
        stringArray[1] = "The argument you specified in program builder is null";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Check if you are specifying all arguments when building library builder.";
        stringArray2[1] = "Check if you are not passing any arguments that are null.";
        super("Illegal argument in program builder.", message, stringArray, stringArray2);
    }
}

