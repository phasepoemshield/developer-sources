package fun.wonderful.api.storages.implement.helpertstorages;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.color.ColorUtils;
import lombok.Generated;

public class Theme
implements QClient {
    private String name;
    public int[] color;

    public Theme(String name, int ... color) {
        this.name = name;
        this.color = color;
    }

    public int getColor(int index) {
        if (this.name.equals("Rainbow")) {
            return ColorUtils.rainbow(10, index, 0.6f, 1.0f, 1.0f);
        }
        if (this.name.equals("Custom")) {
            if (this.color == null || this.color.length == 0) {
                return ColorUtils.rgba(255, 255, 255, 255);
            }
            if (this.color.length == 1) {
                return this.color[0];
            }
            float amount = Math.max(0.0f, Math.min(1.0f, (float)index / 360.0f));
            return ColorUtils.gradient(this.color[0], this.color[1], amount);
        }
        if (this.color == null || this.color.length == 0) {
            return ColorUtils.rgba(255, 255, 255, 255);
        }
        if (this.color.length == 1) {
            return this.color[0];
        }
        float amount = Math.max(0.0f, Math.min(1.0f, (float)index / 360.0f));
        float scaled = amount * (float)(this.color.length - 1);
        int leftIndex = Math.max(0, Math.min(this.color.length - 1, (int)Math.floor(scaled)));
        int rightIndex = Math.max(0, Math.min(this.color.length - 1, leftIndex + 1));
        float localAmount = scaled - (float)leftIndex;
        return ColorUtils.gradient(this.color[leftIndex], this.color[rightIndex], localAmount);
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public int[] getColor() {
        return this.color;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setColor(int[] color) {
        this.color = color;
    }
}