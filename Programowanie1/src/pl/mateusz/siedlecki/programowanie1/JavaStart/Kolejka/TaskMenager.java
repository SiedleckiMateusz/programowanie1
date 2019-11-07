package pl.mateusz.siedlecki.programowanie1.JavaStart.Kolejka;

import java.util.PriorityQueue;

public class TaskMenager {
    PriorityQueue<Task> tasks = new PriorityQueue<>();

    public void addNewWork(Task task){
        tasks.offer(task);
    }
}
