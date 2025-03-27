package com.shakshor;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        String inputFile = "C:/Users/USER/Desktop/FileBasedTaskScheduling/FileBasedTaskScheduler/src/main/resources/TaskFile.json";
        try(FileReader reader = new FileReader(inputFile)){

            TaskList tasks = gson.fromJson(reader,TaskList.class);

            for(Task task : tasks.getTaskList()){
                System.out.println("Task ID: " + task.getId());
                System.out.println("Type: " + task.getType());
                System.out.println("Name: " + task.getName());
                System.out.println("Code: " + task.getCode());
                System.out.println("Priority: " + task.getPriority());
                System.out.println("Dependencies:");
                for(String dependency : task.getDependencies()){
                    System.out.println("    "+dependency);
                }
                System.out.println("-----------------------------");
            }

        }catch(IOException exc){
            System.out.println(exc.toString());
        }
    }
}
