/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u0635\u062a
extends \u062c\u0623 {
    private static final long serialVersionUID = 7949722130111886738L;

    public \u0635\u062a(String libraryName) {
        Object[] objectArray = new Object[1];
        objectArray[0] = libraryName;
        String[] stringArray = new String[2];
        stringArray[0] = "Incorrect library name";
        stringArray[1] = "The library has not been added to global list";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Make sure you entered the correct library name in shader";
        stringArray2[1] = "Make sure you add required library to global list before compiling shader";
        super("No such shader library error.", String.format("Cannot find shader library '%s' in global library list.", objectArray), stringArray, stringArray2);
    }
}

