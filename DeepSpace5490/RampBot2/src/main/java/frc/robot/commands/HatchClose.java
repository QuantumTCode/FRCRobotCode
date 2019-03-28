package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *	Command for turning on the vacuum
 *
 */
public class HatchClose extends Command {
		
	/**
	 * Constructor for only the direction (1 raise, -1 lower). Rate is 0.2 by default.
	 * @param direction
	 */
	public HatchClose() {
        requires(Robot.m_Chassis);        
	}

	

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.m_Chassis.hatchClose();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
