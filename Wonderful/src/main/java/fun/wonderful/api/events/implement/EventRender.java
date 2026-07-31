package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;
import net.minecraft.client.util.Window;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.WorldRenderer;
import org.joml.Matrix4f;

public class EventRender
extends Event {

    public static class Game
    extends Event {
        private final WorldRenderer context;
        private final MatrixStack matrix;
        private final Matrix4f projectionMatrix;
        private final Camera camera;
        private final float partialTicks;
        private final long finishTimeNano;

        @Generated
        public WorldRenderer getContext() {
            return this.context;
        }

        @Generated
        public MatrixStack getMatrix() {
            return this.matrix;
        }

        @Generated
        public Matrix4f getProjectionMatrix() {
            return this.projectionMatrix;
        }

        @Generated
        public Camera getCamera() {
            return this.camera;
        }

        @Generated
        public float getPartialTicks() {
            return this.partialTicks;
        }

        @Generated
        public long getFinishTimeNano() {
            return this.finishTimeNano;
        }

        @Generated
        public Game(WorldRenderer context, MatrixStack matrix, Matrix4f projectionMatrix, Camera camera, float partialTicks, long finishTimeNano) {
            this.context = context;
            this.matrix = matrix;
            this.projectionMatrix = projectionMatrix;
            this.camera = camera;
            this.partialTicks = partialTicks;
            this.finishTimeNano = finishTimeNano;
        }
    }

    public static class World
    extends Event {
        private final Window scaledResolution;
        private final float partialTicks;
        private final Matrix4f matrix;
        private final MatrixStack matrixStack;

        @Generated
        public Window getScaledResolution() {
            return this.scaledResolution;
        }

        @Generated
        public float getPartialTicks() {
            return this.partialTicks;
        }

        @Generated
        public Matrix4f getMatrix() {
            return this.matrix;
        }

        @Generated
        public MatrixStack getMatrixStack() {
            return this.matrixStack;
        }

        @Generated
        public World(Window scaledResolution, float partialTicks, Matrix4f matrix, MatrixStack matrixStack) {
            this.scaledResolution = scaledResolution;
            this.partialTicks = partialTicks;
            this.matrix = matrix;
            this.matrixStack = matrixStack;
        }
    }

    public static class Default
    extends Event {
        private final DrawContext context;
        private final float partialTicks;

        @Generated
        public DrawContext getContext() {
            return this.context;
        }

        @Generated
        public float getPartialTicks() {
            return this.partialTicks;
        }

        @Generated
        public Default(DrawContext context, float partialTicks) {
            this.context = context;
            this.partialTicks = partialTicks;
        }
    }
}