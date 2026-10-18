
public abstract class VehicleReport {

    // Template method controls the workflow
    public final void generateReport() {
        collectData();
        formatReport();

        // Optional maintenance check
        if (shouldCheckMaintenance()) {
            performMaintenanceCheck();
        }

        logStatus();
    }

    // Shared data collection
    protected void collectData() {
        System.out.println("Fetching GPS data...");
    }

    // Vehicle-specific formatting
    protected abstract void formatReport();

    // Boolean hook - disabled by default
    protected boolean shouldCheckMaintenance() {
        return false;
    }

    // Shared maintenance check
    protected void performMaintenanceCheck() {
        System.out.println("Performing standard maintenance check...");
    }

    // Shared status logging
    protected void logStatus() {
        System.out.println("Log entry created.");
    }
}
