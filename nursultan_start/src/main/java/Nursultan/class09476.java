/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class01549
 *  minecraft.class05706
 *  minecraft.class06839
 *  minecraft.class07686
 *  net.fabricmc.fabric.impl.gamerule.EnumRuleCommand
 *  net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package Nursultan;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import minecraft.class01549;
import minecraft.class05706;
import minecraft.class06839;
import minecraft.class07686;
import net.fabricmc.fabric.impl.gamerule.EnumRuleCommand;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09476
implements class05706 {
    final /* synthetic */ LiteralArgumentBuilder N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09476(LiteralArgumentBuilder literalArgumentBuilder) {
        this.N = literalArgumentBuilder;
    }

    public <T> void N(class06839<T> class068392) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class068392, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        LiteralArgumentBuilder var2 = class07686.y((String)class068392.N());
        LiteralArgumentBuilder var3 = class07686.y((String)class068392.y().toString());
        ((LiteralArgumentBuilder)this.N.then((ArgumentBuilder)class01549.N(class068392, (LiteralArgumentBuilder)var2))).then((ArgumentBuilder)class01549.N(class068392, (LiteralArgumentBuilder)var3));
    }

    private void N(class06839 class068392, CallbackInfo callbackInfo) {
        if (((RuleTypeExtensions)class068392).fabric_getType() == FabricGameRuleType.ENUM) {
            EnumRuleCommand.register((LiteralArgumentBuilder)this.N, (class06839)class068392);
            callbackInfo.cancel();
        }
    }
}

