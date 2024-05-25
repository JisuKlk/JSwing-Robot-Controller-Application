/*
 * File: MoveUtils
 * Author: Álvaro Fernández
 * Github 1: https://github.com/afernandezmvm (School acc)
 * Github 2: https://github.com/JisuKlk (Personal acc)
 * Desc: File containing all the functions for the robot to work
 */

// Package
package imvm.jswing.alvaro.utils;

//#region // ・ ═══════『 📩 IMPORTS 📩 』═══════ ・//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;
//#endregion // ・ ═══════『 📩 IMPORTS 📩 』═══════ ・//

public class MoveUtils {

    // ・ ═══════『 📝 Some messages that didn't fit on the main file 📝 』═══════ ・//
    private final static String SAVED_FILE = "File saved correctly";
    private final static String LOADED_FILE = "File loaded correctly";

    // ・ ═══════『 📦 We update the state (the first box with the data) 📦 』═══════ ・//
    public static void updateState(JLabel labelState, RobotState robotState, String positionMsg, String directionMsg) {
        labelState.setText(positionMsg + " (" + robotState.x + ", " + robotState.y + ") " + directionMsg + robotState.direction);
    }

    //#region // ・ ═══════『 ▶ MOVE ▶ 』═══════ ・//
    public static void moveForward(RobotState robotState) {
        switch (robotState.direction) {
            case "North" -> robotState.y++;
            case "South" -> robotState.y--;
            case "East" -> robotState.x++;
            case "West" -> robotState.x--;
        }
    }

    public static void moveBackward(RobotState robotState) {
        switch (robotState.direction) {
            case "North" -> robotState.y--;
            case "South" -> robotState.y++;
            case "East" -> robotState.x--;
            case "West" -> robotState.x++;
        }
    }
    //#endregion // ・ ═══════『 ▶ MOVE ▶ 』═══════ ・//

    //#region // ・ ═══════『 ▶ TURN ▶ 』═══════ ・//
    public static void lookToLeft(RobotState robotState) {
        switch (robotState.direction) {
            case "North" -> robotState.direction = "West";
            case "West" -> robotState.direction = "South";
            case "South" -> robotState.direction = "East";
            case "East" -> robotState.direction = "North";
        }
    }

    public static void lookToRight(RobotState robotState) {
        switch (robotState.direction) {
            case "North" -> robotState.direction = "East";
            case "East" -> robotState.direction = "South";
            case "South" -> robotState.direction = "West";
            case "West" -> robotState.direction = "North";
        }
    }
    //#endregion // ・ ═══════『 ▶ TURN ▶ 』═══════ ・//

    //#region // ・ ═══════『 📁 FILES 📁 』═══════ ・//
    public static void saveState(RobotState robotState, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(robotState.x + "\n");
            writer.write(robotState.y + "\n");
            writer.write(robotState.direction + "\n");
            System.out.println(SAVED_FILE);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public static void loadState(RobotState robotState, JLabel labelState, String filename, String positionMsg, String directionMsg) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            robotState.x = Integer.parseInt(reader.readLine());
            robotState.y = Integer.parseInt(reader.readLine());
            robotState.direction = reader.readLine();
            updateState(labelState, robotState, positionMsg, directionMsg);
            System.out.println(LOADED_FILE);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
    //#endregion // ・ ═══════『 📁 FILES 📁 』═══════ ・//

    // ・ ═══════『 🗺 Initial robot's chords 🗺 』═══════ ・//
    public static class RobotState {
        public int x = 0;
        public int y = 0;
        public String direction = "North"; // North's default direction
    }
}
