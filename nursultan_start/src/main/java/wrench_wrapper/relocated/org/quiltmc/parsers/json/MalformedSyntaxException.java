/*
 * Decompiled with CFR 0.152.
 */
package wrench_wrapper.relocated.org.quiltmc.parsers.json;

import wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonReader;

public final class MalformedSyntaxException
extends RuntimeException {
    public MalformedSyntaxException(JsonReader object, String string) {
        StringBuilder stringBuilder;
        MalformedSyntaxException malformedSyntaxException = string2;
        String string2 = ((JsonReader)object).path();
        Object object2 = object = stringBuilder;
        ((StringBuilder)object)();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(" ");
        stringBuilder.append(string2);
        super(stringBuilder.toString());
    }
}

