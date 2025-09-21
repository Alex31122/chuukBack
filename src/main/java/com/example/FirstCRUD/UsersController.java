package com.example.FirstCRUD;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

//@RestController
// @RequestMapping("/users")
@Controller
public class UsersController {

    private UsersRepository usersRepository;

    public UsersController(UsersRepository userRepository) {
        this.usersRepository = userRepository;
    }

    @GetMapping("/")
    @ResponseBody
    public String saludo() {
        return "Hola Mundo";
    }

    @GetMapping("/api/users")
    @ResponseBody
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @GetMapping("/usuarios")
    public String getIndex(Model model) {
        List<Users> users = getAllUsers();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/usuarios/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("users", new Users());
        return "crearUsuario";
    }

    @PostMapping("/usuarios/registro")
    public String registrarUsuario(@ModelAttribute("users") @Valid Users users, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "crearUsuario";
        }
        usersRepository.save(users);
        return "redirect:/usuarios";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        Users users = usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
        model.addAttribute("users", users);
        return "editar";
    }

    // No es el mejor enfoque, se utiliza normalmente el la sentencia PUT
    @PostMapping("/editar/{id}")
    public String actualizarUsuario(@PathVariable Long id, @ModelAttribute("usuario") @Valid Users updatedUsers,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editar";
        }
        Users users = usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
        users.setName(updatedUsers.getName());
        users.setEmail(updatedUsers.getEmail());
        usersRepository.save(users);
        return "redirect:/usuarios";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        Users users = usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
        usersRepository.delete(users);

        return "redirect:/usuarios";
    }

    /*
     * @DeleteMapping("/eliminar/{id}")
     * public String eliminarUsuario(@PathVariable Long id) {
     * usersRepository.deleteById(id);
     * return "redirect:/usuarios";
     * }
     */
}
