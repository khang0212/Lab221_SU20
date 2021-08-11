package j1.s.p0055;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorManagement {

    Validation valid = new Validation();

    public Scanner scan = new Scanner(System.in);

    public Doctor GetDoctorByCode(ArrayList<Doctor> listDoctor, String code) {
        for (Doctor d : listDoctor) {
            if (d.getCode().equalsIgnoreCase(code)) {
                return d;
            }
        }
        return null;
    }

    public Doctor GetDoctorByName(ArrayList<Doctor> listDoctor, String name) {
        for (Doctor d : listDoctor) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public Doctor GetDoctorBySpe(ArrayList<Doctor> listDoctor, String spe) {
        for (Doctor d : listDoctor) {
            if (d.getSpecialization().equalsIgnoreCase(spe)) {
                return d;
            }
        }
        return null;
    }

    public Doctor GetDoctorByAval(ArrayList<Doctor> listDoctor, int avail) {
        for (Doctor d : listDoctor) {
            if (d.getAvailability() == avail) {
                return d;
            }
        }
        return null;
    }

    public void MainMenu() {
        System.out.println("========= Doctor Management ==========\n"
                + "1.	Add Doctor\n"
                + "2.	Update Doctor\n"
                + "3.	Delete Doctor\n"
                + "4.	Search Doctor\n"
                + "5.	Exit");
    }

    public void AddDoctor(ArrayList<Doctor> listDoctor) {
        String code = valid.checkInputString("code");

        while (GetDoctorByCode(listDoctor, code) != null) {
            System.out.println("This code is already exist !");
            code = valid.checkInputString("code");
        }

        String name = valid.checkInputString("name");

        String specialization = valid.checkInputString("specialization");

        int availability = valid.checkIntRange("availability", 0, Integer.MAX_VALUE);

        listDoctor.add(new Doctor(code, name, specialization, availability));

        System.out.println("Adding a doctor asucessfull !");
    }

    public void UpdateDoctor(ArrayList<Doctor> listDoctor) {

        String code = valid.checkInputString("code");

        Doctor doctor = GetDoctorByCode(listDoctor, code);

        if (doctor == null) {
            System.out.println("Doctor code doesn't exist !");
        } else {
            System.out.println("Enter specialization : ");
            String spe = scan.nextLine();

            if (spe.isEmpty()) {

                //get old information if inputted-infor is blank
                doctor.setSpecialization(doctor.getSpecialization());

            } else {

                doctor.setSpecialization(spe);

            }

            System.out.println("Enter avalability : ");
            String avai = scan.nextLine();

            if (avai.isEmpty()) {

                doctor.setAvailability(doctor.getAvailability());

            } else {

                int avail = valid.checkInt(avai);

                doctor.setAvailability(avail);

            }

        }
    }

    public void DeleteDoctor(ArrayList<Doctor> listDoctor) {

        String code = valid.checkInputString("code");

        Doctor doctor = GetDoctorByCode(listDoctor, code);

        if (doctor == null) {
            System.out.println("Doctor code doesn't exist !");
        } else {

            listDoctor.remove(doctor);

            System.out.println("Deleting a doctor sucessfull !");
        }

    }

    public void Display(ArrayList<Doctor> listDoctor) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Code", "Name", "Specialization", "Availability");

        for (Doctor doctor : listDoctor) {
            System.out.println(doctor);
        }
    }

    public void SearchDoctor(ArrayList<Doctor> listDoctor) {

        System.out.println("Enter something to search  :");
        String searchString = scan.nextLine();

        Doctor code = GetDoctorByCode(listDoctor, searchString);

        if (code == null) {
            System.out.println("Doctor not found");

        } else {
            System.out.printf("%-20s%-20s%-20s%-20s\n", "Code", "Name", "Specialization", "Availability");

            System.out.println(code);

        }

    }

}
