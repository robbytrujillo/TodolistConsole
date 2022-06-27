package test.view;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar JAVA Dasar");
        todoListService.addTodoList("Belajar JAVA OOP");
        todoListService.addTodoList("Belajar JAVA Standard Classes");

        todoListView.showTodoList();
    }
}
