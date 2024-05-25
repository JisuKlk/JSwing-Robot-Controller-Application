/*
 * File: PracticaPuntuableUF5
 * Author: Álvaro Fernández
 * Github 1: https://github.com/afernandezmvm (School acc)
 * Github 2: https://github.com/JisuKlk (Personal acc)
 * Desc: Main file for the app, it calls all the functions and gets the work done
 */

// Package
package imvm.jswing.alvaro.main;

//#region // ・ ═══════『 📩 IMPORTS 📩 』═══════ ・//
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import imvm.jswing.alvaro.utils.MoveUtils;
import imvm.jswing.alvaro.utils.MoveUtils.RobotState;
//#endregion // ・ ═══════『 📩 IMPORTS 📩 』═══════ ・//

public class PracticaPuntuableUF5 {

    //#region // ・ ═══════『 Constants with the app messages 』═══════ ・//
    //#region --- Window messages
    private final static String APP_TITLE = "Alvaro Fernandez --- Practica puntuable UF5; robot (en teoria) funcional";
    private final static String MOVE_FORWARD = "Move forward";
    private final static String MOVE_BACKWARD = "Move backward";
    private final static String MOVE_LEFT = "Move to left";
    private final static String MOVE_RIGHT = "Move to right";
    private final static String SAVE_STATE = "Save the state";
    private final static String LOAD_STATE = "Load the state";
    private final static String POSITION = "Position:";
    private final static String DIRECTION = "Direction:";
    private final static String FILENAME = "robotState.txt";
    //#endregion

    //#region --- Console messages
    private final static String MOVE_TO = "Robot just moved to:";
    private final static String LOOK_TO = "Robot's now looking towards:";
    //#endregion
    //#endregion

    public static void main(String[] args) {

        // ・ ═══════『 🦆 We get the state from the class declared below 🦆 』═══════ ・//
        RobotState robotState = new RobotState();

        // ・ ═══════『 🖼 Create the JFrame where we're gonna work on 🖼 』═══════ ・//
        JFrame frame = new JFrame(APP_TITLE);

        // ・ ═══════『 🌟 Give form to the frame using a grid layout 🌟 』═══════ ・//
        frame.setLayout(new GridLayout(3, 2));

        // ・ ═══════『 🔖 We also create the JLabel 🔖 』═══════ ・//
        JLabel jLabel = new JLabel();

        // ・ ═══════『 📞 Call the function responsible to update the state of the robot after each click 📞 』═══════ ・//
        MoveUtils.updateState(jLabel, robotState, POSITION, DIRECTION);

        // ・ ═══════『 🏷 Then we add the edited JLabel 🏷 』═══════ ・//
        frame.add(jLabel);

        //#region // ・ ═══════『 🟪 JBUTTONS 🟪 』═══════ ・//
        // ・ ═══════『 🔲 We declare the JButtons 🔲 』═══════ ・//
        JButton button1 = new JButton(MOVE_FORWARD);
        JButton button2 = new JButton(MOVE_BACKWARD);
        JButton button3 = new JButton(MOVE_LEFT);
        JButton button4 = new JButton(MOVE_RIGHT);
        JButton button5 = new JButton(SAVE_STATE);
        JButton button6 = new JButton(LOAD_STATE);

        // ・ ═══════『 👂 We add the listener (lambda go brrr) 👂 』═══════ ・//
        button1.addActionListener((ActionEvent e) -> {
            MoveUtils.moveForward(robotState);
            MoveUtils.updateState(jLabel, robotState, POSITION, DIRECTION);
            System.out.println(MOVE_TO + " " + robotState.x + "," + robotState.y + " (" + MOVE_FORWARD + ")");
        });

        button2.addActionListener((ActionEvent e) -> {
            MoveUtils.moveBackward(robotState);
            MoveUtils.updateState(jLabel, robotState, POSITION, DIRECTION);
            System.out.println(MOVE_TO + " " + robotState.x + "," + robotState.y + " (" + MOVE_BACKWARD + ")");
        });

        button3.addActionListener((ActionEvent e) -> {
            MoveUtils.lookToLeft(robotState);
            MoveUtils.updateState(jLabel, robotState, POSITION, DIRECTION);
            System.out.println(LOOK_TO + " " + robotState.direction);
        });

        button4.addActionListener((ActionEvent e) -> {
            MoveUtils.lookToRight(robotState);
            MoveUtils.updateState(jLabel, robotState, POSITION, DIRECTION);
            System.out.println(LOOK_TO + " " + robotState.direction);
        });

        button5.addActionListener((ActionEvent e) -> {
            MoveUtils.saveState(robotState, FILENAME);
        });

        button6.addActionListener((ActionEvent e) -> {
            MoveUtils.loadState(robotState, jLabel, FILENAME, POSITION, DIRECTION);
        });

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        //#endregion // ・ ═══════『 🟪 JBUTTONS 🟪 』═══════ ・//

        // ・ ═══════『 🖼 We declare the size and make sure the program actually closes when we press X (We also make it visible) 🖼 』═══════ ・//
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
