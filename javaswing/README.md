# Robot Controller Application

## Overview

This Java application provides a simple graphical interface to control a robot's movement on a grid. The robot can move forward, backward, and turn left or right. The application also allows the robot's state to be saved to a file and loaded from a file.

## Author

- **Name:** Álvaro Fernández
- **Github (School):** [afernandezmvm](https://github.com/afernandezmvm)
- **Github (Personal):** [JisuKlk](https://github.com/JisuKlk)

## Features

- Move the robot forward and backward.
- Turn the robot left and right.
- Save the robot's state to a file.
- Load the robot's state from a file.
- Display the robot's current position and direction.

## File Structure

### Main File: `PracticaPuntuableUF5.java`

This is the main file that initializes the graphical user interface (GUI) and sets up the event listeners for the buttons.

- **Package:** `imvm.jswing.alvaro.main`
- **Functionality:**
  - Sets up the main JFrame with a grid layout.
  - Adds JButtons for controlling the robot.
  - Displays the robot's current state using a JLabel.
  - Listens for button clicks and updates the robot's state accordingly.

### Utility File: `MoveUtils.java`

This file contains the utility functions for controlling the robot's movements and managing the robot's state.

- **Package:** `imvm.jswing.alvaro.utils`
- **Functionality:**
  - Defines the robot's state (position and direction).
  - Contains methods to move the robot forward and backward.
  - Contains methods to turn the robot left and right.
  - Provides methods to save the robot's state to a file and load the state from a file.
  - Updates the JLabel with the robot's current state.

## How to Run

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/JisuKlk/ProgUF5.git
