
public abstract class VehicleReport {

    // Template method controls the workflow
    public final void generateReport() {
        collectData();
        formatReport();
        logStatus();
    }

    // Shared data collection step
    protected void collectData() {
        System.out.println("Fetching GPS data...");
    }

    // Subclasses must implement formatting
    protected abstract void formatReport();

    // Shared logging step
    protected void logStatus() {
        System.out.println("Log entry created.");
    }
}
