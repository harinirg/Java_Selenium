package com.collections;
import java.util.*;

class Task implements Comparable<Task> {

    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }
}

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Task("Task 1", 3));
        priorityQueue.add(new Task("Task 2", 1));
        priorityQueue.add(new Task("Task 3", 2));

        while (!priorityQueue.isEmpty()) {
            Task task = priorityQueue.poll();
            System.out.println(task.getName() + " Priority: " + task.getPriority());
        }
    }
}