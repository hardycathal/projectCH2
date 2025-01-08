package ie.atu.projectch2.controller;

import ie.atu.projectch2.entity.Menu;
import ie.atu.projectch2.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    //CRUD

    //CREATE
    @PostMapping("/createItem")
    public ResponseEntity<String> createItem(@RequestBody Menu menu) {
        menuService.createItem(menu);
        return new ResponseEntity<>("Menu item created successfully", HttpStatus.OK);
    }

    //READ
    @GetMapping("/showItems")
    public ResponseEntity<List<Menu>> showItems() {
        return new ResponseEntity<>(menuService.showItems(), HttpStatus.OK);
    }

    //Update
    @PutMapping("/editItem/{id}")
    public ResponseEntity<String> editItem(@PathVariable Long id, @RequestBody Menu updatedItem) {
        menuService.editItem(id, updatedItem);
        return new ResponseEntity<>("Menu item updated successfully", HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping("/deleteItem/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable Long id) {
        menuService.deleteItem(id);
        return new ResponseEntity<>("Menu item deleted successfully", HttpStatus.OK);

    }
}
