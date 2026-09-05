/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.env;

import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.env.EnvScalarConstructor$ConstructEnv;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.MissingEnvironmentVariableException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class EnvScalarConstructor
extends Constructor {
    public static final Tag ENV_TAG = new Tag("!ENV");
    public static final Pattern ENV_FORMAT = Pattern.compile("^\\$\\{\\s*((?<name>\\w+)((?<separator>:?(-|\\?))(?<value>\\w+)?)?)\\s*\\}$");

    static /* synthetic */ String access$100(EnvScalarConstructor envScalarConstructor, ScalarNode scalarNode) {
        return envScalarConstructor.constructScalar(scalarNode);
    }

    public EnvScalarConstructor() {
        this.yamlConstructors.put(ENV_TAG, new EnvScalarConstructor$ConstructEnv(this, null));
    }

    public String apply(String string, String string2, String string3, String string4) {
        if (string4 != null && !string4.isEmpty()) {
            return string4;
        }
        if (string2 != null) {
            if (string2.equals("?") && string4 == null) {
                throw new MissingEnvironmentVariableException("Missing mandatory variable " + string + ": " + string3);
            }
            if (string2.equals(":?")) {
                if (string4 == null) {
                    throw new MissingEnvironmentVariableException("Missing mandatory variable " + string + ": " + string3);
                }
                if (string4.isEmpty()) {
                    throw new MissingEnvironmentVariableException("Empty mandatory variable " + string + ": " + string3);
                }
            }
            if (string2.startsWith(":") ? string4 == null || string4.isEmpty() : string4 == null) {
                return string3;
            }
        }
        return "";
    }

    public String getEnv(String string) {
        return System.getenv(string);
    }
}

