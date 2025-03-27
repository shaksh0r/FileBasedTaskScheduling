package com.shakshor;

public class Task {
    String id, type, name, code, priority;
    String [] dependencies;

    Task(){

    }

    String getId(){
        return this.id;
    }

    String getType(){
        return this.type;
    }

    String getName(){
        return this.name;
    }

    String getCode(){
        return this.code;
    }

    String getPriority(){
        return this.priority;
    }

    String[] getDependencies(){
        return this.dependencies;
    }
}
