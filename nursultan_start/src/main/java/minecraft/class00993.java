/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class05794
 *  minecraft.class05803
 *  minecraft.class06962
 *  org.apache.commons.lang3.math.NumberUtils
 */
package minecraft;

import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import minecraft.class05794;
import minecraft.class05803;
import minecraft.class06962;
import org.apache.commons.lang3.math.NumberUtils;

public class class00993
extends DataFix {
    private static final String y = "generatorOptions";
    static final String N = "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
    private static final Splitter L = Splitter.on((char)';').limit(5);
    private static final Splitter u = Splitter.on((char)',');
    private static final Splitter i = Splitter.on((char)'x').limit(2);
    private static final Splitter R = Splitter.on((char)'*').limit(2);
    private static final Splitter M = Splitter.on((char)':').limit(3);

    public class00993(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private Dynamic<?> N(Dynamic<?> dynamic2) {
        if (dynamic2.get("generatorName").asString("").equalsIgnoreCase("flat")) {
            return dynamic2.update(y, dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(this::N).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)).result(), (Object)dynamic));
        }
        return dynamic2;
    }

    String N(String string2) {
        String string3;
        int n;
        if (string2.isEmpty()) {
            return N;
        }
        Iterator iterator = L.split((CharSequence)string2).iterator();
        String string4 = (String)iterator.next();
        if (iterator.hasNext()) {
            n = NumberUtils.toInt((String)string4, (int)0);
            string3 = (String)iterator.next();
        } else {
            n = 0;
            string3 = string4;
        }
        if (n < 0 || n > 3) {
            return N;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Splitter splitter = n < 3 ? i : R;
        stringBuilder.append(StreamSupport.stream(u.split((CharSequence)string3).spliterator(), false).map(string -> {
            String string2;
            int n2;
            List list = splitter.splitToList((CharSequence)string);
            if (list.size() == 2) {
                n2 = NumberUtils.toInt((String)((String)list.get(0)));
                string2 = (String)list.get(1);
            } else {
                n2 = 1;
                string2 = (String)list.get(0);
            }
            List list2 = M.splitToList((CharSequence)string2);
            int n3 = ((String)list2.get(0)).equals("minecraft") ? 1 : 0;
            String string3 = (String)list2.get(n3);
            int n4 = n == 3 ? class05794.N((String)("minecraft:" + string3)) : NumberUtils.toInt((String)string3, (int)0);
            int n5 = n3 + 1;
            int n6 = list2.size() > n5 ? NumberUtils.toInt((String)((String)list2.get(n5)), (int)0) : 0;
            return (String)(n2 == 1 ? "" : n2 + "*") + class05803.y((int)(n4 << 4 | n6)).get("Name").asString("");
        }).collect(Collectors.joining(",")));
        while (iterator.hasNext()) {
            stringBuilder.append(';').append((String)iterator.next());
        }
        return stringBuilder.toString();
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelFlatGeneratorInfoFix", this.getInputSchema().getType(class06962.N), typed -> typed.update(DSL.remainderFinder(), this::N));
    }
}

