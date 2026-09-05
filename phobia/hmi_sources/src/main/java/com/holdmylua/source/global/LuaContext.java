/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 */
package com.holdmylua.source.global;

import com.holdmylua.source.patricles.Particle;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_742;

public class LuaContext {
    public class_4587 matrices;
    public boolean bl;
    public float swingProgress;
    public class_1799 item;
    public class_742 player;
    public class_1268 hand;
    public boolean mainHand;
    public float deltaTime;
    public float equipProgress;
    public float mainHandSwingProgress;
    public float offHandSwingProgress;
    public boolean mainHandSwitchEvent;
    public boolean offHandSwitchEvent;
    public boolean swingMHand;
    public boolean swingOHand;
    public boolean interact;
    public boolean blockBreaking;
    public List<Particle> particles;

    public void update(class_4587 matrices, boolean bl, float swingProgress, class_1799 item, class_742 player, class_1268 hand, boolean mainHand, float deltaTime, float equipProgress, float mainHandSwingProgress, float offHandSwingProgress, boolean mainHandSwitchEvent, boolean offHandSwitchEvent, boolean swingMHand, boolean swingOHand, boolean interact, boolean blockBreaking, List<Particle> particles) {
        this.matrices = matrices;
        this.bl = bl;
        this.swingProgress = swingProgress;
        this.item = item;
        this.player = player;
        this.hand = hand;
        this.mainHand = mainHand;
        this.deltaTime = deltaTime;
        this.equipProgress = equipProgress;
        this.mainHandSwingProgress = mainHandSwingProgress;
        this.offHandSwingProgress = offHandSwingProgress;
        this.mainHandSwitchEvent = mainHandSwitchEvent;
        this.offHandSwitchEvent = offHandSwitchEvent;
        this.swingMHand = swingMHand;
        this.swingOHand = swingOHand;
        this.interact = interact;
        this.blockBreaking = blockBreaking;
        this.particles = particles;
    }
}

