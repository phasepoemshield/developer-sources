/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import minecraft.class05677;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07793;

final class class05674
extends class05677 {
    class05674(String string, int n, String string2) {
    }

    @Override
    public void N(class07709 class077093, class07793 class077932, List<class07709> list) throws CommandSyntaxException {
        class077932.N(class077093, class07741::new).forEach(class077092 -> {
            if (class077092 instanceof class07741) {
                list.forEach(class077093 -> ((class07741)class077092).add((Object)class077093.N()));
            }
        });
    }
}

