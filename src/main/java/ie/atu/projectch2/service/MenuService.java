package ie.atu.projectch2.service;

import ie.atu.projectch2.entity.Menu;
import ie.atu.projectch2.repo.MenuRepo;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepo menuRepo;
    public MenuService(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    public void createItem(Menu menu) {
        menuRepo.save(menu);
    }
}
