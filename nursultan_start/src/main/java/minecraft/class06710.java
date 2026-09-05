/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class08036
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor
 *  net.fabricmc.fabric.mixin.transfer.CompoundContainerAccessor
 */
package minecraft;

import minecraft.class06584;
import minecraft.class06695;
import minecraft.class08036;
import minecraft.class08978;
import net.fabricmc.fabric.mixin.transfer.CompoundContainerAccessor;

public class class06710
implements class06695,
net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor,
CompoundContainerAccessor {
    private final class06695 field_5769;
    private final class06695 field_5771;

    public class06710(class06695 class066952, class06695 class066953) {
        this.field_5769 = class066952;
        this.field_5771 = class066953;
    }

    public /* synthetic */ class06695 getFirst() {
        return this.field_5769;
    }

    public /* synthetic */ class06695 getSecond() {
        return this.field_5771;
    }

    @Override
    public boolean method_5443(class08036 class080362) {
        return this.field_5769.method_5443(class080362) && this.field_5771.method_5443(class080362);
    }

    @Override
    public void method_5432(class08978 class089782) {
        this.field_5769.method_5432(class089782);
        this.field_5771.method_5432(class089782);
    }

    public void method_5448() {
        this.field_5769.method_5448();
        this.field_5771.method_5448();
    }

    @Override
    public void method_5435(class08978 class089782) {
        this.field_5769.method_5435(class089782);
        this.field_5771.method_5435(class089782);
    }

    @Override
    public boolean method_5437(int n, class06584 class065842) {
        if (n >= this.field_5769.method_5439()) {
            return this.field_5771.method_5437(n - this.field_5769.method_5439(), class065842);
        }
        return this.field_5769.method_5437(n, class065842);
    }

    @Override
    public int method_5444() {
        return this.field_5769.method_5444();
    }

    public boolean method_5405(class06695 class066952) {
        return this.field_5769 == class066952 || this.field_5771 == class066952;
    }

    @Override
    public void method_5447(int n, class06584 class065842) {
        if (n >= this.field_5769.method_5439()) {
            this.field_5771.method_5447(n - this.field_5769.method_5439(), class065842);
        } else {
            this.field_5769.method_5447(n, class065842);
        }
    }

    @Override
    public void method_5431() {
        this.field_5769.method_5431();
        this.field_5771.method_5431();
    }

    @Override
    public class06584 method_5434(int n, int n2) {
        if (n >= this.field_5769.method_5439()) {
            return this.field_5771.method_5434(n - this.field_5769.method_5439(), n2);
        }
        return this.field_5769.method_5434(n, n2);
    }

    @Override
    public class06584 method_5441(int n) {
        if (n >= this.field_5769.method_5439()) {
            return this.field_5771.method_5441(n - this.field_5769.method_5439());
        }
        return this.field_5769.method_5441(n);
    }

    @Override
    public boolean method_5442() {
        return this.field_5769.method_5442() && this.field_5771.method_5442();
    }

    public /* synthetic */ class06695 fabric_getSecond() {
        return this.field_5771;
    }

    public /* synthetic */ class06695 fabric_getFirst() {
        return this.field_5769;
    }

    @Override
    public class06584 method_5438(int n) {
        if (n >= this.field_5769.method_5439()) {
            return this.field_5771.method_5438(n - this.field_5769.method_5439());
        }
        return this.field_5769.method_5438(n);
    }

    @Override
    public int method_5439() {
        return this.field_5769.method_5439() + this.field_5771.method_5439();
    }
}

