/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class00622
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import java.util.Iterator;
import java.util.List;
import minecraft.class00622;
import minecraft.class02569;

public class class02612
extends class02569 {
    private static final List<String> N = List.of("generic.", "horse.", "player.", "zombie.");

    public class02612(Schema schema) {
        super(schema, "AttributeIdPrefixFix", class02612::N);
    }

    private static String N(String string) {
        String string2 = class00622.N((String)string);
        Iterator<String> var2 = N.iterator();
        while (var2.hasNext()) {
            String string3 = class00622.N((String)var2.next());
            if (!string2.startsWith(string3)) continue;
            return "minecraft:" + string2.substring(string3.length());
        }
        return string;
    }
}

