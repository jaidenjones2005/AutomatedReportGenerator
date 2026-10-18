
# Automated Report Generator Journal

## Phase 1: Abstract Template Structure

In this phase, I created the abstract VehicleReport class
using the Template Method design pattern. I added the
generateReport() method to control the order of data
collection, report formatting, and status logging.

I made generateReport() final so subclasses cannot
change the workflow. I also made formatReport() abstract
so each vehicle type can implement its own formatting.

The Hollywood Principle means the parent class controls
when subclass methods are called instead of the subclass
controlling the entire process.


## Phase 2: Concrete Vehicle Reports

In this phase, I created TruckReport and BikeReport
as subclasses of VehicleReport. Each class overrides
formatReport() to provide vehicle-specific formatting.

I also created Main.java to test both reports.

When I called generateReport(), the parent class
controlled the workflow, while the subclasses provided
their own formatting behavior.

The most interesting part was seeing how the same
template method could produce different results
without changing the overall execution sequence.

