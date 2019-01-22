// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5229.RobotBuilderTest.subsystems;


import org.usfirst.frc5229.RobotBuilderTest.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DrivetrainSub extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX talonSRX1;
    private WPI_TalonSRX talonSRX2;
    private WPI_TalonSRX talonSRX3;
    private WPI_TalonSRX talonSRX4;
    private MecanumDrive mecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DrivetrainSub() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        talonSRX1 = new WPI_TalonSRX(6);
        
        
        
        talonSRX2 = new WPI_TalonSRX(5);
        
        
        
        talonSRX3 = new WPI_TalonSRX(3);
        
        
        
        talonSRX4 = new WPI_TalonSRX(2);
        
        
        
        mecanumDrive = new MecanumDrive(talonSRX1, talonSRX2,
              talonSRX3, talonSRX4);
        addChild("Mecanum Drive",mecanumDrive);
        mecanumDrive.setSafetyEnabled(true);
        mecanumDrive.setExpiration(0.1);
        mecanumDrive.setMaxOutput(1.0);

        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    public void drive(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
        mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
    }
    public void driveHalfSpeed(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
        mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
    }
    public void driveQuarterSpeed(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
        mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DrivetrainCmd());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

