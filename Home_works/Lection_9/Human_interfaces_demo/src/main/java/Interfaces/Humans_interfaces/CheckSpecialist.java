package Interfaces.Humans_interfaces;

public interface CheckSpecialist {
    static boolean approachProfesional(License license, Specialist specialist){
         return specialist.getLicenses().stream().anyMatch(license1 -> license1.getType().equals(license.getType()));
    }
}
