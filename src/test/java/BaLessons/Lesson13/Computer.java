package BaLessons.Lesson13;

public class Computer {
    private SystemBlock systemBlock;
    private Monitor monitor;

    public Computer(SystemBlock systemBlock, Monitor monitor) {
        this.systemBlock = systemBlock;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }
}
