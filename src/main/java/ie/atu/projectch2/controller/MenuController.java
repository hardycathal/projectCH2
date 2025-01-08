package ie.atu.projectch2.controller;

import ie.atu.projectch2.entity.Menu;
import ie.atu.projectch2.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuService menuService;
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/createItem")
    public ResponseEntity<String> createItem(@RequestBody Menu menu) {
        menuService.createItem(menu);
        return new ResponseEntity<>("Menu item created successfully", HttpStatus.OK);
    }

}
