/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  org.joml.Vector2f
 *  org.joml.Vector3i
 */
package net.irisshaders.iris.shaderpack.parsing;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$ConstDirective;
import net.irisshaders.iris.shaderpack.programs.ComputeSource;
import org.joml.Vector2f;
import org.joml.Vector3i;

public class ComputeDirectiveParser {
    public static void setComputeWorkGroupsRelative(ComputeSource computeSource, ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective) {
        String string;
        if (!constDirectiveParser$ConstDirective.getValue().startsWith("vec2")) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid vec2 constructor");
        }
        if (!(string = constDirectiveParser$ConstDirective.getValue().substring("vec2".length()).trim()).startsWith("(") || !string.endsWith(")")) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid vec2 constructor");
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = string.split(",");
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = stringArray[i].trim();
        }
        if (stringArray.length != 2) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": expected 2 arguments to a vec2 constructor, got " + stringArray.length);
        }
        try {
            computeSource.setWorkGroupRelative(new Vector2f(Float.parseFloat(stringArray[0]), Float.parseFloat(stringArray[1])));
        }
        catch (NumberFormatException numberFormatException) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
        }
    }

    public static void setComputeWorkGroups(ComputeSource computeSource, ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective) {
        String string;
        if (!constDirectiveParser$ConstDirective.getValue().startsWith("ivec3")) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid ivec3 constructor");
        }
        if (!(string = constDirectiveParser$ConstDirective.getValue().substring("ivec3".length()).trim()).startsWith("(") || !string.endsWith(")")) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid ivec3 constructor");
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = string.split(",");
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = stringArray[i].trim();
        }
        if (stringArray.length != 3) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": expected 3 arguments to a ivec3 constructor, got " + stringArray.length);
        }
        try {
            computeSource.setWorkGroups(new Vector3i(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2])));
        }
        catch (NumberFormatException numberFormatException) {
            Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
        }
    }
}

