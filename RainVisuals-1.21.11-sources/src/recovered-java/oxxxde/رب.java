/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;
import oxxxde.\u062d\u0622;

public class \u0631\u0628
extends \u062c\u0623 {
    private static final long serialVersionUID = -4075887372988299959L;

    public \u0631\u0628(String newShader, \u062d\u0622 type, String oldShader) {
        Object[] objectArray = new Object[3];
        objectArray[0] = newShader;
        objectArray[1] = type.name();
        objectArray[2] = oldShader;
        String[] stringArray = new String[2];
        stringArray[0] = "Your program builder has an invalid structure.";
        stringArray[1] = "You have added a program snippet to the program builder that already adds a shader of the required type.";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Check that your program builder structure is correct.";
        stringArray2[1] = "Check the program snippets you add to the program builder.";
        super("Double shader addition in program builder.", String.format("An attempt was made to add shader '%s' with type '%s', while shader '%s' with the same type had already been added.", objectArray), stringArray, stringArray2);
    }
}

