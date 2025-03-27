package com.shakshor;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> tasks;

    List<Task> getTaskList(){
        return this.tasks;
    }

    void setTaskList(List<Task> tasks){
        this.tasks = tasks;
    }


}
