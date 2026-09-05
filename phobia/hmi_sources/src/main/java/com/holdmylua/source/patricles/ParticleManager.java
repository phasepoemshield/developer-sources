/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  org.luaj.vm2.LuaFunction
 *  org.luaj.vm2.LuaValue
 */
package com.holdmylua.source.patricles;

import com.holdmylua.source.annotation.Safe;
import com.holdmylua.source.patricles.LuaConsumer;
import com.holdmylua.source.patricles.Particle;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

public class ParticleManager {
    @Safe
    public void addParticle(ArrayList<Particle> particles, boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha, LuaValue func) {
        particleRenderType = particleRenderType.intern();
        lifecycleType = lifecycleType.intern();
        space = space.intern();
        LuaConsumer ticker = null;
        if (func.isfunction()) {
            ticker = new LuaConsumer((LuaFunction)func);
        }
        particles.add(new Particle(gravity, x, y, z, dx, dy, dz, rx, ry, rz, drx, dry, drz, maxScale, texture, space, hand, lifecycleType, particleRenderType, particleLifetime, alpha, ticker));
    }

    @Safe
    public void addParticle(ArrayList<Particle> particles, boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha) {
        particleRenderType = particleRenderType.intern();
        lifecycleType = lifecycleType.intern();
        space = space.intern();
        particles.add(new Particle(gravity, x, y, z, dx, dy, dz, rx, ry, rz, drx, dry, drz, maxScale, texture, space, hand, lifecycleType, particleRenderType, particleLifetime, alpha));
    }

    @Safe
    public void addParticle(ArrayList<Particle> particles, boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, List<class_2960> keyframes, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha, LuaValue func) {
        particleRenderType = particleRenderType.intern();
        lifecycleType = lifecycleType.intern();
        space = space.intern();
        LuaConsumer ticker = null;
        if (func.isfunction()) {
            ticker = new LuaConsumer((LuaFunction)func);
        }
        if (particles.stream().noneMatch(particle -> particle.lifecycleType == "KEYFRAME" && particle.hand == hand)) {
            particles.add(new Particle(gravity, x, y, z, dx, dy, dz, rx, ry, rz, drx, dry, drz, maxScale, texture, keyframes, space, hand, lifecycleType, particleRenderType, particleLifetime, alpha, ticker));
        }
    }

    @Safe
    public void addParticle(ArrayList<Particle> particles, boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha, LuaValue func, class_4587 p_matrices) {
        particleRenderType = particleRenderType.intern();
        lifecycleType = lifecycleType.intern();
        space = space.intern();
        LuaConsumer ticker = null;
        if (func.isfunction()) {
            ticker = new LuaConsumer((LuaFunction)func);
        }
        particles.add(new Particle(gravity, x, y, z, dx, dy, dz, rx, ry, rz, drx, dry, drz, maxScale, texture, space, hand, lifecycleType, particleRenderType, particleLifetime, alpha, ticker, p_matrices));
    }
}

