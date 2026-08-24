/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u0628\u062a
extends \u062c\u0623 {
    private static final long serialVersionUID = -4075887372988299959L;

    public \u0628\u062a(String uniformName) {
        Object[] objectArray = new Object[1];
        objectArray[0] = uniformName;
        String[] stringArray = new String[3];
        stringArray[0] = "Your program builder has an invalid structure.";
        stringArray[1] = "You have added a program snippet to the program builder that already adds a uniform of the required name.";
        stringArray[2] = "When the shader library was included in shader, a uniform with this name was already added.";
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Check that your program builder structure is correct.";
        stringArray2[1] = "Check the program snippets you add to the program builder.";
        stringArray2[2] = "Check which shader libraries are being included into shaders and fix problem with uniforms.";
        super("Double uniform addition in program builder.", String.format("An attempt was made to add a uniform named '%s' that already exists.", objectArray), stringArray, stringArray2);
    }
}

