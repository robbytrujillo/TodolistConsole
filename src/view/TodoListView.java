package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList() {
        while (true){
            todoListService.showTodoList();

            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            // System.out.println("");

            var input = InputUtil.input("Pilih");

            if(input.equals("1")){
               addTodoList();
            }else if (input.equals("2")){
                removeTodoList();
            }else if (input.equals("x")) {
                break;
            }else{
                System.out.println("Pilihan Tidak Dimengerti");
            }
        }
    }

    public void addTodoList() {

    }

    public void removeTodoList() {

    }

}
