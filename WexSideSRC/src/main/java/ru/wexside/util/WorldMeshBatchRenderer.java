/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_12249
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597$class_4598
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package ru.wexside.util;

import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import java.util.concurrent.atomic.AtomicLong;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import ru.wexside.misc.ModelSurfaceMode;
import ru.wexside.render.ModelRenderBatch;
import ru.wexside.util.InlineMesh;
import ru.wexside.util.ModelRenderOptions;
import ru.wexside.util.ModelRenderQueue;

public final class WorldMeshBatchRenderer {
    public static final AtomicLong DEBUG_DRAWS = new AtomicLong();
    public static final AtomicLong DEBUG_BATCHES = new AtomicLong();
    public static final AtomicLong DEBUG_VERTS = new AtomicLong();
    private static final class_4587.class_4665 IDENTITY_ENTRY = new class_4587().method_23760();

    public WorldMeshBatchRenderer(String debugName) {
    }

    public void process10(class_4587 matrices, class_4597.class_4598 consumers, class_243 cameraPosition, ModelRenderQueue queue) {
        if (matrices == null || consumers == null || queue == null || queue.isActive()) {
            return;
        }
        class_243 camera = cameraPosition != null ? cameraPosition : class_243.field_1353;
        class_1921 fillLayer = class_12249.method_76023();
        class_1921 outlineLayer = class_12249.method_76015();
        boolean hasFill = false;
        for (ModelRenderBatch batch : queue.getBatches()) {
            if (batch.options().getModelSurfaceMode() == ModelSurfaceMode.HIDDEN) continue;
            Matrix4f base = new Matrix4f((Matrix4fc)matrices.method_23760().method_23761()).translate((float)(batch.x() - camera.field_1352), (float)(batch.y() - camera.field_1351), (float)(batch.z() - camera.field_1350));
            for (int i = 0; i < batch.meshes().size(); ++i) {
                InlineMesh mesh = batch.meshes().get(i);
                Matrix4f model = new Matrix4f((Matrix4fc)base);
                if (batch.transforms() != null && i < batch.transforms().length && batch.transforms()[i] != null) {
                    model.mul((Matrix4fc)batch.transforms()[i]);
                }
                WorldMeshBatchRenderer.emitTriangles(consumers.method_73477(fillLayer), model, mesh, batch.color());
                hasFill = true;
            }
        }
        if (hasFill) {
            DEBUG_DRAWS.incrementAndGet();
            DEBUG_BATCHES.addAndGet(queue.getBatches().size());
            for (ModelRenderBatch batch : queue.getBatches()) {
                DEBUG_VERTS.addAndGet(batch.meshes().size());
            }
            consumers.method_22994(fillLayer);
        }
        boolean hasOutline = false;
        for (ModelRenderBatch batch : queue.getBatches()) {
            ModelRenderOptions options = batch.options();
            if (options.getModelSurfaceMode() == ModelSurfaceMode.HIDDEN || !options.isActive3()) continue;
            Matrix4f base = new Matrix4f((Matrix4fc)matrices.method_23760().method_23761()).translate((float)(batch.x() - camera.field_1352), (float)(batch.y() - camera.field_1351), (float)(batch.z() - camera.field_1350));
            for (int i = 0; i < batch.meshes().size(); ++i) {
                InlineMesh mesh = batch.meshes().get(i);
                Matrix4f model = new Matrix4f((Matrix4fc)base);
                if (batch.transforms() != null && i < batch.transforms().length && batch.transforms()[i] != null) {
                    model.mul((Matrix4fc)batch.transforms()[i]);
                }
                WorldMeshBatchRenderer.emitOutline(consumers.method_73477(outlineLayer), model, mesh, options.process8(batch.outlineColor()), options.getFloatType());
                hasOutline = true;
            }
        }
        if (hasOutline) {
            consumers.method_22994(outlineLayer);
        }
    }

    private static void emitTriangles(class_4588 output, Matrix4f matrix, InlineMesh mesh, int color) {
        float[] positions = mesh.getFloatType();
        int[] indices = mesh.getIntType2();
        if (positions == null) {
            return;
        }
        if (indices == null) {
            for (int vertex = 0; vertex < positions.length / 3; ++vertex) {
                WorldMeshBatchRenderer.emitVertex(output, matrix, positions, vertex, color, 1.0f);
            }
            return;
        }
        for (int vertex : indices) {
            WorldMeshBatchRenderer.emitVertex(output, matrix, positions, vertex, color, 1.0f);
        }
    }

    private static void emitOutline(class_4588 output, Matrix4f matrix, InlineMesh mesh, int color, float lineWidth) {
        float[] positions = mesh.getFloatType();
        int[] edges = mesh.getIntType();
        if (positions == null || edges == null) {
            return;
        }
        Vector3f start = new Vector3f();
        Vector3f end = new Vector3f();
        Vector3f direction = new Vector3f();
        for (int edge = 0; edge + 1 < edges.length; edge += 2) {
            if (!WorldMeshBatchRenderer.loadPosition(positions, edges[edge], start) || !WorldMeshBatchRenderer.loadPosition(positions, edges[edge + 1], end)) continue;
            end.sub(start, direction);
            matrix.transformDirection(direction);
            if (direction.lengthSquared() < 1.0E-8f) {
                direction.set(0.0f, 1.0f, 0.0f);
            } else {
                direction.normalize();
            }
            WorldMeshBatchRenderer.emitEdgeVertex(output, matrix, positions, edges[edge], color, lineWidth, direction);
            WorldMeshBatchRenderer.emitEdgeVertex(output, matrix, positions, edges[edge + 1], color, lineWidth, direction);
        }
    }

    private static boolean loadPosition(float[] positions, int vertex, Vector3f result) {
        int offset = vertex * 3;
        if (offset < 0 || offset + 2 >= positions.length) {
            return false;
        }
        result.set(positions[offset], positions[offset + 1], positions[offset + 2]);
        return true;
    }

    private static void emitEdgeVertex(class_4588 output, Matrix4f matrix, float[] positions, int vertex, int color, float lineWidth, Vector3f normal) {
        int offset = vertex * 3;
        if (offset < 0 || offset + 2 >= positions.length) {
            return;
        }
        output.method_22918((Matrix4fc)matrix, positions[offset], positions[offset + 1], positions[offset + 2]).method_39415(color).method_61959(IDENTITY_ENTRY, normal).method_75298(lineWidth);
    }

    private static void emitVertex(class_4588 output, Matrix4f matrix, float[] positions, int vertex, int color, float lineWidth) {
        int offset = vertex * 3;
        if (offset < 0 || offset + 2 >= positions.length) {
            return;
        }
        output.method_22918((Matrix4fc)matrix, positions[offset], positions[offset + 1], positions[offset + 2]).method_39415(color).method_75298(lineWidth);
    }
}

