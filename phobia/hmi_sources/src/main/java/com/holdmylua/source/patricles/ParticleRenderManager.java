/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11659
 *  net.minecraft.class_1268
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 */
package com.holdmylua.source.patricles;

import com.holdmylua.source.patricles.Particle;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_4587;
import net.minecraft.class_742;

public class ParticleRenderManager {
    public static void draw(ArrayList<Particle> particles, class_4587 matrices, class_11659 queue, String space, class_1268 hand, int light, class_742 player, float tickProgress) {
        Iterator<Particle> iterator = particles.iterator();
        while (iterator.hasNext()) {
            Particle particle = iterator.next();
            if (particle.dead) {
                iterator.remove();
                continue;
            }
            if (particle.space != space || particle.hand != hand) continue;
            if (particle.p_matrices != null) {
                particle.render(particle.p_matrices, queue, light, player, tickProgress);
            } else {
                particle.render(matrices, queue, light, player, tickProgress);
            }
            particle.tick();
        }
    }
}

