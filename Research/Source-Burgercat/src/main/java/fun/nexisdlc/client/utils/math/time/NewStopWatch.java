package fun.nexisdlc.client.utils.math.time;

import lombok.Data;

@Data
public class NewStopWatch {

    private long startTime;

    public NewStopWatch() {
        reset();
    }

    public boolean finished(final double delay) {
        return System.currentTimeMillis() - delay >= startTime;
    }

    public boolean every(final double delay) {
        boolean finished = this.finished(delay);
        if (finished) reset();
        return finished;
    }

    public void reset() {
        this.startTime = System.currentTimeMillis();
    }

    public int elapsedTime() {
        return Math.toIntExact(System.currentTimeMillis() - this.startTime);
    }

    public NewStopWatch setMs(long ms) {
        this.startTime = System.currentTimeMillis() - ms;
        return this;
    }
}