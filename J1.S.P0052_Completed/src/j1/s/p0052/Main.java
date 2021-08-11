package j1.s.p0052;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CountryManagement manage = new CountryManagement();
        Validation valid = new Validation();

        ArrayList<Country> listCountry = new ArrayList<>();

        Country c1 = new Country("nice", "vn", "viet nam", 12);
        listCountry.add(c1);
        Country c2 = new Country("good", "id", "indonesia", 14);
        listCountry.add(c2);
        Country c3 = new Country("sunny", "cn", "china", 15);
        listCountry.add(c3);

        while (true) {
            manage.MainMenu();
            int choice = valid.checkInt(1, 5);
            switch (choice) {
                case 1:
                    manage.AddCountry(listCountry);
                    break;
                case 2:
                    manage.NormalDisplay(listCountry);
                    break;
                case 3:
                    manage.SearchCountry(listCountry);
                    break;
                case 4:
                    manage.DisplaySortedCountry(listCountry);
                    break;
                case 5:
                    return;
            }
        }
    }

}
