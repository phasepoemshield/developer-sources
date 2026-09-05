/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01199
 *  minecraft.class06962
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class01199;
import minecraft.class05813;
import minecraft.class06962;
import org.slf4j.Logger;

public class class05819
extends DataFix {
    private static final int y = 128;
    private static final int L = 64;
    private static final int u = 32;
    private static final int i = 16;
    private static final int R = 8;
    private static final int M = 4;
    private static final int B = 2;
    private static final int Z = 1;
    static final Logger N = LogUtils.getLogger();
    private static final int z = 4096;

    public class05819(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        Optional optional = dynamic.get("Level").result();
        if (optional.isPresent() && ((Dynamic)optional.get()).get("Sections").asStreamOpt().result().isPresent()) {
            return dynamic.set("Level", new class05813((Dynamic)optional.get()).N());
        }
        return dynamic;
    }

    public static int N(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n = 0;
        if (bl3) {
            n = bl2 ? (n |= 2) : (bl ? (n |= 0x80) : (n |= 1));
        } else if (bl4) {
            n = bl ? (n |= 0x20) : (bl2 ? (n |= 8) : (n |= 0x10));
        } else if (bl2) {
            n |= 4;
        } else if (bl) {
            n |= 0x40;
        }
        return n;
    }

    public static String N(Dynamic<?> dynamic, String string) {
        return dynamic.get("Properties").get(string).asString("");
    }

    public static String N(Dynamic<?> dynamic) {
        return dynamic.get("Name").asString("");
    }

    public static int N(class01199<Dynamic<?>> class011992, Dynamic<?> dynamic) {
        int n = class011992.N(dynamic);
        if (n == -1) {
            n = class011992.u(dynamic);
        }
        return n;
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.u);
        Type type2 = this.getOutputSchema().getType(class06962.u);
        return this.writeFixAndRead("ChunkPalettedStorageFix", type, type2, this::y);
    }
}

