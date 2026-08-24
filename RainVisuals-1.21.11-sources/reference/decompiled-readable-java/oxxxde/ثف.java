/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062b\u0641
extends \u062c\u0623 {
    private static final long serialVersionUID = -1616138098256794198L;

    public \u062b\u0641(int givenTarget, int requiredTaget) {
        Object[] objectArray = new Object[2];
        objectArray[0] = givenTarget;
        objectArray[1] = requiredTaget;
        String[] stringArray = new String[1];
        stringArray[0] = "You are giving the method that caused the error an wrong gpu buffer";
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Recheck the method call that caused the error and fix the buffer issue";
        super("Wrong gpu buffer target.", String.format("The received gpu buffer has target '%s', but '%s' was expected..", objectArray), stringArray, stringArray2);
    }
}

