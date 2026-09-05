/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1140
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package ruhack.phobia.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1140;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_1140.class})
public abstract class bs {
    @Unique
    private final List<Object> phobia$tickingSoundSnapshot = new ArrayList<Object>();

    @Redirect(method={"method_4857()V"}, at=@At(value="INVOKE", target="Ljava/util/List;iterator()Ljava/util/Iterator;", ordinal=0))
    private Iterator<?> phobia$snapshotTickingSounds(List<?> sounds) {
        this.phobia$tickingSoundSnapshot.clear();
        this.phobia$tickingSoundSnapshot.addAll(sounds);
        return this.phobia$tickingSoundSnapshot.iterator();
    }
}
