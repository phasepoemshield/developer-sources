/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class08181
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import minecraft.class08181;

public class class00943
extends class08181 {
    public class00943(Schema schema, boolean bl) {
        super("EntityTippedArrowFix", schema, bl);
    }

    protected String N(String string) {
        return Objects.equals(string, "TippedArrow") ? "Arrow" : string;
    }
}

