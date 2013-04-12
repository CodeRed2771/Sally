package com.coderedrobotics.libs;

import edu.wpi.first.wpilibj.Joystick;

public class Gamepad extends GenericJoystick {

    public static final Button A = new Button(1);
    public static final Button B = new Button(2);
    public static final Button X = new Button(3);
    public static final Button Y = new Button(4);
    public static final Button BUMPER_LEFT = new Button(5);
    public static final Button BUMPER_RIGHT = new Button(6);
    public static final Button BACK = new Button(7);
    public static final Button START = new Button(8);
    public static final Button STICK_LEFT = new Button(9);
    public static final Button STICK_RIGHT = new Button(10);
    public static final Axis STICK_LEFT_X = new Axis(1, 0.1);
    public static final Axis STICK_LEFT_Y = new Axis(2, 0.1);
    public static final Axis TRIGGERS = new Axis(3);
    public static final Axis STICK_RIGHT_X = new Axis(4, 0.1);
    public static final Axis STICK_RIGHT_Y = new Axis(5, 0.1);
    public static final Axis DPAD_X = new Axis(6);
    public static final Axis DPAD_Y = new Axis(7);
    public static final AxisButton STICK_LEFT_LEFT = new AxisButton(STICK_LEFT_X, true);
    public static final AxisButton STICK_LEFT_RIGHT = new AxisButton(STICK_LEFT_X, false);
    public static final AxisButton STICK_LEFT_UP = new AxisButton(STICK_LEFT_Y, true);
    public static final AxisButton STICK_LEFT_DOWN = new AxisButton(STICK_LEFT_Y, false);
    public static final AxisButton TRIGGER_LEFT = new AxisButton(TRIGGERS, true);
    public static final AxisButton TRIGGER_RIGHT = new AxisButton(TRIGGERS, false);
    public static final AxisButton STICK_RIGHT_LEFT = new AxisButton(STICK_RIGHT_X, true);
    public static final AxisButton STICK_RIGHT_RIGHT = new AxisButton(STICK_RIGHT_X, false);
    public static final AxisButton STICK_RIGHT_UP = new AxisButton(STICK_RIGHT_Y, true);
    public static final AxisButton STICK_RIGHT_DOWN = new AxisButton(STICK_RIGHT_Y, false);
    public static final AxisButton DPAD_LEFT = new AxisButton(DPAD_X, true);
    public static final AxisButton DPAD_RIGHT = new AxisButton(DPAD_X, false);
    public static final AxisButton DPAD_UP = new AxisButton(DPAD_Y, true);
    public static final AxisButton DPAD_DOWN = new AxisButton(DPAD_Y, false);

    public Gamepad(int port) {
        super(port);
    }
}