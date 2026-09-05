/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.apache.commons.lang3.StringUtils
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import net.irisshaders.iris.shaderpack.option.OptionAnnotatedSource;
import net.irisshaders.iris.shaderpack.option.OptionType;
import org.apache.commons.lang3.StringUtils;

public class OptionTests {
    public static void main(String[] stringArray) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("run/shaderpacks/Sildurs Vibrant Shaders v1.29 Medium/shaders/shaders.settings", new String[0]));
        OptionAnnotatedSource optionAnnotatedSource = new OptionAnnotatedSource((ImmutableList<String>)ImmutableList.copyOf(list));
        System.out.println("Boolean Options:");
        if (optionAnnotatedSource.getBooleanOptions().isEmpty()) {
            System.out.println("(none)");
        } else {
            System.out.println("[Line] Type   | Name                             | Value | Comment");
            System.out.println("       ------ | -------------------------------- | ----- | -------");
        }
        optionAnnotatedSource.getBooleanOptions().forEach((n, booleanOption) -> {
            String string = booleanOption.getType() == OptionType.CONST ? " Const" : "Define";
            System.out.println("[" + StringUtils.leftPad((String)Integer.toString(n + 1), (int)4, (char)' ') + "] " + string + " | " + StringUtils.rightPad((String)booleanOption.getName(), (int)32, (char)' ') + " | " + StringUtils.leftPad((String)Boolean.toString(booleanOption.getDefaultValue()), (int)5, (char)' ') + " | " + booleanOption.getComment().orElse(""));
        });
        System.out.println("String Options:");
        if (optionAnnotatedSource.getStringOptions().isEmpty()) {
            System.out.println("(none)");
        } else {
            System.out.println("[Line] | Type   | Name                             | Value    | Allowed Values");
            System.out.println("       | ------ | -------------------------------- | -------- | -------");
        }
        optionAnnotatedSource.getStringOptions().forEach((n, stringOption) -> {
            String string = stringOption.getType() == OptionType.CONST ? " Const" : "Define";
            System.out.println("[" + StringUtils.leftPad((String)Integer.toString(n + 1), (int)4, (char)' ') + "] | " + string + " | " + StringUtils.rightPad((String)stringOption.getName(), (int)32, (char)' ') + " | " + StringUtils.leftPad((String)stringOption.getDefaultValue(), (int)8, (char)' ') + " | " + String.valueOf(stringOption.getAllowedValues()));
            System.out.println("       " + stringOption.getComment().orElse("(no comment)"));
        });
        System.out.println("Diagnostics:");
        optionAnnotatedSource.getDiagnostics().forEach((n, string) -> System.out.println("[" + StringUtils.leftPad((String)Integer.toString(n + 1), (int)4, (char)' ') + "] " + string));
        if (optionAnnotatedSource.getDiagnostics().isEmpty()) {
            System.out.println("(none)");
        }
    }
}

