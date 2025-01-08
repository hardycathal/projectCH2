package ie.atu.projectch2.service;

import ie.atu.projectch2.entity.Menu;
import ie.atu.projectch2.repo.MenuRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRepo menuRepo;
    public MenuService(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    //CREATE
    public void createItem(Menu menu) {
        menuRepo.save(menu);
    }

    //READ
    public List<Menu> showItems() {
        return menuRepo.findAll();
    }

    //UPDATE
    public void editItem(Long id, Menu updatedItem) {
        Optional<Menu> existingItemOptional = menuRepo.findById(id);

        if(existingItemOptional.isPresent()) {
            Menu existingItem = existingItemOptional.get();

            existingItem.setName(updatedItem.getName());
            existingItem.setDescription(updatedItem.getDescription());
            existingItem.setPrice(updatedItem.getPrice());
            existingItem.setCategory(updatedItem.getCategory());
            menuRepo.save(existingItem);
        }else {
            throw new RuntimeException("Menu not found");
        }
    }

    //DELETE
    public void deleteItem(Long id) {
        menuRepo.deleteById(id);
    }

    public Menu getItemById(Long id) {
        return menuRepo.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
    }
}
