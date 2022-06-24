package repository;

import entity.Todolist;

public interface TodoListRepository {

    Todolist[] getall();

    //menambah todolist
    void add(Todolist todolist);

    void remove(Integer number);


}
