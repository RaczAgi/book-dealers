package hu.progmatic.bookdealers.controller;

import hu.progmatic.bookdealers.model.Book;
import hu.progmatic.bookdealers.model.User;
import hu.progmatic.bookdealers.service.BookService;
import hu.progmatic.bookdealers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    private final BookService bookService;
    private final UserService userService;

    @Autowired
    public PageController(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }


    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";}

    @GetMapping("/add-book")
    public String showAddBookForm(Model model) {
        model.addAttribute("newBook", new Book());
        return "addBook";}
    @GetMapping("/randombook")
    public String getRandomBook(Model model){
        model.addAttribute("randomBook", bookService.getRandomBook());
        return "randombook";}
    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";}

    @GetMapping("/reg")
    public String showAddUserForm(Model model) {
        model.addAttribute("newUser", new User());
        return "reg";}
    @GetMapping("/randomuser")
    public String getRandomUser(Model model){
        model.addAttribute("randomUser", userService.getRandomUser());
        return "randomuser";}

    @PostMapping("/add-book")
    public String addBook(@ModelAttribute("newBook") Book newBook) {
        bookService.addBook(newBook);
        return "redirect:/books";}
    @PostMapping("/reg")
    public String addReg(@ModelAttribute("newUser") User newUser) {
        userService.addUser(newUser);
        return "redirect:/users";}


}
