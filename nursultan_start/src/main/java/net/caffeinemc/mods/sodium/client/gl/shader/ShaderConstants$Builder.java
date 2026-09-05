/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants;

public class ShaderConstants$Builder {
    private static final String EMPTY_VALUE = "";
    private final HashMap<String, String> constants = new HashMap();

    ShaderConstants$Builder() {
    }

    public void add(String string, String string2) {
        String string3 = this.constants.get(string);
        if (string3 != null) {
            throw new IllegalArgumentException("Constant " + string + " is already defined with value " + string3);
        }
        this.constants.put(string, string2);
    }

    public void add(String string) {
        this.add(string, EMPTY_VALUE);
    }

    public void addAll(List<String> list) {
        for (String string : list) {
            this.add(string);
        }
    }

    public ShaderConstants build() {
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>(this.constants.size());
        for (Map.Entry<String, String> entry : this.constants.entrySet()) {
            String string = entry.getKey();
            String string2 = entry.getValue();
            if (string2.isEmpty()) {
                arrayList.add((CallSite)((Object)("#define " + string)));
                continue;
            }
            arrayList.add((CallSite)((Object)("#define " + string + " " + string2)));
        }
        return new ShaderConstants(Collections.unmodifiableList(arrayList));
    }
}

