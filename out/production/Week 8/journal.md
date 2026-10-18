
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

