package org.firstinspires.ftc.teamcode;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@Config
@TeleOp
public class Motor_Basics extends LinearOpMode {


  FtcDashboard dashboard = FtcDashboard.getInstance();

  DcMotorEx LMotor, RMotor;

  public static double power = 0;

  @Override
  public void runOpMode() {

    telemetry = dashboard.getTelemetry();

    LMotor = hardwareMap.get(DcMotorEx.class, "BLMotor");
    RMotor = hardwareMap.get(DcMotorEx.class, "BRMotor");

    LMotor.setDirection(REVERSE);


    waitForStart();
    while (opModeIsActive()) {

      telemetry.addData("AddData", LMotor.getVelocity());
      telemetry.update();

      RMotor.setPower(power);
      LMotor.setPower(power);

      telemetry.update();


    }
  }
}
