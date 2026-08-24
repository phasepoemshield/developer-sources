package pulse.markers;

import java.awt.Color;

public class MapMarkerStyle {
    public final Color keyCodec;
    public final MapMarker.Icon elementCodec;

    public MapMarkerStyle(Color color) {
        this(color, MapMarker.Icon.EVENT);
    }

    public MapMarkerStyle(Color color, MapMarker.Icon icon) {
        this.keyCodec = color;
        this.elementCodec = icon != null ? icon : MapMarker.Icon.EVENT;
    }

    public Color color() {
        return this.keyCodec;
    }

    public MapMarker.Icon icon() {
        return this.elementCodec;
    }
}
