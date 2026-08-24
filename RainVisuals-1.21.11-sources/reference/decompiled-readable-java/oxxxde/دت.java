/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062f\u062a
extends \u062c\u0623 {
    private static final long serialVersionUID = 1835464041015596438L;

    public \u062f\u062a(String elementName) {
        Object[] objectArray = new Object[1];
        objectArray[0] = elementName;
        String[] stringArray = new String[2];
        stringArray[0] = "You may have misspelled the vertex element name.";
        stringArray[1] = "When creating a VertexBuilder, you selected the wrong VertexBuilder.";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Check that you have written the names of the vertex elements correctly in both the vertex format builder and the vertex builder method.";
        stringArray2[1] = "Check that you selected the correct vertex format when creating VertexBuilder.";
        super("No such vertex element.", String.format("Cannot find vertex element '%s'.", objectArray), stringArray, stringArray2);
    }
}

