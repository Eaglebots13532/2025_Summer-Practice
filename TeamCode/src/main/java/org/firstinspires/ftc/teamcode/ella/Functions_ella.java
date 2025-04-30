// Copyright (c) 2024-2025 FTC 13532
// All rights reserved.

package org.firstinspires.ftc.teamcode.ella;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;


@Config
@TeleOp
public class Functions_ella extends LinearOpMode {

  FtcDashboard dashboard = FtcDashboard.getInstance();


  Conf conf = new Conf(this, dashboard);

  DcMotorEx
      Lmotor,
      Rmotor;

  public static double
      LPower = 0,
      RPower = 0;


  @Override
  public void runOpMode() {

    telemetry = dashboard.getTelemetry();


    waitForStart();
    while (opModeIsActive()) {
      conf.drive(-gamepad1.left_stick_y, -gamepad1.right_stick_y);

      telemetry.update();


    }// end while mwahahaha
  }//end runOpMode


} // end class
