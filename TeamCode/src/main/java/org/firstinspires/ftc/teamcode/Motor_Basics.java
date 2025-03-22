// Copyright (c) 2024-2025 FTC 13532
// All rights reserved.

package org.firstinspires.ftc.teamcode;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@Config
@TeleOp
public class Motor_Basics extends LinearOpMode {


  FtcDashboard dashboard = FtcDashboard.getInstance();

  DcMotorEx LMotor, RMotor;

  public static double LPower = 0, RPower = 0;


  @Override
  public void runOpMode() {

    telemetry = dashboard.getTelemetry();

    LMotor = hardwareMap.get(DcMotorEx.class, "BLMotor");
    RMotor = hardwareMap.get(DcMotorEx.class, "BRMotor");

    LMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    RMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    LMotor.setDirection(REVERSE);


    waitForStart();
    while (opModeIsActive()) {

      LPower = -gamepad1.left_stick_y;
      RPower = -gamepad1.right_stick_y;


      telemetry.addData("AddData", LMotor.getVelocity());
      telemetry.update();

      RMotor.setPower(RPower);
      LMotor.setPower(LPower);

      telemetry.update();


    }
  }
}
