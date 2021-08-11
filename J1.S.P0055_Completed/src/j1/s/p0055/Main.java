package j1.s.p0055;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DoctorManagement manage = new DoctorManagement();
        Validation valid = new Validation();

        ArrayList<Doctor> listDoctor = new ArrayList<>();

        Doctor d1 = new Doctor("doc1", "long", "orth", 12);
        listDoctor.add(d1);
        Doctor d2 = new Doctor("doc2", "thanh", "psy", 14);
        listDoctor.add(d2);
        Doctor d3 = new Doctor("dco3", "quang", "health", 15);
        listDoctor.add(d3);

        while (true) {
            manage.MainMenu();
            int choice = valid.checkIntRange("your choice", 1, 5);
            switch (choice) {
                case 1:
                    manage.AddDoctor(listDoctor);
                    break;
                case 2:
                    manage.UpdateDoctor(listDoctor);
                    manage.Display(listDoctor);
                    break;
                case 3:
                    manage.DeleteDoctor(listDoctor);
                    break;
                case 4:
                    manage.SearchDoctor(listDoctor);
                    break;
                case 5:
                    return;

            }
        }
    }

}
