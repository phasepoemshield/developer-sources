/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  net.minecraft.class_11659
 *  net.minecraft.class_12249
 *  net.minecraft.class_1268
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4608
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_765
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package com.holdmylua.source.patricles;

import com.holdmylua.source.LuaTestHMI;
import com.holdmylua.source.patricles.render.ParticleRenderLayers;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.class_11659;
import net.minecraft.class_12249;
import net.minecraft.class_1268;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_765;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class Particle {
    private int prevAge = 0;
    private Consumer<Particle> ticker = null;
    public String lifecycleType;
    public String space;
    public boolean dead = false;
    private boolean isBirth = true;
    private final String particleRenderType;
    private double yawPrev = 0.0;
    private double pitchPrev = 0.0;
    private double particleLifetime = 0.0;
    public double x;
    public double y;
    public double z;
    public double dx;
    public double dy;
    public double dz;
    private double alpha = 255.0;
    private double scale = 0.0;
    public double maxScale = 1.0;
    public double rx;
    public double ry;
    public double rz;
    public double drx;
    public double dry;
    public double drz;
    private boolean gravity;
    public class_1268 hand;
    private double age = 0.0;
    private class_2960 texture;
    private List<class_2960> keyframes = new ArrayList<class_2960>();
    public class_4587 p_matrices = null;
    Iterator<class_2960> iterator;

    public Particle(boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha, Consumer<Particle> ticker) {
        this.particleLifetime = particleLifetime;
        this.gravity = gravity;
        this.lifecycleType = lifecycleType;
        this.particleRenderType = particleRenderType;
        this.space = space;
        this.hand = hand;
        this.ticker = ticker;
        this.alpha = alpha;
        this.x = x;
        this.y = y;
        this.z = z;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.drx = drx;
        this.dry = dry;
        this.drz = drz;
        this.maxScale = maxScale;
        this.texture = texture;
        this.iterator = this.keyframes.iterator();
    }

    public Particle(boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha) {
        this.particleLifetime = particleLifetime;
        this.gravity = gravity;
        this.lifecycleType = lifecycleType;
        this.particleRenderType = particleRenderType;
        this.space = space;
        this.hand = hand;
        this.alpha = alpha;
        this.x = x;
        this.y = y;
        this.z = z;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.drx = drx;
        this.dry = dry;
        this.drz = drz;
        this.maxScale = maxScale;
        this.texture = texture;
        this.iterator = this.keyframes.iterator();
    }

    public Particle(boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, List<class_2960> keyframes, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha, Consumer<Particle> ticker) {
        this.particleLifetime = particleLifetime;
        this.gravity = gravity;
        this.lifecycleType = lifecycleType;
        this.particleRenderType = particleRenderType;
        this.space = space;
        this.hand = hand;
        this.ticker = ticker;
        this.x = x;
        this.y = y;
        this.z = z;
        this.alpha = alpha;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.drx = drx;
        this.dry = dry;
        this.drz = drz;
        this.maxScale = maxScale;
        this.texture = texture;
        this.keyframes = keyframes;
        this.iterator = keyframes.iterator();
    }

    public Particle(boolean gravity, double x, double y, double z, double dx, double dy, double dz, double rx, double ry, double rz, double drx, double dry, double drz, double maxScale, class_2960 texture, String space, class_1268 hand, String lifecycleType, String particleRenderType, double particleLifetime, double alpha, Consumer<Particle> ticker, class_4587 p_matrices) {
        this.particleLifetime = particleLifetime;
        this.gravity = gravity;
        this.lifecycleType = lifecycleType;
        this.particleRenderType = particleRenderType;
        this.space = space;
        this.hand = hand;
        this.ticker = ticker;
        this.x = x;
        this.y = y;
        this.z = z;
        this.alpha = alpha;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.drx = drx;
        this.dry = dry;
        this.drz = drz;
        this.maxScale = maxScale;
        this.texture = texture;
        this.iterator = this.keyframes.iterator();
        this.p_matrices = p_matrices;
    }

    public void tick() {
        if (!this.dead) {
            this.particleLifetime -= (double)(0.1f * LuaTestHMI.deltaTime * 30.0f);
            this.particleLifetime = Math.clamp((double)this.particleLifetime, (double)0.0, (double)9999.0);
            this.age += (double)(0.1f * LuaTestHMI.deltaTime * 30.0f);
            this.x += this.dx * (double)LuaTestHMI.deltaTime * 30.0;
            this.y += this.dy * (double)LuaTestHMI.deltaTime * 30.0;
            this.z += this.dz * (double)LuaTestHMI.deltaTime * 30.0;
            this.dx *= Math.pow(0.9, LuaTestHMI.deltaTime * 30.0f);
            this.dy *= Math.pow(0.9, LuaTestHMI.deltaTime * 30.0f);
            this.dz *= Math.pow(0.9, LuaTestHMI.deltaTime * 30.0f);
            class_746 player = class_310.method_1551().field_1724;
            double yaw = player.method_36454();
            double radians = Math.toRadians(yaw);
            double forwardX = -Math.sin(radians);
            double forwardZ = Math.cos(radians);
            class_243 horizontalVelocity = player.method_18798();
            double dotProduct = horizontalVelocity.field_1352 * forwardX + horizontalVelocity.field_1350 * forwardZ;
            double crossProduct = player.method_18798().method_61890().field_1352 * forwardZ - horizontalVelocity.field_1350 * forwardX;
            if (this.gravity) {
                this.dy -= 0.01 * (double)LuaTestHMI.deltaTime * 30.0;
            }
            this.rx += this.drx * (double)LuaTestHMI.deltaTime * 30.0;
            this.ry += this.dry * (double)LuaTestHMI.deltaTime * 30.0;
            this.rz += this.drz * (double)LuaTestHMI.deltaTime * 30.0;
            if (!this.keyframes.isEmpty() && this.iterator.hasNext() && class_310.method_1551().field_1724.field_6012 % 4 == 0 && player.field_6012 != this.prevAge) {
                this.texture = this.iterator.next();
            }
            if (this.lifecycleType == "SCALE") {
                if (!this.isBirth && this.particleLifetime == 0.0) {
                    this.scale -= 0.03 * (double)LuaTestHMI.deltaTime * 30.0;
                    if (this.scale <= 0.0) {
                        this.dead = true;
                    }
                } else {
                    this.scale += 0.07 * (double)LuaTestHMI.deltaTime * 30.0;
                    if (this.scale >= this.maxScale) {
                        this.scale = this.maxScale;
                        this.isBirth = false;
                    }
                }
            } else if (this.lifecycleType == "OPACITY") {
                if (!this.isBirth && this.particleLifetime == 0.0) {
                    this.alpha -= (double)(10.0f * LuaTestHMI.deltaTime * 30.0f);
                    if (this.alpha <= 0.0) {
                        this.dead = true;
                        this.alpha = 0.0;
                    }
                } else {
                    this.scale = this.maxScale;
                    this.isBirth = false;
                    this.alpha = 255.0;
                }
            } else if (this.lifecycleType == "SPAWN") {
                if (!this.isBirth && this.particleLifetime == 0.0) {
                    this.dead = true;
                } else {
                    this.scale = this.maxScale;
                    this.isBirth = false;
                }
            } else if (this.lifecycleType == "KEYFRAME") {
                if (!this.isBirth && !this.iterator.hasNext()) {
                    this.dead = true;
                } else {
                    this.scale = this.maxScale;
                    this.isBirth = false;
                }
            }
            if (this.ticker != null) {
                this.ticker.accept(this);
            }
            this.prevAge = player.field_6012;
        }
    }

    public void render(class_4587 matrices, class_11659 queue, int light, class_742 player, float tickProgress) {
        if (!this.dead) {
            matrices.method_22903();
            matrices.method_22904(this.x, this.y, this.z);
            matrices.method_22905((float)this.scale, (float)this.scale, (float)this.scale);
            String string = this.particleRenderType;
            int n = 0;
            class_1921 renderLayer = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{"ADDITIVE"}, (Object)string, (int)n)) {
                case 0 -> ParticleRenderLayers.additiveParticle(this.texture);
                default -> class_12249.method_75967((class_2960)this.texture, (float)0.0f, (float)0.0f);
            };
            Matrix4f matrix = matrices.method_23760().method_23761();
            Vector3f translation = new Vector3f();
            Vector3f scale = new Vector3f();
            Quaternionf rotation = new Quaternionf();
            translation = matrix.getTranslation(translation);
            rotation = matrix.getUnnormalizedRotation(rotation);
            scale = matrix.getScale(scale);
            class_4184 camera = class_310.method_1551().field_1773.method_19418();
            matrix = matrix.identity().translate((Vector3fc)translation).scale((Vector3fc)scale).rotate((Quaternionfc)camera.method_23767());
            matrix.rotate((Quaternionfc)new Quaternionf().rotateX((float)(this.rx * 0.01745329238474369)));
            matrix.rotate((Quaternionfc)new Quaternionf().rotateY((float)(this.ry * 0.01745329238474369)));
            matrix.rotate((Quaternionfc)new Quaternionf().rotateZ((float)(this.rz * 0.01745329238474369)));
            Matrix3f normalMatrix = matrices.method_23760().method_23762();
            if (Objects.equals(this.particleRenderType, "CUTOUT_L")) {
                light = class_765.method_62228((int)15, (int)15);
            }
            double size = 0.5;
            double halfSize = size / 2.0;
            Vector3f normal = new Vector3f(0.0f, 0.0f, 1.0f);
            normal.mul((Matrix3fc)normalMatrix);
            Matrix4f finalMatrix = matrix;
            int finalLight = light;
            queue.method_73483(matrices, renderLayer, (peek, vertexConsumer) -> {
                vertexConsumer.method_56824(peek, (float)halfSize, (float)halfSize, 0.0f).method_1336(255, 255, 255, Math.clamp((long)((int)this.alpha), (int)0, (int)255)).method_22913(1.0f, 0.0f).method_22922(class_4608.field_21444).method_60803(finalLight).method_22914(normal.x, normal.y, normal.z);
                vertexConsumer.method_56824(peek, (float)(-halfSize), (float)halfSize, 0.0f).method_1336(255, 255, 255, Math.clamp((long)((int)this.alpha), (int)0, (int)255)).method_22913(0.0f, 0.0f).method_22922(class_4608.field_21444).method_60803(finalLight).method_22914(normal.x, normal.y, normal.z);
                vertexConsumer.method_56824(peek, (float)(-halfSize), (float)(-halfSize), 0.0f).method_1336(255, 255, 255, Math.clamp((long)((int)this.alpha), (int)0, (int)255)).method_22913(0.0f, 1.0f).method_22922(class_4608.field_21444).method_60803(finalLight).method_22914(normal.x, normal.y, normal.z);
                vertexConsumer.method_56824(peek, (float)halfSize, (float)(-halfSize), 0.0f).method_1336(255, 255, 255, Math.clamp((long)((int)this.alpha), (int)0, (int)255)).method_22913(1.0f, 1.0f).method_22922(class_4608.field_21444).method_60803(finalLight).method_22914(normal.x, normal.y, normal.z);
            });
            matrices.method_22909();
        }
    }
}

