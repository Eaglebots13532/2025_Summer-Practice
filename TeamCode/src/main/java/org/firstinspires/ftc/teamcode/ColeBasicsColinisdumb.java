// Copyright (c) 2024-2025 FTC 13532
// All rights reserved.

package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class ColeBasicsColinisdumb extends LinearOpMode {


  FtcDashboard dashboard = FtcDashboard.getInstance();

  DcMotor motor1, motor2;

  @Override
  public void runOpMode() {

    telemetry = dashboard.getTelemetry();

    motor1 = hardwareMap.get(DcMotor.class, "Lmotor");
    motor2 = hardwareMap.get(DcMotor.class, "Rmotor");


    waitForStart();
    while (opModeIsActive()) {

      motor1.setPower(-gamepad1.left_stick_y);
      motor2.setPower(-gamepad1.right_stick_y);

    }

  }
}
