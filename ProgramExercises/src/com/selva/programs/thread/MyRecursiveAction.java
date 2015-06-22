package com.selva.programs.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

    private long workLoad = 0;

    public static void main(String[] args) {
    	ForkJoinPool forkJoinPool = new ForkJoinPool(4);
    	MyRecursiveAction myRecursiveAction = new MyRecursiveAction(24);
    	String x= null;
    	try {
			x.equals("asdas");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	forkJoinPool.invoke(myRecursiveAction);

//    	System.out.println("mergedResult = " + mergedResult);    
	}
    public MyRecursiveAction(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {

        //if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 6) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            List<MyRecursiveAction> subtasks =  new ArrayList<MyRecursiveAction>();

            subtasks.addAll(createSubtasks());

            for(RecursiveAction subtask : subtasks){
                subtask.fork();
            }

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
    }

    private List<MyRecursiveAction> createSubtasks() {
        List<MyRecursiveAction> subtasks =  new ArrayList<MyRecursiveAction>();

        MyRecursiveAction subtask1 = new MyRecursiveAction(this.workLoad / 3);
        MyRecursiveAction subtask2 = new MyRecursiveAction(this.workLoad / 3);
        MyRecursiveAction subtask3 = new MyRecursiveAction(this.workLoad / 3);
        MyRecursiveAction subtask4 = new MyRecursiveAction(this.workLoad / 3);

        subtasks.add(subtask1);
        subtasks.add(subtask2);
        subtasks.add(subtask3);
        subtasks.add(subtask4);

        return subtasks;
    }

}
