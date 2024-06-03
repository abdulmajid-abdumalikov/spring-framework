package uz.pdp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
    private List<Todo> todos;

    public TodoController() {
        todos = new ArrayList<>();
        todos.add(new Todo("Solve problem", "Problem given in pdp online platform"));
        todos.add(new Todo("Read book", "Finish reading 'Effective Java'"));
        todos.add(new Todo("Write code", "Work on Spring MVC project"));
    }

    @GetMapping("/todos")
    @ResponseBody
    public String getTodos() {
        StringBuilder html = new StringBuilder();
        html.append("<html><body>");
        html.append("<h1>Todo List</h1>");
        html.append("<table border='1'>");
        html.append("<tr><th>Title</th><th>Description</th></tr>");

        for (Todo todo : todos) {
            html.append("<tr>")
                    .append("<td>").append(todo.getTitle()).append("</td>")
                    .append("<td>").append(todo.getDescription()).append("</td>")
                    .append("</tr>");
        }

        html.append("</table>");
        html.append("</body></html>");

        return html.toString();
    }
}
