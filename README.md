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
    ```

2. **Navigate to the project directory:**
    ```bash
    cd ProgUF5
    ```

3. **Compile the Java Files:**
    ```bash
    javac -d bin javaswing/src/main/java/imvm/jswing/alvaro/main/PracticaPuntuableUF5.java javaswing/src/main/java/imvm/jswing/alvaro/utils/MoveUtils.java
    ```

4. **Run the Main Class:**
    ```bash
    java -cp bin imvm.jswing.alvaro.main.PracticaPuntuableUF5
    ```

## Usage
- **Move:**
    - Press whether move forward or backward to move the robot
- **Rotate:**
    - Press the direction you want to rotate the robot 90 degrees to the selected direction
- **Save/Load:**
    - You can either chose to save the state to save the actual position of the bot on a file, or to load an already created file to get the position back

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
