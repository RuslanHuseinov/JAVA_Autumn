package Interfaces;

import Implementation.*;
import Interfaces.Humans_interfaces.*;
import Interfaces.Vehicle_interfaces.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human Petya = new HomoSapiens();
        Specialist Volodya = new CarDriver();
        Car toyotaSupra = new ToyotaSupra(LocalDate.now());
        Petya.addGoods((Goods) toyotaSupra);

        License licenseA = new LicenseA();
        Volodya.addLicense(licenseA);
        System.out.println(CheckSpecialist.approachProfesional(licenseA,Volodya));

    }
}
