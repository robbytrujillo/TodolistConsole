package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        Todolist[] model = todoListRepository.getall();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;

            if (todolist != null) {
                System.out.println(no + ". " + todolist.getTodo());

            }
        }
    }

    @Override
    public void addTodoList(String Todo) {

    }

    @Override
    public void removeTodoList(Integer number) {

    }



}
