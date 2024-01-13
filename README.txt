PROJECT BEEHIVE
Author: Christopher Chen
Date of creation 1/12/2024


Project Beehive is a simulator project that is used to write code to simulate drones.

The purpose of this project is to create a drone simulation that is relatively realistic, and applicable to situations like military usage,
construction testing, reconnaisance, monitoring, and delivery systems.

Benefits of this project: 
- Will provide a way for me to practice programming methodologies, and create
a skeleton code that can be re-engineered into skeleton structure of an actual functioning drone software.

AGILE METHODOLOGY: break this project into phases and emphasizes continuous collaboration and improvement
Practicing Scrum framework, with elements of Kanban

Phases of development:

Phase 1: Project Initialization and Early Planning 
Deadline 1/15/2024

World Class will be a representation of a square area of a world. This class will be expanded to allow for partitioning of
the globe, using longitude and latitude positioning systems, and interlocking World pieces into a final class Globe. The 
world is a 3 dimensional grid. The grid is comprised of MileCubes objects.

MileCube Class is a piece of the world class, representing 1 cubic mile partition of the world grid. This class will be very
similar to the World Class. It has a grid too, but the grid is comprised of MileCube objects.

FeetCube Class is a piece of the MileCube class, representing 1 cubic foot partition of the MileCube object grid. This class will be very similar to the MileCube class. It has a grid too, but the grid is comprised of InchCube objects.

InchCube Class is a piece of the FeetCube class, representing 1 cubic inch partition of the FeetCube object grid. This class will be smallest class representation of space in the world

Bee Class will be a representation of a single drone, with its dimensions, detection ranges and communication ranges. Other
properties of the drone may be implemented in the simulation in the future, such as speed, payload, weight, etc.






Phase 2: Creation of basic backend elements of the simulation
Deadline 1/22/2024
- Bee
- World
- MileCube
- FeetCube

Phase 3: Researching Graphic development of simulator
Deadline 1/30/2024
-





