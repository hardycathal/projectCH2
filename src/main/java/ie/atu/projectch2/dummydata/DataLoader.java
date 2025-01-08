package ie.atu.projectch2.dummydata;

import ie.atu.projectch2.entity.Menu;
import ie.atu.projectch2.repo.MenuRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final MenuRepo menuRepo;
    public DataLoader(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    @Override
    public void run(String... args) throws Exception{
        Menu menu1 = new Menu(null, 12.00, "Pizza", "Plain cheese pizza", "12inch Margherita Pizza");
        Menu menu2 = new Menu(null, 14.50, "Pizza", "Ham & Mushroom pizza", "12inch Isabella Pizza");
        Menu menu3 = new Menu(null, 14.00, "Pizza", "Pepperoni pizza", "12inch Pepperoni Pizza");

        menuRepo.save(menu1);
        menuRepo.save(menu2);
        menuRepo.save(menu3);

        Menu menu4 = new Menu(null, 11.50, "Burger", "1/4 Pounder with Cheese Meal", "1/4 pounder cheese burger with fries and drink");
        Menu menu5 = new Menu(null, 12.00, "Burger", "Chicken Fillet Burger Mean", "Fried chicken fillet burger with cheese, friees and a drink");
        Menu menu6 = new Menu(null, 9.00, "Burger", "Hamburger", "Plain burger with fries and a drink");

        menuRepo.save(menu4);
        menuRepo.save(menu5);
        menuRepo.save(menu6);

        Menu menu7 = new Menu(null, 9.50, "Chicken", "Snackbox", "Snackbox with 2 Pcs and chips and drink");
        Menu menu8 = new Menu(null, 10.00, "Chicken", "Dinnerbox", "Dinnerbox with 3 Pcs and chips and drink");
        Menu menu9 = new Menu(null, 19.50, "Chicken", "Familybox", "Familybox with 6 Pcs and chips and drink");

        menuRepo.save(menu7);
        menuRepo.save(menu8);
        menuRepo.save(menu9);
    }
}
