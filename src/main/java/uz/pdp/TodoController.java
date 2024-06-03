package uz.pdp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class TodoController {
    private final List<Todo> todos = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping("/todos")
    public String getTodos(Model model) {
        todos.sort(Comparator.comparing(Todo::getCreatedAt).reversed());
        model.addAttribute("todos", todos);
        return "todo-list";
    }

    @GetMapping("/todos/new")
    public String showAddTodoForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "add-todo";
    }

    @PostMapping("/todos")
    public String addTodo(@ModelAttribute Todo todo) {
        todo.setId(idCounter.incrementAndGet());
        todo.setCreatedAt(LocalDateTime.now());
        todos.add(todo);
        return "redirect:/todos";
    }

    @GetMapping("/todos/edit/{id}")
    public String showEditTodoForm(@PathVariable Integer id, Model model) {
        Optional<Todo> todoOpt = todos.stream().filter(t -> t.getId().equals(id)).findFirst();
        if (todoOpt.isPresent()) {
            model.addAttribute("todo", todoOpt.get());
            return "edit-todo";
        }
        return "redirect:/todos";
    }

    @PostMapping("/todos/update")
    public String updateTodo(@ModelAttribute Todo todo) {
        todos.stream()
                .filter(t -> t.getId().equals(todo.getId()))
                .findFirst()
                .ifPresent(t -> {
                    t.setTitle(todo.getTitle());
                    t.setPriority(todo.getPriority());
                });
        return "redirect:/todos";
    }

    @GetMapping("/todos/delete/{id}")
    public String deleteTodo(@PathVariable Integer id) {
        todos.removeIf(t -> t.getId().equals(id));
        return "redirect:/todos";
    }
}
