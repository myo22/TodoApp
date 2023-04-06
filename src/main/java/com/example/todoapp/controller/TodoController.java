package com.example.todoapp.controller;

import com.example.todoapp.domain.ToDo;
import com.example.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor  //스프링이 실행하면서 컨트롤러에다가 final부분을 넣어준다.
public class TodoController {
    private final TodoRepository todoRepository;

    @GetMapping("/")
    public String index(Model model){
        List<ToDo> todos= todoRepository.findAll(); //finAll로 데이터베이스에 모든걸 ToDo 리스트에 가져온다
        model.addAttribute("todos", todos); //todos란 이름으로 지금 읽어온 목록을 담아준다
        return "todos";
    }

    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todo") String todo){ // todos.html을 보면 todo라는 이름으로 값을 주고있으므로
        //데이터베이스에 저장하면 된다.
        ToDo toDo = new ToDo();
        toDo.setTodo(todo);
        todoRepository.save(toDo);
        return "redirect:/";
    }
}
