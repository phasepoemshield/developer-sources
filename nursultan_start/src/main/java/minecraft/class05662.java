/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class05677
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import minecraft.class05677;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07793;

final class class05662
extends class05677 {
    class05662(String string, int n, String string2) {
        super(string, n, string2);
    }

    public void N(class07709 class077093, class07793 class077932, List<class07709> list) throws CommandSyntaxException {
        class077932.N(class077093, class07001::new).forEach(class077092 -> {
            if (class077092 instanceof class07001) {
                list.forEach(class077093 -> {
                    if (class077093 instanceof class07001) {
                        ((class07001)class077092).N((class07001)class077093);
                    }
                });
            }
        });
    }
}

