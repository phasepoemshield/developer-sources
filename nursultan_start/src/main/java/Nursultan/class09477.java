/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01568
 *  minecraft.class01578
 *  minecraft.class05598
 *  minecraft.class05622
 *  minecraft.class07001
 *  minecraft.class07701
 *  minecraft.class07759
 *  minecraft.class07793
 */
package Nursultan;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01568;
import minecraft.class01578;
import minecraft.class05598;
import minecraft.class05622;
import minecraft.class07001;
import minecraft.class07701;
import minecraft.class07759;
import minecraft.class07793;

public class class09477
extends class01578 {
    final /* synthetic */ class05622 N;

    public class09477(class05622 class056222) {
        this.N = class056222;
    }

    protected class07001 N(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        return class01568.N((class07793)class07759.N(commandContext, (String)"path"), (class05598)this.N.N(commandContext));
    }
}

