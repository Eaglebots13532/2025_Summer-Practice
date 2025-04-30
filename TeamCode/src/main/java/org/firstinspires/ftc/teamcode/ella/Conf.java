package org.firstinspires.ftc.teamcode.ella;


import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Conf {

  LinearOpMode myOp = null;

  DcMotorEx
      Lmotor,
      Rmotor;


  FtcDashboard dashboard;


  public Conf(LinearOpMode opMode, FtcDashboard dash) {

    myOp = opMode;
    dashboard = dash;
    myOp.telemetry = dashboard.getTelemetry();


    Lmotor = myOp.hardwareMap.get(DcMotorEx.class, "BLMotor");
    Rmotor = myOp.hardwareMap.get(DcMotorEx.class, "BRMotor");

    Lmotor.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
    Rmotor.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

    Lmotor.setDirection(REVERSE);

  }


  public void drive(double LPower, double RPower) {

    Lmotor.setPower(LPower);
    Rmotor.setPower(RPower);


    myOp.telemetry.addData("VELOCIRAPTOR", Lmotor.getVelocity());

  }

}
