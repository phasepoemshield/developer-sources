/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u0638\u0643
extends \u062c\u0623 {
    private static final long serialVersionUID = 4302183795332301227L;

    public \u0638\u0643(String message) {
        String[] stringArray = new String[2];
        stringArray[0] = "You did not specify all the required arguments before building program pass builder";
        stringArray[1] = "The argument you specified in program pass builder is null";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Check if you are specifying all arguments when building program pass builder.";
        stringArray2[1] = "Check if you are not passing any arguments that are null.";
        super("Illegal argument in program pass builder.", message, stringArray, stringArray2);
    }
}

