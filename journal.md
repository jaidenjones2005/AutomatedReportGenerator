
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


## Phase 3: Conditional Behavior with a Boolean Hook

In this phase, I added an optional maintenance check
to the VehicleReport template method.

I created the shouldCheckMaintenance() hook, which
returns false by default. I then overrode it in
TruckReport to return true.

This allows trucks to perform a maintenance check
while bikes skip it.

I learned that abstract methods require subclasses
to provide an implementation, while boolean hooks
allow subclasses to optionally change behavior.

The hook makes the Template Method pattern more
flexible without changing the overall workflow.


## Phase 4: Validation & Reflection

In this phase, I tested the Automated Report Generator
to verify that both vehicle types followed the correct
workflow.

I checked that the truck report collected GPS data,
formatted heavy cargo dimensions, performed a
maintenance check, and logged the report.

I also verified that the bike report collected GPS
data, formatted lightweight parcel dimensions,
skipped maintenance, and logged the report.

The main concept I reinforced was how the Template
Method pattern keeps the execution sequence consistent
while allowing subclasses to customize certain steps.

I also learned that boolean hooks provide optional
behavior without requiring every subclass to implement
the same method.

Overall, this project helped me better understand
abstract classes, inheritance, final methods, and
the Template Method design pattern.
